package p000;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class zs9 {

    /* JADX INFO: renamed from: a */
    public static final vs9 f105956a = loadSchemaForFullRuntime();

    /* JADX INFO: renamed from: b */
    public static final vs9 f105957b = new xs9();

    private zs9() {
    }

    /* JADX INFO: renamed from: a */
    public static vs9 m27067a() {
        return f105956a;
    }

    /* JADX INFO: renamed from: b */
    public static vs9 m27068b() {
        return f105957b;
    }

    private static vs9 loadSchemaForFullRuntime() {
        if (lhd.f57633d) {
            return null;
        }
        try {
            return (vs9) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
