package p000;

import java.nio.ByteBuffer;
import p000.hf0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class h3h extends mq0 {

    /* JADX INFO: renamed from: i */
    public static final int f42257i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: j */
    public static final double f42258j = 4.656612875245797E-10d;

    private static void writePcm32BitFloat(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f42257i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // p000.mq0
    public hf0.C6832a onConfigure(hf0.C6832a c6832a) throws hf0.C6833b {
        int i = c6832a.f43352c;
        if (t0i.isEncodingHighResolutionPcm(i)) {
            return i != 4 ? new hf0.C6832a(c6832a.f43350a, c6832a.f43351b, 4) : hf0.C6832a.f43349e;
        }
        throw new hf0.C6833b(c6832a);
    }

    @Override // p000.hf0
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM17515b;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f61732b.f43352c;
        if (i2 == 21) {
            byteBufferM17515b = m17515b((i / 3) * 4);
            while (iPosition < iLimit) {
                writePcm32BitFloat(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM17515b);
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferM17515b = m17515b(i);
            while (iPosition < iLimit) {
                writePcm32BitFloat((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM17515b);
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferM17515b = m17515b((i / 3) * 4);
            while (iPosition < iLimit) {
                writePcm32BitFloat(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM17515b);
                iPosition += 3;
            }
        } else {
            if (i2 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferM17515b = m17515b(i);
            while (iPosition < iLimit) {
                writePcm32BitFloat((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM17515b);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM17515b.flip();
    }
}
