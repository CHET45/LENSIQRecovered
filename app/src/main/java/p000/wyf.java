package p000;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import p000.uq8;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
public abstract class wyf {

    /* JADX INFO: renamed from: f */
    public static final String f95796f = "SplineSet";

    /* JADX INFO: renamed from: a */
    public db3 f95797a;

    /* JADX INFO: renamed from: b */
    public int[] f95798b = new int[10];

    /* JADX INFO: renamed from: c */
    public float[] f95799c = new float[10];

    /* JADX INFO: renamed from: d */
    public int f95800d;

    /* JADX INFO: renamed from: e */
    public String f95801e;

    /* JADX INFO: renamed from: wyf$a */
    public static class C14839a extends wyf {

        /* JADX INFO: renamed from: g */
        public String f95802g;

        /* JADX INFO: renamed from: h */
        public long f95803h;

        public C14839a(String str, long j) {
            this.f95802g = str;
            this.f95803h = j;
        }

        @Override // p000.wyf
        public void setProperty(ymh ymhVar, float f) {
            ymhVar.setValue(ymhVar.getId(this.f95802g), get(f));
        }
    }

    /* JADX INFO: renamed from: wyf$b */
    public static class C14840b extends wyf {

        /* JADX INFO: renamed from: g */
        public String f95804g;

        /* JADX INFO: renamed from: h */
        public uq8.C13649a f95805h;

        /* JADX INFO: renamed from: i */
        public float[] f95806i;

        public C14840b(String str, uq8.C13649a c13649a) {
            this.f95804g = str.split(",")[1];
            this.f95805h = c13649a;
        }

        @Override // p000.wyf
        public void setPoint(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setProperty(uki ukiVar, float f) {
            this.f95797a.getPos(f, this.f95806i);
            ukiVar.setCustomValue(this.f95805h.valueAt(0), this.f95806i);
        }

        @Override // p000.wyf
        public void setup(int i) {
            int size = this.f95805h.size();
            int iNumberOfInterpolatedValues = this.f95805h.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.f95806i = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.f95805h.keyAt(i2);
                fb3 fb3VarValueAt = this.f95805h.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                fb3VarValueAt.getValuesToInterpolate(this.f95806i);
                int i3 = 0;
                while (true) {
                    if (i3 < this.f95806i.length) {
                        dArr2[i2][i3] = r6[i3];
                        i3++;
                    }
                }
            }
            this.f95797a = db3.get(i, dArr, dArr2);
        }

        public void setPoint(int i, fb3 fb3Var) {
            this.f95805h.append(i, fb3Var);
        }
    }

    /* JADX INFO: renamed from: wyf$c */
    public static class C14841c extends wyf {

        /* JADX INFO: renamed from: g */
        public String f95807g;

        /* JADX INFO: renamed from: h */
        public uq8.C13650b f95808h;

        /* JADX INFO: renamed from: i */
        public float[] f95809i;

        public C14841c(String str, uq8.C13650b c13650b) {
            this.f95807g = str.split(",")[1];
            this.f95808h = c13650b;
        }

        @Override // p000.wyf
        public void setPoint(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // p000.wyf
        public void setProperty(ymh ymhVar, float f) {
            setProperty((d0b) ymhVar, f);
        }

        @Override // p000.wyf
        public void setup(int i) {
            int size = this.f95808h.size();
            int iNumberOfInterpolatedValues = this.f95808h.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.f95809i = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.f95808h.keyAt(i2);
                ge3 ge3VarValueAt = this.f95808h.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                ge3VarValueAt.getValuesToInterpolate(this.f95809i);
                int i3 = 0;
                while (true) {
                    if (i3 < this.f95809i.length) {
                        dArr2[i2][i3] = r6[i3];
                        i3++;
                    }
                }
            }
            this.f95797a = db3.get(i, dArr, dArr2);
        }

        public void setPoint(int i, ge3 ge3Var) {
            this.f95808h.append(i, ge3Var);
        }

