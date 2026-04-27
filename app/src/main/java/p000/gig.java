package p000;

import java.nio.ByteBuffer;
import p000.hf0;

/* JADX INFO: loaded from: classes3.dex */
public class gig implements hf0 {

    /* JADX INFO: renamed from: b */
    public final Object f39882b;

    /* JADX INFO: renamed from: c */
    public final ivf f39883c;

    public gig(Object obj, boolean z) {
        this.f39882b = obj;
        this.f39883c = new ivf(z);
    }

    @Override // p000.hf0
    public final hf0.C6832a configure(hf0.C6832a c6832a) throws hf0.C6833b {
        hf0.C6832a c6832aConfigure;
        synchronized (this.f39882b) {
            c6832aConfigure = this.f39883c.configure(c6832a);
        }
        return c6832aConfigure;
    }

    @Override // p000.hf0
    public final void flush() {
        synchronized (this.f39882b) {
            this.f39883c.flush();
        }
    }

    @Override // p000.hf0
    public long getDurationAfterProcessorApplied(long j) {
        return getPlayoutDuration(j);
    }

    public final long getMediaDuration(long j) {
        long mediaDuration;
        synchronized (this.f39882b) {
            mediaDuration = this.f39883c.getMediaDuration(j);
        }
        return mediaDuration;
    }

    @Override // p000.hf0
    public final ByteBuffer getOutput() {
        ByteBuffer output;
        synchronized (this.f39882b) {
            output = this.f39883c.getOutput();
        }
        return output;
    }

    public final long getPlayoutDuration(long j) {
        long playoutDuration;
        synchronized (this.f39882b) {
            playoutDuration = this.f39883c.getPlayoutDuration(j);
        }
        return playoutDuration;
    }

    public final long getProcessedInputBytes() {
        long processedInputBytes;
        synchronized (this.f39882b) {
            processedInputBytes = this.f39883c.getProcessedInputBytes();
        }
        return processedInputBytes;
    }

    @Override // p000.hf0
    public final boolean isActive() {
        boolean zIsActive;
        synchronized (this.f39882b) {
            zIsActive = this.f39883c.isActive();
        }
        return zIsActive;
    }

    @Override // p000.hf0
    public final boolean isEnded() {
        boolean zIsEnded;
        synchronized (this.f39882b) {
            zIsEnded = this.f39883c.isEnded();
        }
        return zIsEnded;
    }

    @Override // p000.hf0
    public final void queueEndOfStream() {
        synchronized (this.f39882b) {
            this.f39883c.queueEndOfStream();
        }
    }

    @Override // p000.hf0
    public final void queueInput(ByteBuffer byteBuffer) {
        synchronized (this.f39882b) {
            this.f39883c.queueInput(byteBuffer);
        }
    }

    @Override // p000.hf0
    public final void reset() {
        synchronized (this.f39882b) {
            this.f39883c.reset();
        }
    }

    public final void setOutputSampleRateHz(int i) {
        synchronized (this.f39882b) {
            this.f39883c.setOutputSampleRateHz(i);
        }
    }

    public final void setPitch(float f) {
        synchronized (this.f39882b) {
            this.f39883c.setPitch(f);
        }
    }

    public final void setSpeed(float f) {
        synchronized (this.f39882b) {
            this.f39883c.setSpeed(f);
        }
    }
}
