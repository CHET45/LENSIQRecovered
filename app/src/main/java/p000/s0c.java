package p000;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ServerSocketFactory;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import p000.b3h;
import p000.d0g;
import p000.i3f;
import p000.rhh;
import p000.y3f;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1785")
public final class s0c extends gt6<s0c> {

    /* JADX INFO: renamed from: A */
    public static final EnumSet<b3h.EnumC1730d> f80313A;

    /* JADX INFO: renamed from: r */
    public static final Logger f80314r = Logger.getLogger(s0c.class.getName());

    /* JADX INFO: renamed from: s */
    public static final int f80315s = 65535;

    /* JADX INFO: renamed from: t */
    public static final long f80316t = Long.MAX_VALUE;

    /* JADX INFO: renamed from: u */
    public static final long f80317u;

    /* JADX INFO: renamed from: v */
    public static final long f80318v = Long.MAX_VALUE;

    /* JADX INFO: renamed from: w */
    public static final long f80319w = Long.MAX_VALUE;

    /* JADX INFO: renamed from: x */
    public static final long f80320x;

    /* JADX INFO: renamed from: y */
    public static final long f80321y;

    /* JADX INFO: renamed from: z */
    public static final gkb<Executor> f80322z;

    /* JADX INFO: renamed from: b */
    public final SocketAddress f80324b;

    /* JADX INFO: renamed from: c */
    public final we7 f80325c;

    /* JADX INFO: renamed from: n */
    public boolean f80336n;

    /* JADX INFO: renamed from: a */
    public final i3f f80323a = new i3f(new i3f.InterfaceC7130b() { // from class: r0c
        @Override // p000.i3f.InterfaceC7130b
        public final ob8 buildClientTransportServers(List list) {
            return this.f76722a.m21634b(list);
        }
    });

    /* JADX INFO: renamed from: d */
    public rhh.C12098b f80326d = rhh.getDefaultFactory();

    /* JADX INFO: renamed from: e */
    public gkb<Executor> f80327e = f80322z;

    /* JADX INFO: renamed from: f */
    public gkb<ScheduledExecutorService> f80328f = baf.forResource(oc7.f67130L);

    /* JADX INFO: renamed from: g */
    public ServerSocketFactory f80329g = ServerSocketFactory.getDefault();

    /* JADX INFO: renamed from: h */
    public long f80330h = oc7.f67121C;

    /* JADX INFO: renamed from: i */
    public long f80331i = oc7.f67122D;

    /* JADX INFO: renamed from: j */
    public int f80332j = 65535;

    /* JADX INFO: renamed from: k */
    public int f80333k = 8192;

    /* JADX INFO: renamed from: l */
    public int f80334l = 4194304;

    /* JADX INFO: renamed from: m */
    public long f80335m = Long.MAX_VALUE;

    /* JADX INFO: renamed from: o */
    public long f80337o = TimeUnit.MINUTES.toNanos(5);

    /* JADX INFO: renamed from: p */
    public long f80338p = Long.MAX_VALUE;

    /* JADX INFO: renamed from: q */
    public long f80339q = Long.MAX_VALUE;

    /* JADX INFO: renamed from: s0c$a */
    public static /* synthetic */ class C12387a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f80340a;

