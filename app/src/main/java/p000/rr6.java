package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public abstract class rr6 extends zs6 implements ExecutorService {
    @Override // p000.zs6
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract ExecutorService mo22402p();

    @Override // java.util.concurrent.ExecutorService
    @zx1
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return mo22402p().awaitTermination(timeout, unit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        mo22402p().execute(command);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return mo22402p().invokeAll(tasks);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) mo22402p().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return mo22402p().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return mo22402p().isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        mo22402p().shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @op1
    public List<Runnable> shutdownNow() {
        return mo22402p().shutdownNow();
    }

    public <T> Future<T> submit(Callable<T> task) {
        return mo22402p().submit(task);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return mo22402p().invokeAll(tasks, timeout, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) mo22402p().invokeAny(collection, j, timeUnit);
    }

    public Future<?> submit(Runnable task) {
        return mo22402p().submit(task);
    }

    public <T> Future<T> submit(Runnable task, @agc T result) {
        return mo22402p().submit(task, result);
    }
}
