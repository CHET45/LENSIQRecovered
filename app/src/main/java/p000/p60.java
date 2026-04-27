package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.Arrays;
import p000.e70;

/* JADX INFO: loaded from: classes.dex */
public class p60 implements e70.InterfaceC5151a {

    /* JADX INFO: renamed from: l */
    public static final boolean f69762l = false;

    /* JADX INFO: renamed from: m */
    public static final int f69763m = -1;

    /* JADX INFO: renamed from: n */
    public static final boolean f69764n = false;

    /* JADX INFO: renamed from: o */
    public static float f69765o = 0.001f;

    /* JADX INFO: renamed from: b */
    public final e70 f69767b;

    /* JADX INFO: renamed from: c */
    public final fl1 f69768c;

    /* JADX INFO: renamed from: a */
    public int f69766a = 0;

    /* JADX INFO: renamed from: d */
    public int f69769d = 8;

    /* JADX INFO: renamed from: e */
    public dvf f69770e = null;

    /* JADX INFO: renamed from: f */
    public int[] f69771f = new int[8];

    /* JADX INFO: renamed from: g */
    public int[] f69772g = new int[8];

    /* JADX INFO: renamed from: h */
    public float[] f69773h = new float[8];

    /* JADX INFO: renamed from: i */
    public int f69774i = -1;

    /* JADX INFO: renamed from: j */
    public int f69775j = -1;

    /* JADX INFO: renamed from: k */
    public boolean f69776k = false;

    public p60(e70 e70Var, fl1 fl1Var) {
        this.f69767b = e70Var;
        this.f69768c = fl1Var;
    }

    /* JADX INFO: renamed from: a */
    public dvf m19276a() {
        dvf dvfVar = this.f69770e;
        if (dvfVar != null) {
            return dvfVar;
        }
        int i = this.f69774i;
        dvf dvfVar2 = null;
        for (int i2 = 0; i != -1 && i2 < this.f69766a; i2++) {
            if (this.f69773h[i] < 0.0f) {
                dvf dvfVar3 = this.f69768c.f36990d[this.f69771f[i]];
                if (dvfVar2 == null || dvfVar2.f31076e < dvfVar3.f31076e) {
                    dvfVar2 = dvfVar3;
                }
            }
            i = this.f69772g[i];
        }
        return dvfVar2;
    }

