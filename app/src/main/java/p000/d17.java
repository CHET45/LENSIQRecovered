package p000;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class d17 extends AtomicReference<Future<?>> implements lf4 {
    private static final long serialVersionUID = 6545242830671168775L;

    /* JADX INFO: renamed from: a */
    public final boolean f28215a;

    public d17(Future<?> run, boolean allowInterrupt) {
        super(run);
        this.f28215a = allowInterrupt;
    }

    @Override // p000.lf4
    public void dispose() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(this.f28215a);
        }
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        Future<?> future = get();
        return future == null || future.isDone();
    }
}
