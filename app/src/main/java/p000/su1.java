package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p000.hf0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class su1 extends mq0 {

    /* JADX INFO: renamed from: i */
    @hib
    public int[] f82855i;

    /* JADX INFO: renamed from: j */
    @hib
    public int[] f82856j;

    @Override // p000.mq0
    public hf0.C6832a onConfigure(hf0.C6832a c6832a) throws hf0.C6833b {
        int[] iArr = this.f82855i;
        if (iArr == null) {
            return hf0.C6832a.f43349e;
        }
        if (!t0i.isEncodingLinearPcm(c6832a.f43352c)) {
            throw new hf0.C6833b(c6832a);
        }
        boolean z = c6832a.f43351b != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= c6832a.f43351b) {
                throw new hf0.C6833b("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", c6832a);
            }
            z |= i2 != i;
            i++;
        }
        return z ? new hf0.C6832a(c6832a.f43350a, iArr.length, c6832a.f43352c) : hf0.C6832a.f43349e;
    }

    @Override // p000.mq0
    public void onFlush() {
        this.f82856j = this.f82855i;
    }

    @Override // p000.mq0
    public void onReset() {
        this.f82856j = null;
        this.f82855i = null;
    }

    @Override // p000.hf0
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) v80.checkNotNull(this.f82856j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM17515b = m17515b(((iLimit - iPosition) / this.f61732b.f43353d) * this.f61733c.f43353d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                int byteDepth = (t0i.getByteDepth(this.f61732b.f43352c) * i) + iPosition;
                int i2 = this.f61732b.f43352c;
                if (i2 == 2) {
                    byteBufferM17515b.putShort(byteBuffer.getShort(byteDepth));
                } else if (i2 == 3) {
                    byteBufferM17515b.put(byteBuffer.get(byteDepth));
                } else if (i2 == 4) {
                    byteBufferM17515b.putFloat(byteBuffer.getFloat(byteDepth));
                } else if (i2 == 21) {
                    t0i.putInt24(byteBufferM17515b, t0i.getInt24(byteBuffer, byteDepth));
                } else {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    throw new IllegalStateException("Unexpected encoding: " + this.f61732b.f43352c);
                                }
                            }
                            t0i.putInt24(byteBufferM17515b, t0i.getInt24(byteBuffer, byteDepth));
                        }
                        byteBufferM17515b.putShort(byteBuffer.getShort(byteDepth));
                    }
                    byteBufferM17515b.putInt(byteBuffer.getInt(byteDepth));
                }
            }
            iPosition += this.f61732b.f43353d;
        }
        byteBuffer.position(iLimit);
        byteBufferM17515b.flip();
    }

    public void setChannelMap(@hib int[] iArr) {
        this.f82855i = iArr;
    }
}
