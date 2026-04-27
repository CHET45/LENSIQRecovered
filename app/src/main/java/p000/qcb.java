package p000;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class qcb {

    /* JADX INFO: renamed from: a */
    public static final mcb f73970a = loadSchemaForFullRuntime();

    /* JADX INFO: renamed from: b */
    public static final mcb f73971b = new ocb();

    /* JADX INFO: renamed from: a */
    public static mcb m20259a() {
        return f73970a;
    }

    /* JADX INFO: renamed from: b */
    public static mcb m20260b() {
        return f73971b;
    }

    private static mcb loadSchemaForFullRuntime() {
        try {
            return (mcb) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
