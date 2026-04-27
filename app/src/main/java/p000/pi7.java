package p000;

/* JADX INFO: loaded from: classes8.dex */
public class pi7 extends AbstractC5537f0 {

    /* JADX INFO: renamed from: a */
    public final ni7 f70928a;

    /* JADX INFO: renamed from: b */
    public final String f70929b;

    /* JADX INFO: renamed from: pi7$a */
    public static class C10968a extends AbstractC6046g0 {
        @Override // p000.n61
        public t61 tryStart(zhc zhcVar, xv9 xv9Var) {
            CharSequence paragraphContent;
            if (zhcVar.getIndent() >= bic.f13817k) {
                return t61.none();
            }
            CharSequence line = zhcVar.getLine();
            int nextNonSpaceIndex = zhcVar.getNextNonSpaceIndex();
            pi7 atxHeading = pi7.getAtxHeading(line, nextNonSpaceIndex);
            if (atxHeading != null) {
                return t61.m22390of(atxHeading).atIndex(line.length());
            }
            int setextHeadingLevel = pi7.getSetextHeadingLevel(line, nextNonSpaceIndex);
            return (setextHeadingLevel <= 0 || (paragraphContent = xv9Var.getParagraphContent()) == null) ? t61.none() : t61.m22390of(new pi7(setextHeadingLevel, paragraphContent.toString())).atIndex(line.length()).replaceActiveBlockParser();
        }
    }

    public pi7(int i, String str) {
        ni7 ni7Var = new ni7();
        this.f70928a = ni7Var;
        ni7Var.setLevel(i);
        this.f70929b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static pi7 getAtxHeading(CharSequence charSequence, int i) {
        int iSkip = bic.skip('#', charSequence, i, charSequence.length()) - i;
        if (iSkip == 0 || iSkip > 6) {
            return null;
        }
        int i2 = i + iSkip;
        if (i2 >= charSequence.length()) {
            return new pi7(iSkip, "");
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt != ' ' && cCharAt != '\t') {
            return null;
        }
        int iSkipSpaceTabBackwards = bic.skipSpaceTabBackwards(charSequence, charSequence.length() - 1, i2);
        int iSkipBackwards = bic.skipBackwards('#', charSequence, iSkipSpaceTabBackwards, i2);
        int iSkipSpaceTabBackwards2 = bic.skipSpaceTabBackwards(charSequence, iSkipBackwards, i2);
        return iSkipSpaceTabBackwards2 != iSkipBackwards ? new pi7(iSkip, charSequence.subSequence(i2, iSkipSpaceTabBackwards2 + 1).toString()) : new pi7(iSkip, charSequence.subSequence(i2, iSkipSpaceTabBackwards + 1).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getSetextHeadingLevel(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt != '-') {
            if (cCharAt != '=') {
                return 0;
            }
            if (isSetextHeadingRest(charSequence, i + 1, '=')) {
                return 1;
            }
        }
        return isSetextHeadingRest(charSequence, i + 1, '-') ? 2 : 0;
    }

    private static boolean isSetextHeadingRest(CharSequence charSequence, int i, char c) {
        return bic.skipSpaceTab(charSequence, bic.skip(c, charSequence, i, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // p000.m61
    public b61 getBlock() {
        return this.f70928a;
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public void parseInlines(u28 u28Var) {
        u28Var.parse(this.f70929b, this.f70928a);
    }

    @Override // p000.m61
    public d61 tryContinue(zhc zhcVar) {
        return d61.none();
    }
}
