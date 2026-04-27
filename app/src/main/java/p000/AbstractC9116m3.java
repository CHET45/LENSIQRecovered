package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: m3 */
/* JADX INFO: loaded from: classes5.dex */
@xx4
@tw7
public abstract class AbstractC9116m3 extends AbstractC11839r1 {

    /* JADX INFO: renamed from: m3$a */
    public final class a extends AbstractC12390s1 {

        /* JADX INFO: renamed from: a */
        public final b f59793a;

        public a(int expectedInputSize) {
            this.f59793a = new b(expectedInputSize);
        }

        @Override // p000.wh7
        public jh7 hash() {
            return AbstractC9116m3.this.hashBytes(this.f59793a.m16598a(), 0, this.f59793a.m16599b());
        }

        @Override // p000.wh7, p000.obd
        public wh7 putByte(byte b) throws IOException {
            this.f59793a.write(b);
            return this;
        }

        @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
        public wh7 putBytes(byte[] bytes, int off, int len) throws IOException {
            this.f59793a.write(bytes, off, len);
            return this;
        }

        @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
        public wh7 putBytes(ByteBuffer bytes) {
            this.f59793a.m16600c(bytes);
            return this;
        }
    }

    /* JADX INFO: renamed from: m3$b */
    public static final class b extends ByteArrayOutputStream {
        public b(int expectedInputSize) {
            super(expectedInputSize);
        }

        /* JADX INFO: renamed from: a */
        public byte[] m16598a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        /* JADX INFO: renamed from: b */
        public int m16599b() {
            return ((ByteArrayOutputStream) this).count;
        }

        /* JADX INFO: renamed from: c */
        public void m16600c(ByteBuffer input) {
            int iRemaining = input.remaining();
            int i = ((ByteArrayOutputStream) this).count;
            int i2 = i + iRemaining;
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            if (i2 > bArr.length) {
                ((ByteArrayOutputStream) this).buf = Arrays.copyOf(bArr, i + iRemaining);
            }
            input.get(((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count, iRemaining);
            ((ByteArrayOutputStream) this).count += iRemaining;
        }
    }

    @Override // p000.AbstractC11839r1, p000.lh7
    public jh7 hashBytes(ByteBuffer input) {
        return newHasher(input.remaining()).putBytes(input).hash();
    }

    @Override // p000.AbstractC11839r1, p000.lh7
    public abstract jh7 hashBytes(byte[] input, int off, int len);

    @Override // p000.AbstractC11839r1, p000.lh7
    public jh7 hashInt(int input) {
        return hashBytes(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(input).array());
    }

    @Override // p000.AbstractC11839r1, p000.lh7
    public jh7 hashLong(long input) {
        return hashBytes(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(input).array());
    }

    @Override // p000.AbstractC11839r1, p000.lh7
    public jh7 hashString(CharSequence input, Charset charset) {
        return hashBytes(input.toString().getBytes(charset));
    }

    @Override // p000.AbstractC11839r1, p000.lh7
    public jh7 hashUnencodedChars(CharSequence input) {
        int length = input.length();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length * 2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < length; i++) {
            byteBufferOrder.putChar(input.charAt(i));
        }
        return hashBytes(byteBufferOrder.array());
    }

    @Override // p000.lh7
    public wh7 newHasher() {
        return newHasher(32);
    }

    @Override // p000.AbstractC11839r1, p000.lh7
    public wh7 newHasher(int expectedInputSize) {
        v7d.checkArgument(expectedInputSize >= 0);
        return new a(expectedInputSize);
    }
}
