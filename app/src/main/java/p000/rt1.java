package p000;

import java.util.ArrayList;
import p000.iu2;

/* JADX INFO: loaded from: classes.dex */
public class rt1 {

    /* JADX INFO: renamed from: a */
    public iu2 f79426a;

    /* JADX INFO: renamed from: b */
    public iu2 f79427b;

    /* JADX INFO: renamed from: c */
    public iu2 f79428c;

    /* JADX INFO: renamed from: d */
    public iu2 f79429d;

    /* JADX INFO: renamed from: e */
    public iu2 f79430e;

    /* JADX INFO: renamed from: f */
    public iu2 f79431f;

    /* JADX INFO: renamed from: g */
    public iu2 f79432g;

    /* JADX INFO: renamed from: h */
    public ArrayList<iu2> f79433h;

    /* JADX INFO: renamed from: i */
    public int f79434i;

    /* JADX INFO: renamed from: j */
    public int f79435j;

    /* JADX INFO: renamed from: k */
    public float f79436k = 0.0f;

    /* JADX INFO: renamed from: l */
    public int f79437l;

    /* JADX INFO: renamed from: m */
    public int f79438m;

    /* JADX INFO: renamed from: n */
    public int f79439n;

    /* JADX INFO: renamed from: o */
    public boolean f79440o;

    /* JADX INFO: renamed from: p */
    public int f79441p;

    /* JADX INFO: renamed from: q */
    public boolean f79442q;

    /* JADX INFO: renamed from: r */
    public boolean f79443r;

    /* JADX INFO: renamed from: s */
    public boolean f79444s;

    /* JADX INFO: renamed from: t */
    public boolean f79445t;

    /* JADX INFO: renamed from: u */
    public boolean f79446u;

    /* JADX INFO: renamed from: v */
    public boolean f79447v;

    public rt1(iu2 iu2Var, int i, boolean z) {
        this.f79426a = iu2Var;
        this.f79441p = i;
        this.f79442q = z;
    }

    private void defineChainProperties() {
        int i = this.f79441p * 2;
        iu2 iu2Var = this.f79426a;
        this.f79440o = true;
        iu2 iu2Var2 = iu2Var;
        boolean z = false;
        while (!z) {
            this.f79434i++;
            iu2[] iu2VarArr = iu2Var.f48359P0;
            int i2 = this.f79441p;
            iu2 iu2Var3 = null;
            iu2VarArr[i2] = null;
            iu2Var.f48357O0[i2] = null;
            if (iu2Var.getVisibility() != 8) {
                this.f79437l++;
                iu2.EnumC7619b dimensionBehaviour = iu2Var.getDimensionBehaviour(this.f79441p);
                iu2.EnumC7619b enumC7619b = iu2.EnumC7619b.MATCH_CONSTRAINT;
                if (dimensionBehaviour != enumC7619b) {
                    this.f79438m += iu2Var.getLength(this.f79441p);
                }
                int margin = this.f79438m + iu2Var.f48372Y[i].getMargin();
                this.f79438m = margin;
                int i3 = i + 1;
                this.f79438m = margin + iu2Var.f48372Y[i3].getMargin();
                int margin2 = this.f79439n + iu2Var.f48372Y[i].getMargin();
                this.f79439n = margin2;
                this.f79439n = margin2 + iu2Var.f48372Y[i3].getMargin();
                if (this.f79427b == null) {
                    this.f79427b = iu2Var;
                }
                this.f79429d = iu2Var;
                iu2.EnumC7619b[] enumC7619bArr = iu2Var.f48377b0;
                int i4 = this.f79441p;
                if (enumC7619bArr[i4] == enumC7619b) {
                    int i5 = iu2Var.f48422y[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.f79435j++;
                        float f = iu2Var.f48355N0[i4];
                        if (f > 0.0f) {
                            this.f79436k += f;
                        }
                        if (isMatchConstraintEqualityCandidate(iu2Var, i4)) {
                            if (f < 0.0f) {
                                this.f79443r = true;
                            } else {
                                this.f79444s = true;
                            }
                            if (this.f79433h == null) {
                                this.f79433h = new ArrayList<>();
                            }
                            this.f79433h.add(iu2Var);
                        }
                        if (this.f79431f == null) {
                            this.f79431f = iu2Var;
                        }
                        iu2 iu2Var4 = this.f79432g;
                        if (iu2Var4 != null) {
                            iu2Var4.f48357O0[this.f79441p] = iu2Var;
                        }
                        this.f79432g = iu2Var;
                    }
                    if (this.f79441p == 0) {
                        if (iu2Var.f48418w != 0 || iu2Var.f48424z != 0 || iu2Var.f48328A != 0) {
                            this.f79440o = false;
                        }
                    } else if (iu2Var.f48420x != 0 || iu2Var.f48332C != 0 || iu2Var.f48334D != 0) {
                        this.f79440o = false;
                    }
                    if (iu2Var.f48385f0 != 0.0f) {
                        this.f79440o = false;
                        this.f79446u = true;
                    }
                }
            }
            if (iu2Var2 != iu2Var) {
                iu2Var2.f48359P0[this.f79441p] = iu2Var;
            }
            cu2 cu2Var = iu2Var.f48372Y[i + 1].f27600f;
            if (cu2Var != null) {
                iu2 iu2Var5 = cu2Var.f27598d;
                cu2 cu2Var2 = iu2Var5.f48372Y[i].f27600f;
                if (cu2Var2 != null && cu2Var2.f27598d == iu2Var) {
                    iu2Var3 = iu2Var5;
                }
            }
            if (iu2Var3 == null) {
                iu2Var3 = iu2Var;
                z = true;
            }
            iu2Var2 = iu2Var;
            iu2Var = iu2Var3;
        }
        iu2 iu2Var6 = this.f79427b;
        if (iu2Var6 != null) {
            this.f79438m -= iu2Var6.f48372Y[i].getMargin();
        }
        iu2 iu2Var7 = this.f79429d;
        if (iu2Var7 != null) {
            this.f79438m -= iu2Var7.f48372Y[i + 1].getMargin();
        }
        this.f79428c = iu2Var;
        if (this.f79441p == 0 && this.f79442q) {
            this.f79430e = iu2Var;
        } else {
            this.f79430e = this.f79426a;
        }
        this.f79445t = this.f79444s && this.f79443r;
    }

    private static boolean isMatchConstraintEqualityCandidate(iu2 iu2Var, int i) {
        int i2;
        return iu2Var.getVisibility() != 8 && iu2Var.f48377b0[i] == iu2.EnumC7619b.MATCH_CONSTRAINT && ((i2 = iu2Var.f48422y[i]) == 0 || i2 == 3);
    }

    public void define() {
        if (!this.f79447v) {
            defineChainProperties();
        }
        this.f79447v = true;
    }

    public iu2 getFirst() {
        return this.f79426a;
    }

    public iu2 getFirstMatchConstraintWidget() {
        return this.f79431f;
    }

    public iu2 getFirstVisibleWidget() {
        return this.f79427b;
    }

    public iu2 getHead() {
        return this.f79430e;
    }

    public iu2 getLast() {
        return this.f79428c;
    }

    public iu2 getLastMatchConstraintWidget() {
        return this.f79432g;
    }

    public iu2 getLastVisibleWidget() {
        return this.f79429d;
    }

    public float getTotalWeight() {
        return this.f79436k;
    }
}
