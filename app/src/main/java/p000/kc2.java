package p000;

import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class kc2 {

    /* JADX INFO: renamed from: a */
    @igg({"StaticFieldLeak"})
    public static WeakReference<Context> f53573a = null;

    /* JADX INFO: renamed from: b */
    public static final boolean f53574b = true;

    /* JADX INFO: renamed from: a */
    private static void m14651a() {
        WeakReference<Context> weakReference = f53573a;
        if (weakReference != null) {
            weakReference.clear();
            System.gc();
        }
    }

    public static void checkAllNotNull(Object... objArr) {
        for (Object obj : objArr) {
            obj.getClass();
        }
    }

    public static boolean checkHasConnectPermission(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return checkHasPermission(context, xnc.f98625v);
        }
        return true;
    }

    public static boolean checkHasLocationPermission(Context context) {
        return Build.VERSION.SDK_INT >= 31 || checkHasPermission(context, xnc.f98583H) || checkHasPermission(context, xnc.f98584I);
    }

    public static boolean checkHasPermission(Context context, String str) {
        return context != null && lx2.checkSelfPermission(context, str) == 0;
    }

    public static boolean checkHasScanPermission(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return checkHasPermission(context, xnc.f98624u);
        }
        return true;
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static String formatString(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    public static long getCurrentTime() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public static Context getMainContext() {
        WeakReference<Context> weakReference = f53573a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static void setMainContext(Context context) {
        f53573a = new WeakReference<>((Context) checkNotNull(context));
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
