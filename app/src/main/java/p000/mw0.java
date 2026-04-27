package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class mw0 extends sl3 {

    /* JADX INFO: renamed from: Y */
    public static final int f62464Y = 32;

    /* JADX INFO: renamed from: Z */
    @fdi
    public static final int f62465Z = 3072000;

    /* JADX INFO: renamed from: N */
    public long f62466N;

    /* JADX INFO: renamed from: Q */
    public int f62467Q;

    /* JADX INFO: renamed from: X */
    public int f62468X;

    public mw0() {
        super(2);
        this.f62468X = 32;
    }

    private boolean canAppendSampleBuffer(sl3 sl3Var) {
        ByteBuffer byteBuffer;
        if (!hasSamples()) {
            return true;
        }
        if (this.f62467Q >= this.f62468X || sl3Var.isDecodeOnly() != isDecodeOnly()) {
            return false;
        }
        ByteBuffer byteBuffer2 = sl3Var.f82162d;
        return byteBuffer2 == null || (byteBuffer = this.f82162d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public boolean append(sl3 sl3Var) {
        u80.checkArgument(!sl3Var.isEncrypted());
        u80.checkArgument(!sl3Var.hasSupplementalData());
        u80.checkArgument(!sl3Var.isEndOfStream());
        if (!canAppendSampleBuffer(sl3Var)) {
            return false;
        }
        int i = this.f62467Q;
        this.f62467Q = i + 1;
        if (i == 0) {
            this.f82164f = sl3Var.f82164f;
            if (sl3Var.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (sl3Var.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = sl3Var.f82162d;
        if (byteBuffer != null) {
            ensureSpaceForWrite(byteBuffer.remaining());
            this.f82162d.put(byteBuffer);
        }
        this.f62466N = sl3Var.f82164f;
        return true;
    }

    @Override // p000.sl3, p000.bf1
    public void clear() {
        super.clear();
        this.f62467Q = 0;
    }

    public long getFirstSampleTimeUs() {
        return this.f82164f;
    }

    public long getLastSampleTimeUs() {
        return this.f62466N;
    }

    public int getSampleCount() {
        return this.f62467Q;
    }

    public boolean hasSamples() {
        return this.f62467Q > 0;
    }

    public void setMaxSampleCount(@h78(from = 1) int i) {
        u80.checkArgument(i > 0);
        this.f62468X = i;
    }
}
