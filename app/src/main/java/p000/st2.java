package p000;

import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class st2 implements gue {

    /* JADX INFO: renamed from: d */
    public final long f82804d;

    /* JADX INFO: renamed from: e */
    public final long f82805e;

    /* JADX INFO: renamed from: f */
    public final int f82806f;

    /* JADX INFO: renamed from: g */
    public final long f82807g;

    /* JADX INFO: renamed from: h */
    public final int f82808h;

    /* JADX INFO: renamed from: i */
    public final long f82809i;

    /* JADX INFO: renamed from: j */
    public final boolean f82810j;

    public st2(long j, long j2, int i, int i2) {
        this(j, j2, i, i2, false);
    }

    private long getFramePositionForTimeUs(long j) {
        long j2 = (j * ((long) this.f82808h)) / 8000000;
        int i = this.f82806f;
        long jMin = (j2 / ((long) i)) * ((long) i);
        long j3 = this.f82807g;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - ((long) i));
        }
        return this.f82805e + Math.max(jMin, 0L);
    }

    @Override // p000.gue
    public long getDurationUs() {
        return this.f82809i;
    }

    @Override // p000.gue
    public gue.C6548a getSeekPoints(long j) {
        if (this.f82807g == -1 && !this.f82810j) {
            return new gue.C6548a(new lue(0L, this.f82805e));
        }
        long framePositionForTimeUs = getFramePositionForTimeUs(j);
        long timeUsAtPosition = getTimeUsAtPosition(framePositionForTimeUs);
        lue lueVar = new lue(timeUsAtPosition, framePositionForTimeUs);
        if (this.f82807g != -1 && timeUsAtPosition < j) {
            int i = this.f82806f;
            if (((long) i) + framePositionForTimeUs < this.f82804d) {
                long j2 = framePositionForTimeUs + ((long) i);
                return new gue.C6548a(lueVar, new lue(getTimeUsAtPosition(j2), j2));
            }
        }
        return new gue.C6548a(lueVar);
    }

    public long getTimeUsAtPosition(long j) {
        return getTimeUsAtPosition(j, this.f82805e, this.f82808h);
    }

    @Override // p000.gue
    public boolean isSeekable() {
        return this.f82807g != -1 || this.f82810j;
    }

    public st2(long j, long j2, int i, int i2, boolean z) {
        this.f82804d = j;
        this.f82805e = j2;
        this.f82806f = i2 == -1 ? 1 : i2;
        this.f82808h = i;
        this.f82810j = z;
        if (j == -1) {
            this.f82807g = -1L;
            this.f82809i = -9223372036854775807L;
        } else {
            this.f82807g = j - j2;
            this.f82809i = getTimeUsAtPosition(j, j2, i);
        }
    }

    private static long getTimeUsAtPosition(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }
}
