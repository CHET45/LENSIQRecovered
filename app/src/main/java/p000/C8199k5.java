package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

/* JADX INFO: renamed from: k5 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class C8199k5 implements bri {

    /* JADX INFO: renamed from: a */
    public final ByteChannel f52598a;

    @Deprecated
    public C8199k5(ByteChannel byteChannel) {
        this.f52598a = byteChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f52598a.close();
    }

    @Override // p000.bri
    public boolean isBlocking() {
        ByteChannel byteChannel = this.f52598a;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).isBlocking();
        }
        if (byteChannel instanceof bri) {
            return ((bri) byteChannel).isBlocking();
        }
        return false;
    }

    @Override // p000.bri
    public boolean isNeedRead() {
        ByteChannel byteChannel = this.f52598a;
        return (byteChannel instanceof bri) && ((bri) byteChannel).isNeedRead();
    }

    @Override // p000.bri
    public boolean isNeedWrite() {
        ByteChannel byteChannel = this.f52598a;
        return (byteChannel instanceof bri) && ((bri) byteChannel).isNeedWrite();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f52598a.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.f52598a.read(byteBuffer);
    }

    @Override // p000.bri
    public int readMore(ByteBuffer byteBuffer) throws IOException {
        ByteChannel byteChannel = this.f52598a;
        if (byteChannel instanceof bri) {
            return ((bri) byteChannel).readMore(byteBuffer);
        }
        return 0;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.f52598a.write(byteBuffer);
    }

    @Override // p000.bri
    public void writeMore() throws IOException {
        ByteChannel byteChannel = this.f52598a;
        if (byteChannel instanceof bri) {
            ((bri) byteChannel).writeMore();
        }
    }

    @Deprecated
    public C8199k5(bri briVar) {
        this.f52598a = briVar;
    }
}
