package p000;

/* JADX INFO: loaded from: classes7.dex */
public class ijb extends hjb {
    @jjf(version = "1.4")
    @t28
    private static final int countLeadingZeroBits(byte b) {
        return Integer.numberOfLeadingZeros(b & 255) - 24;
    }

    @jjf(version = "1.4")
    @t28
    private static final int countOneBits(byte b) {
        return Integer.bitCount(b & 255);
    }

    @jjf(version = "1.4")
    @t28
    private static final int countTrailingZeroBits(byte b) {
        return Integer.numberOfTrailingZeros(b | 256);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    public static final byte rotateLeft(byte b, int i) {
        int i2 = i & 7;
        return (byte) (((b & 255) >>> (8 - i2)) | (b << i2));
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    public static final byte rotateRight(byte b, int i) {
        int i2 = i & 7;
        return (byte) (((b & 255) >>> i2) | (b << (8 - i2)));
    }

    @jjf(version = "1.4")
    @t28
    private static final byte takeHighestOneBit(byte b) {
        return (byte) Integer.highestOneBit(b & 255);
    }

    @jjf(version = "1.4")
    @t28
    private static final byte takeLowestOneBit(byte b) {
        return (byte) Integer.lowestOneBit(b);
    }

    @jjf(version = "1.4")
    @t28
    private static final int countLeadingZeroBits(short s) {
        return Integer.numberOfLeadingZeros(s & iqh.f48007d) - 16;
    }

    @jjf(version = "1.4")
    @t28
    private static final int countOneBits(short s) {
        return Integer.bitCount(s & iqh.f48007d);
    }

    @jjf(version = "1.4")
    @t28
    private static final int countTrailingZeroBits(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    public static final short rotateLeft(short s, int i) {
        int i2 = i & 15;
        return (short) (((s & 65535) >>> (16 - i2)) | (s << i2));
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    public static final short rotateRight(short s, int i) {
        int i2 = i & 15;
        return (short) (((s & 65535) >>> i2) | (s << (16 - i2)));
    }

    @jjf(version = "1.4")
    @t28
    private static final short takeHighestOneBit(short s) {
        return (short) Integer.highestOneBit(s & iqh.f48007d);
    }

    @jjf(version = "1.4")
    @t28
    private static final short takeLowestOneBit(short s) {
        return (short) Integer.lowestOneBit(s);
    }
}
