package p000;

import java.nio.ByteBuffer;
import p000.hf0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class cjh extends mq0 {

    /* JADX INFO: renamed from: i */
    public int f16753i;

    /* JADX INFO: renamed from: j */
    public int f16754j;

    /* JADX INFO: renamed from: k */
    public boolean f16755k;

    /* JADX INFO: renamed from: l */
    public int f16756l;

    /* JADX INFO: renamed from: m */
    public byte[] f16757m = t0i.f83321f;

    /* JADX INFO: renamed from: n */
    public int f16758n;

    /* JADX INFO: renamed from: o */
    public long f16759o;

    @Override // p000.hf0
    public long getDurationAfterProcessorApplied(long j) {
        return j - t0i.sampleCountToDurationUs(this.f16754j + this.f16753i, this.f61732b.f43350a);
    }

    @Override // p000.mq0, p000.hf0
    public ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.f16758n) > 0) {
            m17515b(i).put(this.f16757m, 0, this.f16758n).flip();
            this.f16758n = 0;
        }
        return super.getOutput();
    }

    public long getTrimmedFrameCount() {
        return this.f16759o;
    }

    @Override // p000.mq0, p000.hf0
    public boolean isEnded() {
        return super.isEnded() && this.f16758n == 0;
    }

    @Override // p000.mq0
    public hf0.C6832a onConfigure(hf0.C6832a c6832a) throws hf0.C6833b {
        if (!t0i.isEncodingLinearPcm(c6832a.f43352c)) {
            throw new hf0.C6833b(c6832a);
        }
        this.f16755k = true;
        return (this.f16753i == 0 && this.f16754j == 0) ? hf0.C6832a.f43349e : c6832a;
    }

    @Override // p000.mq0
    public void onFlush() {
        if (this.f16755k) {
            this.f16755k = false;
            int i = this.f16754j;
            int i2 = this.f61732b.f43353d;
            this.f16757m = new byte[i * i2];
            this.f16756l = this.f16753i * i2;
        }
        this.f16758n = 0;
    }

    @Override // p000.mq0
    public void onQueueEndOfStream() {
        if (this.f16755k) {
            int i = this.f16758n;
            if (i > 0) {
                this.f16759o += (long) (i / this.f61732b.f43353d);
            }
            this.f16758n = 0;
        }
    }

    @Override // p000.mq0
    public void onReset() {
        this.f16757m = t0i.f83321f;
    }

    @Override // p000.hf0
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f16756l);
        this.f16759o += (long) (iMin / this.f61732b.f43353d);
        this.f16756l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f16756l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f16758n + i2) - this.f16757m.length;
        ByteBuffer byteBufferM17515b = m17515b(length);
        int iConstrainValue = t0i.constrainValue(length, 0, this.f16758n);
        byteBufferM17515b.put(this.f16757m, 0, iConstrainValue);
        int iConstrainValue2 = t0i.constrainValue(length - iConstrainValue, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iConstrainValue2);
        byteBufferM17515b.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iConstrainValue2;
        int i4 = this.f16758n - iConstrainValue;
        this.f16758n = i4;
        byte[] bArr = this.f16757m;
        System.arraycopy(bArr, iConstrainValue, bArr, 0, i4);
        byteBuffer.get(this.f16757m, this.f16758n, i3);
        this.f16758n += i3;
        byteBufferM17515b.flip();
    }

    public void resetTrimmedFrameCount() {
        this.f16759o = 0L;
    }

    public void setTrimFrameCount(int i, int i2) {
        this.f16753i = i;
        this.f16754j = i2;
    }
}
