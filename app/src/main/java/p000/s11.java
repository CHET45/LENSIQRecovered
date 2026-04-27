package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@ay4
public final class s11 {

    /* JADX INFO: renamed from: a */
    @gdi
    public static final int f80355a = 256;

    /* JADX INFO: renamed from: b */
    @gdi
    public static final BigInteger f80356b = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* JADX INFO: renamed from: c */
    public static final double f80357c = Math.log(10.0d);

    /* JADX INFO: renamed from: d */
    public static final double f80358d = Math.log(2.0d);

    /* JADX INFO: renamed from: s11$a */
    public static /* synthetic */ class C12391a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f80359a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f80359a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80359a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80359a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f80359a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f80359a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f80359a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f80359a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f80359a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: s11$b */
    @jd7
    @yg8
    public static class C12392b extends f3h<BigInteger> {

        /* JADX INFO: renamed from: a */
        public static final C12392b f80360a = new C12392b();

        private C12392b() {
        }

        @Override // p000.f3h
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigInteger mo10496a(BigInteger a, BigInteger b) {
            return a.subtract(b);
        }

        @Override // p000.f3h
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public double mo10498c(BigInteger bigInteger) {
            return ik4.m13149a(bigInteger);
        }

        @Override // p000.f3h
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int mo10499d(BigInteger bigInteger) {
            return bigInteger.signum();
        }

        @Override // p000.f3h
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public BigInteger mo10500e(double d, RoundingMode mode) {
            return dk4.roundToBigInteger(d, mode);
        }
    }

    private s11() {
    }

    @jd7
    @yg8
    /* JADX INFO: renamed from: a */
    public static boolean m21639a(BigInteger x) {
        return x.bitLength() <= 63;
    }

    /* JADX INFO: renamed from: b */
    public static BigInteger m21640b(List<BigInteger> nums) {
        return m21641c(nums, 0, nums.size());
    }

