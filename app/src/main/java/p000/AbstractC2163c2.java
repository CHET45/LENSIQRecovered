package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: c2 */
/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nAbstractJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,747:1\n739#1,5:748\n1#2:753\n*S KotlinDebug\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n216#1:748,5\n*E\n"})
public abstract class AbstractC2163c2 {

    /* JADX INFO: renamed from: a */
    @un8
    public int f15565a;

    /* JADX INFO: renamed from: c */
    @gib
    public String f15567c;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public final em8 f15566b = new em8();

    /* JADX INFO: renamed from: d */
    @yfb
    public StringBuilder f15568d = new StringBuilder();

    private final int appendEsc(int i) {
        int iPrefetchOrEof = prefetchOrEof(i);
        if (iPrefetchOrEof == -1) {
            fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new us8();
        }
        int i2 = iPrefetchOrEof + 1;
        char cCharAt = getSource().charAt(iPrefetchOrEof);
        if (cCharAt == 'u') {
            return appendHex(getSource(), i2);
        }
        char cEscapeToChar = C4584d2.escapeToChar(cCharAt);
        if (cEscapeToChar != 0) {
            this.f15568d.append(cEscapeToChar);
            return i2;
        }
        fail$default(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new us8();
    }

    private final int appendEscape(int i, int i2) {
        mo3632a(i, i2);
        return appendEsc(i2 + 1);
    }

    private final int appendHex(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.f15568d.append((char) ((fromHexChar(charSequence, i) << 12) + (fromHexChar(charSequence, i + 1) << 8) + (fromHexChar(charSequence, i + 2) << 4) + fromHexChar(charSequence, i + 3)));
            return i2;
        }
        this.f15565a = i;
        ensureHaveChars();
        if (this.f15565a + 4 < charSequence.length()) {
            return appendHex(charSequence, this.f15565a);
        }
        fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new us8();
    }

