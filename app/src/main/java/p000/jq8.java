package p000;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
public abstract class jq8 {

    /* JADX INFO: renamed from: h */
    public static final String f51445h = "KeyCycleOscillator";

    /* JADX INFO: renamed from: a */
    public db3 f51446a;

    /* JADX INFO: renamed from: b */
    public C8014c f51447b;

    /* JADX INFO: renamed from: c */
    public String f51448c;

    /* JADX INFO: renamed from: d */
    public int f51449d = 0;

    /* JADX INFO: renamed from: e */
    public String f51450e = null;

    /* JADX INFO: renamed from: f */
    public int f51451f = 0;

    /* JADX INFO: renamed from: g */
    public ArrayList<C8018g> f51452g = new ArrayList<>();

    /* JADX INFO: renamed from: jq8$a */
    public class C8012a implements Comparator<C8018g> {
        public C8012a() {
        }

        @Override // java.util.Comparator
        public int compare(C8018g c8018g, C8018g c8018g2) {
            return Integer.compare(c8018g.f51476a, c8018g2.f51476a);
        }
    }

    /* JADX INFO: renamed from: jq8$b */
    public static class C8013b extends jq8 {

        /* JADX INFO: renamed from: i */
        public String f51454i;

        /* JADX INFO: renamed from: j */
        public int f51455j;

        public C8013b(String str) {
            this.f51454i = str;
            this.f51455j = ymh.InterfaceC15724c.getId(str);
        }

        @Override // p000.jq8
        public void setProperty(d0b d0bVar, float f) {
            d0bVar.setValue(this.f51455j, get(f));
        }
    }

    /* JADX INFO: renamed from: jq8$c */
    public static class C8014c {

        /* JADX INFO: renamed from: q */
        public static final int f51456q = -1;

        /* JADX INFO: renamed from: r */
        public static final String f51457r = "CycleOscillator";

        /* JADX INFO: renamed from: a */
        public final int f51458a;

        /* JADX INFO: renamed from: b */
        public v7c f51459b;

        /* JADX INFO: renamed from: c */
        public final int f51460c;

        /* JADX INFO: renamed from: d */
        public final int f51461d;

        /* JADX INFO: renamed from: e */
        public final int f51462e;

        /* JADX INFO: renamed from: f */
        public float[] f51463f;

        /* JADX INFO: renamed from: g */
        public double[] f51464g;

        /* JADX INFO: renamed from: h */
        public float[] f51465h;

        /* JADX INFO: renamed from: i */
        public float[] f51466i;

        /* JADX INFO: renamed from: j */
        public float[] f51467j;

        /* JADX INFO: renamed from: k */
        public float[] f51468k;

        /* JADX INFO: renamed from: l */
        public int f51469l;

        /* JADX INFO: renamed from: m */
        public db3 f51470m;

        /* JADX INFO: renamed from: n */
        public double[] f51471n;

        /* JADX INFO: renamed from: o */
        public double[] f51472o;

        /* JADX INFO: renamed from: p */
        public float f51473p;

        public C8014c(int i, String str, int i2, int i3) {
            v7c v7cVar = new v7c();
            this.f51459b = v7cVar;
            this.f51460c = 0;
            this.f51461d = 1;
            this.f51462e = 2;
            this.f51469l = i;
            this.f51458a = i2;
            v7cVar.setType(i, str);
            this.f51463f = new float[i3];
            this.f51464g = new double[i3];
            this.f51465h = new float[i3];
            this.f51466i = new float[i3];
            this.f51467j = new float[i3];
            this.f51468k = new float[i3];
        }

        public double getLastPhase() {
            return this.f51471n[1];
        }

        public double getSlope(float f) {
            db3 db3Var = this.f51470m;
            if (db3Var != null) {
                double d = f;
                db3Var.getSlope(d, this.f51472o);
                this.f51470m.getPos(d, this.f51471n);
            } else {
                double[] dArr = this.f51472o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = f;
            double value = this.f51459b.getValue(d2, this.f51471n[1]);
            double slope = this.f51459b.getSlope(d2, this.f51471n[1], this.f51472o[1]);
            double[] dArr2 = this.f51472o;
            return dArr2[0] + (value * dArr2[2]) + (slope * this.f51471n[2]);
        }

        public double getValues(float f) {
            db3 db3Var = this.f51470m;
            if (db3Var != null) {
                db3Var.getPos(f, this.f51471n);
            } else {
                double[] dArr = this.f51471n;
                dArr[0] = this.f51466i[0];
                dArr[1] = this.f51467j[0];
                dArr[2] = this.f51463f[0];
            }
            double[] dArr2 = this.f51471n;
            return dArr2[0] + (this.f51459b.getValue(f, dArr2[1]) * this.f51471n[2]);
        }

        public void setPoint(int i, int i2, float f, float f2, float f3, float f4) {
            this.f51464g[i] = ((double) i2) / 100.0d;
            this.f51465h[i] = f;
            this.f51466i[i] = f2;
            this.f51467j[i] = f3;
            this.f51463f[i] = f4;
        }

        public void setup(float f) {
            this.f51473p = f;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f51464g.length, 3);
            float[] fArr = this.f51463f;
            this.f51471n = new double[fArr.length + 2];
            this.f51472o = new double[fArr.length + 2];
            if (this.f51464g[0] > 0.0d) {
                this.f51459b.addPoint(0.0d, this.f51465h[0]);
            }
            double[] dArr2 = this.f51464g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f51459b.addPoint(1.0d, this.f51465h[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = this.f51466i[i];
                dArr3[1] = this.f51467j[i];
                dArr3[2] = this.f51463f[i];
                this.f51459b.addPoint(this.f51464g[i], this.f51465h[i]);
            }
            this.f51459b.normalize();
            double[] dArr4 = this.f51464g;
            if (dArr4.length > 1) {
                this.f51470m = db3.get(0, dArr4, dArr);
            } else {
                this.f51470m = null;
            }
        }
    }

