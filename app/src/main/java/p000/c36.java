package p000;

import p000.f36;
import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c36 implements hue {

    /* JADX INFO: renamed from: d */
    public final f36 f15679d;

    /* JADX INFO: renamed from: e */
    public final long f15680e;

    public c36(f36 f36Var, long j) {
        this.f15679d = f36Var;
        this.f15680e = j;
    }

    private kue getSeekPoint(long j, long j2) {
        return new kue((j * 1000000) / ((long) this.f15679d.f34984e), this.f15680e + j2);
    }

    @Override // p000.hue
    public long getDurationUs() {
        return this.f15679d.getDurationUs();
    }

    @Override // p000.hue
    public hue.C7023a getSeekPoints(long j) {
        u80.checkStateNotNull(this.f15679d.f34990k);
        f36 f36Var = this.f15679d;
        f36.C5581a c5581a = f36Var.f34990k;
        long[] jArr = c5581a.f34992a;
        long[] jArr2 = c5581a.f34993b;
        int iBinarySearchFloor = x0i.binarySearchFloor(jArr, f36Var.getSampleNumber(j), true, false);
        kue seekPoint = getSeekPoint(iBinarySearchFloor == -1 ? 0L : jArr[iBinarySearchFloor], iBinarySearchFloor != -1 ? jArr2[iBinarySearchFloor] : 0L);
        if (seekPoint.f55384a == j || iBinarySearchFloor == jArr.length - 1) {
            return new hue.C7023a(seekPoint);
        }
        int i = iBinarySearchFloor + 1;
        return new hue.C7023a(seekPoint, getSeekPoint(jArr[i], jArr2[i]));
    }

    @Override // p000.hue
    public boolean isSeekable() {
        return true;
    }
}
