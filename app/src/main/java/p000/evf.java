package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.Arrays;
import p000.e70;

/* JADX INFO: loaded from: classes.dex */
public class evf implements e70.InterfaceC5151a {

    /* JADX INFO: renamed from: n */
    public static final boolean f34175n = false;

    /* JADX INFO: renamed from: o */
    public static final boolean f34176o = true;

    /* JADX INFO: renamed from: p */
    public static float f34177p = 0.001f;

    /* JADX INFO: renamed from: a */
    public final int f34178a = -1;

    /* JADX INFO: renamed from: b */
    public int f34179b = 16;

    /* JADX INFO: renamed from: c */
    public int f34180c = 16;

    /* JADX INFO: renamed from: d */
    public int[] f34181d = new int[16];

    /* JADX INFO: renamed from: e */
    public int[] f34182e = new int[16];

    /* JADX INFO: renamed from: f */
    public int[] f34183f = new int[16];

    /* JADX INFO: renamed from: g */
    public float[] f34184g = new float[16];

    /* JADX INFO: renamed from: h */
    public int[] f34185h = new int[16];

    /* JADX INFO: renamed from: i */
    public int[] f34186i = new int[16];

    /* JADX INFO: renamed from: j */
    public int f34187j = 0;

    /* JADX INFO: renamed from: k */
    public int f34188k = -1;

    /* JADX INFO: renamed from: l */
    public final e70 f34189l;

    /* JADX INFO: renamed from: m */
    public final fl1 f34190m;

    public evf(e70 e70Var, fl1 fl1Var) {
        this.f34189l = e70Var;
        this.f34190m = fl1Var;
        clear();
    }

    private void addToHashMap(dvf dvfVar, int i) {
        int[] iArr;
        int i2 = dvfVar.f31074c % this.f34180c;
        int[] iArr2 = this.f34181d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f34182e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.f34182e[i] = -1;
    }

    private void addVariable(int i, dvf dvfVar, float f) {
        this.f34183f[i] = dvfVar.f31074c;
        this.f34184g[i] = f;
        this.f34185h[i] = -1;
        this.f34186i[i] = -1;
        dvfVar.addToRow(this.f34189l);
        dvfVar.f31067N++;
        this.f34187j++;
    }

