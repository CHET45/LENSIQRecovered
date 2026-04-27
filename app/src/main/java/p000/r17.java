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
public final class r17<T> extends CountDownLatch implements lj6<T>, Future<T>, fdg {

    /* JADX INFO: renamed from: a */
    public T f76745a;

    /* JADX INFO: renamed from: b */
    public Throwable f76746b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<fdg> f76747c;

    public r17() {
        super(1);
        this.f76747c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        fdg fdgVar;
        mdg mdgVar;
        do {
            fdgVar = this.f76747c.get();
            if (fdgVar == this || fdgVar == (mdgVar = mdg.CANCELLED)) {
                return false;
            }
        } while (!v7b.m23844a(this.f76747c, fdgVar, mdgVar));
        if (fdgVar != null) {
            fdgVar.cancel();
        }
        countDown();
        return true;
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
        Throwable th = this.f76746b;
        if (th == null) {
            return this.f76745a;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f76747c.get() == mdg.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // p000.ycg
    public void onComplete() {
        fdg fdgVar;
        if (this.f76745a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            fdgVar = this.f76747c.get();
            if (fdgVar == this || fdgVar == mdg.CANCELLED) {
                return;
            }
        } while (!v7b.m23844a(this.f76747c, fdgVar, this));
        countDown();
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        fdg fdgVar;
        do {
            fdgVar = this.f76747c.get();
            if (fdgVar == this || fdgVar == mdg.CANCELLED) {
                pfe.onError(th);
                return;
            }
            this.f76746b = th;
        } while (!v7b.m23844a(this.f76747c, fdgVar, this));
        countDown();
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (this.f76745a == null) {
            this.f76745a = t;
        } else {
            this.f76747c.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // p000.lj6, p000.ycg
    public void onSubscribe(fdg fdgVar) {
        mdg.setOnce(this.f76747c, fdgVar, Long.MAX_VALUE);
    }

    @Override // p000.fdg
    public void request(long j) {
    }

    @Override // p000.fdg
    public void cancel() {
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
            Throwable th = this.f76746b;
            if (th == null) {
                return this.f76745a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
