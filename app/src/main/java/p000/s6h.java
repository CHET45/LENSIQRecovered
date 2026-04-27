package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class s6h {

    /* JADX INFO: renamed from: a */
    public final z5h f80850a;

    /* JADX INFO: renamed from: b */
    public final int f80851b;

    /* JADX INFO: renamed from: c */
    public final long[] f80852c;

    /* JADX INFO: renamed from: d */
    public final int[] f80853d;

    /* JADX INFO: renamed from: e */
    public final int f80854e;

    /* JADX INFO: renamed from: f */
    public final long[] f80855f;

    /* JADX INFO: renamed from: g */
    public final int[] f80856g;

    /* JADX INFO: renamed from: h */
    public final long f80857h;

    public s6h(z5h z5hVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        u80.checkArgument(iArr.length == jArr2.length);
        u80.checkArgument(jArr.length == jArr2.length);
        u80.checkArgument(iArr2.length == jArr2.length);
        this.f80850a = z5hVar;
        this.f80852c = jArr;
        this.f80853d = iArr;
        this.f80854e = i;
        this.f80855f = jArr2;
        this.f80856g = iArr2;
        this.f80857h = j;
        this.f80851b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int getIndexOfEarlierOrEqualSynchronizationSample(long j) {
        for (int iBinarySearchFloor = x0i.binarySearchFloor(this.f80855f, j, true, false); iBinarySearchFloor >= 0; iBinarySearchFloor--) {
            if ((this.f80856g[iBinarySearchFloor] & 1) != 0) {
                return iBinarySearchFloor;
            }
        }
        return -1;
    }

    public int getIndexOfLaterOrEqualSynchronizationSample(long j) {
        for (int iBinarySearchCeil = x0i.binarySearchCeil(this.f80855f, j, true, false); iBinarySearchCeil < this.f80855f.length; iBinarySearchCeil++) {
            if ((this.f80856g[iBinarySearchCeil] & 1) != 0) {
                return iBinarySearchCeil;
            }
        }
        return -1;
    }
}
