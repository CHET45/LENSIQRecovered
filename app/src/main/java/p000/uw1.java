package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1#2:350\n*E\n"})
public class uw1 extends tw1 {
    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    public static final char digitToChar(int i) {
        if (i >= 0 && i < 10) {
            return (char) (i + 48);
        }
        throw new IllegalArgumentException("Int " + i + " is not a decimal digit");
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    public static final int digitToInt(char c) {
        int iDigitOf = tw1.digitOf(c, 10);
        if (iDigitOf >= 0) {
            return iDigitOf;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    @gib
    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    public static final Integer digitToIntOrNull(char c) {
        Integer numValueOf = Integer.valueOf(tw1.digitOf(c, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final boolean equals(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean equals$default(char c, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return equals(c, c2, z);
    }

    public static final boolean isSurrogate(char c) {
        return 55296 <= c && c < 57344;
    }

    @t28
    private static final String plus(char c, String str) {
        md8.checkNotNullParameter(str, "other");
        return c + str;
    }

    @jjf(version = "1.5")
    @yfb
    public static String titlecase(char c) {
        return qui.titlecaseImpl(c);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    public static final char digitToChar(int i, int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new IllegalArgumentException("Invalid radix: " + i2 + ". Valid radix values are in range 2..36");
        }
        if (i >= 0 && i < i2) {
            return (char) (i < 10 ? i + 48 : ((char) (i + 65)) - '\n');
        }
        throw new IllegalArgumentException("Digit " + i + " does not represent a valid digit in radix " + i2);
    }

    @gib
    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    public static final Integer digitToIntOrNull(char c, int i) {
        tw1.checkRadix(i);
        Integer numValueOf = Integer.valueOf(tw1.digitOf(c, i));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    public static final int digitToInt(char c, int i) {
        Integer numDigitToIntOrNull = digitToIntOrNull(c, i);
        if (numDigitToIntOrNull != null) {
            return numDigitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c + " is not a digit in the given radix=" + i);
    }
}
