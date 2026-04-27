package p000;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.p7e;
import p000.vfg;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "DBUtil")
@p7e({p7e.EnumC10826a.f69936c})
public final class pe3 {
    @gib
    public static final CancellationSignal createCancellationSignal() {
        return vfg.C14039a.createCancellationSignal();
    }

    public static final void dropFtsSyncTriggers(@yfb wfg wfgVar) {
        md8.checkNotNullParameter(wfgVar, "db");
        List listCreateListBuilder = k82.createListBuilder();
        Cursor cursorQuery = wfgVar.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorQuery.moveToNext()) {
            try {
                listCreateListBuilder.add(cursorQuery.getString(0));
            } finally {
            }
        }
        bth bthVar = bth.f14751a;
        u52.closeFinally(cursorQuery, null);
        for (String str : k82.build(listCreateListBuilder)) {
            md8.checkNotNullExpressionValue(str, "triggerName");
            if (h9g.startsWith$default(str, "room_fts_content_sync_", false, 2, null)) {
                wfgVar.execSQL("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static final void foreignKeyCheck(@yfb wfg wfgVar, @yfb String str) {
        md8.checkNotNullParameter(wfgVar, "db");
        md8.checkNotNullParameter(str, "tableName");
        Cursor cursorQuery = wfgVar.query("PRAGMA foreign_key_check(`" + str + "`)");
        try {
            if (cursorQuery.getCount() > 0) {
                throw new SQLiteConstraintException(processForeignKeyCheckFailure(cursorQuery));
            }
            bth bthVar = bth.f14751a;
            u52.closeFinally(cursorQuery, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u52.closeFinally(cursorQuery, th);
                throw th2;
            }
        }
    }

    private static final String processForeignKeyCheckFailure(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        int count = cursor.getCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            if (cursor.isFirst()) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(cursor.getString(0));
                sb.append("'.\n");
            }
            String string = cursor.getString(3);
            if (!linkedHashMap.containsKey(string)) {
                md8.checkNotNullExpressionValue(string, "constraintIndex");
                String string2 = cursor.getString(2);
                md8.checkNotNullExpressionValue(string2, "cursor.getString(2)");
                linkedHashMap.put(string, string2);
            }
        }
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\n");
        sb.append("Number of rows in violation: ");
        sb.append(count);
        sb.append("\n");
        sb.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append("\tParent Table = ");
            sb.append(str2);
            sb.append(", Foreign Key Constraint Index = ");
            sb.append(str);
            sb.append("\n");
        }
        String string3 = sb.toString();
        md8.checkNotNullExpressionValue(string3, "StringBuilder().apply(builderAction).toString()");
        return string3;
    }

    @yfb
    @q64(message = "This is only used in the generated code and shouldn't be called directly.")
    public static final Cursor query(@yfb uae uaeVar, @yfb zfg zfgVar, boolean z) {
        md8.checkNotNullParameter(uaeVar, "db");
        md8.checkNotNullParameter(zfgVar, "sqLiteQuery");
        return query(uaeVar, zfgVar, z, null);
    }

    public static final int readVersion(@yfb File file) throws IOException {
        md8.checkNotNullParameter(file, "databaseFile");
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i = byteBufferAllocate.getInt();
            u52.closeFinally(channel, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u52.closeFinally(channel, th);
                throw th2;
            }
        }
    }

    @yfb
    public static final Cursor query(@yfb uae uaeVar, @yfb zfg zfgVar, boolean z, @gib CancellationSignal cancellationSignal) {
        md8.checkNotNullParameter(uaeVar, "db");
        md8.checkNotNullParameter(zfgVar, "sqLiteQuery");
        Cursor cursorQuery = uaeVar.query(zfgVar, cancellationSignal);
        if (!z || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? bb3.copyAndClose(cursorQuery) : cursorQuery;
    }
}
