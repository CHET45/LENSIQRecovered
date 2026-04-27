package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class yh7 {

    /* JADX INFO: renamed from: a */
    public static final long f101507a = -862048943;

    /* JADX INFO: renamed from: b */
    public static final long f101508b = 461845907;

    /* JADX INFO: renamed from: c */
    public static final int f101509c = 1073741824;

    private yh7() {
    }

    /* JADX INFO: renamed from: a */
    public static int m25909a(int expectedEntries, double loadFactor) {
        int iMax = Math.max(expectedEntries, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (loadFactor * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i = iHighestOneBit << 1;
        if (i > 0) {
            return i;
        }
        return 1073741824;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m25910b(int size, int tableSize, double loadFactor) {
        return ((double) size) > loadFactor * ((double) tableSize) && tableSize < 1073741824;
    }

    /* JADX INFO: renamed from: c */
    public static int m25911c(int hashCode) {
        return (int) (((long) Integer.rotateLeft((int) (((long) hashCode) * f101507a), 15)) * f101508b);
    }

    /* JADX INFO: renamed from: d */
    public static int m25912d(@wx1 Object o) {
        return m25911c(o == null ? 0 : o.hashCode());
    }
}
