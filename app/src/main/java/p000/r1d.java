package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class r1d implements q1d {
    @Override // p000.q1d
    public double distance(double[] dArr, double[] dArr2) {
        double d = dArr[0] - dArr2[0];
        double d2 = dArr[1] - dArr2[1];
        double d3 = dArr[2] - dArr2[2];
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    @Override // p000.q1d
    public double[] fromInt(int i) {
        double[] dArrLabFromArgb = xa2.labFromArgb(i);
        return new double[]{dArrLabFromArgb[0], dArrLabFromArgb[1], dArrLabFromArgb[2]};
    }

    @Override // p000.q1d
    public int toInt(double[] dArr) {
        return xa2.argbFromLab(dArr[0], dArr[1], dArr[2]);
    }
}
