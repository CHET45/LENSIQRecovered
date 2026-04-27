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
public final class o17<T> extends CountDownLatch implements oxb<T>, Future<T>, mf4 {

    /* JADX INFO: renamed from: a */
    public T f66203a;

    /* JADX INFO: renamed from: b */
    public Throwable f66204b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<mf4> f66205c;

    public o17() {
        super(1);
        this.f66205c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        mf4 mf4Var;
        ag4 ag4Var;
        do {
            mf4Var = this.f66205c.get();
            if (mf4Var == this || mf4Var == (ag4Var = ag4.DISPOSED)) {
                return false;
            }
        } while (!v7b.m23844a(this.f66205c, mf4Var, ag4Var));
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
        Throwable th = this.f66204b;
        if (th == null) {
            return this.f66203a;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return ag4.isDisposed(this.f66205c.get());
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // p000.oxb
    public void onComplete() {
        mf4 mf4Var;
        if (this.f66203a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            mf4Var = this.f66205c.get();
            if (mf4Var == this || mf4Var == ag4.DISPOSED) {
                return;
            }
        } while (!v7b.m23844a(this.f66205c, mf4Var, this));
        countDown();
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        mf4 mf4Var;
        if (this.f66204b != null) {
            pfe.onError(th);
            return;
        }
        this.f66204b = th;
        do {
            mf4Var = this.f66205c.get();
            if (mf4Var == this || mf4Var == ag4.DISPOSED) {
                pfe.onError(th);
                return;
            }
        } while (!v7b.m23844a(this.f66205c, mf4Var, this));
        countDown();
    }

    @Override // p000.oxb
    public void onNext(T t) {
        if (this.f66203a == null) {
            this.f66203a = t;
        } else {
            this.f66205c.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        ag4.setOnce(this.f66205c, mf4Var);
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
            Throwable th = this.f66204b;
            if (th == null) {
                return this.f66203a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
