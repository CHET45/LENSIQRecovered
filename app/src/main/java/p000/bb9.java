package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use TestingExecutors.sameThreadScheduledExecutor, or wrap a real Executor from java.util.concurrent.Executors with MoreExecutors.listeningDecorator")
@jd7
@qx4
public interface bb9 extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    ja9<?> submit(Runnable task);

    @Override // java.util.concurrent.ExecutorService
    <T> ja9<T> submit(Runnable task, @agc T result);

    @Override // java.util.concurrent.ExecutorService
    <T> ja9<T> submit(Callable<T> task);
}
