package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class jrd extends InputStream {

    /* JADX INFO: renamed from: C */
    public boolean f51617C;

    /* JADX INFO: renamed from: a */
    public final Reader f51618a;

    /* JADX INFO: renamed from: b */
    public final CharsetEncoder f51619b;

    /* JADX INFO: renamed from: c */
    public final byte[] f51620c;

    /* JADX INFO: renamed from: d */
    public CharBuffer f51621d;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f51622e;

    /* JADX INFO: renamed from: f */
    public boolean f51623f;

    /* JADX INFO: renamed from: m */
    public boolean f51624m;

    /* JADX WARN: Illegal instructions before constructor call */
    public jrd(Reader reader, Charset charset, int bufferSize) {
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this(reader, charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction), bufferSize);
    }

    private static int availableCapacity(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    private int drain(byte[] b, int off, int len) {
        int iMin = Math.min(len, this.f51622e.remaining());
        this.f51622e.get(b, off, iMin);
        return iMin;
    }

    private static CharBuffer grow(CharBuffer buf) {
        CharBuffer charBufferWrap = CharBuffer.wrap(Arrays.copyOf(buf.array(), buf.capacity() * 2));
        ki8.m14761e(charBufferWrap, buf.position());
        ki8.m14759c(charBufferWrap, buf.limit());
        return charBufferWrap;
    }

    private void readMoreChars() throws IOException {
        if (availableCapacity(this.f51621d) == 0) {
            if (this.f51621d.position() > 0) {
                ki8.m14758b(this.f51621d.compact());
            } else {
                this.f51621d = grow(this.f51621d);
            }
        }
        int iLimit = this.f51621d.limit();
        int i = this.f51618a.read(this.f51621d.array(), iLimit, availableCapacity(this.f51621d));
        if (i == -1) {
            this.f51623f = true;
        } else {
            ki8.m14759c(this.f51621d, iLimit + i);
        }
    }

    private void startDraining(boolean overflow) {
        ki8.m14758b(this.f51622e);
        if (overflow && this.f51622e.remaining() == 0) {
            this.f51622e = ByteBuffer.allocate(this.f51622e.capacity() * 2);
        } else {
            this.f51624m = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f51618a.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f51620c) == 1) {
            return hvh.toInt(this.f51620c[0]);
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r2 <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return r2;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r9 + r10
            int r1 = r8.length
            p000.v7d.checkPositionIndexes(r9, r0, r1)
            r0 = 0
            if (r10 != 0) goto La
            return r0
        La:
            boolean r1 = r7.f51623f
            r2 = r0
        Ld:
            boolean r3 = r7.f51624m
            if (r3 == 0) goto L2e
            int r3 = r9 + r2
            int r4 = r10 - r2
            int r3 = r7.drain(r8, r3, r4)
            int r2 = r2 + r3
            if (r2 == r10) goto L29
            boolean r3 = r7.f51617C
            if (r3 == 0) goto L21
            goto L29
        L21:
            r7.f51624m = r0
            java.nio.ByteBuffer r3 = r7.f51622e
            p000.ki8.m14757a(r3)
            goto L2e
        L29:
            if (r2 <= 0) goto L2c
            goto L2d
        L2c:
            r2 = -1
        L2d:
            return r2
        L2e:
            boolean r3 = r7.f51617C
            if (r3 == 0) goto L35
            java.nio.charset.CoderResult r3 = java.nio.charset.CoderResult.UNDERFLOW
            goto L4c
        L35:
            if (r1 == 0) goto L40
            java.nio.charset.CharsetEncoder r3 = r7.f51619b
            java.nio.ByteBuffer r4 = r7.f51622e
            java.nio.charset.CoderResult r3 = r3.flush(r4)
            goto L4c
        L40:
            java.nio.charset.CharsetEncoder r3 = r7.f51619b
            java.nio.CharBuffer r4 = r7.f51621d
            java.nio.ByteBuffer r5 = r7.f51622e
            boolean r6 = r7.f51623f
            java.nio.charset.CoderResult r3 = r3.encode(r4, r5, r6)
        L4c:
            boolean r4 = r3.isOverflow()
            r5 = 1
            if (r4 == 0) goto L57
            r7.startDraining(r5)
            goto Ld
        L57:
            boolean r4 = r3.isUnderflow()
            if (r4 == 0) goto L6f
            if (r1 == 0) goto L65
            r7.f51617C = r5
            r7.startDraining(r0)
            goto Ld
        L65:
            boolean r3 = r7.f51623f
            if (r3 == 0) goto L6b
            r1 = r5
            goto L2e
        L6b:
            r7.readMoreChars()
            goto L2e
        L6f:
            boolean r4 = r3.isError()
            if (r4 == 0) goto L2e
            r3.throwException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.jrd.read(byte[], int, int):int");
    }

    public jrd(Reader reader, CharsetEncoder encoder, int bufferSize) {
        this.f51620c = new byte[1];
        this.f51618a = (Reader) v7d.checkNotNull(reader);
        this.f51619b = (CharsetEncoder) v7d.checkNotNull(encoder);
        v7d.checkArgument(bufferSize > 0, "bufferSize must be positive: %s", bufferSize);
        encoder.reset();
        CharBuffer charBufferAllocate = CharBuffer.allocate(bufferSize);
        this.f51621d = charBufferAllocate;
        ki8.m14758b(charBufferAllocate);
        this.f51622e = ByteBuffer.allocate(bufferSize);
    }
}
