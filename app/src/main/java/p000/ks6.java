package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public abstract class ks6 extends rr6 implements bb9 {
    @Override // p000.rr6, p000.zs6
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract bb9 mo8967m();

    @Override // p000.rr6, java.util.concurrent.ExecutorService, p000.bb9
    public <T> ja9<T> submit(Callable<T> task) {
        return mo22402p().submit((Callable) task);
    }

    @Override // p000.rr6, java.util.concurrent.ExecutorService, p000.bb9
    public ja9<?> submit(Runnable task) {
        return mo22402p().submit(task);
    }

    @Override // p000.rr6, java.util.concurrent.ExecutorService, p000.bb9
    public <T> ja9<T> submit(Runnable task, @agc T result) {
        return mo22402p().submit(task, (Object) result);
    }
}
