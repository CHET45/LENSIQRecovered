package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.Arrays;
import java.util.Comparator;
import p000.e70;

/* JADX INFO: loaded from: classes.dex */
public class fcd extends e70 {

    /* JADX INFO: renamed from: o */
    public static final float f36130o = 1.0E-4f;

    /* JADX INFO: renamed from: p */
    public static final boolean f36131p = false;

    /* JADX INFO: renamed from: q */
    public static final int f36132q = -1;

    /* JADX INFO: renamed from: i */
    public int f36133i;

    /* JADX INFO: renamed from: j */
    public dvf[] f36134j;

    /* JADX INFO: renamed from: k */
    public dvf[] f36135k;

    /* JADX INFO: renamed from: l */
    public int f36136l;

    /* JADX INFO: renamed from: m */
    public C5723b f36137m;

    /* JADX INFO: renamed from: n */
    public fl1 f36138n;

    /* JADX INFO: renamed from: fcd$a */
    public class C5722a implements Comparator<dvf> {
        public C5722a() {
        }

        @Override // java.util.Comparator
        public int compare(dvf dvfVar, dvf dvfVar2) {
            return dvfVar.f31074c - dvfVar2.f31074c;
        }
    }

    /* JADX INFO: renamed from: fcd$b */
    public class C5723b {

        /* JADX INFO: renamed from: a */
        public dvf f36140a;

        /* JADX INFO: renamed from: b */
        public fcd f36141b;

        public C5723b(fcd fcdVar) {
            this.f36141b = fcdVar;
        }

        public void add(dvf dvfVar) {
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f36140a.f31063F;
                float f = fArr[i] + dvfVar.f31063F[i];
                fArr[i] = f;
                if (Math.abs(f) < 1.0E-4f) {
                    this.f36140a.f31063F[i] = 0.0f;
                }
            }
        }

        public boolean addToGoal(dvf dvfVar, float f) {
            boolean z = true;
            if (!this.f36140a.f31072a) {
                for (int i = 0; i < 9; i++) {
                    float f2 = dvfVar.f31063F[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.f36140a.f31063F[i] = f3;
                    } else {
                        this.f36140a.f31063F[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f36140a.f31063F;
                float f4 = fArr[i2] + (dvfVar.f31063F[i2] * f);
                fArr[i2] = f4;
                if (Math.abs(f4) < 1.0E-4f) {
                    this.f36140a.f31063F[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                fcd.this.removeGoal(this.f36140a);
            }
            return false;
        }

        public void init(dvf dvfVar) {
            this.f36140a = dvfVar;
        }

        public final boolean isNegative() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f36140a.f31063F[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isNull() {
            for (int i = 0; i < 9; i++) {
                if (this.f36140a.f31063F[i] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isSmallerThan(dvf dvfVar) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = dvfVar.f31063F[i];
                float f2 = this.f36140a.f31063F[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        public void reset() {
            Arrays.fill(this.f36140a.f31063F, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f36140a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f36140a.f31063F[i] + C2473f.f17566z;
                }
            }
            return str + "] " + this.f36140a;
        }
    }

    public fcd(fl1 fl1Var) {
        super(fl1Var);
        this.f36133i = 128;
        this.f36134j = new dvf[128];
        this.f36135k = new dvf[128];
        this.f36136l = 0;
        this.f36137m = new C5723b(this);
        this.f36138n = fl1Var;
    }

    private final void addToGoal(dvf dvfVar) {
        int i;
        int i2 = this.f36136l + 1;
        dvf[] dvfVarArr = this.f36134j;
        if (i2 > dvfVarArr.length) {
            dvf[] dvfVarArr2 = (dvf[]) Arrays.copyOf(dvfVarArr, dvfVarArr.length * 2);
            this.f36134j = dvfVarArr2;
            this.f36135k = (dvf[]) Arrays.copyOf(dvfVarArr2, dvfVarArr2.length * 2);
        }
        dvf[] dvfVarArr3 = this.f36134j;
        int i3 = this.f36136l;
        dvfVarArr3[i3] = dvfVar;
        int i4 = i3 + 1;
        this.f36136l = i4;
        if (i4 > 1 && dvfVarArr3[i3].f31074c > dvfVar.f31074c) {
            int i5 = 0;
            while (true) {
                i = this.f36136l;
                if (i5 >= i) {
                    break;
                }
                this.f36135k[i5] = this.f36134j[i5];
                i5++;
            }
            Arrays.sort(this.f36135k, 0, i, new C5722a());
            for (int i6 = 0; i6 < this.f36136l; i6++) {
                this.f36134j[i6] = this.f36135k[i6];
            }
        }
        dvfVar.f31072a = true;
        dvfVar.addToRow(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeGoal(dvf dvfVar) {
        int i = 0;
        while (i < this.f36136l) {
            if (this.f36134j[i] == dvfVar) {
                while (true) {
                    int i2 = this.f36136l;
                    if (i >= i2 - 1) {
                        this.f36136l = i2 - 1;
                        dvfVar.f31072a = false;
                        return;
                    } else {
                        dvf[] dvfVarArr = this.f36134j;
                        int i3 = i + 1;
                        dvfVarArr[i] = dvfVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p000.e70, p000.v69.InterfaceC13885a
    public void addError(dvf dvfVar) {
        this.f36137m.init(dvfVar);
        this.f36137m.reset();
        dvfVar.f31063F[dvfVar.f31076e] = 1.0f;
        addToGoal(dvfVar);
    }

    @Override // p000.e70, p000.v69.InterfaceC13885a
    public void clear() {
        this.f36136l = 0;
        this.f31974b = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // p000.e70, p000.v69.InterfaceC13885a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.dvf getPivotCandidate(p000.v69 r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f36136l
            if (r0 >= r2) goto L32
            dvf[] r2 = r4.f36134j
            r2 = r2[r0]
            int r3 = r2.f31074c
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            fcd$b r3 = r4.f36137m
            r3.init(r2)
            if (r1 != r5) goto L22
            fcd$b r2 = r4.f36137m
            boolean r2 = r2.isNegative()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            fcd$b r2 = r4.f36137m
            dvf[] r3 = r4.f36134j
            r3 = r3[r1]
            boolean r2 = r2.isSmallerThan(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            dvf[] r5 = r4.f36134j
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fcd.getPivotCandidate(v69, boolean[]):dvf");
    }

    @Override // p000.e70, p000.v69.InterfaceC13885a
    public boolean isEmpty() {
        return this.f36136l == 0;
    }

    @Override // p000.e70
    public String toString() {
        String str = " goal -> (" + this.f31974b + ") : ";
        for (int i = 0; i < this.f36136l; i++) {
            this.f36137m.init(this.f36134j[i]);
            str = str + this.f36137m + C2473f.f17566z;
        }
        return str;
    }

    @Override // p000.e70, p000.v69.InterfaceC13885a
    public void updateFromRow(v69 v69Var, e70 e70Var, boolean z) {
        dvf dvfVar = e70Var.f31973a;
        if (dvfVar == null) {
            return;
        }
        e70.InterfaceC5151a interfaceC5151a = e70Var.f31977e;
        int currentSize = interfaceC5151a.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            dvf variable = interfaceC5151a.getVariable(i);
            float variableValue = interfaceC5151a.getVariableValue(i);
            this.f36137m.init(variable);
            if (this.f36137m.addToGoal(dvfVar, variableValue)) {
                addToGoal(variable);
            }
            this.f31974b += e70Var.f31974b * variableValue;
        }
        removeGoal(dvfVar);
    }
}
