package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class cnd<T, U, V> extends ond implements lj6<T>, wmd<U, V> {

    /* JADX INFO: renamed from: B2 */
    public final ycg<? super V> f17083B2;

    /* JADX INFO: renamed from: C2 */
    public final uif<U> f17084C2;

    /* JADX INFO: renamed from: D2 */
    public volatile boolean f17085D2;

    /* JADX INFO: renamed from: E2 */
    public volatile boolean f17086E2;

    /* JADX INFO: renamed from: F2 */
    public Throwable f17087F2;

    public cnd(ycg<? super V> ycgVar, uif<U> uifVar) {
        this.f17083B2 = ycgVar;
        this.f17084C2 = uifVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m4090a(U u, boolean z, mf4 mf4Var) {
        ycg<? super V> ycgVar = this.f17083B2;
        uif<U> uifVar = this.f17084C2;
        if (fastEnter()) {
            long j = this.f61580l2.get();
            if (j == 0) {
                mf4Var.dispose();
                ycgVar.onError(new cwa("Could not emit buffer due to lack of requests"));
                return;
            } else {
                if (accept(ycgVar, u) && j != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            }
        } else {
            uifVar.offer(u);
            if (!enter()) {
                return;
            }
        }
        ymd.drainMaxLoop(uifVar, ycgVar, z, mf4Var, this);
    }

    @Override // p000.wmd
    public boolean accept(ycg<? super V> ycgVar, U u) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m4091b(U u, boolean z, mf4 mf4Var) {
        ycg<? super V> ycgVar = this.f17083B2;
        uif<U> uifVar = this.f17084C2;
        if (fastEnter()) {
            long j = this.f61580l2.get();
            if (j == 0) {
                this.f17085D2 = true;
                mf4Var.dispose();
                ycgVar.onError(new cwa("Could not emit buffer due to lack of requests"));
                return;
            } else if (uifVar.isEmpty()) {
                if (accept(ycgVar, u) && j != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                uifVar.offer(u);
            }
        } else {
            uifVar.offer(u);
            if (!enter()) {
                return;
            }
        }
        ymd.drainMaxLoop(uifVar, ycgVar, z, mf4Var, this);
    }

    @Override // p000.wmd
    public final boolean cancelled() {
        return this.f17085D2;
    }

    @Override // p000.wmd
    public final boolean done() {
        return this.f17086E2;
    }

    @Override // p000.wmd
    public final boolean enter() {
        return this.f71502Y.getAndIncrement() == 0;
    }

    @Override // p000.wmd
    public final Throwable error() {
        return this.f17087F2;
    }

    public final boolean fastEnter() {
        return this.f71502Y.get() == 0 && this.f71502Y.compareAndSet(0, 1);
    }

    @Override // p000.wmd
    public final int leave(int i) {
        return this.f71502Y.addAndGet(i);
    }

    @Override // p000.wmd
    public final long produced(long j) {
        return this.f61580l2.addAndGet(-j);
    }

    @Override // p000.wmd
    public final long requested() {
        return this.f61580l2.get();
    }

    public final void requested(long j) {
        if (mdg.validate(j)) {
            so0.add(this.f61580l2, j);
        }
    }
}
