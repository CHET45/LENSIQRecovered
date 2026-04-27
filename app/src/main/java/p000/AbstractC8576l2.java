package p000;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: l2 */
/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@zx1
@qx4
public abstract class AbstractC8576l2 extends AbstractExecutorService implements bb9 {
    @Override // java.util.concurrent.AbstractExecutorService
    @op1
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, @agc T value) {
        return jjh.m14137q(runnable, value);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    @op1
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return jjh.m14138r(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, p000.bb9
    @op1
    public ja9<?> submit(Runnable task) {
        return (ja9) super.submit(task);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, p000.bb9
    @op1
    public <T> ja9<T> submit(Runnable task, @agc T result) {
        return (ja9) super.submit(task, (Object) result);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, p000.bb9
    @op1
    public <T> ja9<T> submit(Callable<T> task) {
        return (ja9) super.submit((Callable) task);
    }
}
