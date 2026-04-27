package p000;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: loaded from: classes7.dex */
public final class an7 extends qid {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final SocketAddress f2145a;

    /* JADX INFO: renamed from: b */
    public final InetSocketAddress f2146b;

    /* JADX INFO: renamed from: c */
    @eib
    public final String f2147c;

    /* JADX INFO: renamed from: d */
    @eib
    public final String f2148d;

    /* JADX INFO: renamed from: an7$b */
    public static final class C0338b {

        /* JADX INFO: renamed from: a */
        public SocketAddress f2149a;

        /* JADX INFO: renamed from: b */
        public InetSocketAddress f2150b;

        /* JADX INFO: renamed from: c */
        @eib
        public String f2151c;

        /* JADX INFO: renamed from: d */
        @eib
        public String f2152d;

        public an7 build() {
            return new an7(this.f2149a, this.f2150b, this.f2151c, this.f2152d);
        }

        public C0338b setPassword(@eib String str) {
            this.f2152d = str;
            return this;
        }

        public C0338b setProxyAddress(SocketAddress socketAddress) {
            this.f2149a = (SocketAddress) v7d.checkNotNull(socketAddress, "proxyAddress");
            return this;
        }

        public C0338b setTargetAddress(InetSocketAddress inetSocketAddress) {
            this.f2150b = (InetSocketAddress) v7d.checkNotNull(inetSocketAddress, "targetAddress");
            return this;
        }

        public C0338b setUsername(@eib String str) {
            this.f2151c = str;
            return this;
        }

        private C0338b() {
        }
    }

    public static C0338b newBuilder() {
        return new C0338b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof an7)) {
            return false;
        }
        an7 an7Var = (an7) obj;
        return okb.equal(this.f2145a, an7Var.f2145a) && okb.equal(this.f2146b, an7Var.f2146b) && okb.equal(this.f2147c, an7Var.f2147c) && okb.equal(this.f2148d, an7Var.f2148d);
    }

    @eib
    public String getPassword() {
        return this.f2148d;
    }

    public SocketAddress getProxyAddress() {
        return this.f2145a;
    }

    public InetSocketAddress getTargetAddress() {
        return this.f2146b;
    }

    @eib
    public String getUsername() {
        return this.f2147c;
    }

    public int hashCode() {
        return okb.hashCode(this.f2145a, this.f2146b, this.f2147c, this.f2148d);
    }

    public String toString() {
        return yya.toStringHelper(this).add("proxyAddr", this.f2145a).add("targetAddr", this.f2146b).add(zj7.f105250c, this.f2147c).add("hasPassword", this.f2148d != null).toString();
    }

    private an7(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, @eib String str, @eib String str2) {
        v7d.checkNotNull(socketAddress, "proxyAddress");
        v7d.checkNotNull(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            v7d.checkState(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f2145a = socketAddress;
        this.f2146b = inetSocketAddress;
        this.f2147c = str;
        this.f2148d = str2;
    }
}
