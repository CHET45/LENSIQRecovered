package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes8.dex */
public abstract class kii extends AbstractC7736j5 implements Runnable, iii {
    private CountDownLatch closeLatch;
    private CountDownLatch connectLatch;
    private Thread connectReadThread;
    private int connectTimeout;
    private gh4 dnsResolver;
    private qn4 draft;
    private mii engine;
    private Map<String, String> headers;
    private OutputStream ostream;
    private Proxy proxy;
    private Socket socket;
    private SocketFactory socketFactory;
    protected URI uri;
    private Thread writeThread;

    /* JADX INFO: renamed from: kii$a */
    public class C8384a implements gh4 {
        public C8384a() {
        }

        @Override // p000.gh4
        public InetAddress resolve(URI uri) throws UnknownHostException {
            return InetAddress.getByName(uri.getHost());
        }
    }

    /* JADX INFO: renamed from: kii$b */
    public class RunnableC8385b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final kii f54239a;

        public RunnableC8385b(kii kiiVar) {
            this.f54239a = kiiVar;
        }

        private void closeSocket() {
            try {
                if (kii.this.socket != null) {
                    kii.this.socket.close();
                }
            } catch (IOException e) {
                kii.this.onWebsocketError(this.f54239a, e);
            }
        }

        private void runWriteData() throws IOException {
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer byteBufferTake = kii.this.engine.f61109b.take();
                    kii.this.ostream.write(byteBufferTake.array(), 0, byteBufferTake.limit());
                    kii.this.ostream.flush();
                } catch (InterruptedException unused) {
                    for (ByteBuffer byteBuffer : kii.this.engine.f61109b) {
                        kii.this.ostream.write(byteBuffer.array(), 0, byteBuffer.limit());
                        kii.this.ostream.flush();
                    }
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
            try {
                try {
                    runWriteData();
                } catch (IOException e) {
                    kii.this.handleIOException(e);
                }
            } finally {
                closeSocket();
                kii.this.writeThread = null;
            }
        }
    }

    public kii(URI uri) {
        this(uri, new rn4());
    }

    private int getPort() {
        int port = this.uri.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.uri.getScheme();
        if ("wss".equals(scheme)) {
            return 443;
        }
        if ("ws".equals(scheme)) {
            return 80;
        }
        throw new IllegalArgumentException("unknown scheme: " + scheme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleIOException(IOException iOException) {
        if (iOException instanceof SSLException) {
            onError(iOException);
        }
        this.engine.eot();
    }

    private void reset() {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread == this.writeThread || threadCurrentThread == this.connectReadThread) {
            throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to insure a successful cleanup.");
        }
        try {
            closeBlocking();
            Thread thread = this.writeThread;
            if (thread != null) {
                thread.interrupt();
                this.writeThread = null;
            }
            Thread thread2 = this.connectReadThread;
            if (thread2 != null) {
                thread2.interrupt();
                this.connectReadThread = null;
            }
            this.draft.reset();
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
                this.socket = null;
            }
            this.connectLatch = new CountDownLatch(1);
            this.closeLatch = new CountDownLatch(1);
            this.engine = new mii(this, this.draft);
        } catch (Exception e) {
            onError(e);
            this.engine.closeConnection(1006, e.getMessage());
        }
    }

    private void sendHandshake() throws yd8 {
        String rawPath = this.uri.getRawPath();
        String rawQuery = this.uri.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = pj4.f71071b;
        }
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int port = getPort();
        StringBuilder sb = new StringBuilder();
        sb.append(this.uri.getHost());
        sb.append((port == 80 || port == 443) ? "" : g1i.f38277c + port);
        String string = sb.toString();
        re7 re7Var = new re7();
        re7Var.setResourceDescriptor(rawPath);
        re7Var.put(go7.f40586w, string);
        Map<String, String> map = this.headers;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                re7Var.put(entry.getKey(), entry.getValue());
            }
        }
        this.engine.startHandshake(re7Var);
    }

    public void addHeader(String str, String str2) {
        if (this.headers == null) {
            this.headers = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        }
        this.headers.put(str, str2);
    }

    public void clearHeaders() {
        this.headers = null;
    }

    @Override // p000.iii
    public void close() {
        if (this.writeThread != null) {
            this.engine.close(1000);
        }
    }

    public void closeBlocking() throws InterruptedException {
        close();
        this.closeLatch.await();
    }

    @Override // p000.iii
    public void closeConnection(int i, String str) {
        this.engine.closeConnection(i, str);
    }

    public void connect() {
        if (this.connectReadThread != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        Thread thread = new Thread(this);
        this.connectReadThread = thread;
        thread.setName("WebSocketConnectReadThread-" + this.connectReadThread.getId());
        this.connectReadThread.start();
    }

    public boolean connectBlocking() throws InterruptedException {
        connect();
        this.connectLatch.await();
        return this.engine.isOpen();
    }

    @Override // p000.iii
    public <T> T getAttachment() {
        return (T) this.engine.getAttachment();
    }

    public iii getConnection() {
        return this.engine;
    }

    @Override // p000.AbstractC7736j5
    public Collection<iii> getConnections() {
        return Collections.singletonList(this.engine);
    }

    @Override // p000.iii
    public qn4 getDraft() {
        return this.draft;
    }

    @Override // p000.nii
    public InetSocketAddress getLocalSocketAddress(iii iiiVar) {
        Socket socket = this.socket;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    @Override // p000.iii
    public rrd getReadyState() {
        return this.engine.getReadyState();
    }

    @Override // p000.nii
    public InetSocketAddress getRemoteSocketAddress(iii iiiVar) {
        Socket socket = this.socket;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    @Override // p000.iii
    public String getResourceDescriptor() {
        return this.uri.getPath();
    }

    @Override // p000.iii
    public SSLSession getSSLSession() {
        return this.engine.getSSLSession();
    }

    public Socket getSocket() {
        return this.socket;
    }

    public URI getURI() {
        return this.uri;
    }

    @Override // p000.iii
    public boolean hasBufferedData() {
        return this.engine.hasBufferedData();
    }

    @Override // p000.iii
    public boolean hasSSLSupport() {
        return this.engine.hasSSLSupport();
    }

    @Override // p000.iii
    public boolean isClosed() {
        return this.engine.isClosed();
    }

    @Override // p000.iii
    public boolean isClosing() {
        return this.engine.isClosing();
    }

    @Override // p000.iii
    public boolean isFlushAndClose() {
        return this.engine.isFlushAndClose();
    }

    @Override // p000.iii
    public boolean isOpen() {
        return this.engine.isOpen();
    }

    public abstract void onClose(int i, String str, boolean z);

    public void onCloseInitiated(int i, String str) {
    }

    public void onClosing(int i, String str, boolean z) {
    }

    public abstract void onError(Exception exc);

    public abstract void onMessage(String str);

    public void onMessage(ByteBuffer byteBuffer) {
    }

    public abstract void onOpen(f3f f3fVar);

    public void onSetSSLParameters(SSLParameters sSLParameters) {
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }

    @Override // p000.nii
    public final void onWebsocketClose(iii iiiVar, int i, String str, boolean z) {
        stopConnectionLostTimer();
        Thread thread = this.writeThread;
        if (thread != null) {
            thread.interrupt();
        }
        onClose(i, str, z);
        this.connectLatch.countDown();
        this.closeLatch.countDown();
    }

    @Override // p000.nii
    public void onWebsocketCloseInitiated(iii iiiVar, int i, String str) {
        onCloseInitiated(i, str);
    }

    @Override // p000.nii
    public void onWebsocketClosing(iii iiiVar, int i, String str, boolean z) {
        onClosing(i, str, z);
    }

    @Override // p000.nii
    public final void onWebsocketError(iii iiiVar, Exception exc) {
        onError(exc);
    }

    @Override // p000.nii
    public final void onWebsocketMessage(iii iiiVar, String str) {
        onMessage(str);
    }

    @Override // p000.nii
    public final void onWebsocketOpen(iii iiiVar, ue7 ue7Var) {
        startConnectionLostTimer();
        onOpen((f3f) ue7Var);
        this.connectLatch.countDown();
    }

    @Override // p000.nii
    public final void onWriteDemand(iii iiiVar) {
    }

    public void reconnect() {
        reset();
        connect();
    }

    public boolean reconnectBlocking() throws InterruptedException {
        reset();
        return connectBlocking();
    }

    public String removeHeader(String str) {
        Map<String, String> map = this.headers;
        if (map == null) {
            return null;
        }
        return map.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[Catch: InternalError -> 0x000e, Exception -> 0x0011, TryCatch #4 {Exception -> 0x0011, InternalError -> 0x000e, blocks: (B:3:0x0001, B:5:0x0007, B:16:0x002a, B:18:0x0044, B:21:0x005f, B:23:0x006d, B:24:0x008c, B:26:0x0092, B:27:0x009e, B:10:0x0014, B:12:0x0018, B:13:0x0023, B:46:0x00fd, B:47:0x0102), top: B:57:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[Catch: InternalError -> 0x000e, Exception -> 0x0011, TryCatch #4 {Exception -> 0x0011, InternalError -> 0x000e, blocks: (B:3:0x0001, B:5:0x0007, B:16:0x002a, B:18:0x0044, B:21:0x005f, B:23:0x006d, B:24:0x008c, B:26:0x0092, B:27:0x009e, B:10:0x0014, B:12:0x0018, B:13:0x0023, B:46:0x00fd, B:47:0x0102), top: B:57:0x0001 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kii.run():void");
    }

    @Override // p000.iii
    public void send(String str) {
        this.engine.send(str);
    }

    @Override // p000.iii
    public void sendFragmentedFrame(o5c o5cVar, ByteBuffer byteBuffer, boolean z) {
        this.engine.sendFragmentedFrame(o5cVar, byteBuffer, z);
    }

    @Override // p000.iii
    public void sendFrame(nv6 nv6Var) {
        this.engine.sendFrame(nv6Var);
    }

    @Override // p000.iii
    public void sendPing() {
        this.engine.sendPing();
    }

    @Override // p000.iii
    public <T> void setAttachment(T t) {
        this.engine.setAttachment(t);
    }

    public void setDnsResolver(gh4 gh4Var) {
        this.dnsResolver = gh4Var;
    }

    public void setProxy(Proxy proxy) {
        if (proxy == null) {
            throw new IllegalArgumentException();
        }
        this.proxy = proxy;
    }

    @Deprecated
    public void setSocket(Socket socket) {
        if (this.socket != null) {
            throw new IllegalStateException("socket has already been set");
        }
        this.socket = socket;
    }

    public void setSocketFactory(SocketFactory socketFactory) {
        this.socketFactory = socketFactory;
    }

    public kii(URI uri, qn4 qn4Var) {
        this(uri, qn4Var, null, 0);
    }

    @Override // p000.nii
    public final void onWebsocketMessage(iii iiiVar, ByteBuffer byteBuffer) {
        onMessage(byteBuffer);
    }

    @Override // p000.iii
    public void send(byte[] bArr) {
        this.engine.send(bArr);
    }

    @Override // p000.iii
    public void sendFrame(Collection<nv6> collection) {
        this.engine.sendFrame(collection);
    }

    public kii(URI uri, Map<String, String> map) {
        this(uri, new rn4(), map);
    }

    @Override // p000.iii
    public void close(int i) {
        this.engine.close(i);
    }

    @Override // p000.iii
    public InetSocketAddress getLocalSocketAddress() {
        return this.engine.getLocalSocketAddress();
    }

    @Override // p000.iii
    public InetSocketAddress getRemoteSocketAddress() {
        return this.engine.getRemoteSocketAddress();
    }

    @Override // p000.iii
    public void send(ByteBuffer byteBuffer) {
        this.engine.send(byteBuffer);
    }

    public kii(URI uri, qn4 qn4Var, Map<String, String> map) {
        this(uri, qn4Var, map, 0);
    }

    @Override // p000.iii
    public void close(int i, String str) {
        this.engine.close(i, str);
    }

    public boolean connectBlocking(long j, TimeUnit timeUnit) throws InterruptedException {
        connect();
        return this.connectLatch.await(j, timeUnit) && this.engine.isOpen();
    }

    public kii(URI uri, qn4 qn4Var, Map<String, String> map, int i) {
        this.uri = null;
        this.engine = null;
        this.socket = null;
        this.socketFactory = null;
        this.proxy = Proxy.NO_PROXY;
        this.connectLatch = new CountDownLatch(1);
        this.closeLatch = new CountDownLatch(1);
        this.connectTimeout = 0;
        this.dnsResolver = null;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        if (qn4Var != null) {
            this.uri = uri;
            this.draft = qn4Var;
            this.dnsResolver = new C8384a();
            if (map != null) {
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                this.headers = treeMap;
                treeMap.putAll(map);
            }
            this.connectTimeout = i;
            setTcpNoDelay(false);
            setReuseAddr(false);
            this.engine = new mii(this, qn4Var);
            return;
        }
        throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
    }
}
