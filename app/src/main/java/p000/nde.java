package p000;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class nde<R, E extends Exception> implements RunnableFuture<R> {

    /* JADX INFO: renamed from: a */
    public final wp2 f64070a = new wp2();

    /* JADX INFO: renamed from: b */
    public final wp2 f64071b = new wp2();

    /* JADX INFO: renamed from: c */
    public final Object f64072c = new Object();

    /* JADX INFO: renamed from: d */
    @hib
    public Exception f64073d;

    /* JADX INFO: renamed from: e */
    @hib
    public R f64074e;

    /* JADX INFO: renamed from: f */
    @hib
    public Thread f64075f;

    /* JADX INFO: renamed from: m */
    public boolean f64076m;

    @euh
    private R getResult() throws ExecutionException {
        if (this.f64076m) {
            throw new CancellationException();
        }
        if (this.f64073d == null) {
            return this.f64074e;
        }
        throw new ExecutionException(this.f64073d);
    }

    /* JADX INFO: renamed from: a */
    public void mo5582a() {
    }

    @euh
    /* JADX INFO: renamed from: b */
    public abstract R mo5583b() throws Exception;

    public final void blockUntilFinished() {
        this.f64071b.blockUninterruptible();
    }

    public final void blockUntilStarted() {
        this.f64070a.blockUninterruptible();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.f64072c) {
            try {
                if (!this.f64076m && !this.f64071b.isOpen()) {
                    this.f64076m = true;
                    mo5582a();
                    Thread thread = this.f64075f;
                    if (thread == null) {
                        this.f64070a.open();
                        this.f64071b.open();
                    } else if (z) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    @euh
    public final R get() throws ExecutionException, InterruptedException {
        this.f64071b.block();
        return getResult();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f64076m;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f64071b.isOpen();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f64072c) {
            try {
                if (this.f64076m) {
                    return;
                }
                this.f64075f = Thread.currentThread();
                this.f64070a.open();
                try {
                    try {
                        this.f64074e = mo5583b();
                        synchronized (this.f64072c) {
                            this.f64071b.open();
                            this.f64075f = null;
                            Thread.interrupted();
                        }
                    } catch (Exception e) {
                        this.f64073d = e;
                        synchronized (this.f64072c) {
                            this.f64071b.open();
                            this.f64075f = null;
                            Thread.interrupted();
                        }
                    }
                } catch (Throwable th) {
                    synchronized (this.f64072c) {
                        this.f64071b.open();
                        this.f64075f = null;
                        Thread.interrupted();
                        throw th;
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    @euh
    public final R get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f64071b.block(TimeUnit.MILLISECONDS.convert(j, timeUnit))) {
            return getResult();
        }
        throw new TimeoutException();
    }
}
