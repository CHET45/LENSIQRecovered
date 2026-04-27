package p000;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.da8;
import p000.fta;
import p000.fx2;
import p000.sj3;
import p000.w2f;
import p000.y5g;

/* JADX INFO: loaded from: classes7.dex */
public final class h3f extends u2f implements xa8<da8.C4693j> {

    /* JADX INFO: renamed from: A */
    public static final Logger f42181A = Logger.getLogger(h3f.class.getName());

    /* JADX INFO: renamed from: B */
    public static final x3f f42182B = new C6695d();

    /* JADX INFO: renamed from: c */
    public final gkb<? extends Executor> f42184c;

    /* JADX INFO: renamed from: d */
    public Executor f42185d;

    /* JADX INFO: renamed from: e */
    public final le7 f42186e;

    /* JADX INFO: renamed from: f */
    public final le7 f42187f;

    /* JADX INFO: renamed from: g */
    public final List<d4f> f42188g;

    /* JADX INFO: renamed from: h */
    public final j3f[] f42189h;

    /* JADX INFO: renamed from: i */
    public final long f42190i;

    /* JADX INFO: renamed from: j */
    @vc7("lock")
    public boolean f42191j;

    /* JADX INFO: renamed from: k */
    @vc7("lock")
    public boolean f42192k;

    /* JADX INFO: renamed from: l */
    @vc7("lock")
    public n4g f42193l;

    /* JADX INFO: renamed from: m */
    @vc7("lock")
    public boolean f42194m;

    /* JADX INFO: renamed from: n */
    @vc7("lock")
    public boolean f42195n;

    /* JADX INFO: renamed from: o */
    public final ob8 f42196o;

    /* JADX INFO: renamed from: q */
    @vc7("lock")
    public boolean f42198q;

    /* JADX INFO: renamed from: s */
    public final fx2 f42200s;

    /* JADX INFO: renamed from: t */
    public final bm3 f42201t;

    /* JADX INFO: renamed from: u */
    public final ho2 f42202u;

    /* JADX INFO: renamed from: v */
    public final d21 f42203v;

    /* JADX INFO: renamed from: w */
    public final da8 f42204w;

    /* JADX INFO: renamed from: x */
    public final vn1 f42205x;

    /* JADX INFO: renamed from: y */
    public final sj3.AbstractC12615c f42206y;

    /* JADX INFO: renamed from: z */
    public final x2f f42207z;

    /* JADX INFO: renamed from: p */
    public final Object f42197p = new Object();

    /* JADX INFO: renamed from: r */
    @vc7("lock")
    public final Set<c4f> f42199r = new HashSet();

    /* JADX INFO: renamed from: b */
    public final cb8 f42183b = cb8.allocate(go7.f40445C0, String.valueOf(getListenSocketsIgnoringLifecycle()));

    /* JADX INFO: renamed from: h3f$b */
    @gdi
    public static final class RunnableC6693b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final fx2.C6016e f42208a;

        /* JADX INFO: renamed from: b */
        public final Throwable f42209b;

