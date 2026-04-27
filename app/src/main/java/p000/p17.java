package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class p17<T> extends CountDownLatch implements inf<T>, Future<T>, mf4 {

    /* JADX INFO: renamed from: a */
    public T f69388a;

    /* JADX INFO: renamed from: b */
    public Throwable f69389b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<mf4> f69390c;

    public p17() {
        super(1);
        this.f69390c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        mf4 mf4Var;
        ag4 ag4Var;
        do {
            mf4Var = this.f69390c.get();
            if (mf4Var == this || mf4Var == (ag4Var = ag4.DISPOSED)) {
                return false;
            }
        } while (!v7b.m23844a(this.f69390c, mf4Var, ag4Var));
        if (mf4Var != null) {
            mf4Var.dispose();
        }
        countDown();
        return true;
    }

    @Override // p000.mf4
    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            t71.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.f69389b;
        if (th == null) {
            return this.f69388a;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return ag4.isDisposed(this.f69390c.get());
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // p000.inf
    public void onError(Throwable th) {
        mf4 mf4Var;
        do {
            mf4Var = this.f69390c.get();
            if (mf4Var == ag4.DISPOSED) {
                pfe.onError(th);
                return;
            }
            this.f69389b = th;
        } while (!v7b.m23844a(this.f69390c, mf4Var, this));
        countDown();
    }

    @Override // p000.inf
    public void onSubscribe(mf4 mf4Var) {
        ag4.setOnce(this.f69390c, mf4Var);
    }

    @Override // p000.inf
    public void onSuccess(T t) {
        mf4 mf4Var = this.f69390c.get();
        if (mf4Var == ag4.DISPOSED) {
            return;
        }
        this.f69388a = t;
        v7b.m23844a(this.f69390c, mf4Var, this);
        countDown();
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            t71.verifyNonBlocking();
            if (!await(j, timeUnit)) {
                throw new TimeoutException(j75.timeoutMessage(j, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.f69389b;
            if (th == null) {
                return this.f69388a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
