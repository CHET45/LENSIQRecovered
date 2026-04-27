package p000;

import java.io.IOException;
import java.lang.Thread;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oii extends AbstractC7736j5 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public static final int f67761Y = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: C */
    public final AtomicBoolean f67762C;

    /* JADX INFO: renamed from: F */
    public List<C10389a> f67763F;

    /* JADX INFO: renamed from: H */
    public List<mii> f67764H;

    /* JADX INFO: renamed from: L */
    public BlockingQueue<ByteBuffer> f67765L;

    /* JADX INFO: renamed from: M */
    public int f67766M;

    /* JADX INFO: renamed from: N */
    public final AtomicInteger f67767N;

    /* JADX INFO: renamed from: Q */
    public pii f67768Q;

    /* JADX INFO: renamed from: X */
    public int f67769X;

    /* JADX INFO: renamed from: a */
    public final jj9 f67770a;

    /* JADX INFO: renamed from: b */
    public final Collection<iii> f67771b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f67772c;

    /* JADX INFO: renamed from: d */
    public ServerSocketChannel f67773d;

    /* JADX INFO: renamed from: e */
    public Selector f67774e;

    /* JADX INFO: renamed from: f */
    public List<qn4> f67775f;

    /* JADX INFO: renamed from: m */
    public Thread f67776m;

    /* JADX INFO: renamed from: oii$a */
    public class C10389a extends Thread {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ boolean f67777c = false;

        /* JADX INFO: renamed from: a */
        public BlockingQueue<mii> f67778a = new LinkedBlockingQueue();

        /* JADX INFO: renamed from: oii$a$a */
        public class a implements Thread.UncaughtExceptionHandler {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ oii f67780a;

            public a(oii oiiVar) {
                this.f67780a = oiiVar;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                oii.this.f67770a.error("Uncaught exception in thread {}: {}", thread.getName(), th);
            }
        }

        public C10389a() {
            setName("WebSocketWorker-" + getId());
            setUncaughtExceptionHandler(new a(oii.this));
        }

        private void doDecode(mii miiVar, ByteBuffer byteBuffer) throws InterruptedException {
            try {
                try {
                    miiVar.decode(byteBuffer);
                } catch (Exception e) {
                    oii.this.f67770a.error("Error while reading from remote connection", (Throwable) e);
                }
            } finally {
                oii.this.pushBuffer(byteBuffer);
            }
        }

        public void put(mii miiVar) throws InterruptedException {
            this.f67778a.put(miiVar);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            mii miiVarTake;
            RuntimeException e;
            while (true) {
                try {
                    try {
                        miiVarTake = this.f67778a.take();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                } catch (RuntimeException e2) {
                    miiVarTake = null;
                    e = e2;
                }
                try {
                    doDecode(miiVarTake, miiVarTake.f61110c.poll());
                } catch (RuntimeException e3) {
                    e = e3;
                    oii.this.handleFatal(miiVarTake, e);
                    return;
                }
            }
        }
    }

    public oii() {
        this(new InetSocketAddress(80), f67761Y, null);
    }

    private void doAccept(SelectionKey selectionKey, Iterator<SelectionKey> it) throws InterruptedException, IOException {
        if (!m18721f(selectionKey)) {
            selectionKey.cancel();
            return;
        }
        SocketChannel socketChannelAccept = this.f67773d.accept();
        if (socketChannelAccept == null) {
            return;
        }
        socketChannelAccept.configureBlocking(false);
        Socket socket = socketChannelAccept.socket();
        socket.setTcpNoDelay(isTcpNoDelay());
        socket.setKeepAlive(true);
        mii miiVarCreateWebSocket = this.f67768Q.createWebSocket((jii) this, this.f67775f);
        miiVarCreateWebSocket.setSelectionKey(socketChannelAccept.register(this.f67774e, 1, miiVarCreateWebSocket));
        try {
            miiVarCreateWebSocket.setChannel(this.f67768Q.wrapChannel(socketChannelAccept, miiVarCreateWebSocket.getSelectionKey()));
            it.remove();
            m18720e(miiVarCreateWebSocket);
        } catch (IOException e) {
            if (miiVarCreateWebSocket.getSelectionKey() != null) {
                miiVarCreateWebSocket.getSelectionKey().cancel();
            }
            handleIOException(miiVarCreateWebSocket.getSelectionKey(), null, e);
        }
    }

    private void doAdditionalRead() throws InterruptedException, IOException {
        while (!this.f67764H.isEmpty()) {
            mii miiVarRemove = this.f67764H.remove(0);
            bri briVar = (bri) miiVarRemove.getChannel();
            ByteBuffer byteBufferTakeBuffer = takeBuffer();
            try {
                if (ouf.readMore(byteBufferTakeBuffer, miiVarRemove, briVar)) {
                    this.f67764H.add(miiVarRemove);
                }
                if (byteBufferTakeBuffer.hasRemaining()) {
                    miiVarRemove.f61110c.put(byteBufferTakeBuffer);
                    m18722g(miiVarRemove);
                } else {
                    pushBuffer(byteBufferTakeBuffer);
                }
            } catch (IOException e) {
                pushBuffer(byteBufferTakeBuffer);
                throw e;
            }
        }
    }

    private void doBroadcast(Object obj, Collection<iii> collection) {
        ArrayList<iii> arrayList;
        String str = obj instanceof String ? (String) obj : null;
        ByteBuffer byteBuffer = obj instanceof ByteBuffer ? (ByteBuffer) obj : null;
        if (str == null && byteBuffer == null) {
            return;
        }
        HashMap map = new HashMap();
        synchronized (collection) {
            arrayList = new ArrayList(collection);
        }
        for (iii iiiVar : arrayList) {
            if (iiiVar != null) {
                qn4 draft = iiiVar.getDraft();
                fillFrames(draft, map, str, byteBuffer);
                try {
                    iiiVar.sendFrame(map.get(draft));
                } catch (oji unused) {
                }
            }
        }
    }

    private boolean doEnsureSingleThread() {
        synchronized (this) {
            try {
                if (this.f67776m == null) {
                    this.f67776m = Thread.currentThread();
                    return !this.f67762C.get();
                }
                throw new IllegalStateException(getClass().getName() + " can only be started once.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean doRead(SelectionKey selectionKey, Iterator<SelectionKey> it) throws InterruptedException, gri {
        mii miiVar = (mii) selectionKey.attachment();
        ByteBuffer byteBufferTakeBuffer = takeBuffer();
        if (miiVar.getChannel() == null) {
            selectionKey.cancel();
            handleIOException(selectionKey, miiVar, new IOException());
            return false;
        }
        try {
            if (!ouf.read(byteBufferTakeBuffer, miiVar, miiVar.getChannel())) {
                pushBuffer(byteBufferTakeBuffer);
                return true;
            }
            if (!byteBufferTakeBuffer.hasRemaining()) {
                pushBuffer(byteBufferTakeBuffer);
                return true;
            }
            miiVar.f61110c.put(byteBufferTakeBuffer);
            m18722g(miiVar);
            it.remove();
            if (!(miiVar.getChannel() instanceof bri) || !((bri) miiVar.getChannel()).isNeedRead()) {
                return true;
            }
            this.f67764H.add(miiVar);
            return true;
        } catch (IOException e) {
            pushBuffer(byteBufferTakeBuffer);
            throw new gri(miiVar, e);
        }
    }

    private void doServerShutdown() {
        stopConnectionLostTimer();
        List<C10389a> list = this.f67763F;
        if (list != null) {
            Iterator<C10389a> it = list.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        Selector selector = this.f67774e;
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException e) {
                this.f67770a.error("IOException during selector.close", (Throwable) e);
                onError(null, e);
            }
        }
        ServerSocketChannel serverSocketChannel = this.f67773d;
        if (serverSocketChannel != null) {
            try {
                serverSocketChannel.close();
            } catch (IOException e2) {
                this.f67770a.error("IOException during server.close", (Throwable) e2);
                onError(null, e2);
            }
        }
    }

    private boolean doSetupSelectorAndServerThread() {
        this.f67776m.setName("WebSocketSelector-" + this.f67776m.getId());
        try {
            ServerSocketChannel serverSocketChannelOpen = ServerSocketChannel.open();
            this.f67773d = serverSocketChannelOpen;
            serverSocketChannelOpen.configureBlocking(false);
            ServerSocket serverSocketSocket = this.f67773d.socket();
            serverSocketSocket.setReceiveBufferSize(16384);
            serverSocketSocket.setReuseAddress(isReuseAddr());
            serverSocketSocket.bind(this.f67772c, getMaxPendingConnections());
            Selector selectorOpen = Selector.open();
            this.f67774e = selectorOpen;
            ServerSocketChannel serverSocketChannel = this.f67773d;
            serverSocketChannel.register(selectorOpen, serverSocketChannel.validOps());
            startConnectionLostTimer();
            Iterator<C10389a> it = this.f67763F.iterator();
            while (it.hasNext()) {
                it.next().start();
            }
            onStart();
            return true;
        } catch (IOException e) {
            handleFatal(null, e);
            return false;
        }
    }

    private void doWrite(SelectionKey selectionKey) throws gri {
        mii miiVar = (mii) selectionKey.attachment();
        try {
            if (ouf.batch(miiVar, miiVar.getChannel()) && selectionKey.isValid()) {
                selectionKey.interestOps(1);
            }
        } catch (IOException e) {
            throw new gri(miiVar, e);
        }
    }

    private void fillFrames(qn4 qn4Var, Map<qn4, List<nv6>> map, String str, ByteBuffer byteBuffer) {
        if (map.containsKey(qn4Var)) {
            return;
        }
        List<nv6> listCreateFrames = str != null ? qn4Var.createFrames(str, false) : null;
        if (byteBuffer != null) {
            listCreateFrames = qn4Var.createFrames(byteBuffer, false);
        }
        if (listCreateFrames != null) {
            map.put(qn4Var, listCreateFrames);
        }
    }

    private Socket getSocket(iii iiiVar) {
        return ((SocketChannel) ((mii) iiiVar).getSelectionKey().channel()).socket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFatal(iii iiiVar, Exception exc) {
        this.f67770a.error("Shutdown due to fatal error", (Throwable) exc);
        onError(iiiVar, exc);
        List<C10389a> list = this.f67763F;
        if (list != null) {
            Iterator<C10389a> it = list.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        Thread thread = this.f67776m;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            stop();
        } catch (IOException e) {
            this.f67770a.error("Error during shutdown", (Throwable) e);
            onError(null, e);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            this.f67770a.error("Interrupt during stop", (Throwable) exc);
            onError(null, e2);
        }
    }

    private void handleIOException(SelectionKey selectionKey, iii iiiVar, IOException iOException) {
        SelectableChannel selectableChannelChannel;
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        if (iiiVar != null) {
            iiiVar.closeConnection(1006, iOException.getMessage());
        } else {
            if (selectionKey == null || (selectableChannelChannel = selectionKey.channel()) == null || !selectableChannelChannel.isOpen()) {
                return;
            }
            try {
                selectableChannelChannel.close();
            } catch (IOException unused) {
            }
            this.f67770a.trace("Connection closed because of exception", (Throwable) iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushBuffer(ByteBuffer byteBuffer) throws InterruptedException {
        if (this.f67765L.size() > this.f67767N.intValue()) {
            return;
        }
        this.f67765L.put(byteBuffer);
    }

    private ByteBuffer takeBuffer() throws InterruptedException {
        return this.f67765L.take();
    }

    public void broadcast(String str) {
        broadcast(str, this.f67771b);
    }

    public ByteBuffer createBuffer() {
        return ByteBuffer.allocate(16384);
    }

    /* JADX INFO: renamed from: d */
    public boolean m18719d(iii iiiVar) {
        boolean zAdd;
        if (this.f67762C.get()) {
            iiiVar.close(1001);
            return true;
        }
        synchronized (this.f67771b) {
            zAdd = this.f67771b.add(iiiVar);
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: e */
    public void m18720e(iii iiiVar) throws InterruptedException {
        if (this.f67767N.get() >= (this.f67763F.size() * 2) + 1) {
            return;
        }
        this.f67767N.incrementAndGet();
        this.f67765L.put(createBuffer());
    }

    /* JADX INFO: renamed from: f */
    public boolean m18721f(SelectionKey selectionKey) {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m18722g(mii miiVar) throws InterruptedException {
        if (miiVar.getWorkerThread() == null) {
            List<C10389a> list = this.f67763F;
            miiVar.setWorkerThread(list.get(this.f67766M % list.size()));
            this.f67766M++;
        }
        miiVar.getWorkerThread().put(miiVar);
    }

    public InetSocketAddress getAddress() {
        return this.f67772c;
    }

    @Override // p000.AbstractC7736j5
    public Collection<iii> getConnections() {
        Collection<iii> collectionUnmodifiableCollection;
        synchronized (this.f67771b) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(new ArrayList(this.f67771b));
        }
        return collectionUnmodifiableCollection;
    }

    public List<qn4> getDraft() {
        return Collections.unmodifiableList(this.f67775f);
    }

    @Override // p000.nii
    public InetSocketAddress getLocalSocketAddress(iii iiiVar) {
        return (InetSocketAddress) getSocket(iiiVar).getLocalSocketAddress();
    }

    public int getMaxPendingConnections() {
        return this.f67769X;
    }

    public int getPort() {
        ServerSocketChannel serverSocketChannel;
        int port = getAddress().getPort();
        return (port != 0 || (serverSocketChannel = this.f67773d) == null) ? port : serverSocketChannel.socket().getLocalPort();
    }

    @Override // p000.nii
    public InetSocketAddress getRemoteSocketAddress(iii iiiVar) {
        return (InetSocketAddress) getSocket(iiiVar).getRemoteSocketAddress();
    }

    public final lii getWebSocketFactory() {
        return this.f67768Q;
    }

    /* JADX INFO: renamed from: h */
    public void m18723h(iii iiiVar) throws InterruptedException {
    }

    /* JADX INFO: renamed from: i */
    public boolean m18724i(iii iiiVar) {
        boolean zRemove;
        synchronized (this.f67771b) {
            try {
                if (this.f67771b.contains(iiiVar)) {
                    zRemove = this.f67771b.remove(iiiVar);
                } else {
                    this.f67770a.trace("Removing connection which is not in the connections collection! Possible no handshake recieved! {}", iiiVar);
                    zRemove = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f67762C.get() && this.f67771b.isEmpty()) {
            this.f67776m.interrupt();
        }
        return zRemove;
    }

    public abstract void onClose(iii iiiVar, int i, String str, boolean z);

    public void onCloseInitiated(iii iiiVar, int i, String str) {
    }

    public void onClosing(iii iiiVar, int i, String str, boolean z) {
    }

    public abstract void onError(iii iiiVar, Exception exc);

    public abstract void onMessage(iii iiiVar, String str);

    public void onMessage(iii iiiVar, ByteBuffer byteBuffer) {
    }

    public abstract void onOpen(iii iiiVar, z32 z32Var);

    public abstract void onStart();

    @Override // p000.nii
    public final void onWebsocketClose(iii iiiVar, int i, String str, boolean z) {
        this.f67774e.wakeup();
        try {
            if (m18724i(iiiVar)) {
                onClose(iiiVar, i, str, z);
            }
            try {
                m18723h(iiiVar);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            try {
                m18723h(iiiVar);
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    @Override // p000.nii
    public void onWebsocketCloseInitiated(iii iiiVar, int i, String str) {
        onCloseInitiated(iiiVar, i, str);
    }

    @Override // p000.nii
    public void onWebsocketClosing(iii iiiVar, int i, String str, boolean z) {
        onClosing(iiiVar, i, str, z);
    }

    @Override // p000.nii
    public final void onWebsocketError(iii iiiVar, Exception exc) {
        onError(iiiVar, exc);
    }

    @Override // p000.nii
    public final void onWebsocketMessage(iii iiiVar, String str) {
        onMessage(iiiVar, str);
    }

    @Override // p000.nii
    public final void onWebsocketOpen(iii iiiVar, ue7 ue7Var) {
        if (m18719d(iiiVar)) {
            onOpen(iiiVar, (z32) ue7Var);
        }
    }

    @Override // p000.nii
    public final void onWriteDemand(iii iiiVar) {
        mii miiVar = (mii) iiiVar;
        try {
            miiVar.getSelectionKey().interestOps(5);
        } catch (CancelledKeyException unused) {
            miiVar.f61109b.clear();
        }
        this.f67774e.wakeup();
    }

    @Override // java.lang.Runnable
    public void run() {
        SelectionKey selectionKey;
        if (doEnsureSingleThread() && doSetupSelectorAndServerThread()) {
            int i = 0;
            int i2 = 5;
            while (!this.f67776m.isInterrupted() && i2 != 0) {
                try {
                    try {
                        try {
                            try {
                                if (this.f67762C.get()) {
                                    i = 5;
                                }
                                if (this.f67774e.select(i) == 0 && this.f67762C.get()) {
                                    i2--;
                                }
                                Iterator<SelectionKey> it = this.f67774e.selectedKeys().iterator();
                                selectionKey = null;
                                while (it.hasNext()) {
                                    try {
                                        SelectionKey next = it.next();
                                        try {
                                            if (next.isValid()) {
                                                if (next.isAcceptable()) {
                                                    doAccept(next, it);
                                                } else if ((!next.isReadable() || doRead(next, it)) && next.isWritable()) {
                                                    doWrite(next);
                                                }
                                            }
                                            selectionKey = next;
                                        } catch (gri e) {
                                            e = e;
                                            selectionKey = next;
                                            handleIOException(selectionKey, e.getConnection(), e.getIOException());
                                        } catch (IOException e2) {
                                            e = e2;
                                            selectionKey = next;
                                            handleIOException(selectionKey, null, e);
                                        }
                                    } catch (gri e3) {
                                        e = e3;
                                    } catch (IOException e4) {
                                        e = e4;
                                    }
                                }
                                doAdditionalRead();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            } catch (CancelledKeyException unused2) {
                            } catch (ClosedByInterruptException unused3) {
                                doServerShutdown();
                                return;
                            }
                        } catch (gri e5) {
                            e = e5;
                            selectionKey = null;
                        } catch (IOException e6) {
                            e = e6;
                            selectionKey = null;
                        }
                    } catch (RuntimeException e7) {
                        handleFatal(null, e7);
                    }
                } catch (Throwable th) {
                    doServerShutdown();
                    throw th;
                }
            }
            doServerShutdown();
        }
    }

    public void setMaxPendingConnections(int i) {
        this.f67769X = i;
    }

    public final void setWebSocketFactory(pii piiVar) {
        pii piiVar2 = this.f67768Q;
        if (piiVar2 != null) {
            piiVar2.close();
        }
        this.f67768Q = piiVar;
    }

    public void start() {
        if (this.f67776m == null) {
            new Thread(this).start();
            return;
        }
        throw new IllegalStateException(getClass().getName() + " can only be started once.");
    }

    public void stop(int i) throws InterruptedException {
        ArrayList arrayList;
        Selector selector;
        if (this.f67762C.compareAndSet(false, true)) {
            synchronized (this.f67771b) {
                arrayList = new ArrayList(this.f67771b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((iii) it.next()).close(1001);
            }
            this.f67768Q.close();
            synchronized (this) {
                try {
                    if (this.f67776m != null && (selector = this.f67774e) != null) {
                        selector.wakeup();
                        this.f67776m.join(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public oii(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, f67761Y, null);
    }

    public void broadcast(byte[] bArr) {
        broadcast(bArr, this.f67771b);
    }

    @Override // p000.nii
    public final void onWebsocketMessage(iii iiiVar, ByteBuffer byteBuffer) {
        onMessage(iiiVar, byteBuffer);
    }

    public oii(InetSocketAddress inetSocketAddress, int i) {
        this(inetSocketAddress, i, null);
    }

    public void broadcast(ByteBuffer byteBuffer) {
        broadcast(byteBuffer, this.f67771b);
    }

    public oii(InetSocketAddress inetSocketAddress, List<qn4> list) {
        this(inetSocketAddress, f67761Y, list);
    }

    public void broadcast(byte[] bArr, Collection<iii> collection) {
        if (bArr != null && collection != null) {
            broadcast(ByteBuffer.wrap(bArr), collection);
            return;
        }
        throw new IllegalArgumentException();
    }

    public oii(InetSocketAddress inetSocketAddress, int i, List<qn4> list) {
        this(inetSocketAddress, i, list, new HashSet());
    }

    public oii(InetSocketAddress inetSocketAddress, int i, List<qn4> list, Collection<iii> collection) {
        this.f67770a = kj9.getLogger((Class<?>) oii.class);
        this.f67762C = new AtomicBoolean(false);
        this.f67766M = 0;
        this.f67767N = new AtomicInteger(0);
        this.f67768Q = new x24();
        this.f67769X = -1;
        if (inetSocketAddress != null && i >= 1 && collection != null) {
            if (list == null) {
                this.f67775f = Collections.emptyList();
            } else {
                this.f67775f = list;
            }
            this.f67772c = inetSocketAddress;
            this.f67771b = collection;
            setTcpNoDelay(false);
            setReuseAddr(false);
            this.f67764H = new LinkedList();
            this.f67763F = new ArrayList(i);
            this.f67765L = new LinkedBlockingQueue();
            for (int i2 = 0; i2 < i; i2++) {
                this.f67763F.add(new C10389a());
            }
            return;
        }
        throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
    }

    public void broadcast(ByteBuffer byteBuffer, Collection<iii> collection) {
        if (byteBuffer != null && collection != null) {
            doBroadcast(byteBuffer, collection);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void broadcast(String str, Collection<iii> collection) {
        if (str != null && collection != null) {
            doBroadcast(str, collection);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void stop() throws InterruptedException, IOException {
        stop(0);
    }
}
