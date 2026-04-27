package p000;

import p000.e36;
import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class d36 implements gue {

    /* JADX INFO: renamed from: d */
    public final e36 f28323d;

    /* JADX INFO: renamed from: e */
    public final long f28324e;

    public d36(e36 e36Var, long j) {
        this.f28323d = e36Var;
        this.f28324e = j;
    }

    private lue getSeekPoint(long j, long j2) {
        return new lue((j * 1000000) / ((long) this.f28323d.f31645e), this.f28324e + j2);
    }

    @Override // p000.gue
    public long getDurationUs() {
        return this.f28323d.getDurationUs();
    }

    @Override // p000.gue
    public gue.C6548a getSeekPoints(long j) {
        v80.checkStateNotNull(this.f28323d.f31651k);
        e36 e36Var = this.f28323d;
        e36.C5065a c5065a = e36Var.f31651k;
        long[] jArr = c5065a.f31653a;
        long[] jArr2 = c5065a.f31654b;
        int iBinarySearchFloor = t0i.binarySearchFloor(jArr, e36Var.getSampleNumber(j), true, false);
        lue seekPoint = getSeekPoint(iBinarySearchFloor == -1 ? 0L : jArr[iBinarySearchFloor], iBinarySearchFloor != -1 ? jArr2[iBinarySearchFloor] : 0L);
        if (seekPoint.f58833a == j || iBinarySearchFloor == jArr.length - 1) {
            return new gue.C6548a(seekPoint);
        }
        int i = iBinarySearchFloor + 1;
        return new gue.C6548a(seekPoint, getSeekPoint(jArr[i], jArr2[i]));
    }

    @Override // p000.gue
    public boolean isSeekable() {
        return true;
    }
}
