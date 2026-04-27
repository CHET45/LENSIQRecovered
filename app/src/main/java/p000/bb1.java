package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class bb1 extends AtomicBoolean implements fdg {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // p000.fdg
    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    @Override // p000.fdg
    public void request(long j) {
        mdg.validate(j);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + c0b.f15434d;
    }
}
