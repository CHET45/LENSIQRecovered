package p000;

import java.math.RoundingMode;
import okhttp3.internal.connection.RealConnection;
import org.opencv.videoio.Videoio;
import org.videolan.libvlc.MediaPlayer;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@ay4
public final class nl9 {

    /* JADX INFO: renamed from: a */
    @gdi
    public static final long f64862a = 4611686018427387904L;

    /* JADX INFO: renamed from: b */
    @gdi
    public static final long f64863b = -5402926248376769404L;

    /* JADX INFO: renamed from: f */
    @gdi
    public static final long f64867f = 3037000499L;

    /* JADX INFO: renamed from: j */
    public static final int f64871j = -545925251;

    /* JADX INFO: renamed from: c */
    @gdi
    public static final byte[] f64864c = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* JADX INFO: renamed from: d */
    @gdi
    @jd7
    @yg8
    public static final long[] f64865d = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* JADX INFO: renamed from: e */
    @gdi
    @jd7
    @yg8
    public static final long[] f64866e = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* JADX INFO: renamed from: g */
    public static final long[] f64868g = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* JADX INFO: renamed from: h */
    public static final int[] f64869h = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, Videoio.CAP_PROP_XI_SENSOR_OUTPUT_CHANNEL_COUNT, 361, MediaPlayer.Event.EndReached, gm2.f40178o, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* JADX INFO: renamed from: i */
    @gdi
    public static final int[] f64870i = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, Videoio.CAP_PROP_XI_AEAG_LEVEL, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* JADX INFO: renamed from: k */
    public static final long[][] f64872k = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* JADX INFO: renamed from: nl9$a */
    public static /* synthetic */ class C9920a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64873a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f64873a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64873a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64873a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64873a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64873a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64873a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64873a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64873a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: nl9$b */
    public static abstract class EnumC9921b {

        /* JADX INFO: renamed from: a */
        public static final EnumC9921b f64874a = new a("SMALL", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC9921b f64875b = new b("LARGE", 1);

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumC9921b[] f64876c = $values();

        /* JADX INFO: renamed from: nl9$b$a */
        public enum a extends EnumC9921b {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // p000.nl9.EnumC9921b
            /* JADX INFO: renamed from: a */
            public long mo17990a(long a, long b, long m) {
                return (a * b) % m;
            }

            @Override // p000.nl9.EnumC9921b
            /* JADX INFO: renamed from: b */
            public long mo17991b(long a, long m) {
                return (a * a) % m;
            }
        }

        /* JADX INFO: renamed from: nl9$b$b */
        public enum b extends EnumC9921b {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            private long plusMod(long a, long b, long m) {
                long j = a + b;
                return a >= m - b ? j - m : j;
            }

            private long times2ToThe32Mod(long a, long m) {
                int i = 32;
                do {
                    int iMin = Math.min(i, Long.numberOfLeadingZeros(a));
                    a = mvh.remainder(a << iMin, m);
                    i -= iMin;
                } while (i > 0);
                return a;
            }

            @Override // p000.nl9.EnumC9921b
            /* JADX INFO: renamed from: a */
            public long mo17990a(long a, long b, long m) {
                long j = a >>> 32;
                long j2 = b >>> 32;
                long j3 = a & 4294967295L;
                long j4 = b & 4294967295L;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j * j2, m) + (j * j4);
                if (jTimes2ToThe32Mod < 0) {
                    jTimes2ToThe32Mod = mvh.remainder(jTimes2ToThe32Mod, m);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + (j2 * j3), m), mvh.remainder(j3 * j4, m), m);
            }

