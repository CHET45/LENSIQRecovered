package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class fkh {
    private fkh() {
    }

    public static int findSyncBytePosition(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static boolean isStartOfTsPacket(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * 188) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long readPcrFromPacket(jhc jhcVar, int i, int i2) {
        jhcVar.setPosition(i);
        if (jhcVar.bytesLeft() < 5) {
            return -9223372036854775807L;
        }
        int i3 = jhcVar.readInt();
        if ((8388608 & i3) != 0 || ((2096896 & i3) >> 8) != i2 || (i3 & 32) == 0 || jhcVar.readUnsignedByte() < 7 || jhcVar.bytesLeft() < 7 || (jhcVar.readUnsignedByte() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        jhcVar.readBytes(bArr, 0, 6);
        return readPcrValueFromPcrBytes(bArr);
    }

    private static long readPcrValueFromPcrBytes(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
