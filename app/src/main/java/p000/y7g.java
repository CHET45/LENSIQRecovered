package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCommentLexers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/StringJsonLexerWithComments\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,219:1\n158#2:220\n*S KotlinDebug\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/StringJsonLexerWithComments\n*L\n66#1:220\n*E\n"})
public final class y7g extends w7g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7g(@yfb String str) {
        super(str);
        md8.checkNotNullParameter(str, "source");
    }

    @Override // p000.w7g, p000.AbstractC2163c2
    public boolean canConsumeValue() {
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= getSource().length() || iSkipWhitespaces == -1) {
            return false;
        }
        return m3635d(getSource().charAt(iSkipWhitespaces));
    }

    @Override // p000.w7g, p000.AbstractC2163c2
    public byte consumeNextToken() {
        String source = getSource();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1) {
            return (byte) 10;
        }
        this.f15565a = iSkipWhitespaces + 1;
        return C4584d2.charToTokenClass(source.charAt(iSkipWhitespaces));
    }

    @Override // p000.AbstractC2163c2
    public byte peekNextToken() {
        String source = getSource();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1) {
            return (byte) 10;
        }
        this.f15565a = iSkipWhitespaces;
        return C4584d2.charToTokenClass(source.charAt(iSkipWhitespaces));
    }

    @Override // p000.w7g, p000.AbstractC2163c2
    public int skipWhitespaces() {
        int i;
        int iIndexOf$default = this.f15565a;
        if (iIndexOf$default == -1) {
            return iIndexOf$default;
        }
        String source = getSource();
        while (iIndexOf$default < source.length()) {
            char cCharAt = source.charAt(iIndexOf$default);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i = iIndexOf$default + 1) >= source.length()) {
                    break;
                }
                char cCharAt2 = source.charAt(i);
                if (cCharAt2 == '*') {
                    int iIndexOf$default2 = m9g.indexOf$default((CharSequence) source, "*/", iIndexOf$default + 2, false, 4, (Object) null);
                    if (iIndexOf$default2 == -1) {
                        this.f15565a = source.length();
                        AbstractC2163c2.fail$default(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new us8();
                    }
                    iIndexOf$default = iIndexOf$default2 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iIndexOf$default = m9g.indexOf$default((CharSequence) source, '\n', iIndexOf$default + 2, false, 4, (Object) null);
                    if (iIndexOf$default == -1) {
                        iIndexOf$default = source.length();
                    }
                }
            }
            iIndexOf$default++;
        }
        this.f15565a = iIndexOf$default;
        return iIndexOf$default;
    }

    @Override // p000.w7g, p000.AbstractC2163c2
    public void consumeNextToken(char c) {
        String source = getSource();
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
}
