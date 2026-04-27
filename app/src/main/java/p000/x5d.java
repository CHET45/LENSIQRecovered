package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class x5d {
    private x5d() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean isPowerOfTwo(int i) {
        return (i & (i + (-1))) == 0;
    }

    public static int roundToPowerOfTwo(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
