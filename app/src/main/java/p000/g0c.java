package p000;

import com.squareup.okhttp.ConnectionSpec;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import p000.a3h;
import p000.aaf;
import p000.c0g;
import p000.lb0;
import p000.ls2;
import p000.rhh;
import p000.rr9;
import p000.s42;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1785")
public final class g0c extends dr6<g0c> {

    /* JADX INFO: renamed from: s */
    public static final int f38135s = 65535;

    /* JADX INFO: renamed from: v */
    public static final aaf.InterfaceC0124d<Executor> f38138v;

    /* JADX INFO: renamed from: w */
    public static final gkb<Executor> f38139w;

    /* JADX INFO: renamed from: x */
    public static final EnumSet<a3h.EnumC0050c> f38140x;

    /* JADX INFO: renamed from: a */
    public final rr9 f38141a;

    /* JADX INFO: renamed from: b */
    public rhh.C12098b f38142b;

    /* JADX INFO: renamed from: c */
    public gkb<Executor> f38143c;

    /* JADX INFO: renamed from: d */
    public gkb<ScheduledExecutorService> f38144d;

    /* JADX INFO: renamed from: e */
    public SocketFactory f38145e;

    /* JADX INFO: renamed from: f */
    public SSLSocketFactory f38146f;

    /* JADX INFO: renamed from: g */
    public final boolean f38147g;

    /* JADX INFO: renamed from: h */
    public HostnameVerifier f38148h;

    /* JADX INFO: renamed from: i */
    public ls2 f38149i;

    /* JADX INFO: renamed from: j */
    public EnumC6071c f38150j;

    /* JADX INFO: renamed from: k */
    public long f38151k;

    /* JADX INFO: renamed from: l */
    public long f38152l;

    /* JADX INFO: renamed from: m */
    public int f38153m;

    /* JADX INFO: renamed from: n */
    public boolean f38154n;

    /* JADX INFO: renamed from: o */
    public int f38155o;

    /* JADX INFO: renamed from: p */
    public int f38156p;

    /* JADX INFO: renamed from: q */
    public final boolean f38157q;

    /* JADX INFO: renamed from: r */
    public static final Logger f38134r = Logger.getLogger(g0c.class.getName());

    /* JADX INFO: renamed from: t */
    public static final ls2 f38136t = new ls2.C8950b(ls2.f58576f).cipherSuites(vz1.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, vz1.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, vz1.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, vz1.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, vz1.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, vz1.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).tlsVersions(d3h.TLS_1_2).supportsTlsExtensions(true).build();

    /* JADX INFO: renamed from: u */
    public static final long f38137u = TimeUnit.DAYS.toNanos(1000);

    /* JADX INFO: renamed from: g0c$a */
    public class C6069a implements aaf.InterfaceC0124d<Executor> {
        @Override // p000.aaf.InterfaceC0124d
        public void close(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // p000.aaf.InterfaceC0124d
        public Executor create() {
            return Executors.newCachedThreadPool(oc7.getThreadFactory("grpc-okhttp-%d", true));
        }
    }

    /* JADX INFO: renamed from: g0c$b */
    public static /* synthetic */ class C6070b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38158a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f38159b;

