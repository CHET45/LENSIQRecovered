package p000;

import java.util.HashMap;
import p000.cu2;
import p000.iu2;

/* JADX INFO: loaded from: classes.dex */
public class dd7 extends iu2 {

    /* JADX INFO: renamed from: I1 */
    public static final int f29399I1 = 0;

    /* JADX INFO: renamed from: J1 */
    public static final int f29400J1 = 1;

    /* JADX INFO: renamed from: K1 */
    public static final int f29401K1 = 0;

    /* JADX INFO: renamed from: L1 */
    public static final int f29402L1 = 1;

    /* JADX INFO: renamed from: M1 */
    public static final int f29403M1 = 2;

    /* JADX INFO: renamed from: N1 */
    public static final int f29404N1 = -1;

    /* JADX INFO: renamed from: A1 */
    public float f29405A1 = -1.0f;

    /* JADX INFO: renamed from: B1 */
    public int f29406B1 = -1;

    /* JADX INFO: renamed from: C1 */
    public int f29407C1 = -1;

    /* JADX INFO: renamed from: D1 */
    public boolean f29408D1 = true;

    /* JADX INFO: renamed from: E1 */
    public cu2 f29409E1 = this.f48362R;

    /* JADX INFO: renamed from: F1 */
    public int f29410F1 = 0;

    /* JADX INFO: renamed from: G1 */
    public int f29411G1 = 0;

    /* JADX INFO: renamed from: H1 */
    public boolean f29412H1;

    /* JADX INFO: renamed from: dd7$a */
    public static /* synthetic */ class C4749a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29413a;

