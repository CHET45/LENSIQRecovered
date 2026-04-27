package p000;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "UStringsKt")
public final class pqh {
    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    /* JADX INFO: renamed from: toString-JSWoG40, reason: not valid java name */
    public static final String m31862toStringJSWoG40(long j, int i) {
        return kvh.ulongToString(j, tw1.checkRadix(i));
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    /* JADX INFO: renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final String m31863toStringLxnNnR4(byte b, int i) {
        String string = Integer.toString(b & 255, tw1.checkRadix(i));
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    /* JADX INFO: renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final String m31864toStringV7xB4Y4(int i, int i2) {
        return kvh.ulongToString(((long) i) & 4294967295L, tw1.checkRadix(i2));
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @yfb
    /* JADX INFO: renamed from: toString-olVBNx4, reason: not valid java name */
    public static final String m31865toStringolVBNx4(short s, int i) {
        String string = Integer.toString(s & iqh.f48007d, tw1.checkRadix(i));
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final byte toUByte(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        goh uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.m29836unboximpl();
        }
        g9g.numberFormatError(str);
        throw new us8();
    }

    @gib
    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final goh toUByteOrNull(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        return toUByteOrNull(str, 10);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final int toUInt(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        woh uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.m33056unboximpl();
        }
        g9g.numberFormatError(str);
        throw new us8();
    }

    @gib
    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final woh toUIntOrNull(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        return toUIntOrNull(str, 10);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final long toULong(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        oph uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.m31585unboximpl();
        }
        g9g.numberFormatError(str);
        throw new us8();
    }

    @gib
    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final oph toULongOrNull(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        return toULongOrNull(str, 10);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final short toUShort(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        iqh uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.m30374unboximpl();
        }
        g9g.numberFormatError(str);
        throw new us8();
    }

    @gib
    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final iqh toUShortOrNull(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        return toUShortOrNull(str, 10);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final byte toUByte(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        goh uByteOrNull = toUByteOrNull(str, i);
        if (uByteOrNull != null) {
            return uByteOrNull.m29836unboximpl();
        }
        g9g.numberFormatError(str);
        throw new us8();
    }

    @gib
    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final goh toUByteOrNull(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        woh uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int iM33056unboximpl = uIntOrNull.m33056unboximpl();
        if (Integer.compareUnsigned(iM33056unboximpl, woh.m33004constructorimpl(255)) > 0) {
            return null;
        }
        return goh.m29780boximpl(goh.m29786constructorimpl((byte) iM33056unboximpl));
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final int toUInt(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        woh uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull != null) {
            return uIntOrNull.m33056unboximpl();
        }
        g9g.numberFormatError(str);
        throw new us8();
    }

    @gib
    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final woh toUIntOrNull(@yfb String str, int i) {
        int i2;
        md8.checkNotNullParameter(str, "<this>");
        tw1.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (md8.compare((int) cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int iM33004constructorimpl = woh.m33004constructorimpl(i);
        int iDivideUnsigned = 119304647;
        while (i2 < length) {
            int iDigitOf = tw1.digitOf(str.charAt(i2), i);
            if (iDigitOf < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i3, iDivideUnsigned) > 0) {
                if (iDivideUnsigned == 119304647) {
                    iDivideUnsigned = Integer.divideUnsigned(-1, iM33004constructorimpl);
                    if (Integer.compareUnsigned(i3, iDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            int iM33004constructorimpl2 = woh.m33004constructorimpl(i3 * iM33004constructorimpl);
            int iM33004constructorimpl3 = woh.m33004constructorimpl(woh.m33004constructorimpl(iDigitOf) + iM33004constructorimpl2);
            if (Integer.compareUnsigned(iM33004constructorimpl3, iM33004constructorimpl2) < 0) {
                return null;
            }
            i2++;
            i3 = iM33004constructorimpl3;
        }
        return woh.m32998boximpl(i3);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final long toULong(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        oph uLongOrNull = toULongOrNull(str, i);
        if (uLongOrNull != null) {
            return uLongOrNull.m31585unboximpl();
        }
        g9g.numberFormatError(str);
        throw new us8();
    }

    @gib
    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final oph toULongOrNull(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        tw1.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (md8.compare((int) cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jM31533constructorimpl = oph.m31533constructorimpl(i);
        long j = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i2 < length) {
            int iDigitOf = tw1.digitOf(str.charAt(i2), i);
            if (iDigitOf < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                if (jDivideUnsigned == 512409557603043100L) {
                    jDivideUnsigned = Long.divideUnsigned(-1L, jM31533constructorimpl);
                    if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            long jM31533constructorimpl2 = oph.m31533constructorimpl(j * jM31533constructorimpl);
            long jM31533constructorimpl3 = oph.m31533constructorimpl(oph.m31533constructorimpl(((long) woh.m33004constructorimpl(iDigitOf)) & 4294967295L) + jM31533constructorimpl2);
            if (Long.compareUnsigned(jM31533constructorimpl3, jM31533constructorimpl2) < 0) {
                return null;
            }
            i2++;
            j = jM31533constructorimpl3;
        }
        return oph.m31527boximpl(j);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final short toUShort(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        iqh uShortOrNull = toUShortOrNull(str, i);
        if (uShortOrNull != null) {
            return uShortOrNull.m30374unboximpl();
        }
        g9g.numberFormatError(str);
        throw new us8();
    }

    @gib
    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final iqh toUShortOrNull(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        woh uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int iM33056unboximpl = uIntOrNull.m33056unboximpl();
        if (Integer.compareUnsigned(iM33056unboximpl, woh.m33004constructorimpl(65535)) > 0) {
            return null;
        }
        return iqh.m30318boximpl(iqh.m30324constructorimpl((short) iM33056unboximpl));
    }
}
