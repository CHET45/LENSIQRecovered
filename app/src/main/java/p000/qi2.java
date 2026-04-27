package p000;

import java.util.NoSuchElementException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class qi2<T> extends CompletableFuture<T> implements k9a<T>, hnf<T>, ch2 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<lf4> f74484a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final boolean f74485b;

    /* JADX INFO: renamed from: c */
    public final T f74486c;

    public qi2(boolean hasDefault, T defaultItem) {
        this.f74485b = hasDefault;
        this.f74486c = defaultItem;
    }

    /* JADX INFO: renamed from: a */
    public void m20373a() {
        zf4.dispose(this.f74484a);
    }

    /* JADX INFO: renamed from: b */
    public void m20374b() {
        this.f74484a.lazySet(zf4.DISPOSED);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        m20373a();
        return super.cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.CompletableFuture
    public boolean complete(T value) {
        m20373a();
        return super.complete(value);
    }

    @Override // java.util.concurrent.CompletableFuture
    public boolean completeExceptionally(Throwable ex) {
        m20373a();
        return super.completeExceptionally(ex);
    }

    @Override // p000.k9a
    public void onComplete() {
        if (this.f74485b) {
            complete(this.f74486c);
        } else {
            completeExceptionally(new NoSuchElementException("The source was empty"));
        }
    }

    @Override // p000.k9a
    public void onError(Throwable t) {
        m20374b();
        if (completeExceptionally(t)) {
            return;
        }
        ofe.onError(t);
    }

    @Override // p000.k9a
    public void onSubscribe(@cfb lf4 d) {
        zf4.setOnce(this.f74484a, d);
    }

    @Override // p000.k9a
    public void onSuccess(@cfb T t) {
        m20374b();
        complete(t);
    }
}
