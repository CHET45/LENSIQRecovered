package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.AbstractC9640n1;
import p000.lic;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use FluentFuture.from(Futures.immediate*Future) or SettableFuture")
@gd7(emulated = true)
@qx4
public abstract class dm6<V> extends hd7<V> {

    /* JADX INFO: renamed from: dm6$a */
    public static abstract class AbstractC4859a<V> extends dm6<V> implements AbstractC9640n1.i<V> {
        @Override // p000.AbstractC9640n1, p000.ja9
        public final void addListener(Runnable listener, Executor executor) {
            super.addListener(listener, executor);
        }

        @Override // p000.AbstractC9640n1, java.util.concurrent.Future
        @op1
        public final boolean cancel(boolean mayInterruptIfRunning) {
            return super.cancel(mayInterruptIfRunning);
        }

        @Override // p000.AbstractC9640n1, java.util.concurrent.Future
        @op1
        @agc
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // p000.AbstractC9640n1, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // p000.AbstractC9640n1, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // p000.AbstractC9640n1, java.util.concurrent.Future
        @op1
        @agc
        public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    public static <V> dm6<V> from(ja9<V> future) {
        return future instanceof dm6 ? (dm6) future : new wr6(future);
    }

    public final void addCallback(c17<? super V> callback, Executor executor) {
        w17.addCallback(this, callback, executor);
    }

    @lic.InterfaceC8830a("AVAILABLE but requires exceptionType to be Throwable.class")
    @yg8
    public final <X extends Throwable> dm6<V> catching(Class<X> exceptionType, lz6<? super X, ? extends V> fallback, Executor executor) {
        return (dm6) w17.catching(this, exceptionType, fallback, executor);
    }

    @lic.InterfaceC8830a("AVAILABLE but requires exceptionType to be Throwable.class")
    @yg8
    public final <X extends Throwable> dm6<V> catchingAsync(Class<X> exceptionType, v90<? super X, ? extends V> fallback, Executor executor) {
        return (dm6) w17.catchingAsync(this, exceptionType, fallback, executor);
    }

    public final <T> dm6<T> transform(lz6<? super V, T> function, Executor executor) {
        return (dm6) w17.transform(this, function, executor);
    }

    public final <T> dm6<T> transformAsync(v90<? super V, T> function, Executor executor) {
        return (dm6) w17.transformAsync(this, function, executor);
    }

    @jd7
    @yg8
    public final dm6<V> withTimeout(long timeout, TimeUnit unit, ScheduledExecutorService scheduledExecutor) {
        return (dm6) w17.withTimeout(this, timeout, unit, scheduledExecutor);
    }

    @Deprecated
    public static <V> dm6<V> from(dm6<V> future) {
        return (dm6) v7d.checkNotNull(future);
    }
}