        static {
            int[] iArr = new int[cu2.EnumC4503b.values().length];
            f29413a = iArr;
            try {
                iArr[cu2.EnumC4503b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29413a[cu2.EnumC4503b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29413a[cu2.EnumC4503b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29413a[cu2.EnumC4503b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29413a[cu2.EnumC4503b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29413a[cu2.EnumC4503b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29413a[cu2.EnumC4503b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29413a[cu2.EnumC4503b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29413a[cu2.EnumC4503b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public dd7() {
        this.f48373Z.clear();
        this.f48373Z.add(this.f29409E1);
        int length = this.f48372Y.length;
        for (int i = 0; i < length; i++) {
            this.f48372Y[i] = this.f29409E1;
        }
    }

    @Override // p000.iu2
    public void addToSolver(v69 v69Var, boolean z) {
        ju2 ju2Var = (ju2) getParent();
        if (ju2Var == null) {
            return;
        }
        cu2 anchor = ju2Var.getAnchor(cu2.EnumC4503b.LEFT);
        cu2 anchor2 = ju2Var.getAnchor(cu2.EnumC4503b.RIGHT);
        iu2 iu2Var = this.f48379c0;
        boolean z2 = iu2Var != null && iu2Var.f48377b0[0] == iu2.EnumC7619b.WRAP_CONTENT;
        if (this.f29410F1 == 0) {
            anchor = ju2Var.getAnchor(cu2.EnumC4503b.TOP);
            anchor2 = ju2Var.getAnchor(cu2.EnumC4503b.BOTTOM);
            iu2 iu2Var2 = this.f48379c0;
            z2 = iu2Var2 != null && iu2Var2.f48377b0[1] == iu2.EnumC7619b.WRAP_CONTENT;
        }
        if (this.f29412H1 && this.f29409E1.hasFinalValue()) {
            dvf dvfVarCreateObjectVariable = v69Var.createObjectVariable(this.f29409E1);
            v69Var.addEquality(dvfVarCreateObjectVariable, this.f29409E1.getFinalValue());
            if (this.f29406B1 != -1) {
                if (z2) {
                    v69Var.addGreaterThan(v69Var.createObjectVariable(anchor2), dvfVarCreateObjectVariable, 0, 5);
                }
            } else if (this.f29407C1 != -1 && z2) {
                dvf dvfVarCreateObjectVariable2 = v69Var.createObjectVariable(anchor2);
                v69Var.addGreaterThan(dvfVarCreateObjectVariable, v69Var.createObjectVariable(anchor), 0, 5);
                v69Var.addGreaterThan(dvfVarCreateObjectVariable2, dvfVarCreateObjectVariable, 0, 5);
            }
            this.f29412H1 = false;
            return;
        }
        if (this.f29406B1 != -1) {
            dvf dvfVarCreateObjectVariable3 = v69Var.createObjectVariable(this.f29409E1);
            v69Var.addEquality(dvfVarCreateObjectVariable3, v69Var.createObjectVariable(anchor), this.f29406B1, 8);
            if (z2) {
                v69Var.addGreaterThan(v69Var.createObjectVariable(anchor2), dvfVarCreateObjectVariable3, 0, 5);
                return;
            }
            return;
        }
        if (this.f29407C1 == -1) {
            if (this.f29405A1 != -1.0f) {
                v69Var.addConstraint(v69.createRowDimensionPercent(v69Var, v69Var.createObjectVariable(this.f29409E1), v69Var.createObjectVariable(anchor2), this.f29405A1));
                return;
            }
            return;
        }
        dvf dvfVarCreateObjectVariable4 = v69Var.createObjectVariable(this.f29409E1);
        dvf dvfVarCreateObjectVariable5 = v69Var.createObjectVariable(anchor2);
        v69Var.addEquality(dvfVarCreateObjectVariable4, dvfVarCreateObjectVariable5, -this.f29407C1, 8);
        if (z2) {
            v69Var.addGreaterThan(dvfVarCreateObjectVariable4, v69Var.createObjectVariable(anchor), 0, 5);
            v69Var.addGreaterThan(dvfVarCreateObjectVariable5, dvfVarCreateObjectVariable4, 0, 5);
        }
    }

    @Override // p000.iu2
    public boolean allowedInBarrier() {
        return true;
    }

    @Override // p000.iu2
    public void copy(iu2 iu2Var, HashMap<iu2, iu2> map) {
        super.copy(iu2Var, map);
        dd7 dd7Var = (dd7) iu2Var;
        this.f29405A1 = dd7Var.f29405A1;
        this.f29406B1 = dd7Var.f29406B1;
        this.f29407C1 = dd7Var.f29407C1;
        this.f29408D1 = dd7Var.f29408D1;
        setOrientation(dd7Var.f29410F1);
    }

    public void cyclePosition() {
        if (this.f29406B1 != -1) {
            m9085i();
        } else if (this.f29405A1 != -1.0f) {
            m9084h();
        } else if (this.f29407C1 != -1) {
            m9083g();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m9083g() {
        int x = getX();
        if (this.f29410F1 == 0) {
            x = getY();
        }
        setGuideBegin(x);
    }

    public cu2 getAnchor() {
        return this.f29409E1;
    }

    public int getOrientation() {
        return this.f29410F1;
    }

    public int getRelativeBegin() {
        return this.f29406B1;
    }

    public int getRelativeBehaviour() {
        if (this.f29405A1 != -1.0f) {
            return 0;
        }
        if (this.f29406B1 != -1) {
            return 1;
        }
        return this.f29407C1 != -1 ? 2 : -1;
    }

    public int getRelativeEnd() {
        return this.f29407C1;
    }

    public float getRelativePercent() {
        return this.f29405A1;
    }

    @Override // p000.iu2
    public String getType() {
        return "Guideline";
    }

    /* JADX INFO: renamed from: h */
    public void m9084h() {
        int width = getParent().getWidth() - getX();
        if (this.f29410F1 == 0) {
            width = getParent().getHeight() - getY();
        }
        setGuideEnd(width);
    }

    /* JADX INFO: renamed from: i */
    public void m9085i() {
        float x = getX() / getParent().getWidth();
        if (this.f29410F1 == 0) {
            x = getY() / getParent().getHeight();
        }
        setGuidePercent(x);
    }

    public boolean isPercent() {
        return this.f29405A1 != -1.0f && this.f29406B1 == -1 && this.f29407C1 == -1;
    }

    @Override // p000.iu2
    public boolean isResolvedHorizontally() {
        return this.f29412H1;
    }

    @Override // p000.iu2
    public boolean isResolvedVertically() {
        return this.f29412H1;
    }

    public void setFinalValue(int i) {
        this.f29409E1.setFinalValue(i);
        this.f29412H1 = true;
    }

    public void setGuideBegin(int i) {
        if (i > -1) {
            this.f29405A1 = -1.0f;
            this.f29406B1 = i;
            this.f29407C1 = -1;
        }
    }

    public void setGuideEnd(int i) {
        if (i > -1) {
            this.f29405A1 = -1.0f;
            this.f29406B1 = -1;
            this.f29407C1 = i;
        }
    }

    public void setGuidePercent(int i) {
        setGuidePercent(i / 100.0f);
    }

    public void setMinimumPosition(int i) {
        this.f29411G1 = i;
    }

    public void setOrientation(int i) {
        if (this.f29410F1 == i) {
            return;
        }
        this.f29410F1 = i;
        this.f48373Z.clear();
        if (this.f29410F1 == 1) {
            this.f29409E1 = this.f48360Q;
        } else {
            this.f29409E1 = this.f48362R;
        }
        this.f48373Z.add(this.f29409E1);
        int length = this.f48372Y.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f48372Y[i2] = this.f29409E1;
        }
    }

    @Override // p000.iu2
    public void updateFromSolver(v69 v69Var, boolean z) {
        if (getParent() == null) {
            return;
        }
        int objectVariableValue = v69Var.getObjectVariableValue(this.f29409E1);
        if (this.f29410F1 == 1) {
            setX(objectVariableValue);
            setY(0);
            setHeight(getParent().getHeight());
            setWidth(0);
            return;
        }
        setX(0);
        setY(objectVariableValue);
        setWidth(getParent().getWidth());
        setHeight(0);
    }

    @Override // p000.iu2
    public cu2 getAnchor(cu2.EnumC4503b enumC4503b) {
        int i = C4749a.f29413a[enumC4503b.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f29410F1 == 1) {
                return this.f29409E1;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.f29410F1 == 0) {
            return this.f29409E1;
        }
        return null;
    }

    public void setGuidePercent(float f) {
        if (f > -1.0f) {
            this.f29405A1 = f;
            this.f29406B1 = -1;
            this.f29407C1 = -1;
        }
    }
}
