package p000;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class fj5 {

    /* JADX INFO: renamed from: a */
    public static final bj5<?> f36845a = new ej5();

    /* JADX INFO: renamed from: b */
    public static final bj5<?> f36846b = loadSchemaForFullRuntime();

    /* JADX INFO: renamed from: a */
    public static bj5<?> m10945a() {
        bj5<?> bj5Var = f36846b;
        if (bj5Var != null) {
            return bj5Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: renamed from: b */
    public static bj5<?> m10946b() {
        return f36845a;
    }

    private static bj5<?> loadSchemaForFullRuntime() {
        try {
            return (bj5) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
