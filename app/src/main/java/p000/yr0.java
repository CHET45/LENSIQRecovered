package p000;

import androidx.media3.common.C1213a;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class yr0 extends yca {

    /* JADX INFO: renamed from: k */
    public final long f102719k;

    /* JADX INFO: renamed from: l */
    public final long f102720l;

    /* JADX INFO: renamed from: m */
    public cs0 f102721m;

    /* JADX INFO: renamed from: n */
    public int[] f102722n;

    public yr0(gh3 gh3Var, xh3 xh3Var, C1213a c1213a, int i, @hib Object obj, long j, long j2, long j3, long j4, long j5) {
        super(gh3Var, xh3Var, c1213a, i, obj, j, j2, j5);
        this.f102719k = j3;
        this.f102720l = j4;
    }

    /* JADX INFO: renamed from: a */
    public final cs0 m26305a() {
        return (cs0) v80.checkStateNotNull(this.f102721m);
    }

    public final int getFirstSampleIndex(int i) {
        return ((int[]) v80.checkStateNotNull(this.f102722n))[i];
    }

    public void init(cs0 cs0Var) {
        this.f102721m = cs0Var;
        this.f102722n = cs0Var.getWriteIndices();
    }
}
