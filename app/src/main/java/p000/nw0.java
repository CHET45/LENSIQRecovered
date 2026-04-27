package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class nw0 extends rl3 {

    /* JADX INFO: renamed from: Y */
    public static final int f65870Y = 32;

    /* JADX INFO: renamed from: Z */
    @fdi
    public static final int f65871Z = 3072000;

    /* JADX INFO: renamed from: N */
    public long f65872N;

    /* JADX INFO: renamed from: Q */
    public int f65873Q;

    /* JADX INFO: renamed from: X */
    public int f65874X;

    public nw0() {
        super(2);
        this.f65874X = 32;
    }

    private boolean canAppendSampleBuffer(rl3 rl3Var) {
        ByteBuffer byteBuffer;
        if (!hasSamples()) {
            return true;
        }
        if (this.f65873Q >= this.f65874X) {
            return false;
        }
        ByteBuffer byteBuffer2 = rl3Var.f78608d;
        return byteBuffer2 == null || (byteBuffer = this.f78608d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public boolean append(rl3 rl3Var) {
        v80.checkArgument(!rl3Var.isEncrypted());
        v80.checkArgument(!rl3Var.hasSupplementalData());
        v80.checkArgument(!rl3Var.isEndOfStream());
        if (!canAppendSampleBuffer(rl3Var)) {
            return false;
        }
        int i = this.f65873Q;
        this.f65873Q = i + 1;
        if (i == 0) {
            this.f78610f = rl3Var.f78610f;
            if (rl3Var.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer = rl3Var.f78608d;
        if (byteBuffer != null) {
            ensureSpaceForWrite(byteBuffer.remaining());
            this.f78608d.put(byteBuffer);
        }
        this.f65872N = rl3Var.f78610f;
        return true;
    }

    @Override // p000.rl3, p000.cf1
    public void clear() {
        super.clear();
        this.f65873Q = 0;
    }

    public long getFirstSampleTimeUs() {
        return this.f78610f;
    }

    public long getLastSampleTimeUs() {
        return this.f65872N;
    }

    public int getSampleCount() {
        return this.f65873Q;
    }

    public boolean hasSamples() {
        return this.f65873Q > 0;
    }

    public void setMaxSampleCount(@h78(from = 1) int i) {
        v80.checkArgument(i > 0);
        this.f65874X = i;
    }
}
