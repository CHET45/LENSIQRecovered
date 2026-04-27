package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class fud {
    public static float[] byteToFloat(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        FloatBuffer floatBufferAllocate = FloatBuffer.allocate(bArr.length / 2);
        for (int i = 0; i < floatBufferAllocate.capacity(); i++) {
            floatBufferAllocate.put(r0.getShort(i * 2));
        }
        return floatBufferAllocate.array();
    }

    public static long getMaxDecibels(byte[] bArr) {
        short[] shorts = zj1.toShorts(bArr);
        if (shorts == null) {
            return 0L;
        }
        float f = 2.0f;
        for (float f2 : shorts) {
            if (Math.abs(f) < Math.abs(f2)) {
                f = f2;
            }
        }
        return Math.round(Math.log10(f) * 20.0d);
    }
}
