package p000;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import okio.Timeout;
import p000.da8;
import p000.g0c;
import p000.gv6;
import p000.i0c;
import p000.i75;
import p000.i8c;
import p000.k0c;
import p000.n4g;
import p000.oc7;
import p000.p3e;
import p000.p42;
import p000.r42;
import p000.rhh;
import p000.rua;
import p000.so7;
import p000.vp8;
import p000.wr9;

/* JADX INFO: loaded from: classes7.dex */
public class j0c implements qr2, i75.InterfaceC7171a, i8c.InterfaceC7187d {

    /* JADX INFO: renamed from: W */
    public static final Map<w45, n4g> f49238W = buildErrorCodeToStatusMap();

    /* JADX INFO: renamed from: X */
    public static final Logger f49239X = Logger.getLogger(j0c.class.getName());

    /* JADX INFO: renamed from: A */
    public final SocketFactory f49240A;

    /* JADX INFO: renamed from: B */
    public SSLSocketFactory f49241B;

    /* JADX INFO: renamed from: C */
    public HostnameVerifier f49242C;

    /* JADX INFO: renamed from: D */
    public Socket f49243D;

    /* JADX INFO: renamed from: E */
    @vc7("lock")
    public int f49244E;

    /* JADX INFO: renamed from: F */
    @vc7("lock")
    public final Deque<i0c> f49245F;

    /* JADX INFO: renamed from: G */
    public final ls2 f49246G;

    /* JADX INFO: renamed from: H */
    public vp8 f49247H;

    /* JADX INFO: renamed from: I */
    public boolean f49248I;

    /* JADX INFO: renamed from: J */
    public long f49249J;

    /* JADX INFO: renamed from: K */
    public long f49250K;

    /* JADX INFO: renamed from: L */
    public boolean f49251L;

    /* JADX INFO: renamed from: M */
    public final Runnable f49252M;

    /* JADX INFO: renamed from: N */
    public final int f49253N;

    /* JADX INFO: renamed from: O */
    public final boolean f49254O;

    /* JADX INFO: renamed from: P */
    @vc7("lock")
    public final rhh f49255P;

    /* JADX INFO: renamed from: Q */
    @vc7("lock")
    public final cz7<i0c> f49256Q;

    /* JADX INFO: renamed from: R */
    @vc7("lock")
    public da8.C4689f f49257R;

    /* JADX INFO: renamed from: S */
    @gdi
    @eib
    public final an7 f49258S;

    /* JADX INFO: renamed from: T */
    @gdi
    public int f49259T;

    /* JADX INFO: renamed from: U */
    public Runnable f49260U;

    /* JADX INFO: renamed from: V */
    public y6f<Void> f49261V;

    /* JADX INFO: renamed from: a */
    public final InetSocketAddress f49262a;

    /* JADX INFO: renamed from: b */
    public final String f49263b;

    /* JADX INFO: renamed from: c */
    public final String f49264c;

    /* JADX INFO: renamed from: d */
    public final Random f49265d;

    /* JADX INFO: renamed from: e */
    public final lfg<d5g> f49266e;

    /* JADX INFO: renamed from: f */
    public final int f49267f;

    /* JADX INFO: renamed from: g */
    public final v2i f49268g;

    /* JADX INFO: renamed from: h */
    public wr9.InterfaceC14756a f49269h;

    /* JADX INFO: renamed from: i */
    @vc7("lock")
    public i75 f49270i;

    /* JADX INFO: renamed from: j */
    public i8c f49271j;

    /* JADX INFO: renamed from: k */
    public final Object f49272k;

    /* JADX INFO: renamed from: l */
    public final cb8 f49273l;

    /* JADX INFO: renamed from: m */
    @vc7("lock")
    public int f49274m;

    /* JADX INFO: renamed from: n */
    @vc7("lock")
    public final Map<Integer, i0c> f49275n;

    /* JADX INFO: renamed from: o */
    public final Executor f49276o;

    /* JADX INFO: renamed from: p */
    public final t2f f49277p;

    /* JADX INFO: renamed from: q */
    public final ScheduledExecutorService f49278q;

    /* JADX INFO: renamed from: r */
    public final int f49279r;

    /* JADX INFO: renamed from: s */
    public int f49280s;

    /* JADX INFO: renamed from: t */
    public RunnableC7712e f49281t;

    /* JADX INFO: renamed from: u */
    public sc0 f49282u;

    /* JADX INFO: renamed from: v */
    @vc7("lock")
    public n4g f49283v;

    /* JADX INFO: renamed from: w */
    @vc7("lock")
    public boolean f49284w;

    /* JADX INFO: renamed from: x */
    @vc7("lock")
    public wm7 f49285x;

    /* JADX INFO: renamed from: y */
    @vc7("lock")
    public boolean f49286y;

    /* JADX INFO: renamed from: z */
    @vc7("lock")
    public boolean f49287z;

    /* JADX INFO: renamed from: j0c$a */
    public class C7708a extends cz7<i0c> {
        public C7708a() {
        }

        @Override // p000.cz7
        /* JADX INFO: renamed from: a */
        public void mo8796a() {
            j0c.this.f49269h.transportInUse(true);
        }

        @Override // p000.cz7
        /* JADX INFO: renamed from: b */
        public void mo8797b() {
            j0c.this.f49269h.transportInUse(false);
        }
    }

    /* JADX INFO: renamed from: j0c$b */
    public class C7709b implements rhh.InterfaceC12099c {
        public C7709b() {
        }

        @Override // p000.rhh.InterfaceC12099c
        public rhh.C12100d read() {
            rhh.C12100d c12100d;
            synchronized (j0c.this.f49272k) {
                c12100d = new rhh.C12100d(j0c.this.f49271j == null ? -1L : j0c.this.f49271j.windowUpdate(null, 0), (long) (j0c.this.f49267f * 0.5f));
            }
            return c12100d;
        }
    }

    /* JADX INFO: renamed from: j0c$c */
    public class RunnableC7710c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CountDownLatch f49290a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ la0 f49291b;

