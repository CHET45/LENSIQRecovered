package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ov1 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C10662a f68865c;

    /* JADX INFO: renamed from: n2 */
    public static final /* synthetic */ ov1[] f68881n2;

    /* JADX INFO: renamed from: o2 */
    public static final /* synthetic */ v35 f68882o2;

    /* JADX INFO: renamed from: a */
    public final int f68883a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f68884b;

    /* JADX INFO: renamed from: d */
    public static final ov1 f68867d = new ov1("UNASSIGNED", 0, 0, "Cn");

    /* JADX INFO: renamed from: e */
    public static final ov1 f68869e = new ov1("UPPERCASE_LETTER", 1, 1, "Lu");

    /* JADX INFO: renamed from: f */
    public static final ov1 f68871f = new ov1("LOWERCASE_LETTER", 2, 2, "Ll");

    /* JADX INFO: renamed from: m */
    public static final ov1 f68879m = new ov1("TITLECASE_LETTER", 3, 3, "Lt");

    /* JADX INFO: renamed from: C */
    public static final ov1 f68850C = new ov1("MODIFIER_LETTER", 4, 4, "Lm");

    /* JADX INFO: renamed from: F */
    public static final ov1 f68851F = new ov1("OTHER_LETTER", 5, 5, "Lo");

    /* JADX INFO: renamed from: H */
    public static final ov1 f68852H = new ov1("NON_SPACING_MARK", 6, 6, "Mn");

    /* JADX INFO: renamed from: L */
    public static final ov1 f68853L = new ov1("ENCLOSING_MARK", 7, 7, "Me");

    /* JADX INFO: renamed from: M */
    public static final ov1 f68854M = new ov1("COMBINING_SPACING_MARK", 8, 8, "Mc");

    /* JADX INFO: renamed from: N */
    public static final ov1 f68856N = new ov1("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");

    /* JADX INFO: renamed from: Q */
    public static final ov1 f68857Q = new ov1("LETTER_NUMBER", 10, 10, "Nl");

    /* JADX INFO: renamed from: X */
    public static final ov1 f68859X = new ov1("OTHER_NUMBER", 11, 11, "No");

    /* JADX INFO: renamed from: Y */
    public static final ov1 f68860Y = new ov1("SPACE_SEPARATOR", 12, 12, "Zs");

    /* JADX INFO: renamed from: Z */
    public static final ov1 f68861Z = new ov1("LINE_SEPARATOR", 13, 13, "Zl");

    /* JADX INFO: renamed from: M1 */
    public static final ov1 f68855M1 = new ov1("PARAGRAPH_SEPARATOR", 14, 14, "Zp");

    /* JADX INFO: renamed from: V1 */
    public static final ov1 f68858V1 = new ov1("CONTROL", 15, 15, "Cc");

    /* JADX INFO: renamed from: Z1 */
    public static final ov1 f68862Z1 = new ov1("FORMAT", 16, 16, "Cf");

    /* JADX INFO: renamed from: a2 */
    public static final ov1 f68863a2 = new ov1("PRIVATE_USE", 17, 18, "Co");

    /* JADX INFO: renamed from: b2 */
    public static final ov1 f68864b2 = new ov1("SURROGATE", 18, 19, "Cs");

    /* JADX INFO: renamed from: c2 */
    public static final ov1 f68866c2 = new ov1("DASH_PUNCTUATION", 19, 20, "Pd");

    /* JADX INFO: renamed from: d2 */
    public static final ov1 f68868d2 = new ov1("START_PUNCTUATION", 20, 21, "Ps");

    /* JADX INFO: renamed from: e2 */
    public static final ov1 f68870e2 = new ov1("END_PUNCTUATION", 21, 22, "Pe");

    /* JADX INFO: renamed from: f2 */
    public static final ov1 f68872f2 = new ov1("CONNECTOR_PUNCTUATION", 22, 23, "Pc");

    /* JADX INFO: renamed from: g2 */
    public static final ov1 f68873g2 = new ov1("OTHER_PUNCTUATION", 23, 24, "Po");

    /* JADX INFO: renamed from: h2 */
    public static final ov1 f68874h2 = new ov1("MATH_SYMBOL", 24, 25, "Sm");

    /* JADX INFO: renamed from: i2 */
    public static final ov1 f68875i2 = new ov1("CURRENCY_SYMBOL", 25, 26, "Sc");

    /* JADX INFO: renamed from: j2 */
    public static final ov1 f68876j2 = new ov1("MODIFIER_SYMBOL", 26, 27, "Sk");

    /* JADX INFO: renamed from: k2 */
    public static final ov1 f68877k2 = new ov1("OTHER_SYMBOL", 27, 28, "So");

    /* JADX INFO: renamed from: l2 */
    public static final ov1 f68878l2 = new ov1("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");

    /* JADX INFO: renamed from: m2 */
    public static final ov1 f68880m2 = new ov1("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");

    /* JADX INFO: renamed from: ov1$a */
    public static final class C10662a {
        public /* synthetic */ C10662a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final ov1 valueOf(int i) {
            if (i >= 0 && i < 17) {
                return ov1.getEntries().get(i);
            }
            if (18 <= i && i < 31) {
                return ov1.getEntries().get(i - 1);
            }
            throw new IllegalArgumentException("Category #" + i + " is not defined.");
        }

        private C10662a() {
        }
    }

    private static final /* synthetic */ ov1[] $values() {
        return new ov1[]{f68867d, f68869e, f68871f, f68879m, f68850C, f68851F, f68852H, f68853L, f68854M, f68856N, f68857Q, f68859X, f68860Y, f68861Z, f68855M1, f68858V1, f68862Z1, f68863a2, f68864b2, f68866c2, f68868d2, f68870e2, f68872f2, f68873g2, f68874h2, f68875i2, f68876j2, f68877k2, f68878l2, f68880m2};
    }

    static {
        ov1[] ov1VarArr$values = $values();
        f68881n2 = ov1VarArr$values;
        f68882o2 = x35.enumEntries(ov1VarArr$values);
        f68865c = new C10662a(null);
    }

    private ov1(String str, int i, int i2, String str2) {
        this.f68883a = i2;
        this.f68884b = str2;
    }

    @yfb
    public static v35<ov1> getEntries() {
        return f68882o2;
    }

    public static ov1 valueOf(String str) {
        return (ov1) Enum.valueOf(ov1.class, str);
    }

    public static ov1[] values() {
        return (ov1[]) f68881n2.clone();
    }

    public final boolean contains(char c) {
        return Character.getType(c) == this.f68883a;
    }

    @yfb
    public final String getCode() {
        return this.f68884b;
    }

    public final int getValue() {
        return this.f68883a;
    }
}
