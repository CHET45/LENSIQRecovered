package p000;

import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes8.dex */
public class hke implements ByteChannel, bri, iq7 {

    /* JADX INFO: renamed from: Q */
    public static ByteBuffer f43928Q = ByteBuffer.allocate(0);

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ boolean f43929X = false;

    /* JADX INFO: renamed from: C */
    public SelectionKey f43930C;

    /* JADX INFO: renamed from: F */
    public SSLEngine f43931F;

    /* JADX INFO: renamed from: H */
    public SSLEngineResult f43932H;

    /* JADX INFO: renamed from: L */
    public SSLEngineResult f43933L;

    /* JADX INFO: renamed from: b */
    public ExecutorService f43937b;

    /* JADX INFO: renamed from: c */
    public List<Future<?>> f43938c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f43939d;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f43940e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f43941f;

    /* JADX INFO: renamed from: m */
    public SocketChannel f43942m;

    /* JADX INFO: renamed from: a */
    public final jj9 f43936a = kj9.getLogger((Class<?>) hke.class);

    /* JADX INFO: renamed from: M */
    public int f43934M = 0;

    /* JADX INFO: renamed from: N */
    public byte[] f43935N = null;

    public hke(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null || sSLEngine == null || executorService == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.f43942m = socketChannel;
        this.f43931F = sSLEngine;
        this.f43937b = executorService;
        SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, sSLEngine.getHandshakeStatus(), 0, 0);
        this.f43933L = sSLEngineResult;
        this.f43932H = sSLEngineResult;
        this.f43938c = new ArrayList(3);
        if (selectionKey != null) {
            selectionKey.interestOps(selectionKey.interestOps() | 4);
            this.f43930C = selectionKey;
        }
        m12451b(sSLEngine.getSession());
        this.f43942m.write(wrap(f43928Q));
        processHandshake();
    }

    private void consumeFutureUninterruptible(Future<?> future) {
        while (true) {
            try {
                try {
                    future.get();
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private boolean isHandShakeComplete() {
        SSLEngineResult.HandshakeStatus handshakeStatus = this.f43931F.getHandshakeStatus();
        return handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED || handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    private synchronized void processHandshake() throws IOException {
        try {
            if (this.f43931F.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
                return;
            }
            if (!this.f43938c.isEmpty()) {
                Iterator<Future<?>> it = this.f43938c.iterator();
                while (it.hasNext()) {
                    Future<?> next = it.next();
                    if (!next.isDone()) {
                        if (isBlocking()) {
                            consumeFutureUninterruptible(next);
                        }
                        return;
                    }
                    it.remove();
                }
            }
            if (this.f43931F.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                if (!isBlocking() || this.f43932H.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                    this.f43941f.compact();
                    if (this.f43942m.read(this.f43941f) == -1) {
                        throw new IOException("connection closed unexpectedly by peer");
                    }
                    this.f43941f.flip();
                }
                this.f43939d.compact();
                unwrap();
                if (this.f43932H.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    m12451b(this.f43931F.getSession());
                    return;
                }
            }
            m12450a();
            if (this.f43938c.isEmpty() || this.f43931F.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                this.f43942m.write(wrap(f43928Q));
                if (this.f43933L.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    m12451b(this.f43931F.getSession());
                    return;
                }
            }
            this.f43934M = 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    private int readRemaining(ByteBuffer byteBuffer) throws SSLException {
        if (this.f43939d.hasRemaining()) {
            return transfereTo(this.f43939d, byteBuffer);
        }
        if (!this.f43939d.hasRemaining()) {
            this.f43939d.clear();
        }
        tryRestoreCryptedData();
        if (!this.f43941f.hasRemaining()) {
            return 0;
        }
        unwrap();
        int iTransfereTo = transfereTo(this.f43939d, byteBuffer);
        if (this.f43932H.getStatus() == SSLEngineResult.Status.CLOSED) {
            return -1;
        }
        if (iTransfereTo > 0) {
            return iTransfereTo;
        }
        return 0;
    }

    private void saveCryptedData() {
        ByteBuffer byteBuffer = this.f43941f;
        if (byteBuffer == null || byteBuffer.remaining() <= 0) {
            return;
        }
        byte[] bArr = new byte[this.f43941f.remaining()];
        this.f43935N = bArr;
        this.f43941f.get(bArr);
    }

    private int transfereTo(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iRemaining = byteBuffer.remaining();
        int iRemaining2 = byteBuffer2.remaining();
        if (iRemaining <= iRemaining2) {
            byteBuffer2.put(byteBuffer);
            return iRemaining;
        }
        int iMin = Math.min(iRemaining, iRemaining2);
        for (int i = 0; i < iMin; i++) {
            byteBuffer2.put(byteBuffer.get());
        }
        return iMin;
    }

    private void tryRestoreCryptedData() {
        if (this.f43935N != null) {
            this.f43941f.clear();
            this.f43941f.put(this.f43935N);
            this.f43941f.flip();
            this.f43935N = null;
        }
    }

    private synchronized ByteBuffer unwrap() throws SSLException {
        if (this.f43932H.getStatus() == SSLEngineResult.Status.CLOSED && this.f43931F.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            try {
                close();
            } catch (IOException unused) {
            }
        }
        while (true) {
            int iRemaining = this.f43939d.remaining();
            SSLEngineResult sSLEngineResultUnwrap = this.f43931F.unwrap(this.f43941f, this.f43939d);
            this.f43932H = sSLEngineResultUnwrap;
            if (sSLEngineResultUnwrap.getStatus() != SSLEngineResult.Status.OK || (iRemaining == this.f43939d.remaining() && this.f43931F.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_UNWRAP)) {
                break;
            }
        }
        this.f43939d.flip();
        return this.f43939d;
    }

    private synchronized ByteBuffer wrap(ByteBuffer byteBuffer) throws SSLException {
        this.f43940e.compact();
        this.f43933L = this.f43931F.wrap(byteBuffer, this.f43940e);
        this.f43940e.flip();
        return this.f43940e;
    }

    /* JADX INFO: renamed from: a */
    public void m12450a() {
        while (true) {
            Runnable delegatedTask = this.f43931F.getDelegatedTask();
            if (delegatedTask == null) {
                return;
            } else {
                this.f43938c.add(this.f43937b.submit(delegatedTask));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m12451b(SSLSession sSLSession) {
        saveCryptedData();
        int packetBufferSize = sSLSession.getPacketBufferSize();
        int iMax = Math.max(sSLSession.getApplicationBufferSize(), packetBufferSize);
        ByteBuffer byteBuffer = this.f43939d;
        if (byteBuffer == null) {
            this.f43939d = ByteBuffer.allocate(iMax);
            this.f43940e = ByteBuffer.allocate(packetBufferSize);
            this.f43941f = ByteBuffer.allocate(packetBufferSize);
        } else {
            if (byteBuffer.capacity() != iMax) {
                this.f43939d = ByteBuffer.allocate(iMax);
            }
            if (this.f43940e.capacity() != packetBufferSize) {
                this.f43940e = ByteBuffer.allocate(packetBufferSize);
            }
            if (this.f43941f.capacity() != packetBufferSize) {
                this.f43941f = ByteBuffer.allocate(packetBufferSize);
            }
        }
        if (this.f43939d.remaining() != 0 && this.f43936a.isTraceEnabled()) {
            this.f43936a.trace(new String(this.f43939d.array(), this.f43939d.position(), this.f43939d.remaining()));
        }
        this.f43939d.rewind();
        this.f43939d.flip();
        if (this.f43941f.remaining() != 0 && this.f43936a.isTraceEnabled()) {
            this.f43936a.trace(new String(this.f43941f.array(), this.f43941f.position(), this.f43941f.remaining()));
        }
        this.f43941f.rewind();
        this.f43941f.flip();
        this.f43940e.rewind();
        this.f43940e.flip();
        this.f43934M++;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43931F.closeOutbound();
        this.f43931F.getSession().invalidate();
        if (this.f43942m.isOpen()) {
            this.f43942m.write(wrap(f43928Q));
        }
        this.f43942m.close();
    }

    public SelectableChannel configureBlocking(boolean z) throws IOException {
        return this.f43942m.configureBlocking(z);
    }

    public boolean connect(SocketAddress socketAddress) throws IOException {
        return this.f43942m.connect(socketAddress);
    }

    public boolean finishConnect() throws IOException {
        return this.f43942m.finishConnect();
    }

    @Override // p000.iq7
    public SSLEngine getSSLEngine() {
        return this.f43931F;
    }

    @Override // p000.bri
    public boolean isBlocking() {
        return this.f43942m.isBlocking();
    }

    public boolean isConnected() {
        return this.f43942m.isConnected();
    }

    public boolean isInboundDone() {
        return this.f43931F.isInboundDone();
    }

    @Override // p000.bri
    public boolean isNeedRead() {
        return (this.f43935N == null && !this.f43939d.hasRemaining() && (!this.f43941f.hasRemaining() || this.f43932H.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW || this.f43932H.getStatus() == SSLEngineResult.Status.CLOSED)) ? false : true;
    }

    @Override // p000.bri
    public boolean isNeedWrite() {
        return this.f43940e.hasRemaining() || !isHandShakeComplete();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f43942m.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        tryRestoreCryptedData();
        while (byteBuffer.hasRemaining()) {
            if (!isHandShakeComplete()) {
                if (isBlocking()) {
                    while (!isHandShakeComplete()) {
                        processHandshake();
                    }
                } else {
                    processHandshake();
                    if (!isHandShakeComplete()) {
                        return 0;
                    }
                }
            }
            int remaining = readRemaining(byteBuffer);
            if (remaining != 0) {
                return remaining;
            }
            this.f43939d.clear();
            if (this.f43941f.hasRemaining()) {
                this.f43941f.compact();
            } else {
                this.f43941f.clear();
            }
            if ((isBlocking() || this.f43932H.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) && this.f43942m.read(this.f43941f) == -1) {
                return -1;
            }
            this.f43941f.flip();
            unwrap();
            int iTransfereTo = transfereTo(this.f43939d, byteBuffer);
            if (iTransfereTo != 0 || !isBlocking()) {
                return iTransfereTo;
            }
        }
        return 0;
    }

    @Override // p000.bri
    public int readMore(ByteBuffer byteBuffer) throws SSLException {
        return readRemaining(byteBuffer);
    }

    public Socket socket() {
        return this.f43942m.socket();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!isHandShakeComplete()) {
            processHandshake();
            return 0;
        }
        int iWrite = this.f43942m.write(wrap(byteBuffer));
        if (this.f43933L.getStatus() != SSLEngineResult.Status.CLOSED) {
            return iWrite;
        }
        throw new EOFException("Connection is closed");
    }

    @Override // p000.bri
    public void writeMore() throws IOException {
        write(this.f43940e);
    }
}
