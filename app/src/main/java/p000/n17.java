package p000;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class n17<T> extends CountDownLatch implements pxb<T>, Future<T>, lf4 {

    /* JADX INFO: renamed from: a */
    public T f62948a;

    /* JADX INFO: renamed from: b */
    public Throwable f62949b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<lf4> f62950c;

    public n17() {
        super(1);
        this.f62950c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        lf4 lf4Var;
        zf4 zf4Var;
        do {
            lf4Var = this.f62950c.get();
            if (lf4Var == this || lf4Var == (zf4Var = zf4.DISPOSED)) {
                return false;
            }
        } while (!v7b.m23844a(this.f62950c, lf4Var, zf4Var));
        if (lf4Var != null) {
            lf4Var.dispose();
        }
        countDown();
        return true;
    }

    @Override // p000.lf4
    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            s71.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.f62949b;
        if (th == null) {
            return this.f62948a;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return zf4.isDisposed(this.f62950c.get());
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // p000.pxb
    public void onComplete() {
        if (this.f62948a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        lf4 lf4Var = this.f62950c.get();
        if (lf4Var == this || lf4Var == zf4.DISPOSED || !v7b.m23844a(this.f62950c, lf4Var, this)) {
            return;
        }
        countDown();
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        lf4 lf4Var;
        if (this.f62949b != null || (lf4Var = this.f62950c.get()) == this || lf4Var == zf4.DISPOSED || !v7b.m23844a(this.f62950c, lf4Var, this)) {
            ofe.onError(t);
        } else {
            this.f62949b = t;
            countDown();
        }
    }

    @Override // p000.pxb
    public void onNext(T t) {
        if (this.f62948a == null) {
            this.f62948a = t;
        } else {
            this.f62950c.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        zf4.setOnce(this.f62950c, d);
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, @cfb TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            s71.verifyNonBlocking();
            if (!await(timeout, unit)) {
                throw new TimeoutException(k75.timeoutMessage(timeout, unit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.f62949b;
            if (th == null) {
                return this.f62948a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
