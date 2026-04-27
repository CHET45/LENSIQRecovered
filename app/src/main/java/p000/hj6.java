package p000;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class hj6<T> extends CompletableFuture<T> implements kj6<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<fdg> f43803a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public T f43804b;

    /* JADX INFO: renamed from: a */
    public abstract void mo12424a(fdg s);

    /* JADX INFO: renamed from: b */
    public final void m12425b() {
        ldg.cancel(this.f43803a);
    }

    /* JADX INFO: renamed from: c */
    public final void m12426c() {
        this.f43804b = null;
        this.f43803a.lazySet(ldg.CANCELLED);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        m12425b();
        return super.cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(T value) {
        m12425b();
        return super.complete(value);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable ex) {
        m12425b();
        return super.completeExceptionally(ex);
    }

    @Override // p000.ycg
    public final void onError(Throwable t) {
        m12426c();
        if (completeExceptionally(t)) {
            return;
        }
        ofe.onError(t);
    }

    @Override // p000.kj6, p000.ycg
    public final void onSubscribe(@cfb fdg s) {
        if (ldg.setOnce(this.f43803a, s)) {
            mo12424a(s);
        }
    }
}
