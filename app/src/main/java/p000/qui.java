package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class qui {
    @yfb
    public static final String titlecaseImpl(char c) {
        String strValueOf = String.valueOf(c);
        md8.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        md8.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        md8.checkNotNull(upperCase, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = upperCase.substring(1);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        md8.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }
}
