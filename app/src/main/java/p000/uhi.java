package p000;

import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class uhi implements hue {

    /* JADX INFO: renamed from: d */
    public final qhi f88027d;

    /* JADX INFO: renamed from: e */
    public final int f88028e;

    /* JADX INFO: renamed from: f */
    public final long f88029f;

    /* JADX INFO: renamed from: g */
    public final long f88030g;

    /* JADX INFO: renamed from: h */
    public final long f88031h;

    public uhi(qhi qhiVar, int i, long j, long j2) {
        this.f88027d = qhiVar;
        this.f88028e = i;
        this.f88029f = j;
        long j3 = (j2 - j) / ((long) qhiVar.f74477e);
        this.f88030g = j3;
        this.f88031h = blockIndexToTimeUs(j3);
    }

    private long blockIndexToTimeUs(long j) {
        return x0i.scaleLargeTimestamp(j * ((long) this.f88028e), 1000000L, this.f88027d.f74475c);
    }

    @Override // p000.hue
    public long getDurationUs() {
        return this.f88031h;
    }

    @Override // p000.hue
    public hue.C7023a getSeekPoints(long j) {
        long jConstrainValue = x0i.constrainValue((((long) this.f88027d.f74475c) * j) / (((long) this.f88028e) * 1000000), 0L, this.f88030g - 1);
        long j2 = this.f88029f + (((long) this.f88027d.f74477e) * jConstrainValue);
        long jBlockIndexToTimeUs = blockIndexToTimeUs(jConstrainValue);
        kue kueVar = new kue(jBlockIndexToTimeUs, j2);
        if (jBlockIndexToTimeUs >= j || jConstrainValue == this.f88030g - 1) {
            return new hue.C7023a(kueVar);
        }
        long j3 = jConstrainValue + 1;
        return new hue.C7023a(kueVar, new kue(blockIndexToTimeUs(j3), this.f88029f + (((long) this.f88027d.f74477e) * j3)));
    }

    @Override // p000.hue
    public boolean isSeekable() {
        return true;
    }
}
