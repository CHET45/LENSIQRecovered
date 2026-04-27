package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class db3 {

    /* JADX INFO: renamed from: a */
    public static final int f29174a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f29175b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f29176c = 2;

    /* JADX INFO: renamed from: db3$a */
    public static class C4722a extends db3 {

        /* JADX INFO: renamed from: d */
        public double f29177d;

        /* JADX INFO: renamed from: e */
        public double[] f29178e;

        public C4722a(double d, double[] dArr) {
            this.f29177d = d;
            this.f29178e = dArr;
        }

        @Override // p000.db3
        public void getPos(double d, double[] dArr) {
            double[] dArr2 = this.f29178e;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // p000.db3
        public void getSlope(double d, double[] dArr) {
            for (int i = 0; i < this.f29178e.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // p000.db3
        public double[] getTimePoints() {
            return new double[]{this.f29177d};
        }

        @Override // p000.db3
        public void getPos(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f29178e;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // p000.db3
        public double getSlope(double d, int i) {
            return 0.0d;
        }

        @Override // p000.db3
        public double getPos(double d, int i) {
            return this.f29178e[i];
        }
    }

    public static db3 get(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        return i != 0 ? i != 2 ? new n69(dArr, dArr2) : new C4722a(dArr[0], dArr2[0]) : new qya(dArr, dArr2);
    }

    public static db3 getArc(int[] iArr, double[] dArr, double[][] dArr2) {
        return new v40(iArr, dArr, dArr2);
    }

    public abstract double getPos(double d, int i);

    public abstract void getPos(double d, double[] dArr);

    public abstract void getPos(double d, float[] fArr);

    public abstract double getSlope(double d, int i);

    public abstract void getSlope(double d, double[] dArr);

    public abstract double[] getTimePoints();
}
