package p000;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class tj9 {

    /* JADX INFO: renamed from: a */
    public static final String f85062a = "TRuntime.";

    /* JADX INFO: renamed from: b */
    public static final int f85063b = 23;

    private tj9() {
    }

    private static String concatTag(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* JADX INFO: renamed from: d */
    public static void m22692d(String str, String str2) {
        Log.isLoggable(getTag(str), 3);
    }

    /* JADX INFO: renamed from: e */
    public static void m22696e(String str, String str2, Throwable th) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 6)) {
            Log.e(tag, str2, th);
        }
    }

    private static String getTag(String str) {
        return f85062a + str;
    }

    /* JADX INFO: renamed from: i */
    public static void m22697i(String str, String str2, Object obj) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 4)) {
            Log.i(tag, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m22698w(String str, String str2, Object obj) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 5)) {
            Log.w(tag, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m22693d(String str, String str2, Object obj) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, obj);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m22694d(String str, String str2, Object obj, Object obj2) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, obj, obj2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m22695d(String str, String str2, Object... objArr) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, objArr);
        }
    }
}
