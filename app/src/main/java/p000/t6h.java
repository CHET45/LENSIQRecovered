package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class t6h {

    /* JADX INFO: renamed from: a */
    public final y5h f83873a;

    /* JADX INFO: renamed from: b */
    public final int f83874b;

    /* JADX INFO: renamed from: c */
    public final long[] f83875c;

    /* JADX INFO: renamed from: d */
    public final int[] f83876d;

    /* JADX INFO: renamed from: e */
    public final int f83877e;

    /* JADX INFO: renamed from: f */
    public final long[] f83878f;

    /* JADX INFO: renamed from: g */
    public final int[] f83879g;

    /* JADX INFO: renamed from: h */
    public final long f83880h;

    public t6h(y5h y5hVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        v80.checkArgument(iArr.length == jArr2.length);
        v80.checkArgument(jArr.length == jArr2.length);
        v80.checkArgument(iArr2.length == jArr2.length);
        this.f83873a = y5hVar;
        this.f83875c = jArr;
        this.f83876d = iArr;
        this.f83877e = i;
        this.f83878f = jArr2;
        this.f83879g = iArr2;
        this.f83880h = j;
        this.f83874b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int getIndexOfEarlierOrEqualSynchronizationSample(long j) {
        for (int iBinarySearchFloor = t0i.binarySearchFloor(this.f83878f, j, true, false); iBinarySearchFloor >= 0; iBinarySearchFloor--) {
            if ((this.f83879g[iBinarySearchFloor] & 1) != 0) {
                return iBinarySearchFloor;
            }
        }
        return -1;
    }

    public int getIndexOfLaterOrEqualSynchronizationSample(long j) {
        for (int iBinarySearchCeil = t0i.binarySearchCeil(this.f83878f, j, true, false); iBinarySearchCeil < this.f83878f.length; iBinarySearchCeil++) {
            if ((this.f83879g[iBinarySearchCeil] & 1) != 0) {
                return iBinarySearchCeil;
            }
        }
        return -1;
    }
}
