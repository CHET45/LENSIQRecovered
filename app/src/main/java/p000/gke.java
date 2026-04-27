package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes8.dex */
public class gke implements bri, ByteChannel, iq7 {

    /* JADX INFO: renamed from: C */
    public ExecutorService f40022C;

    /* JADX INFO: renamed from: a */
    public final jj9 f40023a = kj9.getLogger((Class<?>) gke.class);

    /* JADX INFO: renamed from: b */
    public final SocketChannel f40024b;

    /* JADX INFO: renamed from: c */
    public final SSLEngine f40025c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f40026d;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f40027e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f40028f;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f40029m;

    /* JADX INFO: renamed from: gke$a */
    public static /* synthetic */ class C6360a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40030a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f40031b;

        static {
            int[] iArr = new int[SSLEngineResult.HandshakeStatus.values().length];
            f40031b = iArr;
            try {
                iArr[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40031b[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40031b[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40031b[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40031b[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[SSLEngineResult.Status.values().length];
            f40030a = iArr2;
            try {
                iArr2[SSLEngineResult.Status.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40030a[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40030a[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40030a[SSLEngineResult.Status.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public gke(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null || sSLEngine == null || this.f40022C == executorService) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.f40024b = socketChannel;
        this.f40025c = sSLEngine;
        this.f40022C = executorService;
        this.f40027e = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        this.f40029m = ByteBuffer.allocate(sSLEngine.getSession().getPacketBufferSize());
        sSLEngine.beginHandshake();
        if (doHandshake()) {
            if (selectionKey != null) {
                selectionKey.interestOps(selectionKey.interestOps() | 4);
            }
        } else {
            try {
                socketChannel.close();
            } catch (IOException e) {
                this.f40023a.error("Exception during the closing of the channel", (Throwable) e);
            }
        }
    }

    private void closeConnection() throws IOException {
        this.f40025c.closeOutbound();
        try {
            doHandshake();
        } catch (IOException unused) {
        }
        this.f40024b.close();
    }

    private boolean doHandshake() throws IOException {
        SSLEngineResult.HandshakeStatus handshakeStatus;
        int applicationBufferSize = this.f40025c.getSession().getApplicationBufferSize();
        this.f40026d = ByteBuffer.allocate(applicationBufferSize);
        this.f40028f = ByteBuffer.allocate(applicationBufferSize);
        this.f40027e.clear();
        this.f40029m.clear();
        SSLEngineResult.HandshakeStatus handshakeStatus2 = this.f40025c.getHandshakeStatus();
        boolean z = false;
        while (!z) {
            int i = C6360a.f40031b[handshakeStatus2.ordinal()];
            if (i == 1) {
                boolean zHasRemaining = this.f40029m.hasRemaining();
                boolean z2 = !zHasRemaining;
                if (!zHasRemaining) {
                    return true;
                }
                this.f40024b.write(this.f40029m);
                z = z2;
            } else if (i != 2) {
                if (i == 3) {
                    this.f40027e.clear();
                    try {
                        SSLEngineResult sSLEngineResultWrap = this.f40025c.wrap(this.f40026d, this.f40027e);
                        handshakeStatus = sSLEngineResultWrap.getHandshakeStatus();
                        int i2 = C6360a.f40030a[sSLEngineResultWrap.getStatus().ordinal()];
                        if (i2 == 1) {
                            this.f40027e.flip();
                            while (this.f40027e.hasRemaining()) {
                                this.f40024b.write(this.f40027e);
                            }
                        } else {
                            if (i2 == 2) {
                                throw new SSLException("Buffer underflow occured after a wrap. I don't think we should ever get here.");
                            }
                            if (i2 == 3) {
                                this.f40027e = enlargePacketBuffer(this.f40027e);
                            } else {
                                if (i2 != 4) {
                                    throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultWrap.getStatus());
                                }
                                try {
                                    this.f40027e.flip();
                                    while (this.f40027e.hasRemaining()) {
                                        this.f40024b.write(this.f40027e);
                                    }
                                    this.f40029m.clear();
                                } catch (Exception unused) {
                                    handshakeStatus2 = this.f40025c.getHandshakeStatus();
                                }
                            }
                        }
                        handshakeStatus2 = handshakeStatus;
                    } catch (SSLException unused2) {
                        this.f40025c.closeOutbound();
                        handshakeStatus2 = this.f40025c.getHandshakeStatus();
                    }
                } else if (i == 4) {
                    while (true) {
                        Runnable delegatedTask = this.f40025c.getDelegatedTask();
                        if (delegatedTask == null) {
                            break;
                        }
                        this.f40022C.execute(delegatedTask);
                    }
                    handshakeStatus2 = this.f40025c.getHandshakeStatus();
                } else if (i != 5) {
                    throw new IllegalStateException("Invalid SSL status: " + handshakeStatus2);
                }
            } else if (this.f40024b.read(this.f40029m) >= 0) {
                this.f40029m.flip();
                try {
                    SSLEngineResult sSLEngineResultUnwrap = this.f40025c.unwrap(this.f40029m, this.f40028f);
                    this.f40029m.compact();
                    handshakeStatus = sSLEngineResultUnwrap.getHandshakeStatus();
                    int i3 = C6360a.f40030a[sSLEngineResultUnwrap.getStatus().ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            this.f40029m = handleBufferUnderflow(this.f40029m);
                        } else if (i3 == 3) {
                            this.f40028f = enlargeApplicationBuffer(this.f40028f);
                        } else {
                            if (i3 != 4) {
                                throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultUnwrap.getStatus());
                            }
                            if (this.f40025c.isOutboundDone()) {
                                return false;
                            }
                            this.f40025c.closeOutbound();
                            handshakeStatus2 = this.f40025c.getHandshakeStatus();
                        }
                    }
                    handshakeStatus2 = handshakeStatus;
                } catch (SSLException unused3) {
                    this.f40025c.closeOutbound();
                    handshakeStatus2 = this.f40025c.getHandshakeStatus();
                }
            } else {
                if (this.f40025c.isInboundDone() && this.f40025c.isOutboundDone()) {
                    return false;
                }
                try {
                    this.f40025c.closeInbound();
                } catch (SSLException unused4) {
                }
                this.f40025c.closeOutbound();
                handshakeStatus2 = this.f40025c.getHandshakeStatus();
            }
        }
        return true;
    }

    private ByteBuffer enlargeApplicationBuffer(ByteBuffer byteBuffer) {
        return enlargeBuffer(byteBuffer, this.f40025c.getSession().getApplicationBufferSize());
    }

    private ByteBuffer enlargeBuffer(ByteBuffer byteBuffer, int i) {
        return i > byteBuffer.capacity() ? ByteBuffer.allocate(i) : ByteBuffer.allocate(byteBuffer.capacity() * 2);
    }

    private ByteBuffer enlargePacketBuffer(ByteBuffer byteBuffer) {
        return enlargeBuffer(byteBuffer, this.f40025c.getSession().getPacketBufferSize());
    }

    private ByteBuffer handleBufferUnderflow(ByteBuffer byteBuffer) {
        if (this.f40025c.getSession().getPacketBufferSize() < byteBuffer.limit()) {
            return byteBuffer;
        }
        ByteBuffer byteBufferEnlargePacketBuffer = enlargePacketBuffer(byteBuffer);
        byteBuffer.flip();
        byteBufferEnlargePacketBuffer.put(byteBuffer);
        return byteBufferEnlargePacketBuffer;
    }

    private void handleEndOfStream() throws IOException {
        try {
            this.f40025c.closeInbound();
        } catch (Exception unused) {
            this.f40023a.error("This engine was forced to close inbound, without having received the proper SSL/TLS close notification message from the peer, due to end of stream.");
        }
        closeConnection();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        closeConnection();
    }

    @Override // p000.iq7
    public SSLEngine getSSLEngine() {
        return this.f40025c;
    }

    @Override // p000.bri
    public boolean isBlocking() {
        return this.f40024b.isBlocking();
    }

    @Override // p000.bri
    public boolean isNeedRead() {
        return this.f40029m.hasRemaining() || this.f40028f.hasRemaining();
    }

    @Override // p000.bri
    public boolean isNeedWrite() {
        return false;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f40024b.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.f40028f.hasRemaining()) {
            this.f40028f.flip();
            return hj1.transferByteBuffer(this.f40028f, byteBuffer);
        }
        this.f40029m.compact();
        int i = this.f40024b.read(this.f40029m);
        if (i > 0 || this.f40029m.hasRemaining()) {
            this.f40029m.flip();
            if (this.f40029m.hasRemaining()) {
                this.f40028f.compact();
                try {
                    SSLEngineResult sSLEngineResultUnwrap = this.f40025c.unwrap(this.f40029m, this.f40028f);
                    int i2 = C6360a.f40030a[sSLEngineResultUnwrap.getStatus().ordinal()];
                    if (i2 == 1) {
                        this.f40028f.flip();
                        return hj1.transferByteBuffer(this.f40028f, byteBuffer);
                    }
                    if (i2 == 2) {
                        this.f40028f.flip();
                        return hj1.transferByteBuffer(this.f40028f, byteBuffer);
                    }
                    if (i2 == 3) {
                        this.f40028f = enlargeApplicationBuffer(this.f40028f);
                        return read(byteBuffer);
                    }
                    if (i2 == 4) {
                        closeConnection();
                        byteBuffer.clear();
                        return -1;
                    }
                    throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultUnwrap.getStatus());
                } catch (SSLException e) {
                    this.f40023a.error("SSLExcpetion during unwrap", (Throwable) e);
                    throw e;
                }
            }
        } else if (i < 0) {
            handleEndOfStream();
        }
        hj1.transferByteBuffer(this.f40028f, byteBuffer);
        return i;
    }

    @Override // p000.bri
    public int readMore(ByteBuffer byteBuffer) throws IOException {
        return read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public synchronized int write(ByteBuffer byteBuffer) throws IOException {
        int iWrite = 0;
        while (byteBuffer.hasRemaining()) {
            this.f40027e.clear();
            SSLEngineResult sSLEngineResultWrap = this.f40025c.wrap(byteBuffer, this.f40027e);
            int i = C6360a.f40030a[sSLEngineResultWrap.getStatus().ordinal()];
            if (i == 1) {
                this.f40027e.flip();
                while (this.f40027e.hasRemaining()) {
                    iWrite += this.f40024b.write(this.f40027e);
                }
            } else {
                if (i == 2) {
                    throw new SSLException("Buffer underflow occured after a wrap. I don't think we should ever get here.");
                }
                if (i != 3) {
                    if (i == 4) {
                        closeConnection();
                        return 0;
                    }
                    throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultWrap.getStatus());
                }
                this.f40027e = enlargePacketBuffer(this.f40027e);
            }
        }
        return iWrite;
    }

    @Override // p000.bri
    public void writeMore() throws IOException {
    }
}
