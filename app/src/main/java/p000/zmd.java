package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zmd<T, U, V> extends ind implements pxb<T>, nsb<U, V> {

    /* JADX INFO: renamed from: l2 */
    public final pxb<? super V> f105481l2;

    /* JADX INFO: renamed from: m2 */
    public final tif<U> f105482m2;

    /* JADX INFO: renamed from: n2 */
    public volatile boolean f105483n2;

    /* JADX INFO: renamed from: o2 */
    public volatile boolean f105484o2;

    /* JADX INFO: renamed from: p2 */
    public Throwable f105485p2;

    public zmd(pxb<? super V> actual, tif<U> queue) {
        this.f105481l2 = actual;
        this.f105482m2 = queue;
    }

    /* JADX INFO: renamed from: a */
    public final void m26900a(U value, boolean delayError, lf4 dispose) {
        pxb<? super V> pxbVar = this.f105481l2;
        tif<U> tifVar = this.f105482m2;
        if (this.f75019Y.get() == 0 && this.f75019Y.compareAndSet(0, 1)) {
            accept(pxbVar, value);
            if (leave(-1) == 0) {
                return;
            }
        } else {
            tifVar.offer(value);
            if (!enter()) {
                return;
            }
        }
        xmd.drainLoop(tifVar, pxbVar, delayError, dispose, this);
    }

    public void accept(pxb<? super V> a, U v) {
    }

    /* JADX INFO: renamed from: b */
    public final void m26901b(U value, boolean delayError, lf4 disposable) {
        pxb<? super V> pxbVar = this.f105481l2;
        tif<U> tifVar = this.f105482m2;
        if (this.f75019Y.get() != 0 || !this.f75019Y.compareAndSet(0, 1)) {
            tifVar.offer(value);
            if (!enter()) {
                return;
            }
        } else if (tifVar.isEmpty()) {
            accept(pxbVar, value);
            if (leave(-1) == 0) {
                return;
            }
        } else {
            tifVar.offer(value);
        }
        xmd.drainLoop(tifVar, pxbVar, delayError, disposable, this);
    }

    @Override // p000.nsb
    public final boolean cancelled() {
        return this.f105483n2;
    }

    @Override // p000.nsb
    public final boolean done() {
        return this.f105484o2;
    }

    @Override // p000.nsb
    public final boolean enter() {
        return this.f75019Y.getAndIncrement() == 0;
    }

    @Override // p000.nsb
    public final Throwable error() {
        return this.f105485p2;
    }

    @Override // p000.nsb
    public final int leave(int m) {
        return this.f75019Y.addAndGet(m);
    }
}
