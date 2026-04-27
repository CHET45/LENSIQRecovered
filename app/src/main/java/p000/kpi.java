package p000;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class kpi {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C8494a f54932e = new C8494a(null);

    /* JADX INFO: renamed from: f */
    public static final int f54933f = 8;

    /* JADX INFO: renamed from: g */
    public static final int f54934g = 50;

    /* JADX INFO: renamed from: a */
    @yfb
    public final CharSequence f54935a;

    /* JADX INFO: renamed from: b */
    public final int f54936b;

    /* JADX INFO: renamed from: c */
    public final int f54937c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final BreakIterator f54938d;

    /* JADX INFO: renamed from: kpi$a */
    public static final class C8494a {
        public /* synthetic */ C8494a(jt3 jt3Var) {
            this();
        }

        public final boolean isPunctuation$ui_text_release(int i) {
            int type = Character.getType(i);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private C8494a() {
        }
    }

    public kpi(@yfb CharSequence charSequence, int i, int i2, @gib Locale locale) {
        this.f54935a = charSequence;
        if (i < 0 || i > charSequence.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i2 < 0 || i2 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f54938d = wordInstance;
        this.f54936b = Math.max(0, i - 50);
        this.f54937c = Math.min(charSequence.length(), i2 + 50);
        wordInstance.setText(new cw1(charSequence, i, i2));
    }

    private final void checkOffsetIsValid(int i) {
        int i2 = this.f54936b;
        if (i > this.f54937c || i2 > i) {
            throw new IllegalArgumentException(("Invalid offset: " + i + ". Valid range is [" + this.f54936b + " , " + this.f54937c + C4584d2.f28243l).toString());
        }
    }

    private final int getBeginning(int i, boolean z) {
        checkOffsetIsValid(i);
        if (isOnLetterOrDigit(i)) {
            return (!this.f54938d.isBoundary(i) || (isAfterLetterOrDigit(i) && z)) ? this.f54938d.preceding(i) : i;
        }
        if (isAfterLetterOrDigit(i)) {
            return this.f54938d.preceding(i);
        }
        return -1;
    }

    private final int getEnd(int i, boolean z) {
        checkOffsetIsValid(i);
        if (isAfterLetterOrDigit(i)) {
            return (!this.f54938d.isBoundary(i) || (isOnLetterOrDigit(i) && z)) ? this.f54938d.following(i) : i;
        }
        if (isOnLetterOrDigit(i)) {
            return this.f54938d.following(i);
        }
        return -1;
    }

    private final boolean isAfterLetterOrDigit(int i) {
        return i <= this.f54937c && this.f54936b + 1 <= i && Character.isLetterOrDigit(Character.codePointBefore(this.f54935a, i));
    }

    private final boolean isOnLetterOrDigit(int i) {
        return i < this.f54937c && this.f54936b <= i && Character.isLetterOrDigit(Character.codePointAt(this.f54935a, i));
    }

    private final boolean isPunctuationEndBoundary(int i) {
        return !isOnPunctuation(i) && isAfterPunctuation(i);
    }

    private final boolean isPunctuationStartBoundary(int i) {
        return isOnPunctuation(i) && !isAfterPunctuation(i);
    }

    public final int getNextWordEndOnTwoWordBoundary(int i) {
        return getEnd(i, true);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int i) {
        return getBeginning(i, true);
    }

    public final int getPunctuationBeginning(int i) {
        checkOffsetIsValid(i);
        while (i != -1 && !isPunctuationStartBoundary(i)) {
            i = prevBoundary(i);
        }
        return i;
    }

    public final int getPunctuationEnd(int i) {
        checkOffsetIsValid(i);
        while (i != -1 && !isPunctuationEndBoundary(i)) {
            i = nextBoundary(i);
        }
        return i;
    }

    public final boolean isAfterPunctuation(int i) {
        int i2 = this.f54936b + 1;
        if (i > this.f54937c || i2 > i) {
            return false;
        }
        return f54932e.isPunctuation$ui_text_release(Character.codePointBefore(this.f54935a, i));
    }

    public final boolean isOnPunctuation(int i) {
        int i2 = this.f54936b;
        if (i >= this.f54937c || i2 > i) {
            return false;
        }
        return f54932e.isPunctuation$ui_text_release(Character.codePointAt(this.f54935a, i));
    }

    public final int nextBoundary(int i) {
        checkOffsetIsValid(i);
        return this.f54938d.following(i);
    }

    public final int prevBoundary(int i) {
        checkOffsetIsValid(i);
        return this.f54938d.preceding(i);
    }
}
