package p000;

import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class yi9 {

    /* JADX INFO: renamed from: a */
    public static final String f101702a = "watchfun_log";

    /* JADX INFO: renamed from: b */
    public static final String f101703b = "->";

    /* JADX INFO: renamed from: c */
    public static boolean f101704c = true;

    /* JADX INFO: renamed from: d */
    public static final int f101705d = 4;

    private static String buildLogString(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        StackTraceElement stackTraceElement = new Throwable().fillInStackTrace().getStackTrace()[2];
        return c0b.f15433c + stackTraceElement.getFileName() + g1i.f38277c + stackTraceElement.getLineNumber() + ")." + stackTraceElement.getMethodName() + "():" + str;
    }

    /* JADX INFO: renamed from: d */
    public static void m26089d(String str, Object obj) {
        if (f101704c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(obj);
        }
    }

    public static void dOnlyEvent(String str) {
    }

    public static void dStackTrace(String str, Object obj) {
        if (f101704c) {
            String functionName = getFunctionName();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(functionName);
            sb.append("\n");
            sb.append(obj);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m26092e(String str, String str2) {
        if (f101704c) {
            Log.e(f101702a, str + "->" + getFunctionName() + str2 + "\n");
        }
    }

    private static String getFunctionName() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(yi9.class.getName())) {
                return "[ Thread: " + Thread.currentThread().getName() + ": (" + stackTraceElement.getFileName() + g1i.f38277c + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + " ]";
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static void m26094i(String str, Object obj) {
        if (f101704c) {
            Log.i(f101702a, str + "->" + obj);
        }
    }

    public static void setLogFlag(boolean z) {
        f101704c = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m26097v(String str, Object obj) {
        if (f101704c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(obj);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m26100w(String str, Object obj) {
        if (f101704c) {
            Log.w(f101702a, str + "->" + obj);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m26091d(String str, String str2, Object... objArr) {
        if (f101704c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(buildLogString(str2, objArr));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m26096i(String str, String str2, Object... objArr) {
        if (f101704c) {
            Log.i(f101702a, str + "->" + buildLogString(str2, objArr));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m26099v(String str, String str2, Object... objArr) {
        if (f101704c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(buildLogString(str2, objArr));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m26102w(String str, String str2, Object... objArr) {
        if (f101704c) {
            Log.w(f101702a, str + "->" + buildLogString(str2, objArr));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m26093e(String str, String str2, Throwable th) {
        if (f101704c) {
            Log.e(f101702a, str + "->" + str2, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m26090d(String str, String str2) {
        if (f101704c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m26095i(String str, String str2) {
        if (f101704c) {
            Log.i(f101702a, str + "->" + str2);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m26098v(String str, String str2) {
        if (f101704c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(str2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m26101w(String str, String str2) {
        if (f101704c) {
            Log.w(f101702a, str + "->" + str2);
        }
    }
}
