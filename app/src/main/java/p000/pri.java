package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.kx7;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public abstract class pri implements ExecutorService {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f71777a;

    public pri(ExecutorService delegate) {
        this.f71777a = (ExecutorService) v7d.checkNotNull(delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$wrapTask$0(Callable callable) {
        try {
            callable.call();
        } catch (Exception e) {
            uwc.m23618b(e);
            bzg.throwIfUnchecked(e);
            throw new RuntimeException(e);
        }
    }

    private <T> kx7<Callable<T>> wrapTasks(Collection<? extends Callable<T>> tasks) {
        kx7.C8541a c8541aBuilder = kx7.builder();
        Iterator<? extends Callable<T>> it = tasks.iterator();
        while (it.hasNext()) {
            c8541aBuilder.add(mo19726c(it.next()));
        }
        return c8541aBuilder.build();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return this.f71777a.awaitTermination(timeout, unit);
    }

    /* JADX INFO: renamed from: b */
    public Runnable mo19725b(Runnable command) {
        final Callable callableMo19726c = mo19726c(Executors.callable(command, null));
        return new Runnable() { // from class: ori
            @Override // java.lang.Runnable
            public final void run() {
                pri.lambda$wrapTask$0(callableMo19726c);
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public abstract <T> Callable<T> mo19726c(Callable<T> callable);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        this.f71777a.execute(mo19725b(command));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return this.f71777a.invokeAll(wrapTasks(tasks));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f71777a.invokeAny(wrapTasks(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f71777a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f71777a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f71777a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @op1
    public final List<Runnable> shutdownNow() {
        return this.f71777a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> task) {
        return this.f71777a.submit(mo19726c((Callable) v7d.checkNotNull(task)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return this.f71777a.invokeAll(wrapTasks(tasks), timeout, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f71777a.invokeAny(wrapTasks(collection), j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable task) {
        return this.f71777a.submit(mo19725b(task));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable task, @agc T result) {
        return this.f71777a.submit(mo19725b(task), result);
    }
}
