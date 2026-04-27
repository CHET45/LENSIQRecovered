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

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class bm1 {

    /* JADX INFO: renamed from: c */
    public static final String f14092c = "ExoPlayerCacheFileMetadata";

    /* JADX INFO: renamed from: d */
    public static final int f14093d = 1;

    /* JADX INFO: renamed from: e */
    public static final String f14094e = "name";

    /* JADX INFO: renamed from: f */
    public static final String f14095f = "length";

    /* JADX INFO: renamed from: g */
    public static final String f14096g = "last_touch_timestamp";

    /* JADX INFO: renamed from: h */
    public static final int f14097h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f14098i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f14099j = 2;

    /* JADX INFO: renamed from: k */
    public static final String f14100k = "name = ?";

    /* JADX INFO: renamed from: l */
    public static final String[] f14101l = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: m */
    public static final String f14102m = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";

    /* JADX INFO: renamed from: a */
    public final si3 f14103a;

    /* JADX INFO: renamed from: b */
    public String f14104b;

    public bm1(si3 si3Var) {
        this.f14103a = si3Var;
    }

    @xqi
    public static void delete(si3 si3Var, long j) throws oi3 {
        String hexString = Long.toHexString(j);
        try {
            String tableName = getTableName(hexString);
            SQLiteDatabase writableDatabase = si3Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                x4i.removeVersion(writableDatabase, 2, hexString);
                dropTable(writableDatabase, tableName);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new oi3(e);
        }
    }

    private static void dropTable(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    private Cursor getCursor() {
        u80.checkNotNull(this.f14104b);
        return this.f14103a.getReadableDatabase().query(this.f14104b, f14101l, null, null, null, null, null);
    }

    private static String getTableName(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    @xqi
    public Map<String, zl1> getAll() throws oi3 {
        try {
            Cursor cursor = getCursor();
            try {
                HashMap map = new HashMap(cursor.getCount());
                while (cursor.moveToNext()) {
                    map.put((String) u80.checkNotNull(cursor.getString(0)), new zl1(cursor.getLong(1), cursor.getLong(2)));
                }
                cursor.close();
                return map;
            } finally {
            }
        } catch (SQLException e) {
            throw new oi3(e);
        }
    }

    @xqi
    public void initialize(long j) throws oi3 {
        try {
            String hexString = Long.toHexString(j);
            this.f14104b = getTableName(hexString);
            if (x4i.getVersion(this.f14103a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f14103a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    x4i.setVersion(writableDatabase, 2, hexString, 1);
                    dropTable(writableDatabase, this.f14104b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f14104b + C2473f.f17566z + "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (SQLException e) {
            throw new oi3(e);
        }
    }

    @xqi
    public void remove(String str) throws oi3 {
        u80.checkNotNull(this.f14104b);
        try {
            this.f14103a.getWritableDatabase().delete(this.f14104b, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new oi3(e);
        }
    }

    @xqi
    public void removeAll(Set<String> set) throws oi3 {
        u80.checkNotNull(this.f14104b);
        try {
            SQLiteDatabase writableDatabase = this.f14103a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f14104b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new oi3(e);
        }
    }

    @xqi
    public void set(String str, long j, long j2) throws oi3 {
        u80.checkNotNull(this.f14104b);
        try {
            SQLiteDatabase writableDatabase = this.f14103a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f14104b, null, contentValues);
        } catch (SQLException e) {
            throw new oi3(e);
        }
    }
}
