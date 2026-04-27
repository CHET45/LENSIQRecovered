package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class tki extends iu2 {

    /* JADX INFO: renamed from: A1 */
    public ArrayList<iu2> f85148A1;

    public tki() {
        this.f85148A1 = new ArrayList<>();
    }

    public void add(iu2 iu2Var) {
        this.f85148A1.add(iu2Var);
        if (iu2Var.getParent() != null) {
            ((tki) iu2Var.getParent()).remove(iu2Var);
        }
        iu2Var.setParent(this);
    }

    public ArrayList<iu2> getChildren() {
        return this.f85148A1;
    }

    public ju2 getRootConstraintContainer() {
        iu2 parent = getParent();
        ju2 ju2Var = this instanceof ju2 ? (ju2) this : null;
        while (parent != null) {
            iu2 parent2 = parent.getParent();
            if (parent instanceof ju2) {
                ju2Var = (ju2) parent;
            }
            parent = parent2;
        }
        return ju2Var;
    }

    public void layout() {
        ArrayList<iu2> arrayList = this.f85148A1;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            iu2 iu2Var = this.f85148A1.get(i);
            if (iu2Var instanceof tki) {
                ((tki) iu2Var).layout();
            }
        }
    }

    public void remove(iu2 iu2Var) {
        this.f85148A1.remove(iu2Var);
        iu2Var.reset();
    }

    public void removeAllChildren() {
        this.f85148A1.clear();
    }

    @Override // p000.iu2
    public void reset() {
        this.f85148A1.clear();
        super.reset();
    }

    @Override // p000.iu2
    public void resetSolverVariables(fl1 fl1Var) {
        super.resetSolverVariables(fl1Var);
        int size = this.f85148A1.size();
        for (int i = 0; i < size; i++) {
            this.f85148A1.get(i).resetSolverVariables(fl1Var);
        }
    }

    @Override // p000.iu2
    public void setOffset(int i, int i2) {
        super.setOffset(i, i2);
        int size = this.f85148A1.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f85148A1.get(i3).setOffset(m13422c(), m13423d());
        }
    }

    public tki(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.f85148A1 = new ArrayList<>();
    }

    public tki(int i, int i2) {
        super(i, i2);
        this.f85148A1 = new ArrayList<>();
    }

    public void add(iu2... iu2VarArr) {
        for (iu2 iu2Var : iu2VarArr) {
            add(iu2Var);
        }
    }
}
