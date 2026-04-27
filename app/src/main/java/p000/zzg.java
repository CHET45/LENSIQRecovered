package p000;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import p000.uq8;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzg {

    /* JADX INFO: renamed from: k */
    public static final String f106625k = "SplineSet";

    /* JADX INFO: renamed from: l */
    public static final int f106626l = 0;

    /* JADX INFO: renamed from: m */
    public static final int f106627m = 1;

    /* JADX INFO: renamed from: n */
    public static final int f106628n = 2;

    /* JADX INFO: renamed from: o */
    public static float f106629o = 6.2831855f;

    /* JADX INFO: renamed from: a */
    public db3 f106630a;

    /* JADX INFO: renamed from: e */
    public int f106634e;

    /* JADX INFO: renamed from: f */
    public String f106635f;

    /* JADX INFO: renamed from: i */
    public long f106638i;

    /* JADX INFO: renamed from: b */
    public int f106631b = 0;

    /* JADX INFO: renamed from: c */
    public int[] f106632c = new int[10];

    /* JADX INFO: renamed from: d */
    public float[][] f106633d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: g */
    public float[] f106636g = new float[3];

    /* JADX INFO: renamed from: h */
    public boolean f106637h = false;

    /* JADX INFO: renamed from: j */
    public float f106639j = Float.NaN;

    /* JADX INFO: renamed from: zzg$a */
    public static class C16332a extends zzg {

        /* JADX INFO: renamed from: p */
        public String f106640p;

        /* JADX INFO: renamed from: q */
        public uq8.C13649a f106641q;

        /* JADX INFO: renamed from: r */
        public uq8.C13651c f106642r = new uq8.C13651c();

        /* JADX INFO: renamed from: s */
        public float[] f106643s;

        /* JADX INFO: renamed from: t */
        public float[] f106644t;

        public C16332a(String str, uq8.C13649a c13649a) {
            this.f106640p = str.split(",")[1];
            this.f106641q = c13649a;
        }

        @Override // p000.zzg
        public void setPoint(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean setProperty(d0b d0bVar, float f, long j, gq8 gq8Var) {
            this.f106630a.getPos(f, this.f106643s);
            float[] fArr = this.f106643s;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f106638i;
            if (Float.isNaN(this.f106639j)) {
                float floatValue = gq8Var.getFloatValue(d0bVar, this.f106640p, 0);
                this.f106639j = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.f106639j = 0.0f;
                }
            }
            float f4 = (float) ((((double) this.f106639j) + ((j2 * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f106639j = f4;
            this.f106638i = j;
            float fM27162a = m27162a(f4);
            this.f106637h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f106644t;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f106637h;
                float f5 = this.f106643s[i];
                this.f106637h = z | (((double) f5) != 0.0d);
                fArr2[i] = (f5 * fM27162a) + f3;
                i++;
            }
            d0bVar.setInterpolatedValue(this.f106641q.valueAt(0), this.f106644t);
            if (f2 != 0.0f) {
                this.f106637h = true;
            }
            return this.f106637h;
        }

        @Override // p000.zzg
        public void setup(int i) {
            int size = this.f106641q.size();
            int iNumberOfInterpolatedValues = this.f106641q.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i2 = iNumberOfInterpolatedValues + 2;
            this.f106643s = new float[i2];
            this.f106644t = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.f106641q.keyAt(i3);
                fb3 fb3VarValueAt = this.f106641q.valueAt(i3);
                float[] fArrValueAt = this.f106642r.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                fb3VarValueAt.getValuesToInterpolate(this.f106643s);
                int i4 = 0;
                while (true) {
                    if (i4 < this.f106643s.length) {
                        dArr2[i3][i4] = r8[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.f106630a = db3.get(i, dArr, dArr2);
        }

        public void setPoint(int i, fb3 fb3Var, float f, int i2, float f2) {
            this.f106641q.append(i, fb3Var);
            this.f106642r.append(i, new float[]{f, f2});
            this.f106631b = Math.max(this.f106631b, i2);
        }
    }

    /* JADX INFO: renamed from: zzg$b */
    public static class C16333b extends zzg {

        /* JADX INFO: renamed from: p */
        public String f106645p;

        /* JADX INFO: renamed from: q */
        public uq8.C13650b f106646q;

        /* JADX INFO: renamed from: r */
        public uq8.C13651c f106647r = new uq8.C13651c();

        /* JADX INFO: renamed from: s */
        public float[] f106648s;

        /* JADX INFO: renamed from: t */
        public float[] f106649t;

        public C16333b(String str, uq8.C13650b c13650b) {
            this.f106645p = str.split(",")[1];
            this.f106646q = c13650b;
        }

        @Override // p000.zzg
        public void setPoint(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean setProperty(d0b d0bVar, float f, long j, gq8 gq8Var) {
            this.f106630a.getPos(f, this.f106648s);
            float[] fArr = this.f106648s;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f106638i;
            if (Float.isNaN(this.f106639j)) {
                float floatValue = gq8Var.getFloatValue(d0bVar, this.f106645p, 0);
                this.f106639j = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.f106639j = 0.0f;
                }
            }
            float f4 = (float) ((((double) this.f106639j) + ((j2 * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f106639j = f4;
            this.f106638i = j;
            float fM27162a = m27162a(f4);
            this.f106637h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f106649t;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f106637h;
                float f5 = this.f106648s[i];
                this.f106637h = z | (((double) f5) != 0.0d);
                fArr2[i] = (f5 * fM27162a) + f3;
                i++;
            }
            this.f106646q.valueAt(0).setInterpolatedValue(d0bVar, this.f106649t);
            if (f2 != 0.0f) {
                this.f106637h = true;
            }
            return this.f106637h;
        }

        @Override // p000.zzg
        public void setup(int i) {
            int size = this.f106646q.size();
            int iNumberOfInterpolatedValues = this.f106646q.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i2 = iNumberOfInterpolatedValues + 2;
            this.f106648s = new float[i2];
            this.f106649t = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.f106646q.keyAt(i3);
                ge3 ge3VarValueAt = this.f106646q.valueAt(i3);
                float[] fArrValueAt = this.f106647r.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                ge3VarValueAt.getValuesToInterpolate(this.f106648s);
                int i4 = 0;
                while (true) {
                    if (i4 < this.f106648s.length) {
                        dArr2[i3][i4] = r8[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.f106630a = db3.get(i, dArr, dArr2);
        }

        public void setPoint(int i, ge3 ge3Var, float f, int i2, float f2) {
            this.f106646q.append(i, ge3Var);
            this.f106647r.append(i, new float[]{f, f2});
            this.f106631b = Math.max(this.f106631b, i2);
        }
    }

    /* JADX INFO: renamed from: zzg$c */
    public static class C16334c {
        /* JADX INFO: renamed from: a */
        public static void m27164a(int[] iArr, float[][] fArr, int i, int i2) {
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

        private static int partition(int[] iArr, float[][] fArr, int i, int i2) {
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

        private static void swap(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* JADX INFO: renamed from: a */
    public float m27162a(float f) {
        float fAbs;
        switch (this.f106631b) {
            case 1:
                return Math.signum(f * f106629o);
            case 2:
                fAbs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * f106629o);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f * f106629o);
        }
        return 1.0f - fAbs;
    }

    /* JADX INFO: renamed from: b */
    public void m27163b(long j) {
        this.f106638i = j;
    }

    public db3 getCurveFit() {
        return this.f106630a;
    }

    public void setPoint(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f106632c;
        int i3 = this.f106634e;
        iArr[i3] = i;
        float[] fArr = this.f106633d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f106631b = Math.max(this.f106631b, i2);
        this.f106634e++;
    }

    public void setType(String str) {
        this.f106635f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setup(int r12) {
        /*
            r11 = this;
            int r0 = r11.f106634e
            if (r0 != 0) goto L1d
            java.io.PrintStream r12 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error no points added to "
            r0.append(r1)
            java.lang.String r1 = r11.f106635f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.println(r0)
            return
        L1d:
            int[] r1 = r11.f106632c
            float[][] r2 = r11.f106633d
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            p000.zzg.C16334c.m27164a(r1, r2, r4, r0)
            r0 = r3
            r1 = r4
        L29:
            int[] r2 = r11.f106632c
            int r5 = r2.length
            if (r0 >= r5) goto L3b
            r5 = r2[r0]
            int r6 = r0 + (-1)
            r2 = r2[r6]
            if (r5 == r2) goto L38
            int r1 = r1 + 1
        L38:
            int r0 = r0 + 1
            goto L29
        L3b:
            if (r1 != 0) goto L3e
            r1 = r3
        L3e:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r5 = new int[r2]
            r6 = 3
            r5[r3] = r6
            r5[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r5)
            double[][] r1 = (double[][]) r1
            r5 = r4
            r6 = r5
        L52:
            int r7 = r11.f106634e
            if (r5 >= r7) goto L8a
            if (r5 <= 0) goto L63
            int[] r7 = r11.f106632c
            r8 = r7[r5]
            int r9 = r5 + (-1)
            r7 = r7[r9]
            if (r8 != r7) goto L63
            goto L87
        L63:
            int[] r7 = r11.f106632c
            r7 = r7[r5]
            double r7 = (double) r7
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r7 * r9
            r0[r6] = r7
            r7 = r1[r6]
            float[][] r8 = r11.f106633d
            r8 = r8[r5]
            r9 = r8[r4]
            double r9 = (double) r9
            r7[r4] = r9
            r9 = r8[r3]
            double r9 = (double) r9
            r7[r3] = r9
            r8 = r8[r2]
            double r8 = (double) r8
            r7[r2] = r8
            int r6 = r6 + 1
        L87:
            int r5 = r5 + 1
            goto L52
        L8a:
            db3 r12 = p000.db3.get(r12, r0, r1)
            r11.f106630a = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zzg.setup(int):void");
    }

    public String toString() {
        String str = this.f106635f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f106634e; i++) {
            str = str + "[" + this.f106632c[i] + " , " + decimalFormat.format(this.f106633d[i]) + "] ";
        }
        return str;
    }
}
