package p000;

/* JADX INFO: loaded from: classes6.dex */
public class bd4 {

    /* JADX INFO: renamed from: c */
    public static final bd4 f13403c;

    /* JADX INFO: renamed from: d */
    public static final bd4 f13404d;

    /* JADX INFO: renamed from: e */
    public static final bd4 f13405e;

    /* JADX INFO: renamed from: f */
    public static final bd4 f13406f;

    /* JADX INFO: renamed from: g */
    public static final bd4 f13407g;

    /* JADX INFO: renamed from: h */
    public static final bd4 f13408h;

    /* JADX INFO: renamed from: i */
    public static final bd4 f13409i;

    /* JADX INFO: renamed from: j */
    public static final bd4 f13410j;

    /* JADX INFO: renamed from: k */
    public static final bd4 f13411k;

    /* JADX INFO: renamed from: l */
    public static final bd4 f13412l;

    /* JADX INFO: renamed from: m */
    public static final bd4 f13413m;

    /* JADX INFO: renamed from: n */
    public static final bd4 f13414n;

    /* JADX INFO: renamed from: o */
    public static final bd4[] f13415o;

    /* JADX INFO: renamed from: a */
    public final int f13416a;

    /* JADX INFO: renamed from: b */
    public final boolean f13417b;

    static {
        bd4 bd4Var = new bd4(0, false);
        f13403c = bd4Var;
        bd4 bd4Var2 = new bd4(1, true);
        f13404d = bd4Var2;
        bd4 bd4Var3 = new bd4(2, false);
        f13405e = bd4Var3;
        bd4 bd4Var4 = new bd4(3, true);
        f13406f = bd4Var4;
        bd4 bd4Var5 = new bd4(4, false);
        f13407g = bd4Var5;
        bd4 bd4Var6 = new bd4(5, true);
        f13408h = bd4Var6;
        bd4 bd4Var7 = new bd4(6, false);
        f13409i = bd4Var7;
        bd4 bd4Var8 = new bd4(7, true);
        f13410j = bd4Var8;
        bd4 bd4Var9 = new bd4(8, false);
        f13411k = bd4Var9;
        bd4 bd4Var10 = new bd4(9, true);
        f13412l = bd4Var10;
        bd4 bd4Var11 = new bd4(10, false);
        f13413m = bd4Var11;
        bd4 bd4Var12 = new bd4(10, true);
        f13414n = bd4Var12;
        f13415o = new bd4[]{bd4Var, bd4Var2, bd4Var3, bd4Var4, bd4Var5, bd4Var6, bd4Var7, bd4Var8, bd4Var9, bd4Var10, bd4Var11, bd4Var12};
    }

    private bd4(int i, boolean z) {
        this.f13416a = i;
        this.f13417b = z;
    }

    public boolean canReplaceWith(bd4 bd4Var) {
        int i = this.f13416a;
        int i2 = bd4Var.f13416a;
        return i < i2 || ((!this.f13417b || f13412l == this) && i == i2);
    }

    public bd4 notified() {
        return !this.f13417b ? f13415o[this.f13416a + 1] : this;
    }

    public bd4 unNotify() {
        if (!this.f13417b) {
            return this;
        }
        bd4 bd4Var = f13415o[this.f13416a - 1];
        return !bd4Var.f13417b ? bd4Var : f13403c;
    }
}
