package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import okio.Buffer;

/* JADX INFO: loaded from: classes7.dex */
public class m0c extends AbstractC15409y3 {

    /* JADX INFO: renamed from: a */
    public final Buffer f59559a;

    public m0c(Buffer buffer) {
        this.f59559a = buffer;
    }

    private void fakeEofExceptionMethod() throws EOFException {
    }

    @Override // p000.AbstractC15409y3, p000.frd, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f59559a.clear();
    }

    @Override // p000.frd
    public void readBytes(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int i3 = this.f59559a.read(bArr, i, i2);
            if (i3 == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i2 + " bytes");
            }
            i2 -= i3;
            i += i3;
        }
    }

    @Override // p000.frd
    public int readUnsignedByte() {
        try {
            fakeEofExceptionMethod();
            return this.f59559a.readByte() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // p000.frd
    public int readableBytes() {
        return (int) this.f59559a.size();
    }

    @Override // p000.frd
    public void skipBytes(int i) {
        try {
            this.f59559a.skip(i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // p000.frd
    public void readBytes(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.frd
    public void readBytes(OutputStream outputStream, int i) throws IOException {
        this.f59559a.writeTo(outputStream, i);
    }

    @Override // p000.frd
    public frd readBytes(int i) {
        Buffer buffer = new Buffer();
        buffer.write(this.f59559a, i);
        return new m0c(buffer);
    }
}
