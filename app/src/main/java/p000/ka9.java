package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public class ka9<V> extends FutureTask<V> implements ja9<V> {

    /* JADX INFO: renamed from: a */
    public final l85 f53446a;

    public ka9(Callable<V> callable) {
        super(callable);
        this.f53446a = new l85();
    }

    public static <V> ka9<V> create(Callable<V> callable) {
        return new ka9<>(callable);
    }

    @Override // p000.ja9
    public void addListener(Runnable listener, Executor exec) {
        this.f53446a.add(listener, exec);
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        this.f53446a.execute();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    @op1
    @agc
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        return nanos <= m9c.f60292a ? (V) super.get(j, timeUnit) : (V) super.get(Math.min(nanos, m9c.f60292a), TimeUnit.NANOSECONDS);
    }

    public static <V> ka9<V> create(Runnable runnable, @agc V result) {
        return new ka9<>(runnable, result);
    }

    public ka9(Runnable runnable, @agc V result) {
        super(runnable, result);
        this.f53446a = new l85();
    }
}
