package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public final class i80 {

    /* JADX INFO: renamed from: A */
    public static final byte f45967A = 23;

    /* JADX INFO: renamed from: B */
    public static final byte f45968B = 24;

    /* JADX INFO: renamed from: C */
    public static final byte f45969C = 25;

    /* JADX INFO: renamed from: D */
    public static final byte f45970D = 26;

    /* JADX INFO: renamed from: E */
    public static final byte f45971E = 27;

    /* JADX INFO: renamed from: F */
    public static final byte f45972F = 28;

    /* JADX INFO: renamed from: G */
    public static final byte f45973G = 29;

    /* JADX INFO: renamed from: H */
    public static final byte f45974H = 30;

    /* JADX INFO: renamed from: I */
    public static final byte f45975I = 31;

    /* JADX INFO: renamed from: J */
    public static final byte f45976J = 32;

    /* JADX INFO: renamed from: K */
    public static final byte f45977K = 32;

    /* JADX INFO: renamed from: L */
    public static final byte f45978L = 127;

    /* JADX INFO: renamed from: M */
    public static final char f45979M = 0;

    /* JADX INFO: renamed from: N */
    public static final char f45980N = 127;

    /* JADX INFO: renamed from: O */
    public static final char f45981O = ' ';

    /* JADX INFO: renamed from: a */
    public static final byte f45982a = 0;

    /* JADX INFO: renamed from: b */
    public static final byte f45983b = 1;

    /* JADX INFO: renamed from: c */
    public static final byte f45984c = 2;

    /* JADX INFO: renamed from: d */
    public static final byte f45985d = 3;

    /* JADX INFO: renamed from: e */
    public static final byte f45986e = 4;

    /* JADX INFO: renamed from: f */
    public static final byte f45987f = 5;

    /* JADX INFO: renamed from: g */
    public static final byte f45988g = 6;

    /* JADX INFO: renamed from: h */
    public static final byte f45989h = 7;

    /* JADX INFO: renamed from: i */
    public static final byte f45990i = 8;

    /* JADX INFO: renamed from: j */
    public static final byte f45991j = 9;

    /* JADX INFO: renamed from: k */
    public static final byte f45992k = 10;

    /* JADX INFO: renamed from: l */
    public static final byte f45993l = 10;

    /* JADX INFO: renamed from: m */
    public static final byte f45994m = 11;

    /* JADX INFO: renamed from: n */
    public static final byte f45995n = 12;

    /* JADX INFO: renamed from: o */
    public static final byte f45996o = 13;

    /* JADX INFO: renamed from: p */
    public static final byte f45997p = 14;

    /* JADX INFO: renamed from: q */
    public static final byte f45998q = 15;

    /* JADX INFO: renamed from: r */
    public static final byte f45999r = 16;

    /* JADX INFO: renamed from: s */
    public static final byte f46000s = 17;

    /* JADX INFO: renamed from: t */
    public static final byte f46001t = 17;

    /* JADX INFO: renamed from: u */
    public static final byte f46002u = 18;

    /* JADX INFO: renamed from: v */
    public static final byte f46003v = 19;

    /* JADX INFO: renamed from: w */
    public static final byte f46004w = 19;

    /* JADX INFO: renamed from: x */
    public static final byte f46005x = 20;

    /* JADX INFO: renamed from: y */
    public static final byte f46006y = 21;

    /* JADX INFO: renamed from: z */
    public static final byte f46007z = 22;

    private i80() {
    }

    public static boolean equalsIgnoreCase(CharSequence s1, CharSequence s2) {
        int alphaIndex;
        int length = s1.length();
        if (s1 == s2) {
            return true;
        }
        if (length != s2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = s1.charAt(i);
            char cCharAt2 = s2.charAt(i);
            if (cCharAt != cCharAt2 && ((alphaIndex = getAlphaIndex(cCharAt)) >= 26 || alphaIndex != getAlphaIndex(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int getAlphaIndex(char c) {
        return (char) ((c | ' ') - 97);
    }

    public static boolean isLowerCase(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static String toLowerCase(String string) {
        int length = string.length();
        int i = 0;
        while (i < length) {
            if (isUpperCase(string.charAt(i))) {
                char[] charArray = string.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (isUpperCase(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return string;
    }

    public static String toUpperCase(String string) {
        int length = string.length();
        int i = 0;
        while (i < length) {
            if (isLowerCase(string.charAt(i))) {
                char[] charArray = string.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (isLowerCase(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return string;
    }

    public static String truncate(CharSequence charSequence, int i, String str) {
        v7d.checkNotNull(charSequence);
        int length = i - str.length();
        v7d.checkArgument(length >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", i, str.length());
        int length2 = charSequence.length();
        CharSequence charSequence2 = charSequence;
        if (length2 <= i) {
            String string = charSequence.toString();
            int length3 = string.length();
            charSequence2 = string;
            if (length3 <= i) {
                return string;
            }
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(charSequence2, 0, length);
        sb.append(str);
        return sb.toString();
    }

    public static String toLowerCase(CharSequence chars) {
        if (chars instanceof String) {
            return toLowerCase((String) chars);
        }
        int length = chars.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = toLowerCase(chars.charAt(i));
        }
        return String.valueOf(cArr);
    }

    public static String toUpperCase(CharSequence chars) {
        if (chars instanceof String) {
            return toUpperCase((String) chars);
        }
        int length = chars.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = toUpperCase(chars.charAt(i));
        }
        return String.valueOf(cArr);
    }

    public static char toLowerCase(char c) {
        return isUpperCase(c) ? (char) (c ^ ' ') : c;
    }

    public static char toUpperCase(char c) {
        return isLowerCase(c) ? (char) (c ^ ' ') : c;
    }
}
