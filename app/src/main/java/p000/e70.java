package p000;

import java.util.ArrayList;
import p000.dvf;
import p000.v69;

/* JADX INFO: loaded from: classes.dex */
public class e70 implements v69.InterfaceC13885a {

    /* JADX INFO: renamed from: g */
    public static final boolean f31971g = false;

    /* JADX INFO: renamed from: h */
    public static final boolean f31972h = false;

    /* JADX INFO: renamed from: e */
    public InterfaceC5151a f31977e;

    /* JADX INFO: renamed from: a */
    public dvf f31973a = null;

    /* JADX INFO: renamed from: b */
    public float f31974b = 0.0f;

    /* JADX INFO: renamed from: c */
    public boolean f31975c = false;

    /* JADX INFO: renamed from: d */
    public ArrayList<dvf> f31976d = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public boolean f31978f = false;

    /* JADX INFO: renamed from: e70$a */
    public interface InterfaceC5151a {
        void add(dvf dvfVar, float f, boolean z);

        void clear();

        boolean contains(dvf dvfVar);

        void display();

        void divideByAmount(float f);

        float get(dvf dvfVar);

        int getCurrentSize();

        dvf getVariable(int i);

        float getVariableValue(int i);

        int indexOf(dvf dvfVar);

        void invert();

        void put(dvf dvfVar, float f);

        float remove(dvf dvfVar, boolean z);

        int sizeInBytes();

        float use(e70 e70Var, boolean z);
    }

    public e70() {
    }

    private boolean isNew(dvf dvfVar, v69 v69Var) {
        return dvfVar.f31067N <= 1;
    }

