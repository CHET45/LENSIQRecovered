package p000;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class b99 {

    /* JADX INFO: renamed from: a */
    public static final z89 f13066a = loadSchemaForFullRuntime();

    /* JADX INFO: renamed from: b */
    public static final z89 f13067b = new a99();

    private b99() {
    }

    /* JADX INFO: renamed from: a */
    public static z89 m3002a() {
        return f13066a;
    }

    /* JADX INFO: renamed from: b */
    public static z89 m3003b() {
        return f13067b;
    }

    private static z89 loadSchemaForFullRuntime() {
        if (lhd.f57633d) {
            return null;
        }
        try {
            return (z89) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
