package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class dt6 implements frd {

    /* JADX INFO: renamed from: a */
    public final frd f30839a;

    public dt6(frd frdVar) {
        this.f30839a = (frd) v7d.checkNotNull(frdVar, "buf");
    }

    @Override // p000.frd
    public byte[] array() {
        return this.f30839a.array();
    }

    @Override // p000.frd
    public int arrayOffset() {
        return this.f30839a.arrayOffset();
    }

    @Override // p000.frd
    public boolean byteBufferSupported() {
        return this.f30839a.byteBufferSupported();
    }

    @Override // p000.frd, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30839a.close();
    }

    @Override // p000.frd
    @eib
    public ByteBuffer getByteBuffer() {
        return this.f30839a.getByteBuffer();
    }

    @Override // p000.frd
    public boolean hasArray() {
        return this.f30839a.hasArray();
    }

    @Override // p000.frd
    public void mark() {
        this.f30839a.mark();
    }

    @Override // p000.frd
    public boolean markSupported() {
        return this.f30839a.markSupported();
    }

    @Override // p000.frd
    public void readBytes(byte[] bArr, int i, int i2) {
        this.f30839a.readBytes(bArr, i, i2);
    }

    @Override // p000.frd
    public int readInt() {
        return this.f30839a.readInt();
    }

    @Override // p000.frd
    public int readUnsignedByte() {
        return this.f30839a.readUnsignedByte();
    }

    @Override // p000.frd
    public int readableBytes() {
        return this.f30839a.readableBytes();
    }

    @Override // p000.frd
    public void reset() {
        this.f30839a.reset();
    }

    @Override // p000.frd
    public void skipBytes(int i) {
        this.f30839a.skipBytes(i);
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", this.f30839a).toString();
    }

    @Override // p000.frd
    public void touch() {
        this.f30839a.touch();
    }

    @Override // p000.frd
    public void readBytes(ByteBuffer byteBuffer) {
        this.f30839a.readBytes(byteBuffer);
    }

    @Override // p000.frd
    public void readBytes(OutputStream outputStream, int i) throws IOException {
        this.f30839a.readBytes(outputStream, i);
    }

    @Override // p000.frd
    public frd readBytes(int i) {
        return this.f30839a.readBytes(i);
    }
}
