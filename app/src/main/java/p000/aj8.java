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
/* JADX INFO: loaded from: classes3.dex */
public final class aj8 {

    /* JADX INFO: renamed from: C */
    public static final aj8 f1745C;

    /* JADX INFO: renamed from: F */
    public static final aj8 f1746F;

    /* JADX INFO: renamed from: H */
    public static final aj8 f1747H;

    /* JADX INFO: renamed from: L */
    public static final aj8 f1748L;

    /* JADX INFO: renamed from: M */
    public static final aj8 f1749M;

    /* JADX INFO: renamed from: N */
    public static final aj8 f1750N;

    /* JADX INFO: renamed from: Q */
    public static final /* synthetic */ aj8[] f1751Q;

    /* JADX INFO: renamed from: d */
    public static final aj8 f1752d;

    /* JADX INFO: renamed from: e */
    public static final aj8 f1753e;

    /* JADX INFO: renamed from: f */
    public static final aj8 f1754f;

    /* JADX INFO: renamed from: m */
    public static final aj8 f1755m;

    /* JADX INFO: renamed from: a */
    public final Class<?> f1756a;

    /* JADX INFO: renamed from: b */
    public final Class<?> f1757b;

    /* JADX INFO: renamed from: c */
    public final Object f1758c;

    static {
        aj8 aj8Var = new aj8("VOID", 0, Void.class, Void.class, null);
        f1752d = aj8Var;
        Class cls = Integer.TYPE;
        aj8 aj8Var2 = new aj8("INT", 1, cls, Integer.class, 0);
        f1753e = aj8Var2;
        aj8 aj8Var3 = new aj8("LONG", 2, Long.TYPE, Long.class, 0L);
        f1754f = aj8Var3;
        aj8 aj8Var4 = new aj8("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f1755m = aj8Var4;
        aj8 aj8Var5 = new aj8("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f1745C = aj8Var5;
        aj8 aj8Var6 = new aj8("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f1746F = aj8Var6;
        aj8 aj8Var7 = new aj8("STRING", 6, String.class, String.class, "");
        f1747H = aj8Var7;
        aj8 aj8Var8 = new aj8("BYTE_STRING", 7, wj1.class, wj1.class, wj1.f94379e);
        f1748L = aj8Var8;
        aj8 aj8Var9 = new aj8("ENUM", 8, cls, Integer.class, null);
        f1749M = aj8Var9;
        aj8 aj8Var10 = new aj8("MESSAGE", 9, Object.class, Object.class, null);
        f1750N = aj8Var10;
        f1751Q = new aj8[]{aj8Var, aj8Var2, aj8Var3, aj8Var4, aj8Var5, aj8Var6, aj8Var7, aj8Var8, aj8Var9, aj8Var10};
    }

    private aj8(String $enum$name, int $enum$ordinal, Class type, Class boxedType, Object defaultDefault) {
        this.f1756a = type;
        this.f1757b = boxedType;
        this.f1758c = defaultDefault;
    }

    public static aj8 valueOf(String name) {
        return (aj8) Enum.valueOf(aj8.class, name);
    }

    public static aj8[] values() {
        return (aj8[]) f1751Q.clone();
    }

    public Class<?> getBoxedType() {
        return this.f1757b;
    }

    public Object getDefaultDefault() {
        return this.f1758c;
    }

    public Class<?> getType() {
        return this.f1756a;
    }

    public boolean isValidType(Class<?> t) {
        return this.f1756a.isAssignableFrom(t);
    }
}
