package p000;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes7.dex */
public final class vw1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final InputStream f92406a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Charset f92407b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final CharsetDecoder f92408c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final ByteBuffer f92409d;

    /* JADX INFO: renamed from: e */
    public boolean f92410e;

    /* JADX INFO: renamed from: f */
    public char f92411f;

    public vw1(@yfb InputStream inputStream, @yfb Charset charset) {
        md8.checkNotNullParameter(inputStream, "inputStream");
        md8.checkNotNullParameter(charset, ypa.f102547g);
        this.f92406a = inputStream;
        this.f92407b = charset;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.f92408c = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(ji1.f50629c.take());
        this.f92409d = byteBufferWrap;
        byteBufferWrap.flip();
    }

    private final int doRead(char[] cArr, int i, int i2) throws CharacterCodingException {
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i, i2);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z = false;
        while (true) {
            CoderResult coderResultDecode = this.f92408c.decode(this.f92409d, charBufferWrap, z);
            if (coderResultDecode.isUnderflow()) {
                if (!z && charBufferWrap.hasRemaining()) {
                    if (fillByteBuffer() < 0) {
                        if (charBufferWrap.position() == 0 && !this.f92409d.hasRemaining()) {
                            z = true;
                            break;
                        }
                        this.f92408c.reset();
                        z = true;
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBufferWrap.position();
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z) {
            this.f92408c.reset();
        }
        if (charBufferWrap.position() == 0) {
            return -1;
        }
        return charBufferWrap.position();
    }

    private final int fillByteBuffer() {
        this.f92409d.compact();
        try {
            int iLimit = this.f92409d.limit();
            int iPosition = this.f92409d.position();
            int i = this.f92406a.read(this.f92409d.array(), this.f92409d.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
            if (i < 0) {
                return i;
            }
            ByteBuffer byteBuffer = this.f92409d;
            md8.checkNotNull(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(iPosition + i);
            this.f92409d.flip();
            return this.f92409d.remaining();
        } finally {
            this.f92409d.flip();
        }
    }

    private final int oneShotReadSlowPath() {
        if (this.f92410e) {
            this.f92410e = false;
            return this.f92411f;
        }
        char[] cArr = new char[2];
        int i = read(cArr, 0, 2);
        if (i == -1) {
            return -1;
        }
        if (i == 1) {
            return cArr[0];
        }
        if (i == 2) {
            this.f92411f = cArr[1];
            this.f92410e = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + i).toString());
    }

    public final int read(@yfb char[] cArr, int i, int i2) {
        md8.checkNotNullParameter(cArr, "array");
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0 || i >= cArr.length || i2 < 0 || i + i2 > cArr.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i + ", " + i2 + ", " + cArr.length).toString());
        }
        if (this.f92410e) {
            cArr[i] = this.f92411f;
            i++;
            i2--;
            this.f92410e = false;
            if (i2 == 0) {
                return 1;
            }
            i3 = 1;
        }
        if (i2 != 1) {
            return doRead(cArr, i, i2) + i3;
        }
        int iOneShotReadSlowPath = oneShotReadSlowPath();
        if (iOneShotReadSlowPath != -1) {
            cArr[i] = (char) iOneShotReadSlowPath;
            return i3 + 1;
        }
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }

    public final void release() {
        ji1 ji1Var = ji1.f50629c;
        byte[] bArrArray = this.f92409d.array();
        md8.checkNotNullExpressionValue(bArrArray, "array(...)");
        ji1Var.release(bArrArray);
    }
}
