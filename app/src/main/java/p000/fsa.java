package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fsa implements esa {

    /* JADX INFO: renamed from: a */
    public final uae f37609a;

    /* JADX INFO: renamed from: b */
    public final l35<C13560uk> f37610b;

    /* JADX INFO: renamed from: fsa$a */
    public class C5950a extends l35<C13560uk> {
        public C5950a(uae database) {
            super(database);
        }

        @Override // p000.caf
        public String createQuery() {
            return "INSERT OR ABORT INTO `chatAiNew` (`id`,`result`,`type`,`multipleOptions`,`voicePath`,`voiceTime`,`messageTime`,`isPause`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }

        @Override // p000.l35
        public void bind(bgg bggVar, C13560uk c13560uk) {
            bggVar.bindLong(1, c13560uk.getId());
            if (c13560uk.getResult() == null) {
                bggVar.bindNull(2);
            } else {
                bggVar.bindString(2, c13560uk.getResult());
            }
            bggVar.bindLong(3, c13560uk.getType());
            bggVar.bindLong(4, c13560uk.getMultipleOptions());
            if (c13560uk.getVoicePath() == null) {
                bggVar.bindNull(5);
            } else {
                bggVar.bindString(5, c13560uk.getVoicePath());
            }
            bggVar.bindLong(6, c13560uk.getVoiceTime());
            bggVar.bindLong(7, c13560uk.getMessageTime());
            bggVar.bindLong(8, c13560uk.isPause() ? 1L : 0L);
        }
    }

    public fsa(uae __db) {
        this.f37609a = __db;
        this.f37610b = new C5950a(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // p000.esa
    public List<C13560uk> getAll() throws Throwable {
        xae xaeVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM chatAiNew", 0);
        this.f37609a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f37609a, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                C13560uk c13560uk = new C13560uk();
                c13560uk.setId(cursorQuery.getInt(columnIndexOrThrow));
                c13560uk.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                c13560uk.setType(cursorQuery.getInt(columnIndexOrThrow3));
                c13560uk.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow4));
                c13560uk.setVoicePath(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                xaeVar = xaeVarAcquire;
                try {
                    c13560uk.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow6));
                    c13560uk.setMessageTime(cursorQuery.getLong(columnIndexOrThrow7));
                    c13560uk.setPause(cursorQuery.getInt(columnIndexOrThrow8) != 0);
                    arrayList.add(c13560uk);
                    xaeVarAcquire = xaeVar;
                } catch (Throwable th) {
                    th = th;
                    cursorQuery.close();
                    xaeVar.release();
                    throw th;
                }
            }
            cursorQuery.close();
            xaeVarAcquire.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            xaeVar = xaeVarAcquire;
        }
    }

    @Override // p000.esa
    public List<C13560uk> getLatestTen() throws Throwable {
        xae xaeVar;
        xae xaeVarAcquire = xae.acquire("SELECT * FROM chatAiNew ORDER BY messageTime DESC LIMIT 50", 0);
        this.f37609a.assertNotSuspendingTransaction();
        Cursor cursorQuery = pe3.query(this.f37609a, xaeVarAcquire, false, null);
        try {
            int columnIndexOrThrow = bb3.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = bb3.getColumnIndexOrThrow(cursorQuery, "result");
            int columnIndexOrThrow3 = bb3.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow4 = bb3.getColumnIndexOrThrow(cursorQuery, "multipleOptions");
            int columnIndexOrThrow5 = bb3.getColumnIndexOrThrow(cursorQuery, "voicePath");
            int columnIndexOrThrow6 = bb3.getColumnIndexOrThrow(cursorQuery, "voiceTime");
            int columnIndexOrThrow7 = bb3.getColumnIndexOrThrow(cursorQuery, "messageTime");
            int columnIndexOrThrow8 = bb3.getColumnIndexOrThrow(cursorQuery, "isPause");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                C13560uk c13560uk = new C13560uk();
                c13560uk.setId(cursorQuery.getInt(columnIndexOrThrow));
                c13560uk.setResult(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                c13560uk.setType(cursorQuery.getInt(columnIndexOrThrow3));
                c13560uk.setMultipleOptions(cursorQuery.getInt(columnIndexOrThrow4));
                c13560uk.setVoicePath(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                xaeVar = xaeVarAcquire;
                try {
                    c13560uk.setVoiceTime(cursorQuery.getLong(columnIndexOrThrow6));
                    c13560uk.setMessageTime(cursorQuery.getLong(columnIndexOrThrow7));
                    c13560uk.setPause(cursorQuery.getInt(columnIndexOrThrow8) != 0);
                    arrayList.add(c13560uk);
                    xaeVarAcquire = xaeVar;
                } catch (Throwable th) {
                    th = th;
                    cursorQuery.close();
                    xaeVar.release();
                    throw th;
                }
            }
            cursorQuery.close();
            xaeVarAcquire.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            xaeVar = xaeVarAcquire;
        }
    }

    @Override // p000.esa
    public void insert(final C13560uk message) {
        this.f37609a.assertNotSuspendingTransaction();
        this.f37609a.beginTransaction();
        try {
            this.f37610b.insert(message);
            this.f37609a.setTransactionSuccessful();
        } finally {
            this.f37609a.endTransaction();
        }
    }
}
