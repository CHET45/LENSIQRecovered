package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nStringJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n158#2:130\n158#2:131\n158#2:132\n158#2:133\n1863#3,2:134\n*S KotlinDebug\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n*L\n23#1:130\n38#1:131\n57#1:132\n73#1:133\n109#1:134,2\n*E\n"})
public class w7g extends AbstractC2163c2 {

    /* JADX INFO: renamed from: e */
    @yfb
    public final String f93539e;

    public w7g(@yfb String str) {
        md8.checkNotNullParameter(str, "source");
        this.f93539e = str;
    }

    @Override // p000.AbstractC2163c2
    public boolean canConsumeValue() {
        int i = this.f15565a;
        if (i == -1) {
            return false;
        }
        String source = getSource();
        while (i < source.length()) {
            char cCharAt = source.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f15565a = i;
                return m3635d(cCharAt);
            }
            i++;
        }
        this.f15565a = i;
        return false;
    }

    @Override // p000.AbstractC2163c2
    @yfb
    public String consumeKeyString() {
        consumeNextToken('\"');
        int i = this.f15565a;
        int iIndexOf$default = m9g.indexOf$default((CharSequence) getSource(), '\"', i, false, 4, (Object) null);
        if (iIndexOf$default == -1) {
            consumeStringLenient();
            fail$kotlinx_serialization_json((byte) 1, false);
            throw new us8();
        }
        for (int i2 = i; i2 < iIndexOf$default; i2++) {
            if (getSource().charAt(i2) == '\\') {
                return m3633b(getSource(), this.f15565a, i2);
            }
        }
        this.f15565a = iIndexOf$default + 1;
        String strSubstring = getSource().substring(i, iIndexOf$default);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // p000.AbstractC2163c2
    public byte consumeNextToken() {
        String source = getSource();
        int i = this.f15565a;
        while (i != -1 && i < source.length()) {
            int i2 = i + 1;
            char cCharAt = source.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f15565a = i2;
                return C4584d2.charToTokenClass(cCharAt);
            }
            i = i2;
        }
        this.f15565a = source.length();
        return (byte) 10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC2163c2
    public void consumeStringChunked(boolean z, @yfb qy6<? super String, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "consumeChunk");
        Iterator<T> it = t9g.chunked(z ? consumeStringLenient() : consumeString(), 16384).iterator();
        while (it.hasNext()) {
            qy6Var.invoke(it.next());
        }
    }

    @Override // p000.AbstractC2163c2
    @yfb
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String getSource() {
        return this.f93539e;
    }

    @Override // p000.AbstractC2163c2
    @gib
    public String peekLeadingMatchingValue(@yfb String str, boolean z) {
        md8.checkNotNullParameter(str, "keyToMatch");
        int i = this.f15565a;
        try {
            if (consumeNextToken() == 6 && md8.areEqual(peekString(z), str)) {
                discardPeeked();
                if (consumeNextToken() == 5) {
                    return peekString(z);
                }
            }
            return null;
        } finally {
            this.f15565a = i;
            discardPeeked();
        }
    }

    @Override // p000.AbstractC2163c2
    public int prefetchOrEof(int i) {
        if (i < getSource().length()) {
            return i;
        }
        return -1;
    }

    @Override // p000.AbstractC2163c2
    public int skipWhitespaces() {
        char cCharAt;
        int i = this.f15565a;
        if (i == -1) {
            return i;
        }
        String source = getSource();
        while (i < source.length() && ((cCharAt = source.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.f15565a = i;
        return i;
    }

    @Override // p000.AbstractC2163c2
    public void consumeNextToken(char c) {
        if (this.f15565a == -1) {
            m3638g(c);
        }
        String source = getSource();
        int i = this.f15565a;
        while (i < source.length()) {
            int i2 = i + 1;
            char cCharAt = source.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f15565a = i2;
                if (cCharAt == c) {
                    return;
                } else {
                    m3638g(c);
                }
            }
            i = i2;
        }
        this.f15565a = -1;
        m3638g(c);
    }
}
