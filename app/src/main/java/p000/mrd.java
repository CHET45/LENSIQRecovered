package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCommentLexers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/ReaderJsonLexerWithComments\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,219:1\n158#2:220\n*S KotlinDebug\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/ReaderJsonLexerWithComments\n*L\n204#1:220\n*E\n"})
public final class mrd extends krd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrd(@yfb ya8 ya8Var, @yfb char[] cArr) {
        super(ya8Var, cArr);
        md8.checkNotNullParameter(ya8Var, "reader");
        md8.checkNotNullParameter(cArr, "buffer");
    }

    private final scc<Integer, Boolean> handleComment(int i) {
        int i2 = i + 2;
        char cCharAt = getSource().charAt(i + 1);
        if (cCharAt != '*') {
            if (cCharAt != '/') {
                return vkh.m24050to(Integer.valueOf(i), Boolean.FALSE);
            }
            int iPrefetchOrEof = i2;
            while (i != -1) {
                int iIndexOf$default = m9g.indexOf$default((CharSequence) getSource(), '\n', iPrefetchOrEof, false, 4, (Object) null);
                if (iIndexOf$default != -1) {
                    return vkh.m24050to(Integer.valueOf(iIndexOf$default + 1), Boolean.TRUE);
                }
                iPrefetchOrEof = prefetchOrEof(getSource().length());
                i = iPrefetchOrEof;
            }
            return vkh.m24050to(-1, Boolean.TRUE);
        }
        boolean z = false;
        int iPrefetchWithinThreshold = i2;
        while (i != -1) {
            int iIndexOf$default2 = m9g.indexOf$default((CharSequence) getSource(), "*/", iPrefetchWithinThreshold, false, 4, (Object) null);
            if (iIndexOf$default2 != -1) {
                return vkh.m24050to(Integer.valueOf(iIndexOf$default2 + 2), Boolean.TRUE);
            }
            if (getSource().charAt(getSource().length() - 1) == '*') {
                iPrefetchWithinThreshold = prefetchWithinThreshold(getSource().length() - 1);
                if (z) {
                    break;
                }
                z = true;
            } else {
                iPrefetchWithinThreshold = prefetchOrEof(getSource().length());
            }
            i = iPrefetchWithinThreshold;
        }
        this.f15565a = getSource().length();
        AbstractC2163c2.fail$default(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
        throw new us8();
    }

    private final int prefetchWithinThreshold(int i) {
        if (getSource().length() - i > this.f55170g) {
            return i;
        }
        this.f15565a = i;
        ensureHaveChars();
        return (this.f15565a != 0 || getSource().length() == 0) ? -1 : 0;
    }

    @Override // p000.krd, p000.AbstractC2163c2
    public boolean canConsumeValue() {
        ensureHaveChars();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= getSource().length() || iSkipWhitespaces == -1) {
            return false;
        }
        return m3635d(getSource().charAt(iSkipWhitespaces));
    }

    @Override // p000.krd, p000.AbstractC2163c2
    public void consumeNextToken(char c) {
        ensureHaveChars();
        m50 source = getSource();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1) {
            this.f15565a = -1;
            m3638g(c);
        }
        char cCharAt = source.charAt(iSkipWhitespaces);
        this.f15565a = iSkipWhitespaces + 1;
        if (cCharAt == c) {
            return;
        }
        m3638g(c);
    }

    @Override // p000.AbstractC2163c2
    public byte peekNextToken() {
        ensureHaveChars();
        m50 source = getSource();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1) {
            return (byte) 10;
        }
        this.f15565a = iSkipWhitespaces;
        return C4584d2.charToTokenClass(source.charAt(iSkipWhitespaces));
    }

    @Override // p000.krd, p000.AbstractC2163c2
    public int skipWhitespaces() {
        int iPrefetchOrEof;
        int i = this.f15565a;
        while (true) {
            iPrefetchOrEof = prefetchOrEof(i);
            if (iPrefetchOrEof == -1) {
                break;
            }
            char cCharAt = getSource().charAt(iPrefetchOrEof);
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t') {
                i = iPrefetchOrEof + 1;
            } else {
                if (cCharAt != '/' || iPrefetchOrEof + 1 >= getSource().length()) {
                    break;
                }
                scc<Integer, Boolean> sccVarHandleComment = handleComment(iPrefetchOrEof);
                int iIntValue = sccVarHandleComment.component1().intValue();
                if (!sccVarHandleComment.component2().booleanValue()) {
                    iPrefetchOrEof = iIntValue;
                    break;
                }
                i = iIntValue;
            }
        }
        this.f15565a = iPrefetchOrEof;
        return iPrefetchOrEof;
    }

    @Override // p000.krd, p000.AbstractC2163c2
    public byte consumeNextToken() {
        ensureHaveChars();
        m50 source = getSource();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1) {
            return (byte) 10;
        }
        this.f15565a = iSkipWhitespaces + 1;
        return C4584d2.charToTokenClass(source.charAt(iSkipWhitespaces));
    }
}
