package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class and<T, U, V> extends knd implements oxb<T>, osb<U, V> {

    /* JADX INFO: renamed from: l2 */
    public final oxb<? super V> f2165l2;

    /* JADX INFO: renamed from: m2 */
    public final uif<U> f2166m2;

    /* JADX INFO: renamed from: n2 */
    public volatile boolean f2167n2;

    /* JADX INFO: renamed from: o2 */
    public volatile boolean f2168o2;

    /* JADX INFO: renamed from: p2 */
    public Throwable f2169p2;

    public and(oxb<? super V> oxbVar, uif<U> uifVar) {
        this.f2165l2 = oxbVar;
        this.f2166m2 = uifVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m934a(U u, boolean z, mf4 mf4Var) {
        oxb<? super V> oxbVar = this.f2165l2;
        uif<U> uifVar = this.f2166m2;
        if (this.f82388Y.get() == 0 && this.f82388Y.compareAndSet(0, 1)) {
            accept(oxbVar, u);
            if (leave(-1) == 0) {
                return;
            }
        } else {
            uifVar.offer(u);
            if (!enter()) {
                return;
            }
        }
        ymd.drainLoop(uifVar, oxbVar, z, mf4Var, this);
    }

    @Override // p000.osb
    public void accept(oxb<? super V> oxbVar, U u) {
    }

    /* JADX INFO: renamed from: b */
    public final void m935b(U u, boolean z, mf4 mf4Var) {
        oxb<? super V> oxbVar = this.f2165l2;
        uif<U> uifVar = this.f2166m2;
        if (this.f82388Y.get() != 0 || !this.f82388Y.compareAndSet(0, 1)) {
            uifVar.offer(u);
            if (!enter()) {
                return;
            }
        } else if (uifVar.isEmpty()) {
            accept(oxbVar, u);
            if (leave(-1) == 0) {
                return;
            }
        } else {
            uifVar.offer(u);
        }
        ymd.drainLoop(uifVar, oxbVar, z, mf4Var, this);
    }

    @Override // p000.osb
    public final boolean cancelled() {
        return this.f2167n2;
    }

    @Override // p000.osb
    public final boolean done() {
        return this.f2168o2;
    }

    @Override // p000.osb
    public final boolean enter() {
        return this.f82388Y.getAndIncrement() == 0;
    }

    @Override // p000.osb
    public final Throwable error() {
        return this.f2169p2;
    }

    public final boolean fastEnter() {
        return this.f82388Y.get() == 0 && this.f82388Y.compareAndSet(0, 1);
    }

    @Override // p000.osb
    public final int leave(int i) {
        return this.f82388Y.addAndGet(i);
    }
}