            @Override // p000.nl9.EnumC9921b
            /* JADX INFO: renamed from: b */
            public long mo17991b(long a, long m) {
                long j = a >>> 32;
                long j2 = a & 4294967295L;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j * j, m);
                long jRemainder = j * j2 * 2;
                if (jRemainder < 0) {
                    jRemainder = mvh.remainder(jRemainder, m);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + jRemainder, m), mvh.remainder(j2 * j2, m), m);
            }
        }

        private static /* synthetic */ EnumC9921b[] $values() {
            return new EnumC9921b[]{f64874a, f64875b};
        }

        private EnumC9921b(String $enum$name, int $enum$ordinal) {
        }

        /* JADX INFO: renamed from: c */
        public static boolean m17989c(long base, long n) {
            return (n <= nl9.f64867f ? f64874a : f64875b).testWitness(base, n);
        }

        private long powMod(long a2, long p, long m) {
            long jMo17990a = 1;
            while (p != 0) {
                if ((p & 1) != 0) {
                    jMo17990a = mo17990a(jMo17990a, a2, m);
                }
                a2 = mo17991b(a2, m);
                p >>= 1;
            }
            return jMo17990a;
        }

        private boolean testWitness(long base, long n) {
            long j = n - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
            long j2 = j >> iNumberOfTrailingZeros;
            long j3 = base % n;
            if (j3 == 0) {
                return true;
            }
            long jPowMod = powMod(j3, j2, n);
            if (jPowMod == 1) {
                return true;
            }
            int i = 0;
            while (jPowMod != j) {
                i++;
                if (i == iNumberOfTrailingZeros) {
                    return false;
                }
                jPowMod = mo17991b(jPowMod, n);
            }
            return true;
        }

        public static EnumC9921b valueOf(String name) {
            return (EnumC9921b) Enum.valueOf(EnumC9921b.class, name);
        }

        public static EnumC9921b[] values() {
            return (EnumC9921b[]) f64876c.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract long mo17990a(long a2, long b2, long m);

        /* JADX INFO: renamed from: b */
        public abstract long mo17991b(long a2, long m);

        public /* synthetic */ EnumC9921b(String str, int i, C9920a c9920a) {
            this(str, i);
        }
    }

    private nl9() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m17985a(long x) {
        return ((long) ((int) x)) == x;
    }

    @gdi
    /* JADX INFO: renamed from: b */
    public static int m17986b(long x, long y) {
        return (int) ((~(~(x - y))) >>> 63);
    }

    public static long binomial(int n, int k) {
        q3a.m20057e("n", n);
        q3a.m20057e("k", k);
        v7d.checkArgument(k <= n, "k (%s) > n (%s)", k, n);
        if (k > (n >> 1)) {
            k = n - k;
        }
        long jM17988d = 1;
        if (k == 0) {
            return 1L;
        }
        if (k == 1) {
            return n;
        }
        long[] jArr = f64868g;
        if (n < jArr.length) {
            return jArr[n] / (jArr[k] * jArr[n - k]);
        }
        int[] iArr = f64869h;
        if (k >= iArr.length || n > iArr[k]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = f64870i;
        if (k < iArr2.length && n <= iArr2[k]) {
            int i = n - 1;
            long j = n;
            for (int i2 = 2; i2 <= k; i2++) {
                j = (j * ((long) i)) / ((long) i2);
                i--;
            }
            return j;
        }
        long j2 = n;
        int iLog2 = log2(j2, RoundingMode.CEILING);
        int i3 = n - 1;
        int i4 = iLog2;
        int i5 = 2;
        long j3 = j2;
        long j4 = 1;
        while (i5 <= k) {
            i4 += iLog2;
            if (i4 < 63) {
                j3 *= (long) i3;
                j4 *= (long) i5;
            } else {
                jM17988d = m17988d(jM17988d, j3, j4);
                j3 = i3;
                j4 = i5;
                i4 = iLog2;
            }
            i5++;
            i3--;
        }
        return m17988d(jM17988d, j3, j4);
    }

    @jd7
    @yg8
    /* JADX INFO: renamed from: c */
    public static int m17987c(long x) {
        byte b = f64864c[Long.numberOfLeadingZeros(x)];
        return b - m17986b(x, f64865d[b]);
    }

    public static long ceilingPowerOfTwo(long x) {
        q3a.m20061i("x", x);
        if (x <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(x - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + x + ") is not representable as a long");
    }

    public static long checkedAdd(long a, long b) {
        long j = a + b;
        q3a.m20055c(((a ^ b) < 0) | ((a ^ j) >= 0), "checkedAdd", a, b);
        return j;
    }

    public static long checkedMultiply(long a, long b) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(a) + Long.numberOfLeadingZeros(~a) + Long.numberOfLeadingZeros(b) + Long.numberOfLeadingZeros(~b);
        if (iNumberOfLeadingZeros > 65) {
            return a * b;
        }
        q3a.m20055c(iNumberOfLeadingZeros >= 64, "checkedMultiply", a, b);
        q3a.m20055c((a >= 0) | (b != Long.MIN_VALUE), "checkedMultiply", a, b);
        long j = a * b;
        q3a.m20055c(a == 0 || j / a == b, "checkedMultiply", a, b);
        return j;
    }

    @jd7
    @yg8
    public static long checkedPow(long b, int k) {
        q3a.m20057e("exponent", k);
        long jCheckedMultiply = 1;
        if ((b >= -2) && (b <= 2)) {
            int i = (int) b;
            if (i == -2) {
                q3a.m20055c(k < 64, "checkedPow", b, k);
                return (k & 1) == 0 ? 1 << k : (-1) << k;
            }
            if (i == -1) {
                return (k & 1) == 0 ? 1L : -1L;
            }
            if (i == 0) {
                return k == 0 ? 1L : 0L;
            }
            if (i == 1) {
                return 1L;
            }
            if (i != 2) {
                throw new AssertionError();
            }
            q3a.m20055c(k < 63, "checkedPow", b, k);
            return 1 << k;
        }
        long j = b;
        int i2 = k;
        while (i2 != 0) {
            if (i2 == 1) {
                return checkedMultiply(jCheckedMultiply, j);
            }
            if ((i2 & 1) != 0) {
                jCheckedMultiply = checkedMultiply(jCheckedMultiply, j);
            }
            long j2 = jCheckedMultiply;
            int i3 = i2 >> 1;
            if (i3 > 0) {
                q3a.m20055c(-3037000499L <= j && j <= f64867f, "checkedPow", j, i3);
                j *= j;
            }
            i2 = i3;
            jCheckedMultiply = j2;
        }
        return jCheckedMultiply;
    }

    @jd7
    @yg8
    public static long checkedSubtract(long a, long b) {
        long j = a - b;
        q3a.m20055c(((a ^ b) >= 0) | ((a ^ j) >= 0), "checkedSubtract", a, b);
        return j;
    }

    /* JADX INFO: renamed from: d */
    public static long m17988d(long x, long numerator, long denominator) {
        if (x == 1) {
            return numerator / denominator;
        }
        long jGcd = gcd(x, denominator);
        return (x / jGcd) * (numerator / (denominator / jGcd));
    }

    @jd7
    @yg8
    public static long divide(long p, long q, RoundingMode mode) {
        v7d.checkNotNull(mode);
        long j = p / q;
        long j2 = p - (q * j);
        if (j2 == 0) {
            return j;
        }
        int i = ((int) ((p ^ q) >> 63)) | 1;
        switch (C9920a.f64873a[mode.ordinal()]) {
            case 1:
                q3a.m20063k(j2 == 0);
                return j;
            case 2:
                return j;
            case 3:
                if (i >= 0) {
                    return j;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j2);
                long jAbs2 = jAbs - (Math.abs(q) - jAbs);
                if (jAbs2 == 0) {
                    if (mode != RoundingMode.HALF_UP && (mode != RoundingMode.HALF_EVEN || (1 & j) == 0)) {
                        return j;
                    }
                } else if (jAbs2 <= 0) {
                    return j;
                }
            default:
                throw new AssertionError();
        }
        return j + ((long) i);
    }

    @jd7
    @yg8
    public static long factorial(int n) {
        q3a.m20057e("n", n);
        long[] jArr = f64868g;
        if (n < jArr.length) {
            return jArr[n];
        }
        return Long.MAX_VALUE;
    }

    public static long floorPowerOfTwo(long x) {
        q3a.m20061i("x", x);
        return 1 << (63 - Long.numberOfLeadingZeros(x));
    }

    public static long gcd(long a, long b) {
        q3a.m20058f("a", a);
        q3a.m20058f("b", b);
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(a);
        long jNumberOfTrailingZeros = a >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(b);
        long j = b >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j) {
            long j2 = jNumberOfTrailingZeros - j;
            long j3 = (j2 >> 63) & j2;
            long j4 = (j2 - j3) - j3;
            j += j3;
            jNumberOfTrailingZeros = j4 >> Long.numberOfTrailingZeros(j4);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(long x) {
        return (x > 0) & ((x & (x - 1)) == 0);
    }

    @jd7
    @yg8
    public static boolean isPrime(long n) {
        if (n < 2) {
            q3a.m20058f("n", n);
            return false;
        }
        if (n < 66) {
            return ((722865708377213483 >> (((int) n) + (-2))) & 1) != 0;
        }
        if (((1 << ((int) (n % 30))) & f64871j) != 0 || n % 7 == 0 || n % 11 == 0 || n % 13 == 0) {
            return false;
        }
        if (n < 289) {
            return true;
        }
        for (long[] jArr : f64872k) {
            if (n <= jArr[0]) {
                for (int i = 1; i < jArr.length; i++) {
                    if (!EnumC9921b.m17989c(jArr[i], n)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    @jd7
    @yg8
    public static int log10(long x, RoundingMode mode) {
        int iM17986b;
        q3a.m20061i("x", x);
        int iM17987c = m17987c(x);
        long j = f64865d[iM17987c];
        switch (C9920a.f64873a[mode.ordinal()]) {
            case 1:
                q3a.m20063k(x == j);
            case 2:
            case 3:
                return iM17987c;
            case 4:
            case 5:
                iM17986b = m17986b(j, x);
                return iM17987c + iM17986b;
            case 6:
            case 7:
            case 8:
                iM17986b = m17986b(f64866e[iM17987c], x);
                return iM17987c + iM17986b;
            default:
                throw new AssertionError();
        }
    }

    public static int log2(long x, RoundingMode mode) {
        q3a.m20061i("x", x);
        switch (C9920a.f64873a[mode.ordinal()]) {
            case 1:
                q3a.m20063k(isPowerOfTwo(x));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(x - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(x);
                return (63 - iNumberOfLeadingZeros) + m17986b(f64863b >>> iNumberOfLeadingZeros, x);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(x);
    }

    public static long mean(long x, long y) {
        return (x & y) + ((x ^ y) >> 1);
    }

    @jd7
    @yg8
    public static int mod(long x, int m) {
        return (int) mod(x, m);
    }

    @jd7
    @yg8
    public static long pow(long b, int k) {
        q3a.m20057e("exponent", k);
        if (-2 > b || b > 2) {
            long j = 1;
            while (k != 0) {
                if (k == 1) {
                    return j * b;
                }
                j *= (k & 1) == 0 ? 1L : b;
                b *= b;
                k >>= 1;
            }
            return j;
        }
        int i = (int) b;
        if (i == -2) {
            if (k < 64) {
                return (k & 1) == 0 ? 1 << k : -(1 << k);
            }
            return 0L;
        }
        if (i == -1) {
            return (k & 1) == 0 ? 1L : -1L;
        }
        if (i == 0) {
            return k == 0 ? 1L : 0L;
        }
        if (i == 1) {
            return 1L;
        }
        if (i != 2) {
            throw new AssertionError();
        }
        if (k < 64) {
            return 1 << k;
        }
        return 0L;
    }

    @jd7
    @yg8
    public static double roundToDouble(long x, RoundingMode mode) {
        double dNextUp;
        long jCeil;
        double d = x;
        long jFloor = (long) d;
        int iCompare = jFloor == Long.MAX_VALUE ? -1 : im9.compare(x, jFloor);
        int[] iArr = C9920a.f64873a;
        switch (iArr[mode.ordinal()]) {
            case 1:
                q3a.m20063k(iCompare == 0);
                return d;
            case 2:
                return x >= 0 ? iCompare >= 0 ? d : ik4.m13154f(d) : iCompare <= 0 ? d : Math.nextUp(d);
            case 3:
                return iCompare >= 0 ? d : ik4.m13154f(d);
            case 4:
                return x >= 0 ? iCompare <= 0 ? d : Math.nextUp(d) : iCompare >= 0 ? d : ik4.m13154f(d);
            case 5:
                return iCompare <= 0 ? d : Math.nextUp(d);
            case 6:
            case 7:
            case 8:
                if (iCompare >= 0) {
                    dNextUp = Math.nextUp(d);
                    jCeil = (long) Math.ceil(dNextUp);
                } else {
                    double dM13154f = ik4.m13154f(d);
                    jFloor = (long) Math.floor(dM13154f);
                    dNextUp = d;
                    d = dM13154f;
                    jCeil = jFloor;
                }
                long j = x - jFloor;
                long j2 = jCeil - x;
                if (jCeil == Long.MAX_VALUE) {
                    j2++;
                }
                int iCompare2 = im9.compare(j, j2);
                if (iCompare2 < 0) {
                    return d;
                }
                if (iCompare2 > 0) {
                    return dNextUp;
                }
                int i = iArr[mode.ordinal()];
                if (i == 6) {
                    return x >= 0 ? d : dNextUp;
                }
                if (i == 7) {
                    return x >= 0 ? dNextUp : d;
                }
                if (i == 8) {
                    return (ik4.m13151c(d) & 1) == 0 ? d : dNextUp;
                }
                throw new AssertionError("impossible");
            default:
                throw new AssertionError("impossible");
        }
    }

    public static long saturatedAdd(long a, long b) {
        long j = a + b;
        return (((b ^ a) > 0L ? 1 : ((b ^ a) == 0L ? 0 : -1)) < 0) | ((a ^ j) >= 0) ? j : ((j >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long saturatedMultiply(long a, long b) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(a) + Long.numberOfLeadingZeros(~a) + Long.numberOfLeadingZeros(b) + Long.numberOfLeadingZeros(~b);
        if (iNumberOfLeadingZeros > 65) {
            return a * b;
        }
        long j = ((a ^ b) >>> 63) + Long.MAX_VALUE;
        if ((iNumberOfLeadingZeros < 64) || ((b == Long.MIN_VALUE) & (a < 0))) {
            return j;
        }
        long j2 = a * b;
        return (a == 0 || j2 / a == b) ? j2 : j;
    }

    public static long saturatedPow(long b, int k) {
        q3a.m20057e("exponent", k);
        long jSaturatedMultiply = 1;
        if (!(b >= -2) || !(b <= 2)) {
            long j = ((b >>> 63) & ((long) (k & 1))) + Long.MAX_VALUE;
            while (k != 0) {
                if (k == 1) {
                    return saturatedMultiply(jSaturatedMultiply, b);
                }
                if ((k & 1) != 0) {
                    jSaturatedMultiply = saturatedMultiply(jSaturatedMultiply, b);
                }
                k >>= 1;
                if (k > 0) {
                    if ((-3037000499L > b) || (b > f64867f)) {
                        return j;
                    }
                    b *= b;
                }
            }
            return jSaturatedMultiply;
        }
        int i = (int) b;
        if (i == -2) {
            return k >= 64 ? ((long) (k & 1)) + Long.MAX_VALUE : (k & 1) == 0 ? 1 << k : (-1) << k;
        }
        if (i == -1) {
            return (k & 1) == 0 ? 1L : -1L;
        }
        if (i == 0) {
            return k == 0 ? 1L : 0L;
        }
        if (i == 1) {
            return 1L;
        }
        if (i != 2) {
            throw new AssertionError();
        }
        if (k >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << k;
    }

    public static long saturatedSubtract(long a, long b) {
        long j = a - b;
        return (((b ^ a) > 0L ? 1 : ((b ^ a) == 0L ? 0 : -1)) >= 0) | ((a ^ j) >= 0) ? j : ((j >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @jd7
    @yg8
    public static long sqrt(long j, RoundingMode roundingMode) {
        q3a.m20058f("x", j);
        if (m17985a(j)) {
            return w68.sqrt((int) j, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j);
        long j2 = jSqrt * jSqrt;
        switch (C9920a.f64873a[roundingMode.ordinal()]) {
            case 1:
                q3a.m20063k(j2 == j);
                return jSqrt;
            case 2:
            case 3:
                return j < j2 ? jSqrt - 1 : jSqrt;
            case 4:
            case 5:
                return j > j2 ? jSqrt + 1 : jSqrt;
            case 6:
            case 7:
            case 8:
                long j3 = jSqrt - ((long) (j < j2 ? 1 : 0));
                return j3 + ((long) m17986b((j3 * j3) + j3, j));
            default:
                throw new AssertionError();
        }
    }

    @jd7
    @yg8
    public static long mod(long x, long m) {
        if (m <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j = x % m;
        return j >= 0 ? j : j + m;
    }
}
