package p000;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.da8;
import p000.wr9;
import p000.x22;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
@kyg
public final class l5c extends or9 implements xa8<da8.C4685b> {

    /* JADX INFO: renamed from: q */
    public static final Logger f56205q = Logger.getLogger(l5c.class.getName());

    /* JADX INFO: renamed from: a */
    public ub8 f56206a;

    /* JADX INFO: renamed from: b */
    public AbstractC0058a5 f56207b;

    /* JADX INFO: renamed from: c */
    public zb9.AbstractC16074k f56208c;

    /* JADX INFO: renamed from: d */
    public final cb8 f56209d;

    /* JADX INFO: renamed from: e */
    public final String f56210e;

    /* JADX INFO: renamed from: f */
    public final s34 f56211f;

    /* JADX INFO: renamed from: g */
    public final da8 f56212g;

    /* JADX INFO: renamed from: h */
    public final gkb<? extends Executor> f56213h;

    /* JADX INFO: renamed from: i */
    public final Executor f56214i;

    /* JADX INFO: renamed from: j */
    public final ScheduledExecutorService f56215j;

    /* JADX INFO: renamed from: l */
    public volatile boolean f56217l;

    /* JADX INFO: renamed from: m */
    public final vn1 f56218m;

    /* JADX INFO: renamed from: n */
    public final zu1 f56219n;

    /* JADX INFO: renamed from: o */
    public final q0h f56220o;

    /* JADX INFO: renamed from: k */
    public final CountDownLatch f56216k = new CountDownLatch(1);

    /* JADX INFO: renamed from: p */
    public final x22.InterfaceC14881e f56221p = new C8618a();

    /* JADX INFO: renamed from: l5c$a */
    public class C8618a implements x22.InterfaceC14881e {
        public C8618a() {
        }

        @Override // p000.x22.InterfaceC14881e
        public o42 newStream(rua<?, ?> ruaVar, rn1 rn1Var, fta ftaVar, fx2 fx2Var) {
            q42[] clientStreamTracers = oc7.getClientStreamTracers(rn1Var, ftaVar, 0, false);
            fx2 fx2VarAttach = fx2Var.attach();
            try {
                return l5c.this.f56211f.newStream(ruaVar, ftaVar, rn1Var, clientStreamTracers);
            } finally {
                fx2Var.detach(fx2VarAttach);
            }
        }
    }

    /* JADX INFO: renamed from: l5c$b */
    public final class C8619b extends zb9.AbstractC16074k {

        /* JADX INFO: renamed from: a */
        public final zb9.C16070g f56223a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ xs2 f56224b;

        public C8619b(xs2 xs2Var) {
            this.f56224b = xs2Var;
            this.f56223a = zb9.C16070g.withError(xs2Var.getStatus());
        }

        @Override // p000.zb9.AbstractC16074k
        public zb9.C16070g pickSubchannel(zb9.AbstractC16071h abstractC16071h) {
            return this.f56223a;
        }

        public String toString() {
            return yya.toStringHelper((Class<?>) C8619b.class).add("errorResult", this.f56223a).toString();
        }
    }

    /* JADX INFO: renamed from: l5c$c */
    public final class C8620c extends zb9.AbstractC16074k {

        /* JADX INFO: renamed from: a */
        public final zb9.C16070g f56226a;

        public C8620c() {
            this.f56226a = zb9.C16070g.withSubchannel(l5c.this.f56207b);
        }

        @Override // p000.zb9.AbstractC16074k
        public zb9.C16070g pickSubchannel(zb9.AbstractC16071h abstractC16071h) {
            return this.f56226a;
        }

        public String toString() {
            return yya.toStringHelper((Class<?>) C8620c.class).add("result", this.f56226a).toString();
        }
    }

    /* JADX INFO: renamed from: l5c$d */
    public class C8621d implements wr9.InterfaceC14756a {
        public C8621d() {
        }

        @Override // p000.wr9.InterfaceC14756a
        public sc0 filterTransport(sc0 sc0Var) {
            return sc0Var;
        }

        @Override // p000.wr9.InterfaceC14756a
        public void transportInUse(boolean z) {
        }

        @Override // p000.wr9.InterfaceC14756a
        public void transportReady() {
        }

        @Override // p000.wr9.InterfaceC14756a
        public void transportShutdown(n4g n4gVar) {
        }

        @Override // p000.wr9.InterfaceC14756a
        public void transportTerminated() {
            l5c.this.f56207b.shutdown();
        }
    }

    /* JADX INFO: renamed from: l5c$e */
    public class C8622e extends AbstractC0058a5 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ub8 f56229a;

        public C8622e(ub8 ub8Var) {
            this.f56229a = ub8Var;
        }

        @Override // p000.AbstractC0058a5
        /* JADX INFO: renamed from: a */
        public xa8<da8.C4685b> mo139a() {
            return this.f56229a;
        }

        @Override // p000.zb9.AbstractC16073j
        public List<s45> getAllAddresses() {
            return this.f56229a.m23206G();
        }

        @Override // p000.zb9.AbstractC16073j
        public sc0 getAttributes() {
            return sc0.f81180c;
        }

        @Override // p000.zb9.AbstractC16073j
        public Object getInternalSubchannel() {
            return this.f56229a;
        }

        @Override // p000.zb9.AbstractC16073j
        public void requestConnection() {
            this.f56229a.obtainActiveTransport();
        }

