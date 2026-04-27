package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class x4i {

    /* JADX INFO: renamed from: a */
    public static final int f96702a = -1;

    /* JADX INFO: renamed from: b */
    public static final int f96703b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f96704c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f96705d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f96706e = 1000;

    /* JADX INFO: renamed from: f */
    public static final String f96707f = "ExoPlayerVersions";

    /* JADX INFO: renamed from: g */
    public static final String f96708g = "feature";

    /* JADX INFO: renamed from: h */
    public static final String f96709h = "instance_uid";

    /* JADX INFO: renamed from: i */
    public static final String f96710i = "version";

    /* JADX INFO: renamed from: j */
    public static final String f96711j = "feature = ? AND instance_uid = ?";

    /* JADX INFO: renamed from: k */
    public static final String f96712k = "PRIMARY KEY (feature, instance_uid)";

    /* JADX INFO: renamed from: l */
    public static final String f96713l = "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))";

    static {
        lf5.registerModule("goog.exo.database");
    }

    private x4i() {
    }

    private static String[] featureAndInstanceUidArguments(int i, String str) {
        return new String[]{Integer.toString(i), str};
    }

    public static int getVersion(SQLiteDatabase sQLiteDatabase, int i, String str) throws oi3 {
        try {
        } catch (SQLException e) {
            throw new oi3(e);
        }
        if (!x0i.tableExists(sQLiteDatabase, "ExoPlayerVersions")) {
            return -1;
        }
        Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", featureAndInstanceUidArguments(i, str), null, null, null);
        try {
            if (cursorQuery.getCount() == 0) {
                cursorQuery.close();
                return -1;
            }
            cursorQuery.moveToNext();
            int i2 = cursorQuery.getInt(0);
            cursorQuery.close();
            return i2;
        } finally {
        }
        throw new oi3(e);
    }

    public static void removeVersion(SQLiteDatabase sQLiteDatabase, int i, String str) throws oi3 {
        try {
            if (x0i.tableExists(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", featureAndInstanceUidArguments(i, str));
            }
        } catch (SQLException e) {
            throw new oi3(e);
        }
    }

    public static void setVersion(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) throws oi3 {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new oi3(e);
        }
    }
}
