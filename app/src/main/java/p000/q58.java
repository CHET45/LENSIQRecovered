package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class q58 implements Callable<Void>, lf4 {

    /* JADX INFO: renamed from: f */
    public static final FutureTask<Void> f73265f = new FutureTask<>(r07.f76638b, null);

    /* JADX INFO: renamed from: a */
    public final Runnable f73266a;

    /* JADX INFO: renamed from: d */
    public final ExecutorService f73269d;

    /* JADX INFO: renamed from: e */
    public Thread f73270e;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<Future<?>> f73268c = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final AtomicReference<Future<?>> f73267b = new AtomicReference<>();

    public q58(Runnable task, ExecutorService executor) {
        this.f73266a = task;
        this.f73269d = executor;
    }

    /* JADX INFO: renamed from: a */
    public void m20072a(Future<?> f) {
        Future<?> future;
        do {
            future = this.f73268c.get();
            if (future == f73265f) {
                f.cancel(this.f73270e != Thread.currentThread());
                return;
            }
        } while (!v7b.m23844a(this.f73268c, future, f));
    }

    /* JADX INFO: renamed from: b */
    public void m20073b(Future<?> f) {
        Future<?> future;
        do {
            future = this.f73267b.get();
            if (future == f73265f) {
                f.cancel(this.f73270e != Thread.currentThread());
                return;
            }
        } while (!v7b.m23844a(this.f73267b, future, f));
    }

    @Override // p000.lf4
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f73268c;
        FutureTask<Void> futureTask = f73265f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f73270e != Thread.currentThread());
        }
        Future<?> andSet2 = this.f73267b.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f73270e != Thread.currentThread());
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this.f73268c.get() == f73265f;
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        this.f73270e = Thread.currentThread();
        try {
            this.f73266a.run();
            this.f73270e = null;
            m20073b(this.f73269d.submit(this));
            return null;
        } catch (Throwable th) {
            this.f73270e = null;
            ofe.onError(th);
            throw th;
        }
    }
}
