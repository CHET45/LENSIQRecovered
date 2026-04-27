package p000;

import java.io.IOException;
import java.net.Socket;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;
import p000.i75;

/* JADX INFO: loaded from: classes7.dex */
public final class la0 implements Sink {

    /* JADX INFO: renamed from: F */
    @eib
    public Sink f56940F;

    /* JADX INFO: renamed from: H */
    @eib
    public Socket f56941H;

    /* JADX INFO: renamed from: L */
    public boolean f56942L;

    /* JADX INFO: renamed from: M */
    public int f56943M;

    /* JADX INFO: renamed from: N */
    @vc7("lock")
    public int f56944N;

    /* JADX INFO: renamed from: c */
    public final t2f f56947c;

    /* JADX INFO: renamed from: d */
    public final i75.InterfaceC7171a f56948d;

    /* JADX INFO: renamed from: e */
    public final int f56949e;

    /* JADX INFO: renamed from: a */
    public final Object f56945a = new Object();

    /* JADX INFO: renamed from: b */
    public final Buffer f56946b = new Buffer();

    /* JADX INFO: renamed from: f */
    @vc7("lock")
    public boolean f56950f = false;

    /* JADX INFO: renamed from: m */
    @vc7("lock")
    public boolean f56951m = false;

    /* JADX INFO: renamed from: C */
    public boolean f56939C = false;

    /* JADX INFO: renamed from: la0$a */
    public class C8736a extends AbstractRunnableC8740e {

        /* JADX INFO: renamed from: b */
        public final a79 f56952b;

        public C8736a() {
            super(la0.this, null);
            this.f56952b = tnc.linkOut();
        }

