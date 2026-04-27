package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
public final class xe4<T> extends uqe<T> {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f97578e = AtomicIntegerFieldUpdater.newUpdater(xe4.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public xe4(@yfb e13 e13Var, @yfb zy2<? super T> zy2Var) {
        super(e13Var, zy2Var);
    }

    private final /* synthetic */ int get_decision$volatile() {
        return this._decision$volatile;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, qy6<? super Integer, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void set_decision$volatile(int i) {
        this._decision$volatile = i;
    }

    private final boolean tryResume() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f97578e;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f97578e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean trySuspend() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f97578e;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f97578e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p000.uqe, p000.sj8
    /* JADX INFO: renamed from: a */
    public void mo3831a(@gib Object obj) {
        mo10224o(obj);
    }

    @gib
    public final Object getResult$kotlinx_coroutines_core() {
        if (trySuspend()) {
            return pd8.getCOROUTINE_SUSPENDED();
        }
        Object objUnboxState = tj8.unboxState(getState$kotlinx_coroutines_core());
        if (objUnboxState instanceof ni2) {
            throw ((ni2) objUnboxState).f64635a;
        }
        return objUnboxState;
    }

    @Override // p000.uqe, p000.AbstractC12833t0
    /* JADX INFO: renamed from: o */
    public void mo10224o(@gib Object obj) {
        if (tryResume()) {
            return;
        }
        we4.resumeCancellableWith(od8.intercepted(this.f88815d), ri2.recoverResult(obj, this.f88815d));
    }
}
