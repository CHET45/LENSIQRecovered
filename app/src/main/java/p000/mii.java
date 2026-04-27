package p000;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.net.ssl.SSLSession;
import p000.oii;

/* JADX INFO: loaded from: classes8.dex */
public class mii implements iii {

    /* JADX INFO: renamed from: b2 */
    public static final int f61090b2 = 80;

    /* JADX INFO: renamed from: c2 */
    public static final int f61091c2 = 443;

    /* JADX INFO: renamed from: d2 */
    public static final int f61092d2 = 16384;

    /* JADX INFO: renamed from: e2 */
    public static final /* synthetic */ boolean f61093e2 = false;

    /* JADX INFO: renamed from: C */
    public boolean f61094C;

    /* JADX INFO: renamed from: F */
    public volatile rrd f61095F;

    /* JADX INFO: renamed from: H */
    public List<qn4> f61096H;

    /* JADX INFO: renamed from: L */
    public qn4 f61097L;

    /* JADX INFO: renamed from: M */
    public kae f61098M;

    /* JADX INFO: renamed from: M1 */
    public String f61099M1;

    /* JADX INFO: renamed from: N */
    public ByteBuffer f61100N;

    /* JADX INFO: renamed from: Q */
    public z32 f61101Q;

    /* JADX INFO: renamed from: V1 */
    public long f61102V1;

    /* JADX INFO: renamed from: X */
    public String f61103X;

    /* JADX INFO: renamed from: Y */
    public Integer f61104Y;

    /* JADX INFO: renamed from: Z */
    public Boolean f61105Z;

    /* JADX INFO: renamed from: Z1 */
    public final Object f61106Z1;

    /* JADX INFO: renamed from: a */
    public final jj9 f61107a;

    /* JADX INFO: renamed from: a2 */
    public Object f61108a2;

    /* JADX INFO: renamed from: b */
    public final BlockingQueue<ByteBuffer> f61109b;

    /* JADX INFO: renamed from: c */
    public final BlockingQueue<ByteBuffer> f61110c;

    /* JADX INFO: renamed from: d */
    public final nii f61111d;

    /* JADX INFO: renamed from: e */
    public SelectionKey f61112e;

    /* JADX INFO: renamed from: f */
    public ByteChannel f61113f;

    /* JADX INFO: renamed from: m */
    public oii.C10389a f61114m;