    /* JADX INFO: renamed from: jq8$d */
    public static class C8015d {
        private C8015d() {
        }

        /* JADX INFO: renamed from: a */
        public static void m14235a(int[] iArr, float[] fArr, int i, int i2) {
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

    /* JADX INFO: renamed from: jq8$e */
    public static class C8016e {
        private C8016e() {
        }

        /* JADX INFO: renamed from: a */
        public static void m14236a(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = iArr2[i3 - 1];
                int i5 = i3 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int iPartition = partition(iArr, fArr, fArr2, i4, i6);
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

        private static int partition(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    swap(iArr, fArr, fArr2, i4, i);
                    i4++;
                }
                i++;
            }
            swap(iArr, fArr, fArr2, i4, i2);
            return i4;
        }

        private static void swap(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
            float f2 = fArr2[i];
            fArr2[i] = fArr2[i2];
            fArr2[i2] = f2;
        }
    }

    /* JADX INFO: renamed from: jq8$f */
    public static class C8017f extends jq8 {

        /* JADX INFO: renamed from: i */
        public String f51474i;

        /* JADX INFO: renamed from: j */
        public int f51475j;

        public C8017f(String str) {
            this.f51474i = str;
            this.f51475j = ymh.InterfaceC15724c.getId(str);
        }

        public void setPathRotate(d0b d0bVar, float f, double d, double d2) {
            d0bVar.setRotationZ(get(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }

        @Override // p000.jq8
        public void setProperty(d0b d0bVar, float f) {
            d0bVar.setValue(this.f51475j, get(f));
        }
    }

    /* JADX INFO: renamed from: jq8$g */
    public static class C8018g {

        /* JADX INFO: renamed from: a */
        public int f51476a;

        /* JADX INFO: renamed from: b */
        public float f51477b;

        /* JADX INFO: renamed from: c */
        public float f51478c;

        /* JADX INFO: renamed from: d */
        public float f51479d;

        /* JADX INFO: renamed from: e */
        public float f51480e;

        public C8018g(int i, float f, float f2, float f3, float f4) {
            this.f51476a = i;
            this.f51477b = f4;
            this.f51478c = f2;
            this.f51479d = f;
            this.f51480e = f3;
        }
    }

    public static jq8 makeWidgetCycle(String str) {
        return str.equals("pathRotate") ? new C8017f(str) : new C8013b(str);
    }

    /* JADX INFO: renamed from: a */
    public void mo14234a(Object obj) {
    }

    public float get(float f) {
        return (float) this.f51447b.getValues(f);
    }

    public db3 getCurveFit() {
        return this.f51446a;
    }

    public float getSlope(float f) {
        return (float) this.f51447b.getSlope(f);
    }

    public void setPoint(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        this.f51452g.add(new C8018g(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f51451f = i3;
        }
        this.f51449d = i2;
        mo14234a(obj);
        this.f51450e = str;
    }

    public void setProperty(d0b d0bVar, float f) {
    }

    public void setType(String str) {
        this.f51448c = str;
    }

    public void setup(float f) {
        int size = this.f51452g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f51452g, new C8012a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f51447b = new C8014c(this.f51449d, this.f51450e, this.f51451f, size);
        int i = 0;
        for (C8018g c8018g : this.f51452g) {
            float f2 = c8018g.f51479d;
            dArr[i] = ((double) f2) * 0.01d;
            double[] dArr3 = dArr2[i];
            float f3 = c8018g.f51477b;
            dArr3[0] = f3;
            float f4 = c8018g.f51478c;
            dArr3[1] = f4;
            float f5 = c8018g.f51480e;
            dArr3[2] = f5;
            this.f51447b.setPoint(i, c8018g.f51476a, f2, f4, f5, f3);
            i++;
            dArr2 = dArr2;
        }
        this.f51447b.setup(f);
        this.f51446a = db3.get(0, dArr, dArr2);
    }

    public String toString() {
        String str = this.f51448c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<C8018g> it = this.f51452g.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().f51476a + " , " + decimalFormat.format(r3.f51477b) + "] ";
        }
        return str;
    }

    public boolean variesByPath() {
        return this.f51451f == 1;
    }

    public void setPoint(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        this.f51452g.add(new C8018g(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f51451f = i3;
        }
        this.f51449d = i2;
        this.f51450e = str;
    }
}
