package p000;

/* JADX INFO: loaded from: classes8.dex */
public class xc1 {

    /* JADX INFO: renamed from: a */
    public final zpg f97494a;

    /* JADX INFO: renamed from: b */
    public final int f97495b;

    /* JADX INFO: renamed from: c */
    public final boolean f97496c;

    /* JADX INFO: renamed from: d */
    public final xc1 f97497d;

    /* JADX INFO: renamed from: e */
    public final w54 f97498e;

    /* JADX INFO: renamed from: f */
    public boolean f97499f = true;

    /* JADX INFO: renamed from: g */
    public boolean f97500g = false;

    private xc1(zpg zpgVar, int i, xc1 xc1Var, w54 w54Var, boolean z) {
        this.f97494a = zpgVar;
        this.f97495b = i;
        this.f97496c = z;
        this.f97497d = xc1Var;
        this.f97498e = w54Var;
    }

    public static xc1 image(zpg zpgVar, int i, xc1 xc1Var, w54 w54Var) {
        return new xc1(zpgVar, i, xc1Var, w54Var, true);
    }

    public static xc1 link(zpg zpgVar, int i, xc1 xc1Var, w54 w54Var) {
        return new xc1(zpgVar, i, xc1Var, w54Var, false);
    }
}
