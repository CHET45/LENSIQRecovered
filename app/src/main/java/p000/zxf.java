package p000;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;
import p000.hf0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class zxf implements hf0 {

    /* JADX INFO: renamed from: b */
    public final Object f106399b;

    /* JADX INFO: renamed from: c */
    public final ayf f106400c;

    /* JADX INFO: renamed from: d */
    public final gig f106401d;

    /* JADX INFO: renamed from: e */
    @xc7("lock")
    public final tk9 f106402e;

    /* JADX INFO: renamed from: f */
    @xc7("lock")
    public final Queue<i2h> f106403f;

    /* JADX INFO: renamed from: g */
    public float f106404g;

    /* JADX INFO: renamed from: h */
    public long f106405h;

    /* JADX INFO: renamed from: i */
    public boolean f106406i;

    /* JADX INFO: renamed from: j */
    @xc7("lock")
    public hf0.C6832a f106407j;

    /* JADX INFO: renamed from: k */
    public hf0.C6832a f106408k;

    /* JADX INFO: renamed from: l */
    public hf0.C6832a f106409l;

    /* JADX INFO: renamed from: m */
    public boolean f106410m;

    public zxf(ayf ayfVar) {
        hf0.C6832a c6832a = hf0.C6832a.f43349e;
        this.f106408k = c6832a;
        this.f106409l = c6832a;
        this.f106407j = c6832a;
        this.f106400c = ayfVar;
        Object obj = new Object();
        this.f106399b = obj;
        this.f106401d = new gig(obj, true);
        this.f106402e = new tk9();
        this.f106403f = new ArrayDeque();
        resetInternalState(true);
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public static long m27125a(ayf ayfVar, @h78(from = 1) int i, @h78(from = 0) long j) {
        v80.checkArgument(i > 0);
        v80.checkArgument(j >= 0);
        long j2 = j;
        long jM12005b = 0;
        while (j2 > 0) {
            long nextSpeedChangeSamplePosition = byf.getNextSpeedChangeSamplePosition(ayfVar, jM12005b, i);
            float sampleAlignedSpeed = byf.getSampleAlignedSpeed(ayfVar, jM12005b, i);
            long expectedFrameCountAfterProcessorApplied = gvf.getExpectedFrameCountAfterProcessorApplied(i, i, sampleAlignedSpeed, sampleAlignedSpeed, nextSpeedChangeSamplePosition - jM12005b);
            if (nextSpeedChangeSamplePosition == -1 || expectedFrameCountAfterProcessorApplied > j2) {
                jM12005b += gvf.m12005b(i, i, sampleAlignedSpeed, sampleAlignedSpeed, j2);
                j2 = 0;
            } else {
                j2 -= expectedFrameCountAfterProcessorApplied;
                jM12005b = nextSpeedChangeSamplePosition;
            }
        }
        return jM12005b;
    }

    private static long getDurationUsAfterProcessorApplied(ayf ayfVar, int i, long j) {
        return t0i.sampleCountToDurationUs(getSampleCountAfterProcessorApplied(ayfVar, i, t0i.scaleLargeValue(j, i, 1000000L, RoundingMode.HALF_EVEN)), i);
    }

    public static long getSampleCountAfterProcessorApplied(ayf ayfVar, @h78(from = 1) int i, @h78(from = 0) long j) {
        v80.checkArgument(ayfVar != null);
        v80.checkArgument(i > 0);
        long j2 = 0;
        v80.checkArgument(j >= 0);
        long expectedFrameCountAfterProcessorApplied = 0;
        while (j2 < j) {
            long nextSpeedChangeSamplePosition = byf.getNextSpeedChangeSamplePosition(ayfVar, j2, i);
            if (nextSpeedChangeSamplePosition == -1 || nextSpeedChangeSamplePosition > j) {
                nextSpeedChangeSamplePosition = j;
            }
            float sampleAlignedSpeed = byf.getSampleAlignedSpeed(ayfVar, j2, i);
            expectedFrameCountAfterProcessorApplied += gvf.getExpectedFrameCountAfterProcessorApplied(i, i, sampleAlignedSpeed, sampleAlignedSpeed, nextSpeedChangeSamplePosition - j2);
            j2 = nextSpeedChangeSamplePosition;
        }
        return expectedFrameCountAfterProcessorApplied;
    }

    private void processPendingCallbacks() {
        synchronized (this.f106399b) {
            try {
                if (this.f106407j.f43350a == -1) {
                    return;
                }
                while (!this.f106403f.isEmpty()) {
                    this.f106403f.remove().onTimestamp(getDurationUsAfterProcessorApplied(this.f106400c, this.f106407j.f43350a, this.f106402e.remove()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void resetInternalState(boolean z) {
        if (z) {
            this.f106404g = 1.0f;
        }
        this.f106405h = 0L;
        this.f106406i = false;
    }

    private void updateSpeed(float f) {
        if (f != this.f106404g) {
            this.f106404g = f;
            this.f106401d.setSpeed(f);
            this.f106401d.setPitch(f);
            this.f106401d.flush();
            this.f106406i = false;
        }
    }

    @Override // p000.hf0
    public hf0.C6832a configure(hf0.C6832a c6832a) throws hf0.C6833b {
        this.f106408k = c6832a;
        hf0.C6832a c6832aConfigure = this.f106401d.configure(c6832a);
        this.f106409l = c6832aConfigure;
        return c6832aConfigure;
    }

    @Override // p000.hf0
    public void flush() {
        this.f106410m = false;
        resetInternalState(false);
        synchronized (this.f106399b) {
            this.f106407j = this.f106408k;
            this.f106401d.flush();
            processPendingCallbacks();
        }
    }

    @Override // p000.hf0
    public long getDurationAfterProcessorApplied(long j) {
        return byf.getDurationAfterSpeedProviderApplied(this.f106400c, j);
    }

    public long getMediaDurationUs(long j) {
        int i;
        synchronized (this.f106399b) {
            i = this.f106407j.f43350a;
        }
        if (i == -1) {
            return j;
        }
        return t0i.sampleCountToDurationUs(m27125a(this.f106400c, i, t0i.scaleLargeValue(j, i, 1000000L, RoundingMode.HALF_EVEN)), i);
    }

    @Override // p000.hf0
    public ByteBuffer getOutput() {
        return this.f106401d.getOutput();
    }

    public void getSpeedAdjustedTimeAsync(long j, i2h i2hVar) {
        synchronized (this.f106399b) {
            try {
                int i = this.f106407j.f43350a;
                if (i != -1) {
                    i2hVar.onTimestamp(getDurationUsAfterProcessorApplied(this.f106400c, i, j));
                } else {
                    this.f106402e.add(j);
                    this.f106403f.add(i2hVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.hf0
    public boolean isActive() {
        return !this.f106409l.equals(hf0.C6832a.f43349e);
    }

    @Override // p000.hf0
    public boolean isEnded() {
        return this.f106410m && this.f106401d.isEnded();
    }

    @Override // p000.hf0
    public void queueEndOfStream() {
        this.f106410m = true;
        if (this.f106406i) {
            return;
        }
        this.f106401d.queueEndOfStream();
        this.f106406i = true;
    }

    @Override // p000.hf0
    public void queueInput(ByteBuffer byteBuffer) {
        hf0.C6832a c6832a;
        int i;
        synchronized (this.f106399b) {
            c6832a = this.f106407j;
        }
        float sampleAlignedSpeed = byf.getSampleAlignedSpeed(this.f106400c, this.f106405h, c6832a.f43350a);
        long nextSpeedChangeSamplePosition = byf.getNextSpeedChangeSamplePosition(this.f106400c, this.f106405h, c6832a.f43350a);
        updateSpeed(sampleAlignedSpeed);
        int iLimit = byteBuffer.limit();
        if (nextSpeedChangeSamplePosition != -1) {
            i = (int) ((nextSpeedChangeSamplePosition - this.f106405h) * ((long) c6832a.f43353d));
            byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + i));
        } else {
            i = -1;
        }
        long jPosition = byteBuffer.position();
        this.f106401d.queueInput(byteBuffer);
        if (i != -1 && ((long) byteBuffer.position()) - jPosition == i) {
            this.f106401d.queueEndOfStream();
            this.f106406i = true;
        }
        long jPosition2 = ((long) byteBuffer.position()) - jPosition;
        v80.checkState(jPosition2 % ((long) c6832a.f43353d) == 0, "A frame was not queued completely.");
        this.f106405h += jPosition2 / ((long) c6832a.f43353d);
        byteBuffer.limit(iLimit);
    }

    @Override // p000.hf0
    public void reset() {
        flush();
        hf0.C6832a c6832a = hf0.C6832a.f43349e;
        this.f106408k = c6832a;
        this.f106409l = c6832a;
        synchronized (this.f106399b) {
            this.f106407j = c6832a;
            this.f106402e.clear();
            this.f106403f.clear();
        }
        resetInternalState(true);
        this.f106401d.reset();
    }
}