    private void displayHash() {
        for (int i = 0; i < this.f34180c; i++) {
            if (this.f34181d[i] != -1) {
                String str = hashCode() + " hash [" + i + "] => ";
                int i2 = this.f34181d[i];
                boolean z = false;
                while (!z) {
                    str = str + C2473f.f17566z + this.f34183f[i2];
                    int i3 = this.f34182e[i2];
                    if (i3 != -1) {
                        i2 = i3;
                    } else {
                        z = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int findEmptySlot() {
        for (int i = 0; i < this.f34179b; i++) {
            if (this.f34183f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    private void increaseSize() {
        int i = this.f34179b * 2;
        this.f34183f = Arrays.copyOf(this.f34183f, i);
        this.f34184g = Arrays.copyOf(this.f34184g, i);
        this.f34185h = Arrays.copyOf(this.f34185h, i);
        this.f34186i = Arrays.copyOf(this.f34186i, i);
        this.f34182e = Arrays.copyOf(this.f34182e, i);
        for (int i2 = this.f34179b; i2 < i; i2++) {
            this.f34183f[i2] = -1;
            this.f34182e[i2] = -1;
        }
        this.f34179b = i;
    }

    private void insertVariable(int i, dvf dvfVar, float f) {
        int iFindEmptySlot = findEmptySlot();
        addVariable(iFindEmptySlot, dvfVar, f);
        if (i != -1) {
            this.f34185h[iFindEmptySlot] = i;
            int[] iArr = this.f34186i;
            iArr[iFindEmptySlot] = iArr[i];
            iArr[i] = iFindEmptySlot;
        } else {
            this.f34185h[iFindEmptySlot] = -1;
            if (this.f34187j > 0) {
                this.f34186i[iFindEmptySlot] = this.f34188k;
                this.f34188k = iFindEmptySlot;
            } else {
                this.f34186i[iFindEmptySlot] = -1;
            }
        }
        int i2 = this.f34186i[iFindEmptySlot];
        if (i2 != -1) {
            this.f34185h[i2] = iFindEmptySlot;
        }
        addToHashMap(dvfVar, iFindEmptySlot);
    }

    private void removeFromHashMap(dvf dvfVar) {
        int[] iArr;
        int i;
        int i2 = dvfVar.f31074c;
        int i3 = i2 % this.f34180c;
        int[] iArr2 = this.f34181d;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f34183f[i4] == i2) {
            int[] iArr3 = this.f34182e;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.f34182e;
            i = iArr[i4];
            if (i == -1 || this.f34183f[i] == i2) {
                break;
            } else {
                i4 = i;
            }
        }
        if (i == -1 || this.f34183f[i] != i2) {
            return;
        }
        iArr[i4] = iArr[i];
        iArr[i] = -1;
    }

    @Override // p000.e70.InterfaceC5151a
    public void add(dvf dvfVar, float f, boolean z) {
        float f2 = f34177p;
        if (f <= (-f2) || f >= f2) {
            int iIndexOf = indexOf(dvfVar);
            if (iIndexOf == -1) {
                put(dvfVar, f);
                return;
            }
            float[] fArr = this.f34184g;
            float f3 = fArr[iIndexOf] + f;
            fArr[iIndexOf] = f3;
            float f4 = f34177p;
            if (f3 <= (-f4) || f3 >= f4) {
                return;
            }
            fArr[iIndexOf] = 0.0f;
            remove(dvfVar, z);
        }
    }

    @Override // p000.e70.InterfaceC5151a
    public void clear() {
        int i = this.f34187j;
        for (int i2 = 0; i2 < i; i2++) {
            dvf variable = getVariable(i2);
            if (variable != null) {
                variable.removeFromRow(this.f34189l);
            }
        }
        for (int i3 = 0; i3 < this.f34179b; i3++) {
            this.f34183f[i3] = -1;
            this.f34182e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f34180c; i4++) {
            this.f34181d[i4] = -1;
        }
        this.f34187j = 0;
        this.f34188k = -1;
    }

    @Override // p000.e70.InterfaceC5151a
    public boolean contains(dvf dvfVar) {
        return indexOf(dvfVar) != -1;
    }

    @Override // p000.e70.InterfaceC5151a
    public void display() {
        int i = this.f34187j;
        System.out.print("{ ");
        for (int i2 = 0; i2 < i; i2++) {
            dvf variable = getVariable(i2);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i2) + C2473f.f17566z);
            }
        }
        System.out.println(" }");
    }

    @Override // p000.e70.InterfaceC5151a
    public void divideByAmount(float f) {
        int i = this.f34187j;
        int i2 = this.f34188k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f34184g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f34186i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p000.e70.InterfaceC5151a
    public float get(dvf dvfVar) {
        int iIndexOf = indexOf(dvfVar);
        if (iIndexOf != -1) {
            return this.f34184g[iIndexOf];
        }
        return 0.0f;
    }

    @Override // p000.e70.InterfaceC5151a
    public int getCurrentSize() {
        return this.f34187j;
    }

    @Override // p000.e70.InterfaceC5151a
    public dvf getVariable(int i) {
        int i2 = this.f34187j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f34188k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f34190m.f36990d[this.f34183f[i3]];
            }
            i3 = this.f34186i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p000.e70.InterfaceC5151a
    public float getVariableValue(int i) {
        int i2 = this.f34187j;
        int i3 = this.f34188k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f34184g[i3];
            }
            i3 = this.f34186i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p000.e70.InterfaceC5151a
    public int indexOf(dvf dvfVar) {
        if (this.f34187j != 0 && dvfVar != null) {
            int i = dvfVar.f31074c;
            int i2 = this.f34181d[i % this.f34180c];
            if (i2 == -1) {
                return -1;
            }
            if (this.f34183f[i2] == i) {
                return i2;
            }
            do {
                i2 = this.f34182e[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.f34183f[i2] != i);
            if (i2 != -1 && this.f34183f[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.e70.InterfaceC5151a
    public void invert() {
        int i = this.f34187j;
        int i2 = this.f34188k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f34184g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f34186i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p000.e70.InterfaceC5151a
    public void put(dvf dvfVar, float f) {
        float f2 = f34177p;
        if (f > (-f2) && f < f2) {
            remove(dvfVar, true);
            return;
        }
        if (this.f34187j == 0) {
            addVariable(0, dvfVar, f);
            addToHashMap(dvfVar, 0);
            this.f34188k = 0;
            return;
        }
        int iIndexOf = indexOf(dvfVar);
        if (iIndexOf != -1) {
            this.f34184g[iIndexOf] = f;
            return;
        }
        if (this.f34187j + 1 >= this.f34179b) {
            increaseSize();
        }
        int i = this.f34187j;
        int i2 = this.f34188k;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f34183f[i2];
            int i6 = dvfVar.f31074c;
            if (i5 == i6) {
                this.f34184g[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.f34186i[i2];
            if (i2 == -1) {
                break;
            }
        }
        insertVariable(i3, dvfVar, f);
    }

    @Override // p000.e70.InterfaceC5151a
    public float remove(dvf dvfVar, boolean z) {
        int iIndexOf = indexOf(dvfVar);
        if (iIndexOf == -1) {
            return 0.0f;
        }
        removeFromHashMap(dvfVar);
        float f = this.f34184g[iIndexOf];
        if (this.f34188k == iIndexOf) {
            this.f34188k = this.f34186i[iIndexOf];
        }
        this.f34183f[iIndexOf] = -1;
        int[] iArr = this.f34185h;
        int i = iArr[iIndexOf];
        if (i != -1) {
            int[] iArr2 = this.f34186i;
            iArr2[i] = iArr2[iIndexOf];
        }
        int i2 = this.f34186i[iIndexOf];
        if (i2 != -1) {
            iArr[i2] = iArr[iIndexOf];
        }
        this.f34187j--;
        dvfVar.f31067N--;
        if (z) {
            dvfVar.removeFromRow(this.f34189l);
        }
        return f;
    }

    @Override // p000.e70.InterfaceC5151a
    public int sizeInBytes() {
        return 0;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i = this.f34187j;
        for (int i2 = 0; i2 < i; i2++) {
            dvf variable = getVariable(i2);
            if (variable != null) {
                String str2 = str + variable + " = " + getVariableValue(i2) + C2473f.f17566z;
                int iIndexOf = indexOf(variable);
                String str3 = str2 + "[p: ";
                String str4 = (this.f34185h[iIndexOf] != -1 ? str3 + this.f34190m.f36990d[this.f34183f[this.f34185h[iIndexOf]]] : str3 + "none") + ", n: ";
                str = (this.f34186i[iIndexOf] != -1 ? str4 + this.f34190m.f36990d[this.f34183f[this.f34186i[iIndexOf]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    @Override // p000.e70.InterfaceC5151a
    public float use(e70 e70Var, boolean z) {
        float f = get(e70Var.f31973a);
        remove(e70Var.f31973a, z);
        evf evfVar = (evf) e70Var.f31977e;
        int currentSize = evfVar.getCurrentSize();
        int i = 0;
        int i2 = 0;
        while (i < currentSize) {
            int i3 = evfVar.f34183f[i2];
            if (i3 != -1) {
                add(this.f34190m.f36990d[i3], evfVar.f34184g[i2] * f, z);
                i++;
            }
            i2++;
        }
        return f;
    }
}
