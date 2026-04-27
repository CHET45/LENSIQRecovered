package p000;

import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m08 implements oue {

    /* JADX INFO: renamed from: h */
    @fdi
    public static final long f59528h = 100000;

    /* JADX INFO: renamed from: d */
    public final long f59529d;

    /* JADX INFO: renamed from: e */
    public final ok9 f59530e;

    /* JADX INFO: renamed from: f */
    public final ok9 f59531f;

    /* JADX INFO: renamed from: g */
    public long f59532g;

    public m08(long j, long j2, long j3) {
        this.f59532g = j;
        this.f59529d = j3;
        ok9 ok9Var = new ok9();
        this.f59530e = ok9Var;
        ok9 ok9Var2 = new ok9();
        this.f59531f = ok9Var2;
        ok9Var.add(0L);
        ok9Var2.add(j2);
    }

    /* JADX INFO: renamed from: a */
    public void m16541a(long j) {
        this.f59532g = j;
    }

    @Override // p000.oue
    public long getDataEndPosition() {
        return this.f59529d;
    }

    @Override // p000.hue
    public long getDurationUs() {
        return this.f59532g;
    }

    @Override // p000.hue
    public hue.C7023a getSeekPoints(long j) {
        int iBinarySearchFloor = x0i.binarySearchFloor(this.f59530e, j, true, true);
        kue kueVar = new kue(this.f59530e.get(iBinarySearchFloor), this.f59531f.get(iBinarySearchFloor));
        if (kueVar.f55384a == j || iBinarySearchFloor == this.f59530e.size() - 1) {
            return new hue.C7023a(kueVar);
        }
        int i = iBinarySearchFloor + 1;
        return new hue.C7023a(kueVar, new kue(this.f59530e.get(i), this.f59531f.get(i)));
    }

    @Override // p000.oue
    public long getTimeUs(long j) {
        return this.f59530e.get(x0i.binarySearchFloor(this.f59531f, j, true, true));
    }

    @Override // p000.hue
    public boolean isSeekable() {
        return true;
    }

    public boolean isTimeUsInIndex(long j) {
        ok9 ok9Var = this.f59530e;
        return j - ok9Var.get(ok9Var.size() - 1) < 100000;
    }

    public void maybeAddSeekPoint(long j, long j2) {
        if (isTimeUsInIndex(j)) {
            return;
        }
        this.f59530e.add(j);
        this.f59531f.add(j2);
    }
}