    public static BigInteger binomial(int n, int k) {
        int i;
        q3a.m20057e("n", n);
        q3a.m20057e("k", k);
        int i2 = 1;
        v7d.checkArgument(k <= n, "k (%s) > n (%s)", k, n);
        if (k > (n >> 1)) {
            k = n - k;
        }
        int[] iArr = nl9.f64869h;
        if (k < iArr.length && n <= iArr[k]) {
            return BigInteger.valueOf(nl9.binomial(n, k));
        }
        BigInteger bigIntegerDivide = BigInteger.ONE;
        long j = n;
        int iLog2 = nl9.log2(j, RoundingMode.CEILING);
        long j2 = 1;
        while (true) {
            int i3 = iLog2;
            while (i2 < k) {
                i = n - i2;
                i2++;
                i3 += iLog2;
                if (i3 >= 63) {
                    break;
                }
                j *= (long) i;
                j2 *= (long) i2;
            }
            return bigIntegerDivide.multiply(BigInteger.valueOf(j)).divide(BigInteger.valueOf(j2));
            bigIntegerDivide = bigIntegerDivide.multiply(BigInteger.valueOf(j)).divide(BigInteger.valueOf(j2));
            j = i;
            j2 = i2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static BigInteger m21641c(List<BigInteger> nums, int start, int end) {
        int i = end - start;
        if (i == 0) {
            return BigInteger.ONE;
        }
        if (i == 1) {
            return nums.get(start);
        }
        if (i == 2) {
            return nums.get(start).multiply(nums.get(start + 1));
        }
        if (i == 3) {
            return nums.get(start).multiply(nums.get(start + 1)).multiply(nums.get(start + 2));
        }
        int i2 = (end + start) >>> 1;
        return m21641c(nums, start, i2).multiply(m21641c(nums, i2, end));
    }

    public static BigInteger ceilingPowerOfTwo(BigInteger x) {
        return BigInteger.ZERO.setBit(log2(x, RoundingMode.CEILING));
    }

    @jd7
    @yg8
    public static BigInteger divide(BigInteger p, BigInteger q, RoundingMode mode) {
        return new BigDecimal(p).divide(new BigDecimal(q), 0, mode).toBigIntegerExact();
    }

    public static BigInteger factorial(int n) {
        q3a.m20057e("n", n);
        long[] jArr = nl9.f64868g;
        if (n < jArr.length) {
            return BigInteger.valueOf(jArr[n]);
        }
        RoundingMode roundingMode = RoundingMode.CEILING;
        ArrayList arrayList = new ArrayList(w68.divide(w68.log2(n, roundingMode) * n, 64, roundingMode));
        int length = jArr.length;
        long j = jArr[length - 1];
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j2 = j >> iNumberOfTrailingZeros;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int iLog2 = nl9.log2(j2, roundingMode2) + 1;
        long j3 = length;
        int iLog22 = nl9.log2(j3, roundingMode2);
        int i = iLog22 + 1;
        int i2 = 1 << iLog22;
        while (j3 <= n) {
            if ((j3 & ((long) i2)) != 0) {
                i2 <<= 1;
                i++;
            }
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
            long j4 = j3 >> iNumberOfTrailingZeros2;
            iNumberOfTrailingZeros += iNumberOfTrailingZeros2;
            if ((i - iNumberOfTrailingZeros2) + iLog2 >= 64) {
                arrayList.add(BigInteger.valueOf(j2));
                j2 = 1;
            }
            j2 *= j4;
            iLog2 = nl9.log2(j2, RoundingMode.FLOOR) + 1;
            j3++;
        }
        if (j2 > 1) {
            arrayList.add(BigInteger.valueOf(j2));
        }
        return m21640b(arrayList).shiftLeft(iNumberOfTrailingZeros);
    }

    public static BigInteger floorPowerOfTwo(BigInteger x) {
        return BigInteger.ZERO.setBit(log2(x, RoundingMode.FLOOR));
    }

    public static boolean isPowerOfTwo(BigInteger x) {
        v7d.checkNotNull(x);
        return x.signum() > 0 && x.getLowestSetBit() == x.bitLength() - 1;
    }

    @jd7
    @yg8
    public static int log10(BigInteger x, RoundingMode mode) {
        int iCompareTo;
        q3a.m20062j("x", x);
        if (m21639a(x)) {
            return nl9.log10(x.longValue(), mode);
        }
        int iLog2 = (int) ((((double) log2(x, RoundingMode.FLOOR)) * f80358d) / f80357c);
        BigInteger bigInteger = BigInteger.TEN;
        BigInteger bigIntegerPow = bigInteger.pow(iLog2);
        int iCompareTo2 = bigIntegerPow.compareTo(x);
        if (iCompareTo2 > 0) {
            do {
                iLog2--;
                bigIntegerPow = bigIntegerPow.divide(BigInteger.TEN);
                iCompareTo = bigIntegerPow.compareTo(x);
            } while (iCompareTo > 0);
        } else {
            BigInteger bigIntegerMultiply = bigInteger.multiply(bigIntegerPow);
            int i = iCompareTo2;
            int iCompareTo3 = bigIntegerMultiply.compareTo(x);
            while (iCompareTo3 <= 0) {
                iLog2++;
                BigInteger bigIntegerMultiply2 = BigInteger.TEN.multiply(bigIntegerMultiply);
                int iCompareTo4 = bigIntegerMultiply2.compareTo(x);
                bigIntegerPow = bigIntegerMultiply;
                bigIntegerMultiply = bigIntegerMultiply2;
                i = iCompareTo3;
                iCompareTo3 = iCompareTo4;
            }
            iCompareTo = i;
        }
        switch (C12391a.f80359a[mode.ordinal()]) {
            case 1:
                q3a.m20063k(iCompareTo == 0);
            case 2:
            case 3:
                return iLog2;
            case 4:
            case 5:
                return bigIntegerPow.equals(x) ? iLog2 : iLog2 + 1;
            case 6:
            case 7:
            case 8:
                return x.pow(2).compareTo(bigIntegerPow.pow(2).multiply(BigInteger.TEN)) <= 0 ? iLog2 : iLog2 + 1;
            default:
                throw new AssertionError();
        }
    }

    public static int log2(BigInteger x, RoundingMode mode) {
        q3a.m20062j("x", (BigInteger) v7d.checkNotNull(x));
        int iBitLength = x.bitLength();
        int i = iBitLength - 1;
        switch (C12391a.f80359a[mode.ordinal()]) {
            case 1:
                q3a.m20063k(isPowerOfTwo(x));
            case 2:
            case 3:
                return i;
            case 4:
            case 5:
                return isPowerOfTwo(x) ? i : iBitLength;
            case 6:
            case 7:
            case 8:
                return i < 256 ? x.compareTo(f80356b.shiftRight(256 - i)) <= 0 ? i : iBitLength : x.pow(2).bitLength() + (-1) < (i * 2) + 1 ? i : iBitLength;
            default:
                throw new AssertionError();
        }
    }

    @jd7
    @yg8
    public static double roundToDouble(BigInteger x, RoundingMode mode) {
        return C12392b.f80360a.m10497b(x, mode);
    }

    @jd7
    @yg8
    public static BigInteger sqrt(BigInteger x, RoundingMode mode) {
        q3a.m20059g("x", x);
        if (m21639a(x)) {
            return BigInteger.valueOf(nl9.sqrt(x.longValue(), mode));
        }
        BigInteger bigIntegerSqrtFloor = sqrtFloor(x);
        switch (C12391a.f80359a[mode.ordinal()]) {
            case 1:
                q3a.m20063k(bigIntegerSqrtFloor.pow(2).equals(x));
            case 2:
            case 3:
                return bigIntegerSqrtFloor;
            case 4:
            case 5:
                int iIntValue = bigIntegerSqrtFloor.intValue();
                return (iIntValue * iIntValue == x.intValue() && bigIntegerSqrtFloor.pow(2).equals(x)) ? bigIntegerSqrtFloor : bigIntegerSqrtFloor.add(BigInteger.ONE);
            case 6:
            case 7:
            case 8:
                return bigIntegerSqrtFloor.pow(2).add(bigIntegerSqrtFloor).compareTo(x) >= 0 ? bigIntegerSqrtFloor : bigIntegerSqrtFloor.add(BigInteger.ONE);
            default:
                throw new AssertionError();
        }
    }

    @jd7
    @yg8
    private static BigInteger sqrtApproxWithDoubles(BigInteger x) {
        return dk4.roundToBigInteger(Math.sqrt(ik4.m13149a(x)), RoundingMode.HALF_EVEN);
    }

    @jd7
    @yg8
    private static BigInteger sqrtFloor(BigInteger x) {
        BigInteger bigIntegerShiftLeft;
        int iLog2 = log2(x, RoundingMode.FLOOR);
        if (iLog2 < 1023) {
            bigIntegerShiftLeft = sqrtApproxWithDoubles(x);
        } else {
            int i = (iLog2 - 52) & (-2);
            bigIntegerShiftLeft = sqrtApproxWithDoubles(x.shiftRight(i)).shiftLeft(i >> 1);
        }
        BigInteger bigIntegerShiftRight = bigIntegerShiftLeft.add(x.divide(bigIntegerShiftLeft)).shiftRight(1);
        if (bigIntegerShiftLeft.equals(bigIntegerShiftRight)) {
            return bigIntegerShiftLeft;
        }
        while (true) {
            BigInteger bigIntegerShiftRight2 = bigIntegerShiftRight.add(x.divide(bigIntegerShiftRight)).shiftRight(1);
            if (bigIntegerShiftRight2.compareTo(bigIntegerShiftRight) >= 0) {
                return bigIntegerShiftRight;
            }
            bigIntegerShiftRight = bigIntegerShiftRight2;
        }
    }
}
