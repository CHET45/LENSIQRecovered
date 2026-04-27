package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public interface frd extends Closeable {
    byte[] array();

    int arrayOffset();

    boolean byteBufferSupported();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @eib
    ByteBuffer getByteBuffer();

    boolean hasArray();

    void mark();

    boolean markSupported();

    frd readBytes(int i);

    void readBytes(OutputStream outputStream, int i) throws IOException;

    void readBytes(ByteBuffer byteBuffer);

    void readBytes(byte[] bArr, int i, int i2);

    int readInt();

    int readUnsignedByte();

    int readableBytes();

    void reset();

    void skipBytes(int i);

    default void touch() {
    }
}
