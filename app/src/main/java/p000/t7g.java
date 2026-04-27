package p000;

/* JADX INFO: loaded from: classes.dex */
public final class t7g {
    public static final int findParagraphEnd(@yfb CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int findParagraphStart(@yfb CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final long getParagraphBoundary(@yfb CharSequence charSequence, int i) {
        return kvg.TextRange(findParagraphStart(charSequence, i), findParagraphEnd(charSequence, i));
    }
}
