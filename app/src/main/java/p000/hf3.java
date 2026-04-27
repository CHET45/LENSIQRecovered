package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class hf3 implements ff3 {

    /* JADX INFO: renamed from: b */
    public final lz1 f43362b;

    /* JADX INFO: renamed from: c */
    public final long f43363c;

    public hf3(lz1 lz1Var, long j) {
        this.f43362b = lz1Var;
        this.f43363c = j;
    }

    @Override // p000.ff3
    public long getAvailableSegmentCount(long j, long j2) {
        return this.f43362b.f59299d;
    }

    @Override // p000.ff3
    public long getDurationUs(long j, long j2) {
        return this.f43362b.f59302g[(int) j];
    }

    @Override // p000.ff3
    public long getFirstAvailableSegmentNum(long j, long j2) {
        return 0L;
    }

    @Override // p000.ff3
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // p000.ff3
    public long getNextSegmentAvailableTimeUs(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // p000.ff3
    public long getSegmentCount(long j) {
        return this.f43362b.f59299d;
    }

    @Override // p000.ff3
    public long getSegmentNum(long j, long j2) {
        return this.f43362b.getChunkIndex(j + this.f43363c);
    }

    @Override // p000.ff3
    public hpd getSegmentUrl(long j) {
        return new hpd(null, this.f43362b.f59301f[(int) j], r0.f59300e[r8]);
    }

    @Override // p000.ff3
    public long getTimeUs(long j) {
        return this.f43362b.f59303h[(int) j] - this.f43363c;
    }

    @Override // p000.ff3
    public boolean isExplicit() {
        return true;
    }
}
