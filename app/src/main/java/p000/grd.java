package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
public final class grd {

    /* JADX INFO: renamed from: a */
    public static final frd f40840a = new C6476c(new byte[0]);

    /* JADX INFO: renamed from: grd$a */
    public class C6474a extends dt6 {
        public C6474a(frd frdVar) {
            super(frdVar);
        }

        @Override // p000.dt6, p000.frd, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* JADX INFO: renamed from: grd$c */
    public static class C6476c extends AbstractC15409y3 {

        /* JADX INFO: renamed from: a */
        public int f40842a;

        /* JADX INFO: renamed from: b */
        public final int f40843b;

        /* JADX INFO: renamed from: c */
        public final byte[] f40844c;

        /* JADX INFO: renamed from: d */
        public int f40845d;

        public C6476c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // p000.AbstractC15409y3, p000.frd
        public byte[] array() {
            return this.f40844c;
        }

        @Override // p000.AbstractC15409y3, p000.frd
        public int arrayOffset() {
            return this.f40842a;
        }

        @Override // p000.AbstractC15409y3, p000.frd
        public boolean hasArray() {
            return true;
        }

        @Override // p000.AbstractC15409y3, p000.frd
        public void mark() {
            this.f40845d = this.f40842a;
        }

        @Override // p000.AbstractC15409y3, p000.frd
        public boolean markSupported() {
            return true;
        }

        @Override // p000.frd
        public int readUnsignedByte() {
            m25634a(1);
            byte[] bArr = this.f40844c;
            int i = this.f40842a;
            this.f40842a = i + 1;
            return bArr[i] & 255;
        }

        @Override // p000.frd
        public int readableBytes() {
            return this.f40843b - this.f40842a;
        }

        @Override // p000.AbstractC15409y3, p000.frd
        public void reset() {
            int i = this.f40845d;
            if (i == -1) {
                throw new InvalidMarkException();
            }
            this.f40842a = i;
        }

        @Override // p000.frd
        public void skipBytes(int i) {
            m25634a(i);
            this.f40842a += i;
        }

        public C6476c(byte[] bArr, int i, int i2) {
            this.f40845d = -1;
            v7d.checkArgument(i >= 0, "offset must be >= 0");
            v7d.checkArgument(i2 >= 0, "length must be >= 0");
            int i3 = i2 + i;
            v7d.checkArgument(i3 <= bArr.length, "offset + length exceeds array boundary");
            this.f40844c = (byte[]) v7d.checkNotNull(bArr, "bytes");
            this.f40842a = i;
            this.f40843b = i3;
        }

        @Override // p000.frd
        public void readBytes(byte[] bArr, int i, int i2) {
            System.arraycopy(this.f40844c, this.f40842a, bArr, i, i2);
            this.f40842a += i2;
        }

        @Override // p000.frd
        public void readBytes(ByteBuffer byteBuffer) {
            v7d.checkNotNull(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            m25634a(iRemaining);
            byteBuffer.put(this.f40844c, this.f40842a, iRemaining);
            this.f40842a += iRemaining;
        }

        @Override // p000.frd
        public void readBytes(OutputStream outputStream, int i) throws IOException {
            m25634a(i);
            outputStream.write(this.f40844c, this.f40842a, i);
            this.f40842a += i;
        }

        @Override // p000.frd
        public C6476c readBytes(int i) {
            m25634a(i);
            int i2 = this.f40842a;
            this.f40842a = i2 + i;
            return new C6476c(this.f40844c, i2, i);
        }
    }

    /* JADX INFO: renamed from: grd$d */
    public static class C6477d extends AbstractC15409y3 {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f40846a;

        public C6477d(ByteBuffer byteBuffer) {
            this.f40846a = (ByteBuffer) v7d.checkNotNull(byteBuffer, "bytes");
        }

        @Override // p000.AbstractC15409y3, p000.frd
        public byte[] array() {
            return this.f40846a.array();
        }

        @Override // p000.AbstractC15409y3, p000.frd
        public int arrayOffset() {
            return this.f40846a.arrayOffset() + this.f40846a.position();
        }

        @Override // p000.AbstractC15409y3, p000.frd
        public boolean byteBufferSupported() {
            return true;
        }

        @Override // p000.AbstractC15409y3, p000.frd
        public ByteBuffer getByteBuffer() {
            return this.f40846a.slice();
        }

        @Override // p000.AbstractC15409y3, p000.frd
        public boolean hasArray() {
            return this.f40846a.hasArray();
        }

        @Override // p000.AbstractC15409y3, p000.frd
        public void mark() {
            this.f40846a.mark();
        }

