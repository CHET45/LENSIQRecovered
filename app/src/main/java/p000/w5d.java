package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class w5d {
    private w5d() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean isPowerOfTwo(final int value) {
        return (value & (value + (-1))) == 0;
    }

    public static int roundToPowerOfTwo(final int value) {
        return 1 << (32 - Integer.numberOfLeadingZeros(value - 1));
    }
}
