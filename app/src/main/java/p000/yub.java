package p000;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class yub<T> extends CompletableFuture<T> implements pxb<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<lf4> f102999a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public T f103000b;

    /* JADX INFO: renamed from: a */
    public final void m26354a() {
        this.f103000b = null;
        this.f102999a.lazySet(zf4.DISPOSED);
    }

    /* JADX INFO: renamed from: b */
    public final void m26355b() {
        zf4.dispose(this.f102999a);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        m26355b();
        return super.cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(T value) {
        m26355b();
        return super.complete(value);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable ex) {
        m26355b();
        return super.completeExceptionally(ex);
    }

    @Override // p000.pxb
    public final void onError(Throwable t) {
        m26354a();
        if (completeExceptionally(t)) {
            return;
        }
        ofe.onError(t);
    }

    @Override // p000.pxb
    public final void onSubscribe(@cfb lf4 d) {
        zf4.setOnce(this.f102999a, d);
    }
}
