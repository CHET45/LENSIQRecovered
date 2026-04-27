package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@qx4
public final class wr6<V> extends dm6<V> {

    /* JADX INFO: renamed from: F */
    public final ja9<V> f95195F;

    public wr6(ja9<V> delegate) {
        this.f95195F = (ja9) v7d.checkNotNull(delegate);
    }

    @Override // p000.AbstractC9640n1, p000.ja9
    public void addListener(Runnable listener, Executor executor) {
        this.f95195F.addListener(listener, executor);
    }

    @Override // p000.AbstractC9640n1, java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return this.f95195F.cancel(mayInterruptIfRunning);
    }

    @Override // p000.AbstractC9640n1, java.util.concurrent.Future
    @agc
    public V get() throws ExecutionException, InterruptedException {
        return this.f95195F.get();
    }

    @Override // p000.AbstractC9640n1, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f95195F.isCancelled();
    }

    @Override // p000.AbstractC9640n1, java.util.concurrent.Future
    public boolean isDone() {
        return this.f95195F.isDone();
    }

    @Override // p000.AbstractC9640n1
    public String toString() {
        return this.f95195F.toString();
    }

    @Override // p000.AbstractC9640n1, java.util.concurrent.Future
    @agc
    public V get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f95195F.get(timeout, unit);
    }
}
