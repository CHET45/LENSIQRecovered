package p000;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class rcb {

    /* JADX INFO: renamed from: a */
    public static final ncb f77826a = loadSchemaForFullRuntime();

    /* JADX INFO: renamed from: b */
    public static final ncb f77827b = new pcb();

    private rcb() {
    }

    /* JADX INFO: renamed from: a */
    public static ncb m21164a() {
        return f77826a;
    }

    /* JADX INFO: renamed from: b */
    public static ncb m21165b() {
        return f77827b;
    }

    private static ncb loadSchemaForFullRuntime() {
        if (lhd.f57633d) {
            return null;
        }
        try {
            return (ncb) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
