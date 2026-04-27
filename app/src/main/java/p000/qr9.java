package p000;

import com.blankj.utilcode.util.C2473f;
import java.lang.Thread;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p000.da8;
import p000.ii5;
import p000.j8e;
import p000.ja8;
import p000.no0;
import p000.pu1;
import p000.q42;
import p000.q8b;
import p000.rr9;
import p000.s42;
import p000.sc0;
import p000.sj3;
import p000.thg;
import p000.ub8;
import p000.vn1;
import p000.vr9;
import p000.w22;
import p000.wi0;
import p000.wr9;
import p000.x22;
import p000.x8e;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
@kyg
public final class qr9 extends or9 implements xa8<da8.C4685b> {

    /* JADX INFO: renamed from: n0 */
    @gdi
    public static final Logger f75199n0 = Logger.getLogger(qr9.class.getName());

    /* JADX INFO: renamed from: o0 */
    @gdi
    public static final Pattern f75200o0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* JADX INFO: renamed from: p0 */
    public static final long f75201p0 = -1;

    /* JADX INFO: renamed from: q0 */
    public static final long f75202q0 = 5;

    /* JADX INFO: renamed from: r0 */
    @gdi
    public static final n4g f75203r0;

    /* JADX INFO: renamed from: s0 */
    @gdi
    public static final n4g f75204s0;

    /* JADX INFO: renamed from: t0 */
    @gdi
    public static final n4g f75205t0;

    /* JADX INFO: renamed from: u0 */
    public static final vr9 f75206u0;

    /* JADX INFO: renamed from: v0 */
    public static final ja8 f75207v0;

    /* JADX INFO: renamed from: w0 */
    public static final w22<Object, Object> f75208w0;

    /* JADX INFO: renamed from: A */
    public final bu1 f75209A;

    /* JADX INFO: renamed from: B */
    public final List<t42> f75210B;

    /* JADX INFO: renamed from: C */
    @eib
    public final String f75211C;

    /* JADX INFO: renamed from: D */
    public q8b f75212D;

    /* JADX INFO: renamed from: E */
    public boolean f75213E;

    /* JADX INFO: renamed from: F */
    @eib
    public C11629u f75214F;

    /* JADX INFO: renamed from: G */
    @eib
    public volatile zb9.AbstractC16074k f75215G;

    /* JADX INFO: renamed from: H */
    public boolean f75216H;

    /* JADX INFO: renamed from: I */
    public final Set<ub8> f75217I;

    /* JADX INFO: renamed from: J */
    @eib
    public Collection<C11631w.g<?, ?>> f75218J;

    /* JADX INFO: renamed from: K */
    public final Object f75219K;

    /* JADX INFO: renamed from: L */
    public final Set<l5c> f75220L;

    /* JADX INFO: renamed from: M */
    public final s34 f75221M;

    /* JADX INFO: renamed from: N */
    public final C11609a0 f75222N;

    /* JADX INFO: renamed from: O */
    public final AtomicBoolean f75223O;

    /* JADX INFO: renamed from: P */
    public boolean f75224P;

    /* JADX INFO: renamed from: Q */
    public boolean f75225Q;

    /* JADX INFO: renamed from: R */
    public volatile boolean f75226R;

    /* JADX INFO: renamed from: S */
    public final CountDownLatch f75227S;

    /* JADX INFO: renamed from: T */
    public final vn1.InterfaceC14172b f75228T;

    /* JADX INFO: renamed from: U */
    public final vn1 f75229U;

    /* JADX INFO: renamed from: V */
    public final zu1 f75230V;

    /* JADX INFO: renamed from: W */
    public final pu1 f75231W;

    /* JADX INFO: renamed from: X */
    public final da8 f75232X;

    /* JADX INFO: renamed from: Y */
    public final C11631w f75233Y;

    /* JADX INFO: renamed from: Z */
    public EnumC11632x f75234Z;

    /* JADX INFO: renamed from: a */
    public final cb8 f75235a;

    /* JADX INFO: renamed from: a0 */
    public vr9 f75236a0;

    /* JADX INFO: renamed from: b */
    public final String f75237b;

    /* JADX INFO: renamed from: b0 */
    @eib
    public final vr9 f75238b0;

    /* JADX INFO: renamed from: c */
    @eib
    public final String f75239c;

    /* JADX INFO: renamed from: c0 */
    public boolean f75240c0;

    /* JADX INFO: renamed from: d */
    public final t8b f75241d;

    /* JADX INFO: renamed from: d0 */
    public final boolean f75242d0;

    /* JADX INFO: renamed from: e */
    public final q8b.C11372b f75243e;

    /* JADX INFO: renamed from: e0 */
    public final j8e.C7805u f75244e0;

    /* JADX INFO: renamed from: f */
    public final wi0 f75245f;

    /* JADX INFO: renamed from: f0 */
    public final long f75246f0;

    /* JADX INFO: renamed from: g */
    public final s42 f75247g;

    /* JADX INFO: renamed from: g0 */
    public final long f75248g0;

    /* JADX INFO: renamed from: h */
    @eib
    public final eu1 f75249h;

    /* JADX INFO: renamed from: h0 */
    public final boolean f75250h0;

    /* JADX INFO: renamed from: i */
    public final s42 f75251i;

    /* JADX INFO: renamed from: i0 */
    public final sj3.AbstractC12615c f75252i0;

    /* JADX INFO: renamed from: j */
    public final s42 f75253j;

    /* JADX INFO: renamed from: j0 */
    public final wr9.InterfaceC14756a f75254j0;

    /* JADX INFO: renamed from: k */
    public final ScheduledExecutorServiceC11633y f75255k;

    /* JADX INFO: renamed from: k0 */
    @gdi
    public final cz7<Object> f75256k0;

    /* JADX INFO: renamed from: l */
    public final Executor f75257l;

    /* JADX INFO: renamed from: l0 */
    public final C11623o f75258l0;

    /* JADX INFO: renamed from: m */
    public final gkb<? extends Executor> f75259m;

    /* JADX INFO: renamed from: m0 */
    public final l5e f75260m0;

    /* JADX INFO: renamed from: n */
    public final gkb<? extends Executor> f75261n;

    /* JADX INFO: renamed from: o */
    public final ExecutorC11626r f75262o;

    /* JADX INFO: renamed from: p */
    public final ExecutorC11626r f75263p;

    /* JADX INFO: renamed from: q */
    public final q0h f75264q;

    /* JADX INFO: renamed from: r */
    public final int f75265r;

    /* JADX INFO: renamed from: s */
    @gdi
    public final thg f75266s;

    /* JADX INFO: renamed from: t */
    public boolean f75267t;

    /* JADX INFO: renamed from: u */
    public final bm3 f75268u;

    /* JADX INFO: renamed from: v */
    public final ho2 f75269v;

    /* JADX INFO: renamed from: w */
    public final lfg<d5g> f75270w;

    /* JADX INFO: renamed from: x */
    public final long f75271x;

    /* JADX INFO: renamed from: y */
    public final ys2 f75272y;

    /* JADX INFO: renamed from: z */
    public final no0.InterfaceC9959a f75273z;

    /* JADX INFO: renamed from: qr9$a */
    public class C11608a extends ja8 {
        @Override // p000.ja8
        public ja8.C7824b selectConfig(zb9.AbstractC16071h abstractC16071h) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* JADX INFO: renamed from: qr9$b */
    public final class RunnableC11610b implements Runnable {
        public RunnableC11610b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            qr9.this.cancelIdleTimer(true);
        }
    }

    /* JADX INFO: renamed from: qr9$c */
    public final class C11611c implements vn1.InterfaceC14172b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ q0h f75279a;

        public C11611c(q0h q0hVar) {
            this.f75279a = q0hVar;
        }