    private dvf pickPivotInVariables(boolean[] zArr, dvf dvfVar) {
        dvf.EnumC4976b enumC4976b;
        int currentSize = this.f31977e.getCurrentSize();
        dvf dvfVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < currentSize; i++) {
            float variableValue = this.f31977e.getVariableValue(i);
            if (variableValue < 0.0f) {
                dvf variable = this.f31977e.getVariable(i);
                if ((zArr == null || !zArr[variable.f31074c]) && variable != dvfVar && (((enumC4976b = variable.f31064H) == dvf.EnumC4976b.SLACK || enumC4976b == dvf.EnumC4976b.ERROR) && variableValue < f)) {
                    f = variableValue;
                    dvfVar2 = variable;
                }
            }
        }
        return dvfVar2;
    }

    /* JADX INFO: renamed from: a */
    public e70 m9761a(dvf dvfVar, int i) {
        this.f31977e.put(dvfVar, i);
        return this;
    }

    public e70 addError(v69 v69Var, int i) {
        this.f31977e.put(v69Var.createErrorVariable(i, "ep"), 1.0f);
        this.f31977e.put(v69Var.createErrorVariable(i, yv7.f103134b), -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m9762b(v69 v69Var) {
        boolean z;
        dvf dvfVarM9763c = m9763c(v69Var);
        if (dvfVarM9763c == null) {
            z = true;
        } else {
            m9770j(dvfVarM9763c);
            z = false;
        }
        if (this.f31977e.getCurrentSize() == 0) {
            this.f31978f = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public dvf m9763c(v69 v69Var) {
        int currentSize = this.f31977e.getCurrentSize();
        dvf dvfVar = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        dvf dvfVar2 = null;
        for (int i = 0; i < currentSize; i++) {
            float variableValue = this.f31977e.getVariableValue(i);
            dvf variable = this.f31977e.getVariable(i);
            if (variable.f31064H == dvf.EnumC4976b.UNRESTRICTED) {
                if (dvfVar == null || f > variableValue) {
                    boolean zIsNew = isNew(variable, v69Var);
                    z = zIsNew;
                    f = variableValue;
                    dvfVar = variable;
                } else if (!z && isNew(variable, v69Var)) {
                    f = variableValue;
                    dvfVar = variable;
                    z = true;
                }
            } else if (dvfVar == null && variableValue < 0.0f) {
                if (dvfVar2 == null || f2 > variableValue) {
                    boolean zIsNew2 = isNew(variable, v69Var);
                    z2 = zIsNew2;
                    f2 = variableValue;
                    dvfVar2 = variable;
                } else if (!z2 && isNew(variable, v69Var)) {
                    f2 = variableValue;
                    dvfVar2 = variable;
                    z2 = true;
                }
            }
        }
        return dvfVar != null ? dvfVar : dvfVar2;
    }

    @Override // p000.v69.InterfaceC13885a
    public void clear() {
        this.f31977e.clear();
        this.f31973a = null;
        this.f31974b = 0.0f;
    }

    public e70 createRowDimensionRatio(dvf dvfVar, dvf dvfVar2, dvf dvfVar3, dvf dvfVar4, float f) {
        this.f31977e.put(dvfVar, -1.0f);
        this.f31977e.put(dvfVar2, 1.0f);
        this.f31977e.put(dvfVar3, f);
        this.f31977e.put(dvfVar4, -f);
        return this;
    }

    public e70 createRowEqualDimension(float f, float f2, float f3, dvf dvfVar, int i, dvf dvfVar2, int i2, dvf dvfVar3, int i3, dvf dvfVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f31974b = ((-i) - i2) + i3 + i4;
            this.f31977e.put(dvfVar, 1.0f);
            this.f31977e.put(dvfVar2, -1.0f);
            this.f31977e.put(dvfVar4, 1.0f);
            this.f31977e.put(dvfVar3, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f31974b = ((-i) - i2) + (i3 * f4) + (i4 * f4);
            this.f31977e.put(dvfVar, 1.0f);
            this.f31977e.put(dvfVar2, -1.0f);
            this.f31977e.put(dvfVar4, f4);
            this.f31977e.put(dvfVar3, -f4);
        }
        return this;
    }

    public e70 createRowEqualMatchDimensions(float f, float f2, float f3, dvf dvfVar, dvf dvfVar2, dvf dvfVar3, dvf dvfVar4) {
        this.f31974b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f31977e.put(dvfVar, 1.0f);
            this.f31977e.put(dvfVar2, -1.0f);
            this.f31977e.put(dvfVar4, 1.0f);
            this.f31977e.put(dvfVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f31977e.put(dvfVar, 1.0f);
            this.f31977e.put(dvfVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f31977e.put(dvfVar3, 1.0f);
            this.f31977e.put(dvfVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f31977e.put(dvfVar, 1.0f);
            this.f31977e.put(dvfVar2, -1.0f);
            this.f31977e.put(dvfVar4, f4);
            this.f31977e.put(dvfVar3, -f4);
        }
        return this;
    }

    public e70 createRowEquals(dvf dvfVar, int i) {
        if (i < 0) {
            this.f31974b = i * (-1);
            this.f31977e.put(dvfVar, 1.0f);
        } else {
            this.f31974b = i;
            this.f31977e.put(dvfVar, -1.0f);
        }
        return this;
    }

    public e70 createRowGreaterThan(dvf dvfVar, dvf dvfVar2, dvf dvfVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f31974b = i;
        }
        if (z) {
            this.f31977e.put(dvfVar, 1.0f);
            this.f31977e.put(dvfVar2, -1.0f);
            this.f31977e.put(dvfVar3, -1.0f);
        } else {
            this.f31977e.put(dvfVar, -1.0f);
            this.f31977e.put(dvfVar2, 1.0f);
            this.f31977e.put(dvfVar3, 1.0f);
        }
        return this;
    }

    public e70 createRowLowerThan(dvf dvfVar, dvf dvfVar2, dvf dvfVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f31974b = i;
        }
        if (z) {
            this.f31977e.put(dvfVar, 1.0f);
            this.f31977e.put(dvfVar2, -1.0f);
            this.f31977e.put(dvfVar3, 1.0f);
        } else {
            this.f31977e.put(dvfVar, -1.0f);
            this.f31977e.put(dvfVar2, 1.0f);
            this.f31977e.put(dvfVar3, -1.0f);
        }
        return this;
    }

    public e70 createRowWithAngle(dvf dvfVar, dvf dvfVar2, dvf dvfVar3, dvf dvfVar4, float f) {
        this.f31977e.put(dvfVar3, 0.5f);
        this.f31977e.put(dvfVar4, 0.5f);
        this.f31977e.put(dvfVar, -0.5f);
        this.f31977e.put(dvfVar2, -0.5f);
        this.f31974b = -f;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public e70 m9764d(dvf dvfVar, dvf dvfVar2, int i, float f, dvf dvfVar3, dvf dvfVar4, int i2) {
        if (dvfVar2 == dvfVar3) {
            this.f31977e.put(dvfVar, 1.0f);
            this.f31977e.put(dvfVar4, 1.0f);
            this.f31977e.put(dvfVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f31977e.put(dvfVar, 1.0f);
            this.f31977e.put(dvfVar2, -1.0f);
            this.f31977e.put(dvfVar3, -1.0f);
            this.f31977e.put(dvfVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f31974b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.f31977e.put(dvfVar, -1.0f);
            this.f31977e.put(dvfVar2, 1.0f);
            this.f31974b = i;
        } else if (f >= 1.0f) {
            this.f31977e.put(dvfVar4, -1.0f);
            this.f31977e.put(dvfVar3, 1.0f);
            this.f31974b = -i2;
        } else {
            float f2 = 1.0f - f;
            this.f31977e.put(dvfVar, f2 * 1.0f);
            this.f31977e.put(dvfVar2, f2 * (-1.0f));
            this.f31977e.put(dvfVar3, (-1.0f) * f);
            this.f31977e.put(dvfVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f31974b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public e70 m9765e(dvf dvfVar, int i) {
        this.f31973a = dvfVar;
        float f = i;
        dvfVar.f31077f = f;
        this.f31974b = f;
        this.f31978f = true;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public e70 m9766f(dvf dvfVar, dvf dvfVar2, float f) {
        this.f31977e.put(dvfVar, -1.0f);
        this.f31977e.put(dvfVar2, f);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m9767g() {
        float f = this.f31974b;
        if (f < 0.0f) {
            this.f31974b = f * (-1.0f);
            this.f31977e.invert();
        }
    }

    @Override // p000.v69.InterfaceC13885a
    public dvf getKey() {
        return this.f31973a;
    }

    @Override // p000.v69.InterfaceC13885a
    public dvf getPivotCandidate(v69 v69Var, boolean[] zArr) {
        return pickPivotInVariables(zArr, null);
    }

    /* JADX INFO: renamed from: h */
    public boolean m9768h() {
        dvf dvfVar = this.f31973a;
        return dvfVar != null && (dvfVar.f31064H == dvf.EnumC4976b.UNRESTRICTED || this.f31974b >= 0.0f);
    }

    /* JADX INFO: renamed from: i */
    public boolean m9769i(dvf dvfVar) {
        return this.f31977e.contains(dvfVar);
    }

    @Override // p000.v69.InterfaceC13885a
    public void initFromRow(v69.InterfaceC13885a interfaceC13885a) {
        if (interfaceC13885a instanceof e70) {
            e70 e70Var = (e70) interfaceC13885a;
            this.f31973a = null;
            this.f31977e.clear();
            for (int i = 0; i < e70Var.f31977e.getCurrentSize(); i++) {
                this.f31977e.add(e70Var.f31977e.getVariable(i), e70Var.f31977e.getVariableValue(i), true);
            }
        }
    }

    @Override // p000.v69.InterfaceC13885a
    public boolean isEmpty() {
        return this.f31973a == null && this.f31974b == 0.0f && this.f31977e.getCurrentSize() == 0;
    }

    /* JADX INFO: renamed from: j */
    public void m9770j(dvf dvfVar) {
        dvf dvfVar2 = this.f31973a;
        if (dvfVar2 != null) {
            this.f31977e.put(dvfVar2, -1.0f);
            this.f31973a.f31075d = -1;
            this.f31973a = null;
        }
        float fRemove = this.f31977e.remove(dvfVar, true) * (-1.0f);
        this.f31973a = dvfVar;
        if (fRemove == 1.0f) {
            return;
        }
        this.f31974b /= fRemove;
        this.f31977e.divideByAmount(fRemove);
    }

    /* JADX INFO: renamed from: k */
    public int m9771k() {
        return (this.f31973a != null ? 4 : 0) + 8 + this.f31977e.sizeInBytes();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m9772l() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e70.m9772l():java.lang.String");
    }

    public dvf pickPivot(dvf dvfVar) {
        return pickPivotInVariables(null, dvfVar);
    }

    public void reset() {
        this.f31973a = null;
        this.f31977e.clear();
        this.f31974b = 0.0f;
        this.f31978f = false;
    }

    public String toString() {
        return m9772l();
    }

    @Override // p000.v69.InterfaceC13885a
    public void updateFromFinalVariable(v69 v69Var, dvf dvfVar, boolean z) {
        if (dvfVar == null || !dvfVar.f31078m) {
            return;
        }
        this.f31974b += dvfVar.f31077f * this.f31977e.get(dvfVar);
        this.f31977e.remove(dvfVar, z);
        if (z) {
            dvfVar.removeFromRow(this);
        }
        if (v69.f90082x && this.f31977e.getCurrentSize() == 0) {
            this.f31978f = true;
            v69Var.f90085a = true;
        }
    }

    @Override // p000.v69.InterfaceC13885a
    public void updateFromRow(v69 v69Var, e70 e70Var, boolean z) {
        this.f31974b += e70Var.f31974b * this.f31977e.use(e70Var, z);
        if (z) {
            e70Var.f31973a.removeFromRow(this);
        }
        if (v69.f90082x && this.f31973a != null && this.f31977e.getCurrentSize() == 0) {
            this.f31978f = true;
            v69Var.f90085a = true;
        }
    }

    public void updateFromSynonymVariable(v69 v69Var, dvf dvfVar, boolean z) {
        if (dvfVar == null || !dvfVar.f31068Q) {
            return;
        }
        float f = this.f31977e.get(dvfVar);
        this.f31974b += dvfVar.f31070Y * f;
        this.f31977e.remove(dvfVar, z);
        if (z) {
            dvfVar.removeFromRow(this);
        }
        this.f31977e.add(v69Var.f90098n.f36990d[dvfVar.f31069X], f, z);
        if (v69.f90082x && this.f31977e.getCurrentSize() == 0) {
            this.f31978f = true;
            v69Var.f90085a = true;
        }
    }

    @Override // p000.v69.InterfaceC13885a
    public void updateFromSystem(v69 v69Var) {
        if (v69Var.f90091g.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int currentSize = this.f31977e.getCurrentSize();
            for (int i = 0; i < currentSize; i++) {
                dvf variable = this.f31977e.getVariable(i);
                if (variable.f31075d != -1 || variable.f31078m || variable.f31068Q) {
                    this.f31976d.add(variable);
                }
            }
            int size = this.f31976d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    dvf dvfVar = this.f31976d.get(i2);
                    if (dvfVar.f31078m) {
                        updateFromFinalVariable(v69Var, dvfVar, true);
                    } else if (dvfVar.f31068Q) {
                        updateFromSynonymVariable(v69Var, dvfVar, true);
                    } else {
                        updateFromRow(v69Var, v69Var.f90091g[dvfVar.f31075d], true);
                    }
                }
                this.f31976d.clear();
            } else {
                z = true;
            }
        }
        if (v69.f90082x && this.f31973a != null && this.f31977e.getCurrentSize() == 0) {
            this.f31978f = true;
            v69Var.f90085a = true;
        }
    }

    @Override // p000.v69.InterfaceC13885a
    public void addError(dvf dvfVar) {
        int i = dvfVar.f31076e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f31977e.put(dvfVar, f);
    }

    public e70 createRowEquals(dvf dvfVar, dvf dvfVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f31974b = i;
        }
        if (!z) {
            this.f31977e.put(dvfVar, -1.0f);
            this.f31977e.put(dvfVar2, 1.0f);
        } else {
            this.f31977e.put(dvfVar, 1.0f);
            this.f31977e.put(dvfVar2, -1.0f);
        }
        return this;
    }

    public e70(fl1 fl1Var) {
        this.f31977e = new p60(this, fl1Var);
    }

    public e70 createRowGreaterThan(dvf dvfVar, int i, dvf dvfVar2) {
        this.f31974b = i;
        this.f31977e.put(dvfVar, -1.0f);
        return this;
    }
}
