package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p000.p42;
import p000.w22;
import p000.x22;

/* JADX INFO: loaded from: classes7.dex */
public final class icg extends bu1 {

    /* JADX INFO: renamed from: g */
    @gdi
    public static final n4g f46502g;

    /* JADX INFO: renamed from: h */
    @gdi
    public static final n4g f46503h;

    /* JADX INFO: renamed from: i */
    public static final ep5 f46504i;

    /* JADX INFO: renamed from: a */
    public final ub8 f46505a;

    /* JADX INFO: renamed from: b */
    public final Executor f46506b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f46507c;

    /* JADX INFO: renamed from: d */
    public final vn1 f46508d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference<ja8> f46509e;

    /* JADX INFO: renamed from: f */
    public final x22.InterfaceC14881e f46510f = new C7234a();

    /* JADX INFO: renamed from: icg$a */
    public class C7234a implements x22.InterfaceC14881e {
        public C7234a() {
        }

        @Override // p000.x22.InterfaceC14881e
        public o42 newStream(rua<?, ?> ruaVar, rn1 rn1Var, fta ftaVar, fx2 fx2Var) {
            r42 r42VarM23210K = icg.this.f46505a.m23210K();
            if (r42VarM23210K == null) {
                r42VarM23210K = icg.f46504i;
            }
            q42[] clientStreamTracers = oc7.getClientStreamTracers(rn1Var, ftaVar, 0, false);
            fx2 fx2VarAttach = fx2Var.attach();
            try {
                return r42VarM23210K.newStream(ruaVar, ftaVar, rn1Var, clientStreamTracers);
            } finally {
                fx2Var.detach(fx2VarAttach);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [RequestT, ResponseT] */
    /* JADX INFO: renamed from: icg$b */
    public class C7235b<RequestT, ResponseT> extends w22<RequestT, ResponseT> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Executor f46512a;

        /* JADX INFO: renamed from: icg$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ w22.AbstractC14364a f46514a;

            public a(w22.AbstractC14364a abstractC14364a) {
                this.f46514a = abstractC14364a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f46514a.onClose(icg.f46503h, new fta());
            }
        }

        public C7235b(Executor executor) {
            this.f46512a = executor;
        }

        @Override // p000.w22
        public void cancel(String str, Throwable th) {
        }

        @Override // p000.w22
        public void halfClose() {
        }

        @Override // p000.w22
        public void request(int i) {
        }

        @Override // p000.w22
        public void sendMessage(RequestT requestt) {
        }

        @Override // p000.w22
        public void start(w22.AbstractC14364a<ResponseT> abstractC14364a, fta ftaVar) {
            this.f46512a.execute(new a(abstractC14364a));
        }
    }

    static {
        n4g n4gVar = n4g.f63273t;
        n4g n4gVarWithDescription = n4gVar.withDescription("Subchannel is NOT READY");
        f46502g = n4gVarWithDescription;
        f46503h = n4gVar.withDescription("wait-for-ready RPC is not supported on Subchannel.asChannel()");
        f46504i = new ep5(n4gVarWithDescription, p42.EnumC10788a.MISCARRIED);
    }

    public icg(ub8 ub8Var, Executor executor, ScheduledExecutorService scheduledExecutorService, vn1 vn1Var, AtomicReference<ja8> atomicReference) {
        this.f46505a = (ub8) v7d.checkNotNull(ub8Var, "subchannel");
        this.f46506b = (Executor) v7d.checkNotNull(executor, "executor");
        this.f46507c = (ScheduledExecutorService) v7d.checkNotNull(scheduledExecutorService, "deadlineCancellationExecutor");
        this.f46508d = (vn1) v7d.checkNotNull(vn1Var, "callsTracer");
        this.f46509e = (AtomicReference) v7d.checkNotNull(atomicReference, "configSelector");
    }

    @Override // p000.bu1
    public String authority() {
        return this.f46505a.m23207H();
    }

    @Override // p000.bu1
    public <RequestT, ResponseT> w22<RequestT, ResponseT> newCall(rua<RequestT, ResponseT> ruaVar, rn1 rn1Var) {
        Executor executor = rn1Var.getExecutor() == null ? this.f46506b : rn1Var.getExecutor();
        return rn1Var.isWaitForReady() ? new C7235b(executor) : new x22(ruaVar, executor, rn1Var.withOption(oc7.f67127I, Boolean.TRUE), this.f46510f, this.f46507c, this.f46508d, this.f46509e.get());
    }
}
