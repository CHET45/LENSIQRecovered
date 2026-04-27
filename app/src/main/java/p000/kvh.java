package p000;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "UnsignedKt")
public final class kvh {
    @yjd
    public static final int doubleToUInt(double d) {
        if (Double.isNaN(d) || d <= uintToDouble(0)) {
            return 0;
        }
        if (d >= uintToDouble(-1)) {
            return -1;
        }
        return d <= 2.147483647E9d ? woh.m33004constructorimpl((int) d) : woh.m33004constructorimpl(woh.m33004constructorimpl((int) (d - ((double) Integer.MAX_VALUE))) + woh.m33004constructorimpl(Integer.MAX_VALUE));
    }

    @yjd
    public static final long doubleToULong(double d) {
        if (Double.isNaN(d) || d <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d >= ulongToDouble(-1L)) {
            return -1L;
        }
        return d < 9.223372036854776E18d ? oph.m31533constructorimpl((long) d) : oph.m31533constructorimpl(oph.m31533constructorimpl((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @t28
    @yjd
    private static final int floatToUInt(float f) {
        return doubleToUInt(f);
    }

    @t28
    @yjd
    private static final long floatToULong(float f) {
        return doubleToULong(f);
    }

    @yjd
    public static final int uintCompare(int i, int i2) {
        return md8.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    @yjd
    /* JADX INFO: renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m30780uintDivideJ1ME1BU(int i, int i2) {
        return woh.m33004constructorimpl((int) ((((long) i) & 4294967295L) / (((long) i2) & 4294967295L)));
    }

    @yjd
    /* JADX INFO: renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m30781uintRemainderJ1ME1BU(int i, int i2) {
        return woh.m33004constructorimpl((int) ((((long) i) & 4294967295L) % (((long) i2) & 4294967295L)));
    }

    @yjd
    public static final double uintToDouble(int i) {
        return ((double) (Integer.MAX_VALUE & i)) + (((double) ((i >>> 31) << 30)) * ((double) 2));
    }

    @t28
    @yjd
    private static final float uintToFloat(int i) {
        return (float) uintToDouble(i);
    }

    @t28
    @yjd
    private static final long uintToLong(int i) {
        return ((long) i) & 4294967295L;
    }

    @t28
    private static final String uintToString(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    @t28
    @yjd
    private static final long uintToULong(int i) {
        return oph.m31533constructorimpl(((long) i) & 4294967295L);
    }

    @yjd
    public static final int ulongCompare(long j, long j2) {
        return md8.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    @yjd
    /* JADX INFO: renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m30782ulongDivideeb3DHEI(long j, long j2) {
        if (j2 < 0) {
            return Long.compareUnsigned(j, j2) < 0 ? oph.m31533constructorimpl(0L) : oph.m31533constructorimpl(1L);
        }
        if (j >= 0) {
            return oph.m31533constructorimpl(j / j2);
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return oph.m31533constructorimpl(j3 + ((long) (Long.compareUnsigned(oph.m31533constructorimpl(j - (j3 * j2)), oph.m31533constructorimpl(j2)) < 0 ? 0 : 1)));
    }

    @yjd
    /* JADX INFO: renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m30783ulongRemaindereb3DHEI(long j, long j2) {
        if (j2 < 0) {
            return Long.compareUnsigned(j, j2) < 0 ? j : oph.m31533constructorimpl(j - j2);
        }
        if (j >= 0) {
            return oph.m31533constructorimpl(j % j2);
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (Long.compareUnsigned(oph.m31533constructorimpl(j3), oph.m31533constructorimpl(j2)) < 0) {
            j2 = 0;
        }
        return oph.m31533constructorimpl(j3 - j2);
    }

    @yjd
    public static final double ulongToDouble(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    @t28
    @yjd
    private static final float ulongToFloat(long j) {
        return (float) ulongToDouble(j);
    }

    @t28
    private static final String ulongToString(long j) {
        return ulongToString(j, 10);
    }

    @t28
    private static final String uintToString(int i, int i2) {
        return ulongToString(((long) i) & 4294967295L, i2);
    }

    @yfb
    public static final String ulongToString(long j, int i) {
        if (j >= 0) {
            String string = Long.toString(j, tw1.checkRadix(i));
            md8.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j3, tw1.checkRadix(i));
        md8.checkNotNullExpressionValue(string2, "toString(...)");
        sb.append(string2);
        String string3 = Long.toString(j4, tw1.checkRadix(i));
        md8.checkNotNullExpressionValue(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}
