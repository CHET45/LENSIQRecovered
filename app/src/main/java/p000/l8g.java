package p000;

/* JADX INFO: loaded from: classes4.dex */
public final class l8g {
    private l8g() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean equals(final CharSequence a, final CharSequence b) {
        int length;
        if (a == b) {
            return true;
        }
        if (a == null || b == null || (length = a.length()) != b.length()) {
            return false;
        }
        if ((a instanceof String) && (b instanceof String)) {
            return a.equals(b);
        }
        for (int i = 0; i < length; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsIgnoreCase(final String a, final String b) {
        return a == null ? b == null : a.equalsIgnoreCase(b);
    }

    public static boolean isEmpty(final CharSequence s) {
        return s == null || s.length() == 0;
    }

    public static boolean isSpace(final String s) {
        if (s == null) {
            return true;
        }
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTrimEmpty(final String s) {
        return s == null || s.trim().length() == 0;
    }

    public static int length(final CharSequence s) {
        if (s == null) {
            return 0;
        }
        return s.length();
    }

    public static String lowerFirstLetter(final String s) {
        if (isEmpty(s) || !Character.isUpperCase(s.charAt(0))) {
            return s;
        }
        return String.valueOf((char) (s.charAt(0) + ' ')) + s.substring(1);
    }

    public static String null2Length0(final String s) {
        return s == null ? "" : s;
    }

    public static String reverse(final String s) {
        int length = length(s);
        if (length <= 1) {
            return s;
        }
        int i = length >> 1;
        char[] charArray = s.toCharArray();
        for (int i2 = 0; i2 < i; i2++) {
            char c = charArray[i2];
            int i3 = (length - i2) - 1;
            charArray[i2] = charArray[i3];
            charArray[i3] = c;
        }
        return new String(charArray);
    }

    public static String toDBC(final String s) {
        if (isEmpty(s)) {
            return s;
        }
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            char c = charArray[i];
            if (c == 12288) {
                charArray[i] = ' ';
            } else if (65281 > c || c > 65374) {
                charArray[i] = c;
            } else {
                charArray[i] = (char) (c - 65248);
            }
        }
        return new String(charArray);
    }

    public static String toSBC(final String s) {
        if (isEmpty(s)) {
            return s;
        }
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            char c = charArray[i];
            if (c == ' ') {
                charArray[i] = 12288;
            } else if ('!' > c || c > '~') {
                charArray[i] = c;
            } else {
                charArray[i] = (char) (c + 65248);
            }
        }
        return new String(charArray);
    }

    public static String upperFirstLetter(final String s) {
        if (isEmpty(s) || !Character.isLowerCase(s.charAt(0))) {
            return s;
        }
        return String.valueOf((char) (s.charAt(0) - ' ')) + s.substring(1);
    }
}
