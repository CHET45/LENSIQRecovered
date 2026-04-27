package p000;

import java.nio.ByteBuffer;
import p000.if0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i3h extends lq0 {
    @Override // p000.lq0
    @op1
    public if0.C7262a onConfigure(if0.C7262a c7262a) throws if0.C7263b {
        int i = c7262a.f46722c;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new if0.C7262a(c7262a.f46720a, c7262a.f46721b, 2) : if0.C7262a.f46719e;
        }
        throw new if0.C7263b(c7262a);
    }

    @Override // p000.if0
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f58444b.f46722c;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else if (i2 != 268435456) {
            if (i2 != 536870912) {
                if (i2 != 805306368) {
                    throw new IllegalStateException();
                }
                i /= 2;
            } else {
                i /= 3;
                i *= 2;
            }
        }
        ByteBuffer byteBufferM16315e = m16315e(i);
        int i3 = this.f58444b.f46722c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferM16315e.put((byte) 0);
                byteBufferM16315e.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sConstrainValue = (short) (x0i.constrainValue(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM16315e.put((byte) (sConstrainValue & 255));
                byteBufferM16315e.put((byte) ((sConstrainValue >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM16315e.put(byteBuffer.get(iPosition + 1));
                byteBufferM16315e.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferM16315e.put(byteBuffer.get(iPosition + 1));
                byteBufferM16315e.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferM16315e.put(byteBuffer.get(iPosition + 2));
                byteBufferM16315e.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM16315e.flip();
    }
}
