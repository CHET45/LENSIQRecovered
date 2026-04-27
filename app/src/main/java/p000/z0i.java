package p000;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes8.dex */
public final class z0i {

    /* JADX INFO: renamed from: a */
    public static C15913b f103638a;

    /* JADX INFO: renamed from: b */
    public static boolean f103639b;

    /* JADX INFO: renamed from: z0i$b */
    public static final class C15913b extends SecurityManager {
        private C15913b() {
        }

        @Override // java.lang.SecurityManager
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private z0i() {
    }

    public static Class<?> getCallingClass() {
        int i;
        C15913b securityManager = getSecurityManager();
        if (securityManager == null) {
            return null;
        }
        Class<?>[] classContext = securityManager.getClassContext();
        String name = z0i.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    private static C15913b getSecurityManager() {
        C15913b c15913b = f103638a;
        if (c15913b != null) {
            return c15913b;
        }
        if (f103639b) {
            return null;
        }
        C15913b c15913bSafeCreateSecurityManager = safeCreateSecurityManager();
        f103638a = c15913bSafeCreateSecurityManager;
        f103639b = true;
        return c15913bSafeCreateSecurityManager;
    }

    public static final void report(String str, Throwable th) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Reported exception:");
        th.printStackTrace();
    }

    private static C15913b safeCreateSecurityManager() {
        try {
            return new C15913b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean safeGetBooleanSystemProperty(String str) {
        String strSafeGetSystemProperty = safeGetSystemProperty(str);
        if (strSafeGetSystemProperty == null) {
            return false;
        }
        return strSafeGetSystemProperty.equalsIgnoreCase("true");
    }

    public static String safeGetSystemProperty(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final void report(String str) {
        System.err.println("SLF4J: " + str);
    }
}
