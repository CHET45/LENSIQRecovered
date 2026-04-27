package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class iq1 extends AtomicReference<bq1> implements lf4 {
    private static final long serialVersionUID = 5718521705281392066L;

    public iq1(bq1 cancellable) {
        super(cancellable);
    }

    @Override // p000.lf4
    public void dispose() {
        bq1 andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return get() == null;
    }
}
