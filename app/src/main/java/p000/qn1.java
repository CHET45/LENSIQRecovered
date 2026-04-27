package p000;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import p000.hta;
import p000.pn1;
import p000.s42;

/* JADX INFO: loaded from: classes7.dex */
public final class qn1 implements s42 {

    /* JADX INFO: renamed from: a */
    public final s42 f74977a;

    /* JADX INFO: renamed from: b */
    public final pn1 f74978b;

    /* JADX INFO: renamed from: c */
    public final Executor f74979c;

    /* JADX INFO: renamed from: qn1$a */
    public class C11565a extends or6 {

        /* JADX INFO: renamed from: a */
        public final qr2 f74980a;

        /* JADX INFO: renamed from: b */
        public final String f74981b;

        /* JADX INFO: renamed from: d */
        public volatile n4g f74983d;

        /* JADX INFO: renamed from: e */
        @vc7("this")
        public n4g f74984e;

        /* JADX INFO: renamed from: f */
        @vc7("this")
        public n4g f74985f;

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f74982c = new AtomicInteger(-2147483647);

        /* JADX INFO: renamed from: g */
        public final hta.InterfaceC7014a f74986g = new a();

        /* JADX INFO: renamed from: qn1$a$a */
        public class a implements hta.InterfaceC7014a {
            public a() {
            }

            @Override // p000.hta.InterfaceC7014a
            public void onComplete() {
                if (C11565a.this.f74982c.decrementAndGet() == 0) {
                    C11565a.this.maybeShutdown();
                }
            }
        }

        /* JADX INFO: renamed from: qn1$a$b */
        public class b extends pn1.AbstractC11035b {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ rua f74989a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ rn1 f74990b;

            public b(rua ruaVar, rn1 rn1Var) {
                this.f74989a = ruaVar;
                this.f74990b = rn1Var;
            }

            @Override // p000.pn1.AbstractC11035b
            public String getAuthority() {
                return (String) yya.firstNonNull(this.f74990b.getAuthority(), C11565a.this.f74981b);
            }

            @Override // p000.pn1.AbstractC11035b
            public rn1 getCallOptions() {
                return this.f74990b;
            }

            @Override // p000.pn1.AbstractC11035b
            public rua<?, ?> getMethodDescriptor() {
                return this.f74989a;
            }

            @Override // p000.pn1.AbstractC11035b
            public eue getSecurityLevel() {
                return (eue) yya.firstNonNull((eue) C11565a.this.f74980a.getAttributes().get(dc7.f29283a), eue.NONE);
            }

            @Override // p000.pn1.AbstractC11035b
            public sc0 getTransportAttrs() {
                return C11565a.this.f74980a.getAttributes();
            }
        }

        public C11565a(qr2 qr2Var, String str) {
            this.f74980a = (qr2) v7d.checkNotNull(qr2Var, "delegate");
            this.f74981b = (String) v7d.checkNotNull(str, "authority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void maybeShutdown() {
            synchronized (this) {
                try {
                    if (this.f74982c.get() != 0) {
                        return;
                    }
                    n4g n4gVar = this.f74984e;
                    n4g n4gVar2 = this.f74985f;
                    this.f74984e = null;
                    this.f74985f = null;
                    if (n4gVar != null) {
                        super.shutdown(n4gVar);
                    }
                    if (n4gVar2 != null) {
                        super.shutdownNow(n4gVar2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.or6
        /* JADX INFO: renamed from: a */
        public qr2 mo18816a() {
            return this.f74980a;
        }

        @Override // p000.or6, p000.r42
        public o42 newStream(rua<?, ?> ruaVar, fta ftaVar, rn1 rn1Var, q42[] q42VarArr) {
            pn1 credentials = rn1Var.getCredentials();
            if (credentials == null) {
                credentials = qn1.this.f74978b;
            } else if (qn1.this.f74978b != null) {
                credentials = new jm2(qn1.this.f74978b, credentials);
            }
            if (credentials == null) {
                return this.f74982c.get() >= 0 ? new dp5(this.f74983d, q42VarArr) : this.f74980a.newStream(ruaVar, ftaVar, rn1Var, q42VarArr);
            }
            hta htaVar = new hta(this.f74980a, ruaVar, ftaVar, rn1Var, this.f74986g, q42VarArr);
            if (this.f74982c.incrementAndGet() > 0) {
                this.f74986g.onComplete();
                return new dp5(this.f74983d, q42VarArr);
            }
            try {
                credentials.applyRequestMetadata(new b(ruaVar, rn1Var), ((credentials instanceof eb8) && ((eb8) credentials).isSpecificExecutorRequired() && rn1Var.getExecutor() != null) ? rn1Var.getExecutor() : qn1.this.f74979c, htaVar);
            } catch (Throwable th) {
                htaVar.fail(n4g.f63266m.withDescription("Credentials should use fail() instead of throwing exceptions").withCause(th));
            }
            return htaVar.m12602a();
        }

        @Override // p000.or6, p000.wr9
        public void shutdown(n4g n4gVar) {
            v7d.checkNotNull(n4gVar, "status");
            synchronized (this) {
                try {
                    if (this.f74982c.get() < 0) {
                        this.f74983d = n4gVar;
                        this.f74982c.addAndGet(Integer.MAX_VALUE);
                        if (this.f74982c.get() != 0) {
                            this.f74984e = n4gVar;
                        } else {
                            super.shutdown(n4gVar);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.or6, p000.wr9
        public void shutdownNow(n4g n4gVar) {
            v7d.checkNotNull(n4gVar, "status");
            synchronized (this) {
                try {
                    if (this.f74982c.get() < 0) {
                        this.f74983d = n4gVar;
                        this.f74982c.addAndGet(Integer.MAX_VALUE);
                    } else if (this.f74985f != null) {
                        return;
                    }
                    if (this.f74982c.get() != 0) {
                        this.f74985f = n4gVar;
                    } else {
                        super.shutdownNow(n4gVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public qn1(s42 s42Var, pn1 pn1Var, Executor executor) {
        this.f74977a = (s42) v7d.checkNotNull(s42Var, "delegate");
        this.f74978b = pn1Var;
        this.f74979c = (Executor) v7d.checkNotNull(executor, "appExecutor");
    }

    @Override // p000.s42, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f74977a.close();
    }

    @Override // p000.s42
    public ScheduledExecutorService getScheduledExecutorService() {
        return this.f74977a.getScheduledExecutorService();
    }

    @Override // p000.s42
    public Collection<Class<? extends SocketAddress>> getSupportedSocketAddressTypes() {
        return this.f74977a.getSupportedSocketAddressTypes();
    }

    @Override // p000.s42
    public qr2 newClientTransport(SocketAddress socketAddress, s42.C12428a c12428a, pu1 pu1Var) {
        return new C11565a(this.f74977a.newClientTransport(socketAddress, c12428a, pu1Var), c12428a.getAuthority());
    }

    @Override // p000.s42
    public s42.C12429b swapChannelCredentials(eu1 eu1Var) {
        throw new UnsupportedOperationException();
    }
}
