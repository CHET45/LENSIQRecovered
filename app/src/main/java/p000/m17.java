package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class m17<T> extends CountDownLatch implements k9a<T>, hnf<T>, ch2, Future<T>, lf4 {

    /* JADX INFO: renamed from: a */
    public T f59566a;

    /* JADX INFO: renamed from: b */
    public Throwable f59567b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<lf4> f59568c;

    public m17() {
        super(1);
        this.f59568c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        lf4 lf4Var;
        zf4 zf4Var;
        do {
            lf4Var = this.f59568c.get();
            if (lf4Var == this || lf4Var == (zf4Var = zf4.DISPOSED)) {
                return false;
            }
        } while (!v7b.m23844a(this.f59568c, lf4Var, zf4Var));
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
        Throwable th = this.f59567b;
        if (th == null) {
            return this.f59566a;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return zf4.isDisposed(this.f59568c.get());
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // p000.k9a
    public void onComplete() {
        lf4 lf4Var = this.f59568c.get();
        if (lf4Var == zf4.DISPOSED) {
            return;
        }
        v7b.m23844a(this.f59568c, lf4Var, this);
        countDown();
    }

    @Override // p000.k9a
    public void onError(Throwable t) {
        lf4 lf4Var;
        do {
            lf4Var = this.f59568c.get();
            if (lf4Var == zf4.DISPOSED) {
                ofe.onError(t);
                return;
            }
            this.f59567b = t;
        } while (!v7b.m23844a(this.f59568c, lf4Var, this));
        countDown();
    }

    @Override // p000.k9a
    public void onSubscribe(lf4 d) {
        zf4.setOnce(this.f59568c, d);
    }

    @Override // p000.k9a
    public void onSuccess(T t) {
        lf4 lf4Var = this.f59568c.get();
        if (lf4Var == zf4.DISPOSED) {
            return;
        }
        this.f59566a = t;
        v7b.m23844a(this.f59568c, lf4Var, this);
        countDown();
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
            Throwable th = this.f59567b;
            if (th == null) {
                return this.f59566a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