        @Override // p000.vn1.InterfaceC14172b
        public vn1 create() {
            return new vn1(this.f75279a);
        }
    }

    /* JADX INFO: renamed from: qr9$d */
    public final class RunnableC11612d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f75281a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ws2 f75282b;

        public RunnableC11612d(Runnable runnable, ws2 ws2Var) {
            this.f75281a = runnable;
            this.f75282b = ws2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            qr9.this.f75272y.m26341c(this.f75281a, qr9.this.f75257l, this.f75282b);
        }
    }

    /* JADX INFO: renamed from: qr9$e */
    public final class C11613e extends zb9.AbstractC16074k {

        /* JADX INFO: renamed from: a */
        public final zb9.C16070g f75284a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Throwable f75285b;

        public C11613e(Throwable th) {
            this.f75285b = th;
            this.f75284a = zb9.C16070g.withDrop(n4g.f63272s.withDescription("Panic! This is a bug!").withCause(th));
        }

        @Override // p000.zb9.AbstractC16074k
        public zb9.C16070g pickSubchannel(zb9.AbstractC16071h abstractC16071h) {
            return this.f75284a;
        }

        public String toString() {
            return yya.toStringHelper((Class<?>) C11613e.class).add("panicPickResult", this.f75284a).toString();
        }
    }

    /* JADX INFO: renamed from: qr9$f */
    public final class RunnableC11614f implements Runnable {
        public RunnableC11614f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (qr9.this.f75223O.get() || qr9.this.f75214F == null) {
                return;
            }
            qr9.this.cancelIdleTimer(false);
            qr9.this.enterIdleMode();
        }
    }

    /* JADX INFO: renamed from: qr9$g */
    public final class RunnableC11615g implements Runnable {
        public RunnableC11615g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            qr9.this.m20591v0();
            if (qr9.this.f75215G != null) {
                qr9.this.f75215G.requestConnection();
            }
            if (qr9.this.f75214F != null) {
                qr9.this.f75214F.f75321a.m24565d();
            }
        }
    }

    /* JADX INFO: renamed from: qr9$h */
    public final class RunnableC11616h implements Runnable {
        public RunnableC11616h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (qr9.this.f75223O.get()) {
                return;
            }
            if (qr9.this.f75213E) {
                qr9.this.refreshNameResolution();
            }
            Iterator it = qr9.this.f75217I.iterator();
            while (it.hasNext()) {
                ((ub8) it.next()).m23211L();
            }
            Iterator it2 = qr9.this.f75220L.iterator();
            while (it2.hasNext()) {
                ((l5c) it2.next()).resetConnectBackoff();
            }
        }
    }

    /* JADX INFO: renamed from: qr9$i */
    public final class RunnableC11617i implements Runnable {
        public RunnableC11617i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            qr9.this.f75231W.log(pu1.EnumC11124a.INFO, "Entering SHUTDOWN state");
            qr9.this.f75272y.m26340b(ws2.SHUTDOWN);
        }
    }

    /* JADX INFO: renamed from: qr9$j */
    public final class RunnableC11618j implements Runnable {
        public RunnableC11618j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (qr9.this.f75224P) {
                return;
            }
            qr9.this.f75224P = true;
            qr9.this.maybeShutdownNowSubchannels();
        }
    }

    /* JADX INFO: renamed from: qr9$k */
    public final class RunnableC11619k implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y6f f75292a;

        public RunnableC11619k(y6f y6fVar) {
            this.f75292a = y6fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            da8.C4685b.a aVar = new da8.C4685b.a();
            qr9.this.f75229U.m24076a(aVar);
            qr9.this.f75230V.m27094g(aVar);
            aVar.setTarget(qr9.this.f75237b).setState(qr9.this.f75272y.m26339a());
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(qr9.this.f75217I);
            arrayList.addAll(qr9.this.f75220L);
            aVar.setSubchannels(arrayList);
            this.f75292a.set(aVar.build());
        }
    }

    /* JADX INFO: renamed from: qr9$l */
    public class C11620l implements Thread.UncaughtExceptionHandler {
        public C11620l() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            qr9.f75199n0.log(Level.SEVERE, "[" + qr9.this.getLogId() + "] Uncaught exception in the SynchronizationContext. Panic!", th);
            qr9.this.m20594z0(th);
        }
    }

    /* JADX INFO: renamed from: qr9$m */
    public class C11621m extends vs6 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f75295b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11621m(q8b q8bVar, String str) {
            super(q8bVar);
            this.f75295b = str;
        }

        @Override // p000.vs6, p000.q8b
        public String getServiceAuthority() {
            return this.f75295b;
        }
    }

    /* JADX INFO: renamed from: qr9$n */
    public class C11622n extends w22<Object, Object> {
        @Override // p000.w22
        public void cancel(String str, Throwable th) {
        }

        @Override // p000.w22
        public void halfClose() {
        }

        @Override // p000.w22
        public boolean isReady() {
            return false;
        }

        @Override // p000.w22
        public void request(int i) {
        }

        @Override // p000.w22
        public void sendMessage(Object obj) {
        }

        @Override // p000.w22
        public void start(w22.AbstractC14364a<Object> abstractC14364a, fta ftaVar) {
        }
    }

    /* JADX INFO: renamed from: qr9$o */
    public final class C11623o implements x22.InterfaceC14881e {

        /* JADX INFO: renamed from: a */
        public volatile j8e.C7789e0 f75296a;

        /* JADX INFO: renamed from: qr9$o$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                qr9.this.m20591v0();
            }
        }

        /* JADX INFO: renamed from: qr9$o$b */
        public final class b<ReqT> extends j8e<ReqT> {

            /* JADX INFO: renamed from: E */
            public final /* synthetic */ rua f75299E;

            /* JADX INFO: renamed from: F */
            public final /* synthetic */ fta f75300F;

            /* JADX INFO: renamed from: G */
            public final /* synthetic */ rn1 f75301G;

            /* JADX INFO: renamed from: H */
            public final /* synthetic */ u8e f75302H;

            /* JADX INFO: renamed from: I */
            public final /* synthetic */ ij7 f75303I;

            /* JADX INFO: renamed from: J */
            public final /* synthetic */ fx2 f75304J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(rua ruaVar, fta ftaVar, rn1 rn1Var, u8e u8eVar, ij7 ij7Var, fx2 fx2Var) {
                super(ruaVar, ftaVar, qr9.this.f75244e0, qr9.this.f75246f0, qr9.this.f75248g0, qr9.this.getCallExecutor(rn1Var), qr9.this.f75251i.getScheduledExecutorService(), u8eVar, ij7Var, C11623o.this.f75296a);
                this.f75299E = ruaVar;
                this.f75300F = ftaVar;
                this.f75301G = rn1Var;
                this.f75302H = u8eVar;
                this.f75303I = ij7Var;
                this.f75304J = fx2Var;
            }

            @Override // p000.j8e
            /* JADX INFO: renamed from: M */
            public o42 mo13882M(fta ftaVar, q42.AbstractC11305a abstractC11305a, int i, boolean z) {
                rn1 rn1VarWithStreamTracerFactory = this.f75301G.withStreamTracerFactory(abstractC11305a);
                q42[] clientStreamTracers = oc7.getClientStreamTracers(rn1VarWithStreamTracerFactory, ftaVar, i, z);
                r42 transport = C11623o.this.getTransport(new pvc(this.f75299E, ftaVar, rn1VarWithStreamTracerFactory));
                fx2 fx2VarAttach = this.f75304J.attach();
                try {
                    return transport.newStream(this.f75299E, ftaVar, rn1VarWithStreamTracerFactory, clientStreamTracers);
                } finally {
                    this.f75304J.detach(fx2VarAttach);
                }
            }

            @Override // p000.j8e
            /* JADX INFO: renamed from: N */
            public void mo13883N() {
                qr9.this.f75222N.m20598d(this);
            }

            @Override // p000.j8e
            /* JADX INFO: renamed from: O */
            public n4g mo13884O() {
                return qr9.this.f75222N.m20595a(this);
            }
        }

        private C11623o() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public r42 getTransport(zb9.AbstractC16071h abstractC16071h) {
            zb9.AbstractC16074k abstractC16074k = qr9.this.f75215G;
            if (qr9.this.f75223O.get()) {
                return qr9.this.f75221M;
            }
            if (abstractC16074k == null) {
                qr9.this.f75266s.execute(new a());
                return qr9.this.f75221M;
            }
            r42 r42VarM18575c = oc7.m18575c(abstractC16074k.pickSubchannel(abstractC16071h), abstractC16071h.getCallOptions().isWaitForReady());
            return r42VarM18575c != null ? r42VarM18575c : qr9.this.f75221M;
        }

        @Override // p000.x22.InterfaceC14881e
        public o42 newStream(rua<?, ?> ruaVar, rn1 rn1Var, fta ftaVar, fx2 fx2Var) {
            if (qr9.this.f75250h0) {
                vr9.C14229b c14229b = (vr9.C14229b) rn1Var.getOption(vr9.C14229b.f92064g);
                return new b(ruaVar, ftaVar, rn1Var, c14229b == null ? null : c14229b.f92069e, c14229b != null ? c14229b.f92070f : null, fx2Var);
            }
            r42 transport = getTransport(new pvc(ruaVar, ftaVar, rn1Var));
            fx2 fx2VarAttach = fx2Var.attach();
            try {
                return transport.newStream(ruaVar, ftaVar, rn1Var, oc7.getClientStreamTracers(rn1Var, ftaVar, 0, false));
            } finally {
                fx2Var.detach(fx2VarAttach);
            }
        }

        public /* synthetic */ C11623o(qr9 qr9Var, C11608a c11608a) {
            this();
        }
    }

    /* JADX INFO: renamed from: qr9$p */
    public static final class C11624p<ReqT, RespT> extends fr6<ReqT, RespT> {

        /* JADX INFO: renamed from: a */
        public final ja8 f75306a;

        /* JADX INFO: renamed from: b */
        public final bu1 f75307b;

        /* JADX INFO: renamed from: c */
        public final Executor f75308c;

        /* JADX INFO: renamed from: d */
        public final rua<ReqT, RespT> f75309d;

        /* JADX INFO: renamed from: e */
        public final fx2 f75310e;

        /* JADX INFO: renamed from: f */
        public rn1 f75311f;

        /* JADX INFO: renamed from: g */
        public w22<ReqT, RespT> f75312g;

        /* JADX INFO: renamed from: qr9$p$a */
        public class a extends fy2 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ w22.AbstractC14364a f75313b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ n4g f75314c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w22.AbstractC14364a abstractC14364a, n4g n4gVar) {
                super(C11624p.this.f75310e);
                this.f75313b = abstractC14364a;
                this.f75314c = n4gVar;
            }

            @Override // p000.fy2
            public void runInContext() {
                this.f75313b.onClose(this.f75314c, new fta());
            }
        }

        public C11624p(ja8 ja8Var, bu1 bu1Var, Executor executor, rua<ReqT, RespT> ruaVar, rn1 rn1Var) {
            this.f75306a = ja8Var;
            this.f75307b = bu1Var;
            this.f75309d = ruaVar;
            executor = rn1Var.getExecutor() != null ? rn1Var.getExecutor() : executor;
            this.f75308c = executor;
            this.f75311f = rn1Var.withExecutor(executor);
            this.f75310e = fx2.current();
        }

        private void executeCloseObserverInContext(w22.AbstractC14364a<RespT> abstractC14364a, n4g n4gVar) {
            this.f75308c.execute(new a(abstractC14364a, n4gVar));
        }

        @Override // p000.fr6, p000.eic
        /* JADX INFO: renamed from: a */
        public w22<ReqT, RespT> mo9654a() {
            return this.f75312g;
        }

        @Override // p000.fr6, p000.eic, p000.w22
        public void cancel(@eib String str, @eib Throwable th) {
            w22<ReqT, RespT> w22Var = this.f75312g;
            if (w22Var != null) {
                w22Var.cancel(str, th);
            }
        }

        @Override // p000.fr6, p000.w22
        public void start(w22.AbstractC14364a<RespT> abstractC14364a, fta ftaVar) {
            ja8.C7824b c7824bSelectConfig = this.f75306a.selectConfig(new pvc(this.f75309d, ftaVar, this.f75311f));
            n4g status = c7824bSelectConfig.getStatus();
            if (!status.isOk()) {
                executeCloseObserverInContext(abstractC14364a, oc7.replaceInappropriateControlPlaneStatus(status));
                this.f75312g = qr9.f75208w0;
                return;
            }
            d42 interceptor = c7824bSelectConfig.getInterceptor();
            vr9.C14229b c14229bM24145f = ((vr9) c7824bSelectConfig.getConfig()).m24145f(this.f75309d);
            if (c14229bM24145f != null) {
                this.f75311f = this.f75311f.withOption(vr9.C14229b.f92064g, c14229bM24145f);
            }
            if (interceptor != null) {
                this.f75312g = interceptor.interceptCall(this.f75309d, this.f75311f, this.f75307b);
            } else {
                this.f75312g = this.f75307b.newCall(this.f75309d, this.f75311f);
            }
            this.f75312g.start(abstractC14364a, ftaVar);
        }
    }

    /* JADX INFO: renamed from: qr9$q */
    public final class C11625q implements wr9.InterfaceC14756a {
        private C11625q() {
        }

        @Override // p000.wr9.InterfaceC14756a
        public sc0 filterTransport(sc0 sc0Var) {
            return sc0Var;
        }

        @Override // p000.wr9.InterfaceC14756a
        public void transportInUse(boolean z) {
            qr9 qr9Var = qr9.this;
            qr9Var.f75256k0.updateObjectInUse(qr9Var.f75221M, z);
        }

        @Override // p000.wr9.InterfaceC14756a
        public void transportReady() {
        }

        @Override // p000.wr9.InterfaceC14756a
        public void transportShutdown(n4g n4gVar) {
            v7d.checkState(qr9.this.f75223O.get(), "Channel must have been shut down");
        }

        @Override // p000.wr9.InterfaceC14756a
        public void transportTerminated() {
            v7d.checkState(qr9.this.f75223O.get(), "Channel must have been shut down");
            qr9.this.f75225Q = true;
            qr9.this.shutdownNameResolverAndLoadBalancer(false);
            qr9.this.maybeShutdownNowSubchannels();
            qr9.this.maybeTerminateChannel();
        }

        public /* synthetic */ C11625q(qr9 qr9Var, C11608a c11608a) {
            this();
        }
    }

    /* JADX INFO: renamed from: qr9$r */
    @gdi
    public static final class ExecutorC11626r implements Executor {

        /* JADX INFO: renamed from: a */
        public final gkb<? extends Executor> f75317a;

        /* JADX INFO: renamed from: b */
        public Executor f75318b;

        public ExecutorC11626r(gkb<? extends Executor> gkbVar) {
            this.f75317a = (gkb) v7d.checkNotNull(gkbVar, "executorPool");
        }

        /* JADX INFO: renamed from: a */
        public synchronized Executor m20601a() {
            try {
                if (this.f75318b == null) {
                    this.f75318b = (Executor) v7d.checkNotNull(this.f75317a.getObject(), "%s.getObject()", this.f75318b);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f75318b;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            m20601a().execute(runnable);
        }

        public synchronized void release() {
            Executor executor = this.f75318b;
            if (executor != null) {
                this.f75318b = this.f75317a.returnObject(executor);
            }
        }
    }

    /* JADX INFO: renamed from: qr9$s */
    public final class C11627s extends cz7<Object> {
        private C11627s() {
        }

        @Override // p000.cz7
        /* JADX INFO: renamed from: a */
        public void mo8796a() {
            qr9.this.m20591v0();
        }

        @Override // p000.cz7
        /* JADX INFO: renamed from: b */
        public void mo8797b() {
            if (qr9.this.f75223O.get()) {
                return;
            }
            qr9.this.rescheduleIdleTimer();
        }

        public /* synthetic */ C11627s(qr9 qr9Var, C11608a c11608a) {
            this();
        }
    }

    /* JADX INFO: renamed from: qr9$t */
    public class RunnableC11628t implements Runnable {
        private RunnableC11628t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (qr9.this.f75214F == null) {
                return;
            }
            qr9.this.enterIdleMode();
        }

        public /* synthetic */ RunnableC11628t(qr9 qr9Var, C11608a c11608a) {
            this();
        }
    }

    /* JADX INFO: renamed from: qr9$u */
    public final class C11629u extends zb9.AbstractC16069f {

        /* JADX INFO: renamed from: a */
        public wi0.C14608b f75321a;

        /* JADX INFO: renamed from: qr9$u$a */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ l5c f75323a;

            public a(l5c l5cVar) {
                this.f75323a = l5cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (qr9.this.f75225Q) {
                    this.f75323a.shutdown();
                }
                if (qr9.this.f75226R) {
                    return;
                }
                qr9.this.f75220L.add(this.f75323a);
            }
        }

        /* JADX INFO: renamed from: qr9$u$b */
        public final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                qr9.this.refreshNameResolution();
            }
        }

        /* JADX INFO: renamed from: qr9$u$c */
        public final class c extends ub8.AbstractC13455l {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ l5c f75326a;

            public c(l5c l5cVar) {
                this.f75326a = l5cVar;
            }

            @Override // p000.ub8.AbstractC13455l
            /* JADX INFO: renamed from: c */
            public void mo20602c(ub8 ub8Var, xs2 xs2Var) {
                qr9.this.handleInternalSubchannelState(xs2Var);
                this.f75326a.m15313e(xs2Var);
            }

            @Override // p000.ub8.AbstractC13455l
            /* JADX INFO: renamed from: d */
            public void mo20603d(ub8 ub8Var) {
                qr9.this.f75220L.remove(this.f75326a);
                qr9.this.f75232X.removeSubchannel(ub8Var);
                this.f75326a.m15314f();
                qr9.this.maybeTerminateChannel();
            }
        }

        /* JADX INFO: renamed from: qr9$u$d */
        public final class d extends dr6<d> {

            /* JADX INFO: renamed from: a */
            public final pr9<?> f75328a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ eu1 f75329b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f75330c;

            /* JADX INFO: renamed from: qr9$u$d$a */
            public class a implements rr9.InterfaceC12216c {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C11629u f75332a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ s42 f75333b;

                public a(C11629u c11629u, s42 s42Var) {
                    this.f75332a = c11629u;
                    this.f75333b = s42Var;
                }

                @Override // p000.rr9.InterfaceC12216c
                public s42 buildClientTransportFactory() {
                    return this.f75333b;
                }
            }

            public d(eu1 eu1Var, String str) {
                pn1 pn1Var;
                s42 s42Var;
                this.f75329b = eu1Var;
                this.f75330c = str;
                if (eu1Var instanceof f) {
                    s42Var = qr9.this.f75247g;
                    pn1Var = null;
                } else {
                    s42.C12429b c12429bSwapChannelCredentials = qr9.this.f75247g.swapChannelCredentials(eu1Var);
                    if (c12429bSwapChannelCredentials == null) {
                        this.f75328a = cc7.newChannelBuilder(str, eu1Var);
                        return;
                    } else {
                        s42 s42Var2 = c12429bSwapChannelCredentials.f80619a;
                        pn1Var = c12429bSwapChannelCredentials.f80620b;
                        s42Var = s42Var2;
                    }
                }
                this.f75328a = new rr9(str, eu1Var, pn1Var, new a(C11629u.this, s42Var), new rr9.C12218e(qr9.this.f75243e.getDefaultPort())).m21489e(qr9.this.f75241d);
            }

            @Override // p000.dr6
            /* JADX INFO: renamed from: a */
            public pr9<?> mo9331a() {
                return this.f75328a;
            }
        }

        /* JADX INFO: renamed from: qr9$u$e */
        public final class e implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zb9.AbstractC16074k f75335a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ws2 f75336b;

            public e(zb9.AbstractC16074k abstractC16074k, ws2 ws2Var) {
                this.f75335a = abstractC16074k;
                this.f75336b = ws2Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11629u c11629u = C11629u.this;
                if (c11629u != qr9.this.f75214F) {
                    return;
                }
                qr9.this.updateSubchannelPicker(this.f75335a);
                if (this.f75336b != ws2.SHUTDOWN) {
                    qr9.this.f75231W.log(pu1.EnumC11124a.INFO, "Entering {0} state with picker: {1}", this.f75336b, this.f75335a);
                    qr9.this.f75272y.m26340b(this.f75336b);
                }
            }
        }

        /* JADX INFO: renamed from: qr9$u$f */
        public final class f extends eu1 {
            public f() {
            }

            @Override // p000.eu1
            public eu1 withoutBearerTokens() {
                return this;
            }
        }

        private C11629u() {
        }

        @Override // p000.zb9.AbstractC16069f
        public or9 createOobChannel(s45 s45Var, String str) {
            return createOobChannel(Collections.singletonList(s45Var), str);
        }

        @Override // p000.zb9.AbstractC16069f
        @Deprecated
        public pr9<?> createResolvingOobChannelBuilder(String str) {
            return createResolvingOobChannelBuilder(str, new f()).overrideAuthority(getAuthority());
        }

        @Override // p000.zb9.AbstractC16069f
        public String getAuthority() {
            return qr9.this.authority();
        }

        @Override // p000.zb9.AbstractC16069f
        public pu1 getChannelLogger() {
            return qr9.this.f75231W;
        }

        @Override // p000.zb9.AbstractC16069f
        public q8b.C11372b getNameResolverArgs() {
            return qr9.this.f75243e;
        }

        @Override // p000.zb9.AbstractC16069f
        public t8b getNameResolverRegistry() {
            return qr9.this.f75241d;
        }

        @Override // p000.zb9.AbstractC16069f
        public ScheduledExecutorService getScheduledExecutorService() {
            return qr9.this.f75255k;
        }

        @Override // p000.zb9.AbstractC16069f
        public thg getSynchronizationContext() {
            return qr9.this.f75266s;
        }

        @Override // p000.zb9.AbstractC16069f
        public eu1 getUnsafeChannelCredentials() {
            return qr9.this.f75249h == null ? new f() : qr9.this.f75249h;
        }

        @Override // p000.zb9.AbstractC16069f
        public void refreshNameResolution() {
            qr9.this.f75266s.throwIfNotInThisSynchronizationContext();
            qr9.this.f75266s.execute(new b());
        }

        @Override // p000.zb9.AbstractC16069f
        public void updateBalancingState(ws2 ws2Var, zb9.AbstractC16074k abstractC16074k) {
            qr9.this.f75266s.throwIfNotInThisSynchronizationContext();
            v7d.checkNotNull(ws2Var, "newState");
            v7d.checkNotNull(abstractC16074k, "newPicker");
            qr9.this.f75266s.execute(new e(abstractC16074k, ws2Var));
        }

        @Override // p000.zb9.AbstractC16069f
        public void updateOobChannelAddresses(or9 or9Var, s45 s45Var) {
            updateOobChannelAddresses(or9Var, Collections.singletonList(s45Var));
        }

        public /* synthetic */ C11629u(qr9 qr9Var, C11608a c11608a) {
            this();
        }

        @Override // p000.zb9.AbstractC16069f
        public or9 createOobChannel(List<s45> list, String str) {
            v7d.checkState(!qr9.this.f75226R, "Channel is terminated");
            long jCurrentTimeNanos = qr9.this.f75264q.currentTimeNanos();
            cb8 cb8VarAllocate = cb8.allocate("OobChannel", (String) null);
            cb8 cb8VarAllocate2 = cb8.allocate("Subchannel-OOB", str);
            zu1 zu1Var = new zu1(cb8VarAllocate, qr9.this.f75265r, jCurrentTimeNanos, "OobChannel for " + list);
            gkb gkbVar = qr9.this.f75261n;
            ScheduledExecutorService scheduledExecutorService = qr9.this.f75253j.getScheduledExecutorService();
            qr9 qr9Var = qr9.this;
            l5c l5cVar = new l5c(str, gkbVar, scheduledExecutorService, qr9Var.f75266s, qr9Var.f75228T.create(), zu1Var, qr9.this.f75232X, qr9.this.f75264q);
            zu1 zu1Var2 = qr9.this.f75230V;
            da8.C4686c.b.a description = new da8.C4686c.b.a().setDescription("Child OobChannel created");
            da8.C4686c.b.EnumC16427b enumC16427b = da8.C4686c.b.EnumC16427b.CT_INFO;
            zu1Var2.m27092e(description.setSeverity(enumC16427b).setTimestampNanos(jCurrentTimeNanos).setChannelRef(l5cVar).build());
            zu1 zu1Var3 = new zu1(cb8VarAllocate2, qr9.this.f75265r, jCurrentTimeNanos, "Subchannel for " + list);
            ub8 ub8Var = new ub8(list, str, qr9.this.f75211C, qr9.this.f75273z, qr9.this.f75253j, qr9.this.f75253j.getScheduledExecutorService(), qr9.this.f75270w, qr9.this.f75266s, new c(l5cVar), qr9.this.f75232X, qr9.this.f75228T.create(), zu1Var3, cb8VarAllocate2, new qu1(zu1Var3, qr9.this.f75264q), qr9.this.f75210B);
            zu1Var.m27092e(new da8.C4686c.b.a().setDescription("Child Subchannel created").setSeverity(enumC16427b).setTimestampNanos(jCurrentTimeNanos).setSubchannelRef(ub8Var).build());
            qr9.this.f75232X.addSubchannel(l5cVar);
            qr9.this.f75232X.addSubchannel(ub8Var);
            l5cVar.m15315g(ub8Var);
            qr9.this.f75266s.execute(new a(l5cVar));
            return l5cVar;
        }

        @Override // p000.zb9.AbstractC16069f
        public AbstractC0058a5 createSubchannel(zb9.C16065b c16065b) {
            qr9.this.f75266s.throwIfNotInThisSynchronizationContext();
            v7d.checkState(!qr9.this.f75225Q, "Channel is being terminated");
            return qr9.this.new C11634z(c16065b);
        }

        @Override // p000.zb9.AbstractC16069f
        public void updateOobChannelAddresses(or9 or9Var, List<s45> list) {
            v7d.checkArgument(or9Var instanceof l5c, "channel must have been returned from createOobChannel");
            ((l5c) or9Var).m15316h(list);
        }

        @Override // p000.zb9.AbstractC16069f
        public pr9<?> createResolvingOobChannelBuilder(String str, eu1 eu1Var) {
            v7d.checkNotNull(eu1Var, "channelCreds");
            v7d.checkState(!qr9.this.f75226R, "Channel is terminated");
            return new d(eu1Var, str).executor(qr9.this.f75257l).offloadExecutor(qr9.this.f75263p.m20601a()).maxTraceEvents(qr9.this.f75265r).proxyDetector(qr9.this.f75243e.getProxyDetector()).userAgent(qr9.this.f75211C);
        }
    }

    /* JADX INFO: renamed from: qr9$v */
    public final class C11630v extends q8b.AbstractC11375e {

        /* JADX INFO: renamed from: a */
        public final C11629u f75339a;

        /* JADX INFO: renamed from: b */
        public final q8b f75340b;

        /* JADX INFO: renamed from: qr9$v$a */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ n4g f75342a;

            public a(n4g n4gVar) {
                this.f75342a = n4gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11630v.this.handleErrorInSyncContext(this.f75342a);
            }
        }

        /* JADX INFO: renamed from: qr9$v$b */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ q8b.C11377g f75344a;

            public b(q8b.C11377g c11377g) {
                this.f75344a = c11377g;
            }

            @Override // java.lang.Runnable
            public void run() {
                vr9 vr9Var;
                if (qr9.this.f75212D != C11630v.this.f75340b) {
                    return;
                }
                List<s45> addresses = this.f75344a.getAddresses();
                pu1 pu1Var = qr9.this.f75231W;
                pu1.EnumC11124a enumC11124a = pu1.EnumC11124a.DEBUG;
                pu1Var.log(enumC11124a, "Resolved address: {0}, config={1}", addresses, this.f75344a.getAttributes());
                EnumC11632x enumC11632x = qr9.this.f75234Z;
                EnumC11632x enumC11632x2 = EnumC11632x.SUCCESS;
                if (enumC11632x != enumC11632x2) {
                    qr9.this.f75231W.log(pu1.EnumC11124a.INFO, "Address resolved: {0}", addresses);
                    qr9.this.f75234Z = enumC11632x2;
                }
                q8b.C11373c serviceConfig = this.f75344a.getServiceConfig();
                x8e.C14989b c14989b = (x8e.C14989b) this.f75344a.getAttributes().get(x8e.f97194e);
                ja8 ja8Var = (ja8) this.f75344a.getAttributes().get(ja8.f50100a);
                vr9 vr9Var2 = (serviceConfig == null || serviceConfig.getConfig() == null) ? null : (vr9) serviceConfig.getConfig();
                n4g error = serviceConfig != null ? serviceConfig.getError() : null;
                if (qr9.this.f75242d0) {
                    if (vr9Var2 != null) {
                        if (ja8Var != null) {
                            qr9.this.f75233Y.m20610f(ja8Var);
                            if (vr9Var2.m24142c() != null) {
                                qr9.this.f75231W.log(enumC11124a, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            qr9.this.f75233Y.m20610f(vr9Var2.m24142c());
                        }
                    } else if (qr9.this.f75238b0 != null) {
                        vr9Var2 = qr9.this.f75238b0;
                        qr9.this.f75233Y.m20610f(vr9Var2.m24142c());
                        qr9.this.f75231W.log(pu1.EnumC11124a.INFO, "Received no service config, using default service config");
                    } else if (error == null) {
                        vr9Var2 = qr9.f75206u0;
                        qr9.this.f75233Y.m20610f(null);
                    } else {
                        if (!qr9.this.f75240c0) {
                            qr9.this.f75231W.log(pu1.EnumC11124a.INFO, "Fallback to error due to invalid first service config without default config");
                            C11630v.this.onError(serviceConfig.getError());
                            if (c14989b != null) {
                                c14989b.resolutionAttempted(serviceConfig.getError());
                                return;
                            }
                            return;
                        }
                        vr9Var2 = qr9.this.f75236a0;
                    }
                    if (!vr9Var2.equals(qr9.this.f75236a0)) {
                        qr9.this.f75231W.log(pu1.EnumC11124a.INFO, "Service config changed{0}", vr9Var2 == qr9.f75206u0 ? " to empty" : "");
                        qr9.this.f75236a0 = vr9Var2;
                        qr9.this.f75258l0.f75296a = vr9Var2.m24146g();
                    }
                    try {
                        qr9.this.f75240c0 = true;
                    } catch (RuntimeException e) {
                        qr9.f75199n0.log(Level.WARNING, "[" + qr9.this.getLogId() + "] Unexpected exception from parsing service config", (Throwable) e);
                    }
                    vr9Var = vr9Var2;
                } else {
                    if (vr9Var2 != null) {
                        qr9.this.f75231W.log(pu1.EnumC11124a.INFO, "Service config from name resolver discarded by channel settings");
                    }
                    vr9Var = qr9.this.f75238b0 == null ? qr9.f75206u0 : qr9.this.f75238b0;
                    if (ja8Var != null) {
                        qr9.this.f75231W.log(pu1.EnumC11124a.INFO, "Config selector from name resolver discarded by channel settings");
                    }
                    qr9.this.f75233Y.m20610f(vr9Var.m24142c());
                }
                sc0 attributes = this.f75344a.getAttributes();
                C11630v c11630v = C11630v.this;
                if (c11630v.f75339a == qr9.this.f75214F) {
                    sc0.C12515b c12515bDiscard = attributes.toBuilder().discard(ja8.f50100a);
                    Map<String, ?> mapM24143d = vr9Var.m24143d();
                    if (mapM24143d != null) {
                        c12515bDiscard.set(zb9.f104683b, mapM24143d).build();
                    }
                    n4g n4gVarM24568g = C11630v.this.f75339a.f75321a.m24568g(zb9.C16072i.newBuilder().setAddresses(addresses).setAttributes(c12515bDiscard.build()).setLoadBalancingPolicyConfig(vr9Var.m24144e()).build());
                    if (c14989b != null) {
                        c14989b.resolutionAttempted(n4gVarM24568g);
                    }
                }
            }
        }

        public C11630v(C11629u c11629u, q8b q8bVar) {
            this.f75339a = (C11629u) v7d.checkNotNull(c11629u, "helperImpl");
            this.f75340b = (q8b) v7d.checkNotNull(q8bVar, "resolver");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleErrorInSyncContext(n4g n4gVar) {
            qr9.f75199n0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{qr9.this.getLogId(), n4gVar});
            qr9.this.f75233Y.m20608d();
            EnumC11632x enumC11632x = qr9.this.f75234Z;
            EnumC11632x enumC11632x2 = EnumC11632x.ERROR;
            if (enumC11632x != enumC11632x2) {
                qr9.this.f75231W.log(pu1.EnumC11124a.WARNING, "Failed to resolve name: {0}", n4gVar);
                qr9.this.f75234Z = enumC11632x2;
            }
            if (this.f75339a != qr9.this.f75214F) {
                return;
            }
            this.f75339a.f75321a.m24563b(n4gVar);
        }

        @Override // p000.q8b.AbstractC11375e, p000.q8b.InterfaceC11376f
        public void onError(n4g n4gVar) {
            v7d.checkArgument(!n4gVar.isOk(), "the error status must not be OK");
            qr9.this.f75266s.execute(new a(n4gVar));
        }

        @Override // p000.q8b.AbstractC11375e
        public void onResult(q8b.C11377g c11377g) {
            qr9.this.f75266s.execute(new b(c11377g));
        }
    }

    /* JADX INFO: renamed from: qr9$w */
    public class C11631w extends bu1 {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<ja8> f75346a;

        /* JADX INFO: renamed from: b */
        public final String f75347b;

        /* JADX INFO: renamed from: c */
        public final bu1 f75348c;

        /* JADX INFO: renamed from: qr9$w$a */
        public class a extends bu1 {
            public a() {
            }

            @Override // p000.bu1
            public String authority() {
                return C11631w.this.f75347b;
            }

            @Override // p000.bu1
            public <RequestT, ResponseT> w22<RequestT, ResponseT> newCall(rua<RequestT, ResponseT> ruaVar, rn1 rn1Var) {
                return new x22(ruaVar, qr9.this.getCallExecutor(rn1Var), rn1Var, qr9.this.f75258l0, qr9.this.f75226R ? null : qr9.this.f75251i.getScheduledExecutorService(), qr9.this.f75229U, null).m24930p(qr9.this.f75267t).m24929o(qr9.this.f75268u).m24928n(qr9.this.f75269v);
            }
        }

        /* JADX INFO: renamed from: qr9$w$b */
        public final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (qr9.this.f75218J == null) {
                    if (C11631w.this.f75346a.get() == qr9.f75207v0) {
                        C11631w.this.f75346a.set(null);
                    }
                    qr9.this.f75222N.m20596b(qr9.f75204s0);
                }
            }
        }

        /* JADX INFO: renamed from: qr9$w$c */
        public final class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C11631w.this.f75346a.get() == qr9.f75207v0) {
                    C11631w.this.f75346a.set(null);
                }
                if (qr9.this.f75218J != null) {
                    Iterator it = qr9.this.f75218J.iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).cancel("Channel is forcefully shutdown", (Throwable) null);
                    }
                }
                qr9.this.f75222N.m20597c(qr9.f75203r0);
            }
        }

        /* JADX INFO: renamed from: qr9$w$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                qr9.this.m20591v0();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
        /* JADX INFO: renamed from: qr9$w$e */
        public class e<ReqT, RespT> extends w22<ReqT, RespT> {
            public e() {
            }

            @Override // p000.w22
            public void cancel(@eib String str, @eib Throwable th) {
            }

            @Override // p000.w22
            public void halfClose() {
            }

            @Override // p000.w22
            public void request(int i) {
            }

            @Override // p000.w22
            public void sendMessage(ReqT reqt) {
            }

            @Override // p000.w22
            public void start(w22.AbstractC14364a<RespT> abstractC14364a, fta ftaVar) {
                abstractC14364a.onClose(qr9.f75204s0, new fta());
            }
        }

        /* JADX INFO: renamed from: qr9$w$f */
        public class f implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ g f75355a;

            public f(g gVar) {
                this.f75355a = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C11631w.this.f75346a.get() != qr9.f75207v0) {
                    this.f75355a.m20612g();
                    return;
                }
                if (qr9.this.f75218J == null) {
                    qr9.this.f75218J = new LinkedHashSet();
                    qr9 qr9Var = qr9.this;
                    qr9Var.f75256k0.updateObjectInUse(qr9Var.f75219K, true);
                }
                qr9.this.f75218J.add(this.f75355a);
            }
        }

        /* JADX INFO: renamed from: qr9$w$g */
        public final class g<ReqT, RespT> extends r34<ReqT, RespT> {

            /* JADX INFO: renamed from: m */
            public final fx2 f75357m;

            /* JADX INFO: renamed from: n */
            public final rua<ReqT, RespT> f75358n;

            /* JADX INFO: renamed from: o */
            public final rn1 f75359o;

            /* JADX INFO: renamed from: p */
            public final long f75360p;

            /* JADX INFO: renamed from: qr9$w$g$a */
            public class a implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Runnable f75362a;

                public a(Runnable runnable) {
                    this.f75362a = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f75362a.run();
                    g gVar = g.this;
                    qr9.this.f75266s.execute(new b());
                }
            }

            /* JADX INFO: renamed from: qr9$w$g$b */
            public final class b implements Runnable {
                public b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (qr9.this.f75218J != null) {
                        qr9.this.f75218J.remove(g.this);
                        if (qr9.this.f75218J.isEmpty()) {
                            qr9 qr9Var = qr9.this;
                            qr9Var.f75256k0.updateObjectInUse(qr9Var.f75219K, false);
                            qr9.this.f75218J = null;
                            if (qr9.this.f75223O.get()) {
                                qr9.this.f75222N.m20596b(qr9.f75204s0);
                            }
                        }
                    }
                }
            }

            public g(fx2 fx2Var, rua<ReqT, RespT> ruaVar, rn1 rn1Var) {
                super(qr9.this.getCallExecutor(rn1Var), qr9.this.f75255k, rn1Var.getDeadline());
                this.f75357m = fx2Var;
                this.f75358n = ruaVar;
                this.f75359o = rn1Var;
                this.f75360p = qr9.this.f75252i0.nanoTime();
            }

            @Override // p000.r34
            /* JADX INFO: renamed from: e */
            public void mo20611e() {
                super.mo20611e();
                qr9.this.f75266s.execute(new b());
            }

            /* JADX INFO: renamed from: g */
            public void m20612g() {
                fx2 fx2VarAttach = this.f75357m.attach();
                try {
                    w22<ReqT, RespT> w22VarNewClientCall = C11631w.this.newClientCall(this.f75358n, this.f75359o.withOption(q42.f73176a, Long.valueOf(qr9.this.f75252i0.nanoTime() - this.f75360p)));
                    this.f75357m.detach(fx2VarAttach);
                    Runnable call = setCall(w22VarNewClientCall);
                    if (call == null) {
                        qr9.this.f75266s.execute(new b());
                    } else {
                        qr9.this.getCallExecutor(this.f75359o).execute(new a(call));
                    }
                } catch (Throwable th) {
                    this.f75357m.detach(fx2VarAttach);
                    throw th;
                }
            }
        }

        public /* synthetic */ C11631w(qr9 qr9Var, String str, C11608a c11608a) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <ReqT, RespT> w22<ReqT, RespT> newClientCall(rua<ReqT, RespT> ruaVar, rn1 rn1Var) {
            ja8 ja8Var = this.f75346a.get();
            if (ja8Var == null) {
                return this.f75348c.newCall(ruaVar, rn1Var);
            }
            if (!(ja8Var instanceof vr9.C14230c)) {
                return new C11624p(ja8Var, this.f75348c, qr9.this.f75257l, ruaVar, rn1Var);
            }
            vr9.C14229b c14229bM24145f = ((vr9.C14230c) ja8Var).f92071b.m24145f(ruaVar);
            if (c14229bM24145f != null) {
                rn1Var = rn1Var.withOption(vr9.C14229b.f92064g, c14229bM24145f);
            }
            return this.f75348c.newCall(ruaVar, rn1Var);
        }

        @Override // p000.bu1
        public String authority() {
            return this.f75347b;
        }

        /* JADX INFO: renamed from: d */
        public void m20608d() {
            if (this.f75346a.get() == qr9.f75207v0) {
                m20610f(null);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m20609e() {
            qr9.this.f75266s.execute(new c());
        }

        /* JADX INFO: renamed from: f */
        public void m20610f(@eib ja8 ja8Var) {
            ja8 ja8Var2 = this.f75346a.get();
            this.f75346a.set(ja8Var);
            if (ja8Var2 != qr9.f75207v0 || qr9.this.f75218J == null) {
                return;
            }
            Iterator it = qr9.this.f75218J.iterator();
            while (it.hasNext()) {
                ((g) it.next()).m20612g();
            }
        }

        @Override // p000.bu1
        public <ReqT, RespT> w22<ReqT, RespT> newCall(rua<ReqT, RespT> ruaVar, rn1 rn1Var) {
            if (this.f75346a.get() != qr9.f75207v0) {
                return newClientCall(ruaVar, rn1Var);
            }
            qr9.this.f75266s.execute(new d());
            if (this.f75346a.get() != qr9.f75207v0) {
                return newClientCall(ruaVar, rn1Var);
            }
            if (qr9.this.f75223O.get()) {
                return new e();
            }
            g gVar = new g(fx2.current(), ruaVar, rn1Var);
            qr9.this.f75266s.execute(new f(gVar));
            return gVar;
        }

        public void shutdown() {
            qr9.this.f75266s.execute(new b());
        }

        private C11631w(String str) {
            this.f75346a = new AtomicReference<>(qr9.f75207v0);
            this.f75348c = new a();
            this.f75347b = (String) v7d.checkNotNull(str, "authority");
        }
    }

    /* JADX INFO: renamed from: qr9$x */
    public enum EnumC11632x {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* JADX INFO: renamed from: qr9$y */
    public static final class ScheduledExecutorServiceC11633y implements ScheduledExecutorService {

        /* JADX INFO: renamed from: a */
        public final ScheduledExecutorService f75369a;

        public /* synthetic */ ScheduledExecutorServiceC11633y(ScheduledExecutorService scheduledExecutorService, C11608a c11608a) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f75369a.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f75369a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            return this.f75369a.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
            return (T) this.f75369a.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f75369a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f75369a.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            return this.f75369a.schedule(callable, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.f75369a.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.f75369a.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.f75369a.submit(callable);
        }

        private ScheduledExecutorServiceC11633y(ScheduledExecutorService scheduledExecutorService) {
            this.f75369a = (ScheduledExecutorService) v7d.checkNotNull(scheduledExecutorService, "delegate");
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f75369a.invokeAll(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (T) this.f75369a.invokeAny(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f75369a.schedule(runnable, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.f75369a.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            return this.f75369a.submit(runnable, t);
        }
    }

    /* JADX INFO: renamed from: qr9$z */
    public final class C11634z extends AbstractC0058a5 {

        /* JADX INFO: renamed from: a */
        public final zb9.C16065b f75370a;

        /* JADX INFO: renamed from: b */
        public final cb8 f75371b;

        /* JADX INFO: renamed from: c */
        public final qu1 f75372c;

        /* JADX INFO: renamed from: d */
        public final zu1 f75373d;

        /* JADX INFO: renamed from: e */
        public List<s45> f75374e;

        /* JADX INFO: renamed from: f */
        public ub8 f75375f;

        /* JADX INFO: renamed from: g */
        public boolean f75376g;

        /* JADX INFO: renamed from: h */
        public boolean f75377h;

        /* JADX INFO: renamed from: i */
        public thg.C13053d f75378i;

        /* JADX INFO: renamed from: qr9$z$a */
        public final class a extends ub8.AbstractC13455l {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zb9.InterfaceC16075l f75380a;

            public a(zb9.InterfaceC16075l interfaceC16075l) {
                this.f75380a = interfaceC16075l;
            }

            @Override // p000.ub8.AbstractC13455l
            /* JADX INFO: renamed from: a */
            public void mo20613a(ub8 ub8Var) {
                qr9.this.f75256k0.updateObjectInUse(ub8Var, true);
            }

            @Override // p000.ub8.AbstractC13455l
            /* JADX INFO: renamed from: b */
            public void mo20614b(ub8 ub8Var) {
                qr9.this.f75256k0.updateObjectInUse(ub8Var, false);
            }

            @Override // p000.ub8.AbstractC13455l
            /* JADX INFO: renamed from: c */
            public void mo20602c(ub8 ub8Var, xs2 xs2Var) {
                v7d.checkState(this.f75380a != null, "listener is null");
                this.f75380a.onSubchannelState(xs2Var);
            }

            @Override // p000.ub8.AbstractC13455l
            /* JADX INFO: renamed from: d */
            public void mo20603d(ub8 ub8Var) {
                qr9.this.f75217I.remove(ub8Var);
                qr9.this.f75232X.removeSubchannel(ub8Var);
                qr9.this.maybeTerminateChannel();
            }
        }

        /* JADX INFO: renamed from: qr9$z$b */
        public final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C11634z.this.f75375f.shutdown(qr9.f75205t0);
            }
        }

        public C11634z(zb9.C16065b c16065b) {
            v7d.checkNotNull(c16065b, C2473f.f17565y);
            this.f75374e = c16065b.getAddresses();
            if (qr9.this.f75239c != null) {
                c16065b = c16065b.toBuilder().setAddresses(stripOverrideAuthorityAttributes(c16065b.getAddresses())).build();
            }
            this.f75370a = c16065b;
            cb8 cb8VarAllocate = cb8.allocate("Subchannel", qr9.this.authority());
            this.f75371b = cb8VarAllocate;
            zu1 zu1Var = new zu1(cb8VarAllocate, qr9.this.f75265r, qr9.this.f75264q.currentTimeNanos(), "Subchannel for " + c16065b.getAddresses());
            this.f75373d = zu1Var;
            this.f75372c = new qu1(zu1Var, qr9.this.f75264q);
        }

        private List<s45> stripOverrideAuthorityAttributes(List<s45> list) {
            ArrayList arrayList = new ArrayList();
            for (s45 s45Var : list) {
                arrayList.add(new s45(s45Var.getAddresses(), s45Var.getAttributes().toBuilder().discard(s45.f80626d).build()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // p000.AbstractC0058a5
        /* JADX INFO: renamed from: a */
        public xa8<da8.C4685b> mo139a() {
            v7d.checkState(this.f75376g, "not started");
            return this.f75375f;
        }

        @Override // p000.zb9.AbstractC16073j
        public bu1 asChannel() {
            v7d.checkState(this.f75376g, "not started");
            return new icg(this.f75375f, qr9.this.f75262o.m20601a(), qr9.this.f75251i.getScheduledExecutorService(), qr9.this.f75228T.create(), new AtomicReference(null));
        }

        @Override // p000.zb9.AbstractC16073j
        public List<s45> getAllAddresses() {
            qr9.this.f75266s.throwIfNotInThisSynchronizationContext();
            v7d.checkState(this.f75376g, "not started");
            return this.f75374e;
        }

        @Override // p000.zb9.AbstractC16073j
        public sc0 getAttributes() {
            return this.f75370a.getAttributes();
        }

        @Override // p000.zb9.AbstractC16073j
        public pu1 getChannelLogger() {
            return this.f75372c;
        }

        @Override // p000.zb9.AbstractC16073j
        public Object getInternalSubchannel() {
            v7d.checkState(this.f75376g, "Subchannel is not started");
            return this.f75375f;
        }

        @Override // p000.zb9.AbstractC16073j
        public void requestConnection() {
            qr9.this.f75266s.throwIfNotInThisSynchronizationContext();
            v7d.checkState(this.f75376g, "not started");
            this.f75375f.obtainActiveTransport();
        }

        @Override // p000.zb9.AbstractC16073j
        public void shutdown() {
            thg.C13053d c13053d;
            qr9.this.f75266s.throwIfNotInThisSynchronizationContext();
            if (this.f75375f == null) {
                this.f75377h = true;
                return;
            }
            if (!this.f75377h) {
                this.f75377h = true;
            } else {
                if (!qr9.this.f75225Q || (c13053d = this.f75378i) == null) {
                    return;
                }
                c13053d.cancel();
                this.f75378i = null;
            }
            if (qr9.this.f75225Q) {
                this.f75375f.shutdown(qr9.f75204s0);
            } else {
                this.f75378i = qr9.this.f75266s.schedule(new fi9(new b()), 5L, TimeUnit.SECONDS, qr9.this.f75251i.getScheduledExecutorService());
            }
        }

        @Override // p000.zb9.AbstractC16073j
        public void start(zb9.InterfaceC16075l interfaceC16075l) {
            qr9.this.f75266s.throwIfNotInThisSynchronizationContext();
            v7d.checkState(!this.f75376g, "already started");
            v7d.checkState(!this.f75377h, "already shutdown");
            v7d.checkState(!qr9.this.f75225Q, "Channel is being terminated");
            this.f75376g = true;
            ub8 ub8Var = new ub8(this.f75370a.getAddresses(), qr9.this.authority(), qr9.this.f75211C, qr9.this.f75273z, qr9.this.f75251i, qr9.this.f75251i.getScheduledExecutorService(), qr9.this.f75270w, qr9.this.f75266s, new a(interfaceC16075l), qr9.this.f75232X, qr9.this.f75228T.create(), this.f75373d, this.f75371b, this.f75372c, qr9.this.f75210B);
            qr9.this.f75230V.m27092e(new da8.C4686c.b.a().setDescription("Child Subchannel started").setSeverity(da8.C4686c.b.EnumC16427b.CT_INFO).setTimestampNanos(qr9.this.f75264q.currentTimeNanos()).setSubchannelRef(ub8Var).build());
            this.f75375f = ub8Var;
            qr9.this.f75232X.addSubchannel(ub8Var);
            qr9.this.f75217I.add(ub8Var);
        }

        public String toString() {
            return this.f75371b.toString();
        }

        @Override // p000.zb9.AbstractC16073j
        public void updateAddresses(List<s45> list) {
            qr9.this.f75266s.throwIfNotInThisSynchronizationContext();
            this.f75374e = list;
            if (qr9.this.f75239c != null) {
                list = stripOverrideAuthorityAttributes(list);
            }
            this.f75375f.updateAddresses(list);
        }
    }

    static {
        n4g n4gVar = n4g.f63273t;
        f75203r0 = n4gVar.withDescription("Channel shutdownNow invoked");
        f75204s0 = n4gVar.withDescription("Channel shutdown invoked");
        f75205t0 = n4gVar.withDescription("Subchannel shutdown invoked");
        f75206u0 = vr9.m24140a();
        f75207v0 = new C11608a();
        f75208w0 = new C11622n();
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
    public qr9(rr9 rr9Var, s42 s42Var, no0.InterfaceC9959a interfaceC9959a, gkb<? extends Executor> gkbVar, lfg<d5g> lfgVar, List<d42> list, q0h q0hVar) {
        C11608a c11608a;
        thg thgVar = new thg(new C11620l());
        this.f75266s = thgVar;
        this.f75272y = new ys2();
        this.f75217I = new HashSet(16, 0.75f);
        this.f75219K = new Object();
        this.f75220L = new HashSet(1, 0.75f);
        C11608a c11608a2 = null;
        this.f75222N = new C11609a0(this, c11608a2);
        this.f75223O = new AtomicBoolean(false);
        this.f75227S = new CountDownLatch(1);
        this.f75234Z = EnumC11632x.NO_RESOLUTION;
        this.f75236a0 = f75206u0;
        this.f75240c0 = false;
        this.f75244e0 = new j8e.C7805u();
        this.f75252i0 = sj3.getSystemTicker();
        C11625q c11625q = new C11625q(this, c11608a2);
        this.f75254j0 = c11625q;
        this.f75256k0 = new C11627s(this, c11608a2);
        this.f75258l0 = new C11623o(this, c11608a2);
        String str = (String) v7d.checkNotNull(rr9Var.f79098f, "target");
        this.f75237b = str;
        cb8 cb8VarAllocate = cb8.allocate("Channel", str);
        this.f75235a = cb8VarAllocate;
        this.f75264q = (q0h) v7d.checkNotNull(q0hVar, "timeProvider");
        gkb<? extends Executor> gkbVar2 = (gkb) v7d.checkNotNull(rr9Var.f79093a, "executorPool");
        this.f75259m = gkbVar2;
        Executor executor = (Executor) v7d.checkNotNull(gkbVar2.getObject(), "executor");
        this.f75257l = executor;
        this.f75249h = rr9Var.f79099g;
        this.f75247g = s42Var;
        ExecutorC11626r executorC11626r = new ExecutorC11626r((gkb) v7d.checkNotNull(rr9Var.f79094b, "offloadExecutorPool"));
        this.f75263p = executorC11626r;
        qn1 qn1Var = new qn1(s42Var, rr9Var.f79100h, executorC11626r);
        this.f75251i = qn1Var;
        this.f75253j = new qn1(s42Var, null, executorC11626r);
        ScheduledExecutorServiceC11633y scheduledExecutorServiceC11633y = new ScheduledExecutorServiceC11633y(qn1Var.getScheduledExecutorService(), c11608a2);
        this.f75255k = scheduledExecutorServiceC11633y;
        this.f75265r = rr9Var.f79115w;
        zu1 zu1Var = new zu1(cb8VarAllocate, rr9Var.f79115w, q0hVar.currentTimeNanos(), "Channel for '" + str + "'");
        this.f75230V = zu1Var;
        qu1 qu1Var = new qu1(zu1Var, q0hVar);
        this.f75231W = qu1Var;
        rid ridVar = rr9Var.f79083A;
        ridVar = ridVar == null ? oc7.f67124F : ridVar;
        boolean z = rr9Var.f79113u;
        this.f75250h0 = z;
        wi0 wi0Var = new wi0(rr9Var.f79104l);
        this.f75245f = wi0Var;
        t8b t8bVar = rr9Var.f79096d;
        this.f75241d = t8bVar;
        hme hmeVar = new hme(z, rr9Var.f79109q, rr9Var.f79110r, wi0Var);
        String str2 = rr9Var.f79103k;
        this.f75239c = str2;
        q8b.C11372b c11372bBuild = q8b.C11372b.newBuilder().setDefaultPort(rr9Var.m21487b()).setProxyDetector(ridVar).setSynchronizationContext(thgVar).setScheduledExecutorService(scheduledExecutorServiceC11633y).setServiceConfigParser(hmeVar).setChannelLogger(qu1Var).setOffloadExecutor(executorC11626r).setOverrideAuthority(str2).build();
        this.f75243e = c11372bBuild;
        this.f75212D = m20588x0(str, str2, t8bVar, c11372bBuild, qn1Var.getSupportedSocketAddressTypes());
        this.f75261n = (gkb) v7d.checkNotNull(gkbVar, "balancerRpcExecutorPool");
        this.f75262o = new ExecutorC11626r(gkbVar);
        s34 s34Var = new s34(executor, thgVar);
        this.f75221M = s34Var;
        s34Var.start(c11625q);
        this.f75273z = interfaceC9959a;
        Map<String, ?> map = rr9Var.f79116x;
        if (map != null) {
            q8b.C11373c serviceConfig = hmeVar.parseServiceConfig(map);
            v7d.checkState(serviceConfig.getError() == null, "Default config is invalid: %s", serviceConfig.getError());
            vr9 vr9Var = (vr9) serviceConfig.getConfig();
            this.f75238b0 = vr9Var;
            this.f75236a0 = vr9Var;
            c11608a = null;
        } else {
            c11608a = null;
            this.f75238b0 = null;
        }
        boolean z2 = rr9Var.f79117y;
        this.f75242d0 = z2;
        C11631w c11631w = new C11631w(this, this.f75212D.getServiceAuthority(), c11608a);
        this.f75233Y = c11631w;
        d21 d21Var = rr9Var.f79118z;
        this.f75209A = e42.intercept(d21Var != null ? d21Var.wrapChannel(c11631w) : c11631w, list);
        this.f75210B = new ArrayList(rr9Var.f79097e);
        this.f75270w = (lfg) v7d.checkNotNull(lfgVar, "stopwatchSupplier");
        long j = rr9Var.f79108p;
        if (j == -1) {
            this.f75271x = j;
        } else {
            v7d.checkArgument(j >= rr9.f79076O, "invalid idleTimeoutMillis %s", j);
            this.f75271x = rr9Var.f79108p;
        }
        this.f75260m0 = new l5e(new RunnableC11628t(this, null), thgVar, qn1Var.getScheduledExecutorService(), lfgVar.get());
        this.f75267t = rr9Var.f79105m;
        this.f75268u = (bm3) v7d.checkNotNull(rr9Var.f79106n, "decompressorRegistry");
        this.f75269v = (ho2) v7d.checkNotNull(rr9Var.f79107o, "compressorRegistry");
        this.f75211C = rr9Var.f79102j;
        this.f75248g0 = rr9Var.f79111s;
        this.f75246f0 = rr9Var.f79112t;
        C11611c c11611c = new C11611c(q0hVar);
        this.f75228T = c11611c;
        this.f75229U = c11611c.create();
        da8 da8Var = (da8) v7d.checkNotNull(rr9Var.f79114v);
        this.f75232X = da8Var;
        da8Var.addRootChannel(this);
        if (z2) {
            return;
        }
        if (this.f75238b0 != null) {
            qu1Var.log(pu1.EnumC11124a.INFO, "Service config look-up disabled, using default service config");
        }
        this.f75240c0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelIdleTimer(boolean z) {
        this.f75260m0.m15326i(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enterIdleMode() {
        shutdownNameResolverAndLoadBalancer(true);
        this.f75221M.m21680j(null);
        this.f75231W.log(pu1.EnumC11124a.INFO, "Entering IDLE state");
        this.f75272y.m26340b(ws2.IDLE);
        if (this.f75256k0.anyObjectInUse(this.f75219K, this.f75221M)) {
            m20591v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Executor getCallExecutor(rn1 rn1Var) {
        Executor executor = rn1Var.getExecutor();
        return executor == null ? this.f75257l : executor;
    }

    private static q8b getNameResolver(String str, t8b t8bVar, q8b.C11372b c11372b, Collection<Class<? extends SocketAddress>> collection) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        s8b providerForScheme = uri != null ? t8bVar.getProviderForScheme(uri.getScheme()) : null;
        String str2 = "";
        if (providerForScheme == null && !f75200o0.matcher(str).matches()) {
            try {
                uri = new URI(t8bVar.getDefaultScheme(), "", pj4.f71071b + str, null);
                providerForScheme = t8bVar.getProviderForScheme(uri.getScheme());
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        if (providerForScheme == null) {
            if (sb.length() > 0) {
                str2 = " (" + ((Object) sb) + c0b.f15434d;
            }
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, str2));
        }
        if (collection != null && !collection.containsAll(providerForScheme.getProducedSocketAddressTypes())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
        }
        q8b q8bVarNewNameResolver = providerForScheme.newNameResolver(uri, c11372b);
        if (q8bVarNewNameResolver != null) {
            return q8bVarNewNameResolver;
        }
        if (sb.length() > 0) {
            str2 = " (" + ((Object) sb) + c0b.f15434d;
        }
        throw new IllegalArgumentException(String.format("cannot create a NameResolver for %s%s", str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleInternalSubchannelState(xs2 xs2Var) {
        if (xs2Var.getState() == ws2.TRANSIENT_FAILURE || xs2Var.getState() == ws2.IDLE) {
            refreshNameResolution();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeShutdownNowSubchannels() {
        if (this.f75224P) {
            Iterator<ub8> it = this.f75217I.iterator();
            while (it.hasNext()) {
                it.next().shutdownNow(f75203r0);
            }
            Iterator<l5c> it2 = this.f75220L.iterator();
            while (it2.hasNext()) {
                it2.next().m15311c().shutdownNow(f75203r0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeTerminateChannel() {
        if (!this.f75226R && this.f75223O.get() && this.f75217I.isEmpty() && this.f75220L.isEmpty()) {
            this.f75231W.log(pu1.EnumC11124a.INFO, "Terminated");
            this.f75232X.removeRootChannel(this);
            this.f75259m.returnObject(this.f75257l);
            this.f75262o.release();
            this.f75263p.release();
            this.f75251i.close();
            this.f75226R = true;
            this.f75227S.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshNameResolution() {
        this.f75266s.throwIfNotInThisSynchronizationContext();
        if (this.f75213E) {
            this.f75212D.refresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rescheduleIdleTimer() {
        long j = this.f75271x;
        if (j == -1) {
            return;
        }
        this.f75260m0.m15327k(j, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdownNameResolverAndLoadBalancer(boolean z) {
        this.f75266s.throwIfNotInThisSynchronizationContext();
        if (z) {
            v7d.checkState(this.f75213E, "nameResolver is not started");
            v7d.checkState(this.f75214F != null, "lbHelper is null");
        }
        q8b q8bVar = this.f75212D;
        if (q8bVar != null) {
            q8bVar.shutdown();
            this.f75213E = false;
            if (z) {
                this.f75212D = m20588x0(this.f75237b, this.f75239c, this.f75241d, this.f75243e, this.f75251i.getSupportedSocketAddressTypes());
            } else {
                this.f75212D = null;
            }
        }
        C11629u c11629u = this.f75214F;
        if (c11629u != null) {
            c11629u.f75321a.m24567f();
            this.f75214F = null;
        }
        this.f75215G = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSubchannelPicker(zb9.AbstractC16074k abstractC16074k) {
        this.f75215G = abstractC16074k;
        this.f75221M.m21680j(abstractC16074k);
    }

    @gdi
    /* JADX INFO: renamed from: x0 */
    public static q8b m20588x0(String str, @eib String str2, t8b t8bVar, q8b.C11372b c11372b, Collection<Class<? extends SocketAddress>> collection) {
        x8e x8eVar = new x8e(getNameResolver(str, t8bVar, c11372b, collection), new qo0(new ii5.C7298a(), c11372b.getScheduledExecutorService(), c11372b.getSynchronizationContext()), c11372b.getSynchronizationContext());
        return str2 == null ? x8eVar : new C11621m(x8eVar, str2);
    }

    @Override // p000.bu1
    public String authority() {
        return this.f75209A.authority();
    }

    @Override // p000.or9
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f75227S.await(j, timeUnit);
    }

    @Override // p000.or9
    public void enterIdle() {
        this.f75266s.execute(new RunnableC11614f());
    }

    @Override // p000.ac8
    public cb8 getLogId() {
        return this.f75235a;
    }

    @Override // p000.or9
    public ws2 getState(boolean z) {
        ws2 ws2VarM26339a = this.f75272y.m26339a();
        if (z && ws2VarM26339a == ws2.IDLE) {
            this.f75266s.execute(new RunnableC11615g());
        }
        return ws2VarM26339a;
    }

    @Override // p000.xa8
    public ja9<da8.C4685b> getStats() {
        y6f y6fVarCreate = y6f.create();
        this.f75266s.execute(new RunnableC11619k(y6fVarCreate));
        return y6fVarCreate;
    }

    @Override // p000.or9
    public boolean isShutdown() {
        return this.f75223O.get();
    }

    @Override // p000.or9
    public boolean isTerminated() {
        return this.f75226R;
    }

    @Override // p000.bu1
    public <ReqT, RespT> w22<ReqT, RespT> newCall(rua<ReqT, RespT> ruaVar, rn1 rn1Var) {
        return this.f75209A.newCall(ruaVar, rn1Var);
    }

    @Override // p000.or9
    public void notifyWhenStateChanged(ws2 ws2Var, Runnable runnable) {
        this.f75266s.execute(new RunnableC11612d(runnable, ws2Var));
    }

    @Override // p000.or9
    public void resetConnectBackoff() {
        this.f75266s.execute(new RunnableC11616h());
    }

    public String toString() {
        return yya.toStringHelper(this).add("logId", this.f75235a.getId()).add("target", this.f75237b).toString();
    }

    @gdi
    /* JADX INFO: renamed from: v0 */
    public void m20591v0() {
        this.f75266s.throwIfNotInThisSynchronizationContext();
        if (this.f75223O.get() || this.f75216H) {
            return;
        }
        if (this.f75256k0.isInUse()) {
            cancelIdleTimer(false);
        } else {
            rescheduleIdleTimer();
        }
        if (this.f75214F != null) {
            return;
        }
        this.f75231W.log(pu1.EnumC11124a.INFO, "Exiting idle mode");
        C11629u c11629u = new C11629u(this, null);
        c11629u.f75321a = this.f75245f.newLoadBalancer(c11629u);
        this.f75214F = c11629u;
        this.f75212D.start((q8b.AbstractC11375e) new C11630v(c11629u, this.f75212D));
        this.f75213E = true;
    }

    @gdi
    /* JADX INFO: renamed from: w0 */
    public ja8 m20592w0() {
        return (ja8) this.f75233Y.f75346a.get();
    }

    @gdi
    /* JADX INFO: renamed from: y0 */
    public boolean m20593y0() {
        return this.f75216H;
    }

    @gdi
    /* JADX INFO: renamed from: z0 */
    public void m20594z0(Throwable th) {
        if (this.f75216H) {
            return;
        }
        this.f75216H = true;
        cancelIdleTimer(true);
        shutdownNameResolverAndLoadBalancer(false);
        updateSubchannelPicker(new C11613e(th));
        this.f75233Y.m20610f(null);
        this.f75231W.log(pu1.EnumC11124a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        this.f75272y.m26340b(ws2.TRANSIENT_FAILURE);
    }

    @Override // p000.or9
    public qr9 shutdown() {
        this.f75231W.log(pu1.EnumC11124a.DEBUG, "shutdown() called");
        if (!this.f75223O.compareAndSet(false, true)) {
            return this;
        }
        this.f75266s.execute(new RunnableC11617i());
        this.f75233Y.shutdown();
        this.f75266s.execute(new RunnableC11610b());
        return this;
    }

    @Override // p000.or9
    public qr9 shutdownNow() {
        this.f75231W.log(pu1.EnumC11124a.DEBUG, "shutdownNow() called");
        shutdown();
        this.f75233Y.m20609e();
        this.f75266s.execute(new RunnableC11618j());
        return this;
    }

    /* JADX INFO: renamed from: qr9$a0 */
    public final class C11609a0 {

        /* JADX INFO: renamed from: a */
        public final Object f75274a;

        /* JADX INFO: renamed from: b */
        @vc7("lock")
        public Collection<o42> f75275b;

        /* JADX INFO: renamed from: c */
        @vc7("lock")
        public n4g f75276c;

        private C11609a0() {
            this.f75274a = new Object();
            this.f75275b = new HashSet();
        }

        @eib
        /* JADX INFO: renamed from: a */
        public n4g m20595a(j8e<?> j8eVar) {
            synchronized (this.f75274a) {
                try {
                    n4g n4gVar = this.f75276c;
                    if (n4gVar != null) {
                        return n4gVar;
                    }
                    this.f75275b.add(j8eVar);
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m20596b(n4g n4gVar) {
            synchronized (this.f75274a) {
                try {
                    if (this.f75276c != null) {
                        return;
                    }
                    this.f75276c = n4gVar;
                    boolean zIsEmpty = this.f75275b.isEmpty();
                    if (zIsEmpty) {
                        qr9.this.f75221M.shutdown(n4gVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m20597c(n4g n4gVar) {
            ArrayList arrayList;
            m20596b(n4gVar);
            synchronized (this.f75274a) {
                arrayList = new ArrayList(this.f75275b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((o42) it.next()).cancel(n4gVar);
            }
            qr9.this.f75221M.shutdownNow(n4gVar);
        }

        /* JADX INFO: renamed from: d */
        public void m20598d(j8e<?> j8eVar) {
            n4g n4gVar;
            synchronized (this.f75274a) {
                try {
                    this.f75275b.remove(j8eVar);
                    if (this.f75275b.isEmpty()) {
                        n4gVar = this.f75276c;
                        this.f75275b = new HashSet();
                    } else {
                        n4gVar = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (n4gVar != null) {
                qr9.this.f75221M.shutdown(n4gVar);
            }
        }

        public /* synthetic */ C11609a0(qr9 qr9Var, C11608a c11608a) {
            this();
        }
    }
}