        static {
            int[] iArr = new int[b3h.EnumC1729c.values().length];
            f80340a = iArr;
            try {
                iArr[b3h.EnumC1729c.OPTIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80340a[b3h.EnumC1729c.REQUIRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80340a[b3h.EnumC1729c.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: s0c$b */
    public static final class C12388b extends SSLSocketFactory {

        /* JADX INFO: renamed from: a */
        public final SSLSocketFactory f80341a;

        /* JADX INFO: renamed from: b */
        public final boolean f80342b;

        public C12388b(SSLSocketFactory sSLSocketFactory, boolean z) {
            this.f80341a = (SSLSocketFactory) v7d.checkNotNull(sSLSocketFactory, "socketFactory");
            this.f80342b = z;
        }

        private Socket apply(Socket socket) throws IOException {
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                if (this.f80342b) {
                    sSLSocket.setNeedClientAuth(true);
                } else {
                    sSLSocket.setWantClientAuth(true);
                }
                return sSLSocket;
            }
            throw new IOException("SocketFactory " + this.f80341a + " did not produce an SSLSocket: " + socket.getClass());
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
            return apply(this.f80341a.createSocket(socket, str, i, z));
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getDefaultCipherSuites() {
            return this.f80341a.getDefaultCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getSupportedCipherSuites() {
            return this.f80341a.getSupportedCipherSuites();
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i) throws IOException {
            return apply(this.f80341a.createSocket(str, i));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
            return apply(this.f80341a.createSocket(str, i, inetAddress, i2));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
            return apply(this.f80341a.createSocket(inetAddress, i));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
            return apply(this.f80341a.createSocket(inetAddress, i, inetAddress2, i2));
        }
    }

    /* JADX INFO: renamed from: s0c$c */
    public static final class C12389c {

        /* JADX INFO: renamed from: a */
        public final we7 f80343a;

        /* JADX INFO: renamed from: b */
        public final String f80344b;

        private C12389c(we7 we7Var, String str) {
            this.f80343a = we7Var;
            this.f80344b = str;
        }

        public static C12389c error(String str) {
            return new C12389c(null, (String) v7d.checkNotNull(str, "error"));
        }

        public static C12389c factory(we7 we7Var) {
            return new C12389c((we7) v7d.checkNotNull(we7Var, "factory"), null);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f80317u = timeUnit.toNanos(1L);
        f80320x = timeUnit.toNanos(1L);
        f80321y = TimeUnit.DAYS.toNanos(1000L);
        f80322z = g0c.f38139w;
        f80313A = EnumSet.of(b3h.EnumC1730d.MTLS, b3h.EnumC1730d.CUSTOM_MANAGERS);
    }

    public s0c(SocketAddress socketAddress, we7 we7Var) {
        this.f80324b = (SocketAddress) v7d.checkNotNull(socketAddress, "address");
        this.f80325c = (we7) v7d.checkNotNull(we7Var, "handshakerSocketFactory");
    }

    /* JADX INFO: renamed from: c */
    public static C12389c m21633c(e3f e3fVar) {
        KeyManager[] keyManagerArrM11283c;
        TrustManager[] trustManagerArrM11284e;
        C12388b c12388b;
        if (!(e3fVar instanceof b3h)) {
            if (e3fVar instanceof o48) {
                return C12389c.factory(new pwc());
            }
            if (e3fVar instanceof d0g.C4577a) {
                return C12389c.factory(new c3h((d0g.C4577a) e3fVar));
            }
            if (!(e3fVar instanceof dz1)) {
                return C12389c.error("Unsupported credential type: " + e3fVar.getClass().getName());
            }
            StringBuilder sb = new StringBuilder();
            Iterator<e3f> it = ((dz1) e3fVar).getCredentialsList().iterator();
            while (it.hasNext()) {
                C12389c c12389cM21633c = m21633c(it.next());
                if (c12389cM21633c.f80344b == null) {
                    return c12389cM21633c;
                }
                sb.append(", ");
                sb.append(c12389cM21633c.f80344b);
            }
            return C12389c.error(sb.substring(2));
        }
        b3h b3hVar = (b3h) e3fVar;
        Set<b3h.EnumC1730d> setIncomprehensible = b3hVar.incomprehensible(f80313A);
        if (!setIncomprehensible.isEmpty()) {
            return C12389c.error("TLS features not understood: " + setIncomprehensible);
        }
        if (b3hVar.getKeyManagers() != null) {
            keyManagerArrM11283c = (KeyManager[]) b3hVar.getKeyManagers().toArray(new KeyManager[0]);
        } else if (b3hVar.getPrivateKey() == null) {
            keyManagerArrM11283c = null;
        } else {
            if (b3hVar.getPrivateKeyPassword() != null) {
                return C12389c.error("byte[]-based private key with password unsupported. Use unencrypted file or KeyManager");
            }
            try {
                keyManagerArrM11283c = g0c.m11283c(b3hVar.getCertificateChain(), b3hVar.getPrivateKey());
            } catch (GeneralSecurityException e) {
                f80314r.log(Level.FINE, "Exception loading private key from credential", (Throwable) e);
                return C12389c.error("Unable to load private key: " + e.getMessage());
            }
        }
        if (b3hVar.getTrustManagers() != null) {
            trustManagerArrM11284e = (TrustManager[]) b3hVar.getTrustManagers().toArray(new TrustManager[0]);
        } else if (b3hVar.getRootCertificates() != null) {
            try {
                trustManagerArrM11284e = g0c.m11284e(b3hVar.getRootCertificates());
            } catch (GeneralSecurityException e2) {
                f80314r.log(Level.FINE, "Exception loading root certificates from credential", (Throwable) e2);
                return C12389c.error("Unable to load root certificates: " + e2.getMessage());
            }
        } else {
            trustManagerArrM11284e = null;
        }
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS", qwc.get().getProvider());
            sSLContext.init(keyManagerArrM11283c, trustManagerArrM11284e, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            int i = C12387a.f80340a[b3hVar.getClientAuth().ordinal()];
            if (i == 1) {
                c12388b = new C12388b(socketFactory, false);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return C12389c.error("Unknown TlsServerCredentials.ClientAuth value: " + b3hVar.getClientAuth());
                    }
                    return C12389c.factory(new c3h(new d0g.C4577a(socketFactory)));
                }
                c12388b = new C12388b(socketFactory, true);
            }
            socketFactory = c12388b;
            return C12389c.factory(new c3h(new d0g.C4577a(socketFactory)));
        } catch (GeneralSecurityException e3) {
            throw new RuntimeException("TLS Provider failure", e3);
        }
    }

    @hh4("Always throws. Use forPort(int, ServerCredentials) instead")
    @Deprecated
    public static s0c forPort(int i) {
        throw new UnsupportedOperationException("Use forPort(int, ServerCredentials) instead");
    }

    @Override // p000.gt6
    @x98
    /* JADX INFO: renamed from: a */
    public v2f<?> mo11860a() {
        return this.f80323a;
    }

    /* JADX INFO: renamed from: b */
    public ob8 m21634b(List<? extends y3f.AbstractC15412a> list) {
        return new q0c(this, list, this.f80323a.getChannelz());
    }

    /* JADX INFO: renamed from: d */
    public s0c m21635d(rhh.C12098b c12098b) {
        this.f80326d = c12098b;
        return this;
    }

    public s0c flowControlWindow(int i) {
        v7d.checkState(i > 0, "flowControlWindow must be positive");
        this.f80332j = i;
        return this;
    }

    public s0c scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.f80328f = new c26((ScheduledExecutorService) v7d.checkNotNull(scheduledExecutorService, "scheduledExecutorService"));
        return this;
    }

    public void setStatsEnabled(boolean z) {
        this.f80323a.setStatsEnabled(z);
    }

    public s0c socketFactory(ServerSocketFactory serverSocketFactory) {
        if (serverSocketFactory == null) {
            this.f80329g = ServerSocketFactory.getDefault();
        } else {
            this.f80329g = serverSocketFactory;
        }
        return this;
    }

    public s0c transportExecutor(Executor executor) {
        if (executor == null) {
            this.f80327e = f80322z;
        } else {
            this.f80327e = new c26(executor);
        }
        return this;
    }

    public static s0c forPort(int i, e3f e3fVar) {
        return forPort(new InetSocketAddress(i), e3fVar);
    }

    @Override // p000.gt6, p000.v2f
    public s0c keepAliveTime(long j, TimeUnit timeUnit) {
        v7d.checkArgument(j > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j);
        this.f80330h = nanos;
        long jClampKeepAliveTimeInNanos = vp8.clampKeepAliveTimeInNanos(nanos);
        this.f80330h = jClampKeepAliveTimeInNanos;
        if (jClampKeepAliveTimeInNanos >= f80321y) {
            this.f80330h = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // p000.gt6, p000.v2f
    public s0c keepAliveTimeout(long j, TimeUnit timeUnit) {
        v7d.checkArgument(j > 0, "keepalive timeout must be positive");
        long nanos = timeUnit.toNanos(j);
        this.f80331i = nanos;
        this.f80331i = vp8.clampKeepAliveTimeoutInNanos(nanos);
        return this;
    }

    @Override // p000.gt6, p000.v2f
    public s0c maxConnectionAge(long j, TimeUnit timeUnit) {
        v7d.checkArgument(j > 0, "max connection age must be positive: %s", j);
        long nanos = timeUnit.toNanos(j);
        this.f80338p = nanos;
        if (nanos >= f80321y) {
            this.f80338p = Long.MAX_VALUE;
        }
        long j2 = this.f80338p;
        long j3 = f80320x;
        if (j2 < j3) {
            this.f80338p = j3;
        }
        return this;
    }

    @Override // p000.gt6, p000.v2f
    public s0c maxConnectionAgeGrace(long j, TimeUnit timeUnit) {
        v7d.checkArgument(j >= 0, "max connection age grace must be non-negative: %s", j);
        long nanos = timeUnit.toNanos(j);
        this.f80339q = nanos;
        if (nanos >= f80321y) {
            this.f80339q = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // p000.gt6, p000.v2f
    public s0c maxConnectionIdle(long j, TimeUnit timeUnit) {
        v7d.checkArgument(j > 0, "max connection idle must be positive: %s", j);
        long nanos = timeUnit.toNanos(j);
        this.f80335m = nanos;
        if (nanos >= f80321y) {
            this.f80335m = Long.MAX_VALUE;
        }
        long j2 = this.f80335m;
        long j3 = f80317u;
        if (j2 < j3) {
            this.f80335m = j3;
        }
        return this;
    }

    @Override // p000.gt6, p000.v2f
    public s0c maxInboundMessageSize(int i) {
        v7d.checkArgument(i >= 0, "negative max bytes");
        this.f80334l = i;
        return this;
    }

    @Override // p000.gt6, p000.v2f
    public s0c maxInboundMetadataSize(int i) {
        v7d.checkArgument(i > 0, "maxInboundMetadataSize must be > 0");
        this.f80333k = i;
        return this;
    }

    @Override // p000.gt6, p000.v2f
    @op1
    public s0c permitKeepAliveTime(long j, TimeUnit timeUnit) {
        v7d.checkArgument(j >= 0, "permit keepalive time must be non-negative: %s", j);
        this.f80337o = timeUnit.toNanos(j);
        return this;
    }

    @Override // p000.gt6, p000.v2f
    @op1
    public s0c permitKeepAliveWithoutCalls(boolean z) {
        this.f80336n = z;
        return this;
    }

    public static s0c forPort(SocketAddress socketAddress, e3f e3fVar) {
        C12389c c12389cM21633c = m21633c(e3fVar);
        if (c12389cM21633c.f80344b == null) {
            return new s0c(socketAddress, c12389cM21633c.f80343a);
        }
        throw new IllegalArgumentException(c12389cM21633c.f80344b);
    }
}
