package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: rz */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC12373rz {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ EnumC12373rz[] f80137Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ v35 f80138Z;

    /* JADX INFO: renamed from: a */
    public static final EnumC12373rz f80139a = new EnumC12373rz("CLASS", 0);

    /* JADX INFO: renamed from: b */
    public static final EnumC12373rz f80140b = new EnumC12373rz("ANNOTATION_CLASS", 1);

    /* JADX INFO: renamed from: c */
    public static final EnumC12373rz f80141c = new EnumC12373rz("TYPE_PARAMETER", 2);

    /* JADX INFO: renamed from: d */
    public static final EnumC12373rz f80142d = new EnumC12373rz("PROPERTY", 3);

    /* JADX INFO: renamed from: e */
    public static final EnumC12373rz f80143e = new EnumC12373rz("FIELD", 4);

    /* JADX INFO: renamed from: f */
    public static final EnumC12373rz f80144f = new EnumC12373rz("LOCAL_VARIABLE", 5);

    /* JADX INFO: renamed from: m */
    public static final EnumC12373rz f80145m = new EnumC12373rz("VALUE_PARAMETER", 6);

    /* JADX INFO: renamed from: C */
    public static final EnumC12373rz f80129C = new EnumC12373rz("CONSTRUCTOR", 7);

    /* JADX INFO: renamed from: F */
    public static final EnumC12373rz f80130F = new EnumC12373rz("FUNCTION", 8);

    /* JADX INFO: renamed from: H */
    public static final EnumC12373rz f80131H = new EnumC12373rz("PROPERTY_GETTER", 9);

    /* JADX INFO: renamed from: L */
    public static final EnumC12373rz f80132L = new EnumC12373rz("PROPERTY_SETTER", 10);

    /* JADX INFO: renamed from: M */
    public static final EnumC12373rz f80133M = new EnumC12373rz("TYPE", 11);

    /* JADX INFO: renamed from: N */
    public static final EnumC12373rz f80134N = new EnumC12373rz("EXPRESSION", 12);

    /* JADX INFO: renamed from: Q */
    public static final EnumC12373rz f80135Q = new EnumC12373rz("FILE", 13);

    /* JADX INFO: renamed from: X */
    @jjf(version = "1.1")
    public static final EnumC12373rz f80136X = new EnumC12373rz("TYPEALIAS", 14);

    private static final /* synthetic */ EnumC12373rz[] $values() {
        return new EnumC12373rz[]{f80139a, f80140b, f80141c, f80142d, f80143e, f80144f, f80145m, f80129C, f80130F, f80131H, f80132L, f80133M, f80134N, f80135Q, f80136X};
    }

    static {
        EnumC12373rz[] enumC12373rzArr$values = $values();
        f80137Y = enumC12373rzArr$values;
        f80138Z = x35.enumEntries(enumC12373rzArr$values);
    }

    private EnumC12373rz(String str, int i) {
    }

    @yfb
    public static v35<EnumC12373rz> getEntries() {
        return f80138Z;
    }

    public static EnumC12373rz valueOf(String str) {
        return (EnumC12373rz) Enum.valueOf(EnumC12373rz.class, str);
    }

    public static EnumC12373rz[] values() {
        return (EnumC12373rz[]) f80137Y.clone();
    }
}
