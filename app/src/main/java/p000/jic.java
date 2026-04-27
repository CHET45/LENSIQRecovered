package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@vb8
@e0g(parameters = 0)
@p7e({p7e.EnumC10826a.f69935b})
public final class jic {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C7912a f50671e = new C7912a(null);

    /* JADX INFO: renamed from: f */
    public static final int f50672f = 8;

    /* JADX INFO: renamed from: g */
    public static final int f50673g = 255;

    /* JADX INFO: renamed from: h */
    public static final int f50674h = 64;

    /* JADX INFO: renamed from: i */
    public static final int f50675i = -1;

    /* JADX INFO: renamed from: a */
    @yfb
    public String f50676a;

    /* JADX INFO: renamed from: b */
    @gib
    public j27 f50677b;

    /* JADX INFO: renamed from: c */
    public int f50678c = -1;

    /* JADX INFO: renamed from: d */
    public int f50679d = -1;

    /* JADX INFO: renamed from: jic$a */
    public static final class C7912a {
        public /* synthetic */ C7912a(jt3 jt3Var) {
            this();
        }

        private C7912a() {
        }
    }

    public jic(@yfb String str) {
        this.f50676a = str;
    }

    public final char get(int i) {
        j27 j27Var = this.f50677b;
        if (j27Var != null && i >= this.f50678c) {
            int length = j27Var.length();
            int i2 = this.f50678c;
            return i < length + i2 ? j27Var.get(i - i2) : this.f50676a.charAt(i - ((length - this.f50679d) + i2));
        }
        return this.f50676a.charAt(i);
    }

    public final int getLength() {
        j27 j27Var = this.f50677b;
        return j27Var == null ? this.f50676a.length() : (this.f50676a.length() - (this.f50679d - this.f50678c)) + j27Var.length();
    }

    @yfb
    public final String getText() {
        return this.f50676a;
    }

    public final void replace(int i, int i2, @yfb String str) {
        if (i > i2) {
            throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i + " > " + i2).toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(("start must be non-negative, but was " + i).toString());
        }
        j27 j27Var = this.f50677b;
        if (j27Var != null) {
            int i3 = this.f50678c;
            int i4 = i - i3;
            int i5 = i2 - i3;
            if (i4 >= 0 && i5 <= j27Var.length()) {
                j27Var.replace(i4, i5, str);
                return;
            }
            this.f50676a = toString();
            this.f50677b = null;
            this.f50678c = -1;
            this.f50679d = -1;
            replace(i, i2, str);
            return;
        }
        int iMax = Math.max(255, str.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i, 64);
        int iMin2 = Math.min(this.f50676a.length() - i2, 64);
        int i6 = i - iMin;
        m27.toCharArray(this.f50676a, cArr, 0, i6, i);
        int i7 = iMax - iMin2;
        int i8 = iMin2 + i2;
        m27.toCharArray(this.f50676a, cArr, i7, i2, i8);
        l27.toCharArray(str, cArr, iMin);
        this.f50677b = new j27(cArr, iMin + str.length(), i7);
        this.f50678c = i6;
        this.f50679d = i8;
    }

    public final void setText(@yfb String str) {
        this.f50676a = str;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @yfb
    public String toString() {
        j27 j27Var = this.f50677b;
        if (j27Var == null) {
            return this.f50676a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f50676a, 0, this.f50678c);
        j27Var.append(sb);
        String str = this.f50676a;
        sb.append((CharSequence) str, this.f50679d, str.length());
        return sb.toString();
    }
}