        public void setProperty(d0b d0bVar, float f) {
            this.f95797a.getPos(f, this.f95809i);
            this.f95808h.valueAt(0).setInterpolatedValue(d0bVar, this.f95809i);
        }
    }

    /* JADX INFO: renamed from: wyf$d */
    public static class C14842d {
        private C14842d() {
        }

        /* JADX INFO: renamed from: a */
        public static void m24872a(int[] iArr, float[] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = iArr2[i3 - 1];
                int i5 = i3 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int iPartition = partition(iArr, fArr, i4, i6);
                    iArr2[i5] = iPartition - 1;
                    iArr2[i3 - 1] = i4;
                    int i7 = i3 + 1;
                    iArr2[i3] = i6;
                    i3 += 2;
                    iArr2[i7] = iPartition + 1;
                } else {
                    i3 = i5;
                }
            }
        }

        private static int partition(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    swap(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            swap(iArr, fArr, i4, i2);
            return i4;
        }

        private static void swap(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    public static wyf makeCustomSpline(String str, uq8.C13649a c13649a) {
        return new C14840b(str, c13649a);
    }

    public static wyf makeCustomSplineSet(String str, uq8.C13650b c13650b) {
        return new C14841c(str, c13650b);
    }

    public static wyf makeSpline(String str, long j) {
        return new C14839a(str, j);
    }

    public float get(float f) {
        return (float) this.f95797a.getPos(f, 0);
    }

    public db3 getCurveFit() {
        return this.f95797a;
    }

    public float getSlope(float f) {
        return (float) this.f95797a.getSlope(f, 0);
    }

    public void setPoint(int i, float f) {
        int[] iArr = this.f95798b;
        if (iArr.length < this.f95800d + 1) {
            this.f95798b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f95799c;
            this.f95799c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f95798b;
        int i2 = this.f95800d;
        iArr2[i2] = i;
        this.f95799c[i2] = f;
        this.f95800d = i2 + 1;
    }

    public void setProperty(ymh ymhVar, float f) {
        ymhVar.setValue(ymh.InterfaceC15722a.getId(this.f95801e), get(f));
    }

    public void setType(String str) {
        this.f95801e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setup(int r10) {
        /*
            r9 = this;
            int r0 = r9.f95800d
            if (r0 != 0) goto L5
            return
        L5:
            int[] r1 = r9.f95798b
            float[] r2 = r9.f95799c
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            p000.wyf.C14842d.m24872a(r1, r2, r4, r0)
            r0 = r3
            r1 = r0
        L11:
            int r2 = r9.f95800d
            if (r0 >= r2) goto L24
            int[] r2 = r9.f95798b
            int r5 = r0 + (-1)
            r5 = r2[r5]
            r2 = r2[r0]
            if (r5 == r2) goto L21
            int r1 = r1 + 1
        L21:
            int r0 = r0 + 1
            goto L11
        L24:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r2 = new int[r2]
            r2[r3] = r3
            r2[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            double[][] r1 = (double[][]) r1
            r2 = r4
            r3 = r2
        L37:
            int r5 = r9.f95800d
            if (r2 >= r5) goto L63
            if (r2 <= 0) goto L48
            int[] r5 = r9.f95798b
            r6 = r5[r2]
            int r7 = r2 + (-1)
            r5 = r5[r7]
            if (r6 != r5) goto L48
            goto L60
        L48:
            int[] r5 = r9.f95798b
            r5 = r5[r2]
            double r5 = (double) r5
            r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r5 = r5 * r7
            r0[r3] = r5
            r5 = r1[r3]
            float[] r6 = r9.f95799c
            r6 = r6[r2]
            double r6 = (double) r6
            r5[r4] = r6
            int r3 = r3 + 1
        L60:
            int r2 = r2 + 1
            goto L37
        L63:
            db3 r10 = p000.db3.get(r10, r0, r1)
            r9.f95797a = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wyf.setup(int):void");
    }

    public String toString() {
        String str = this.f95801e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f95800d; i++) {
            str = str + "[" + this.f95798b[i] + " , " + decimalFormat.format(this.f95799c[i]) + "] ";
        }
        return str;
    }
}
