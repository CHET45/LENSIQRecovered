package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class csi {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ v35 f27315C;

    /* JADX INFO: renamed from: c */
    public static final csi f27316c = new csi("OBJ", 0, '{', '}');

    /* JADX INFO: renamed from: d */
    public static final csi f27317d = new csi("LIST", 1, C4584d2.f28242k, C4584d2.f28243l);

    /* JADX INFO: renamed from: e */
    public static final csi f27318e = new csi("MAP", 2, '{', '}');

    /* JADX INFO: renamed from: f */
    public static final csi f27319f = new csi("POLY_OBJ", 3, C4584d2.f28242k, C4584d2.f28243l);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ csi[] f27320m;

    /* JADX INFO: renamed from: a */
    @un8
    public final char f27321a;

    /* JADX INFO: renamed from: b */
    @un8
    public final char f27322b;

    private static final /* synthetic */ csi[] $values() {
        return new csi[]{f27316c, f27317d, f27318e, f27319f};
    }

    static {
        csi[] csiVarArr$values = $values();
        f27320m = csiVarArr$values;
        f27315C = x35.enumEntries(csiVarArr$values);
    }

    private csi(String str, int i, char c, char c2) {
        this.f27321a = c;
        this.f27322b = c2;
    }

    @yfb
    public static v35<csi> getEntries() {
        return f27315C;
    }

    public static csi valueOf(String str) {
        return (csi) Enum.valueOf(csi.class, str);
    }

    public static csi[] values() {
        return (csi[]) f27320m.clone();
    }
}
