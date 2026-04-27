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

/* JADX INFO: loaded from: classes3.dex */
public class szh extends mzh {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<C12831a> f83286b = ThreadLocal.withInitial(new Supplier() { // from class: rzh
        @Override // java.util.function.Supplier
        public final Object get() {
            return szh.lambda$static$0();
        }
    });

    /* JADX INFO: renamed from: szh$a */
    public static class C12831a {

        /* JADX INFO: renamed from: a */
        public final CharsetEncoder f83287a;

        /* JADX INFO: renamed from: b */
        public final CharsetDecoder f83288b;

        /* JADX INFO: renamed from: c */
        public CharSequence f83289c = null;

        /* JADX INFO: renamed from: d */
        public ByteBuffer f83290d = null;

        public C12831a() {
            Charset charset = StandardCharsets.UTF_8;
            this.f83287a = charset.newEncoder();
            this.f83288b = charset.newDecoder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C12831a lambda$static$0() {
        return new C12831a();
    }

    @Override // p000.mzh
    public String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) {
        CharsetDecoder charsetDecoder = f83286b.get().f83288b;
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

    @Override // p000.mzh
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        C12831a c12831a = f83286b.get();
        if (c12831a.f83289c != charSequence) {
            encodedLength(charSequence);
        }
        byteBuffer.put(c12831a.f83290d);
    }

    @Override // p000.mzh
    public int encodedLength(CharSequence charSequence) {
        C12831a c12831a = f83286b.get();
        int length = (int) (charSequence.length() * c12831a.f83287a.maxBytesPerChar());
        ByteBuffer byteBuffer = c12831a.f83290d;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            c12831a.f83290d = ByteBuffer.allocate(Math.max(128, length));
        }
        c12831a.f83290d.clear();
        c12831a.f83289c = charSequence;
        CoderResult coderResultEncode = c12831a.f83287a.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), c12831a.f83290d, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e) {
                throw new IllegalArgumentException("bad character encoding", e);
            }
        }
        c12831a.f83290d.flip();
        return c12831a.f83290d.remaining();
    }
}
