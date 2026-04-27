package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class mof implements ff3 {

    /* JADX INFO: renamed from: b */
    public final hpd f61635b;

    public mof(hpd hpdVar) {
        this.f61635b = hpdVar;
    }

    @Override // p000.ff3
    public long getAvailableSegmentCount(long j, long j2) {
        return 1L;
    }

    @Override // p000.ff3
    public long getDurationUs(long j, long j2) {
        return j2;
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
        return 1L;
    }

    @Override // p000.ff3
    public long getSegmentNum(long j, long j2) {
        return 0L;
    }

    @Override // p000.ff3
    public hpd getSegmentUrl(long j) {
        return this.f61635b;
    }

    @Override // p000.ff3
    public long getTimeUs(long j) {
        return 0L;
    }

    @Override // p000.ff3
    public boolean isExplicit() {
        return true;
    }
}
