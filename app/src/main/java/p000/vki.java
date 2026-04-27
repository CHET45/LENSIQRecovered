package p000;

import com.blankj.utilcode.util.C2473f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000.iu2;

/* JADX INFO: loaded from: classes.dex */
public class vki {

    /* JADX INFO: renamed from: g */
    public static final boolean f91535g = false;

    /* JADX INFO: renamed from: h */
    public static int f91536h;

    /* JADX INFO: renamed from: b */
    public int f91538b;

    /* JADX INFO: renamed from: d */
    public int f91540d;

    /* JADX INFO: renamed from: a */
    public ArrayList<iu2> f91537a = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public boolean f91539c = false;

    /* JADX INFO: renamed from: e */
    public ArrayList<C14146a> f91541e = null;

    /* JADX INFO: renamed from: f */
    public int f91542f = -1;

    /* JADX INFO: renamed from: vki$a */
    public class C14146a {

        /* JADX INFO: renamed from: a */
        public WeakReference<iu2> f91543a;

        /* JADX INFO: renamed from: b */
        public int f91544b;

        /* JADX INFO: renamed from: c */
        public int f91545c;

        /* JADX INFO: renamed from: d */
        public int f91546d;

        /* JADX INFO: renamed from: e */
        public int f91547e;

        /* JADX INFO: renamed from: f */
        public int f91548f;

        /* JADX INFO: renamed from: g */
        public int f91549g;

        public C14146a(iu2 iu2Var, v69 v69Var, int i) {
            this.f91543a = new WeakReference<>(iu2Var);
            this.f91544b = v69Var.getObjectVariableValue(iu2Var.f48360Q);
            this.f91545c = v69Var.getObjectVariableValue(iu2Var.f48362R);
            this.f91546d = v69Var.getObjectVariableValue(iu2Var.f48364S);
            this.f91547e = v69Var.getObjectVariableValue(iu2Var.f48366T);
            this.f91548f = v69Var.getObjectVariableValue(iu2Var.f48368U);
            this.f91549g = i;
        }

        public void apply() {
            iu2 iu2Var = this.f91543a.get();
            if (iu2Var != null) {
                iu2Var.setFinalFrame(this.f91544b, this.f91545c, this.f91546d, this.f91547e, this.f91548f, this.f91549g);
            }
        }
    }

    public vki(int i) {
        int i2 = f91536h;
        f91536h = i2 + 1;
        this.f91538b = i2;
        this.f91540d = i;
    }

    private boolean contains(iu2 iu2Var) {
        return this.f91537a.contains(iu2Var);
    }

    private String getOrientationString() {
        int i = this.f91540d;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    private int measureWrap(int i, iu2 iu2Var) {
        iu2.EnumC7619b dimensionBehaviour = iu2Var.getDimensionBehaviour(i);
        if (dimensionBehaviour == iu2.EnumC7619b.WRAP_CONTENT || dimensionBehaviour == iu2.EnumC7619b.MATCH_PARENT || dimensionBehaviour == iu2.EnumC7619b.FIXED) {
            return i == 0 ? iu2Var.getWidth() : iu2Var.getHeight();
        }
        return -1;
    }

    private int solverMeasure(v69 v69Var, ArrayList<iu2> arrayList, int i) {
        int objectVariableValue;
        int objectVariableValue2;
        ju2 ju2Var = (ju2) arrayList.get(0).getParent();
        v69Var.reset();
        ju2Var.addToSolver(v69Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).addToSolver(v69Var, false);
        }
        if (i == 0 && ju2Var.f51848M1 > 0) {
            qt1.applyChainConstraints(ju2Var, v69Var, arrayList, 0);
        }
        if (i == 1 && ju2Var.f51849N1 > 0) {
            qt1.applyChainConstraints(ju2Var, v69Var, arrayList, 1);
        }
        try {
            v69Var.minimize();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f91541e = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f91541e.add(new C14146a(arrayList.get(i3), v69Var, i));
        }
        if (i == 0) {
            objectVariableValue = v69Var.getObjectVariableValue(ju2Var.f48360Q);
            objectVariableValue2 = v69Var.getObjectVariableValue(ju2Var.f48364S);
            v69Var.reset();
        } else {
            objectVariableValue = v69Var.getObjectVariableValue(ju2Var.f48362R);
            objectVariableValue2 = v69Var.getObjectVariableValue(ju2Var.f48366T);
            v69Var.reset();
        }
        return objectVariableValue2 - objectVariableValue;
    }

    public boolean add(iu2 iu2Var) {
        if (this.f91537a.contains(iu2Var)) {
            return false;
        }
        this.f91537a.add(iu2Var);
        return true;
    }

    public void apply() {
        if (this.f91541e != null && this.f91539c) {
            for (int i = 0; i < this.f91541e.size(); i++) {
                this.f91541e.get(i).apply();
            }
        }
    }

    public void cleanup(ArrayList<vki> arrayList) {
        int size = this.f91537a.size();
        if (this.f91542f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                vki vkiVar = arrayList.get(i);
                if (this.f91542f == vkiVar.f91538b) {
                    moveTo(this.f91540d, vkiVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void clear() {
        this.f91537a.clear();
    }

    public int getId() {
        return this.f91538b;
    }

    public int getOrientation() {
        return this.f91540d;
    }

    public boolean intersectWith(vki vkiVar) {
        for (int i = 0; i < this.f91537a.size(); i++) {
            if (vkiVar.contains(this.f91537a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean isAuthoritative() {
        return this.f91539c;
    }

    public void moveTo(int i, vki vkiVar) {
        for (iu2 iu2Var : this.f91537a) {
            vkiVar.add(iu2Var);
            if (i == 0) {
                iu2Var.f48365S0 = vkiVar.getId();
            } else {
                iu2Var.f48367T0 = vkiVar.getId();
            }
        }
        this.f91542f = vkiVar.f91538b;
    }

    public void setAuthoritative(boolean z) {
        this.f91539c = z;
    }

    public void setOrientation(int i) {
        this.f91540d = i;
    }

    public int size() {
        return this.f91537a.size();
    }

    public String toString() {
        String str = getOrientationString() + " [" + this.f91538b + "] <";
        Iterator<iu2> it = this.f91537a.iterator();
        while (it.hasNext()) {
            str = str + C2473f.f17566z + it.next().getDebugName();
        }
        return str + " >";
    }

    public int measureWrap(v69 v69Var, int i) {
        if (this.f91537a.size() == 0) {
            return 0;
        }
        return solverMeasure(v69Var, this.f91537a, i);
    }
}