    @Override // p000.e70.InterfaceC5151a
    public void add(dvf dvfVar, float f, boolean z) {
        float f2 = f69765o;
        if (f <= (-f2) || f >= f2) {
            int i = this.f69774i;
            if (i == -1) {
                this.f69774i = 0;
                this.f69773h[0] = f;
                this.f69771f[0] = dvfVar.f31074c;
                this.f69772g[0] = -1;
                dvfVar.f31067N++;
                dvfVar.addToRow(this.f69767b);
                this.f69766a++;
                if (this.f69776k) {
                    return;
                }
                int i2 = this.f69775j + 1;
                this.f69775j = i2;
                int[] iArr = this.f69771f;
                if (i2 >= iArr.length) {
                    this.f69776k = true;
                    this.f69775j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f69766a; i4++) {
                int i5 = this.f69771f[i];
                int i6 = dvfVar.f31074c;
                if (i5 == i6) {
                    float[] fArr = this.f69773h;
                    float f3 = fArr[i] + f;
                    float f4 = f69765o;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f69774i) {
                            this.f69774i = this.f69772g[i];
                        } else {
                            int[] iArr2 = this.f69772g;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            dvfVar.removeFromRow(this.f69767b);
                        }
                        if (this.f69776k) {
                            this.f69775j = i;
                        }
                        dvfVar.f31067N--;
                        this.f69766a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f69772g[i];
            }
            int length = this.f69775j;
            int i7 = length + 1;
            if (this.f69776k) {
                int[] iArr3 = this.f69771f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f69771f;
            if (length >= iArr4.length && this.f69766a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f69771f;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f69771f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f69769d * 2;
                this.f69769d = i9;
                this.f69776k = false;
                this.f69775j = length - 1;
                this.f69773h = Arrays.copyOf(this.f69773h, i9);
                this.f69771f = Arrays.copyOf(this.f69771f, this.f69769d);
                this.f69772g = Arrays.copyOf(this.f69772g, this.f69769d);
            }
            this.f69771f[length] = dvfVar.f31074c;
            this.f69773h[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f69772g;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f69772g[length] = this.f69774i;
                this.f69774i = length;
            }
            dvfVar.f31067N++;
            dvfVar.addToRow(this.f69767b);
            this.f69766a++;
            if (!this.f69776k) {
                this.f69775j++;
            }
            int i10 = this.f69775j;
            int[] iArr8 = this.f69771f;
            if (i10 >= iArr8.length) {
                this.f69776k = true;
                this.f69775j = iArr8.length - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m19277b() {
        int i = this.f69774i;
        for (int i2 = 0; i != -1 && i2 < this.f69766a; i2++) {
            if (this.f69773h[i] > 0.0f) {
                return true;
            }
            i = this.f69772g[i];
        }
        return false;
    }

    @Override // p000.e70.InterfaceC5151a
    public final void clear() {
        int i = this.f69774i;
        for (int i2 = 0; i != -1 && i2 < this.f69766a; i2++) {
            dvf dvfVar = this.f69768c.f36990d[this.f69771f[i]];
            if (dvfVar != null) {
                dvfVar.removeFromRow(this.f69767b);
            }
            i = this.f69772g[i];
        }
        this.f69774i = -1;
        this.f69775j = -1;
        this.f69776k = false;
        this.f69766a = 0;
    }

    @Override // p000.e70.InterfaceC5151a
    public boolean contains(dvf dvfVar) {
        int i = this.f69774i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f69766a; i2++) {
            if (this.f69771f[i] == dvfVar.f31074c) {
                return true;
            }
            i = this.f69772g[i];
        }
        return false;
    }

    @Override // p000.e70.InterfaceC5151a
    public void display() {
        int i = this.f69766a;
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
        int i = this.f69774i;
        for (int i2 = 0; i != -1 && i2 < this.f69766a; i2++) {
            float[] fArr = this.f69773h;
            fArr[i] = fArr[i] / f;
            i = this.f69772g[i];
        }
    }

    @Override // p000.e70.InterfaceC5151a
    public final float get(dvf dvfVar) {
        int i = this.f69774i;
        for (int i2 = 0; i != -1 && i2 < this.f69766a; i2++) {
            if (this.f69771f[i] == dvfVar.f31074c) {
                return this.f69773h[i];
            }
            i = this.f69772g[i];
        }
        return 0.0f;
    }

    @Override // p000.e70.InterfaceC5151a
    public int getCurrentSize() {
        return this.f69766a;
    }

    public int getHead() {
        return this.f69774i;
    }

    public final int getId(int i) {
        return this.f69771f[i];
    }

    public final int getNextIndice(int i) {
        return this.f69772g[i];
    }

    public final float getValue(int i) {
        return this.f69773h[i];
    }

    @Override // p000.e70.InterfaceC5151a
    public dvf getVariable(int i) {
        int i2 = this.f69774i;
        for (int i3 = 0; i2 != -1 && i3 < this.f69766a; i3++) {
            if (i3 == i) {
                return this.f69768c.f36990d[this.f69771f[i2]];
            }
            i2 = this.f69772g[i2];
        }
        return null;
    }

    @Override // p000.e70.InterfaceC5151a
    public float getVariableValue(int i) {
        int i2 = this.f69774i;
        for (int i3 = 0; i2 != -1 && i3 < this.f69766a; i3++) {
            if (i3 == i) {
                return this.f69773h[i2];
            }
            i2 = this.f69772g[i2];
        }
        return 0.0f;
    }

    @Override // p000.e70.InterfaceC5151a
    public int indexOf(dvf dvfVar) {
        int i = this.f69774i;
        if (i == -1) {
            return -1;
        }
        for (int i2 = 0; i != -1 && i2 < this.f69766a; i2++) {
            if (this.f69771f[i] == dvfVar.f31074c) {
                return i;
            }
            i = this.f69772g[i];
        }
        return -1;
    }

    @Override // p000.e70.InterfaceC5151a
    public void invert() {
        int i = this.f69774i;
        for (int i2 = 0; i != -1 && i2 < this.f69766a; i2++) {
            float[] fArr = this.f69773h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f69772g[i];
        }
    }

    @Override // p000.e70.InterfaceC5151a
    public final void put(dvf dvfVar, float f) {
        if (f == 0.0f) {
            remove(dvfVar, true);
            return;
        }
        int i = this.f69774i;
        if (i == -1) {
            this.f69774i = 0;
            this.f69773h[0] = f;
            this.f69771f[0] = dvfVar.f31074c;
            this.f69772g[0] = -1;
            dvfVar.f31067N++;
            dvfVar.addToRow(this.f69767b);
            this.f69766a++;
            if (this.f69776k) {
                return;
            }
            int i2 = this.f69775j + 1;
            this.f69775j = i2;
            int[] iArr = this.f69771f;
            if (i2 >= iArr.length) {
                this.f69776k = true;
                this.f69775j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f69766a; i4++) {
            int i5 = this.f69771f[i];
            int i6 = dvfVar.f31074c;
            if (i5 == i6) {
                this.f69773h[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f69772g[i];
        }
        int length = this.f69775j;
        int i7 = length + 1;
        if (this.f69776k) {
            int[] iArr2 = this.f69771f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f69771f;
        if (length >= iArr3.length && this.f69766a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f69771f;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f69771f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f69769d * 2;
            this.f69769d = i9;
            this.f69776k = false;
            this.f69775j = length - 1;
            this.f69773h = Arrays.copyOf(this.f69773h, i9);
            this.f69771f = Arrays.copyOf(this.f69771f, this.f69769d);
            this.f69772g = Arrays.copyOf(this.f69772g, this.f69769d);
        }
        this.f69771f[length] = dvfVar.f31074c;
        this.f69773h[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f69772g;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f69772g[length] = this.f69774i;
            this.f69774i = length;
        }
        dvfVar.f31067N++;
        dvfVar.addToRow(this.f69767b);
        int i10 = this.f69766a + 1;
        this.f69766a = i10;
        if (!this.f69776k) {
            this.f69775j++;
        }
        int[] iArr7 = this.f69771f;
        if (i10 >= iArr7.length) {
            this.f69776k = true;
        }
        if (this.f69775j >= iArr7.length) {
            this.f69776k = true;
            this.f69775j = iArr7.length - 1;
        }
    }

    @Override // p000.e70.InterfaceC5151a
    public final float remove(dvf dvfVar, boolean z) {
        if (this.f69770e == dvfVar) {
            this.f69770e = null;
        }
        int i = this.f69774i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f69766a) {
            if (this.f69771f[i] == dvfVar.f31074c) {
                if (i == this.f69774i) {
                    this.f69774i = this.f69772g[i];
                } else {
                    int[] iArr = this.f69772g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    dvfVar.removeFromRow(this.f69767b);
                }
                dvfVar.f31067N--;
                this.f69766a--;
                this.f69771f[i] = -1;
                if (this.f69776k) {
                    this.f69775j = i;
                }
                return this.f69773h[i];
            }
            i2++;
            i3 = i;
            i = this.f69772g[i];
        }
        return 0.0f;
    }

    @Override // p000.e70.InterfaceC5151a
    public int sizeInBytes() {
        return (this.f69771f.length * 12) + 36;
    }

    public String toString() {
        int i = this.f69774i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f69766a; i2++) {
            str = ((str + " -> ") + this.f69773h[i] + " : ") + this.f69768c.f36990d[this.f69771f[i]];
            i = this.f69772g[i];
        }
        return str;
    }

    @Override // p000.e70.InterfaceC5151a
    public float use(e70 e70Var, boolean z) {
        float f = get(e70Var.f31973a);
        remove(e70Var.f31973a, z);
        e70.InterfaceC5151a interfaceC5151a = e70Var.f31977e;
        int currentSize = interfaceC5151a.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            dvf variable = interfaceC5151a.getVariable(i);
            add(variable, interfaceC5151a.get(variable) * f, z);
        }
        return f;
    }
}
