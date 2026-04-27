package p000;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@ay4
public final class dk4 {

    /* JADX INFO: renamed from: a */
    public static final double f29864a = -2.147483648E9d;

    /* JADX INFO: renamed from: b */
    public static final double f29865b = 2.147483647E9d;

    /* JADX INFO: renamed from: c */
    public static final double f29866c = -9.223372036854776E18d;

    /* JADX INFO: renamed from: d */
    public static final double f29867d = 9.223372036854776E18d;

    /* JADX INFO: renamed from: f */
    @gdi
    public static final int f29869f = 170;

    /* JADX INFO: renamed from: e */
    public static final double f29868e = Math.log(2.0d);

    /* JADX INFO: renamed from: g */
    @gdi
    public static final double[] f29870g = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: renamed from: dk4$a */
    public static /* synthetic */ class C4829a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29871a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f29871a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29871a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29871a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29871a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29871a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29871a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29871a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29871a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private dk4() {
    }

    @jd7
    @yg8
    /* JADX INFO: renamed from: a */
    public static double m9216a(double x, RoundingMode mode) {
        if (!ik4.m13152d(x)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (C4829a.f29871a[mode.ordinal()]) {
            case 1:
                q3a.m20063k(isMathematicalInteger(x));
                return x;
            case 2:
                return (x >= 0.0d || isMathematicalInteger(x)) ? x : ((long) x) - 1;
            case 3:
                return (x <= 0.0d || isMathematicalInteger(x)) ? x : ((long) x) + 1;
            case 4:
                return x;
            case 5:
                if (isMathematicalInteger(x)) {
                    return x;
                }
                return ((long) x) + ((long) (x > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(x);
            case 7:
                double dRint = Math.rint(x);
                return Math.abs(x - dRint) == 0.5d ? x + Math.copySign(0.5d, x) : dRint;
            case 8:
                double dRint2 = Math.rint(x);
                return Math.abs(x - dRint2) == 0.5d ? x : dRint2;
            default:
                throw new AssertionError();
        }
    }

    @op1
    @jd7
    @yg8
    private static double checkFinite(double argument) {
        v7d.checkArgument(ik4.m13152d(argument));
        return argument;
    }

    public static double factorial(int n) {
        q3a.m20057e("n", n);
        if (n > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d = 1.0d;
        for (int i = (n & (-16)) + 1; i <= n; i++) {
            d *= (double) i;
        }
        return d * f29870g[n >> 4];
    }

    public static int fuzzyCompare(double a, double b, double tolerance) {
        if (fuzzyEquals(a, b, tolerance)) {
            return 0;
        }
        if (a < b) {
            return -1;
        }
        if (a > b) {
            return 1;
        }
        return hb1.compare(Double.isNaN(a), Double.isNaN(b));
    }

    public static boolean fuzzyEquals(double a, double b, double tolerance) {
        q3a.m20056d("tolerance", tolerance);
        return Math.copySign(a - b, 1.0d) <= tolerance || a == b || (Double.isNaN(a) && Double.isNaN(b));
    }

    @jd7
    public static boolean isMathematicalInteger(double x) {
        return ik4.m13152d(x) && (x == 0.0d || 52 - Long.numberOfTrailingZeros(ik4.m13151c(x)) <= Math.getExponent(x));
    }

    @jd7
    @yg8
    public static boolean isPowerOfTwo(double x) {
        if (x <= 0.0d || !ik4.m13152d(x)) {
            return false;
        }
        long jM13151c = ik4.m13151c(x);
        return (jM13151c & (jM13151c - 1)) == 0;
    }

    public static double log2(double x) {
        return Math.log(x) / f29868e;
    }

    @jd7
    @yg8
    @Deprecated
    public static double mean(double... values) {
        v7d.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        double dCheckFinite = checkFinite(values[0]);
        long j = 1;
        for (int i = 1; i < values.length; i++) {
            checkFinite(values[i]);
            j++;
            dCheckFinite += (values[i] - dCheckFinite) / j;
        }
        return dCheckFinite;
    }

    @jd7
    @yg8
    public static BigInteger roundToBigInteger(double x, RoundingMode mode) {
        double dM9216a = m9216a(x, mode);
        if (((-9.223372036854776E18d) - dM9216a < 1.0d) && (dM9216a < 9.223372036854776E18d)) {
            return BigInteger.valueOf((long) dM9216a);
        }
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(ik4.m13151c(dM9216a)).shiftLeft(Math.getExponent(dM9216a) - 52);
        return dM9216a < 0.0d ? bigIntegerShiftLeft.negate() : bigIntegerShiftLeft;
    }

    @jd7
    @yg8
    public static int roundToInt(double x, RoundingMode mode) {
        double dM9216a = m9216a(x, mode);
        q3a.m20053a((dM9216a > -2.147483649E9d) & (dM9216a < 2.147483648E9d), x, mode);
        return (int) dM9216a;
    }

    @jd7
    @yg8
    public static long roundToLong(double x, RoundingMode mode) {
        double dM9216a = m9216a(x, mode);
        q3a.m20053a(((-9.223372036854776E18d) - dM9216a < 1.0d) & (dM9216a < 9.223372036854776E18d), x, mode);
        return (long) dM9216a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @p000.jd7
    @p000.yg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int log2(double r5, java.math.RoundingMode r7) {
        /*
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            boolean r0 = p000.ik4.m13152d(r5)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r3 = "x must be positive and finite"
            p000.v7d.checkArgument(r0, r3)
            int r0 = java.lang.Math.getExponent(r5)
            boolean r3 = p000.ik4.m13153e(r5)
            if (r3 != 0) goto L2a
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r5 = r5 * r0
            int r5 = log2(r5, r7)
            int r5 = r5 + (-52)
            return r5
        L2a:
            int[] r3 = p000.dk4.C4829a.f29871a
            int r7 = r7.ordinal()
            r7 = r3[r7]
            switch(r7) {
                case 1: goto L61;
                case 2: goto L68;
                case 3: goto L5a;
                case 4: goto L52;
                case 5: goto L48;
                case 6: goto L3b;
                case 7: goto L3b;
                case 8: goto L3b;
                default: goto L35;
            }
        L35:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L3b:
            double r5 = p000.ik4.m13155g(r5)
            double r5 = r5 * r5
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L68
            r1 = r2
            goto L68
        L48:
            if (r0 < 0) goto L4b
            r1 = r2
        L4b:
            boolean r5 = isPowerOfTwo(r5)
        L4f:
            r5 = r5 ^ r2
            r1 = r1 & r5
            goto L68
        L52:
            if (r0 >= 0) goto L55
            r1 = r2
        L55:
            boolean r5 = isPowerOfTwo(r5)
            goto L4f
        L5a:
            boolean r5 = isPowerOfTwo(r5)
            r1 = r5 ^ 1
            goto L68
        L61:
            boolean r5 = isPowerOfTwo(r5)
            p000.q3a.m20063k(r5)
        L68:
            if (r1 == 0) goto L6c
            int r0 = r0 + 1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dk4.log2(double, java.math.RoundingMode):int");
    }

    @Deprecated
    public static double mean(int... values) {
        v7d.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        long j = 0;
        for (int i : values) {
            j += (long) i;
        }
        return j / ((double) values.length);
    }

    @Deprecated
    public static double mean(long... values) {
        v7d.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        double d = values[0];
        long j = 1;
        for (int i = 1; i < values.length; i++) {
            j++;
            d += (values[i] - d) / j;
        }
        return d;
    }

    @jd7
    @yg8
    @Deprecated
    public static double mean(Iterable<? extends Number> values) {
        return mean(values.iterator());
    }

    @jd7
    @yg8
    @Deprecated
    public static double mean(Iterator<? extends Number> values) {
        v7d.checkArgument(values.hasNext(), "Cannot take mean of 0 values");
        double dCheckFinite = checkFinite(values.next().doubleValue());
        long j = 1;
        while (values.hasNext()) {
            j++;
            dCheckFinite += (checkFinite(values.next().doubleValue()) - dCheckFinite) / j;
        }
        return dCheckFinite;
    }
}
