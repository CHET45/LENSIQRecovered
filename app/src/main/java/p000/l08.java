package p000;

import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class l08 implements gue {

    /* JADX INFO: renamed from: d */
    public final pk9 f55849d;

    /* JADX INFO: renamed from: e */
    public final pk9 f55850e;

    /* JADX INFO: renamed from: f */
    public long f55851f;

    public l08(long[] jArr, long[] jArr2, long j) {
        v80.checkArgument(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f55849d = new pk9(length);
            this.f55850e = new pk9(length);
        } else {
            int i = length + 1;
            pk9 pk9Var = new pk9(i);
            this.f55849d = pk9Var;
            pk9 pk9Var2 = new pk9(i);
            this.f55850e = pk9Var2;
            pk9Var.add(0L);
            pk9Var2.add(0L);
        }
        this.f55849d.addAll(jArr);
        this.f55850e.addAll(jArr2);
        this.f55851f = j;
    }

    public void addSeekPoint(long j, long j2) {
        if (this.f55850e.size() == 0 && j > 0) {
            this.f55849d.add(0L);
            this.f55850e.add(0L);
        }
        this.f55849d.add(j2);
        this.f55850e.add(j);
    }

    @Override // p000.gue
    public long getDurationUs() {
        return this.f55851f;
    }

    @Override // p000.gue
    public gue.C6548a getSeekPoints(long j) {
        if (this.f55850e.size() == 0) {
            return new gue.C6548a(lue.f58832c);
        }
        int iBinarySearchFloor = t0i.binarySearchFloor(this.f55850e, j, true, true);
        lue lueVar = new lue(this.f55850e.get(iBinarySearchFloor), this.f55849d.get(iBinarySearchFloor));
        if (lueVar.f58833a == j || iBinarySearchFloor == this.f55850e.size() - 1) {
            return new gue.C6548a(lueVar);
        }
        int i = iBinarySearchFloor + 1;
        return new gue.C6548a(lueVar, new lue(this.f55850e.get(i), this.f55849d.get(i)));
    }

    public long getTimeUs(long j) {
        if (this.f55850e.size() == 0) {
            return -9223372036854775807L;
        }
        return this.f55850e.get(t0i.binarySearchFloor(this.f55849d, j, true, true));
    }

    @Override // p000.gue
    public boolean isSeekable() {
        return this.f55850e.size() > 0;
    }

    public boolean isTimeUsInIndex(long j, long j2) {
        if (this.f55850e.size() == 0) {
            return false;
        }
        pk9 pk9Var = this.f55850e;
        return j - pk9Var.get(pk9Var.size() - 1) < j2;
    }

    public void setDurationUs(long j) {
        this.f55851f = j;
    }
}
