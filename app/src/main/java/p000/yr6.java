package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@qx4
public abstract class yr6<V> extends zs6 implements Future<V> {

    /* JADX INFO: renamed from: yr6$a */
    public static abstract class AbstractC15778a<V> extends yr6<V> {

        /* JADX INFO: renamed from: a */
        public final Future<V> f102756a;

        public AbstractC15778a(Future<V> delegate) {
            this.f102756a = (Future) v7d.checkNotNull(delegate);
        }

        @Override // p000.yr6, p000.zs6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Future<V> mo8967m() {
            return this.f102756a;
        }
    }

    @Override // p000.zs6
    /* JADX INFO: renamed from: a */
    public abstract Future<? extends V> mo8967m();

    @op1
    public boolean cancel(boolean mayInterruptIfRunning) {
        return mo8967m().cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.Future
    @op1
    @agc
    public V get() throws ExecutionException, InterruptedException {
        return mo8967m().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return mo8967m().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return mo8967m().isDone();
    }

    @Override // java.util.concurrent.Future
    @op1
    @agc
    public V get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        return mo8967m().get(timeout, unit);
    }
}
