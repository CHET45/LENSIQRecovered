package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class r58 implements Callable<Void>, mf4 {

    /* JADX INFO: renamed from: f */
    public static final FutureTask<Void> f77078f = new FutureTask<>(q07.f72640b, null);

    /* JADX INFO: renamed from: a */
    public final Runnable f77079a;

    /* JADX INFO: renamed from: d */
    public final ExecutorService f77082d;

    /* JADX INFO: renamed from: e */
    public Thread f77083e;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<Future<?>> f77081c = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final AtomicReference<Future<?>> f77080b = new AtomicReference<>();

    public r58(Runnable runnable, ExecutorService executorService) {
        this.f77079a = runnable;
        this.f77082d = executorService;
    }

    /* JADX INFO: renamed from: a */
    public void m21021a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f77081c.get();
            if (future2 == f77078f) {
                future.cancel(this.f77083e != Thread.currentThread());
                return;
            }
        } while (!v7b.m23844a(this.f77081c, future2, future));
    }

    /* JADX INFO: renamed from: b */
    public void m21022b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f77080b.get();
            if (future2 == f77078f) {
                future.cancel(this.f77083e != Thread.currentThread());
                return;
            }
        } while (!v7b.m23844a(this.f77080b, future2, future));
    }

    @Override // p000.mf4
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f77081c;
        FutureTask<Void> futureTask = f77078f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f77083e != Thread.currentThread());
        }
        Future<?> andSet2 = this.f77080b.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f77083e != Thread.currentThread());
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return this.f77081c.get() == f77078f;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f77083e = Thread.currentThread();
        try {
            this.f77079a.run();
            m21022b(this.f77082d.submit(this));
            this.f77083e = null;
        } catch (Throwable th) {
            this.f77083e = null;
            pfe.onError(th);
        }
        return null;
    }
}
