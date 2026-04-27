package p000;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class zi9 {

    /* JADX INFO: renamed from: a */
    public static final String f105182a = "watchfun";

    /* JADX INFO: renamed from: b */
    public static final String f105183b = "->";

    /* JADX INFO: renamed from: c */
    public static boolean f105184c = true;

    /* JADX INFO: renamed from: d */
    public static final int f105185d = 4;

    private static String buildLogString(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        StackTraceElement stackTraceElement = new Throwable().fillInStackTrace().getStackTrace()[2];
        return c0b.f15433c + stackTraceElement.getFileName() + g1i.f38277c + stackTraceElement.getLineNumber() + ")." + stackTraceElement.getMethodName() + "():" + str;
    }

    private static void checkAndUpload(String str, String str2, String str3) {
        hi9.save(str, str2, str3);
    }

    /* JADX INFO: renamed from: d */
    public static void m26849d(String str, Object obj) {
        if (f105184c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(obj);
            checkAndUpload("DEBUG", str, String.valueOf(obj));
        }
    }

    public static void dOnlyEvent(String str) {
        if (f105184c) {
            wi9.uploadEventAsync(str);
        }
    }

    public static void dStackTrace(String str, Object obj) {
        if (f105184c) {
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
    public static void m26852e(String str, String str2) {
        if (f105184c) {
            String functionName = getFunctionName();
            Log.e(f105182a, str + "->" + functionName + str2 + "\n");
            StringBuilder sb = new StringBuilder();
            sb.append(functionName);
            sb.append(str2);
            checkAndUpload("ERROR", str, sb.toString());
        }
    }

    private static String getFunctionName() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(zi9.class.getName())) {
                return "[ Thread: " + Thread.currentThread().getName() + ": (" + stackTraceElement.getFileName() + g1i.f38277c + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + " ]";
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static void m26854i(String str, Object obj) {
        if (f105184c) {
            Log.i(f105182a, str + "->" + obj);
            checkAndUpload("INFO", str, String.valueOf(obj));
        }
    }

    public static void setLogFlag(boolean z) {
        f105184c = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m26857v(String str, Object obj) {
        if (f105184c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(obj);
            checkAndUpload("VERBOSE", str, String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m26860w(String str, Object obj) {
        if (f105184c) {
            Log.w(f105182a, str + "->" + obj);
            checkAndUpload("WARN", str, String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m26851d(String str, String str2, Object... objArr) {
        if (f105184c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(buildLogString(str2, objArr));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m26856i(String str, String str2, Object... objArr) {
        if (f105184c) {
            Log.i(f105182a, str + "->" + buildLogString(str2, objArr));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m26859v(String str, String str2, Object... objArr) {
        if (f105184c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(buildLogString(str2, objArr));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m26862w(String str, String str2, Object... objArr) {
        if (f105184c) {
            Log.w(f105182a, str + "->" + buildLogString(str2, objArr));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m26853e(String str, String str2, Throwable th) {
        if (f105184c) {
            Log.e(f105182a, str + "->" + str2, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m26850d(String str, String str2) {
        if (f105184c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(str2);
            checkAndUpload("DEBUG", str, String.valueOf(str2));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m26855i(String str, String str2) {
        if (f105184c) {
            Log.i(f105182a, str + "->" + str2);
            checkAndUpload("INFO", str, String.valueOf(str2));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m26858v(String str, String str2) {
        if (f105184c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(str2);
            checkAndUpload("VERBOSE", str, String.valueOf(str2));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m26861w(String str, String str2) {
        if (f105184c) {
            Log.w(f105182a, str + "->" + str2);
            checkAndUpload("WARN", str, String.valueOf(str2));
        }
    }
}