    public mii(nii niiVar, List<qn4> list) {
        this(niiVar, (qn4) null);
        this.f61098M = kae.SERVER;
        if (list != null && !list.isEmpty()) {
            this.f61096H = list;
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f61096H = arrayList;
        arrayList.add(new rn4());
    }

    private void closeConnectionDueToInternalServerError(RuntimeException runtimeException) {
        write(generateHttpResponseDueToError(500));
        flushAndClose(-1, runtimeException.getMessage(), false);
    }

    private void closeConnectionDueToWrongHandshake(ud8 ud8Var) {
        write(generateHttpResponseDueToError(404));
        flushAndClose(ud8Var.getCloseCode(), ud8Var.getMessage(), false);
    }

    private void decodeFrames(ByteBuffer byteBuffer) {
        try {
            for (nv6 nv6Var : this.f61097L.translateFrame(byteBuffer)) {
                this.f61107a.trace("matched frame: {}", nv6Var);
                this.f61097L.processFrame(this, nv6Var);
            }
        } catch (t59 e) {
            if (e.getLimit() == Integer.MAX_VALUE) {
                this.f61107a.error("Closing due to invalid size of frame", (Throwable) e);
                this.f61111d.onWebsocketError(this, e);
            }
            close(e);
        } catch (ud8 e2) {
            this.f61107a.error("Closing due to invalid data in frame", (Throwable) e2);
            this.f61111d.onWebsocketError(this, e2);
            close(e2);
        }
    }

    private boolean decodeHandshake(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        kae kaeVar;
        ue7 ue7VarTranslateHandshake;
        if (this.f61100N.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.f61100N.remaining() < byteBuffer.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f61100N.capacity() + byteBuffer.remaining());
                this.f61100N.flip();
                byteBufferAllocate.put(this.f61100N);
                this.f61100N = byteBufferAllocate;
            }
            this.f61100N.put(byteBuffer);
            this.f61100N.flip();
            byteBuffer2 = this.f61100N;
        }
        byteBuffer2.mark();
        try {
            try {
                kaeVar = this.f61098M;
            } catch (yd8 e) {
                this.f61107a.trace("Closing due to invalid handshake", (Throwable) e);
                close(e);
            }
        } catch (kz7 e2) {
            if (this.f61100N.capacity() == 0) {
                byteBuffer2.reset();
                int preferredSize = e2.getPreferredSize();
                if (preferredSize == 0) {
                    preferredSize = byteBuffer2.capacity() + 16;
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(preferredSize);
                this.f61100N = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            } else {
                ByteBuffer byteBuffer3 = this.f61100N;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.f61100N;
                byteBuffer4.limit(byteBuffer4.capacity());
            }
        }
        if (kaeVar != kae.SERVER) {
            if (kaeVar == kae.CLIENT) {
                this.f61097L.setParseMode(kaeVar);
                ue7 ue7VarTranslateHandshake2 = this.f61097L.translateHandshake(byteBuffer2);
                if (!(ue7VarTranslateHandshake2 instanceof f3f)) {
                    this.f61107a.trace("Closing due to protocol error: wrong http function");
                    flushAndClose(1002, "wrong http function", false);
                    return false;
                }
                f3f f3fVar = (f3f) ue7VarTranslateHandshake2;
                if (this.f61097L.acceptHandshakeAsClient(this.f61101Q, f3fVar) == te7.MATCHED) {
                    try {
                        this.f61111d.onWebsocketHandshakeReceivedAsClient(this, this.f61101Q, f3fVar);
                        open(f3fVar);
                        return true;
                    } catch (RuntimeException e3) {
                        this.f61107a.error("Closing since client was never connected", (Throwable) e3);
                        this.f61111d.onWebsocketError(this, e3);
                        flushAndClose(-1, e3.getMessage(), false);
                        return false;
                    } catch (ud8 e4) {
                        this.f61107a.trace("Closing due to invalid data exception. Possible handshake rejection", (Throwable) e4);
                        flushAndClose(e4.getCloseCode(), e4.getMessage(), false);
                        return false;
                    }
                }
                this.f61107a.trace("Closing due to protocol error: draft {} refuses handshake", this.f61097L);
                close(1002, "draft " + this.f61097L + " refuses handshake");
            }
            return false;
        }
        qn4 qn4Var = this.f61097L;
        if (qn4Var != null) {
            ue7 ue7VarTranslateHandshake3 = qn4Var.translateHandshake(byteBuffer2);
            if (!(ue7VarTranslateHandshake3 instanceof z32)) {
                this.f61107a.trace("Closing due to protocol error: wrong http function");
                flushAndClose(1002, "wrong http function", false);
                return false;
            }
            z32 z32Var = (z32) ue7VarTranslateHandshake3;
            if (this.f61097L.acceptHandshakeAsServer(z32Var) == te7.MATCHED) {
                open(z32Var);
                return true;
            }
            this.f61107a.trace("Closing due to protocol error: the handshake did finally not match");
            close(1002, "the handshake did finally not match");
            return false;
        }
        Iterator<qn4> it = this.f61096H.iterator();
        while (it.hasNext()) {
            qn4 qn4VarCopyInstance = it.next().copyInstance();
            try {
                qn4VarCopyInstance.setParseMode(this.f61098M);
                byteBuffer2.reset();
                ue7VarTranslateHandshake = qn4VarCopyInstance.translateHandshake(byteBuffer2);
            } catch (yd8 unused) {
            }
            if (!(ue7VarTranslateHandshake instanceof z32)) {
                this.f61107a.trace("Closing due to wrong handshake");
                closeConnectionDueToWrongHandshake(new ud8(1002, "wrong http function"));
                return false;
            }
            z32 z32Var2 = (z32) ue7VarTranslateHandshake;
            if (qn4VarCopyInstance.acceptHandshakeAsServer(z32Var2) == te7.MATCHED) {
                this.f61099M1 = z32Var2.getResourceDescriptor();
                try {
                    write(qn4VarCopyInstance.createHandshake(qn4VarCopyInstance.postProcessHandshakeResponseAsServer(z32Var2, this.f61111d.onWebsocketHandshakeReceivedAsServer(this, qn4VarCopyInstance, z32Var2))));
                    this.f61097L = qn4VarCopyInstance;
                    open(z32Var2);
                    return true;
                } catch (RuntimeException e5) {
                    this.f61107a.error("Closing due to internal server error", (Throwable) e5);
                    this.f61111d.onWebsocketError(this, e5);
                    closeConnectionDueToInternalServerError(e5);
                    return false;
                } catch (ud8 e6) {
                    this.f61107a.trace("Closing due to wrong handshake. Possible handshake rejection", (Throwable) e6);
                    closeConnectionDueToWrongHandshake(e6);
                    return false;
                }
            }
        }
        if (this.f61097L == null) {
            this.f61107a.trace("Closing due to protocol error: no draft matches");
            closeConnectionDueToWrongHandshake(new ud8(1002, "no draft matches"));
        }
        return false;
    }

