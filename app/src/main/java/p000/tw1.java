package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class tw1 {
    @yjd
    public static int checkRadix(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new f78(2, 36));
    }

    public static final int digitOf(char c, int i) {
        return Character.digit((int) c, i);
    }

    @yfb
    public static final ov1 getCategory(char c) {
        return ov1.f68865c.valueOf(Character.getType(c));
    }

    @yfb
    public static final tv1 getDirectionality(char c) {
        return tv1.f86047b.valueOf(Character.getDirectionality(c));
    }

    @t28
    private static final boolean isDefined(char c) {
        return Character.isDefined(c);
    }

    @t28
    private static final boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    @t28
    private static final boolean isHighSurrogate(char c) {
        return Character.isHighSurrogate(c);
    }

    @t28
    private static final boolean isISOControl(char c) {
        return Character.isISOControl(c);
    }

    @t28
    private static final boolean isIdentifierIgnorable(char c) {
        return Character.isIdentifierIgnorable(c);
    }

    @t28
    private static final boolean isJavaIdentifierPart(char c) {
        return Character.isJavaIdentifierPart(c);
    }

    @t28
    private static final boolean isJavaIdentifierStart(char c) {
        return Character.isJavaIdentifierStart(c);
    }

    @t28
    private static final boolean isLetter(char c) {
        return Character.isLetter(c);
    }

    @t28
    private static final boolean isLetterOrDigit(char c) {
        return Character.isLetterOrDigit(c);
    }

    @t28
    private static final boolean isLowSurrogate(char c) {
        return Character.isLowSurrogate(c);
    }

    @t28
    private static final boolean isLowerCase(char c) {
        return Character.isLowerCase(c);
    }

    @t28
    private static final boolean isTitleCase(char c) {
        return Character.isTitleCase(c);
    }

    @t28
    private static final boolean isUpperCase(char c) {
        return Character.isUpperCase(c);
    }

    public static boolean isWhitespace(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    @t28
    private static final String lowercase(char c) {
        String strValueOf = String.valueOf(c);
        md8.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    @t28
    private static final char lowercaseChar(char c) {
        return Character.toLowerCase(c);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    @yfb
    public static String titlecase(char c, @yfb Locale locale) {
        md8.checkNotNullParameter(locale, xs1.f99098B);
        String strUppercase = uppercase(c, locale);
        if (strUppercase.length() <= 1) {
            String strValueOf = String.valueOf(c);
            md8.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            md8.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return !md8.areEqual(strUppercase, upperCase) ? strUppercase : String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return strUppercase;
        }
        char cCharAt = strUppercase.charAt(0);
        md8.checkNotNull(strUppercase, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = strUppercase.substring(1);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        md8.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    @t28
    private static final char titlecaseChar(char c) {
        return Character.toTitleCase(c);
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.5")
    @q64(message = "Use lowercaseChar() instead.", replaceWith = @i2e(expression = "lowercaseChar()", imports = {}))
    private static final char toLowerCase(char c) {
        return Character.toLowerCase(c);
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.5")
    @q64(message = "Use titlecaseChar() instead.", replaceWith = @i2e(expression = "titlecaseChar()", imports = {}))
    private static final char toTitleCase(char c) {
        return Character.toTitleCase(c);
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.5")
    @q64(message = "Use uppercaseChar() instead.", replaceWith = @i2e(expression = "uppercaseChar()", imports = {}))
    private static final char toUpperCase(char c) {
        return Character.toUpperCase(c);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    @t28
    private static final String uppercase(char c) {
        String strValueOf = String.valueOf(c);
        md8.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        md8.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    @t28
    private static final char uppercaseChar(char c) {
        return Character.toUpperCase(c);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    @yfb
    public static String lowercase(char c, @yfb Locale locale) {
        md8.checkNotNullParameter(locale, xs1.f99098B);
        String strValueOf = String.valueOf(c);
        md8.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.5")
    @yfb
    public static final String uppercase(char c, @yfb Locale locale) {
        md8.checkNotNullParameter(locale, xs1.f99098B);
        String strValueOf = String.valueOf(c);
        md8.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        md8.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
