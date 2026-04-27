package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class yib {

    /* JADX INFO: renamed from: a */
    public static final double f101706a = -9.223372036854776E18d;

    /* JADX INFO: renamed from: b */
    public static final double f101707b = 9.223372036854776E18d;

    /* JADX INFO: renamed from: c */
    public static final long f101708c = 9007199254740992L;

    /* JADX INFO: renamed from: d */
    public static final long f101709d = -9007199254740992L;

    private yib() {
    }

    public static int firestoreCompareDoubleWithLong(double d, long j) {
        if (Double.isNaN(d) || d < -9.223372036854776E18d) {
            return -1;
        }
        if (d >= 9.223372036854776E18d) {
            return 1;
        }
        int iCompare = Long.compare((long) d, j);
        return iCompare != 0 ? iCompare : firestoreCompareDoubles(d, j);
    }

    public static int firestoreCompareDoubles(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        if (d == d2) {
            return 0;
        }
        if (Double.isNaN(d2)) {
            return !Double.isNaN(d) ? 1 : 0;
        }
        return -1;
    }
}
