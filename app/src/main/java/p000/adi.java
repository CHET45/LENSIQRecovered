package p000;

import java.util.HashSet;
import p000.iu2;
import p000.yv0;

/* JADX INFO: loaded from: classes.dex */
public class adi extends qj7 {

    /* JADX INFO: renamed from: C1 */
    public int f1174C1 = 0;

    /* JADX INFO: renamed from: D1 */
    public int f1175D1 = 0;

    /* JADX INFO: renamed from: E1 */
    public int f1176E1 = 0;

    /* JADX INFO: renamed from: F1 */
    public int f1177F1 = 0;

    /* JADX INFO: renamed from: G1 */
    public int f1178G1 = 0;

    /* JADX INFO: renamed from: H1 */
    public int f1179H1 = 0;

    /* JADX INFO: renamed from: I1 */
    public int f1180I1 = 0;

    /* JADX INFO: renamed from: J1 */
    public int f1181J1 = 0;

    /* JADX INFO: renamed from: K1 */
    public boolean f1182K1 = false;

    /* JADX INFO: renamed from: L1 */
    public int f1183L1 = 0;

    /* JADX INFO: renamed from: M1 */
    public int f1184M1 = 0;

    /* JADX INFO: renamed from: N1 */
    public yv0.C15817a f1185N1 = new yv0.C15817a();

    /* JADX INFO: renamed from: O1 */
    public yv0.InterfaceC15818b f1186O1 = null;

    public void applyRtl(boolean z) {
        int i = this.f1178G1;
        if (i > 0 || this.f1179H1 > 0) {
            if (z) {
                this.f1180I1 = this.f1179H1;
                this.f1181J1 = i;
            } else {
                this.f1180I1 = i;
                this.f1181J1 = this.f1179H1;
            }
        }
    }

    public void captureWidgets() {
        for (int i = 0; i < this.f74597B1; i++) {
            iu2 iu2Var = this.f74596A1[i];
            if (iu2Var != null) {
                iu2Var.setInVirtualLayout(true);
            }
        }
    }

    public boolean contains(HashSet<iu2> hashSet) {
        for (int i = 0; i < this.f74597B1; i++) {
            if (hashSet.contains(this.f74596A1[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m432g(iu2 iu2Var, iu2.EnumC7619b enumC7619b, int i, iu2.EnumC7619b enumC7619b2, int i2) {
        while (this.f1186O1 == null && getParent() != null) {
            this.f1186O1 = ((ju2) getParent()).getMeasurer();
        }
        yv0.C15817a c15817a = this.f1185N1;
        c15817a.f103047a = enumC7619b;
        c15817a.f103048b = enumC7619b2;
        c15817a.f103049c = i;
        c15817a.f103050d = i2;
        this.f1186O1.measure(iu2Var, c15817a);
        iu2Var.setWidth(this.f1185N1.f103051e);
        iu2Var.setHeight(this.f1185N1.f103052f);
        iu2Var.setHasBaseline(this.f1185N1.f103054h);
        iu2Var.setBaselineDistance(this.f1185N1.f103053g);
    }

    public int getMeasuredHeight() {
        return this.f1184M1;
    }

    public int getMeasuredWidth() {
        return this.f1183L1;
    }

    public int getPaddingBottom() {
        return this.f1175D1;
    }

    public int getPaddingLeft() {
        return this.f1180I1;
    }

    public int getPaddingRight() {
        return this.f1181J1;
    }

    public int getPaddingTop() {
        return this.f1174C1;
    }

    /* JADX INFO: renamed from: h */
    public boolean m433h() {
        iu2 iu2Var = this.f48379c0;
        yv0.InterfaceC15818b measurer = iu2Var != null ? ((ju2) iu2Var).getMeasurer() : null;
        if (measurer == null) {
            return false;
        }
        for (int i = 0; i < this.f74597B1; i++) {
            iu2 iu2Var2 = this.f74596A1[i];
            if (iu2Var2 != null && !(iu2Var2 instanceof dd7)) {
                iu2.EnumC7619b dimensionBehaviour = iu2Var2.getDimensionBehaviour(0);
                iu2.EnumC7619b dimensionBehaviour2 = iu2Var2.getDimensionBehaviour(1);
                iu2.EnumC7619b enumC7619b = iu2.EnumC7619b.MATCH_CONSTRAINT;
                if (dimensionBehaviour != enumC7619b || iu2Var2.f48418w == 1 || dimensionBehaviour2 != enumC7619b || iu2Var2.f48420x == 1) {
                    if (dimensionBehaviour == enumC7619b) {
                        dimensionBehaviour = iu2.EnumC7619b.WRAP_CONTENT;
                    }
                    if (dimensionBehaviour2 == enumC7619b) {
                        dimensionBehaviour2 = iu2.EnumC7619b.WRAP_CONTENT;
                    }
                    yv0.C15817a c15817a = this.f1185N1;
                    c15817a.f103047a = dimensionBehaviour;
                    c15817a.f103048b = dimensionBehaviour2;
                    c15817a.f103049c = iu2Var2.getWidth();
                    this.f1185N1.f103050d = iu2Var2.getHeight();
                    measurer.measure(iu2Var2, this.f1185N1);
                    iu2Var2.setWidth(this.f1185N1.f103051e);
                    iu2Var2.setHeight(this.f1185N1.f103052f);
                    iu2Var2.setBaselineDistance(this.f1185N1.f103053g);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m434i(boolean z) {
        this.f1182K1 = z;
    }

    public void measure(int i, int i2, int i3, int i4) {
    }

    public boolean needSolverPass() {
        return this.f1182K1;
    }

    public void setMeasure(int i, int i2) {
        this.f1183L1 = i;
        this.f1184M1 = i2;
    }

    public void setPadding(int i) {
        this.f1176E1 = i;
        this.f1174C1 = i;
        this.f1177F1 = i;
        this.f1175D1 = i;
        this.f1178G1 = i;
        this.f1179H1 = i;
    }

    public void setPaddingBottom(int i) {
        this.f1175D1 = i;
    }

    public void setPaddingEnd(int i) {
        this.f1179H1 = i;
    }

    public void setPaddingLeft(int i) {
        this.f1176E1 = i;
        this.f1180I1 = i;
    }

    public void setPaddingRight(int i) {
        this.f1177F1 = i;
        this.f1181J1 = i;
    }

    public void setPaddingStart(int i) {
        this.f1178G1 = i;
        this.f1180I1 = i;
        this.f1181J1 = i;
    }

    public void setPaddingTop(int i) {
        this.f1174C1 = i;
    }

    @Override // p000.qj7, p000.nj7
    public void updateConstraints(ju2 ju2Var) {
        captureWidgets();
    }
}
