package p000;

import java.math.RoundingMode;
import org.opencv.videoio.Videoio;
import p000.ymh;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@ay4
public final class w68 {

    /* JADX INFO: renamed from: a */
    @gdi
    public static final int f93402a = 1073741824;

    /* JADX INFO: renamed from: b */
    @gdi
    public static final int f93403b = -1257966797;

    /* JADX INFO: renamed from: f */
    @gdi
    public static final int f93407f = 46340;

    /* JADX INFO: renamed from: c */
    @gdi
    public static final byte[] f93404c = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: d */
    @gdi
    public static final int[] f93405d = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: e */
    @gdi
    public static final int[] f93406e = {3, 31, ymh.InterfaceC15722a.f102113q, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: g */
    public static final int[] f93408g = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: h */
    @gdi
    public static int[] f93409h = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, Videoio.CAP_PROP_XI_GAMMAC, l87.f56762u, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: renamed from: w68$a */
    public static /* synthetic */ class C14437a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93410a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f93410a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93410a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93410a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93410a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93410a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93410a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93410a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f93410a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private w68() {
    }

    @gdi
    /* JADX INFO: renamed from: a */
    public static int m24351a(int x, int y) {
        return (~(~(x - y))) >>> 31;
    }

    public static int binomial(int n, int k) {
        q3a.m20057e("n", n);
        q3a.m20057e("k", k);
        int i = 0;
        v7d.checkArgument(k <= n, "k (%s) > n (%s)", k, n);
        if (k > (n >> 1)) {
            k = n - k;
        }
        int[] iArr = f93409h;
        if (k >= iArr.length || n > iArr[k]) {
            return Integer.MAX_VALUE;
        }
        if (k == 0) {
            return 1;
        }
        if (k == 1) {
            return n;
        }
        long j = 1;
        while (i < k) {
            long j2 = j * ((long) (n - i));
            i++;
            j = j2 / ((long) i);
        }
        return (int) j;
    }

    public static int ceilingPowerOfTwo(int x) {
        q3a.m20060h("x", x);
        if (x <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(x - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + x + ") not representable as an int");
    }

    public static int checkedAdd(int a, int b) {
        long j = ((long) a) + ((long) b);
        int i = (int) j;
        q3a.m20054b(j == ((long) i), "checkedAdd", a, b);
        return i;
    }

    public static int checkedMultiply(int a, int b) {
        long j = ((long) a) * ((long) b);
        int i = (int) j;
        q3a.m20054b(j == ((long) i), "checkedMultiply", a, b);
        return i;
    }

    public static int checkedPow(int b, int k) {
        q3a.m20057e("exponent", k);
        if (b == -2) {
            q3a.m20054b(k < 32, "checkedPow", b, k);
            return (k & 1) == 0 ? 1 << k : (-1) << k;
        }
        if (b == -1) {
            return (k & 1) == 0 ? 1 : -1;
        }
        if (b == 0) {
            return k == 0 ? 1 : 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            q3a.m20054b(k < 31, "checkedPow", b, k);
            return 1 << k;
        }
        int iCheckedMultiply = 1;
        while (k != 0) {
            if (k == 1) {
                return checkedMultiply(iCheckedMultiply, b);
            }
            if ((k & 1) != 0) {
                iCheckedMultiply = checkedMultiply(iCheckedMultiply, b);
            }
            k >>= 1;
            if (k > 0) {
                q3a.m20054b((-46340 <= b) & (b <= 46340), "checkedPow", b, k);
                b *= b;
            }
        }
        return iCheckedMultiply;
    }

    public static int checkedSubtract(int a, int b) {
        long j = ((long) a) - ((long) b);
        int i = (int) j;
        q3a.m20054b(j == ((long) i), "checkedSubtract", a, b);
        return i;
    }

    public static int divide(int p, int q, RoundingMode mode) {
        v7d.checkNotNull(mode);
        if (q == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i = p / q;
        int i2 = p - (q * i);
        if (i2 == 0) {
            return i;
        }
        int i3 = ((p ^ q) >> 31) | 1;
        switch (C14437a.f93410a[mode.ordinal()]) {
            case 1:
                q3a.m20063k(i2 == 0);
                return i;
            case 2:
                return i;
            case 3:
                if (i3 >= 0) {
                    return i;
                }
                break;
            case 4:
                break;
            case 5:
                if (i3 <= 0) {
                    return i;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i2);
                int iAbs2 = iAbs - (Math.abs(q) - iAbs);
                if (iAbs2 == 0) {
                    if (mode != RoundingMode.HALF_UP) {
                        if (!((mode == RoundingMode.HALF_EVEN) & ((i & 1) != 0))) {
                            return i;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i;
                }
            default:
                throw new AssertionError();
        }
        return i + i3;
    }

    public static int factorial(int n) {
        q3a.m20057e("n", n);
        int[] iArr = f93408g;
        if (n < iArr.length) {
            return iArr[n];
        }
        return Integer.MAX_VALUE;
    }

    public static int floorPowerOfTwo(int x) {
        q3a.m20060h("x", x);
        return Integer.highestOneBit(x);
    }

    public static int gcd(int a, int b) {
        q3a.m20057e("a", a);
        q3a.m20057e("b", b);
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(a);
        int iNumberOfTrailingZeros2 = a >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(b);
        int i = b >> iNumberOfTrailingZeros3;
        while (iNumberOfTrailingZeros2 != i) {
            int i2 = iNumberOfTrailingZeros2 - i;
            int i3 = (i2 >> 31) & i2;
            int i4 = (i2 - i3) - i3;
            i += i3;
            iNumberOfTrailingZeros2 = i4 >> Integer.numberOfTrailingZeros(i4);
        }
        return iNumberOfTrailingZeros2 << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros3);
    }

    public static boolean isPowerOfTwo(int x) {
        return (x > 0) & ((x & (x + (-1))) == 0);
    }

    @jd7
    @yg8
    public static boolean isPrime(int n) {
        return nl9.isPrime(n);
    }

    @jd7
    @yg8
    public static int log10(int x, RoundingMode mode) {
        int iM24351a;
        q3a.m20060h("x", x);
        int iLog10Floor = log10Floor(x);
        int i = f93405d[iLog10Floor];
        switch (C14437a.f93410a[mode.ordinal()]) {
            case 1:
                q3a.m20063k(x == i);
            case 2:
            case 3:
                return iLog10Floor;
            case 4:
            case 5:
                iM24351a = m24351a(i, x);
                return iLog10Floor + iM24351a;
            case 6:
            case 7:
            case 8:
                iM24351a = m24351a(f93406e[iLog10Floor], x);
                return iLog10Floor + iM24351a;
            default:
                throw new AssertionError();
        }
    }

    private static int log10Floor(int x) {
        byte b = f93404c[Integer.numberOfLeadingZeros(x)];
        return b - m24351a(x, f93405d[b]);
    }

    public static int log2(int x, RoundingMode mode) {
        q3a.m20060h("x", x);
        switch (C14437a.f93410a[mode.ordinal()]) {
            case 1:
                q3a.m20063k(isPowerOfTwo(x));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(x - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(x);
                return (31 - iNumberOfLeadingZeros) + m24351a(f93403b >>> iNumberOfLeadingZeros, x);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(x);
    }

    public static int mean(int x, int y) {
        return (x & y) + ((x ^ y) >> 1);
    }

    public static int mod(int x, int m) {
        if (m > 0) {
            int i = x % m;
            return i >= 0 ? i : i + m;
        }
        throw new ArithmeticException("Modulus " + m + " must be > 0");
    }

    @jd7
    @yg8
    public static int pow(int b, int k) {
        q3a.m20057e("exponent", k);
        if (b == -2) {
            if (k < 32) {
                return (k & 1) == 0 ? 1 << k : -(1 << k);
            }
            return 0;
        }
        if (b == -1) {
            return (k & 1) == 0 ? 1 : -1;
        }
        if (b == 0) {
            return k == 0 ? 1 : 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            if (k < 32) {
                return 1 << k;
            }
            return 0;
        }
        int i = 1;
        while (k != 0) {
            if (k == 1) {
                return b * i;
            }
            i *= (k & 1) == 0 ? 1 : b;
            b *= b;
            k >>= 1;
        }
        return i;
    }

    public static int saturatedAdd(int a, int b) {
        return rd8.saturatedCast(((long) a) + ((long) b));
    }

    public static int saturatedMultiply(int a, int b) {
        return rd8.saturatedCast(((long) a) * ((long) b));
    }

    public static int saturatedPow(int b, int k) {
        q3a.m20057e("exponent", k);
        if (b == -2) {
            return k >= 32 ? (k & 1) + Integer.MAX_VALUE : (k & 1) == 0 ? 1 << k : (-1) << k;
        }
        if (b == -1) {
            return (k & 1) == 0 ? 1 : -1;
        }
        if (b == 0) {
            return k == 0 ? 1 : 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            if (k >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << k;
        }
        int i = ((b >>> 31) & k & 1) + Integer.MAX_VALUE;
        int iSaturatedMultiply = 1;
        while (k != 0) {
            if (k == 1) {
                return saturatedMultiply(iSaturatedMultiply, b);
            }
            if ((k & 1) != 0) {
                iSaturatedMultiply = saturatedMultiply(iSaturatedMultiply, b);
            }
            k >>= 1;
            if (k > 0) {
                if ((-46340 > b) || (b > 46340)) {
                    return i;
                }
                b *= b;
            }
        }
        return iSaturatedMultiply;
    }

    public static int saturatedSubtract(int a, int b) {
        return rd8.saturatedCast(((long) a) - ((long) b));
    }

    @jd7
    public static int sqrt(int x, RoundingMode mode) {
        int iM24351a;
        q3a.m20057e("x", x);
        int iSqrtFloor = sqrtFloor(x);
        switch (C14437a.f93410a[mode.ordinal()]) {
            case 1:
                q3a.m20063k(iSqrtFloor * iSqrtFloor == x);
            case 2:
            case 3:
                return iSqrtFloor;
            case 4:
            case 5:
                iM24351a = m24351a(iSqrtFloor * iSqrtFloor, x);
                return iSqrtFloor + iM24351a;
            case 6:
            case 7:
            case 8:
                iM24351a = m24351a((iSqrtFloor * iSqrtFloor) + iSqrtFloor, x);
                return iSqrtFloor + iM24351a;
            default:
                throw new AssertionError();
        }
    }

    private static int sqrtFloor(int x) {
        return (int) Math.sqrt(x);
    }
}
