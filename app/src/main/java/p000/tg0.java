package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class tg0 {
    private static short[] bytesToShorts(byte[] bArr) {
        short[] sArr = new short[bArr.length / 2];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
        return sArr;
    }

    public static byte[] linearResample(byte[] bArr, int i, int i2) {
        short[] sArrBytesToShorts = bytesToShorts(bArr);
        float f = i / i2;
        int length = (int) (sArrBytesToShorts.length / f);
        short[] sArr = new short[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f2 = i3 * f;
            float f3 = f2 - ((int) f2);
            sArr[i3] = (short) ((sArrBytesToShorts[r3] * (1.0f - f3)) + (sArrBytesToShorts[Math.min(r3 + 1, sArrBytesToShorts.length - 1)] * f3));
        }
        return shortsToBytes(sArr);
    }

    private static byte[] shortsToBytes(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(sArr);
        return bArr;
    }
}
