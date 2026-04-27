package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nReaderJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReaderJsonLexer.kt\nkotlinx/serialization/json/internal/ReaderJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,221:1\n158#2:222\n158#2:223\n158#2:224\n*S KotlinDebug\n*F\n+ 1 ReaderJsonLexer.kt\nkotlinx/serialization/json/internal/ReaderJsonLexer\n*L\n66#1:222\n133#1:223\n150#1:224\n*E\n"})
public class krd extends AbstractC2163c2 {

    /* JADX INFO: renamed from: e */
    @yfb
    public final ya8 f55168e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final char[] f55169f;

    /* JADX INFO: renamed from: g */
    @un8
    public int f55170g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final m50 f55171h;

    public /* synthetic */ krd(ya8 ya8Var, char[] cArr, int i, jt3 jt3Var) {
        this(ya8Var, (i & 2) != 0 ? mv1.f62357c.take() : cArr);
    }

    private final void preload(int i) {
        char[] buffer$kotlinx_serialization_json = getSource().getBuffer$kotlinx_serialization_json();
        if (i != 0) {
            int i2 = this.f15565a;
            u70.copyInto(buffer$kotlinx_serialization_json, buffer$kotlinx_serialization_json, 0, i2, i2 + i);
        }
        int length = getSource().length();
        while (true) {
            if (i == length) {
                break;
            }
            int i3 = this.f55168e.read(buffer$kotlinx_serialization_json, i, length - i);
            if (i3 == -1) {
                getSource().trim(i);
                this.f55170g = -1;
                break;
            }
            i += i3;
        }
        this.f15565a = 0;
    }

    @Override // p000.AbstractC2163c2
    /* JADX INFO: renamed from: a */
    public void mo3632a(int i, int i2) {
        StringBuilder sbM3634c = m3634c();
        sbM3634c.append(getSource().getBuffer$kotlinx_serialization_json(), i, i2 - i);
        md8.checkNotNullExpressionValue(sbM3634c, "append(...)");
    }

    @Override // p000.AbstractC2163c2
    public boolean canConsumeValue() {
        ensureHaveChars();
        int i = this.f15565a;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i);
            if (iPrefetchOrEof == -1) {
                this.f15565a = iPrefetchOrEof;
                return false;
            }
            char cCharAt = getSource().charAt(iPrefetchOrEof);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f15565a = iPrefetchOrEof;
                return m3635d(cCharAt);
            }
            i = iPrefetchOrEof + 1;
        }
    }

    @Override // p000.AbstractC2163c2
    @yfb
    public String consumeKeyString() {
        consumeNextToken('\"');
        int i = this.f15565a;
        int iIndexOf = indexOf('\"', i);
        if (iIndexOf == -1) {
            int iPrefetchOrEof = prefetchOrEof(i);
            if (iPrefetchOrEof != -1) {
                return m3633b(getSource(), this.f15565a, iPrefetchOrEof);
            }
            AbstractC2163c2.fail$kotlinx_serialization_json$default(this, (byte) 1, false, 2, null);
            throw new us8();
        }
        for (int i2 = i; i2 < iIndexOf; i2++) {
            if (getSource().charAt(i2) == '\\') {
                return m3633b(getSource(), this.f15565a, i2);
            }
        }
        this.f15565a = iIndexOf + 1;
        return substring(i, iIndexOf);
    }

    @Override // p000.AbstractC2163c2
    public byte consumeNextToken() {
        ensureHaveChars();
        m50 source = getSource();
        int i = this.f15565a;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i);
            if (iPrefetchOrEof == -1) {
                this.f15565a = iPrefetchOrEof;
                return (byte) 10;
            }
            int i2 = iPrefetchOrEof + 1;
            byte bCharToTokenClass = C4584d2.charToTokenClass(source.charAt(iPrefetchOrEof));
            if (bCharToTokenClass != 3) {
                this.f15565a = i2;
                return bCharToTokenClass;
            }
            i = i2;
        }
    }

    @Override // p000.AbstractC2163c2
    public void ensureHaveChars() {
        int length = getSource().length() - this.f15565a;
        if (length > this.f55170g) {
            return;
        }
        preload(length);
    }

    @yfb
    public final char[] getBuffer() {
        return this.f55169f;
    }

    @yfb
    public final ya8 getReader() {
        return this.f55168e;
    }

    @Override // p000.AbstractC2163c2
    @yfb
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public m50 getSource() {
        return this.f55171h;
    }

    @Override // p000.AbstractC2163c2
    public int indexOf(char c, int i) {
        m50 source = getSource();
        int length = source.length();
        while (i < length) {
            if (source.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // p000.AbstractC2163c2
    @gib
    public String peekLeadingMatchingValue(@yfb String str, boolean z) {
        md8.checkNotNullParameter(str, "keyToMatch");
        return null;
    }

    @Override // p000.AbstractC2163c2
    public int prefetchOrEof(int i) {
        if (i < getSource().length()) {
            return i;
        }
        this.f15565a = i;
        ensureHaveChars();
        return (this.f15565a != 0 || getSource().length() == 0) ? -1 : 0;
    }

    public final void release() {
        mv1.f62357c.release(this.f55169f);
    }

    @Override // p000.AbstractC2163c2
    public int skipWhitespaces() {
        int iPrefetchOrEof;
        char cCharAt;
        int i = this.f15565a;
        while (true) {
            iPrefetchOrEof = prefetchOrEof(i);
            if (iPrefetchOrEof == -1 || !((cCharAt = getSource().charAt(iPrefetchOrEof)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i = iPrefetchOrEof + 1;
        }
        this.f15565a = iPrefetchOrEof;
        return iPrefetchOrEof;
    }

    @Override // p000.AbstractC2163c2
    @yfb
    public String substring(int i, int i2) {
        return getSource().substring(i, i2);
    }

    public krd(@yfb ya8 ya8Var, @yfb char[] cArr) {
        md8.checkNotNullParameter(ya8Var, "reader");
        md8.checkNotNullParameter(cArr, "buffer");
        this.f55168e = ya8Var;
        this.f55169f = cArr;
        this.f55170g = 128;
        this.f55171h = new m50(cArr);
        preload(0);
    }

    @Override // p000.AbstractC2163c2
    public void consumeNextToken(char c) {
        ensureHaveChars();
        m50 source = getSource();
        int i = this.f15565a;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i);
            if (iPrefetchOrEof != -1) {
                int i2 = iPrefetchOrEof + 1;
                char cCharAt = source.charAt(iPrefetchOrEof);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    this.f15565a = i2;
                    if (cCharAt == c) {
                        return;
                    } else {
                        m3638g(c);
                    }
                }
                i = i2;
            } else {
                this.f15565a = iPrefetchOrEof;
                m3638g(c);
                return;
            }
        }
    }
}
