package p000;

/* JADX INFO: loaded from: classes7.dex */
@yjd
public class lj8 extends sj8 implements jg2 {

    /* JADX INFO: renamed from: c */
    public final boolean f57733c;

    public lj8(@gib jj8 jj8Var) {
        super(true);
        m22033i(jj8Var);
        this.f57733c = handlesException();
    }

    private final boolean handlesException() {
        sj8 job;
        wy1 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        xy1 xy1Var = parentHandle$kotlinx_coroutines_core instanceof xy1 ? (xy1) parentHandle$kotlinx_coroutines_core : null;
        if (xy1Var != null && (job = xy1Var.getJob()) != null) {
            while (!job.getHandlesException$kotlinx_coroutines_core()) {
                wy1 parentHandle$kotlinx_coroutines_core2 = job.getParentHandle$kotlinx_coroutines_core();
                xy1 xy1Var2 = parentHandle$kotlinx_coroutines_core2 instanceof xy1 ? (xy1) parentHandle$kotlinx_coroutines_core2 : null;
                if (xy1Var2 == null || (job = xy1Var2.getJob()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.jg2
    public boolean complete() {
        return makeCompleting$kotlinx_coroutines_core(bth.f14751a);
    }

    @Override // p000.jg2
    public boolean completeExceptionally(@yfb Throwable th) {
        return makeCompleting$kotlinx_coroutines_core(new ni2(th, false, 2, null));
    }

    @Override // p000.sj8
    public boolean getHandlesException$kotlinx_coroutines_core() {
        return this.f57733c;
    }

    @Override // p000.sj8
    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }
}
