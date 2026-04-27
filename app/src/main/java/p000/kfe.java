package p000;

import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.ki9;

/* JADX INFO: loaded from: classes6.dex */
public class kfe {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static final int f53981a = 2;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final int f53982b = 3;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final int f53983c = 4;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public static final int f53984d = 5;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final int f53985e = 6;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public static final int f53986f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public static final Pattern f53987g = Pattern.compile("\\$\\d+$");

    /* JADX INFO: renamed from: h */
    public static final ThreadLocal<String> f53988h = new ThreadLocal<>();

    /* JADX INFO: renamed from: i */
    public static final ki9.InterfaceC8382b f53989i;

    /* JADX INFO: renamed from: j */
    public static oj9 f53990j;

    /* JADX INFO: renamed from: kfe$a */
    public class C8352a implements ki9.InterfaceC8382b {
        @Override // p000.ki9.InterfaceC8382b
        public void log(int i, String str, String str2) {
            Log.println(i, str, str2);
        }
    }

    /* JADX INFO: renamed from: kfe$b */
    public class C8353b implements ki9.InterfaceC8382b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8355d f53991a;

        public C8353b(InterfaceC8355d interfaceC8355d) {
            this.f53991a = interfaceC8355d;
        }

        @Override // p000.ki9.InterfaceC8382b
        public void log(int i, String str, String str2) {
            this.f53991a.log(i, str, str2);
        }
    }

    /* JADX INFO: renamed from: kfe$c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8354c {
    }

    /* JADX INFO: renamed from: kfe$d */
    public interface InterfaceC8355d {
        void log(int i, String str, String str2);
    }

    static {
        C8352a c8352a = new C8352a();
        f53989i = c8352a;
        f53990j = new oj9(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, false, true, c8352a);
    }

    private kfe() {
    }

    private static String createTag() {
        ThreadLocal<String> threadLocal = f53988h;
        String str = threadLocal.get();
        if (str != null) {
            threadLocal.remove();
            return str;
        }
        List listAsList = Arrays.asList(kfe.class.getName(), pj9.class.getName(), qj9.class.getName());
        Throwable th = new Throwable();
        StackTraceElement[] stackTrace = th.getStackTrace();
        int i = 0;
        while (i < stackTrace.length && listAsList.contains(stackTrace[i].getClassName())) {
            i++;
        }
        if (stackTrace.length <= i) {
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?", th);
        }
        String className = stackTrace[i].getClassName();
        Matcher matcher = f53987g.matcher(className);
        if (matcher.find()) {
            className = matcher.replaceAll("");
        }
        String strReplace = className.replace("Impl", "").replace("RxBle", "");
        int iIndexOf = strReplace.indexOf(36);
        return "RxBle#" + (iIndexOf <= 0 ? strReplace.substring(strReplace.lastIndexOf(46) + 1) : strReplace.substring(strReplace.lastIndexOf(46) + 1, iIndexOf));
    }

    /* JADX INFO: renamed from: d */
    public static void m14722d(String str, Object... objArr) {
        throwShade(3, null, str, objArr);
    }

    /* JADX INFO: renamed from: e */
    public static void m14724e(String str, Object... objArr) {
        throwShade(6, null, str, objArr);
    }

    private static String formatString(String str, Object... objArr) {
        return objArr.length == 0 ? str : String.format(str, objArr);
    }

    public static int getMacAddressLogSetting() {
        return f53990j.f67814b;
    }

    public static boolean getShouldLogAttributeValues() {
        return f53990j.f67816d;
    }

    public static boolean getShouldLogScannedPeripherals() {
        return f53990j.f67817e;
    }

    public static int getUuidLogSetting() {
        return f53990j.f67815c;
    }

    /* JADX INFO: renamed from: i */
    public static void m14726i(String str, Object... objArr) {
        throwShade(4, null, str, objArr);
    }

    public static boolean isAtLeast(int i) {
        return f53990j.f67813a <= i;
    }

    private static void println(int i, String str, String str2) {
        if (str2.length() < 4000) {
            f53990j.f67818f.log(i, str, str2);
            return;
        }
        for (String str3 : str2.split("\n")) {
            f53990j.f67818f.log(i, str, str3);
        }
    }

    @Deprecated
    public static void setLogLevel(int i) {
        updateLogOptions(new ki9.C8381a().setLogLevel(Integer.valueOf(i)).build());
    }

    @Deprecated
    public static void setLogger(@hib InterfaceC8355d interfaceC8355d) {
        updateLogOptions(new ki9.C8381a().setLogger(interfaceC8355d == null ? f53989i : new C8353b(interfaceC8355d)).build());
    }

    private static void throwShade(int i, Throwable th, String str, Object... objArr) {
        if (i < f53990j.f67813a) {
            return;
        }
        String string = formatString(str, objArr);
        if (string == null || string.length() == 0) {
            if (th == null) {
                return;
            } else {
                string = Log.getStackTraceString(th);
            }
        } else if (th != null) {
            string = string + "\n" + Log.getStackTraceString(th);
        }
        println(i, createTag(), string);
    }

    public static void updateLogOptions(ki9 ki9Var) {
        oj9 oj9Var = f53990j;
        oj9 oj9VarMerge = oj9Var.merge(ki9Var);
        m14722d("Received new options (%s) and merged with old setup: %s. New setup: %s", ki9Var, oj9Var, oj9VarMerge);
        f53990j = oj9VarMerge;
    }

    /* JADX INFO: renamed from: v */
    public static void m14728v(String str, Object... objArr) {
        throwShade(2, null, str, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static void m14730w(String str, Object... objArr) {
        throwShade(5, null, str, objArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m14723d(Throwable th, String str, Object... objArr) {
        throwShade(3, th, str, objArr);
    }

    /* JADX INFO: renamed from: e */
    public static void m14725e(Throwable th, String str, Object... objArr) {
        throwShade(6, th, str, objArr);
    }

    /* JADX INFO: renamed from: i */
    public static void m14727i(Throwable th, String str, Object... objArr) {
        throwShade(4, th, str, objArr);
    }

    /* JADX INFO: renamed from: v */
    public static void m14729v(Throwable th, String str, Object... objArr) {
        throwShade(2, th, str, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static void m14731w(Throwable th, String str, Object... objArr) {
        throwShade(5, th, str, objArr);
    }
}
