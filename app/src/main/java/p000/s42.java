package p000;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes7.dex */
public interface s42 extends Closeable {

    /* JADX INFO: renamed from: s42$a */
    public static final class C12428a {

        /* JADX INFO: renamed from: a */
        public pu1 f80614a;

        /* JADX INFO: renamed from: b */
        public String f80615b = "unknown-authority";

        /* JADX INFO: renamed from: c */
        public sc0 f80616c = sc0.f81180c;

        /* JADX INFO: renamed from: d */
        @eib
        public String f80617d;

        /* JADX INFO: renamed from: e */
        @eib
        public an7 f80618e;

        public boolean equals(Object obj) {
            if (!(obj instanceof C12428a)) {
                return false;
            }
            C12428a c12428a = (C12428a) obj;
            return this.f80615b.equals(c12428a.f80615b) && this.f80616c.equals(c12428a.f80616c) && okb.equal(this.f80617d, c12428a.f80617d) && okb.equal(this.f80618e, c12428a.f80618e);
        }

        public String getAuthority() {
            return this.f80615b;
        }

        public pu1 getChannelLogger() {
            return this.f80614a;
        }

        public sc0 getEagAttributes() {
            return this.f80616c;
        }

        @eib
        public an7 getHttpConnectProxiedSocketAddress() {
            return this.f80618e;
        }

        @eib
        public String getUserAgent() {
            return this.f80617d;
        }

        public int hashCode() {
            return okb.hashCode(this.f80615b, this.f80616c, this.f80617d, this.f80618e);
        }

        public C12428a setAuthority(String str) {
            this.f80615b = (String) v7d.checkNotNull(str, "authority");
            return this;
        }

        public C12428a setChannelLogger(pu1 pu1Var) {
            this.f80614a = pu1Var;
            return this;
        }

        public C12428a setEagAttributes(sc0 sc0Var) {
            v7d.checkNotNull(sc0Var, "eagAttributes");
            this.f80616c = sc0Var;
            return this;
        }

        public C12428a setHttpConnectProxiedSocketAddress(@eib an7 an7Var) {
            this.f80618e = an7Var;
            return this;
        }

        public C12428a setUserAgent(@eib String str) {
            this.f80617d = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: s42$b */
    public static final class C12429b {

        /* JADX INFO: renamed from: a */
        public final s42 f80619a;

        /* JADX INFO: renamed from: b */
        @eib
        public final pn1 f80620b;

        public C12429b(s42 s42Var, @eib pn1 pn1Var) {
            this.f80619a = (s42) v7d.checkNotNull(s42Var, "transportFactory");
            this.f80620b = pn1Var;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    ScheduledExecutorService getScheduledExecutorService();

    Collection<Class<? extends SocketAddress>> getSupportedSocketAddressTypes();

    qr2 newClientTransport(SocketAddress socketAddress, C12428a c12428a, pu1 pu1Var);

    @dy1
    @eib
    C12429b swapChannelCredentials(eu1 eu1Var);
}
