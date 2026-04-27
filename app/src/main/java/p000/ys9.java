package p000;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class ys9 {

    /* JADX INFO: renamed from: a */
    public static final us9 f102898a = loadSchemaForFullRuntime();

    /* JADX INFO: renamed from: b */
    public static final us9 f102899b = new ws9();

    /* JADX INFO: renamed from: a */
    public static us9 m26349a() {
        return f102898a;
    }

    /* JADX INFO: renamed from: b */
    public static us9 m26350b() {
        return f102899b;
    }

    private static us9 loadSchemaForFullRuntime() {
        try {
            return (us9) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
