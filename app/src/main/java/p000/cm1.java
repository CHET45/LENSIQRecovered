package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.blankj.utilcode.util.C2473f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class cm1 {

    /* JADX INFO: renamed from: c */
    public static final String f16924c = "ExoPlayerCacheFileMetadata";

    /* JADX INFO: renamed from: d */
    public static final int f16925d = 1;

    /* JADX INFO: renamed from: e */
    public static final String f16926e = "name";

    /* JADX INFO: renamed from: f */
    public static final String f16927f = "length";

    /* JADX INFO: renamed from: g */
    public static final String f16928g = "last_touch_timestamp";

    /* JADX INFO: renamed from: h */
    public static final int f16929h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f16930i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f16931j = 2;

    /* JADX INFO: renamed from: k */
    public static final String f16932k = "name = ?";

    /* JADX INFO: renamed from: l */
    public static final String[] f16933l = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: m */
    public static final String f16934m = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";

    /* JADX INFO: renamed from: a */
    public final ti3 f16935a;

    /* JADX INFO: renamed from: b */
    public String f16936b;

    public cm1(ti3 ti3Var) {
        this.f16935a = ti3Var;
    }

    @xqi
    public static void delete(ti3 ti3Var, long j) throws pi3 {
        String hexString = Long.toHexString(j);
        try {
            String tableName = getTableName(hexString);
            SQLiteDatabase writableDatabase = ti3Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                y4i.removeVersion(writableDatabase, 2, hexString);
                dropTable(writableDatabase, tableName);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new pi3(e);
        }
    }

    private static void dropTable(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    private Cursor getCursor() {
        v80.checkNotNull(this.f16936b);
        return this.f16935a.getReadableDatabase().query(this.f16936b, f16933l, null, null, null, null, null);
    }

    private static String getTableName(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    @xqi
    public Map<String, am1> getAll() throws pi3 {
        try {
            Cursor cursor = getCursor();
            try {
                HashMap map = new HashMap(cursor.getCount());
                while (cursor.moveToNext()) {
                    map.put((String) v80.checkNotNull(cursor.getString(0)), new am1(cursor.getLong(1), cursor.getLong(2)));
                }
                cursor.close();
                return map;
            } finally {
            }
        } catch (SQLException e) {
            throw new pi3(e);
        }
    }

    @xqi
    public void initialize(long j) throws pi3 {
        try {
            String hexString = Long.toHexString(j);
            this.f16936b = getTableName(hexString);
            if (y4i.getVersion(this.f16935a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f16935a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    y4i.setVersion(writableDatabase, 2, hexString, 1);
                    dropTable(writableDatabase, this.f16936b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f16936b + C2473f.f17566z + "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (SQLException e) {
            throw new pi3(e);
        }
    }

    @xqi
    public void remove(String str) throws pi3 {
        v80.checkNotNull(this.f16936b);
        try {
            this.f16935a.getWritableDatabase().delete(this.f16936b, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new pi3(e);
        }
    }

    @xqi
    public void removeAll(Set<String> set) throws pi3 {
        v80.checkNotNull(this.f16936b);
        try {
            SQLiteDatabase writableDatabase = this.f16935a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f16936b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new pi3(e);
        }
    }

    @xqi
    public void set(String str, long j, long j2) throws pi3 {
        v80.checkNotNull(this.f16936b);
        try {
            SQLiteDatabase writableDatabase = this.f16935a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f16936b, null, contentValues);
        } catch (SQLException e) {
            throw new pi3(e);
        }
    }
}
