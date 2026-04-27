package p000;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
public final class m69 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final m69 f60010a = new m69();

    /* JADX INFO: renamed from: b */
    public static final int f60011b = 32;

    /* JADX INFO: renamed from: c */
    public static CharsetDecoder f60012c;

    /* JADX INFO: renamed from: d */
    public static boolean f60013d;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final byte[] f60014e;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final char[] f60015f;

    /* JADX INFO: renamed from: g */
    @yfb
    public static final ByteBuffer f60016g;

    /* JADX INFO: renamed from: h */
    @yfb
    public static final CharBuffer f60017h;

    /* JADX INFO: renamed from: i */
    @yfb
    public static final StringBuilder f60018i;

    static {
        byte[] bArr = new byte[32];
        f60014e = bArr;
        char[] cArr = new char[32];
        f60015f = cArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        md8.checkNotNullExpressionValue(byteBufferWrap, "wrap(...)");
        f60016g = byteBufferWrap;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        md8.checkNotNullExpressionValue(charBufferWrap, "wrap(...)");
        f60017h = charBufferWrap;
        f60018i = new StringBuilder();
    }

    private m69() {
    }

    private final int compactBytes() {
        ByteBuffer byteBuffer = f60016g;
        byteBuffer.compact();
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    private final int decode(boolean z) throws CharacterCodingException {
        while (true) {
            CharsetDecoder charsetDecoder = f60012c;
            if (charsetDecoder == null) {
                md8.throwUninitializedPropertyAccessException("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f60016g;
            CharBuffer charBuffer = f60017h;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z);
            md8.checkNotNullExpressionValue(coderResultDecode, "decode(...)");
            if (coderResultDecode.isError()) {
                resetAll();
                coderResultDecode.throwException();
            }
            int iPosition = charBuffer.position();
            if (!coderResultDecode.isOverflow()) {
                return iPosition;
            }
            StringBuilder sb = f60018i;
            char[] cArr = f60015f;
            int i = iPosition - 1;
            sb.append(cArr, 0, i);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i]);
        }
    }

    private final int decodeEndOfInput(int i, int i2) throws CharacterCodingException {
        ByteBuffer byteBuffer = f60016g;
        byteBuffer.limit(i);
        f60017h.position(i2);
        int iDecode = decode(true);
        CharsetDecoder charsetDecoder = f60012c;
        if (charsetDecoder == null) {
            md8.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return iDecode;
    }

    private final void resetAll() {
        CharsetDecoder charsetDecoder = f60012c;
        if (charsetDecoder == null) {
            md8.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        f60016g.position(0);
        f60018i.setLength(0);
    }

    private final void trimStringBuilder() {
        StringBuilder sb = f60018i;
        sb.setLength(32);
        sb.trimToSize();
    }

    private final void updateCharset(Charset charset) {
        f60012c = charset.newDecoder();
        ByteBuffer byteBuffer = f60016g;
        byteBuffer.clear();
        CharBuffer charBuffer = f60017h;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f60012c;
        if (charsetDecoder == null) {
            md8.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        boolean z = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z = true;
        }
        f60013d = z;
        resetAll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r10 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r0 = p000.m69.f60015f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (r0[r10 - 1] != '\n') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        r1 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        if (r1 <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (r0[r10 - 2] != '\r') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        r10 = r10 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        r0 = p000.m69.f60018i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r0.length() != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
    
        return new java.lang.String(p000.m69.f60015f, 0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        r0.append(p000.m69.f60015f, 0, r10);
        r10 = r0.toString();
        p000.md8.checkNotNullExpressionValue(r10, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r0.length() <= 32) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b7, code lost:
    
        trimStringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
    
        r0.setLength(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00be, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0001, B:6:0x0012, B:9:0x001c, B:13:0x002c, B:15:0x0037, B:21:0x0045, B:35:0x007a, B:37:0x0082, B:39:0x0086, B:41:0x008e, B:43:0x0092, B:45:0x009a, B:48:0x00a3, B:50:0x00b7, B:51:0x00ba, B:22:0x004a, B:25:0x0055, B:29:0x005c, B:31:0x006c, B:33:0x0074, B:54:0x00bf, B:11:0x0026), top: B:57:0x0001 }] */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.lang.String readLine(@p000.yfb java.io.InputStream r10, @p000.yfb java.nio.charset.Charset r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "inputStream"
            p000.md8.checkNotNullParameter(r10, r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "charset"
            p000.md8.checkNotNullParameter(r11, r0)     // Catch: java.lang.Throwable -> L19
            java.nio.charset.CharsetDecoder r0 = p000.m69.f60012c     // Catch: java.lang.Throwable -> L19
            r1 = 0
            if (r0 == 0) goto L26
            if (r0 != 0) goto L1c
            java.lang.String r0 = "decoder"
            p000.md8.throwUninitializedPropertyAccessException(r0)     // Catch: java.lang.Throwable -> L19
            r0 = r1
            goto L1c
        L19:
            r10 = move-exception
            goto Lc5
        L1c:
            java.nio.charset.Charset r0 = r0.charset()     // Catch: java.lang.Throwable -> L19
            boolean r0 = p000.md8.areEqual(r0, r11)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L29
        L26:
            r9.updateCharset(r11)     // Catch: java.lang.Throwable -> L19
        L29:
            r11 = 0
            r0 = r11
            r2 = r0
        L2c:
            int r3 = r10.read()     // Catch: java.lang.Throwable -> L19
            r4 = 32
            r5 = -1
            r6 = 10
            if (r3 != r5) goto L4a
            java.lang.StringBuilder r10 = p000.m69.f60018i     // Catch: java.lang.Throwable -> L19
            int r10 = r10.length()     // Catch: java.lang.Throwable -> L19
            if (r10 != 0) goto L45
            if (r0 != 0) goto L45
            if (r2 != 0) goto L45
            monitor-exit(r9)
            return r1
        L45:
            int r10 = r9.decodeEndOfInput(r0, r2)     // Catch: java.lang.Throwable -> L19
            goto L78
        L4a:
            byte[] r5 = p000.m69.f60014e     // Catch: java.lang.Throwable -> L19
            int r7 = r0 + 1
            byte r8 = (byte) r3     // Catch: java.lang.Throwable -> L19
            r5[r0] = r8     // Catch: java.lang.Throwable -> L19
            if (r3 == r6) goto L5c
            if (r7 == r4) goto L5c
            boolean r0 = p000.m69.f60013d     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L5a
            goto L5c
        L5a:
            r0 = r7
            goto L2c
        L5c:
            java.nio.ByteBuffer r0 = p000.m69.f60016g     // Catch: java.lang.Throwable -> L19
            r0.limit(r7)     // Catch: java.lang.Throwable -> L19
            java.nio.CharBuffer r3 = p000.m69.f60017h     // Catch: java.lang.Throwable -> L19
            r3.position(r2)     // Catch: java.lang.Throwable -> L19
            int r2 = r9.decode(r11)     // Catch: java.lang.Throwable -> L19
            if (r2 <= 0) goto Lbf
            char[] r3 = p000.m69.f60015f     // Catch: java.lang.Throwable -> L19
            int r5 = r2 + (-1)
            char r3 = r3[r5]     // Catch: java.lang.Throwable -> L19
            if (r3 != r6) goto Lbf
            r0.position(r11)     // Catch: java.lang.Throwable -> L19
            r10 = r2
        L78:
            if (r10 <= 0) goto L92
            char[] r0 = p000.m69.f60015f     // Catch: java.lang.Throwable -> L19
            int r1 = r10 + (-1)
            char r1 = r0[r1]     // Catch: java.lang.Throwable -> L19
            if (r1 != r6) goto L92
            int r1 = r10 + (-1)
            if (r1 <= 0) goto L91
            int r2 = r10 + (-2)
            char r0 = r0[r2]     // Catch: java.lang.Throwable -> L19
            r2 = 13
            if (r0 != r2) goto L91
            int r10 = r10 + (-2)
            goto L92
        L91:
            r10 = r1
        L92:
            java.lang.StringBuilder r0 = p000.m69.f60018i     // Catch: java.lang.Throwable -> L19
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto La3
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L19
            char[] r1 = p000.m69.f60015f     // Catch: java.lang.Throwable -> L19
            r0.<init>(r1, r11, r10)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r9)
            return r0
        La3:
            char[] r1 = p000.m69.f60015f     // Catch: java.lang.Throwable -> L19
            r0.append(r1, r11, r10)     // Catch: java.lang.Throwable -> L19
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "toString(...)"
            p000.md8.checkNotNullExpressionValue(r10, r1)     // Catch: java.lang.Throwable -> L19
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L19
            if (r1 <= r4) goto Lba
            r9.trimStringBuilder()     // Catch: java.lang.Throwable -> L19
        Lba:
            r0.setLength(r11)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r9)
            return r10
        Lbf:
            int r0 = r9.compactBytes()     // Catch: java.lang.Throwable -> L19
            goto L2c
        Lc5:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L19
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m69.readLine(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }
}
