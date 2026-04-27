package p000;

import java.util.HashMap;
import p000.cu2;
import p000.iu2;

/* JADX INFO: loaded from: classes.dex */
public class zp0 extends qj7 {

    /* JADX INFO: renamed from: G1 */
    public static final int f105636G1 = 0;

    /* JADX INFO: renamed from: H1 */
    public static final int f105637H1 = 1;

    /* JADX INFO: renamed from: I1 */
    public static final int f105638I1 = 2;

    /* JADX INFO: renamed from: J1 */
    public static final int f105639J1 = 3;

    /* JADX INFO: renamed from: K1 */
    public static final boolean f105640K1 = true;

    /* JADX INFO: renamed from: L1 */
    public static final boolean f105641L1 = false;

    /* JADX INFO: renamed from: C1 */
    public int f105642C1 = 0;

    /* JADX INFO: renamed from: D1 */
    public boolean f105643D1 = true;

    /* JADX INFO: renamed from: E1 */
    public int f105644E1 = 0;

    /* JADX INFO: renamed from: F1 */
    public boolean f105645F1 = false;

    public zp0() {
    }

    @Override // p000.iu2
    public void addToSolver(v69 v69Var, boolean z) {
        cu2[] cu2VarArr;
        boolean z2;
        int i;
        int i2;
        int i3;
        cu2[] cu2VarArr2 = this.f48372Y;
        cu2VarArr2[0] = this.f48360Q;
        cu2VarArr2[2] = this.f48362R;
        cu2VarArr2[1] = this.f48364S;
        cu2VarArr2[3] = this.f48366T;
        int i4 = 0;
        while (true) {
            cu2VarArr = this.f48372Y;
            if (i4 >= cu2VarArr.length) {
                break;
            }
            cu2 cu2Var = cu2VarArr[i4];
            cu2Var.f27603i = v69Var.createObjectVariable(cu2Var);
            i4++;
        }
        int i5 = this.f105642C1;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        cu2 cu2Var2 = cu2VarArr[i5];
        if (!this.f105645F1) {
            allSolved();
        }
        if (this.f105645F1) {
            this.f105645F1 = false;
            int i6 = this.f105642C1;
            if (i6 == 0 || i6 == 1) {
                v69Var.addEquality(this.f48360Q.f27603i, this.f48389h0);
                v69Var.addEquality(this.f48364S.f27603i, this.f48389h0);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    v69Var.addEquality(this.f48362R.f27603i, this.f48391i0);
                    v69Var.addEquality(this.f48366T.f27603i, this.f48391i0);
                    return;
                }
                return;
            }
        }
        for (int i7 = 0; i7 < this.f74597B1; i7++) {
            iu2 iu2Var = this.f74596A1[i7];
            if ((this.f105643D1 || iu2Var.allowedInBarrier()) && ((((i2 = this.f105642C1) == 0 || i2 == 1) && iu2Var.getHorizontalDimensionBehaviour() == iu2.EnumC7619b.MATCH_CONSTRAINT && iu2Var.f48360Q.f27600f != null && iu2Var.f48364S.f27600f != null) || (((i3 = this.f105642C1) == 2 || i3 == 3) && iu2Var.getVerticalDimensionBehaviour() == iu2.EnumC7619b.MATCH_CONSTRAINT && iu2Var.f48362R.f27600f != null && iu2Var.f48366T.f27600f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.f48360Q.hasCenteredDependents() || this.f48364S.hasCenteredDependents();
        boolean z4 = this.f48362R.hasCenteredDependents() || this.f48366T.hasCenteredDependents();
        int i8 = !(!z2 && (((i = this.f105642C1) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        for (int i9 = 0; i9 < this.f74597B1; i9++) {
            iu2 iu2Var2 = this.f74596A1[i9];
            if (this.f105643D1 || iu2Var2.allowedInBarrier()) {
                dvf dvfVarCreateObjectVariable = v69Var.createObjectVariable(iu2Var2.f48372Y[this.f105642C1]);
                cu2[] cu2VarArr3 = iu2Var2.f48372Y;
                int i10 = this.f105642C1;
                cu2 cu2Var3 = cu2VarArr3[i10];
                cu2Var3.f27603i = dvfVarCreateObjectVariable;
                cu2 cu2Var4 = cu2Var3.f27600f;
                int i11 = (cu2Var4 == null || cu2Var4.f27598d != this) ? 0 : cu2Var3.f27601g;
                if (i10 == 0 || i10 == 2) {
                    v69Var.addLowerBarrier(cu2Var2.f27603i, dvfVarCreateObjectVariable, this.f105644E1 - i11, z2);
                } else {
                    v69Var.addGreaterBarrier(cu2Var2.f27603i, dvfVarCreateObjectVariable, this.f105644E1 + i11, z2);
                }
                v69Var.addEquality(cu2Var2.f27603i, dvfVarCreateObjectVariable, this.f105644E1 + i11, i8);
            }
        }
        int i12 = this.f105642C1;
        if (i12 == 0) {
            v69Var.addEquality(this.f48364S.f27603i, this.f48360Q.f27603i, 0, 8);
            v69Var.addEquality(this.f48360Q.f27603i, this.f48379c0.f48364S.f27603i, 0, 4);
            v69Var.addEquality(this.f48360Q.f27603i, this.f48379c0.f48360Q.f27603i, 0, 0);
            return;
        }
        if (i12 == 1) {
            v69Var.addEquality(this.f48360Q.f27603i, this.f48364S.f27603i, 0, 8);
            v69Var.addEquality(this.f48360Q.f27603i, this.f48379c0.f48360Q.f27603i, 0, 4);
            v69Var.addEquality(this.f48360Q.f27603i, this.f48379c0.f48364S.f27603i, 0, 0);
        } else if (i12 == 2) {
            v69Var.addEquality(this.f48366T.f27603i, this.f48362R.f27603i, 0, 8);
            v69Var.addEquality(this.f48362R.f27603i, this.f48379c0.f48366T.f27603i, 0, 4);
            v69Var.addEquality(this.f48362R.f27603i, this.f48379c0.f48362R.f27603i, 0, 0);
        } else if (i12 == 3) {
            v69Var.addEquality(this.f48362R.f27603i, this.f48366T.f27603i, 0, 8);
            v69Var.addEquality(this.f48362R.f27603i, this.f48379c0.f48362R.f27603i, 0, 4);
            v69Var.addEquality(this.f48362R.f27603i, this.f48379c0.f48366T.f27603i, 0, 0);
        }
    }

    public boolean allSolved() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f74597B1;
            if (i4 >= i) {
                break;
            }
            iu2 iu2Var = this.f74596A1[i4];
            if ((this.f105643D1 || iu2Var.allowedInBarrier()) && ((((i2 = this.f105642C1) == 0 || i2 == 1) && !iu2Var.isResolvedHorizontally()) || (((i3 = this.f105642C1) == 2 || i3 == 3) && !iu2Var.isResolvedVertically()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f74597B1; i5++) {
            iu2 iu2Var2 = this.f74596A1[i5];
            if (this.f105643D1 || iu2Var2.allowedInBarrier()) {
                if (!z2) {
                    int i6 = this.f105642C1;
                    if (i6 == 0) {
                        iMax = iu2Var2.getAnchor(cu2.EnumC4503b.LEFT).getFinalValue();
                    } else if (i6 == 1) {
                        iMax = iu2Var2.getAnchor(cu2.EnumC4503b.RIGHT).getFinalValue();
                    } else if (i6 == 2) {
                        iMax = iu2Var2.getAnchor(cu2.EnumC4503b.TOP).getFinalValue();
                    } else if (i6 == 3) {
                        iMax = iu2Var2.getAnchor(cu2.EnumC4503b.BOTTOM).getFinalValue();
                    }
                    z2 = true;
                }
                int i7 = this.f105642C1;
                if (i7 == 0) {
                    iMax = Math.min(iMax, iu2Var2.getAnchor(cu2.EnumC4503b.LEFT).getFinalValue());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, iu2Var2.getAnchor(cu2.EnumC4503b.RIGHT).getFinalValue());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, iu2Var2.getAnchor(cu2.EnumC4503b.TOP).getFinalValue());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, iu2Var2.getAnchor(cu2.EnumC4503b.BOTTOM).getFinalValue());
                }
            }
        }
        int i8 = iMax + this.f105644E1;
        int i9 = this.f105642C1;
        if (i9 == 0 || i9 == 1) {
            setFinalHorizontal(i8, i8);
        } else {
            setFinalVertical(i8, i8);
        }
        this.f105645F1 = true;
        return true;
    }

    @Override // p000.iu2
    public boolean allowedInBarrier() {
        return true;
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.f105643D1;
    }

    @Override // p000.qj7, p000.iu2
    public void copy(iu2 iu2Var, HashMap<iu2, iu2> map) {
        super.copy(iu2Var, map);
        zp0 zp0Var = (zp0) iu2Var;
        this.f105642C1 = zp0Var.f105642C1;
        this.f105643D1 = zp0Var.f105643D1;
        this.f105644E1 = zp0Var.f105644E1;
    }

    /* JADX INFO: renamed from: g */
    public void m26931g() {
        for (int i = 0; i < this.f74597B1; i++) {
            iu2 iu2Var = this.f74596A1[i];
            if (this.f105643D1 || iu2Var.allowedInBarrier()) {
                int i2 = this.f105642C1;
                if (i2 == 0 || i2 == 1) {
                    iu2Var.m13424e(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    iu2Var.m13424e(1, true);
                }
            }
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f105643D1;
    }

    public int getBarrierType() {
        return this.f105642C1;
    }

    public int getMargin() {
        return this.f105644E1;
    }

    public int getOrientation() {
        int i = this.f105642C1;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // p000.iu2
    public boolean isResolvedHorizontally() {
        return this.f105645F1;
    }

    @Override // p000.iu2
    public boolean isResolvedVertically() {
        return this.f105645F1;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f105643D1 = z;
    }

    public void setBarrierType(int i) {
        this.f105642C1 = i;
    }

    public void setMargin(int i) {
        this.f105644E1 = i;
    }

    @Override // p000.iu2
    public String toString() {
        String str = "[Barrier] " + getDebugName() + " {";
        for (int i = 0; i < this.f74597B1; i++) {
            iu2 iu2Var = this.f74596A1[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + iu2Var.getDebugName();
        }
        return str + "}";
    }

    public zp0(String str) {
        setDebugName(str);
    }
}
