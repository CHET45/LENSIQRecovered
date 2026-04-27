package p000;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class kt5 {

    /* JADX INFO: renamed from: h */
    public static final String f55288h = ".com.google.firebase.crashlytics.files.v1";

    /* JADX INFO: renamed from: i */
    public static final String f55289i = ".com.google.firebase.crashlytics.files.v2";

    /* JADX INFO: renamed from: j */
    public static final String f55290j = ".crashlytics.v3";

    /* JADX INFO: renamed from: k */
    public static final String f55291k = "open-sessions";

    /* JADX INFO: renamed from: l */
    public static final String f55292l = "native";

    /* JADX INFO: renamed from: m */
    public static final String f55293m = "reports";

    /* JADX INFO: renamed from: n */
    public static final String f55294n = "priority-reports";

    /* JADX INFO: renamed from: o */
    public static final String f55295o = "native-reports";

    /* JADX INFO: renamed from: a */
    public final String f55296a;

    /* JADX INFO: renamed from: b */
    public final File f55297b;

    /* JADX INFO: renamed from: c */
    public final File f55298c;

    /* JADX INFO: renamed from: d */
    public final File f55299d;

    /* JADX INFO: renamed from: e */
    public final File f55300e;

    /* JADX INFO: renamed from: f */
    public final File f55301f;

    /* JADX INFO: renamed from: g */
    public final File f55302g;

    public kt5(Context context) {
        String str;
        String processName = bdd.f13443a.getCurrentProcessDetails(context).getProcessName();
        this.f55296a = processName;
        File filesDir = context.getFilesDir();
        this.f55297b = filesDir;
        if (useV3FileSystem()) {
            str = f55290j + File.separator + m14990c(processName);
        } else {
            str = f55288h;
        }
        File filePrepareBaseDir = prepareBaseDir(new File(filesDir, str));
        this.f55298c = filePrepareBaseDir;
        this.f55299d = prepareBaseDir(new File(filePrepareBaseDir, f55291k));
        this.f55300e = prepareBaseDir(new File(filePrepareBaseDir, f55293m));
        this.f55301f = prepareBaseDir(new File(filePrepareBaseDir, f55294n));
        this.f55302g = prepareBaseDir(new File(filePrepareBaseDir, f55295o));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14989b(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m14989b(file2);
            }
        }
        return file.delete();
    }

    @fdi
    /* JADX INFO: renamed from: c */
    public static String m14990c(String str) {
        return str.length() > 40 ? lc2.sha1(str) : str.replaceAll("[^a-zA-Z0-9.]", p43.f69617m);
    }

    private void cleanupFileSystemDir(String str) {
        File file = new File(this.f55297b, str);
        if (file.exists() && m14989b(file)) {
            ej9.getLogger().m10061d("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void cleanupFileSystemDirs(final String str) {
        String[] list;
        if (!this.f55297b.exists() || (list = this.f55297b.list(new FilenameFilter() { // from class: jt5
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return kt5.lambda$cleanupFileSystemDirs$0(str, file, str2);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            cleanupFileSystemDir(str2);
        }
    }

    private File getSessionDir(String str) {
        return prepareDir(new File(this.f55299d, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$cleanupFileSystemDirs$0(String str, File file, String str2) {
        return str2.startsWith(str);
    }

    private static synchronized File prepareBaseDir(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                ej9.getLogger().m10061d("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                ej9.getLogger().m10063e("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static File prepareDir(File file) {
        file.mkdirs();
        return file;
    }

    private static <T> List<T> safeArrayToList(@hib T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    private boolean useV3FileSystem() {
        return !this.f55296a.isEmpty();
    }

    public void cleanupPreviousFileSystems() {
        cleanupFileSystemDir(".com.google.firebase.crashlytics");
        cleanupFileSystemDir(".com.google.firebase.crashlytics-ndk");
        if (useV3FileSystem()) {
            cleanupFileSystemDir(f55288h);
            cleanupFileSystemDirs(f55289i + File.pathSeparator);
        }
    }

    @fdi
    public void deleteAllCrashlyticsFiles() {
        m14989b(this.f55298c);
    }

    public boolean deleteSessionFiles(String str) {
        return m14989b(new File(this.f55299d, str));
    }

    public List<String> getAllOpenSessionIds() {
        return safeArrayToList(this.f55299d.list());
    }

    public File getCommonFile(String str) {
        return new File(this.f55298c, str);
    }

    public List<File> getCommonFiles(FilenameFilter filenameFilter) {
        return safeArrayToList(this.f55298c.listFiles(filenameFilter));
    }

    public File getNativeReport(String str) {
        return new File(this.f55302g, str);
    }

    public List<File> getNativeReports() {
        return safeArrayToList(this.f55302g.listFiles());
    }

    public File getNativeSessionDir(String str) {
        return prepareDir(new File(getSessionDir(str), f55292l));
    }

    public File getPriorityReport(String str) {
        return new File(this.f55301f, str);
    }

    public List<File> getPriorityReports() {
        return safeArrayToList(this.f55301f.listFiles());
    }

    public File getReport(String str) {
        return new File(this.f55300e, str);
    }

    public List<File> getReports() {
        return safeArrayToList(this.f55300e.listFiles());
    }

    public File getSessionFile(String str, String str2) {
        return new File(getSessionDir(str), str2);
    }

    public List<File> getSessionFiles(String str, FilenameFilter filenameFilter) {
        return safeArrayToList(getSessionDir(str).listFiles(filenameFilter));
    }
}
