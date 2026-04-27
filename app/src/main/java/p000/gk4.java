package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class gk4 extends rbd<double[]> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final double[] f39998d;

    public gk4(int i) {
        super(i);
        this.f39998d = new double[i];
    }

    public final void add(double d) {
        double[] dArr = this.f39998d;
        int iM21109a = m21109a();
        m21110b(iM21109a + 1);
        dArr[iM21109a] = d;
    }

    @Override // p000.rbd
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int getSize(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @yfb
    public final double[] toArray() {
        return m21112d(this.f39998d, new double[m21111c()]);
    }
}
