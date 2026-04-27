package p000;

import java.math.RoundingMode;
import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
public final class n08 implements nue {

    /* JADX INFO: renamed from: h */
    @fdi
    public static final long f62889h = 100000;

    /* JADX INFO: renamed from: d */
    public final long f62890d;

    /* JADX INFO: renamed from: e */
    public final long f62891e;

    /* JADX INFO: renamed from: f */
    public final int f62892f;

    /* JADX INFO: renamed from: g */
    public final l08 f62893g;

    public n08(long j, long j2, long j3) {
        this.f62893g = new l08(new long[]{j2}, new long[]{0}, j);
        this.f62890d = j2;
        this.f62891e = j3;
        int i = -2147483647;
        if (j == -9223372036854775807L) {
            this.f62892f = -2147483647;
            return;
        }
        long jScaleLargeValue = t0i.scaleLargeValue(j2 - j3, 8L, j, RoundingMode.HALF_UP);
        if (jScaleLargeValue > 0 && jScaleLargeValue <= 2147483647L) {
            i = (int) jScaleLargeValue;
        }
        this.f62892f = i;
    }

    /* JADX INFO: renamed from: a */
    public void m17690a(long j) {
        this.f62893g.setDurationUs(j);
    }

    @Override // p000.nue
    public int getAverageBitrate() {
        return this.f62892f;
    }

    @Override // p000.nue
    public long getDataEndPosition() {
        return this.f62891e;
    }

    @Override // p000.nue
    public long getDataStartPosition() {
        return this.f62890d;
    }

    @Override // p000.gue
    public long getDurationUs() {
        return this.f62893g.getDurationUs();
    }

    @Override // p000.gue
    public gue.C6548a getSeekPoints(long j) {
        return this.f62893g.getSeekPoints(j);
    }

    @Override // p000.nue
    public long getTimeUs(long j) {
        return this.f62893g.getTimeUs(j);
    }

    @Override // p000.gue
    public boolean isSeekable() {
        return this.f62893g.isSeekable();
    }

    public boolean isTimeUsInIndex(long j) {
        return this.f62893g.isTimeUsInIndex(j, 100000L);
    }

    public void maybeAddSeekPoint(long j, long j2) {
        if (isTimeUsInIndex(j)) {
            return;
        }
        this.f62893g.addSeekPoint(j, j2);
    }
}
