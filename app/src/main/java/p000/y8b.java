package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class y8b extends m13 implements o34 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o34 f100758c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final m13 f100759d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final String f100760e;

    /* JADX WARN: Multi-variable type inference failed */
    public y8b(@yfb m13 m13Var, @yfb String str) {
        o34 o34Var = m13Var instanceof o34 ? (o34) m13Var : null;
        this.f100758c = o34Var == null ? uu3.getDefaultDelay() : o34Var;
        this.f100759d = m13Var;
        this.f100760e = str;
    }

    @Override // p000.o34
    @gib
    @q64(level = u64.f86866b, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object delay(long j, @yfb zy2<? super bth> zy2Var) {
        return this.f100758c.delay(j, zy2Var);
    }

    @Override // p000.m13
    /* JADX INFO: renamed from: dispatch */
    public void mo29873dispatch(@yfb e13 e13Var, @yfb Runnable runnable) {
        this.f100759d.mo29873dispatch(e13Var, runnable);
    }

    @Override // p000.m13
    @la8
    public void dispatchYield(@yfb e13 e13Var, @yfb Runnable runnable) {
        this.f100759d.dispatchYield(e13Var, runnable);
    }

    @Override // p000.o34
    @yfb
    public yf4 invokeOnTimeout(long j, @yfb Runnable runnable, @yfb e13 e13Var) {
        return this.f100758c.invokeOnTimeout(j, runnable, e13Var);
    }

    @Override // p000.m13
    public boolean isDispatchNeeded(@yfb e13 e13Var) {
        return this.f100759d.isDispatchNeeded(e13Var);
    }

    @Override // p000.o34
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo29874scheduleResumeAfterDelay(long j, @yfb dq1<? super bth> dq1Var) {
        this.f100758c.mo29874scheduleResumeAfterDelay(j, dq1Var);
    }

    @Override // p000.m13
    @yfb
    public String toString() {
        return this.f100760e;
    }
}
