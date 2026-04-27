package p000;

import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k08 implements hue {

    /* JADX INFO: renamed from: d */
    public final long[] f52324d;

    /* JADX INFO: renamed from: e */
    public final long[] f52325e;

    /* JADX INFO: renamed from: f */
    public final long f52326f;

    /* JADX INFO: renamed from: g */
    public final boolean f52327g;

    public k08(long[] jArr, long[] jArr2, long j) {
        u80.checkArgument(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f52327g = z;
        if (!z || jArr2[0] <= 0) {
            this.f52324d = jArr;
            this.f52325e = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f52324d = jArr3;
            long[] jArr4 = new long[i];
            this.f52325e = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f52326f = j;
    }

    @Override // p000.hue
    public long getDurationUs() {
        return this.f52326f;
    }

    @Override // p000.hue
    public hue.C7023a getSeekPoints(long j) {
        if (!this.f52327g) {
            return new hue.C7023a(kue.f55383c);
        }
        int iBinarySearchFloor = x0i.binarySearchFloor(this.f52325e, j, true, true);
        kue kueVar = new kue(this.f52325e[iBinarySearchFloor], this.f52324d[iBinarySearchFloor]);
        if (kueVar.f55384a == j || iBinarySearchFloor == this.f52325e.length - 1) {
            return new hue.C7023a(kueVar);
        }
        int i = iBinarySearchFloor + 1;
        return new hue.C7023a(kueVar, new kue(this.f52325e[i], this.f52324d[i]));
    }

    @Override // p000.hue
    public boolean isSeekable() {
        return this.f52327g;
    }
}
