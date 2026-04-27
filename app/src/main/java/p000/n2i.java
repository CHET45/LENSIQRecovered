package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public class n2i {

    /* JADX INFO: renamed from: a */
    public static final int f63093a = 17;

    /* JADX INFO: renamed from: b */
    public static final int f63094b = 18;

    /* JADX INFO: renamed from: c */
    public static final int f63095c = 20;

    /* JADX INFO: renamed from: d */
    public static final int f63096d = 33;

    /* JADX INFO: renamed from: e */
    public static final int f63097e = 34;

    /* JADX INFO: renamed from: f */
    public static final int f63098f = 36;

    /* JADX INFO: renamed from: g */
    public static final int f63099g = 50;

    /* JADX INFO: renamed from: h */
    public static final int f63100h = 52;

    /* JADX INFO: renamed from: n2i$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9664a {
    }

    /* JADX INFO: renamed from: n2i$b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9665b {
    }

    private n2i() {
    }

    private static float bytesToFloat(byte b, byte b2) {
        return (float) (((double) unsignedToSigned(unsignedByteToInt(b) + ((unsignedByteToInt(b2) & 15) << 8), 12)) * Math.pow(10.0d, unsignedToSigned(unsignedByteToInt(b2) >> 4, 4)));
    }

    public static Float getFloatValue(@efb byte[] bArr, int i, @h78(from = 0) int i2) {
        if (getTypeLen(i) + i2 > bArr.length) {
            kfe.m14730w("Float formatType (0x%x) is longer than remaining bytes (%d) - returning null", Integer.valueOf(i), Integer.valueOf(bArr.length - i2));
            return null;
        }
        if (i == 50) {
            return Float.valueOf(bytesToFloat(bArr[i2], bArr[i2 + 1]));
        }
        if (i == 52) {
            return Float.valueOf(bytesToFloat(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]));
        }
        kfe.m14730w("Passed an invalid float formatType (0x%x) - returning null", Integer.valueOf(i));
        return null;
    }

    public static Integer getIntValue(@efb byte[] bArr, int i, @h78(from = 0) int i2) {
        if (getTypeLen(i) + i2 > bArr.length) {
            kfe.m14730w("Int formatType (0x%x) is longer than remaining bytes (%d) - returning null", Integer.valueOf(i), Integer.valueOf(bArr.length - i2));
            return null;
        }
        if (i == 17) {
            return Integer.valueOf(unsignedByteToInt(bArr[i2]));
        }
        if (i == 18) {
            return Integer.valueOf(unsignedBytesToInt(bArr[i2], bArr[i2 + 1]));
        }
        if (i == 20) {
            return Integer.valueOf(unsignedBytesToInt(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]));
        }
        if (i == 36) {
            return Integer.valueOf(unsignedToSigned(unsignedBytesToInt(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]), 32));
        }
        if (i == 33) {
            return Integer.valueOf(unsignedToSigned(unsignedByteToInt(bArr[i2]), 8));
        }
        if (i == 34) {
            return Integer.valueOf(unsignedToSigned(unsignedBytesToInt(bArr[i2], bArr[i2 + 1]), 16));
        }
        kfe.m14730w("Passed an invalid integer formatType (0x%x) - returning null", Integer.valueOf(i));
        return null;
    }

    public static String getStringValue(@efb byte[] bArr, @h78(from = 0) int i) {
        if (i > bArr.length) {
            kfe.m14730w("Passed offset that exceeds the length of the byte array - returning null", new Object[0]);
            return null;
        }
        byte[] bArr2 = new byte[bArr.length - i];
        for (int i2 = 0; i2 != bArr.length - i; i2++) {
            bArr2[i2] = bArr[i + i2];
        }
        return new String(bArr2);
    }

    private static int getTypeLen(int i) {
        return i & 15;
    }

    private static int unsignedByteToInt(byte b) {
        return b & 255;
    }

    private static int unsignedBytesToInt(byte b, byte b2) {
        return unsignedByteToInt(b) + (unsignedByteToInt(b2) << 8);
    }

    private static int unsignedToSigned(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        return (i & i3) != 0 ? (i3 - (i & (i3 - 1))) * (-1) : i;
    }

    private static int unsignedBytesToInt(byte b, byte b2, byte b3, byte b4) {
        return unsignedByteToInt(b) + (unsignedByteToInt(b2) << 8) + (unsignedByteToInt(b3) << 16) + (unsignedByteToInt(b4) << 24);
    }

    private static float bytesToFloat(byte b, byte b2, byte b3, byte b4) {
        return (float) (((double) unsignedToSigned(unsignedByteToInt(b) + (unsignedByteToInt(b2) << 8) + (unsignedByteToInt(b3) << 16), 24)) * Math.pow(10.0d, b4));
    }
}
