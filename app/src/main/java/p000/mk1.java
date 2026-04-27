package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class mk1 {

    /* JADX INFO: renamed from: d */
    public static final long f61230d = 529;

    /* JADX INFO: renamed from: e */
    public static final String f61231e = "C2Mp3TimestampTracker";

    /* JADX INFO: renamed from: a */
    public long f61232a;

    /* JADX INFO: renamed from: b */
    public long f61233b;

    /* JADX INFO: renamed from: c */
    public boolean f61234c;

    private long getBufferTimestampUs(long j) {
        return this.f61232a + Math.max(0L, ((this.f61233b - 529) * 1000000) / j);
    }

    public long getLastOutputBufferPresentationTimeUs(kq6 kq6Var) {
        return getBufferTimestampUs(kq6Var.f55009f2);
    }

    public void reset() {
        this.f61232a = 0L;
        this.f61233b = 0L;
        this.f61234c = false;
    }

    public long updateAndGetPresentationTimeUs(kq6 kq6Var, sl3 sl3Var) {
        if (this.f61233b == 0) {
            this.f61232a = sl3Var.f82164f;
        }
        if (this.f61234c) {
            return sl3Var.f82164f;
        }
        ByteBuffer byteBuffer = (ByteBuffer) u80.checkNotNull(sl3Var.f82162d);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int mpegAudioFrameSampleCount = p1b.parseMpegAudioFrameSampleCount(i);
        if (mpegAudioFrameSampleCount != -1) {
            long bufferTimestampUs = getBufferTimestampUs(kq6Var.f55009f2);
            this.f61233b += (long) mpegAudioFrameSampleCount;
            return bufferTimestampUs;
        }
        this.f61234c = true;
        this.f61233b = 0L;
        this.f61232a = sl3Var.f82164f;
        yh9.m25919w(f61231e, "MPEG audio header is invalid.");
        return sl3Var.f82164f;
    }
}
