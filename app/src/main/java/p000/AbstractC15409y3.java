package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: y3 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC15409y3 implements frd {
    /* JADX INFO: renamed from: a */
    public final void m25634a(int i) {
        if (readableBytes() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // p000.frd
    public byte[] array() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.frd
    public int arrayOffset() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.frd
    public boolean byteBufferSupported() {
        return false;
    }

    @Override // p000.frd, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p000.frd
    public ByteBuffer getByteBuffer() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.frd
    public boolean hasArray() {
        return false;
    }

    @Override // p000.frd
    public void mark() {
    }

    @Override // p000.frd
    public boolean markSupported() {
        return false;
    }

    @Override // p000.frd
    public final int readInt() {
        m25634a(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    @Override // p000.frd
    public void reset() {
        throw new UnsupportedOperationException();
    }
}