        public RunnableC6693b(fx2.C6016e c6016e, Throwable th) {
            this.f42208a = c6016e;
            this.f42209b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f42208a.cancel(this.f42209b);
        }
    }

    /* JADX INFO: renamed from: h3f$c */
    @gdi
    public static final class C6694c implements x3f {

        /* JADX INFO: renamed from: a */
        public final Executor f42210a;

        /* JADX INFO: renamed from: b */
        public final Executor f42211b;

        /* JADX INFO: renamed from: c */
        public final fx2.C6016e f42212c;

        /* JADX INFO: renamed from: d */
        public final w3f f42213d;

        /* JADX INFO: renamed from: e */
        public final plg f42214e;

        /* JADX INFO: renamed from: f */
        public x3f f42215f;

        /* JADX INFO: renamed from: h3f$c$a */
        public final class a extends fy2 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ a79 f42216b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ n4g f42217c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a79 a79Var, n4g n4gVar) {
                super(C6694c.this.f42212c);
                this.f42216b = a79Var;
                this.f42217c = n4gVar;
            }

            @Override // p000.fy2
            public void runInContext() {
                nng nngVarTraceTask = tnc.traceTask("ServerCallListener(app).closed");
                try {
                    tnc.attachTag(C6694c.this.f42214e);
                    tnc.linkIn(this.f42216b);
                    C6694c.this.getListener().closed(this.f42217c);
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

        /* JADX INFO: renamed from: h3f$c$b */
        public final class b extends fy2 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ a79 f42219b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a79 a79Var) {
                super(C6694c.this.f42212c);
                this.f42219b = a79Var;
            }

            @Override // p000.fy2
            public void runInContext() {
                try {
                    nng nngVarTraceTask = tnc.traceTask("ServerCallListener(app).halfClosed");
                    try {
                        tnc.attachTag(C6694c.this.f42214e);
                        tnc.linkIn(this.f42219b);
                        C6694c.this.getListener().halfClosed();
                        if (nngVarTraceTask != null) {
                            nngVarTraceTask.close();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    C6694c.this.internalClose(th);
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: h3f$c$c */
        public final class c extends fy2 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ a79 f42221b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ y5g.InterfaceC15496a f42222c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a79 a79Var, y5g.InterfaceC15496a interfaceC15496a) {
                super(C6694c.this.f42212c);
                this.f42221b = a79Var;
                this.f42222c = interfaceC15496a;
            }

            @Override // p000.fy2
            public void runInContext() {
                try {
                    nng nngVarTraceTask = tnc.traceTask("ServerCallListener(app).messagesAvailable");
                    try {
                        tnc.attachTag(C6694c.this.f42214e);
                        tnc.linkIn(this.f42221b);
                        C6694c.this.getListener().messagesAvailable(this.f42222c);
                        if (nngVarTraceTask != null) {
                            nngVarTraceTask.close();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    C6694c.this.internalClose(th);
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: h3f$c$d */
        public final class d extends fy2 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ a79 f42224b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(a79 a79Var) {
                super(C6694c.this.f42212c);
                this.f42224b = a79Var;
            }

            @Override // p000.fy2
            public void runInContext() {
                try {
                    nng nngVarTraceTask = tnc.traceTask("ServerCallListener(app).onReady");
                    try {
                        tnc.attachTag(C6694c.this.f42214e);
                        tnc.linkIn(this.f42224b);
                        C6694c.this.getListener().onReady();
                        if (nngVarTraceTask != null) {
                            nngVarTraceTask.close();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    C6694c.this.internalClose(th);
                    throw th;
                }
            }
        }

        public C6694c(Executor executor, Executor executor2, w3f w3fVar, fx2.C6016e c6016e, plg plgVar) {
            this.f42210a = executor;
            this.f42211b = executor2;
            this.f42213d = w3fVar;
            this.f42212c = c6016e;
            this.f42214e = plgVar;
        }

        private void closedInternal(n4g n4gVar) {
            if (!n4gVar.isOk()) {
                Throwable cause = n4gVar.getCause();
                if (cause == null) {
                    cause = tb8.asRuntimeException(n4g.f63259f.withDescription("RPC cancelled"), null, false);
                }
                this.f42211b.execute(new RunnableC6693b(this.f42212c, cause));
            }
            this.f42210a.execute(new a(tnc.linkOut(), n4gVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public x3f getListener() {
            x3f x3fVar = this.f42215f;
            if (x3fVar != null) {
                return x3fVar;
            }
            throw new IllegalStateException("listener unset");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void internalClose(Throwable th) {
            this.f42213d.close(n4g.f63260g.withDescription("Application error processing RPC").withCause(th), new fta());
        }

        @Override // p000.x3f
        public void closed(n4g n4gVar) {
            nng nngVarTraceTask = tnc.traceTask("ServerStreamListener.closed");
            try {
                tnc.attachTag(this.f42214e);
                closedInternal(n4gVar);
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

        @gdi
        /* JADX INFO: renamed from: e */
        public void m12122e(x3f x3fVar) {
            v7d.checkNotNull(x3fVar, "listener must not be null");
            v7d.checkState(this.f42215f == null, "Listener already set");
            this.f42215f = x3fVar;
        }

        @Override // p000.x3f
        public void halfClosed() {
            nng nngVarTraceTask = tnc.traceTask("ServerStreamListener.halfClosed");
            try {
                tnc.attachTag(this.f42214e);
                this.f42210a.execute(new b(tnc.linkOut()));
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

        @Override // p000.y5g
        public void messagesAvailable(y5g.InterfaceC15496a interfaceC15496a) {
            nng nngVarTraceTask = tnc.traceTask("ServerStreamListener.messagesAvailable");
            try {
                tnc.attachTag(this.f42214e);
                this.f42210a.execute(new c(tnc.linkOut(), interfaceC15496a));
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

        @Override // p000.y5g
        public void onReady() {
            nng nngVarTraceTask = tnc.traceTask("ServerStreamListener.onReady");
            try {
                tnc.attachTag(this.f42214e);
                this.f42210a.execute(new d(tnc.linkOut()));
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

    /* JADX INFO: renamed from: h3f$d */
    public static final class C6695d implements x3f {
        private C6695d() {
        }

        @Override // p000.x3f
        public void closed(n4g n4gVar) {
        }

        @Override // p000.x3f
        public void halfClosed() {
        }

        @Override // p000.y5g
        public void messagesAvailable(y5g.InterfaceC15496a interfaceC15496a) {
            while (true) {
                InputStream next = interfaceC15496a.next();
                if (next == null) {
                    return;
                }
                try {
                    next.close();
                } catch (IOException e) {
                    while (true) {
                        InputStream next2 = interfaceC15496a.next();
                        if (next2 == null) {
                            throw new RuntimeException(e);
                        }
                        try {
                            next2.close();
                        } catch (IOException e2) {
                            h3f.f42181A.log(Level.WARNING, "Exception closing stream", (Throwable) e2);
                        }
                    }
                }
            }
        }

        @Override // p000.y5g
        public void onReady() {
        }
    }

    /* JADX INFO: renamed from: h3f$e */
    public final class C6696e implements l3f {
        private C6696e() {
        }

        @Override // p000.l3f
        public void serverShutdown() {
            synchronized (h3f.this.f42197p) {
                try {
                    if (h3f.this.f42194m) {
                        return;
                    }
                    ArrayList<c4f> arrayList = new ArrayList(h3f.this.f42199r);
                    n4g n4gVar = h3f.this.f42193l;
                    h3f.this.f42194m = true;
                    for (c4f c4fVar : arrayList) {
                        if (n4gVar == null) {
                            c4fVar.shutdown();
                        } else {
                            c4fVar.shutdownNow(n4gVar);
                        }
                    }
                    synchronized (h3f.this.f42197p) {
                        h3f.this.f42198q = true;
                        h3f.this.checkForTermination();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.l3f
        public e4f transportCreated(c4f c4fVar) {
            synchronized (h3f.this.f42197p) {
                h3f.this.f42199r.add(c4fVar);
            }
            C6697f c6697f = h3f.this.new C6697f(c4fVar);
            c6697f.init();
            return c6697f;
        }
    }

    /* JADX INFO: renamed from: h3f$f */
    public final class C6697f implements e4f {

        /* JADX INFO: renamed from: a */
        public final c4f f42227a;

        /* JADX INFO: renamed from: b */
        public Future<?> f42228b;

        /* JADX INFO: renamed from: c */
        public sc0 f42229c;

        /* JADX INFO: renamed from: h3f$f$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX INFO: renamed from: h3f$f$b */
        public final class b extends fy2 {

            /* JADX INFO: renamed from: C */
            public final /* synthetic */ w3f f42232C;

            /* JADX INFO: renamed from: F */
            public final /* synthetic */ C6694c f42233F;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ fx2.C6016e f42235b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ a79 f42236c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ plg f42237d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ y6f f42238e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ String f42239f;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ fta f42240m;

            /* JADX INFO: renamed from: h3f$f$b$a */
            public final class a implements fx2.InterfaceC6018g {
                public a() {
                }

                @Override // p000.fx2.InterfaceC6018g
                public void cancelled(fx2 fx2Var) {
                    n4g n4gVarStatusFromCancelled = ky2.statusFromCancelled(fx2Var);
                    if (n4g.f63262i.getCode().equals(n4gVarStatusFromCancelled.getCode())) {
                        b.this.f42232C.cancel(n4gVarStatusFromCancelled);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(fx2.C6016e c6016e, a79 a79Var, plg plgVar, y6f y6fVar, String str, fta ftaVar, w3f w3fVar, C6694c c6694c) {
                super(c6016e);
                this.f42235b = c6016e;
                this.f42236c = a79Var;
                this.f42237d = plgVar;
                this.f42238e = y6fVar;
                this.f42239f = str;
                this.f42240m = ftaVar;
                this.f42232C = w3fVar;
                this.f42233F = c6694c;
            }

            private void runInternal() {
                x3f x3fVar = h3f.f42182B;
                if (this.f42238e.isCancelled()) {
                    return;
                }
                try {
                    this.f42233F.m12122e(C6697f.this.startWrappedCall(this.f42239f, (e) w17.getDone(this.f42238e), this.f42240m));
                    this.f42235b.addListener(new a(), xya.directExecutor());
                } finally {
                }
            }

            @Override // p000.fy2
            public void runInContext() {
                nng nngVarTraceTask = tnc.traceTask("ServerTransportListener$HandleServerCall.startCall");
                try {
                    tnc.linkIn(this.f42236c);
                    tnc.attachTag(this.f42237d);
                    runInternal();
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

        /* JADX INFO: renamed from: h3f$f$c */
        public final class c extends fy2 {

            /* JADX INFO: renamed from: C */
            public final /* synthetic */ y6f f42242C;

            /* JADX INFO: renamed from: F */
            public final /* synthetic */ k4g f42243F;

            /* JADX INFO: renamed from: H */
            public final /* synthetic */ fta f42244H;

            /* JADX INFO: renamed from: L */
            public final /* synthetic */ Executor f42245L;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ fx2.C6016e f42247b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ plg f42248c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ a79 f42249d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ String f42250e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ w3f f42251f;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ C6694c f42252m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(fx2.C6016e c6016e, plg plgVar, a79 a79Var, String str, w3f w3fVar, C6694c c6694c, y6f y6fVar, k4g k4gVar, fta ftaVar, Executor executor) {
                super(c6016e);
                this.f42247b = c6016e;
                this.f42248c = plgVar;
                this.f42249d = a79Var;
                this.f42250e = str;
                this.f42251f = w3fVar;
                this.f42252m = c6694c;
                this.f42242C = y6fVar;
                this.f42243F = k4gVar;
                this.f42244H = ftaVar;
                this.f42245L = executor;
            }

            private <ReqT, RespT> e<ReqT, RespT> maySwitchExecutor(m3f<ReqT, RespT> m3fVar, w3f w3fVar, fta ftaVar, fx2.C6016e c6016e, plg plgVar) {
                Executor executor;
                z2f z2fVar = new z2f(w3fVar, m3fVar.getMethodDescriptor(), ftaVar, c6016e, h3f.this.f42201t, h3f.this.f42202u, h3f.this.f42205x, plgVar);
                if (h3f.this.f42207z != null && (executor = h3f.this.f42207z.getExecutor(z2fVar, ftaVar)) != null) {
                    ((t2f) this.f42245L).setExecutor(executor);
                }
                return C6697f.this.new e<>(z2fVar, m3fVar.getServerCallHandler());
            }

            private void runInternal() {
                try {
                    m3f<?, ?> m3fVarLookupMethod = h3f.this.f42186e.lookupMethod(this.f42250e);
                    if (m3fVarLookupMethod == null) {
                        m3fVarLookupMethod = h3f.this.f42187f.lookupMethod(this.f42250e, this.f42251f.getAuthority());
                    }
                    if (m3fVarLookupMethod != null) {
                        this.f42242C.set(maySwitchExecutor(C6697f.this.wrapMethod(this.f42251f, m3fVarLookupMethod, this.f42243F), this.f42251f, this.f42244H, this.f42247b, this.f42248c));
                        return;
                    }
                    n4g n4gVarWithDescription = n4g.f63271r.withDescription("Method not found: " + this.f42250e);
                    this.f42252m.m12122e(h3f.f42182B);
                    this.f42251f.close(n4gVarWithDescription, new fta());
                    this.f42247b.cancel(null);
                    this.f42242C.cancel(false);
                } catch (Throwable th) {
                    this.f42252m.m12122e(h3f.f42182B);
                    this.f42251f.close(n4g.fromThrowable(th), new fta());
                    this.f42247b.cancel(null);
                    this.f42242C.cancel(false);
                    throw th;
                }
            }

            @Override // p000.fy2
            public void runInContext() {
                nng nngVarTraceTask = tnc.traceTask("ServerTransportListener$MethodLookup.startCall");
                try {
                    tnc.attachTag(this.f42248c);
                    tnc.linkIn(this.f42249d);
                    runInternal();
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

        /* JADX INFO: renamed from: h3f$f$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C6697f.this.f42227a.shutdownNow(n4g.f63259f.withDescription("Handshake timeout exceeded"));
            }
        }

        /* JADX INFO: renamed from: h3f$f$e */
        public final class e<ReqT, RespT> {

            /* JADX INFO: renamed from: a */
            public z2f<ReqT, RespT> f42254a;

            /* JADX INFO: renamed from: b */
            public y2f<ReqT, RespT> f42255b;

            public e(z2f<ReqT, RespT> z2fVar, y2f<ReqT, RespT> y2fVar) {
                this.f42254a = z2fVar;
                this.f42255b = y2fVar;
            }
        }

        public C6697f(c4f c4fVar) {
            this.f42227a = c4fVar;
        }

        private fx2.C6016e createContext(fta ftaVar, k4g k4gVar) {
            Long l = (Long) ftaVar.get(oc7.f67135d);
            fx2 fx2VarWithValue = k4gVar.serverFilterContext(h3f.this.f42200s).withValue(pb8.f70216a, h3f.this);
            return l == null ? fx2VarWithValue.withCancellation() : fx2VarWithValue.withDeadline(sj3.after(l.longValue(), TimeUnit.NANOSECONDS, h3f.this.f42206y), this.f42227a.getScheduledExecutorService());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <WReqT, WRespT> x3f startWrappedCall(String str, e<WReqT, WRespT> eVar, fta ftaVar) {
            w2f.AbstractC14368a<WReqT> abstractC14368aStartCall = eVar.f42255b.startCall(eVar.f42254a, ftaVar);
            if (abstractC14368aStartCall != null) {
                return eVar.f42254a.m26531e(abstractC14368aStartCall);
            }
            throw new NullPointerException("startCall() returned a null listener for method " + str);
        }

        private void streamCreatedInternal(w3f w3fVar, String str, fta ftaVar, plg plgVar) {
            Executor t2fVar;
            if (h3f.this.f42207z == null && h3f.this.f42185d == xya.directExecutor()) {
                t2fVar = new h1f();
                w3fVar.optimizeForDirectExecutor();
            } else {
                t2fVar = new t2f(h3f.this.f42185d);
            }
            Executor executor = t2fVar;
            fta.AbstractC5971i<String> abstractC5971i = oc7.f67136e;
            if (ftaVar.containsKey(abstractC5971i)) {
                String str2 = (String) ftaVar.get(abstractC5971i);
                am3 am3VarLookupDecompressor = h3f.this.f42201t.lookupDecompressor(str2);
                if (am3VarLookupDecompressor == null) {
                    w3fVar.setListener(h3f.f42182B);
                    w3fVar.close(n4g.f63271r.withDescription(String.format("Can't find decompressor for %s", str2)), new fta());
                    return;
                }
                w3fVar.setDecompressor(am3VarLookupDecompressor);
            }
            k4g k4gVar = (k4g) v7d.checkNotNull(w3fVar.statsTraceContext(), "statsTraceCtx not present from stream");
            fx2.C6016e c6016eCreateContext = createContext(ftaVar, k4gVar);
            a79 a79VarLinkOut = tnc.linkOut();
            C6694c c6694c = new C6694c(executor, h3f.this.f42185d, w3fVar, c6016eCreateContext, plgVar);
            w3fVar.setListener(c6694c);
            y6f y6fVarCreate = y6f.create();
            executor.execute(new c(c6016eCreateContext, plgVar, a79VarLinkOut, str, w3fVar, c6694c, y6fVarCreate, k4gVar, ftaVar, executor));
            executor.execute(new b(c6016eCreateContext, a79VarLinkOut, plgVar, y6fVarCreate, str, ftaVar, w3fVar, c6694c));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <ReqT, RespT> m3f<?, ?> wrapMethod(w3f w3fVar, m3f<ReqT, RespT> m3fVar, k4g k4gVar) {
            k4gVar.serverCallStarted(new a3f(m3fVar.getMethodDescriptor(), w3fVar.getAttributes(), w3fVar.getAuthority()));
            y2f<ReqT, RespT> serverCallHandler = m3fVar.getServerCallHandler();
            for (j3f j3fVar : h3f.this.f42189h) {
                serverCallHandler = qb8.interceptCallHandlerCreate(j3fVar, serverCallHandler);
            }
            m3f<ReqT, RespT> m3fVarWithServerCallHandler = m3fVar.withServerCallHandler(serverCallHandler);
            return h3f.this.f42203v == null ? m3fVarWithServerCallHandler : h3f.this.f42203v.wrapMethodDefinition(m3fVarWithServerCallHandler);
        }

        public void init() {
            if (h3f.this.f42190i != Long.MAX_VALUE) {
                this.f42228b = this.f42227a.getScheduledExecutorService().schedule(new d(), h3f.this.f42190i, TimeUnit.MILLISECONDS);
            } else {
                this.f42228b = new FutureTask(new a(), null);
            }
            h3f.this.f42204w.addServerSocket(h3f.this, this.f42227a);
        }

        @Override // p000.e4f
        public void streamCreated(w3f w3fVar, String str, fta ftaVar) {
            plg plgVarCreateTag = tnc.createTag(str, w3fVar.streamId());
            nng nngVarTraceTask = tnc.traceTask("ServerTransportListener.streamCreated");
            try {
                tnc.attachTag(plgVarCreateTag);
                streamCreatedInternal(w3fVar, str, ftaVar, plgVarCreateTag);
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

        @Override // p000.e4f
        public sc0 transportReady(sc0 sc0Var) {
            this.f42228b.cancel(false);
            this.f42228b = null;
            for (d4f d4fVar : h3f.this.f42188g) {
                sc0Var = (sc0) v7d.checkNotNull(d4fVar.transportReady(sc0Var), "Filter %s returned null", d4fVar);
            }
            this.f42229c = sc0Var;
            return sc0Var;
        }

        @Override // p000.e4f
        public void transportTerminated() {
            Future<?> future = this.f42228b;
            if (future != null) {
                future.cancel(false);
                this.f42228b = null;
            }
            Iterator it = h3f.this.f42188g.iterator();
            while (it.hasNext()) {
                ((d4f) it.next()).transportTerminated(this.f42229c);
            }
            h3f.this.transportClosed(this.f42227a);
        }
    }

    public h3f(i3f i3fVar, ob8 ob8Var, fx2 fx2Var) {
        this.f42184c = (gkb) v7d.checkNotNull(i3fVar.f45611g, "executorPool");
        this.f42186e = (le7) v7d.checkNotNull(i3fVar.f45605a.m23899b(), "registryBuilder");
        this.f42187f = (le7) v7d.checkNotNull(i3fVar.f45610f, "fallbackRegistry");
        this.f42196o = (ob8) v7d.checkNotNull(ob8Var, "transportServer");
        this.f42200s = ((fx2) v7d.checkNotNull(fx2Var, "rootContext")).fork();
        this.f42201t = i3fVar.f45612h;
        this.f42202u = i3fVar.f45613i;
        this.f42188g = Collections.unmodifiableList(new ArrayList(i3fVar.f45606b));
        List<j3f> list = i3fVar.f45607c;
        this.f42189h = (j3f[]) list.toArray(new j3f[list.size()]);
        this.f42190i = i3fVar.f45614j;
        this.f42203v = i3fVar.f45621q;
        da8 da8Var = i3fVar.f45622r;
        this.f42204w = da8Var;
        this.f42205x = i3fVar.f45623s.create();
        this.f42206y = (sj3.AbstractC12615c) v7d.checkNotNull(i3fVar.f45615k, "ticker");
        da8Var.addServer(this);
        this.f42207z = i3fVar.f45624t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkForTermination() {
        synchronized (this.f42197p) {
            try {
                if (this.f42192k && this.f42199r.isEmpty() && this.f42198q) {
                    if (this.f42195n) {
                        throw new AssertionError("Server already terminated");
                    }
                    this.f42195n = true;
                    this.f42204w.removeServer(this);
                    Executor executor = this.f42185d;
                    if (executor != null) {
                        this.f42185d = this.f42184c.returnObject(executor);
                    }
                    this.f42197p.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private List<SocketAddress> getListenSocketsIgnoringLifecycle() {
        List<SocketAddress> listUnmodifiableList;
        synchronized (this.f42197p) {
            listUnmodifiableList = Collections.unmodifiableList(this.f42196o.getListenSocketAddresses());
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void transportClosed(c4f c4fVar) {
        synchronized (this.f42197p) {
            try {
                if (!this.f42199r.remove(c4fVar)) {
                    throw new AssertionError("Transport already removed");
                }
                this.f42204w.removeServerSocket(this, c4fVar);
                checkForTermination();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.u2f
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean z;
        synchronized (this.f42197p) {
            try {
                long jNanoTime = System.nanoTime() + timeUnit.toNanos(j);
                while (!this.f42195n) {
                    long jNanoTime2 = jNanoTime - System.nanoTime();
                    if (jNanoTime2 <= 0) {
                        break;
                    }
                    TimeUnit.NANOSECONDS.timedWait(this.f42197p, jNanoTime2);
                }
                z = this.f42195n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.u2f
    public List<p3f> getImmutableServices() {
        return this.f42186e.getServices();
    }

    @Override // p000.u2f
    public List<SocketAddress> getListenSockets() {
        List<SocketAddress> listenSocketsIgnoringLifecycle;
        synchronized (this.f42197p) {
            v7d.checkState(this.f42191j, "Not started");
            v7d.checkState(!this.f42195n, "Already terminated");
            listenSocketsIgnoringLifecycle = getListenSocketsIgnoringLifecycle();
        }
        return listenSocketsIgnoringLifecycle;
    }

    @Override // p000.ac8
    public cb8 getLogId() {
        return this.f42183b;
    }

    @Override // p000.u2f
    public List<p3f> getMutableServices() {
        return Collections.unmodifiableList(this.f42187f.getServices());
    }

    @Override // p000.u2f
    public int getPort() {
        synchronized (this.f42197p) {
            try {
                v7d.checkState(this.f42191j, "Not started");
                v7d.checkState(!this.f42195n, "Already terminated");
                for (SocketAddress socketAddress : this.f42196o.getListenSocketAddresses()) {
                    if (socketAddress instanceof InetSocketAddress) {
                        return ((InetSocketAddress) socketAddress).getPort();
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.u2f
    public List<p3f> getServices() {
        List<p3f> services = this.f42187f.getServices();
        if (services.isEmpty()) {
            return this.f42186e.getServices();
        }
        List<p3f> services2 = this.f42186e.getServices();
        ArrayList arrayList = new ArrayList(services2.size() + services.size());
        arrayList.addAll(services2);
        arrayList.addAll(services);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // p000.xa8
    public ja9<da8.C4693j> getStats() {
        da8.C4693j.a aVar = new da8.C4693j.a();
        List<xa8<da8.C4695l>> listenSocketStatsList = this.f42196o.getListenSocketStatsList();
        if (listenSocketStatsList != null) {
            aVar.addListenSockets(listenSocketStatsList);
        }
        this.f42205x.m24077b(aVar);
        y6f y6fVarCreate = y6f.create();
        y6fVarCreate.set(aVar.build());
        return y6fVarCreate;
    }

    @Override // p000.u2f
    public boolean isShutdown() {
        boolean z;
        synchronized (this.f42197p) {
            z = this.f42192k;
        }
        return z;
    }

    @Override // p000.u2f
    public boolean isTerminated() {
        boolean z;
        synchronized (this.f42197p) {
            z = this.f42195n;
        }
        return z;
    }

    public String toString() {
        return yya.toStringHelper(this).add("logId", this.f42183b.getId()).add("transportServer", this.f42196o).toString();
    }

    @Override // p000.u2f
    public h3f shutdown() {
        synchronized (this.f42197p) {
            try {
                if (this.f42192k) {
                    return this;
                }
                this.f42192k = true;
                boolean z = this.f42191j;
                if (!z) {
                    this.f42198q = true;
                    checkForTermination();
                }
                if (z) {
                    this.f42196o.shutdown();
                }
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.u2f
    public h3f shutdownNow() {
        shutdown();
        n4g n4gVarWithDescription = n4g.f63273t.withDescription("Server shutdownNow invoked");
        synchronized (this.f42197p) {
            try {
                if (this.f42193l != null) {
                    return this;
                }
                this.f42193l = n4gVarWithDescription;
                ArrayList arrayList = new ArrayList(this.f42199r);
                boolean z = this.f42194m;
                if (z) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((c4f) it.next()).shutdownNow(n4gVarWithDescription);
                    }
                }
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.u2f
    public h3f start() throws IOException {
        synchronized (this.f42197p) {
            v7d.checkState(!this.f42191j, "Already started");
            v7d.checkState(!this.f42192k, "Shutting down");
            this.f42196o.start(new C6696e());
            this.f42185d = (Executor) v7d.checkNotNull(this.f42184c.getObject(), "executor");
            this.f42191j = true;
        }
        return this;
    }

    @Override // p000.u2f
    public void awaitTermination() throws InterruptedException {
        synchronized (this.f42197p) {
            while (!this.f42195n) {
                try {
                    this.f42197p.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
