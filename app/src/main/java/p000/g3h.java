package p000;

import java.nio.ByteBuffer;
import p000.if0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g3h extends lq0 {

    /* JADX INFO: renamed from: i */
    public static final int f38359i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: j */
    public static final double f38360j = 4.656612875245797E-10d;

    private static void writePcm32BitFloat(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f38359i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // p000.lq0
    @op1
    public if0.C7262a onConfigure(if0.C7262a c7262a) throws if0.C7263b {
        int i = c7262a.f46722c;
        if (x0i.isEncodingHighResolutionPcm(i)) {
            return i != 4 ? new if0.C7262a(c7262a.f46720a, c7262a.f46721b, 4) : if0.C7262a.f46719e;
        }
        throw new if0.C7263b(c7262a);
    }

    @Override // p000.if0
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM16315e;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f58444b.f46722c;
        if (i2 == 536870912) {
            byteBufferM16315e = m16315e((i / 3) * 4);
            while (iPosition < iLimit) {
                writePcm32BitFloat(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM16315e);
                iPosition += 3;
            }
        } else {
            if (i2 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferM16315e = m16315e(i);
            while (iPosition < iLimit) {
                writePcm32BitFloat((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM16315e);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM16315e.flip();
    }
}
