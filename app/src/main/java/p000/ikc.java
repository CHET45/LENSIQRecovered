package p000;

import android.os.Environment;
import android.text.TextUtils;
import com.blankj.utilcode.util.C2479l;
import com.blankj.utilcode.util.C2481n;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class ikc {

    /* JADX INFO: renamed from: a */
    public static final char f47241a = File.separatorChar;

    private ikc() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static String getAbsolutePath(File file) {
        return file == null ? "" : file.getAbsolutePath();
    }

    public static String getAppDataPathExternalFirst() {
        String externalAppDataPath = getExternalAppDataPath();
        return TextUtils.isEmpty(externalAppDataPath) ? getInternalAppDataPath() : externalAppDataPath;
    }

    public static String getCachePathExternalFirst() {
        String externalAppCachePath = getExternalAppCachePath();
        return TextUtils.isEmpty(externalAppCachePath) ? getInternalAppCachePath() : externalAppCachePath;
    }

    public static String getDataPath() {
        return getAbsolutePath(Environment.getDataDirectory());
    }

    public static String getDownloadCachePath() {
        return getAbsolutePath(Environment.getDownloadCacheDirectory());
    }

    public static String getExternalAlarmsPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_ALARMS));
    }

    public static String getExternalAppAlarmsPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(C2479l.getApp().getExternalFilesDir(Environment.DIRECTORY_ALARMS));
    }

    public static String getExternalAppCachePath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(C2479l.getApp().getExternalCacheDir());
    }

    public static String getExternalAppDataPath() {
        File externalCacheDir;
        return (C2481n.m4340z0() && (externalCacheDir = C2479l.getApp().getExternalCacheDir()) != null) ? getAbsolutePath(externalCacheDir.getParentFile()) : "";
    }

    public static String getExternalAppDcimPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(C2479l.getApp().getExternalFilesDir(Environment.DIRECTORY_DCIM));
    }

    public static String getExternalAppDocumentsPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(C2479l.getApp().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS));
    }

    public static String getExternalAppDownloadPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(C2479l.getApp().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS));
    }

    public static String getExternalAppFilesPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(C2479l.getApp().getExternalFilesDir(null));
    }

    public static String getExternalAppMoviesPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(C2479l.getApp().getExternalFilesDir(Environment.DIRECTORY_MOVIES));
    }

    public static String getExternalAppMusicPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(C2479l.getApp().getExternalFilesDir(Environment.DIRECTORY_MUSIC));
    }

    public static String getExternalAppNotificationsPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(C2479l.getApp().getExternalFilesDir(Environment.DIRECTORY_NOTIFICATIONS));
    }

    public static String getExternalAppObbPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(C2479l.getApp().getObbDir());
    }

    public static String getExternalAppPicturesPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(C2479l.getApp().getExternalFilesDir(Environment.DIRECTORY_PICTURES));
    }

    public static String getExternalAppPodcastsPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(C2479l.getApp().getExternalFilesDir(Environment.DIRECTORY_PODCASTS));
    }

    public static String getExternalAppRingtonesPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(C2479l.getApp().getExternalFilesDir(Environment.DIRECTORY_RINGTONES));
    }

    public static String getExternalDcimPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
    }

    public static String getExternalDocumentsPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS));
    }

    public static String getExternalDownloadsPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
    }

    public static String getExternalMoviesPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES));
    }

    public static String getExternalMusicPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC));
    }

    public static String getExternalNotificationsPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_NOTIFICATIONS));
    }

    public static String getExternalPicturesPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
    }

    public static String getExternalPodcastsPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PODCASTS));
    }

    public static String getExternalRingtonesPath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES));
    }

    public static String getExternalStoragePath() {
        return !C2481n.m4340z0() ? "" : getAbsolutePath(Environment.getExternalStorageDirectory());
    }

    public static String getFilesPathExternalFirst() {
        String externalAppFilesPath = getExternalAppFilesPath();
        return TextUtils.isEmpty(externalAppFilesPath) ? getInternalAppFilesPath() : externalAppFilesPath;
    }

    public static String getInternalAppCachePath() {
        return getAbsolutePath(C2479l.getApp().getCacheDir());
    }

    public static String getInternalAppCodeCacheDir() {
        return getAbsolutePath(C2479l.getApp().getCodeCacheDir());
    }

    public static String getInternalAppDataPath() {
        return getAbsolutePath(C2479l.getApp().getDataDir());
    }

    public static String getInternalAppDbPath(String str) {
        return getAbsolutePath(C2479l.getApp().getDatabasePath(str));
    }

    public static String getInternalAppDbsPath() {
        return C2479l.getApp().getApplicationInfo().dataDir + "/databases";
    }

    public static String getInternalAppFilesPath() {
        return getAbsolutePath(C2479l.getApp().getFilesDir());
    }

    public static String getInternalAppNoBackupFilesPath() {
        return getAbsolutePath(C2479l.getApp().getNoBackupFilesDir());
    }

    public static String getInternalAppSpPath() {
        return C2479l.getApp().getApplicationInfo().dataDir + "/shared_prefs";
    }

    private static String getLegalSegment(String str) {
        char[] charArray = str.toCharArray();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < charArray.length; i3++) {
            if (charArray[i3] != f47241a) {
                if (i == -1) {
                    i = i3;
                }
                i2 = i3;
            }
        }
        if (i >= 0 && i2 >= i) {
            return str.substring(i, i2 + 1);
        }
        throw new IllegalArgumentException("segment of <" + str + "> is illegal");
    }

    public static String getRootPath() {
        return getAbsolutePath(Environment.getRootDirectory());
    }

    public static String getRootPathExternalFirst() {
        String externalStoragePath = getExternalStoragePath();
        return TextUtils.isEmpty(externalStoragePath) ? getRootPath() : externalStoragePath;
    }

    public static String join(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if (str == null) {
            str = "";
        }
        int length = str.length();
        String legalSegment = getLegalSegment(str2);
        if (length == 0) {
            return f47241a + legalSegment;
        }
        char cCharAt = str.charAt(length - 1);
        char c = f47241a;
        if (cCharAt == c) {
            return str + legalSegment;
        }
        return str + c + legalSegment;
    }
}