        @Override // p000.zb9.AbstractC16073j
        public void shutdown() {
            this.f56229a.shutdown(n4g.f63273t.withDescription("OobChannel is shutdown"));
        }
    }

    /* JADX INFO: renamed from: l5c$f */
    public static /* synthetic */ class C8623f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56231a;

        static {
            int[] iArr = new int[ws2.values().length];
            f56231a = iArr;
            try {
                iArr[ws2.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56231a[ws2.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56231a[ws2.TRANSIENT_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l5c(String str, gkb<? extends Executor> gkbVar, ScheduledExecutorService scheduledExecutorService, thg thgVar, vn1 vn1Var, zu1 zu1Var, da8 da8Var, q0h q0hVar) {
        this.f56210e = (String) v7d.checkNotNull(str, "authority");
        this.f56209d = cb8.allocate((Class<?>) l5c.class, str);
        this.f56213h = (gkb) v7d.checkNotNull(gkbVar, "executorPool");
        Executor executor = (Executor) v7d.checkNotNull(gkbVar.getObject(), "executor");
        this.f56214i = executor;
        this.f56215j = (ScheduledExecutorService) v7d.checkNotNull(scheduledExecutorService, "deadlineCancellationExecutor");
        s34 s34Var = new s34(executor, thgVar);
        this.f56211f = s34Var;
        this.f56212g = (da8) v7d.checkNotNull(da8Var);
        s34Var.start(new C8621d());
        this.f56218m = vn1Var;
        this.f56219n = (zu1) v7d.checkNotNull(zu1Var, "channelTracer");
        this.f56220o = (q0h) v7d.checkNotNull(q0hVar, "timeProvider");
    }

    @Override // p000.bu1
    public String authority() {
        return this.f56210e;
    }

    @Override // p000.or9
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f56216k.await(j, timeUnit);
    }

    /* JADX INFO: renamed from: c */
    public ub8 m15311c() {
        return this.f56206a;
    }

    @gdi
    /* JADX INFO: renamed from: d */
    public zb9.AbstractC16073j m15312d() {
        return this.f56207b;
    }

    /* JADX INFO: renamed from: e */
    public void m15313e(xs2 xs2Var) {
        this.f56219n.m27092e(new da8.C4686c.b.a().setDescription("Entering " + xs2Var.getState() + " state").setSeverity(da8.C4686c.b.EnumC16427b.CT_INFO).setTimestampNanos(this.f56220o.currentTimeNanos()).build());
        int i = C8623f.f56231a[xs2Var.getState().ordinal()];
        if (i == 1 || i == 2) {
            this.f56211f.m21680j(this.f56208c);
        } else {
            if (i != 3) {
                return;
            }
            this.f56211f.m21680j(new C8619b(xs2Var));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m15314f() {
        this.f56212g.removeSubchannel(this);
        this.f56213h.returnObject(this.f56214i);
        this.f56216k.countDown();
    }

    /* JADX INFO: renamed from: g */
    public void m15315g(ub8 ub8Var) {
        f56205q.log(Level.FINE, "[{0}] Created with [{1}]", new Object[]{this, ub8Var});
        this.f56206a = ub8Var;
        this.f56207b = new C8622e(ub8Var);
        C8620c c8620c = new C8620c();
        this.f56208c = c8620c;
        this.f56211f.m21680j(c8620c);
    }

    @Override // p000.ac8
    public cb8 getLogId() {
        return this.f56209d;
    }

    @Override // p000.or9
    public ws2 getState(boolean z) {
        ub8 ub8Var = this.f56206a;
        return ub8Var == null ? ws2.IDLE : ub8Var.m23209J();
    }

    @Override // p000.xa8
    public ja9<da8.C4685b> getStats() {
        y6f y6fVarCreate = y6f.create();
        da8.C4685b.a aVar = new da8.C4685b.a();
        this.f56218m.m24076a(aVar);
        this.f56219n.m27094g(aVar);
        aVar.setTarget(this.f56210e).setState(this.f56206a.m23209J()).setSubchannels(Collections.singletonList(this.f56206a));
        y6fVarCreate.set(aVar.build());
        return y6fVarCreate;
    }

    /* JADX INFO: renamed from: h */
    public void m15316h(List<s45> list) {
        this.f56206a.updateAddresses(list);
    }

    @Override // p000.or9
    public boolean isShutdown() {
        return this.f56217l;
    }

    @Override // p000.or9
    public boolean isTerminated() {
        return this.f56216k.getCount() == 0;
    }

    @Override // p000.bu1
    public <RequestT, ResponseT> w22<RequestT, ResponseT> newCall(rua<RequestT, ResponseT> ruaVar, rn1 rn1Var) {
        return new x22(ruaVar, rn1Var.getExecutor() == null ? this.f56214i : rn1Var.getExecutor(), rn1Var, this.f56221p, this.f56215j, this.f56218m, null);
    }

    @Override // p000.or9
    public void resetConnectBackoff() {
        this.f56206a.m23211L();
    }

    @Override // p000.or9
    public or9 shutdown() {
        this.f56217l = true;
        this.f56211f.shutdown(n4g.f63273t.withDescription("OobChannel.shutdown() called"));
        return this;
    }

    @Override // p000.or9
    public or9 shutdownNow() {
        this.f56217l = true;
        this.f56211f.shutdownNow(n4g.f63273t.withDescription("OobChannel.shutdownNow() called"));
        return this;
    }

    public String toString() {
        return yya.toStringHelper(this).add("logId", this.f56209d.getId()).add("authority", this.f56210e).toString();
    }
}
