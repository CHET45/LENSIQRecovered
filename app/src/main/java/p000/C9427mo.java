package p000;

/* JADX INFO: renamed from: mo */
/* JADX INFO: loaded from: classes4.dex */
public final class C9427mo {

    /* JADX INFO: renamed from: a */
    public static boolean f61587a;

    /* JADX INFO: renamed from: b */
    public static final Class<?> f61588b = getClassForName("libcore.io.Memory");

    /* JADX INFO: renamed from: c */
    public static final boolean f61589c;

    static {
        f61589c = (f61587a || getClassForName("org.robolectric.Robolectric") == null) ? false : true;
    }

    private C9427mo() {
    }

    /* JADX INFO: renamed from: a */
    public static Class<?> m17476a() {
        return f61588b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m17477b() {
        return f61587a || !(f61588b == null || f61589c);
    }

    private static <T> Class<T> getClassForName(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
