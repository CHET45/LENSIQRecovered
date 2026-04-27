package p000;

import android.content.Context;
import android.os.Environment;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class ij9 {

    /* JADX INFO: renamed from: a */
    public static final String f47183a = "^_^";

    /* JADX INFO: renamed from: b */
    public static final String f47184b = "ij9";

    /* JADX INFO: renamed from: c */
    public static final int f47185c = 4000;

    /* JADX INFO: renamed from: d */
    public static boolean f47186d = true;

    /* JADX INFO: renamed from: e */
    public static final String f47187e = "====================================================================================================";

    /* JADX INFO: renamed from: f */
    public static boolean f47188f = true;

    /* JADX INFO: renamed from: g */
    public static boolean f47189g = true;

    /* JADX INFO: renamed from: h */
    public static boolean f47190h = true;

    /* JADX INFO: renamed from: i */
    public static boolean f47191i = true;

    /* JADX INFO: renamed from: j */
    public static boolean f47192j = true;

    /* JADX INFO: renamed from: ij9$a */
    public enum EnumC7319a {
        V,
        D,
        I,
        W,
        E
    }

    /* JADX INFO: renamed from: ij9$b */
    public static class C7320b {

        /* JADX INFO: renamed from: a */
        public long f47199a = SystemClock.elapsedRealtime();

        public long end() {
            return SystemClock.elapsedRealtime() - this.f47199a;
        }
    }

    private static String buildMessage(String str, Object[] objArr) {
        String strSubstring;
        int lineNumber;
        String methodName;
        String fileName;
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    str = String.format(Locale.US, str, objArr);
                }
            } catch (Exception e) {
                m13138e(e, f47184b, e.getMessage(), new Object[0]);
                return "----->ERROR LOG STRING<------";
            }
        }
        if (!f47186d) {
            return str;
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                strSubstring = "";
                lineNumber = 0;
                methodName = "";
                fileName = methodName;
                break;
            }
            if (!stackTrace[i].getClass().equals(ij9.class)) {
                String className = stackTrace[i].getClassName();
                strSubstring = className.substring(className.lastIndexOf(46) + 1);
                methodName = stackTrace[i].getMethodName();
                fileName = stackTrace[i].getFileName();
                lineNumber = stackTrace[i].getLineNumber();
                break;
            }
            i++;
        }
        Locale locale = Locale.US;
        return String.format(locale, "%s> %s", formatLength(String.format(locale, "[%03d] %s.%s(%s:%d)", Long.valueOf(Thread.currentThread().getId()), strSubstring, methodName, fileName, Integer.valueOf(lineNumber)), 93), str);
    }

    private static void cacheLongLog(String str, String str2) {
        cacheLongLog(str, str2, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m13135d(String str, String str2, Object... objArr) {
        if (f47189g) {
            cacheLongLog(formatLength(f47183a + str, 28), buildMessage(str2, objArr));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m13137e(String str, String str2, Object... objArr) {
        if (f47192j) {
            String strBuildMessage = buildMessage(str2, objArr);
            String length = formatLength(f47183a + str, 28);
            Log.e(length, strBuildMessage);
            cacheLongLog(length, strBuildMessage);
        }
    }

    private static String formatLength(String str, int i) {
        StringBuilder sb = new StringBuilder();
        if (str.length() >= i) {
            sb.append(str);
        } else {
            sb.append(str);
            sb.append(f47187e.substring(0, i - str.length()));
        }
        return sb.toString();
    }

    @omg(19)
    public static File getAvailableExternalCacheDir(Context context) {
        File[] externalCacheDirs = context.getExternalCacheDirs();
        for (int length = externalCacheDirs.length - 1; length >= 0; length--) {
            File file = externalCacheDirs[length];
            if (file != null && "mounted".equals(Environment.getStorageState(file))) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static void m13139i(String str, String str2, Object... objArr) {
        if (f47190h) {
            String strBuildMessage = buildMessage(str2, objArr);
            String length = formatLength(f47183a + str, 28);
            Log.i(length, strBuildMessage);
            cacheLongLog(length, strBuildMessage);
        }
    }

    public static boolean isFileExists(String str) {
        return isFileExists(new File(str));
    }

    public static void printCaller() {
        if (f47186d) {
            try {
                StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
                StringBuilder sb = new StringBuilder();
                sb.append("print caller info\n==========BEGIN OF CALLER INFO============\n");
                for (int i = 2; i < stackTrace.length; i++) {
                    String className = stackTrace[i].getClassName();
                    sb.append(String.format(Locale.US, "[%03d] %s.%s(%s:%d)", Long.valueOf(Thread.currentThread().getId()), className.substring(className.lastIndexOf(46) + 1), stackTrace[i].getMethodName(), stackTrace[i].getFileName(), Integer.valueOf(stackTrace[i].getLineNumber())));
                    sb.append("\n");
                }
                sb.append("==========END OF CALLER INFO============");
                m13139i(f47184b, sb.toString(), new Object[0]);
            } catch (Exception e) {
                m13138e(e, f47184b, e.getMessage(), new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m13141v(String str, String str2, Object... objArr) {
        if (f47188f) {
            cacheLongLog(formatLength(f47183a + str, 28), buildMessage(str2, objArr));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m13143w(String str, String str2, Object... objArr) {
        if (f47191i) {
            String strBuildMessage = buildMessage(str2, objArr);
            String length = formatLength(f47183a + str, 28);
            Log.w(length, strBuildMessage);
            cacheLongLog(length, strBuildMessage);
        }
    }

    @omg(19)
    private static void cacheLongLog(String str, String str2, Throwable th) {
    }

    public static boolean isFileExists(File file) {
        return file != null && file.exists();
    }

    /* JADX INFO: renamed from: d */
    public static void m13136d(Throwable th, String str, String str2, Object... objArr) {
        if (f47189g) {
            cacheLongLog(formatLength(f47183a + str, 28), buildMessage(str2, objArr), th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m13142v(Throwable th, String str, String str2, Object... objArr) {
        if (f47188f) {
            cacheLongLog(formatLength(f47183a + str, 28), buildMessage(str2, objArr), th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m13138e(Throwable th, String str, String str2, Object... objArr) {
        if (f47192j) {
            String strBuildMessage = buildMessage(str2, objArr);
            String length = formatLength(f47183a + str, 28);
            Log.e(length, strBuildMessage, th);
            cacheLongLog(length, strBuildMessage, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m13140i(Throwable th, String str, String str2, Object... objArr) {
        if (f47190h) {
            String strBuildMessage = buildMessage(str2, objArr);
            String length = formatLength(f47183a + str, 28);
            Log.i(length, strBuildMessage, th);
            cacheLongLog(length, strBuildMessage, th);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m13144w(Throwable th, String str, String str2, Object... objArr) {
        if (f47191i) {
            String strBuildMessage = buildMessage(str2, objArr);
            String length = formatLength(f47183a + str, 28);
            Log.w(length, strBuildMessage, th);
            cacheLongLog(length, strBuildMessage, th);
        }
    }
}
