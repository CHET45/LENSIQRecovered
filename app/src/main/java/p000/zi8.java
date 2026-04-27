package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class zi8 {

    /* JADX INFO: renamed from: C */
    public static final zi8 f105168C;

    /* JADX INFO: renamed from: F */
    public static final zi8 f105169F;

    /* JADX INFO: renamed from: H */
    public static final zi8 f105170H;

    /* JADX INFO: renamed from: L */
    public static final zi8 f105171L;

    /* JADX INFO: renamed from: M */
    public static final zi8 f105172M;

    /* JADX INFO: renamed from: N */
    public static final zi8 f105173N;

    /* JADX INFO: renamed from: Q */
    public static final /* synthetic */ zi8[] f105174Q;

    /* JADX INFO: renamed from: d */
    public static final zi8 f105175d;

    /* JADX INFO: renamed from: e */
    public static final zi8 f105176e;

    /* JADX INFO: renamed from: f */
    public static final zi8 f105177f;

    /* JADX INFO: renamed from: m */
    public static final zi8 f105178m;

    /* JADX INFO: renamed from: a */
    public final Class<?> f105179a;

    /* JADX INFO: renamed from: b */
    public final Class<?> f105180b;

    /* JADX INFO: renamed from: c */
    public final Object f105181c;

    static {
        zi8 zi8Var = new zi8("VOID", 0, Void.class, Void.class, null);
        f105175d = zi8Var;
        Class cls = Integer.TYPE;
        zi8 zi8Var2 = new zi8("INT", 1, cls, Integer.class, 0);
        f105176e = zi8Var2;
        zi8 zi8Var3 = new zi8("LONG", 2, Long.TYPE, Long.class, 0L);
        f105177f = zi8Var3;
        zi8 zi8Var4 = new zi8("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f105178m = zi8Var4;
        zi8 zi8Var5 = new zi8("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f105168C = zi8Var5;
        zi8 zi8Var6 = new zi8("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f105169F = zi8Var6;
        zi8 zi8Var7 = new zi8("STRING", 6, String.class, String.class, "");
        f105170H = zi8Var7;
        zi8 zi8Var8 = new zi8("BYTE_STRING", 7, vj1.class, vj1.class, vj1.f91344e);
        f105171L = zi8Var8;
        zi8 zi8Var9 = new zi8("ENUM", 8, cls, Integer.class, null);
        f105172M = zi8Var9;
        zi8 zi8Var10 = new zi8("MESSAGE", 9, Object.class, Object.class, null);
        f105173N = zi8Var10;
        f105174Q = new zi8[]{zi8Var, zi8Var2, zi8Var3, zi8Var4, zi8Var5, zi8Var6, zi8Var7, zi8Var8, zi8Var9, zi8Var10};
    }

    private zi8(String $enum$name, int $enum$ordinal, Class type, Class boxedType, Object defaultDefault) {
        this.f105179a = type;
        this.f105180b = boxedType;
        this.f105181c = defaultDefault;
    }

    public static zi8 valueOf(String name) {
        return (zi8) Enum.valueOf(zi8.class, name);
    }

    public static zi8[] values() {
        return (zi8[]) f105174Q.clone();
    }

    public Class<?> getBoxedType() {
        return this.f105180b;
    }

    public Object getDefaultDefault() {
        return this.f105181c;
    }

    public Class<?> getType() {
        return this.f105179a;
    }

    public boolean isValidType(Class<?> t) {
        return this.f105179a.isAssignableFrom(t);
    }
}
