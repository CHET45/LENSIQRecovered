package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class uwd implements g36 {

    /* JADX INFO: renamed from: C */
    public static final uwd f89282C;

    /* JADX INFO: renamed from: F */
    public static final uwd f89283F;

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ uwd[] f89284H;

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ v35 f89285L;

    /* JADX INFO: renamed from: c */
    public static final uwd f89286c;

    /* JADX INFO: renamed from: d */
    public static final uwd f89287d;

    /* JADX INFO: renamed from: e */
    public static final uwd f89288e;

    /* JADX INFO: renamed from: f */
    public static final uwd f89289f;

    /* JADX INFO: renamed from: m */
    public static final uwd f89290m;

    /* JADX INFO: renamed from: a */
    public final int f89291a;

    /* JADX INFO: renamed from: b */
    public final int f89292b;

    private static final /* synthetic */ uwd[] $values() {
        return new uwd[]{f89286c, f89287d, f89288e, f89289f, f89290m, f89282C, f89283F};
    }

    static {
        int i = 2;
        f89286c = new uwd("IGNORE_CASE", 0, i, 0, 2, null);
        int i2 = 2;
        jt3 jt3Var = null;
        int i3 = 0;
        f89287d = new uwd("MULTILINE", 1, 8, i3, i2, jt3Var);
        int i4 = 2;
        jt3 jt3Var2 = null;
        int i5 = 0;
        f89288e = new uwd("LITERAL", i, 16, i5, i4, jt3Var2);
        f89289f = new uwd("UNIX_LINES", 3, 1, i3, i2, jt3Var);
        f89290m = new uwd("COMMENTS", 4, 4, i5, i4, jt3Var2);
        f89282C = new uwd("DOT_MATCHES_ALL", 5, 32, i3, i2, jt3Var);
        f89283F = new uwd("CANON_EQ", 6, 128, i5, i4, jt3Var2);
        uwd[] uwdVarArr$values = $values();
        f89284H = uwdVarArr$values;
        f89285L = x35.enumEntries(uwdVarArr$values);
    }

    private uwd(String str, int i, int i2, int i3) {
        this.f89291a = i2;
        this.f89292b = i3;
    }

    @yfb
    public static v35<uwd> getEntries() {
        return f89285L;
    }

    public static uwd valueOf(String str) {
        return (uwd) Enum.valueOf(uwd.class, str);
    }

    public static uwd[] values() {
        return (uwd[]) f89284H.clone();
    }

    @Override // p000.g36
    public int getMask() {
        return this.f89292b;
    }

    @Override // p000.g36
    public int getValue() {
        return this.f89291a;
    }

    public /* synthetic */ uwd(String str, int i, int i2, int i3, int i4, jt3 jt3Var) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3);
    }
}
