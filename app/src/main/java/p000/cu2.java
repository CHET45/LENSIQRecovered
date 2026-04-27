package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p000.dvf;

/* JADX INFO: loaded from: classes.dex */
public class cu2 {

    /* JADX INFO: renamed from: j */
    public static final boolean f27593j = false;

    /* JADX INFO: renamed from: k */
    public static final int f27594k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b */
    public int f27596b;

    /* JADX INFO: renamed from: c */
    public boolean f27597c;

    /* JADX INFO: renamed from: d */
    public final iu2 f27598d;

    /* JADX INFO: renamed from: e */
    public final EnumC4503b f27599e;

    /* JADX INFO: renamed from: f */
    public cu2 f27600f;

    /* JADX INFO: renamed from: i */
    public dvf f27603i;

    /* JADX INFO: renamed from: a */
    public HashSet<cu2> f27595a = null;

    /* JADX INFO: renamed from: g */
    public int f27601g = 0;

    /* JADX INFO: renamed from: h */
    public int f27602h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: cu2$a */
    public static /* synthetic */ class C4502a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27604a;

        static {
            int[] iArr = new int[EnumC4503b.values().length];
            f27604a = iArr;
            try {
                iArr[EnumC4503b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27604a[EnumC4503b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27604a[EnumC4503b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27604a[EnumC4503b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27604a[EnumC4503b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27604a[EnumC4503b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27604a[EnumC4503b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27604a[EnumC4503b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27604a[EnumC4503b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: cu2$b */
    public enum EnumC4503b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public cu2(iu2 iu2Var, EnumC4503b enumC4503b) {
        this.f27598d = iu2Var;
        this.f27599e = enumC4503b;
    }

    private boolean isConnectionToMe(iu2 iu2Var, HashSet<iu2> hashSet) {
        if (hashSet.contains(iu2Var)) {
            return false;
        }
        hashSet.add(iu2Var);
        if (iu2Var == getOwner()) {
            return true;
        }
        ArrayList<cu2> anchors = iu2Var.getAnchors();
        int size = anchors.size();
        for (int i = 0; i < size; i++) {
            cu2 cu2Var = anchors.get(i);
            if (cu2Var.isSimilarDimensionConnection(this) && cu2Var.isConnected() && isConnectionToMe(cu2Var.getTarget().getOwner(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public boolean connect(cu2 cu2Var, int i, int i2, boolean z) {
        if (cu2Var == null) {
            reset();
            return true;
        }
        if (!z && !isValidConnection(cu2Var)) {
            return false;
        }
        this.f27600f = cu2Var;
        if (cu2Var.f27595a == null) {
            cu2Var.f27595a = new HashSet<>();
        }
        HashSet<cu2> hashSet = this.f27600f.f27595a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f27601g = i;
        this.f27602h = i2;
        return true;
    }

    public void copyFrom(cu2 cu2Var, HashMap<iu2, iu2> map) {
        HashSet<cu2> hashSet;
        cu2 cu2Var2 = this.f27600f;
        if (cu2Var2 != null && (hashSet = cu2Var2.f27595a) != null) {
            hashSet.remove(this);
        }
        cu2 cu2Var3 = cu2Var.f27600f;
        if (cu2Var3 != null) {
            this.f27600f = map.get(cu2Var.f27600f.f27598d).getAnchor(cu2Var3.getType());
        } else {
            this.f27600f = null;
        }
        cu2 cu2Var4 = this.f27600f;
        if (cu2Var4 != null) {
            if (cu2Var4.f27595a == null) {
                cu2Var4.f27595a = new HashSet<>();
            }
            this.f27600f.f27595a.add(this);
        }
        this.f27601g = cu2Var.f27601g;
        this.f27602h = cu2Var.f27602h;
    }

    public void findDependents(int i, ArrayList<vki> arrayList, vki vkiVar) {
        HashSet<cu2> hashSet = this.f27595a;
        if (hashSet != null) {
            Iterator<cu2> it = hashSet.iterator();
            while (it.hasNext()) {
                xb7.findDependents(it.next().f27598d, i, arrayList, vkiVar);
            }
        }
    }

    public HashSet<cu2> getDependents() {
        return this.f27595a;
    }

    public int getFinalValue() {
        if (this.f27597c) {
            return this.f27596b;
        }
        return 0;
    }

    public int getMargin() {
        cu2 cu2Var;
        if (this.f27598d.getVisibility() == 8) {
            return 0;
        }
        return (this.f27602h == Integer.MIN_VALUE || (cu2Var = this.f27600f) == null || cu2Var.f27598d.getVisibility() != 8) ? this.f27601g : this.f27602h;
    }

    public final cu2 getOpposite() {
        switch (C4502a.f27604a[this.f27599e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f27598d.f48364S;
            case 3:
                return this.f27598d.f48360Q;
            case 4:
                return this.f27598d.f48366T;
            case 5:
                return this.f27598d.f48362R;
            default:
                throw new AssertionError(this.f27599e.name());
        }
    }

    public iu2 getOwner() {
        return this.f27598d;
    }

    public dvf getSolverVariable() {
        return this.f27603i;
    }

    public cu2 getTarget() {
        return this.f27600f;
    }

    public EnumC4503b getType() {
        return this.f27599e;
    }

    public boolean hasCenteredDependents() {
        HashSet<cu2> hashSet = this.f27595a;
        if (hashSet == null) {
            return false;
        }
        Iterator<cu2> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().getOpposite().isConnected()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDependents() {
        HashSet<cu2> hashSet = this.f27595a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean hasFinalValue() {
        return this.f27597c;
    }

    public boolean isConnected() {
        return this.f27600f != null;
    }

    public boolean isConnectionAllowed(iu2 iu2Var, cu2 cu2Var) {
        return isConnectionAllowed(iu2Var);
    }

    public boolean isSideAnchor() {
        switch (C4502a.f27604a[this.f27599e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f27599e.name());
        }
    }

    public boolean isSimilarDimensionConnection(cu2 cu2Var) {
        EnumC4503b type = cu2Var.getType();
        EnumC4503b enumC4503b = this.f27599e;
        if (type == enumC4503b) {
            return true;
        }
        switch (C4502a.f27604a[enumC4503b.ordinal()]) {
            case 1:
                return type != EnumC4503b.BASELINE;
            case 2:
            case 3:
            case 7:
                return type == EnumC4503b.LEFT || type == EnumC4503b.RIGHT || type == EnumC4503b.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return type == EnumC4503b.TOP || type == EnumC4503b.BOTTOM || type == EnumC4503b.CENTER_Y || type == EnumC4503b.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f27599e.name());
        }
    }

    public boolean isValidConnection(cu2 cu2Var) {
        if (cu2Var == null) {
            return false;
        }
        EnumC4503b type = cu2Var.getType();
        EnumC4503b enumC4503b = this.f27599e;
        if (type == enumC4503b) {
            return enumC4503b != EnumC4503b.BASELINE || (cu2Var.getOwner().hasBaseline() && getOwner().hasBaseline());
        }
        switch (C4502a.f27604a[enumC4503b.ordinal()]) {
            case 1:
                return (type == EnumC4503b.BASELINE || type == EnumC4503b.CENTER_X || type == EnumC4503b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = type == EnumC4503b.LEFT || type == EnumC4503b.RIGHT;
                if (cu2Var.getOwner() instanceof dd7) {
                    return z || type == EnumC4503b.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = type == EnumC4503b.TOP || type == EnumC4503b.BOTTOM;
                if (cu2Var.getOwner() instanceof dd7) {
                    return z2 || type == EnumC4503b.CENTER_Y;
                }
                return z2;
            case 6:
                return (type == EnumC4503b.LEFT || type == EnumC4503b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f27599e.name());
        }
    }

    public boolean isVerticalAnchor() {
        switch (C4502a.f27604a[this.f27599e.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f27599e.name());
        }
    }

    public void reset() {
        HashSet<cu2> hashSet;
        cu2 cu2Var = this.f27600f;
        if (cu2Var != null && (hashSet = cu2Var.f27595a) != null) {
            hashSet.remove(this);
            if (this.f27600f.f27595a.size() == 0) {
                this.f27600f.f27595a = null;
            }
        }
        this.f27595a = null;
        this.f27600f = null;
        this.f27601g = 0;
        this.f27602h = Integer.MIN_VALUE;
        this.f27597c = false;
        this.f27596b = 0;
    }

    public void resetFinalResolution() {
        this.f27597c = false;
        this.f27596b = 0;
    }

    public void resetSolverVariable(fl1 fl1Var) {
        dvf dvfVar = this.f27603i;
        if (dvfVar == null) {
            this.f27603i = new dvf(dvf.EnumC4976b.UNRESTRICTED, (String) null);
        } else {
            dvfVar.reset();
        }
    }

    public void setFinalValue(int i) {
        this.f27596b = i;
        this.f27597c = true;
    }

    public void setGoneMargin(int i) {
        if (isConnected()) {
            this.f27602h = i;
        }
    }

    public void setMargin(int i) {
        if (isConnected()) {
            this.f27601g = i;
        }
    }

    public String toString() {
        return this.f27598d.getDebugName() + g1i.f38277c + this.f27599e.toString();
    }

    public boolean isConnectionAllowed(iu2 iu2Var) {
        if (isConnectionToMe(iu2Var, new HashSet<>())) {
            return false;
        }
        iu2 parent = getOwner().getParent();
        return parent == iu2Var || iu2Var.getParent() == parent;
    }

    public boolean connect(cu2 cu2Var, int i) {
        return connect(cu2Var, i, Integer.MIN_VALUE, false);
    }
}