        @Override // p000.AbstractC15409y3, p000.frd
        public boolean markSupported() {
            return true;
        }

        @Override // p000.frd
        public int readUnsignedByte() {
            m25634a(1);
            return this.f40846a.get() & 255;
        }

        @Override // p000.frd
        public int readableBytes() {
            return this.f40846a.remaining();
        }

        @Override // p000.AbstractC15409y3, p000.frd
        public void reset() {
            this.f40846a.reset();
        }

        @Override // p000.frd
        public void skipBytes(int i) {
            m25634a(i);
            ByteBuffer byteBuffer = this.f40846a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // p000.frd
        public void readBytes(byte[] bArr, int i, int i2) {
            m25634a(i2);
            this.f40846a.get(bArr, i, i2);
        }

        @Override // p000.frd
        public void readBytes(ByteBuffer byteBuffer) {
            v7d.checkNotNull(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            m25634a(iRemaining);
            int iLimit = this.f40846a.limit();
            ByteBuffer byteBuffer2 = this.f40846a;
            byteBuffer2.limit(byteBuffer2.position() + iRemaining);
            byteBuffer.put(this.f40846a);
            this.f40846a.limit(iLimit);
        }

        @Override // p000.frd
        public void readBytes(OutputStream outputStream, int i) throws IOException {
            m25634a(i);
            if (hasArray()) {
                outputStream.write(array(), arrayOffset(), i);
                ByteBuffer byteBuffer = this.f40846a;
                byteBuffer.position(byteBuffer.position() + i);
            } else {
                byte[] bArr = new byte[i];
                this.f40846a.get(bArr);
                outputStream.write(bArr);
            }
        }

        @Override // p000.frd
        public C6477d readBytes(int i) {
            m25634a(i);
            ByteBuffer byteBufferDuplicate = this.f40846a.duplicate();
            byteBufferDuplicate.limit(this.f40846a.position() + i);
            ByteBuffer byteBuffer = this.f40846a;
            byteBuffer.position(byteBuffer.position() + i);
            return new C6477d(byteBufferDuplicate);
        }
    }

    private grd() {
    }

    public static frd empty() {
        return f40840a;
    }

    public static frd ignoreClose(frd frdVar) {
        return new C6474a(frdVar);
    }

    public static InputStream openStream(frd frdVar, boolean z) {
        if (!z) {
            frdVar = ignoreClose(frdVar);
        }
        return new C6475b(frdVar);
    }

    public static byte[] readArray(frd frdVar) {
        v7d.checkNotNull(frdVar, "buffer");
        int i = frdVar.readableBytes();
        byte[] bArr = new byte[i];
        frdVar.readBytes(bArr, 0, i);
        return bArr;
    }

    public static String readAsString(frd frdVar, Charset charset) {
        v7d.checkNotNull(charset, ypa.f102547g);
        return new String(readArray(frdVar), charset);
    }

    public static String readAsStringUtf8(frd frdVar) {
        return readAsString(frdVar, yw1.f103176c);
    }

    public static frd wrap(byte[] bArr) {
        return new C6476c(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: grd$b */
    public static final class C6475b extends InputStream implements ss8, tg7, x74 {

        /* JADX INFO: renamed from: a */
        public frd f40841a;

        public C6475b(frd frdVar) {
            this.f40841a = (frd) v7d.checkNotNull(frdVar, "buffer");
        }

        @Override // java.io.InputStream, p000.ss8
        public int available() throws IOException {
            return this.f40841a.readableBytes();
        }

        @Override // p000.tg7
        public boolean byteBufferSupported() {
            return this.f40841a.byteBufferSupported();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f40841a.close();
        }

        @Override // p000.x74
        public InputStream detach() {
            frd frdVar = this.f40841a;
            this.f40841a = frdVar.readBytes(0);
            return new C6475b(frdVar);
        }

        @Override // p000.tg7
        @eib
        public ByteBuffer getByteBuffer() {
            return this.f40841a.getByteBuffer();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f40841a.mark();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f40841a.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f40841a.readableBytes() == 0) {
                return -1;
            }
            return this.f40841a.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            this.f40841a.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            int iMin = (int) Math.min(this.f40841a.readableBytes(), j);
            this.f40841a.skipBytes(iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.f40841a.readableBytes() == 0) {
                return -1;
            }
            int iMin = Math.min(this.f40841a.readableBytes(), i2);
            this.f40841a.readBytes(bArr, i, iMin);
            return iMin;
        }
    }

    public static frd wrap(byte[] bArr, int i, int i2) {
        return new C6476c(bArr, i, i2);
    }

    public static frd wrap(ByteBuffer byteBuffer) {
        return new C6477d(byteBuffer);
    }
}