    private ByteBuffer generateHttpResponseDueToError(int i) {
        String str = i != 404 ? "500 Internal Server Error" : "404 WebSocket Upgrade Failure";
        return ByteBuffer.wrap(ww1.asciiBytes("HTTP/1.1 " + str + "\r\nContent-Type: text/html\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (str.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + str + "</h1></body></html>"));
    }

    private void open(ue7 ue7Var) {
        this.f61107a.trace("open using draft: {}", this.f61097L);
        this.f61095F = rrd.OPEN;
        try {
            this.f61111d.onWebsocketOpen(this, ue7Var);
        } catch (RuntimeException e) {
            this.f61111d.onWebsocketError(this, e);
        }
    }

    private void write(ByteBuffer byteBuffer) {
        this.f61107a.trace("write({}): {}", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
        this.f61109b.add(byteBuffer);
        this.f61111d.onWriteDemand(this);
    }

    /* JADX INFO: renamed from: a */
    public void m17334a(int i, boolean z) {
        closeConnection(i, "", z);
    }

    /* JADX INFO: renamed from: b */
    public long m17335b() {
        return this.f61102V1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041 A[Catch: all -> 0x001f, ud8 -> 0x0033, TRY_LEAVE, TryCatch #1 {ud8 -> 0x0033, blocks: (B:19:0x002d, B:25:0x003b, B:27:0x0041, B:24:0x0036), top: B:45:0x002d, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void close(int r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            rrd r0 = r5.f61095F     // Catch: java.lang.Throwable -> L1f
            rrd r1 = p000.rrd.CLOSING     // Catch: java.lang.Throwable -> L1f
            if (r0 == r1) goto L85
            rrd r0 = r5.f61095F     // Catch: java.lang.Throwable -> L1f
            rrd r2 = p000.rrd.CLOSED     // Catch: java.lang.Throwable -> L1f
            if (r0 == r2) goto L85
            rrd r0 = r5.f61095F     // Catch: java.lang.Throwable -> L1f
            rrd r2 = p000.rrd.OPEN     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            if (r0 != r2) goto L68
            r0 = 1006(0x3ee, float:1.41E-42)
            if (r6 != r0) goto L21
            r5.f61095F = r1     // Catch: java.lang.Throwable -> L1f
            r5.flushAndClose(r6, r7, r3)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r5)
            return
        L1f:
            r6 = move-exception
            goto L87
        L21:
            qn4 r1 = r5.f61097L     // Catch: java.lang.Throwable -> L1f
            m52 r1 = r1.getCloseHandshakeType()     // Catch: java.lang.Throwable -> L1f
            m52 r2 = p000.m52.NONE     // Catch: java.lang.Throwable -> L1f
            if (r1 == r2) goto L64
            if (r8 != 0) goto L3b
            nii r1 = r5.f61111d     // Catch: java.lang.Throwable -> L1f p000.ud8 -> L33 java.lang.RuntimeException -> L35
            r1.onWebsocketCloseInitiated(r5, r6, r7)     // Catch: java.lang.Throwable -> L1f p000.ud8 -> L33 java.lang.RuntimeException -> L35
            goto L3b
        L33:
            r1 = move-exception
            goto L53
        L35:
            r1 = move-exception
            nii r2 = r5.f61111d     // Catch: java.lang.Throwable -> L1f p000.ud8 -> L33
            r2.onWebsocketError(r5, r1)     // Catch: java.lang.Throwable -> L1f p000.ud8 -> L33
        L3b:
            boolean r1 = r5.isOpen()     // Catch: java.lang.Throwable -> L1f p000.ud8 -> L33
            if (r1 == 0) goto L64
            l52 r1 = new l52     // Catch: java.lang.Throwable -> L1f p000.ud8 -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L1f p000.ud8 -> L33
            r1.setReason(r7)     // Catch: java.lang.Throwable -> L1f p000.ud8 -> L33
            r1.setCode(r6)     // Catch: java.lang.Throwable -> L1f p000.ud8 -> L33
            r1.isValid()     // Catch: java.lang.Throwable -> L1f p000.ud8 -> L33
            r5.sendFrame(r1)     // Catch: java.lang.Throwable -> L1f p000.ud8 -> L33
            goto L64
        L53:
            jj9 r2 = r5.f61107a     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = "generated frame is invalid"
            r2.error(r4, r1)     // Catch: java.lang.Throwable -> L1f
            nii r2 = r5.f61111d     // Catch: java.lang.Throwable -> L1f
            r2.onWebsocketError(r5, r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "generated frame is invalid"
            r5.flushAndClose(r0, r1, r3)     // Catch: java.lang.Throwable -> L1f
        L64:
            r5.flushAndClose(r6, r7, r8)     // Catch: java.lang.Throwable -> L1f
            goto L7c
        L68:
            r0 = -3
            if (r6 != r0) goto L70
            r6 = 1
            r5.flushAndClose(r0, r7, r6)     // Catch: java.lang.Throwable -> L1f
            goto L7c
        L70:
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r6 != r0) goto L78
            r5.flushAndClose(r6, r7, r8)     // Catch: java.lang.Throwable -> L1f
            goto L7c
        L78:
            r6 = -1
            r5.flushAndClose(r6, r7, r3)     // Catch: java.lang.Throwable -> L1f
        L7c:
            rrd r6 = p000.rrd.CLOSING     // Catch: java.lang.Throwable -> L1f
            r5.f61095F = r6     // Catch: java.lang.Throwable -> L1f
            r6 = 0
            r5.f61100N = r6     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r5)
            return
        L85:
            monitor-exit(r5)
            return
        L87:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mii.close(int, java.lang.String, boolean):void");
    }

    public synchronized void closeConnection(int i, String str, boolean z) {
        try {
            if (this.f61095F == rrd.CLOSED) {
                return;
            }
            if (this.f61095F == rrd.OPEN && i == 1006) {
                this.f61095F = rrd.CLOSING;
            }
            SelectionKey selectionKey = this.f61112e;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            ByteChannel byteChannel = this.f61113f;
            if (byteChannel != null) {
                try {
                    byteChannel.close();
                } catch (IOException e) {
                    if (e.getMessage() == null || !e.getMessage().equals("Broken pipe")) {
                        this.f61107a.error("Exception during channel.close()", (Throwable) e);
                        this.f61111d.onWebsocketError(this, e);
                    } else {
                        this.f61107a.trace("Caught IOException: Broken pipe during closeConnection()", (Throwable) e);
                    }
                }
            }
            try {
                this.f61111d.onWebsocketClose(this, i, str, z);
            } catch (RuntimeException e2) {
                this.f61111d.onWebsocketError(this, e2);
            }
            qn4 qn4Var = this.f61097L;
            if (qn4Var != null) {
                qn4Var.reset();
            }
            this.f61101Q = null;
            this.f61095F = rrd.CLOSED;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void decode(ByteBuffer byteBuffer) {
        this.f61107a.trace("process({}): ({})", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
        if (this.f61095F != rrd.NOT_YET_CONNECTED) {
            if (this.f61095F == rrd.OPEN) {
                decodeFrames(byteBuffer);
            }
        } else {
            if (!decodeHandshake(byteBuffer) || isClosing() || isClosed()) {
                return;
            }
            if (byteBuffer.hasRemaining()) {
                decodeFrames(byteBuffer);
            } else if (this.f61100N.hasRemaining()) {
                decodeFrames(this.f61100N);
            }
        }
    }

    public void eot() {
        if (this.f61095F == rrd.NOT_YET_CONNECTED) {
            m17334a(-1, true);
            return;
        }
        if (this.f61094C) {
            closeConnection(this.f61104Y.intValue(), this.f61103X, this.f61105Z.booleanValue());
            return;
        }
        if (this.f61097L.getCloseHandshakeType() == m52.NONE) {
            m17334a(1000, true);
            return;
        }
        if (this.f61097L.getCloseHandshakeType() != m52.ONEWAY) {
            m17334a(1006, true);
        } else if (this.f61098M == kae.SERVER) {
            m17334a(1006, true);
        } else {
            m17334a(1000, true);
        }
    }

    public synchronized void flushAndClose(int i, String str, boolean z) {
        if (this.f61094C) {
            return;
        }
        this.f61104Y = Integer.valueOf(i);
        this.f61103X = str;
        this.f61105Z = Boolean.valueOf(z);
        this.f61094C = true;
        this.f61111d.onWriteDemand(this);
        try {
            this.f61111d.onWebsocketClosing(this, i, str, z);
        } catch (RuntimeException e) {
            this.f61107a.error("Exception in onWebsocketClosing", (Throwable) e);
            this.f61111d.onWebsocketError(this, e);
        }
        qn4 qn4Var = this.f61097L;
        if (qn4Var != null) {
            qn4Var.reset();
        }
        this.f61101Q = null;
    }

    @Override // p000.iii
    public <T> T getAttachment() {
        return (T) this.f61108a2;
    }

    public ByteChannel getChannel() {
        return this.f61113f;
    }

    @Override // p000.iii
    public qn4 getDraft() {
        return this.f61097L;
    }

    @Override // p000.iii
    public InetSocketAddress getLocalSocketAddress() {
        return this.f61111d.getLocalSocketAddress(this);
    }

    @Override // p000.iii
    public rrd getReadyState() {
        return this.f61095F;
    }

    @Override // p000.iii
    public InetSocketAddress getRemoteSocketAddress() {
        return this.f61111d.getRemoteSocketAddress(this);
    }

    @Override // p000.iii
    public String getResourceDescriptor() {
        return this.f61099M1;
    }

    @Override // p000.iii
    public SSLSession getSSLSession() {
        if (hasSSLSupport()) {
            return ((iq7) this.f61113f).getSSLEngine().getSession();
        }
        throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
    }

    public SelectionKey getSelectionKey() {
        return this.f61112e;
    }

    public nii getWebSocketListener() {
        return this.f61111d;
    }

    public oii.C10389a getWorkerThread() {
        return this.f61114m;
    }

    @Override // p000.iii
    public boolean hasBufferedData() {
        return !this.f61109b.isEmpty();
    }

    @Override // p000.iii
    public boolean hasSSLSupport() {
        return this.f61113f instanceof iq7;
    }

    @Override // p000.iii
    public boolean isClosed() {
        return this.f61095F == rrd.CLOSED;
    }

    @Override // p000.iii
    public boolean isClosing() {
        return this.f61095F == rrd.CLOSING;
    }

    @Override // p000.iii
    public boolean isFlushAndClose() {
        return this.f61094C;
    }

    @Override // p000.iii
    public boolean isOpen() {
        return this.f61095F == rrd.OPEN;
    }

    @Override // p000.iii
    public void send(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        send(this.f61097L.createFrames(str, this.f61098M == kae.CLIENT));
    }

    @Override // p000.iii
    public void sendFragmentedFrame(o5c o5cVar, ByteBuffer byteBuffer, boolean z) {
        send(this.f61097L.continuousFrame(o5cVar, byteBuffer, z));
    }

    @Override // p000.iii
    public void sendFrame(Collection<nv6> collection) {
        send(collection);
    }

    @Override // p000.iii
    public void sendPing() throws NullPointerException {
        uvc uvcVarOnPreparePing = this.f61111d.onPreparePing(this);
        if (uvcVarOnPreparePing == null) {
            throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
        }
        sendFrame(uvcVarOnPreparePing);
    }

    @Override // p000.iii
    public <T> void setAttachment(T t) {
        this.f61108a2 = t;
    }

    public void setChannel(ByteChannel byteChannel) {
        this.f61113f = byteChannel;
    }

    public void setSelectionKey(SelectionKey selectionKey) {
        this.f61112e = selectionKey;
    }

    public void setWorkerThread(oii.C10389a c10389a) {
        this.f61114m = c10389a;
    }

    public void startHandshake(a42 a42Var) throws yd8 {
        this.f61101Q = this.f61097L.postProcessHandshakeRequestAsClient(a42Var);
        this.f61099M1 = a42Var.getResourceDescriptor();
        try {
            this.f61111d.onWebsocketHandshakeSentAsClient(this, this.f61101Q);
            write(this.f61097L.createHandshake(this.f61101Q));
        } catch (RuntimeException e) {
            this.f61107a.error("Exception in startHandshake", (Throwable) e);
            this.f61111d.onWebsocketError(this, e);
            throw new yd8("rejected because of " + e);
        } catch (ud8 unused) {
            throw new yd8("Handshake data rejected by client.");
        }
    }

    public String toString() {
        return super.toString();
    }

    public void updateLastPong() {
        this.f61102V1 = System.nanoTime();
    }

    @Override // p000.iii
    public void sendFrame(nv6 nv6Var) {
        send(Collections.singletonList(nv6Var));
    }

    @Override // p000.iii
    public void send(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        send(this.f61097L.createFrames(byteBuffer, this.f61098M == kae.CLIENT));
    }

    private void write(List<ByteBuffer> list) {
        synchronized (this.f61106Z1) {
            try {
                Iterator<ByteBuffer> it = list.iterator();
                while (it.hasNext()) {
                    write(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.iii
    public void send(byte[] bArr) {
        send(ByteBuffer.wrap(bArr));
    }

    private void send(Collection<nv6> collection) {
        if (!isOpen()) {
            throw new oji();
        }
        if (collection != null) {
            ArrayList arrayList = new ArrayList();
            for (nv6 nv6Var : collection) {
                this.f61107a.trace("send frame: {}", nv6Var);
                arrayList.add(this.f61097L.createBinaryFrame(nv6Var));
            }
            write(arrayList);
            return;
        }
        throw new IllegalArgumentException();
    }

    public mii(nii niiVar, qn4 qn4Var) {
        this.f61107a = kj9.getLogger((Class<?>) mii.class);
        this.f61094C = false;
        this.f61095F = rrd.NOT_YET_CONNECTED;
        this.f61097L = null;
        this.f61100N = ByteBuffer.allocate(0);
        this.f61101Q = null;
        this.f61103X = null;
        this.f61104Y = null;
        this.f61105Z = null;
        this.f61099M1 = null;
        this.f61102V1 = System.nanoTime();
        this.f61106Z1 = new Object();
        if (niiVar != null && (qn4Var != null || this.f61098M != kae.SERVER)) {
            this.f61109b = new LinkedBlockingQueue();
            this.f61110c = new LinkedBlockingQueue();
            this.f61111d = niiVar;
            this.f61098M = kae.CLIENT;
            if (qn4Var != null) {
                this.f61097L = qn4Var.copyInstance();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("parameters must not be null");
    }

    public void closeConnection() {
        if (this.f61105Z != null) {
            closeConnection(this.f61104Y.intValue(), this.f61103X, this.f61105Z.booleanValue());
            return;
        }
        throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
    }

    @Override // p000.iii
    public void closeConnection(int i, String str) {
        closeConnection(i, str, false);
    }

    @Override // p000.iii
    public void close(int i, String str) {
        close(i, str, false);
    }

    @Override // p000.iii
    public void close(int i) {
        close(i, "", false);
    }

    public void close(ud8 ud8Var) {
        close(ud8Var.getCloseCode(), ud8Var.getMessage(), false);
    }

    @Override // p000.iii
    public void close() {
        close(1000);
    }
}