        static {
            int[] iArr = new int[EnumC6071c.values().length];
            f38159b = iArr;
            try {
                iArr[EnumC6071c.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38159b[EnumC6071c.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[dab.values().length];
            f38158a = iArr2;
            try {
                iArr2[dab.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38158a[dab.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: g0c$c */
    public enum EnumC6071c {
        TLS,
        PLAINTEXT
    }

    /* JADX INFO: renamed from: g0c$d */
    public final class C6072d implements rr9.InterfaceC12215b {
        private C6072d() {
        }

        @Override // p000.rr9.InterfaceC12215b
        public int getDefaultPort() {
            return g0c.this.m11291h();
        }

        public /* synthetic */ C6072d(g0c g0cVar, C6069a c6069a) {
            this();
        }
    }

    /* JADX INFO: renamed from: g0c$e */
    public final class C6073e implements rr9.InterfaceC12216c {
        private C6073e() {
        }

        @Override // p000.rr9.InterfaceC12216c
        public s42 buildClientTransportFactory() {
            return g0c.this.m11287b();
        }

        public /* synthetic */ C6073e(g0c g0cVar, C6069a c6069a) {
            this();
        }
    }

    /* JADX INFO: renamed from: g0c$f */
    @x98
    public static final class C6074f implements s42 {

        /* JADX INFO: renamed from: C */
        @eib
        public final HostnameVerifier f38165C;

        /* JADX INFO: renamed from: F */
        public final ls2 f38166F;

        /* JADX INFO: renamed from: H */
        public final int f38167H;

        /* JADX INFO: renamed from: L */
        public final boolean f38168L;

        /* JADX INFO: renamed from: M */
        public final long f38169M;

        /* JADX INFO: renamed from: M1 */
        public final boolean f38170M1;

        /* JADX INFO: renamed from: N */
        public final lb0 f38171N;

        /* JADX INFO: renamed from: Q */
        public final long f38172Q;

        /* JADX INFO: renamed from: V1 */
        public boolean f38173V1;

        /* JADX INFO: renamed from: X */
        public final int f38174X;

        /* JADX INFO: renamed from: Y */
        public final boolean f38175Y;

        /* JADX INFO: renamed from: Z */
        public final int f38176Z;

        /* JADX INFO: renamed from: a */
        public final gkb<Executor> f38177a;

        /* JADX INFO: renamed from: b */
        public final Executor f38178b;

        /* JADX INFO: renamed from: c */
        public final gkb<ScheduledExecutorService> f38179c;

        /* JADX INFO: renamed from: d */
        public final ScheduledExecutorService f38180d;

        /* JADX INFO: renamed from: e */
        public final rhh.C12098b f38181e;

        /* JADX INFO: renamed from: f */
        public final SocketFactory f38182f;

        /* JADX INFO: renamed from: m */
        @eib
        public final SSLSocketFactory f38183m;

        /* JADX INFO: renamed from: g0c$f$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ lb0.C8752b f38184a;

            public a(lb0.C8752b c8752b) {
                this.f38184a = c8752b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f38184a.backoff();
            }
        }

        public /* synthetic */ C6074f(gkb gkbVar, gkb gkbVar2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, ls2 ls2Var, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, rhh.C12098b c12098b, boolean z3, C6069a c6069a) {
            this(gkbVar, gkbVar2, socketFactory, sSLSocketFactory, hostnameVerifier, ls2Var, i, z, j, j2, i2, z2, i3, c12098b, z3);
        }

        @Override // p000.s42, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f38173V1) {
                return;
            }
            this.f38173V1 = true;
            this.f38177a.returnObject(this.f38178b);
            this.f38179c.returnObject(this.f38180d);
        }

        @Override // p000.s42
        public ScheduledExecutorService getScheduledExecutorService() {
            return this.f38180d;
        }

        @Override // p000.s42
        public Collection<Class<? extends SocketAddress>> getSupportedSocketAddressTypes() {
            return g0c.m11285i();
        }

        @Override // p000.s42
        public qr2 newClientTransport(SocketAddress socketAddress, s42.C12428a c12428a, pu1 pu1Var) {
            if (this.f38173V1) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            lb0.C8752b state = this.f38171N.getState();
            j0c j0cVar = new j0c(this, (InetSocketAddress) socketAddress, c12428a.getAuthority(), c12428a.getUserAgent(), c12428a.getEagAttributes(), c12428a.getHttpConnectProxiedSocketAddress(), new a(state));
            if (this.f38168L) {
                j0cVar.m13655I(true, state.get(), this.f38172Q, this.f38175Y);
            }
            return j0cVar;
        }

        @Override // p000.s42
        @dy1
        @eib
        public s42.C12429b swapChannelCredentials(eu1 eu1Var) {
            C6075g c6075gM11286k = g0c.m11286k(eu1Var);
            if (c6075gM11286k.f38188c != null) {
                return null;
            }
            return new s42.C12429b(new C6074f(this.f38177a, this.f38179c, this.f38182f, c6075gM11286k.f38186a, this.f38165C, this.f38166F, this.f38167H, this.f38168L, this.f38169M, this.f38172Q, this.f38174X, this.f38175Y, this.f38176Z, this.f38181e, this.f38170M1), c6075gM11286k.f38187b);
        }

        private C6074f(gkb<Executor> gkbVar, gkb<ScheduledExecutorService> gkbVar2, @eib SocketFactory socketFactory, @eib SSLSocketFactory sSLSocketFactory, @eib HostnameVerifier hostnameVerifier, ls2 ls2Var, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, rhh.C12098b c12098b, boolean z3) {
            this.f38177a = gkbVar;
            this.f38178b = gkbVar.getObject();
            this.f38179c = gkbVar2;
            this.f38180d = gkbVar2.getObject();
            this.f38182f = socketFactory;
            this.f38183m = sSLSocketFactory;
            this.f38165C = hostnameVerifier;
            this.f38166F = ls2Var;
            this.f38167H = i;
            this.f38168L = z;
            this.f38169M = j;
            this.f38171N = new lb0("keepalive time nanos", j);
            this.f38172Q = j2;
            this.f38174X = i2;
            this.f38175Y = z2;
            this.f38176Z = i3;
            this.f38170M1 = z3;
            this.f38181e = (rhh.C12098b) v7d.checkNotNull(c12098b, "transportTracerFactory");
        }
    }

    /* JADX INFO: renamed from: g0c$g */
    public static final class C6075g {

        /* JADX INFO: renamed from: a */
        public final SSLSocketFactory f38186a;

        /* JADX INFO: renamed from: b */
        public final pn1 f38187b;

        /* JADX INFO: renamed from: c */
        public final String f38188c;

        private C6075g(SSLSocketFactory sSLSocketFactory, pn1 pn1Var, String str) {
            this.f38186a = sSLSocketFactory;
            this.f38187b = pn1Var;
            this.f38188c = str;
        }

        public static C6075g error(String str) {
            return new C6075g(null, null, (String) v7d.checkNotNull(str, "error"));
        }

        public static C6075g factory(SSLSocketFactory sSLSocketFactory) {
            return new C6075g((SSLSocketFactory) v7d.checkNotNull(sSLSocketFactory, "factory"), null, null);
        }

        public static C6075g plaintext() {
            return new C6075g(null, null, null);
        }

        public C6075g withCallCredentials(pn1 pn1Var) {
            v7d.checkNotNull(pn1Var, "callCreds");
            if (this.f38188c != null) {
                return this;
            }
            pn1 pn1Var2 = this.f38187b;
            if (pn1Var2 != null) {
                pn1Var = new jm2(pn1Var2, pn1Var);
            }
            return new C6075g(this.f38186a, pn1Var, null);
        }
    }

    static {
        C6069a c6069a = new C6069a();
        f38138v = c6069a;
        f38139w = baf.forResource(c6069a);
        f38140x = EnumSet.of(a3h.EnumC0050c.MTLS, a3h.EnumC0050c.CUSTOM_MANAGERS);
    }

    private g0c(String str, int i) {
        this(oc7.authorityFromHostAndPort(str, i));
    }

    /* JADX INFO: renamed from: c */
    public static KeyManager[] m11283c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            X509Certificate[] x509Certificates = pt1.getX509Certificates(byteArrayInputStream);
            oc7.closeQuietly(byteArrayInputStream);
            byteArrayInputStream = new ByteArrayInputStream(bArr2);
            try {
                try {
                    PrivateKey privateKey = pt1.getPrivateKey(byteArrayInputStream);
                    oc7.closeQuietly(byteArrayInputStream);
                    KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                    try {
                        keyStore.load(null, null);
                        keyStore.setKeyEntry("key", privateKey, new char[0], x509Certificates);
                        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                        keyManagerFactory.init(keyStore, new char[0]);
                        return keyManagerFactory.getKeyManagers();
                    } catch (IOException e) {
                        throw new GeneralSecurityException(e);
                    }
                } finally {
                }
            } catch (IOException e2) {
                throw new GeneralSecurityException("Unable to decode private key", e2);
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: e */
    public static TrustManager[] m11284e(byte[] bArr) throws GeneralSecurityException {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        try {
            keyStore.load(null, null);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                X509Certificate[] x509Certificates = pt1.getX509Certificates(byteArrayInputStream);
                oc7.closeQuietly(byteArrayInputStream);
                for (X509Certificate x509Certificate : x509Certificates) {
                    keyStore.setCertificateEntry(x509Certificate.getSubjectX500Principal().getName("RFC2253"), x509Certificate);
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                return trustManagerFactory.getTrustManagers();
            } catch (Throwable th) {
                oc7.closeQuietly(byteArrayInputStream);
                throw th;
            }
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static g0c forAddress(String str, int i) {
        return new g0c(str, i);
    }

    public static g0c forTarget(String str) {
        return new g0c(str);
    }

    /* JADX INFO: renamed from: i */
    public static Collection<Class<? extends SocketAddress>> m11285i() {
        return Collections.singleton(InetSocketAddress.class);
    }

    /* JADX INFO: renamed from: k */
    public static C6075g m11286k(eu1 eu1Var) {
        KeyManager[] keyManagerArrM11283c;
        TrustManager[] trustManagerArrM11284e;
        if (!(eu1Var instanceof a3h)) {
            if (eu1Var instanceof n48) {
                return C6075g.plaintext();
            }
            if (eu1Var instanceof km2) {
                km2 km2Var = (km2) eu1Var;
                return m11286k(km2Var.getChannelCredentials()).withCallCredentials(km2Var.getCallCredentials());
            }
            if (eu1Var instanceof c0g.C2143b) {
                return C6075g.factory(((c0g.C2143b) eu1Var).getFactory());
            }
            if (!(eu1Var instanceof cz1)) {
                return C6075g.error("Unsupported credential type: " + eu1Var.getClass().getName());
            }
            StringBuilder sb = new StringBuilder();
            Iterator<eu1> it = ((cz1) eu1Var).getCredentialsList().iterator();
            while (it.hasNext()) {
                C6075g c6075gM11286k = m11286k(it.next());
                if (c6075gM11286k.f38188c == null) {
                    return c6075gM11286k;
                }
                sb.append(", ");
                sb.append(c6075gM11286k.f38188c);
            }
            return C6075g.error(sb.substring(2));
        }
        a3h a3hVar = (a3h) eu1Var;
        Set<a3h.EnumC0050c> setIncomprehensible = a3hVar.incomprehensible(f38140x);
        if (!setIncomprehensible.isEmpty()) {
            return C6075g.error("TLS features not understood: " + setIncomprehensible);
        }
        if (a3hVar.getKeyManagers() != null) {
            keyManagerArrM11283c = (KeyManager[]) a3hVar.getKeyManagers().toArray(new KeyManager[0]);
        } else if (a3hVar.getPrivateKey() == null) {
            keyManagerArrM11283c = null;
        } else {
            if (a3hVar.getPrivateKeyPassword() != null) {
                return C6075g.error("byte[]-based private key with password unsupported. Use unencrypted file or KeyManager");
            }
            try {
                keyManagerArrM11283c = m11283c(a3hVar.getCertificateChain(), a3hVar.getPrivateKey());
            } catch (GeneralSecurityException e) {
                f38134r.log(Level.FINE, "Exception loading private key from credential", (Throwable) e);
                return C6075g.error("Unable to load private key: " + e.getMessage());
            }
        }
        if (a3hVar.getTrustManagers() != null) {
            trustManagerArrM11284e = (TrustManager[]) a3hVar.getTrustManagers().toArray(new TrustManager[0]);
        } else if (a3hVar.getRootCertificates() != null) {
            try {
                trustManagerArrM11284e = m11284e(a3hVar.getRootCertificates());
            } catch (GeneralSecurityException e2) {
                f38134r.log(Level.FINE, "Exception loading root certificates from credential", (Throwable) e2);
                return C6075g.error("Unable to load root certificates: " + e2.getMessage());
            }
        } else {
            trustManagerArrM11284e = null;
        }
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS", qwc.get().getProvider());
            sSLContext.init(keyManagerArrM11283c, trustManagerArrM11284e, null);
            return C6075g.factory(sSLContext.getSocketFactory());
        } catch (GeneralSecurityException e3) {
            throw new RuntimeException("TLS Provider failure", e3);
        }
    }

    @Override // p000.dr6
    @x98
    /* JADX INFO: renamed from: a */
    public pr9<?> mo9331a() {
        return this.f38141a;
    }

    /* JADX INFO: renamed from: b */
    public C6074f m11287b() {
        return new C6074f(this.f38143c, this.f38144d, this.f38145e, m11288d(), this.f38148h, this.f38149i, this.f38155o, this.f38151k != Long.MAX_VALUE, this.f38151k, this.f38152l, this.f38153m, this.f38154n, this.f38156p, this.f38142b, false, null);
    }

    public g0c connectionSpec(ConnectionSpec connectionSpec) {
        v7d.checkState(!this.f38147g, "Cannot change security when using ChannelCredentials");
        v7d.checkArgument(connectionSpec.isTls(), "plaintext ConnectionSpec is not accepted");
        this.f38149i = h1i.m12080a(connectionSpec);
        return this;
    }

    @gdi
    @eib
    /* JADX INFO: renamed from: d */
    public SSLSocketFactory m11288d() {
        int i = C6070b.f38159b[this.f38150j.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i != 2) {
            throw new RuntimeException("Unknown negotiation type: " + this.f38150j);
        }
        try {
            if (this.f38146f == null) {
                this.f38146f = SSLContext.getInstance("Default", qwc.get().getProvider()).getSocketFactory();
            }
            return this.f38146f;
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("TLS Provider failure", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public g0c m11289f() {
        this.f38141a.disableCheckAuthority();
        return this;
    }

    public g0c flowControlWindow(int i) {
        v7d.checkState(i > 0, "flowControlWindow must be positive");
        this.f38153m = i;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public g0c m11290g() {
        this.f38141a.enableCheckAuthority();
        return this;
    }

    /* JADX INFO: renamed from: h */
    public int m11291h() {
        int i = C6070b.f38159b[this.f38150j.ordinal()];
        if (i == 1) {
            return 80;
        }
        if (i == 2) {
            return 443;
        }
        throw new AssertionError(this.f38150j + " not handled");
    }

    public g0c hostnameVerifier(@eib HostnameVerifier hostnameVerifier) {
        v7d.checkState(!this.f38147g, "Cannot change security when using ChannelCredentials");
        this.f38148h = hostnameVerifier;
        return this;
    }

    @gdi
    /* JADX INFO: renamed from: j */
    public g0c m11292j(rhh.C12098b c12098b) {
        this.f38142b = c12098b;
        return this;
    }

    @Deprecated
    public g0c negotiationType(dab dabVar) {
        v7d.checkState(!this.f38147g, "Cannot change security when using ChannelCredentials");
        v7d.checkNotNull(dabVar, "type");
        int i = C6070b.f38158a[dabVar.ordinal()];
        if (i == 1) {
            this.f38150j = EnumC6071c.TLS;
        } else {
            if (i != 2) {
                throw new AssertionError("Unknown negotiation type: " + dabVar);
            }
            this.f38150j = EnumC6071c.PLAINTEXT;
        }
        return this;
    }

    public g0c scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.f38144d = new c26((ScheduledExecutorService) v7d.checkNotNull(scheduledExecutorService, "scheduledExecutorService"));
        return this;
    }

    public void setStatsEnabled(boolean z) {
        this.f38141a.setStatsEnabled(z);
    }

    public g0c socketFactory(@eib SocketFactory socketFactory) {
        this.f38145e = socketFactory;
        return this;
    }

    public g0c sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        v7d.checkState(!this.f38147g, "Cannot change security when using ChannelCredentials");
        this.f38146f = sSLSocketFactory;
        this.f38150j = EnumC6071c.TLS;
        return this;
    }

    public g0c tlsConnectionSpec(String[] strArr, String[] strArr2) {
        v7d.checkState(!this.f38147g, "Cannot change security when using ChannelCredentials");
        v7d.checkNotNull(strArr, "tls versions must not null");
        v7d.checkNotNull(strArr2, "ciphers must not null");
        this.f38149i = new ls2.C8950b(true).supportsTlsExtensions(true).tlsVersions(strArr).cipherSuites(strArr2).build();
        return this;
    }

    public g0c transportExecutor(@eib Executor executor) {
        if (executor == null) {
            this.f38143c = f38139w;
        } else {
            this.f38143c = new c26(executor);
        }
        return this;
    }

    private g0c(String str) {
        this.f38142b = rhh.getDefaultFactory();
        this.f38143c = f38139w;
        this.f38144d = baf.forResource(oc7.f67130L);
        this.f38149i = f38136t;
        this.f38150j = EnumC6071c.TLS;
        this.f38151k = Long.MAX_VALUE;
        this.f38152l = oc7.f67119A;
        this.f38153m = 65535;
        this.f38155o = 4194304;
        this.f38156p = Integer.MAX_VALUE;
        this.f38157q = false;
        C6069a c6069a = null;
        this.f38141a = new rr9(str, new C6073e(this, c6069a), new C6072d(this, c6069a));
        this.f38147g = false;
    }

    public static g0c forAddress(String str, int i, eu1 eu1Var) {
        return forTarget(oc7.authorityFromHostAndPort(str, i), eu1Var);
    }

    public static g0c forTarget(String str, eu1 eu1Var) {
        C6075g c6075gM11286k = m11286k(eu1Var);
        if (c6075gM11286k.f38188c == null) {
            return new g0c(str, eu1Var, c6075gM11286k.f38187b, c6075gM11286k.f38186a);
        }
        throw new IllegalArgumentException(c6075gM11286k.f38188c);
    }

    @Override // p000.dr6, p000.pr9
    public g0c keepAliveTime(long j, TimeUnit timeUnit) {
        v7d.checkArgument(j > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j);
        this.f38151k = nanos;
        long jClampKeepAliveTimeInNanos = vp8.clampKeepAliveTimeInNanos(nanos);
        this.f38151k = jClampKeepAliveTimeInNanos;
        if (jClampKeepAliveTimeInNanos >= f38137u) {
            this.f38151k = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // p000.dr6, p000.pr9
    public g0c keepAliveTimeout(long j, TimeUnit timeUnit) {
        v7d.checkArgument(j > 0, "keepalive timeout must be positive");
        long nanos = timeUnit.toNanos(j);
        this.f38152l = nanos;
        this.f38152l = vp8.clampKeepAliveTimeoutInNanos(nanos);
        return this;
    }

    @Override // p000.dr6, p000.pr9
    public g0c keepAliveWithoutCalls(boolean z) {
        this.f38154n = z;
        return this;
    }

    @Override // p000.dr6, p000.pr9
    public g0c maxInboundMessageSize(int i) {
        v7d.checkArgument(i >= 0, "negative max");
        this.f38155o = i;
        return this;
    }

    @Override // p000.dr6, p000.pr9
    public g0c maxInboundMetadataSize(int i) {
        v7d.checkArgument(i > 0, "maxInboundMetadataSize must be > 0");
        this.f38156p = i;
        return this;
    }

    @Override // p000.dr6, p000.pr9
    public g0c usePlaintext() {
        v7d.checkState(!this.f38147g, "Cannot change security when using ChannelCredentials");
        this.f38150j = EnumC6071c.PLAINTEXT;
        return this;
    }

    @Override // p000.dr6, p000.pr9
    public g0c useTransportSecurity() {
        v7d.checkState(!this.f38147g, "Cannot change security when using ChannelCredentials");
        this.f38150j = EnumC6071c.TLS;
        return this;
    }

    public g0c(String str, eu1 eu1Var, pn1 pn1Var, SSLSocketFactory sSLSocketFactory) {
        this.f38142b = rhh.getDefaultFactory();
        this.f38143c = f38139w;
        this.f38144d = baf.forResource(oc7.f67130L);
        this.f38149i = f38136t;
        EnumC6071c enumC6071c = EnumC6071c.TLS;
        this.f38150j = enumC6071c;
        this.f38151k = Long.MAX_VALUE;
        this.f38152l = oc7.f67119A;
        this.f38153m = 65535;
        this.f38155o = 4194304;
        this.f38156p = Integer.MAX_VALUE;
        this.f38157q = false;
        C6069a c6069a = null;
        this.f38141a = new rr9(str, eu1Var, pn1Var, new C6073e(this, c6069a), new C6072d(this, c6069a));
        this.f38146f = sSLSocketFactory;
        this.f38150j = sSLSocketFactory == null ? EnumC6071c.PLAINTEXT : enumC6071c;
        this.f38147g = true;
    }
}
