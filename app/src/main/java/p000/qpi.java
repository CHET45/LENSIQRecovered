package p000;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class qpi {

    /* JADX INFO: renamed from: b */
    public static final String f75091b = "androidx.work.workdb";

    /* JADX INFO: renamed from: a */
    public static final String f75090a = cj9.tagWithPrefix("WrkDbPathHelper");

    /* JADX INFO: renamed from: c */
    public static final String[] f75092c = {"-journal", "-shm", "-wal"};

    private qpi() {
    }

    @efb
    @fdi
    public static File getDatabasePath(@efb Context context) {
        return getNoBackupPath(context, f75091b);
    }

    @efb
    @fdi
    public static File getDefaultDatabasePath(@efb Context context) {
        return context.getDatabasePath(f75091b);
    }

    @c5e(23)
    private static File getNoBackupPath(@efb Context context, @efb String filePath) {
        return new File(context.getNoBackupFilesDir(), filePath);
    }

    @efb
    public static String getWorkDatabaseName() {
        return f75091b;
    }

    public static void migrateDatabase(@efb Context context) {
        if (getDefaultDatabasePath(context).exists()) {
            cj9.get().debug(f75090a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> mapMigrationPaths = migrationPaths(context);
            for (File file : mapMigrationPaths.keySet()) {
                File file2 = mapMigrationPaths.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        cj9.get().warning(f75090a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    cj9.get().debug(f75090a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
                }
            }
        }
    }

    @efb
    @fdi
    public static Map<File, File> migrationPaths(@efb Context context) {
        HashMap map = new HashMap();
        File defaultDatabasePath = getDefaultDatabasePath(context);
        File databasePath = getDatabasePath(context);
        map.put(defaultDatabasePath, databasePath);
        for (String str : f75092c) {
            map.put(new File(defaultDatabasePath.getPath() + str), new File(databasePath.getPath() + str));
        }
        return map;
    }
}