    private final void consumeBooleanLiteral(String str, int i) {
        if (getSource().length() - i < str.length()) {
            fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new us8();
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (getSource().charAt(i + i2) | ' ')) {
                fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
                throw new us8();
            }
        }
        this.f15565a = i + str.length();
    }

    private static final double consumeNumericLiteral$calculateExponent(long j, boolean z) {
        if (!z) {
            return Math.pow(10.0d, -j);
        }
        if (z) {
            return Math.pow(10.0d, j);
        }
        throw new ceb();
    }

    private final String decodedString(int i, int i2) {
        mo3632a(i, i2);
        String string = this.f15568d.toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        this.f15568d.setLength(0);
        return string;
    }

    public static /* synthetic */ Void fail$default(AbstractC2163c2 abstractC2163c2, String str, int i, String str2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i2 & 2) != 0) {
            i = abstractC2163c2.f15565a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return abstractC2163c2.fail(str, i, str2);
    }

    public static /* synthetic */ Void fail$kotlinx_serialization_json$default(AbstractC2163c2 abstractC2163c2, byte b, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return abstractC2163c2.fail$kotlinx_serialization_json(b, z);
    }

    private final int fromHexChar(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        fail$default(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new us8();
    }

    private final boolean insideString(boolean z, char c) {
        if (z) {
            if (C4584d2.charToTokenClass(c) != 0) {
                return false;
            }
        } else if (c == '\"') {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void require$kotlinx_serialization_json$default(AbstractC2163c2 abstractC2163c2, boolean z, int i, ny6 ny6Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
        }
        if ((i2 & 2) != 0) {
            i = abstractC2163c2.f15565a;
        }
        int i3 = i;
        md8.checkNotNullParameter(ny6Var, g55.f38799h);
        if (z) {
            return;
        }
        fail$default(abstractC2163c2, (String) ny6Var.invoke(), i3, null, 4, null);
        throw new us8();
    }

    private final String takePeeked() {
        String str = this.f15567c;
        md8.checkNotNull(str);
        this.f15567c = null;
        return str;
    }

    public static /* synthetic */ boolean tryConsumeNull$default(AbstractC2163c2 abstractC2163c2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return abstractC2163c2.tryConsumeNull(z);
    }

    private final boolean wasUnquotedString() {
        return getSource().charAt(this.f15565a - 1) != '\"';
    }

    private final <T> T withPositionRollback(ny6<? extends T> ny6Var) {
        int i = this.f15565a;
        try {
            return ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            this.f15565a = i;
            o28.finallyEnd(1);
        }
    }

    private final void writeRange(int i, int i2, boolean z, qy6<? super String, bth> qy6Var) {
        if (z) {
            qy6Var.invoke(decodedString(i, i2));
        } else {
            qy6Var.invoke(substring(i, i2));
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo3632a(int i, int i2) {
        this.f15568d.append(getSource(), i, i2);
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public final String m3633b(@yfb CharSequence charSequence, int i, int i2) {
        int iPrefetchOrEof;
        md8.checkNotNullParameter(charSequence, "source");
        char cCharAt = charSequence.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                iPrefetchOrEof = prefetchOrEof(appendEscape(i, i2));
                if (iPrefetchOrEof == -1) {
                    fail$default(this, "Unexpected EOF", iPrefetchOrEof, null, 4, null);
                    throw new us8();
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    mo3632a(i, i2);
                    iPrefetchOrEof = prefetchOrEof(i2);
                    if (iPrefetchOrEof == -1) {
                        fail$default(this, "Unexpected EOF", iPrefetchOrEof, null, 4, null);
                        throw new us8();
                    }
                } else {
                    continue;
                    cCharAt = charSequence.charAt(i2);
                }
            }
            z = true;
            i = iPrefetchOrEof;
            i2 = i;
            cCharAt = charSequence.charAt(i2);
        }
        String strSubstring = !z ? substring(i, i2) : decodedString(i, i2);
        this.f15565a = i2 + 1;
        return strSubstring;
    }

    @yfb
    /* JADX INFO: renamed from: c */
    public final StringBuilder m3634c() {
        return this.f15568d;
    }

    public abstract boolean canConsumeValue();

    public final boolean consumeBoolean() {
        return consumeBoolean(skipWhitespaces());
    }

    public final boolean consumeBooleanLenient() {
        boolean z;
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new us8();
        }
        if (getSource().charAt(iSkipWhitespaces) == '\"') {
            iSkipWhitespaces++;
            z = true;
        } else {
            z = false;
        }
        boolean zConsumeBoolean = consumeBoolean(iSkipWhitespaces);
        if (z) {
            if (this.f15565a == getSource().length()) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new us8();
            }
            if (getSource().charAt(this.f15565a) != '\"') {
                fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new us8();
            }
            this.f15565a++;
        }
        return zConsumeBoolean;
    }

    @yfb
    public abstract String consumeKeyString();

    public abstract byte consumeNextToken();

    public final byte consumeNextToken(byte b) {
        byte bConsumeNextToken = consumeNextToken();
        if (bConsumeNextToken == b) {
            return bConsumeNextToken;
        }
        fail$kotlinx_serialization_json$default(this, b, false, 2, null);
        throw new us8();
    }

    public abstract void consumeNextToken(char c);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f6, code lost:
    
        fail$default(r17, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0206, code lost:
    
        throw new p000.us8();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011d, code lost:
    
        fail$default(r17, "Unexpected symbol '" + r3 + "' in numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0141, code lost:
    
        throw new p000.us8();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0142, code lost:
    
        if (r5 == r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0144, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0146, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
    
        if (r0 == r5) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0149, code lost:
    
        if (r10 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014d, code lost:
    
        if (r0 == (r5 - 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014f, code lost:
    
        if (r1 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0151, code lost:
    
        if (r3 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015d, code lost:
    
        if (getSource().charAt(r5) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015f, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0162, code lost:
    
        fail$default(r17, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0172, code lost:
    
        throw new p000.us8();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0173, code lost:
    
        fail$default(r17, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        throw new p000.us8();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0184, code lost:
    
        r17.f15565a = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0186, code lost:
    
        if (r9 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0188, code lost:
    
        r0 = r11 * consumeNumericLiteral$calculateExponent(r13, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0192, code lost:
    
        if (r0 > 9.223372036854776E18d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0198, code lost:
    
        if (r0 < (-9.223372036854776E18d)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a0, code lost:
    
        if (java.lang.Math.floor(r0) != r0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a2, code lost:
    
        r11 = (long) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a4, code lost:
    
        fail$default(r17, "Can't convert " + r0 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c8, code lost:
    
        throw new p000.us8();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c9, code lost:
    
        fail$default(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d9, code lost:
    
        throw new p000.us8();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r10 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e1, code lost:
    
        if (r11 == Long.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e4, code lost:
    
        return -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e5, code lost:
    
        fail$default(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f5, code lost:
    
        throw new p000.us8();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long consumeNumericLiteral() {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC2163c2.consumeNumericLiteral():long");
    }

    @yfb
    public final String consumeString() {
        return this.f15567c != null ? takePeeked() : consumeKeyString();
    }

    public void consumeStringChunked(boolean z, @yfb qy6<? super String, bth> qy6Var) {
        int i;
        int iPrefetchOrEof;
        md8.checkNotNullParameter(qy6Var, "consumeChunk");
        byte bPeekNextToken = peekNextToken();
        if (!z || bPeekNextToken == 0) {
            if (!z) {
                consumeNextToken('\"');
            }
            int i2 = this.f15565a;
            char cCharAt = getSource().charAt(i2);
            boolean z2 = false;
            int i3 = i2;
            while (insideString(z, cCharAt)) {
                if (z || cCharAt != '\\') {
                    int i4 = i3 + 1;
                    i = i2;
                    iPrefetchOrEof = i4;
                } else {
                    iPrefetchOrEof = prefetchOrEof(appendEscape(i2, i3));
                    z2 = true;
                    i = iPrefetchOrEof;
                }
                if (iPrefetchOrEof >= getSource().length()) {
                    writeRange(i, iPrefetchOrEof, z2, qy6Var);
                    int iPrefetchOrEof2 = prefetchOrEof(iPrefetchOrEof);
                    if (iPrefetchOrEof2 == -1) {
                        fail$default(this, "EOF", iPrefetchOrEof2, null, 4, null);
                        throw new us8();
                    }
                    z2 = false;
                    i2 = iPrefetchOrEof2;
                    i3 = i2;
                } else {
                    int i5 = i;
                    i3 = iPrefetchOrEof;
                    i2 = i5;
                }
                cCharAt = getSource().charAt(i3);
            }
            writeRange(i2, i3, z2, qy6Var);
            this.f15565a = i3;
            if (z) {
                return;
            }
            consumeNextToken('\"');
        }
    }

    @yfb
    public final String consumeStringLenient() {
        if (this.f15567c != null) {
            return takePeeked();
        }
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= getSource().length() || iSkipWhitespaces == -1) {
            fail$default(this, "EOF", iSkipWhitespaces, null, 4, null);
            throw new us8();
        }
        byte bCharToTokenClass = C4584d2.charToTokenClass(getSource().charAt(iSkipWhitespaces));
        if (bCharToTokenClass == 1) {
            return consumeString();
        }
        if (bCharToTokenClass != 0) {
            fail$default(this, "Expected beginning of the string, but got " + getSource().charAt(iSkipWhitespaces), 0, null, 6, null);
            throw new us8();
        }
        boolean z = false;
        while (C4584d2.charToTokenClass(getSource().charAt(iSkipWhitespaces)) == 0) {
            iSkipWhitespaces++;
            if (iSkipWhitespaces >= getSource().length()) {
                mo3632a(this.f15565a, iSkipWhitespaces);
                int iPrefetchOrEof = prefetchOrEof(iSkipWhitespaces);
                if (iPrefetchOrEof == -1) {
                    this.f15565a = iSkipWhitespaces;
                    return decodedString(0, 0);
                }
                iSkipWhitespaces = iPrefetchOrEof;
                z = true;
            }
        }
        String strSubstring = !z ? substring(this.f15565a, iSkipWhitespaces) : decodedString(this.f15565a, iSkipWhitespaces);
        this.f15565a = iSkipWhitespaces;
        return strSubstring;
    }

    @yfb
    public final String consumeStringLenientNotNull() {
        String strConsumeStringLenient = consumeStringLenient();
        if (!md8.areEqual(strConsumeStringLenient, "null") || !wasUnquotedString()) {
            return strConsumeStringLenient;
        }
        fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new us8();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3635d(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public final void discardPeeked() {
        this.f15567c = null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3636e(char c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t';
    }

    public void ensureHaveChars() {
    }

    public final void expectEof() {
        if (consumeNextToken() == 10) {
            return;
        }
        fail$default(this, "Expected EOF after parsing, but had " + getSource().charAt(this.f15565a - 1) + " instead", 0, null, 6, null);
        throw new us8();
    }

    /* JADX INFO: renamed from: f */
    public final void m3637f(@yfb StringBuilder sb) {
        md8.checkNotNullParameter(sb, "<set-?>");
        this.f15568d = sb;
    }

    @yfb
    public final Void fail(@yfb String str, int i, @yfb String str2) {
        String str3;
        md8.checkNotNullParameter(str, g55.f38799h);
        md8.checkNotNullParameter(str2, "hint");
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = '\n' + str2;
        }
        throw il8.JsonDecodingException(i, str + " at path: " + this.f15566b.getPath() + str3, getSource());
    }

    @yfb
    public final Void fail$kotlinx_serialization_json(byte b, boolean z) {
        String str = C4584d2.tokenDescription(b);
        int i = z ? this.f15565a - 1 : this.f15565a;
        fail$default(this, "Expected " + str + ", but had '" + ((this.f15565a == getSource().length() || i < 0) ? "EOF" : String.valueOf(getSource().charAt(i))) + "' instead", i, null, 4, null);
        throw new us8();
    }

    public final void failOnUnknownKey(@yfb String str) {
        md8.checkNotNullParameter(str, "key");
        fail("Encountered an unknown key '" + str + '\'', m9g.lastIndexOf$default((CharSequence) substring(0, this.f15565a), str, 0, false, 6, (Object) null), C4584d2.f28235d);
        throw new us8();
    }

    /* JADX INFO: renamed from: g */
    public final void m3638g(char c) {
        int i = this.f15565a;
        if (i > 0 && c == '\"') {
            try {
                this.f15565a = i - 1;
                String strConsumeStringLenient = consumeStringLenient();
                this.f15565a = i;
                if (md8.areEqual(strConsumeStringLenient, "null")) {
                    fail("Expected string literal but 'null' literal was found", this.f15565a - 1, C4584d2.f28233b);
                    throw new us8();
                }
            } catch (Throwable th) {
                this.f15565a = i;
                throw th;
            }
        }
        fail$kotlinx_serialization_json$default(this, C4584d2.charToTokenClass(c), false, 2, null);
        throw new us8();
    }

    @yfb
    public abstract CharSequence getSource();

    public int indexOf(char c, int i) {
        return m9g.indexOf$default(getSource(), c, i, false, 4, (Object) null);
    }

    public final boolean isNotEof() {
        return peekNextToken() != 10;
    }

    @gib
    public abstract String peekLeadingMatchingValue(@yfb String str, boolean z);

    public byte peekNextToken() {
        CharSequence source = getSource();
        int i = this.f15565a;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i);
            if (iPrefetchOrEof == -1) {
                this.f15565a = iPrefetchOrEof;
                return (byte) 10;
            }
            char cCharAt = source.charAt(iPrefetchOrEof);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f15565a = iPrefetchOrEof;
                return C4584d2.charToTokenClass(cCharAt);
            }
            i = iPrefetchOrEof + 1;
        }
    }

    @gib
    public final String peekString(boolean z) {
        String strConsumeString;
        byte bPeekNextToken = peekNextToken();
        if (z) {
            if (bPeekNextToken != 1 && bPeekNextToken != 0) {
                return null;
            }
            strConsumeString = consumeStringLenient();
        } else {
            if (bPeekNextToken != 1) {
                return null;
            }
            strConsumeString = consumeString();
        }
        this.f15567c = strConsumeString;
        return strConsumeString;
    }

    public abstract int prefetchOrEof(int i);

    public final void require$kotlinx_serialization_json(boolean z, int i, @yfb ny6<String> ny6Var) {
        md8.checkNotNullParameter(ny6Var, g55.f38799h);
        if (z) {
            return;
        }
        fail$default(this, ny6Var.invoke(), i, null, 4, null);
        throw new us8();
    }

    public final void skipElement(boolean z) {
        ArrayList arrayList = new ArrayList();
        byte bPeekNextToken = peekNextToken();
        if (bPeekNextToken != 8 && bPeekNextToken != 6) {
            consumeStringLenient();
            return;
        }
        while (true) {
            byte bPeekNextToken2 = peekNextToken();
            if (bPeekNextToken2 != 1) {
                if (bPeekNextToken2 == 8 || bPeekNextToken2 == 6) {
                    arrayList.add(Byte.valueOf(bPeekNextToken2));
                } else if (bPeekNextToken2 == 9) {
                    if (((Number) v82.last((List) arrayList)).byteValue() != 8) {
                        throw il8.JsonDecodingException(this.f15565a, "found ] instead of } at path: " + this.f15566b, getSource());
                    }
                    q82.removeLast(arrayList);
                } else if (bPeekNextToken2 == 7) {
                    if (((Number) v82.last((List) arrayList)).byteValue() != 6) {
                        throw il8.JsonDecodingException(this.f15565a, "found } instead of ] at path: " + this.f15566b, getSource());
                    }
                    q82.removeLast(arrayList);
                } else if (bPeekNextToken2 == 10) {
                    fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new us8();
                }
                consumeNextToken();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z) {
                consumeStringLenient();
            } else {
                consumeKeyString();
            }
        }
    }

    public abstract int skipWhitespaces();

    @yfb
    public String substring(int i, int i2) {
        return getSource().subSequence(i, i2).toString();
    }

    @yfb
    public String toString() {
        return "JsonReader(source='" + ((Object) getSource()) + "', currentPosition=" + this.f15565a + ')';
    }

    public final boolean tryConsumeComma() {
        int iSkipWhitespaces = skipWhitespaces();
        CharSequence source = getSource();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1 || source.charAt(iSkipWhitespaces) != ',') {
            return false;
        }
        this.f15565a++;
        return true;
    }

    public final boolean tryConsumeNull(boolean z) {
        int iPrefetchOrEof = prefetchOrEof(skipWhitespaces());
        int length = getSource().length() - iPrefetchOrEof;
        if (length < 4 || iPrefetchOrEof == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != getSource().charAt(iPrefetchOrEof + i)) {
                return false;
            }
        }
        if (length > 4 && C4584d2.charToTokenClass(getSource().charAt(iPrefetchOrEof + 4)) == 0) {
            return false;
        }
        if (!z) {
            return true;
        }
        this.f15565a = iPrefetchOrEof + 4;
        return true;
    }

    private final boolean consumeBoolean(int i) {
        int iPrefetchOrEof = prefetchOrEof(i);
        if (iPrefetchOrEof >= getSource().length() || iPrefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new us8();
        }
        int i2 = iPrefetchOrEof + 1;
        int iCharAt = getSource().charAt(iPrefetchOrEof) | ' ';
        if (iCharAt == 102) {
            consumeBooleanLiteral("alse", i2);
            return false;
        }
        if (iCharAt == 116) {
            consumeBooleanLiteral("rue", i2);
            return true;
        }
        fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
        throw new us8();
    }
}
