package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.s44;

/* JADX INFO: loaded from: classes5.dex */
public class r44 implements ScheduledExecutorService {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f76999a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f77000b;

    public r44(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f76999a = executorService;
        this.f77000b = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$schedule$0(Runnable runnable, s44.InterfaceC12431b interfaceC12431b) {
        try {
            runnable.run();
            interfaceC12431b.set(null);
        } catch (Exception e) {
            interfaceC12431b.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$schedule$1(final Runnable runnable, final s44.InterfaceC12431b interfaceC12431b) {
        this.f76999a.execute(new Runnable() { // from class: l44
            @Override // java.lang.Runnable
            public final void run() {
                r44.lambda$schedule$0(runnable, interfaceC12431b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$schedule$2(final Runnable runnable, long j, TimeUnit timeUnit, final s44.InterfaceC12431b interfaceC12431b) {
        return this.f77000b.schedule(new Runnable() { // from class: j44
            @Override // java.lang.Runnable
            public final void run() {
                this.f49502a.lambda$schedule$1(runnable, interfaceC12431b);
            }
        }, j, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$schedule$3(Callable callable, s44.InterfaceC12431b interfaceC12431b) {
        try {
            interfaceC12431b.set(callable.call());
        } catch (Exception e) {
            interfaceC12431b.setException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Future lambda$schedule$4(final Callable callable, final s44.InterfaceC12431b interfaceC12431b) throws Exception {
        return this.f76999a.submit(new Runnable() { // from class: o44
            @Override // java.lang.Runnable
            public final void run() {
                r44.lambda$schedule$3(callable, interfaceC12431b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$schedule$5(final Callable callable, long j, TimeUnit timeUnit, final s44.InterfaceC12431b interfaceC12431b) {
        return this.f77000b.schedule(new Callable() { // from class: p44
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f69626a.lambda$schedule$4(callable, interfaceC12431b);
            }
        }, j, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scheduleAtFixedRate$6(Runnable runnable, s44.InterfaceC12431b interfaceC12431b) throws Exception {
        try {
            runnable.run();
        } catch (Exception e) {
            interfaceC12431b.setException(e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleAtFixedRate$7(final Runnable runnable, final s44.InterfaceC12431b interfaceC12431b) {
        this.f76999a.execute(new Runnable() { // from class: q44
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                r44.lambda$scheduleAtFixedRate$6(runnable, interfaceC12431b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$scheduleAtFixedRate$8(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final s44.InterfaceC12431b interfaceC12431b) {
        return this.f77000b.scheduleAtFixedRate(new Runnable() { // from class: i44
            @Override // java.lang.Runnable
            public final void run() {
                this.f45713a.lambda$scheduleAtFixedRate$7(runnable, interfaceC12431b);
            }
        }, j, j2, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleWithFixedDelay$10(final Runnable runnable, final s44.InterfaceC12431b interfaceC12431b) {
        this.f76999a.execute(new Runnable() { // from class: g44
            @Override // java.lang.Runnable
            public final void run() {
                r44.lambda$scheduleWithFixedDelay$9(runnable, interfaceC12431b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$scheduleWithFixedDelay$11(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final s44.InterfaceC12431b interfaceC12431b) {
        return this.f77000b.scheduleWithFixedDelay(new Runnable() { // from class: h44
            @Override // java.lang.Runnable
            public final void run() {
                this.f42302a.lambda$scheduleWithFixedDelay$10(runnable, interfaceC12431b);
            }
        }, j, j2, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scheduleWithFixedDelay$9(Runnable runnable, s44.InterfaceC12431b interfaceC12431b) {
        try {
            runnable.run();
        } catch (Exception e) {
            interfaceC12431b.setException(e);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f76999a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f76999a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f76999a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f76999a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f76999a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f76999a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new s44(new s44.InterfaceC12432c() { // from class: f44
            @Override // p000.s44.InterfaceC12432c
            public final ScheduledFuture addCompleter(s44.InterfaceC12431b interfaceC12431b) {
                return this.f35023a.lambda$schedule$2(runnable, j, timeUnit, interfaceC12431b);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new s44(new s44.InterfaceC12432c() { // from class: k44
            @Override // p000.s44.InterfaceC12432c
            public final ScheduledFuture addCompleter(s44.InterfaceC12431b interfaceC12431b) {
                return this.f52560a.lambda$scheduleAtFixedRate$8(runnable, j, j2, timeUnit, interfaceC12431b);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new s44(new s44.InterfaceC12432c() { // from class: m44
            @Override // p000.s44.InterfaceC12432c
            public final ScheduledFuture addCompleter(s44.InterfaceC12431b interfaceC12431b) {
                return this.f59867a.lambda$scheduleWithFixedDelay$11(runnable, j, j2, timeUnit, interfaceC12431b);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f76999a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f76999a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f76999a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new s44(new s44.InterfaceC12432c() { // from class: n44
            @Override // p000.s44.InterfaceC12432c
            public final ScheduledFuture addCompleter(s44.InterfaceC12431b interfaceC12431b) {
                return this.f63240a.lambda$schedule$5(callable, j, timeUnit, interfaceC12431b);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f76999a.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f76999a.submit(runnable);
    }
}
