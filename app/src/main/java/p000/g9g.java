package p000;

/* JADX INFO: loaded from: classes7.dex */
public class g9g extends f9g {
    @yfb
    public static final Void numberFormatError(@yfb String str) {
        md8.checkNotNullParameter(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    @gib
    @jjf(version = "1.1")
    public static final Byte toByteOrNull(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        return toByteOrNull(str, 10);
    }

    @gib
    @jjf(version = "1.1")
    public static Integer toIntOrNull(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        return toIntOrNull(str, 10);
    }

    @gib
    @jjf(version = "1.1")
    public static Long toLongOrNull(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        return toLongOrNull(str, 10);
    }

    @gib
    @jjf(version = "1.1")
    public static final Short toShortOrNull(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        return toShortOrNull(str, 10);
    }

    @gib
    @jjf(version = "1.1")
    public static final Byte toByteOrNull(@yfb String str, int i) {
        int iIntValue;
        md8.checkNotNullParameter(str, "<this>");
        Integer intOrNull = toIntOrNull(str, i);
        if (intOrNull == null || (iIntValue = intOrNull.intValue()) < -128 || iIntValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) iIntValue);
    }

    @gib
    @jjf(version = "1.1")
    public static final Integer toIntOrNull(@yfb String str, int i) {
        boolean z;
        int i2;
        int i3;
        md8.checkNotNullParameter(str, "<this>");
        tw1.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        if (md8.compare((int) cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int iDigitOf = tw1.digitOf(str.charAt(i2), i);
            if (iDigitOf < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + iDigitOf) {
                return null;
            }
            i4 = i3 - iDigitOf;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    @gib
    @jjf(version = "1.1")
    public static final Long toLongOrNull(@yfb String str, int i) {
        boolean z;
        md8.checkNotNullParameter(str, "<this>");
        tw1.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (md8.compare((int) cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i2 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i2 < length) {
            int iDigitOf = tw1.digitOf(str.charAt(i2), i);
            if (iDigitOf < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / ((long) i);
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * ((long) i);
            long j6 = iDigitOf;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i2++;
            j2 = -256204778801521550L;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }

    @gib
    @jjf(version = "1.1")
    public static final Short toShortOrNull(@yfb String str, int i) {
        int iIntValue;
        md8.checkNotNullParameter(str, "<this>");
        Integer intOrNull = toIntOrNull(str, i);
        if (intOrNull == null || (iIntValue = intOrNull.intValue()) < -32768 || iIntValue > 32767) {
            return null;
        }
        return Short.valueOf((short) iIntValue);
    }
}
