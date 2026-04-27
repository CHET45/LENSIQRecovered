package p000;

/* JADX INFO: renamed from: no */
/* JADX INFO: loaded from: classes3.dex */
public final class C9958no {

    /* JADX INFO: renamed from: a */
    public static boolean f65126a;

    /* JADX INFO: renamed from: b */
    public static final Class<?> f65127b = getClassForName("libcore.io.Memory");

    /* JADX INFO: renamed from: c */
    public static final boolean f65128c;

    static {
        f65128c = (f65126a || getClassForName("org.robolectric.Robolectric") == null) ? false : true;
    }

    private C9958no() {
    }

    /* JADX INFO: renamed from: a */
    public static Class<?> m18045a() {
        return f65127b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18046b() {
        return f65126a || !(f65127b == null || f65128c);
    }

    private static <T> Class<T> getClassForName(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
