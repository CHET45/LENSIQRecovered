package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
public final class pyg extends rj8 {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f72533m = AtomicIntegerFieldUpdater.newUpdater(pyg.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e */
    public final Thread f72534e = Thread.currentThread();

    /* JADX INFO: renamed from: f */
    @gib
    public yf4 f72535f;

    private final /* synthetic */ int get_state$volatile() {
        return this._state$volatile;
    }

    private final Void invalidState(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, qy6<? super Integer, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void set_state$volatile(int i) {
        this._state$volatile = i;
    }

    public final void clearInterrupt() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f72533m;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        invalidState(i);
                        throw new us8();
                    }
                }
            } else if (f72533m.compareAndSet(this, i, 1)) {
                yf4 yf4Var = this.f72535f;
                if (yf4Var != null) {
                    yf4Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    @Override // p000.rj8
    public boolean getOnCancelling() {
        return true;
    }

    @Override // p000.rj8
    public void invoke(@gib Throwable th) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f72533m;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                invalidState(i);
                throw new us8();
            }
        } while (!f72533m.compareAndSet(this, i, 2));
        this.f72534e.interrupt();
        f72533m.set(this, 3);
    }

    public final void setup(@yfb jj8 jj8Var) {
        int i;
        this.f72535f = qj8.invokeOnCompletion$default(jj8Var, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f72533m;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2 || i == 3) {
                    return;
                }
                invalidState(i);
                throw new us8();
            }
        } while (!f72533m.compareAndSet(this, i, 0));
    }
}
