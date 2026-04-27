package p000;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class gj5 {

    /* JADX INFO: renamed from: a */
    public static final cj5<?> f39926a = new dj5();

    /* JADX INFO: renamed from: b */
    public static final cj5<?> f39927b = loadSchemaForFullRuntime();

    private gj5() {
    }

    /* JADX INFO: renamed from: a */
    public static cj5<?> m11704a() {
        cj5<?> cj5Var = f39927b;
        if (cj5Var != null) {
            return cj5Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: renamed from: b */
    public static cj5<?> m11705b() {
        return f39926a;
    }

    private static cj5<?> loadSchemaForFullRuntime() {
        if (lhd.f57633d) {
            return null;
        }
        try {
            return (cj5) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
