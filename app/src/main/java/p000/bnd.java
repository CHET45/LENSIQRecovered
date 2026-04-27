package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class bnd<T, U, V> extends nnd implements kj6<T>, vmd<U, V> {

    /* JADX INFO: renamed from: B2 */
    public final ycg<? super V> f14218B2;

    /* JADX INFO: renamed from: C2 */
    public final tif<U> f14219C2;

    /* JADX INFO: renamed from: D2 */
    public volatile boolean f14220D2;

    /* JADX INFO: renamed from: E2 */
    public volatile boolean f14221E2;

    /* JADX INFO: renamed from: F2 */
    public Throwable f14222F2;

    public bnd(ycg<? super V> actual, tif<U> queue) {
        this.f14218B2 = actual;
        this.f14219C2 = queue;
    }

    /* JADX INFO: renamed from: a */
    public final void m3258a(U value, boolean delayError, lf4 dispose) {
        ycg<? super V> ycgVar = this.f14218B2;
        tif<U> tifVar = this.f14219C2;
        if (fastEnter()) {
            long j = this.f58326l2.get();
            if (j == 0) {
                dispose.dispose();
                ycgVar.onError(new bwa("Could not emit buffer due to lack of requests"));
                return;
            } else {
                if (accept(ycgVar, value) && j != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            }
        } else {
            tifVar.offer(value);
            if (!enter()) {
                return;
            }
        }
        xmd.drainMaxLoop(tifVar, ycgVar, delayError, dispose, this);
    }

    @Override // p000.vmd
    public boolean accept(ycg<? super V> a, U v) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m3259b(U value, boolean delayError, lf4 dispose) {
        ycg<? super V> ycgVar = this.f14218B2;
        tif<U> tifVar = this.f14219C2;
        if (fastEnter()) {
            long j = this.f58326l2.get();
            if (j == 0) {
                this.f14220D2 = true;
                dispose.dispose();
                ycgVar.onError(new bwa("Could not emit buffer due to lack of requests"));
                return;
            } else if (tifVar.isEmpty()) {
                if (accept(ycgVar, value) && j != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                tifVar.offer(value);
            }
        } else {
            tifVar.offer(value);
            if (!enter()) {
                return;
            }
        }
        xmd.drainMaxLoop(tifVar, ycgVar, delayError, dispose, this);
    }

    @Override // p000.vmd
    public final boolean cancelled() {
        return this.f14220D2;
    }

    @Override // p000.vmd
    public final boolean done() {
        return this.f14221E2;
    }

    @Override // p000.vmd
    public final boolean enter() {
        return this.f78806Y.getAndIncrement() == 0;
    }

    @Override // p000.vmd
    public final Throwable error() {
        return this.f14222F2;
    }

    public final boolean fastEnter() {
        return this.f78806Y.get() == 0 && this.f78806Y.compareAndSet(0, 1);
    }

    @Override // p000.vmd
    public final int leave(int m) {
        return this.f78806Y.addAndGet(m);
    }

    @Override // p000.vmd
    public final long produced(long n) {
        return this.f58326l2.addAndGet(-n);
    }

    @Override // p000.vmd
    public final long requested() {
        return this.f58326l2.get();
    }

    public final void requested(long n) {
        if (ldg.validate(n)) {
            ro0.add(this.f58326l2, n);
        }
    }
}
