package p000;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class e17 extends AtomicReference<Future<?>> implements mf4 {
    private static final long serialVersionUID = 6545242830671168775L;

    /* JADX INFO: renamed from: a */
    public final boolean f31499a;

    public e17(Future<?> future, boolean z) {
        super(future);
        this.f31499a = z;
    }

    @Override // p000.mf4
    public void dispose() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(this.f31499a);
        }
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        Future<?> future = get();
        return future == null || future.isDone();
    }
}
