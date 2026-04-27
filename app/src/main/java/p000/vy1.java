package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class vy1 extends rj8 {

    /* JADX INFO: renamed from: e */
    @un8
    @yfb
    public final fq1<?> f92650e;

    public vy1(@yfb fq1<?> fq1Var) {
        this.f92650e = fq1Var;
    }

    @Override // p000.rj8
    public boolean getOnCancelling() {
        return true;
    }

    @Override // p000.rj8
    public void invoke(@gib Throwable th) {
        fq1<?> fq1Var = this.f92650e;
        fq1Var.parentCancelled$kotlinx_coroutines_core(fq1Var.getContinuationCancellationCause(getJob()));
    }
}
