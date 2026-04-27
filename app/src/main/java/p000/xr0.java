package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class xr0 extends xca {

    /* JADX INFO: renamed from: k */
    public final long f99009k;

    /* JADX INFO: renamed from: l */
    public final long f99010l;

    /* JADX INFO: renamed from: m */
    public bs0 f99011m;

    /* JADX INFO: renamed from: n */
    public int[] f99012n;

    public xr0(ih3 ih3Var, yh3 yh3Var, kq6 kq6Var, int i, @hib Object obj, long j, long j2, long j3, long j4, long j5) {
        super(ih3Var, yh3Var, kq6Var, i, obj, j, j2, j5);
        this.f99009k = j3;
        this.f99010l = j4;
    }

    /* JADX INFO: renamed from: a */
    public final bs0 m25420a() {
        return (bs0) u80.checkStateNotNull(this.f99011m);
    }

    public final int getFirstSampleIndex(int i) {
        return ((int[]) u80.checkStateNotNull(this.f99012n))[i];
    }

    public void init(bs0 bs0Var) {
        this.f99011m = bs0Var;
        this.f99012n = bs0Var.getWriteIndices();
    }
}