        @Override // p000.la0.AbstractRunnableC8740e
        public void doRun() throws IOException {
            int i;
            Buffer buffer = new Buffer();
            nng nngVarTraceTask = tnc.traceTask("WriteRunnable.runWrite");
            try {
                tnc.linkIn(this.f56952b);
                synchronized (la0.this.f56945a) {
                    buffer.write(la0.this.f56946b, la0.this.f56946b.completeSegmentByteCount());
                    la0.this.f56950f = false;
                    i = la0.this.f56944N;
                }
                la0.this.f56940F.write(buffer, buffer.size());
                synchronized (la0.this.f56945a) {
                    la0.m16047e(la0.this, i);
                }
                if (nngVarTraceTask != null) {
                    nngVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (nngVarTraceTask != null) {
                    try {
                        nngVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: la0$b */
    public class C8737b extends AbstractRunnableC8740e {

        /* JADX INFO: renamed from: b */
        public final a79 f56954b;

        public C8737b() {
            super(la0.this, null);
            this.f56954b = tnc.linkOut();
        }

        @Override // p000.la0.AbstractRunnableC8740e
        public void doRun() throws IOException {
            Buffer buffer = new Buffer();
            nng nngVarTraceTask = tnc.traceTask("WriteRunnable.runFlush");
            try {
                tnc.linkIn(this.f56954b);
                synchronized (la0.this.f56945a) {
                    buffer.write(la0.this.f56946b, la0.this.f56946b.size());
                    la0.this.f56951m = false;
                }
                la0.this.f56940F.write(buffer, buffer.size());
                la0.this.f56940F.flush();
                if (nngVarTraceTask != null) {
                    nngVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (nngVarTraceTask != null) {
                    try {
                        nngVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: la0$c */
    public class RunnableC8738c implements Runnable {
        public RunnableC8738c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (la0.this.f56940F != null && la0.this.f56946b.size() > 0) {
                    la0.this.f56940F.write(la0.this.f56946b, la0.this.f56946b.size());
                }
            } catch (IOException e) {
                la0.this.f56948d.onException(e);
            }
            la0.this.f56946b.close();
            try {
                if (la0.this.f56940F != null) {
                    la0.this.f56940F.close();
                }
            } catch (IOException e2) {
                la0.this.f56948d.onException(e2);
            }
            try {
                if (la0.this.f56941H != null) {
                    la0.this.f56941H.close();
                }
            } catch (IOException e3) {
                la0.this.f56948d.onException(e3);
            }
        }
    }

    /* JADX INFO: renamed from: la0$d */
    public class C8739d extends xr6 {
        public C8739d(kv6 kv6Var) {
            super(kv6Var);
        }

        @Override // p000.xr6, p000.kv6
        public void ackSettings(b7f b7fVar) throws IOException {
            la0.m16052j(la0.this);
            super.ackSettings(b7fVar);
        }

        @Override // p000.xr6, p000.kv6
        public void ping(boolean z, int i, int i2) throws IOException {
            if (z) {
                la0.m16052j(la0.this);
            }
            super.ping(z, i, i2);
        }

        @Override // p000.xr6, p000.kv6
        public void rstStream(int i, w45 w45Var) throws IOException {
            la0.m16052j(la0.this);
            super.rstStream(i, w45Var);
        }
    }

    /* JADX INFO: renamed from: la0$e */
    public abstract class AbstractRunnableC8740e implements Runnable {
        private AbstractRunnableC8740e() {
        }

        public abstract void doRun() throws IOException;

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (la0.this.f56940F == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                doRun();
            } catch (Exception e) {
                la0.this.f56948d.onException(e);
            }
        }

        public /* synthetic */ AbstractRunnableC8740e(la0 la0Var, C8736a c8736a) {
            this();
        }
    }

    private la0(t2f t2fVar, i75.InterfaceC7171a interfaceC7171a, int i) {
        this.f56947c = (t2f) v7d.checkNotNull(t2fVar, "executor");
        this.f56948d = (i75.InterfaceC7171a) v7d.checkNotNull(interfaceC7171a, "exceptionHandler");
        this.f56949e = i;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m16047e(la0 la0Var, int i) {
        int i2 = la0Var.f56944N - i;
        la0Var.f56944N = i2;
        return i2;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m16052j(la0 la0Var) {
        int i = la0Var.f56943M;
        la0Var.f56943M = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: m */
    public static la0 m16053m(t2f t2fVar, i75.InterfaceC7171a interfaceC7171a, int i) {
        return new la0(t2fVar, interfaceC7171a, i);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f56939C) {
            return;
        }
        this.f56939C = true;
        this.f56947c.execute(new RunnableC8738c());
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (this.f56939C) {
            throw new IOException("closed");
        }
        nng nngVarTraceTask = tnc.traceTask("AsyncSink.flush");
        try {
            synchronized (this.f56945a) {
                if (this.f56951m) {
                    if (nngVarTraceTask != null) {
                        nngVarTraceTask.close();
                    }
                } else {
                    this.f56951m = true;
                    this.f56947c.execute(new C8737b());
                    if (nngVarTraceTask != null) {
                        nngVarTraceTask.close();
                    }
                }
            }
        } catch (Throwable th) {
            if (nngVarTraceTask != null) {
                try {
                    nngVarTraceTask.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m16054k(Sink sink, Socket socket) {
        v7d.checkState(this.f56940F == null, "AsyncSink's becomeConnected should only be called once.");
        this.f56940F = (Sink) v7d.checkNotNull(sink, "sink");
        this.f56941H = (Socket) v7d.checkNotNull(socket, "socket");
    }

    /* JADX INFO: renamed from: l */
    public kv6 m16055l(kv6 kv6Var) {
        return new C8739d(kv6Var);
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j) throws IOException {
        v7d.checkNotNull(buffer, "source");
        if (this.f56939C) {
            throw new IOException("closed");
        }
        nng nngVarTraceTask = tnc.traceTask("AsyncSink.write");
        try {
            synchronized (this.f56945a) {
                try {
                    this.f56946b.write(buffer, j);
                    int i = this.f56944N + this.f56943M;
                    this.f56944N = i;
                    boolean z = false;
                    this.f56943M = 0;
                    if (this.f56942L || i <= this.f56949e) {
                        if (!this.f56950f && !this.f56951m && this.f56946b.completeSegmentByteCount() > 0) {
                            this.f56950f = true;
                        }
                        if (nngVarTraceTask != null) {
                            nngVarTraceTask.close();
                            return;
                        }
                        return;
                    }
                    this.f56942L = true;
                    z = true;
                    if (!z) {
                        this.f56947c.execute(new C8736a());
                        if (nngVarTraceTask != null) {
                            nngVarTraceTask.close();
                            return;
                        }
                        return;
                    }
                    try {
                        this.f56941H.close();
                    } catch (IOException e) {
                        this.f56948d.onException(e);
                    }
                    if (nngVarTraceTask != null) {
                        nngVarTraceTask.close();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (nngVarTraceTask != null) {
                try {
                    nngVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
