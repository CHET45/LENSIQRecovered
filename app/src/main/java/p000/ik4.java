package p000;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@ay4
public final class ik4 {

    /* JADX INFO: renamed from: a */
    public static final long f47226a = 4503599627370495L;

    /* JADX INFO: renamed from: b */
    public static final long f47227b = 9218868437227405312L;

    /* JADX INFO: renamed from: c */
    public static final long f47228c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public static final int f47229d = 52;

    /* JADX INFO: renamed from: e */
    public static final int f47230e = 1023;

    /* JADX INFO: renamed from: f */
    public static final long f47231f = 4503599627370496L;

    /* JADX INFO: renamed from: g */
    @gdi
    public static final long f47232g = 4607182418800017408L;

    private ik4() {
    }

    /* JADX INFO: renamed from: a */
    public static double m13149a(BigInteger x) {
        BigInteger bigIntegerAbs = x.abs();
        int iBitLength = bigIntegerAbs.bitLength();
        int i = iBitLength - 1;
        if (i < 63) {
            return x.longValue();
        }
        if (i > 1023) {
            return ((double) x.signum()) * Double.POSITIVE_INFINITY;
        }
        int i2 = iBitLength - 54;
        long jLongValue = bigIntegerAbs.shiftRight(i2).longValue();
        long j = jLongValue >> 1;
        long j2 = f47226a & j;
        if ((jLongValue & 1) != 0 && ((j & 1) != 0 || bigIntegerAbs.getLowestSetBit() < i2)) {
            j2++;
        }
        return Double.longBitsToDouble(((((long) (iBitLength + 1022)) << 52) + j2) | (((long) x.signum()) & Long.MIN_VALUE));
    }

    /* JADX INFO: renamed from: b */
    public static double m13150b(double value) {
        v7d.checkArgument(!Double.isNaN(value));
        return Math.max(value, 0.0d);
    }

    /* JADX INFO: renamed from: c */
    public static long m13151c(double d) {
        v7d.checkArgument(m13152d(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & f47226a;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | f47231f;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m13152d(double d) {
        return Math.getExponent(d) <= 1023;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m13153e(double d) {
        return Math.getExponent(d) >= -1022;
    }

    /* JADX INFO: renamed from: f */
    public static double m13154f(double d) {
        return -Math.nextUp(-d);
    }

    /* JADX INFO: renamed from: g */
    public static double m13155g(double x) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(x) & f47226a) | f47232g);
    }
}
