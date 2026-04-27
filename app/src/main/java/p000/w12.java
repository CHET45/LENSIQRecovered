package p000;

import android.app.ActivityManager;
import android.os.Environment;
import com.blankj.utilcode.util.C2479l;
import com.blankj.utilcode.util.C2481n;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class w12 {
    private w12() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @c5e(api = 19)
    public static void cleanAppUserData() {
        ((ActivityManager) C2479l.getApp().getSystemService("activity")).clearApplicationUserData();
    }

    public static boolean cleanCustomDir(String str) {
        return C2481n.m4327t(C2481n.m4258O(str));
    }

    public static boolean cleanExternalCache() {
        return "mounted".equals(Environment.getExternalStorageState()) && C2481n.m4327t(C2479l.getApp().getExternalCacheDir());
    }

    public static boolean cleanInternalCache() {
        return C2481n.m4327t(C2479l.getApp().getCacheDir());
    }

    public static boolean cleanInternalDbByName(String str) {
        return C2479l.getApp().deleteDatabase(str);
    }

    public static boolean cleanInternalDbs() {
        return C2481n.m4327t(new File(C2479l.getApp().getFilesDir().getParent(), "databases"));
    }

    public static boolean cleanInternalFiles() {
        return C2481n.m4327t(C2479l.getApp().getFilesDir());
    }

    public static boolean cleanInternalSp() {
        return C2481n.m4327t(new File(C2479l.getApp().getFilesDir().getParent(), "shared_prefs"));
    }
}
