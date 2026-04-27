package p000;

import java.nio.ByteBuffer;
import p000.if0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class bjh extends lq0 {

    /* JADX INFO: renamed from: p */
    public static final int f13887p = 2;

    /* JADX INFO: renamed from: i */
    public int f13888i;

    /* JADX INFO: renamed from: j */
    public int f13889j;

    /* JADX INFO: renamed from: k */
    public boolean f13890k;

    /* JADX INFO: renamed from: l */
    public int f13891l;

    /* JADX INFO: renamed from: m */
    public byte[] f13892m = x0i.f95983f;

    /* JADX INFO: renamed from: n */
    public int f13893n;

    /* JADX INFO: renamed from: o */
    public long f13894o;

    @Override // p000.lq0
    /* JADX INFO: renamed from: b */
    public void mo3214b() {
        if (this.f13890k) {
            this.f13890k = false;
            int i = this.f13889j;
            int i2 = this.f58444b.f46723d;
            this.f13892m = new byte[i * i2];
            this.f13891l = this.f13888i * i2;
        }
        this.f13893n = 0;
    }

    @Override // p000.lq0
    /* JADX INFO: renamed from: c */
    public void mo3215c() {
        if (this.f13890k) {
            int i = this.f13893n;
            if (i > 0) {
                this.f13894o += (long) (i / this.f58444b.f46723d);
            }
            this.f13893n = 0;
        }
    }

    @Override // p000.lq0
    /* JADX INFO: renamed from: d */
    public void mo3216d() {
        this.f13892m = x0i.f95983f;
    }

    @Override // p000.lq0, p000.if0
    public ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.f13893n) > 0) {
            m16315e(i).put(this.f13892m, 0, this.f13893n).flip();
            this.f13893n = 0;
        }
        return super.getOutput();
    }

    public long getTrimmedFrameCount() {
        return this.f13894o;
    }

    @Override // p000.lq0, p000.if0
    public boolean isEnded() {
        return super.isEnded() && this.f13893n == 0;
    }

    @Override // p000.lq0
    public if0.C7262a onConfigure(if0.C7262a c7262a) throws if0.C7263b {
        if (c7262a.f46722c != 2) {
            throw new if0.C7263b(c7262a);
        }
        this.f13890k = true;
        return (this.f13888i == 0 && this.f13889j == 0) ? if0.C7262a.f46719e : c7262a;
    }

    @Override // p000.if0
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f13891l);
        this.f13894o += (long) (iMin / this.f58444b.f46723d);
        this.f13891l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f13891l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f13893n + i2) - this.f13892m.length;
        ByteBuffer byteBufferM16315e = m16315e(length);
        int iConstrainValue = x0i.constrainValue(length, 0, this.f13893n);
        byteBufferM16315e.put(this.f13892m, 0, iConstrainValue);
        int iConstrainValue2 = x0i.constrainValue(length - iConstrainValue, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iConstrainValue2);
        byteBufferM16315e.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iConstrainValue2;
        int i4 = this.f13893n - iConstrainValue;
        this.f13893n = i4;
        byte[] bArr = this.f13892m;
        System.arraycopy(bArr, iConstrainValue, bArr, 0, i4);
        byteBuffer.get(this.f13892m, this.f13893n, i3);
        this.f13893n += i3;
        byteBufferM16315e.flip();
    }

    public void resetTrimmedFrameCount() {
        this.f13894o = 0L;
    }

    public void setTrimFrameCount(int i, int i2) {
        this.f13888i = i;
        this.f13889j = i2;
    }
}
