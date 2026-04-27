package p000;

import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class rt2 implements hue {

    /* JADX INFO: renamed from: d */
    public final long f79448d;

    /* JADX INFO: renamed from: e */
    public final long f79449e;

    /* JADX INFO: renamed from: f */
    public final int f79450f;

    /* JADX INFO: renamed from: g */
    public final long f79451g;

    /* JADX INFO: renamed from: h */
    public final int f79452h;

    /* JADX INFO: renamed from: i */
    public final long f79453i;

    /* JADX INFO: renamed from: j */
    public final boolean f79454j;

    public rt2(long j, long j2, int i, int i2) {
        this(j, j2, i, i2, false);
    }

    private long getFramePositionForTimeUs(long j) {
        long j2 = (j * ((long) this.f79452h)) / 8000000;
        int i = this.f79450f;
        long jMin = (j2 / ((long) i)) * ((long) i);
        long j3 = this.f79451g;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - ((long) i));
        }
        return this.f79449e + Math.max(jMin, 0L);
    }

    @Override // p000.hue
    public long getDurationUs() {
        return this.f79453i;
    }

    @Override // p000.hue
    public hue.C7023a getSeekPoints(long j) {
        if (this.f79451g == -1 && !this.f79454j) {
            return new hue.C7023a(new kue(0L, this.f79449e));
        }
        long framePositionForTimeUs = getFramePositionForTimeUs(j);
        long timeUsAtPosition = getTimeUsAtPosition(framePositionForTimeUs);
        kue kueVar = new kue(timeUsAtPosition, framePositionForTimeUs);
        if (this.f79451g != -1 && timeUsAtPosition < j) {
            int i = this.f79450f;
            if (((long) i) + framePositionForTimeUs < this.f79448d) {
                long j2 = framePositionForTimeUs + ((long) i);
                return new hue.C7023a(kueVar, new kue(getTimeUsAtPosition(j2), j2));
            }
        }
        return new hue.C7023a(kueVar);
    }

    public long getTimeUsAtPosition(long j) {
        return getTimeUsAtPosition(j, this.f79449e, this.f79452h);
    }

    @Override // p000.hue
    public boolean isSeekable() {
        return this.f79451g != -1 || this.f79454j;
    }

    public rt2(long j, long j2, int i, int i2, boolean z) {
        this.f79448d = j;
        this.f79449e = j2;
        this.f79450f = i2 == -1 ? 1 : i2;
        this.f79452h = i;
        this.f79454j = z;
        if (j == -1) {
            this.f79451g = -1L;
            this.f79453i = -9223372036854775807L;
        } else {
            this.f79451g = j - j2;
            this.f79453i = getTimeUsAtPosition(j, j2, i);
        }
    }

    private static long getTimeUsAtPosition(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }
}
