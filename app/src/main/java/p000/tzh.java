package p000;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes5.dex */
public class tzh extends ozh {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<C13300a> f86452b = ThreadLocal.withInitial(new Supplier() { // from class: qzh
        @Override // java.util.function.Supplier
        public final Object get() {
            return tzh.lambda$static$0();
        }
    });

    /* JADX INFO: renamed from: tzh$a */
    public static class C13300a {

        /* JADX INFO: renamed from: a */
        public final CharsetEncoder f86453a;

        /* JADX INFO: renamed from: b */
        public final CharsetDecoder f86454b;

        /* JADX INFO: renamed from: c */
        public CharSequence f86455c = null;

        /* JADX INFO: renamed from: d */
        public ByteBuffer f86456d = null;

        public C13300a() {
            Charset charset = StandardCharsets.UTF_8;
            this.f86453a = charset.newEncoder();
            this.f86454b = charset.newDecoder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C13300a lambda$static$0() {
        return new C13300a();
    }

    @Override // p000.ozh
    public String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) {
        CharsetDecoder charsetDecoder = f86452b.get().f86454b;
        charsetDecoder.reset();
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(i + i2);
        try {
            return charsetDecoder.decode(byteBufferDuplicate).toString();
        } catch (CharacterCodingException e) {
            throw new IllegalArgumentException("Bad encoding", e);
        }
    }

    @Override // p000.ozh
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        C13300a c13300a = f86452b.get();
        if (c13300a.f86455c != charSequence) {
            encodedLength(charSequence);
        }
        byteBuffer.put(c13300a.f86456d);
    }

    @Override // p000.ozh
    public int encodedLength(CharSequence charSequence) {
        C13300a c13300a = f86452b.get();
        int length = (int) (charSequence.length() * c13300a.f86453a.maxBytesPerChar());
        ByteBuffer byteBuffer = c13300a.f86456d;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            c13300a.f86456d = ByteBuffer.allocate(Math.max(128, length));
        }
        c13300a.f86456d.clear();
        c13300a.f86455c = charSequence;
        CoderResult coderResultEncode = c13300a.f86453a.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), c13300a.f86456d, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e) {
                throw new IllegalArgumentException("bad character encoding", e);
            }
        }
        c13300a.f86456d.flip();
        return c13300a.f86456d.remaining();
    }
}