        /* JADX INFO: renamed from: j0c$c$a */
        public class a implements Source {
            public a() {
            }

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // okio.Source
            public long read(Buffer buffer, long j) {
                return -1L;
            }

            @Override // okio.Source
            public Timeout timeout() {
                return Timeout.NONE;
            }
        }

        public RunnableC7710c(CountDownLatch countDownLatch, la0 la0Var) {
            this.f49290a = countDownLatch;
            this.f49291b = la0Var;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            j0c j0cVar;
            RunnableC7712e runnableC7712e;
            Socket socketCreateHttpProxySocket;
            SSLSession session;
            Socket socket;
            try {
                this.f49290a.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            BufferedSource bufferedSourceBuffer = Okio.buffer(new a());
            try {
                try {
                    j0c j0cVar2 = j0c.this;
                    an7 an7Var = j0cVar2.f49258S;
                    if (an7Var == null) {
                        socketCreateHttpProxySocket = j0cVar2.f49240A.createSocket(j0c.this.f49262a.getAddress(), j0c.this.f49262a.getPort());
                    } else {
                        if (!(an7Var.getProxyAddress() instanceof InetSocketAddress)) {
                            throw n4g.f63272s.withDescription("Unsupported SocketAddress implementation " + j0c.this.f49258S.getProxyAddress().getClass()).asException();
                        }
                        j0c j0cVar3 = j0c.this;
                        socketCreateHttpProxySocket = j0cVar3.createHttpProxySocket(j0cVar3.f49258S.getTargetAddress(), (InetSocketAddress) j0c.this.f49258S.getProxyAddress(), j0c.this.f49258S.getUsername(), j0c.this.f49258S.getPassword());
                    }
                    Socket socket2 = socketCreateHttpProxySocket;
                    if (j0c.this.f49241B != null) {
                        SSLSocket sSLSocketUpgrade = f1c.upgrade(j0c.this.f49241B, j0c.this.f49242C, socket2, j0c.this.m13658L(), j0c.this.m13659M(), j0c.this.f49246G);
                        session = sSLSocketUpgrade.getSession();
                        socket = sSLSocketUpgrade;
                    } else {
                        session = null;
                        socket = socket2;
                    }
                    socket.setTcpNoDelay(true);
                    BufferedSource bufferedSourceBuffer2 = Okio.buffer(Okio.source(socket));
                    this.f49291b.m16054k(Okio.sink(socket), socket);
                    j0c j0cVar4 = j0c.this;
                    j0cVar4.f49282u = j0cVar4.f49282u.toBuilder().set(cc7.f16232a, socket.getRemoteSocketAddress()).set(cc7.f16233b, socket.getLocalSocketAddress()).set(cc7.f16234c, session).set(dc7.f29283a, session == null ? eue.NONE : eue.PRIVACY_AND_INTEGRITY).build();
                    j0c j0cVar5 = j0c.this;
                    j0cVar5.f49281t = j0cVar5.new RunnableC7712e(j0cVar5.f49268g.newReader(bufferedSourceBuffer2, true));
                    synchronized (j0c.this.f49272k) {
                        try {
                            j0c.this.f49243D = (Socket) v7d.checkNotNull(socket, "socket");
                            if (session != null) {
                                j0c.this.f49257R = new da8.C4689f(new da8.C4697n(session));
                            }
                        } finally {
                        }
                    }
                } catch (q4g e) {
                    j0c.this.startGoAway(0, w45.INTERNAL_ERROR, e.getStatus());
                    j0cVar = j0c.this;
                    runnableC7712e = j0cVar.new RunnableC7712e(j0cVar.f49268g.newReader(bufferedSourceBuffer, true));
                    j0cVar.f49281t = runnableC7712e;
                } catch (Exception e2) {
                    j0c.this.onException(e2);
                    j0cVar = j0c.this;
                    runnableC7712e = j0cVar.new RunnableC7712e(j0cVar.f49268g.newReader(bufferedSourceBuffer, true));
                    j0cVar.f49281t = runnableC7712e;
                }
            } catch (Throwable th) {
                j0c j0cVar6 = j0c.this;
                j0cVar6.f49281t = j0cVar6.new RunnableC7712e(j0cVar6.f49268g.newReader(bufferedSourceBuffer, true));
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j0c$d */
    public class RunnableC7711d implements Runnable {
        public RunnableC7711d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = j0c.this.f49260U;
            if (runnable != null) {
                runnable.run();
            }
            j0c.this.f49276o.execute(j0c.this.f49281t);
            synchronized (j0c.this.f49272k) {
                j0c.this.f49244E = Integer.MAX_VALUE;
                j0c.this.startPendingStreams();
            }
            y6f<Void> y6fVar = j0c.this.f49261V;
            if (y6fVar != null) {
                y6fVar.set(null);
            }
        }
    }

    /* JADX INFO: renamed from: j0c$e */
    public class RunnableC7712e implements gv6.InterfaceC6593a, Runnable {

        /* JADX INFO: renamed from: b */
        public gv6 f49296b;

        /* JADX INFO: renamed from: a */
        public final k0c f49295a = new k0c(Level.FINE, (Class<?>) j0c.class);

        /* JADX INFO: renamed from: c */
        public boolean f49297c = true;

        public RunnableC7712e(gv6 gv6Var) {
            this.f49296b = gv6Var;
        }

        private int headerBlockSize(List<ei7> list) {
            long size = 0;
            for (int i = 0; i < list.size(); i++) {
                ei7 ei7Var = list.get(i);
                size += (long) (ei7Var.f33074a.size() + 32 + ei7Var.f33075b.size());
            }
            return (int) Math.min(size, 2147483647L);
        }

        @Override // p000.gv6.InterfaceC6593a
        public void ackSettings() {
        }

        @Override // p000.gv6.InterfaceC6593a
        public void alternateService(int i, String str, ByteString byteString, String str2, int i2, long j) {
        }

        @Override // p000.gv6.InterfaceC6593a
        public void data(boolean z, int i, BufferedSource bufferedSource, int i2, int i3) throws IOException {
            this.f49295a.m14427a(k0c.EnumC8155a.INBOUND, i, bufferedSource.getBuffer(), i2, z);
            i0c i0cVarM13662P = j0c.this.m13662P(i);
            if (i0cVarM13662P != null) {
                long j = i2;
                bufferedSource.require(j);
                Buffer buffer = new Buffer();
                buffer.write(bufferedSource.getBuffer(), j);
                tnc.event("OkHttpClientTransport$ClientFrameHandler.data", i0cVarM13662P.mo11340d().m12703F());
                synchronized (j0c.this.f49272k) {
                    i0cVarM13662P.mo11340d().transportDataReceived(buffer, z, i3 - i2);
                }
            } else {
                if (!j0c.this.m13664R(i)) {
                    j0c.this.onError(w45.PROTOCOL_ERROR, "Received data for unknown stream: " + i);
                    return;
                }
                synchronized (j0c.this.f49272k) {
                    j0c.this.f49270i.rstStream(i, w45.STREAM_CLOSED);
                }
                bufferedSource.skip(i2);
            }
            j0c.m13650v(j0c.this, i3);
            if (j0c.this.f49280s >= j0c.this.f49267f * 0.5f) {
                synchronized (j0c.this.f49272k) {
                    j0c.this.f49270i.windowUpdate(0, j0c.this.f49280s);
                }
                j0c.this.f49280s = 0;
            }
        }

        @Override // p000.gv6.InterfaceC6593a
        public void goAway(int i, w45 w45Var, ByteString byteString) {
            this.f49295a.m14428b(k0c.EnumC8155a.INBOUND, i, w45Var, byteString);
            if (w45Var == w45.ENHANCE_YOUR_CALM) {
                String strUtf8 = byteString.utf8();
                j0c.f49239X.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strUtf8));
                if ("too_many_pings".equals(strUtf8)) {
                    j0c.this.f49252M.run();
                }
            }
            n4g n4gVarAugmentDescription = oc7.EnumC10306j.statusForCode(w45Var.f93214a).augmentDescription("Received Goaway");
            if (byteString.size() > 0) {
                n4gVarAugmentDescription = n4gVarAugmentDescription.augmentDescription(byteString.utf8());
            }
            j0c.this.startGoAway(i, null, n4gVarAugmentDescription);
        }

        @Override // p000.gv6.InterfaceC6593a
        public void headers(boolean z, boolean z2, int i, int i2, List<ei7> list, li7 li7Var) {
            n4g n4gVarWithDescription;
            boolean z3;
            int iHeaderBlockSize;
            this.f49295a.m14429c(k0c.EnumC8155a.INBOUND, i, list, z2);
            if (j0c.this.f49253N == Integer.MAX_VALUE || (iHeaderBlockSize = headerBlockSize(list)) <= j0c.this.f49253N) {
                n4gVarWithDescription = null;
            } else {
                n4gVarWithDescription = n4g.f63267n.withDescription(String.format(Locale.US, "Response %s metadata larger than %d: %d", z2 ? "trailer" : "header", Integer.valueOf(j0c.this.f49253N), Integer.valueOf(iHeaderBlockSize)));
            }
            synchronized (j0c.this.f49272k) {
                try {
                    i0c i0cVar = (i0c) j0c.this.f49275n.get(Integer.valueOf(i));
                    z3 = false;
                    if (i0cVar == null) {
                        if (j0c.this.m13664R(i)) {
                            j0c.this.f49270i.rstStream(i, w45.STREAM_CLOSED);
                        } else {
                            z3 = true;
                        }
                    } else if (n4gVarWithDescription == null) {
                        tnc.event("OkHttpClientTransport$ClientFrameHandler.headers", i0cVar.mo11340d().m12703F());
                        i0cVar.mo11340d().transportHeadersReceived(list, z2);
                    } else {
                        if (!z2) {
                            j0c.this.f49270i.rstStream(i, w45.CANCEL);
                        }
                        i0cVar.mo11340d().transportReportStatus(n4gVarWithDescription, false, new fta());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z3) {
                j0c.this.onError(w45.PROTOCOL_ERROR, "Received header for unknown stream: " + i);
            }
        }

        @Override // p000.gv6.InterfaceC6593a
        public void ping(boolean z, int i, int i2) {
            wm7 wm7Var;
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            this.f49295a.m14430d(k0c.EnumC8155a.INBOUND, j);
            if (!z) {
                synchronized (j0c.this.f49272k) {
                    j0c.this.f49270i.ping(true, i, i2);
                }
                return;
            }
            synchronized (j0c.this.f49272k) {
                try {
                    wm7Var = null;
                    if (j0c.this.f49285x == null) {
                        j0c.f49239X.warning("Received unexpected ping ack. No ping outstanding");
                    } else if (j0c.this.f49285x.payload() == j) {
                        wm7 wm7Var2 = j0c.this.f49285x;
                        j0c.this.f49285x = null;
                        wm7Var = wm7Var2;
                    } else {
                        j0c.f49239X.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(j0c.this.f49285x.payload()), Long.valueOf(j)));
                    }
                } finally {
                }
            }
            if (wm7Var != null) {
                wm7Var.complete();
            }
        }

        @Override // p000.gv6.InterfaceC6593a
        public void priority(int i, int i2, int i3, boolean z) {
        }

        @Override // p000.gv6.InterfaceC6593a
        public void pushPromise(int i, int i2, List<ei7> list) throws IOException {
            this.f49295a.m14432f(k0c.EnumC8155a.INBOUND, i, i2, list);
            synchronized (j0c.this.f49272k) {
                j0c.this.f49270i.rstStream(i, w45.PROTOCOL_ERROR);
            }
        }

        @Override // p000.gv6.InterfaceC6593a
        public void rstStream(int i, w45 w45Var) {
            this.f49295a.m14433g(k0c.EnumC8155a.INBOUND, i, w45Var);
            n4g n4gVarAugmentDescription = j0c.m13628V(w45Var).augmentDescription("Rst Stream");
            boolean z = n4gVarAugmentDescription.getCode() == n4g.EnumC9694b.CANCELLED || n4gVarAugmentDescription.getCode() == n4g.EnumC9694b.DEADLINE_EXCEEDED;
            synchronized (j0c.this.f49272k) {
                try {
                    i0c i0cVar = (i0c) j0c.this.f49275n.get(Integer.valueOf(i));
                    if (i0cVar != null) {
                        tnc.event("OkHttpClientTransport$ClientFrameHandler.rstStream", i0cVar.mo11340d().m12703F());
                        j0c.this.m13656J(i, n4gVarAugmentDescription, w45Var == w45.REFUSED_STREAM ? p42.EnumC10788a.REFUSED : p42.EnumC10788a.PROCESSED, z, null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            n4g n4gVarWithDescription;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f49296b.nextFrame(this)) {
                try {
                    if (j0c.this.f49247H != null) {
                        j0c.this.f49247H.onDataReceived();
                    }
                } catch (Throwable th) {
                    try {
                        j0c.this.startGoAway(0, w45.PROTOCOL_ERROR, n4g.f63272s.withDescription("error in frame handler").withCause(th));
                        try {
                            this.f49296b.close();
                        } catch (IOException e) {
                            e = e;
                            j0c.f49239X.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                        } catch (RuntimeException e2) {
                            if (!"bio == null".equals(e2.getMessage())) {
                                throw e2;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            this.f49296b.close();
                        } catch (IOException e3) {
                            j0c.f49239X.log(Level.INFO, "Exception closing frame reader", (Throwable) e3);
                        } catch (RuntimeException e4) {
                            if (!"bio == null".equals(e4.getMessage())) {
                                throw e4;
                            }
                        }
                        j0c.this.f49269h.transportTerminated();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            synchronized (j0c.this.f49272k) {
                n4gVarWithDescription = j0c.this.f49283v;
            }
            if (n4gVarWithDescription == null) {
                n4gVarWithDescription = n4g.f63273t.withDescription("End of stream or IOException");
            }
            j0c.this.startGoAway(0, w45.INTERNAL_ERROR, n4gVarWithDescription);
            try {
                this.f49296b.close();
            } catch (IOException e5) {
                e = e5;
                j0c.f49239X.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
            } catch (RuntimeException e6) {
                if (!"bio == null".equals(e6.getMessage())) {
                    throw e6;
                }
            }
            j0c.this.f49269h.transportTerminated();
            Thread.currentThread().setName(name);
        }

        @Override // p000.gv6.InterfaceC6593a
        public void settings(boolean z, b7f b7fVar) {
            boolean zInitialOutboundWindowSize;
            this.f49295a.m14434h(k0c.EnumC8155a.INBOUND, b7fVar);
            synchronized (j0c.this.f49272k) {
                try {
                    if (e1c.isSet(b7fVar, 4)) {
                        j0c.this.f49244E = e1c.get(b7fVar, 4);
                    }
                    if (e1c.isSet(b7fVar, 7)) {
                        zInitialOutboundWindowSize = j0c.this.f49271j.initialOutboundWindowSize(e1c.get(b7fVar, 7));
                    } else {
                        zInitialOutboundWindowSize = false;
                    }
                    if (this.f49297c) {
                        j0c j0cVar = j0c.this;
                        j0cVar.f49282u = j0cVar.f49269h.filterTransport(j0c.this.f49282u);
                        j0c.this.f49269h.transportReady();
                        this.f49297c = false;
                    }
                    j0c.this.f49270i.ackSettings(b7fVar);
                    if (zInitialOutboundWindowSize) {
                        j0c.this.f49271j.writeStreams();
                    }
                    j0c.this.startPendingStreams();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        @Override // p000.gv6.InterfaceC6593a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void windowUpdate(int r8, long r9) {
            /*
                r7 = this;
                k0c r0 = r7.f49295a
                k0c$a r1 = p000.k0c.EnumC8155a.INBOUND
                r0.m14436j(r1, r8, r9)
                r0 = 0
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 != 0) goto L2c
                java.lang.String r9 = "Received 0 flow control window increment."
                if (r8 != 0) goto L19
                j0c r8 = p000.j0c.this
                w45 r10 = p000.w45.PROTOCOL_ERROR
                p000.j0c.m13647s(r8, r10, r9)
                goto L2b
            L19:
                j0c r0 = p000.j0c.this
                n4g r10 = p000.n4g.f63272s
                n4g r2 = r10.withDescription(r9)
                p42$a r3 = p000.p42.EnumC10788a.PROCESSED
                w45 r5 = p000.w45.PROTOCOL_ERROR
                r6 = 0
                r4 = 0
                r1 = r8
                r0.m13656J(r1, r2, r3, r4, r5, r6)
            L2b:
                return
            L2c:
                j0c r0 = p000.j0c.this
                java.lang.Object r0 = p000.j0c.m13630b(r0)
                monitor-enter(r0)
                if (r8 != 0) goto L44
                j0c r8 = p000.j0c.this     // Catch: java.lang.Throwable -> L42
                i8c r8 = p000.j0c.m13643o(r8)     // Catch: java.lang.Throwable -> L42
                r1 = 0
                int r9 = (int) r9     // Catch: java.lang.Throwable -> L42
                r8.windowUpdate(r1, r9)     // Catch: java.lang.Throwable -> L42
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                return
            L42:
                r8 = move-exception
                goto L90
            L44:
                j0c r1 = p000.j0c.this     // Catch: java.lang.Throwable -> L42
                java.util.Map r1 = p000.j0c.m13652x(r1)     // Catch: java.lang.Throwable -> L42
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L42
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L42
                i0c r1 = (p000.i0c) r1     // Catch: java.lang.Throwable -> L42
                if (r1 == 0) goto L69
                j0c r2 = p000.j0c.this     // Catch: java.lang.Throwable -> L42
                i8c r2 = p000.j0c.m13643o(r2)     // Catch: java.lang.Throwable -> L42
                i0c$b r1 = r1.mo11340d()     // Catch: java.lang.Throwable -> L42
                i8c$c r1 = r1.getOutboundFlowState()     // Catch: java.lang.Throwable -> L42
                int r9 = (int) r9     // Catch: java.lang.Throwable -> L42
                r2.windowUpdate(r1, r9)     // Catch: java.lang.Throwable -> L42
                goto L73
            L69:
                j0c r9 = p000.j0c.this     // Catch: java.lang.Throwable -> L42
                boolean r9 = r9.m13664R(r8)     // Catch: java.lang.Throwable -> L42
                if (r9 != 0) goto L73
                r9 = 1
                goto L74
            L73:
                r9 = 0
            L74:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                if (r9 == 0) goto L8f
                j0c r9 = p000.j0c.this
                w45 r10 = p000.w45.PROTOCOL_ERROR
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Received window_update for unknown stream: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                p000.j0c.m13647s(r9, r10, r8)
            L8f:
                return
            L90:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.j0c.RunnableC7712e.windowUpdate(int, long):void");
        }
    }

    public j0c(g0c.C6074f c6074f, InetSocketAddress inetSocketAddress, String str, @eib String str2, sc0 sc0Var, @eib an7 an7Var, Runnable runnable) {
        this(c6074f, inetSocketAddress, str, str2, sc0Var, oc7.f67131M, new um7(), an7Var, runnable);
    }

    @gdi
    /* JADX INFO: renamed from: V */
    public static n4g m13628V(w45 w45Var) {
        n4g n4gVar = f49238W.get(w45Var);
        if (n4gVar != null) {
            return n4gVar;
        }
        return n4g.f63260g.withDescription("Unknown http2 error code: " + w45Var.f93214a);
    }

    private static Map<w45, n4g> buildErrorCodeToStatusMap() {
        EnumMap enumMap = new EnumMap(w45.class);
        w45 w45Var = w45.NO_ERROR;
        n4g n4gVar = n4g.f63272s;
        enumMap.put(w45Var, n4gVar.withDescription("No error: A GRPC status of OK should have been sent"));
        enumMap.put(w45.PROTOCOL_ERROR, n4gVar.withDescription("Protocol error"));
        enumMap.put(w45.INTERNAL_ERROR, n4gVar.withDescription("Internal error"));
        enumMap.put(w45.FLOW_CONTROL_ERROR, n4gVar.withDescription("Flow control error"));
        enumMap.put(w45.STREAM_CLOSED, n4gVar.withDescription("Stream closed"));
        enumMap.put(w45.FRAME_TOO_LARGE, n4gVar.withDescription("Frame too large"));
        enumMap.put(w45.REFUSED_STREAM, n4g.f63273t.withDescription("Refused stream"));
        enumMap.put(w45.CANCEL, n4g.f63259f.withDescription("Cancelled"));
        enumMap.put(w45.COMPRESSION_ERROR, n4gVar.withDescription("Compression error"));
        enumMap.put(w45.CONNECT_ERROR, n4gVar.withDescription("Connect error"));
        enumMap.put(w45.ENHANCE_YOUR_CALM, n4g.f63267n.withDescription("Enhance your calm"));
        enumMap.put(w45.INADEQUATE_SECURITY, n4g.f63265l.withDescription("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    private p3e createHttpProxyRequest(InetSocketAddress inetSocketAddress, String str, String str2) {
        so7 so7VarBuild = new so7.C12718b().scheme("https").host(inetSocketAddress.getHostName()).port(inetSocketAddress.getPort()).build();
        p3e.C10783b c10783bHeader = new p3e.C10783b().url(so7VarBuild).header(go7.f40586w, so7VarBuild.host() + g1i.f38277c + so7VarBuild.port()).header("User-Agent", this.f49264c);
        if (str != null && str2 != null) {
            c10783bHeader.header(go7.f40459H, s83.basic(str, str2));
        }
        return c10783bHeader.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Socket createHttpProxySocket(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws q4g {
        Socket socketCreateSocket = null;
        try {
            socketCreateSocket = inetSocketAddress2.getAddress() != null ? this.f49240A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.f49240A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            socketCreateSocket.setTcpNoDelay(true);
            socketCreateSocket.setSoTimeout(this.f49259T);
            Source source = Okio.source(socketCreateSocket);
            BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(socketCreateSocket));
            p3e p3eVarCreateHttpProxyRequest = createHttpProxyRequest(inetSocketAddress, str, str2);
            so7 so7VarHttpUrl = p3eVarCreateHttpProxyRequest.httpUrl();
            bufferedSinkBuffer.writeUtf8(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", so7VarHttpUrl.host(), Integer.valueOf(so7VarHttpUrl.port()))).writeUtf8("\r\n");
            int size = p3eVarCreateHttpProxyRequest.headers().size();
            for (int i = 0; i < size; i++) {
                bufferedSinkBuffer.writeUtf8(p3eVarCreateHttpProxyRequest.headers().name(i)).writeUtf8(": ").writeUtf8(p3eVarCreateHttpProxyRequest.headers().value(i)).writeUtf8("\r\n");
            }
            bufferedSinkBuffer.writeUtf8("\r\n");
            bufferedSinkBuffer.flush();
            r4g r4gVar = r4g.parse(readUtf8LineStrictUnbuffered(source));
            while (!readUtf8LineStrictUnbuffered(source).equals("")) {
            }
            int i2 = r4gVar.f77031b;
            if (i2 >= 200 && i2 < 300) {
                socketCreateSocket.setSoTimeout(0);
                return socketCreateSocket;
            }
            Buffer buffer = new Buffer();
            try {
                socketCreateSocket.shutdownOutput();
                source.read(buffer, 1024L);
            } catch (IOException e) {
                buffer.writeUtf8("Unable to read body: " + e.toString());
            }
            try {
                socketCreateSocket.close();
            } catch (IOException unused) {
            }
            throw n4g.f63273t.withDescription(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(r4gVar.f77031b), r4gVar.f77032c, buffer.readUtf8())).asException();
        } catch (IOException e2) {
            if (socketCreateSocket != null) {
                oc7.closeQuietly(socketCreateSocket);
            }
            throw n4g.f63273t.withDescription("Failed trying to connect with proxy").withCause(e2).asException();
        }
    }

    private Throwable getPingFailure() {
        synchronized (this.f49272k) {
            try {
                n4g n4gVar = this.f49283v;
                if (n4gVar != null) {
                    return n4gVar.asException();
                }
                return n4g.f63273t.withDescription("Connection closed").asException();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void initTransportTracer() {
        synchronized (this.f49272k) {
            this.f49255P.setFlowControlWindowReader(new C7709b());
        }
    }

    @vc7("lock")
    private void maybeClearInUse(i0c i0cVar) {
        if (this.f49287z && this.f49245F.isEmpty() && this.f49275n.isEmpty()) {
            this.f49287z = false;
            vp8 vp8Var = this.f49247H;
            if (vp8Var != null) {
                vp8Var.onTransportIdle();
            }
        }
        if (i0cVar.shouldBeCountedForInUse()) {
            this.f49256Q.updateObjectInUse(i0cVar, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(w45 w45Var, String str) {
        startGoAway(0, w45Var, m13628V(w45Var).augmentDescription(str));
    }

    private static String readUtf8LineStrictUnbuffered(Source source) throws IOException {
        Buffer buffer = new Buffer();
        while (source.read(buffer, 1L) != -1) {
            if (buffer.getByte(buffer.size() - 1) == 10) {
                return buffer.readUtf8LineStrict();
            }
        }
        throw new EOFException("\\n not found: " + buffer.readByteString().hex());
    }

    private void sendConnectionPrefaceAndSettings() {
        synchronized (this.f49272k) {
            try {
                this.f49270i.connectionPreface();
                b7f b7fVar = new b7f();
                e1c.set(b7fVar, 7, this.f49267f);
                this.f49270i.settings(b7fVar);
                if (this.f49267f > 65535) {
                    this.f49270i.windowUpdate(0, r1 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @vc7("lock")
    private void setInUse(i0c i0cVar) {
        if (!this.f49287z) {
            this.f49287z = true;
            vp8 vp8Var = this.f49247H;
            if (vp8Var != null) {
                vp8Var.onTransportActive();
            }
        }
        if (i0cVar.shouldBeCountedForInUse()) {
            this.f49256Q.updateObjectInUse(i0cVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startGoAway(int i, w45 w45Var, n4g n4gVar) {
        synchronized (this.f49272k) {
            try {
                if (this.f49283v == null) {
                    this.f49283v = n4gVar;
                    this.f49269h.transportShutdown(n4gVar);
                }
                if (w45Var != null && !this.f49284w) {
                    this.f49284w = true;
                    this.f49270i.goAway(0, w45Var, new byte[0]);
                }
                Iterator<Map.Entry<Integer, i0c>> it = this.f49275n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, i0c> next = it.next();
                    if (next.getKey().intValue() > i) {
                        it.remove();
                        next.getValue().mo11340d().transportReportStatus(n4gVar, p42.EnumC10788a.REFUSED, false, new fta());
                        maybeClearInUse(next.getValue());
                    }
                }
                for (i0c i0cVar : this.f49245F) {
                    i0cVar.mo11340d().transportReportStatus(n4gVar, p42.EnumC10788a.MISCARRIED, true, new fta());
                    maybeClearInUse(i0cVar);
                }
                this.f49245F.clear();
                stopIfNecessary();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @vc7("lock")
    public boolean startPendingStreams() {
        boolean z = false;
        while (!this.f49245F.isEmpty() && this.f49275n.size() < this.f49244E) {
            startStream(this.f49245F.poll());
            z = true;
        }
        return z;
    }

    @vc7("lock")
    private void startStream(i0c i0cVar) {
        v7d.checkState(i0cVar.mo11340d().m12702E() == -1, "StreamId already assigned");
        this.f49275n.put(Integer.valueOf(this.f49274m), i0cVar);
        setInUse(i0cVar);
        i0cVar.mo11340d().start(this.f49274m);
        if ((i0cVar.getType() != rua.EnumC12303d.UNARY && i0cVar.getType() != rua.EnumC12303d.SERVER_STREAMING) || i0cVar.m12697v()) {
            this.f49270i.flush();
        }
        int i = this.f49274m;
        if (i < 2147483645) {
            this.f49274m = i + 2;
        } else {
            this.f49274m = Integer.MAX_VALUE;
            startGoAway(Integer.MAX_VALUE, w45.NO_ERROR, n4g.f63273t.withDescription("Stream ids exhausted"));
        }
    }

    @vc7("lock")
    private void stopIfNecessary() {
        if (this.f49283v == null || !this.f49275n.isEmpty() || !this.f49245F.isEmpty() || this.f49286y) {
            return;
        }
        this.f49286y = true;
        vp8 vp8Var = this.f49247H;
        if (vp8Var != null) {
            vp8Var.onTransportTermination();
        }
        wm7 wm7Var = this.f49285x;
        if (wm7Var != null) {
            wm7Var.failed(getPingFailure());
            this.f49285x = null;
        }
        if (!this.f49284w) {
            this.f49284w = true;
            this.f49270i.goAway(0, w45.NO_ERROR, new byte[0]);
        }
        this.f49270i.close();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m13650v(j0c j0cVar, int i) {
        int i2 = j0cVar.f49280s + i;
        j0cVar.f49280s = i2;
        return i2;
    }

    /* JADX INFO: renamed from: I */
    public void m13655I(boolean z, long j, long j2, boolean z2) {
        this.f49248I = z;
        this.f49249J = j;
        this.f49250K = j2;
        this.f49251L = z2;
    }

    /* JADX INFO: renamed from: J */
    public void m13656J(int i, @eib n4g n4gVar, p42.EnumC10788a enumC10788a, boolean z, @eib w45 w45Var, @eib fta ftaVar) {
        synchronized (this.f49272k) {
            try {
                i0c i0cVarRemove = this.f49275n.remove(Integer.valueOf(i));
                if (i0cVarRemove != null) {
                    if (w45Var != null) {
                        this.f49270i.rstStream(i, w45.CANCEL);
                    }
                    if (n4gVar != null) {
                        i0c.C7097b c7097bM12696u = i0cVarRemove.mo11340d();
                        if (ftaVar == null) {
                            ftaVar = new fta();
                        }
                        c7097bM12696u.transportReportStatus(n4gVar, enumC10788a, z, ftaVar);
                    }
                    if (!startPendingStreams()) {
                        stopIfNecessary();
                        maybeClearInUse(i0cVarRemove);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @gdi
    /* JADX INFO: renamed from: K */
    public RunnableC7712e m13657K() {
        return this.f49281t;
    }

    @gdi
    /* JADX INFO: renamed from: L */
    public String m13658L() {
        URI uriAuthorityToUri = oc7.authorityToUri(this.f49263b);
        return uriAuthorityToUri.getHost() != null ? uriAuthorityToUri.getHost() : this.f49263b;
    }

    @gdi
    /* JADX INFO: renamed from: M */
    public int m13659M() {
        URI uriAuthorityToUri = oc7.authorityToUri(this.f49263b);
        return uriAuthorityToUri.getPort() != -1 ? uriAuthorityToUri.getPort() : this.f49262a.getPort();
    }

    @gdi
    /* JADX INFO: renamed from: N */
    public int m13660N() {
        int size;
        synchronized (this.f49272k) {
            size = this.f49245F.size();
        }
        return size;
    }

    @gdi
    /* JADX INFO: renamed from: O */
    public SocketFactory m13661O() {
        return this.f49240A;
    }

    /* JADX INFO: renamed from: P */
    public i0c m13662P(int i) {
        i0c i0cVar;
        synchronized (this.f49272k) {
            i0cVar = this.f49275n.get(Integer.valueOf(i));
        }
        return i0cVar;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m13663Q() {
        return this.f49241B == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m13664R(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f49272k
            monitor-enter(r0)
            int r1 = r2.f49274m     // Catch: java.lang.Throwable -> Lf
            if (r3 >= r1) goto Lc
            r1 = 1
            r3 = r3 & r1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.j0c.m13664R(int):boolean");
    }

    @vc7("lock")
    /* JADX INFO: renamed from: S */
    public void m13665S(i0c i0cVar) {
        this.f49245F.remove(i0cVar);
        maybeClearInUse(i0cVar);
    }

    @gdi
    /* JADX INFO: renamed from: T */
    public void m13666T(int i) {
        synchronized (this.f49272k) {
            this.f49274m = i;
        }
    }

    @vc7("lock")
    /* JADX INFO: renamed from: U */
    public void m13667U(i0c i0cVar) {
        if (this.f49283v != null) {
            i0cVar.mo11340d().transportReportStatus(this.f49283v, p42.EnumC10788a.MISCARRIED, true, new fta());
        } else if (this.f49275n.size() < this.f49244E) {
            startStream(i0cVar);
        } else {
            this.f49245F.add(i0cVar);
            setInUse(i0cVar);
        }
    }

    @Override // p000.i8c.InterfaceC7187d
    public i8c.C7186c[] getActiveStreams() {
        i8c.C7186c[] c7186cArr;
        synchronized (this.f49272k) {
            try {
                c7186cArr = new i8c.C7186c[this.f49275n.size()];
                Iterator<i0c> it = this.f49275n.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    c7186cArr[i] = it.next().mo11340d().getOutboundFlowState();
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7186cArr;
    }

    @Override // p000.qr2
    public sc0 getAttributes() {
        return this.f49282u;
    }

    @Override // p000.ac8
    public cb8 getLogId() {
        return this.f49273l;
    }

    @Override // p000.xa8
    public ja9<da8.C4695l> getStats() {
        y6f y6fVarCreate = y6f.create();
        synchronized (this.f49272k) {
            try {
                if (this.f49243D == null) {
                    y6fVarCreate.set(new da8.C4695l(this.f49255P.getStats(), null, null, new da8.C4694k.a().build(), null));
                } else {
                    y6fVarCreate.set(new da8.C4695l(this.f49255P.getStats(), this.f49243D.getLocalSocketAddress(), this.f49243D.getRemoteSocketAddress(), h1i.m12081b(this.f49243D), this.f49257R));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return y6fVarCreate;
    }

    @Override // p000.r42
    public /* bridge */ /* synthetic */ o42 newStream(rua ruaVar, fta ftaVar, rn1 rn1Var, q42[] q42VarArr) {
        return newStream((rua<?, ?>) ruaVar, ftaVar, rn1Var, q42VarArr);
    }

    @Override // p000.i75.InterfaceC7171a
    public void onException(Throwable th) {
        v7d.checkNotNull(th, "failureCause");
        startGoAway(0, w45.INTERNAL_ERROR, n4g.f63273t.withCause(th));
    }

    @Override // p000.r42
    public void ping(r42.InterfaceC11878a interfaceC11878a, Executor executor) {
        long jNextLong;
        synchronized (this.f49272k) {
            try {
                boolean z = true;
                v7d.checkState(this.f49270i != null);
                if (this.f49286y) {
                    wm7.notifyFailed(interfaceC11878a, executor, getPingFailure());
                    return;
                }
                wm7 wm7Var = this.f49285x;
                if (wm7Var != null) {
                    jNextLong = 0;
                    z = false;
                } else {
                    jNextLong = this.f49265d.nextLong();
                    d5g d5gVar = this.f49266e.get();
                    d5gVar.start();
                    wm7 wm7Var2 = new wm7(jNextLong, d5gVar);
                    this.f49285x = wm7Var2;
                    this.f49255P.reportKeepAliveSent();
                    wm7Var = wm7Var2;
                }
                if (z) {
                    this.f49270i.ping(false, (int) (jNextLong >>> 32), (int) jNextLong);
                }
                wm7Var.addCallback(interfaceC11878a, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.wr9
    public void shutdown(n4g n4gVar) {
        synchronized (this.f49272k) {
            try {
                if (this.f49283v != null) {
                    return;
                }
                this.f49283v = n4gVar;
                this.f49269h.transportShutdown(n4gVar);
                stopIfNecessary();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.wr9
    public void shutdownNow(n4g n4gVar) {
        shutdown(n4gVar);
        synchronized (this.f49272k) {
            try {
                Iterator<Map.Entry<Integer, i0c>> it = this.f49275n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, i0c> next = it.next();
                    it.remove();
                    next.getValue().mo11340d().transportReportStatus(n4gVar, false, new fta());
                    maybeClearInUse(next.getValue());
                }
                for (i0c i0cVar : this.f49245F) {
                    i0cVar.mo11340d().transportReportStatus(n4gVar, p42.EnumC10788a.MISCARRIED, true, new fta());
                    maybeClearInUse(i0cVar);
                }
                this.f49245F.clear();
                stopIfNecessary();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.wr9
    public Runnable start(wr9.InterfaceC14756a interfaceC14756a) {
        this.f49269h = (wr9.InterfaceC14756a) v7d.checkNotNull(interfaceC14756a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.f49248I) {
            vp8 vp8Var = new vp8(new vp8.C14209c(this), this.f49278q, this.f49249J, this.f49250K, this.f49251L);
            this.f49247H = vp8Var;
            vp8Var.onTransportStarted();
        }
        la0 la0VarM16053m = la0.m16053m(this.f49277p, this, 10000);
        kv6 kv6VarM16055l = la0VarM16053m.m16055l(this.f49268g.newWriter(Okio.buffer(la0VarM16053m), true));
        synchronized (this.f49272k) {
            i75 i75Var = new i75(this, kv6VarM16055l);
            this.f49270i = i75Var;
            this.f49271j = new i8c(this, i75Var);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f49277p.execute(new RunnableC7710c(countDownLatch, la0VarM16053m));
        try {
            sendConnectionPrefaceAndSettings();
            countDownLatch.countDown();
            this.f49277p.execute(new RunnableC7711d());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    public String toString() {
        return yya.toStringHelper(this).add("logId", this.f49273l.getId()).add("address", this.f49262a).toString();
    }

    private j0c(g0c.C6074f c6074f, InetSocketAddress inetSocketAddress, String str, @eib String str2, sc0 sc0Var, lfg<d5g> lfgVar, v2i v2iVar, @eib an7 an7Var, Runnable runnable) {
        this.f49265d = new Random();
        this.f49272k = new Object();
        this.f49275n = new HashMap();
        this.f49244E = 0;
        this.f49245F = new LinkedList();
        this.f49256Q = new C7708a();
        this.f49259T = 30000;
        this.f49262a = (InetSocketAddress) v7d.checkNotNull(inetSocketAddress, "address");
        this.f49263b = str;
        this.f49279r = c6074f.f38167H;
        this.f49267f = c6074f.f38174X;
        this.f49276o = (Executor) v7d.checkNotNull(c6074f.f38178b, "executor");
        this.f49277p = new t2f(c6074f.f38178b);
        this.f49278q = (ScheduledExecutorService) v7d.checkNotNull(c6074f.f38180d, "scheduledExecutorService");
        this.f49274m = 3;
        SocketFactory socketFactory = c6074f.f38182f;
        this.f49240A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.f49241B = c6074f.f38183m;
        this.f49242C = c6074f.f38165C;
        this.f49246G = (ls2) v7d.checkNotNull(c6074f.f38166F, "connectionSpec");
        this.f49266e = (lfg) v7d.checkNotNull(lfgVar, "stopwatchFactory");
        this.f49268g = (v2i) v7d.checkNotNull(v2iVar, "variant");
        this.f49264c = oc7.getGrpcUserAgent("okhttp", str2);
        this.f49258S = an7Var;
        this.f49252M = (Runnable) v7d.checkNotNull(runnable, "tooManyPingsRunnable");
        this.f49253N = c6074f.f38176Z;
        this.f49255P = c6074f.f38181e.create();
        this.f49273l = cb8.allocate(getClass(), inetSocketAddress.toString());
        this.f49282u = sc0.newBuilder().set(dc7.f29284b, sc0Var).build();
        this.f49254O = c6074f.f38170M1;
        initTransportTracer();
    }

    @Override // p000.r42
    public i0c newStream(rua<?, ?> ruaVar, fta ftaVar, rn1 rn1Var, q42[] q42VarArr) throws Throwable {
        v7d.checkNotNull(ruaVar, FirebaseAnalytics.C3552d.f23230v);
        v7d.checkNotNull(ftaVar, "headers");
        k4g k4gVarNewClientContext = k4g.newClientContext(q42VarArr, getAttributes(), ftaVar);
        synchronized (this.f49272k) {
            try {
                try {
                    return new i0c(ruaVar, ftaVar, this.f49270i, this, this.f49271j, this.f49272k, this.f49279r, this.f49267f, this.f49263b, this.f49264c, k4gVarNewClientContext, this.f49255P, rn1Var, this.f49254O);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @gdi
    public j0c(g0c.C6074f c6074f, String str, lfg<d5g> lfgVar, v2i v2iVar, @eib Runnable runnable, y6f<Void> y6fVar, Runnable runnable2) {
        this(c6074f, new InetSocketAddress("127.0.0.1", 80), "notarealauthority:80", str, sc0.f81180c, lfgVar, v2iVar, null, runnable2);
        this.f49260U = runnable;
        this.f49261V = (y6f) v7d.checkNotNull(y6fVar, "connectedFuture");
    }
}
