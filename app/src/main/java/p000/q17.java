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
public final class q17<T> extends CountDownLatch implements kj6<T>, Future<T>, fdg {

    /* JADX INFO: renamed from: a */
    public T f72888a;

    /* JADX INFO: renamed from: b */
    public Throwable f72889b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<fdg> f72890c;

    public q17() {
        super(1);
        this.f72890c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        fdg fdgVar;
        ldg ldgVar;
        do {
            fdgVar = this.f72890c.get();
            if (fdgVar == this || fdgVar == (ldgVar = ldg.CANCELLED)) {
                return false;
            }
        } while (!v7b.m23844a(this.f72890c, fdgVar, ldgVar));
        if (fdgVar != null) {
            fdgVar.cancel();
        }
        countDown();
        return true;
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
        Throwable th = this.f72889b;
        if (th == null) {
            return this.f72888a;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f72890c.get() == ldg.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f72888a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        fdg fdgVar = this.f72890c.get();
        if (fdgVar == this || fdgVar == ldg.CANCELLED || !v7b.m23844a(this.f72890c, fdgVar, this)) {
            return;
        }
        countDown();
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        fdg fdgVar;
        if (this.f72889b != null || (fdgVar = this.f72890c.get()) == this || fdgVar == ldg.CANCELLED || !v7b.m23844a(this.f72890c, fdgVar, this)) {
            ofe.onError(t);
        } else {
            this.f72889b = t;
            countDown();
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (this.f72888a == null) {
            this.f72888a = t;
        } else {
            this.f72890c.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(fdg s) {
        ldg.setOnce(this.f72890c, s, Long.MAX_VALUE);
    }

    @Override // p000.fdg
    public void request(long n) {
    }

    @Override // p000.fdg
    public void cancel() {
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
            Throwable th = this.f72889b;
            if (th == null) {
                return this.f72888a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
