package p000;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class ode<R, E extends Exception> implements RunnableFuture<R> {

    /* JADX INFO: renamed from: a */
    public final yp2 f67357a = new yp2();

    /* JADX INFO: renamed from: b */
    public final yp2 f67358b = new yp2();

    /* JADX INFO: renamed from: c */
    public final Object f67359c = new Object();

    /* JADX INFO: renamed from: d */
    @hib
    public Exception f67360d;

    /* JADX INFO: renamed from: e */
    @hib
    public R f67361e;

    /* JADX INFO: renamed from: f */
    @hib
    public Thread f67362f;

    /* JADX INFO: renamed from: m */
    public boolean f67363m;

    @fuh
    private R getResult() throws ExecutionException {
        if (this.f67363m) {
            throw new CancellationException();
        }
        if (this.f67360d == null) {
            return this.f67361e;
        }
        throw new ExecutionException(this.f67360d);
    }

    /* JADX INFO: renamed from: a */
    public void mo1948a() {
    }

    @fuh
    /* JADX INFO: renamed from: b */
    public abstract R mo1949b() throws Exception;

    public final void blockUntilFinished() {
        this.f67358b.blockUninterruptible();
    }

    public final void blockUntilStarted() {
        this.f67357a.blockUninterruptible();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.f67359c) {
            try {
                if (!this.f67363m && !this.f67358b.isOpen()) {
                    this.f67363m = true;
                    mo1948a();
                    Thread thread = this.f67362f;
                    if (thread == null) {
                        this.f67357a.open();
                        this.f67358b.open();
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
    @fuh
    public final R get() throws ExecutionException, InterruptedException {
        this.f67358b.block();
        return getResult();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f67363m;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f67358b.isOpen();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f67359c) {
            try {
                if (this.f67363m) {
                    return;
                }
                this.f67362f = Thread.currentThread();
                this.f67357a.open();
                try {
                    try {
                        this.f67361e = mo1949b();
                        synchronized (this.f67359c) {
                            this.f67358b.open();
                            this.f67362f = null;
                            Thread.interrupted();
                        }
                    } catch (Exception e) {
                        this.f67360d = e;
                        synchronized (this.f67359c) {
                            this.f67358b.open();
                            this.f67362f = null;
                            Thread.interrupted();
                        }
                    }
                } catch (Throwable th) {
                    synchronized (this.f67359c) {
                        this.f67358b.open();
                        this.f67362f = null;
                        Thread.interrupted();
                        throw th;
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    @fuh
    public final R get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f67358b.block(TimeUnit.MILLISECONDS.convert(j, timeUnit))) {
            return getResult();
        }
        throw new TimeoutException();
    }
}
