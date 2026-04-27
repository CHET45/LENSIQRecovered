package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes7.dex */
public final class b81<T> extends CountDownLatch implements inf<T>, dh2, l9a<T> {

    /* JADX INFO: renamed from: a */
    public T f12944a;

    /* JADX INFO: renamed from: b */
    public Throwable f12945b;

    /* JADX INFO: renamed from: c */
    public mf4 f12946c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f12947d;

    public b81() {
        super(1);
    }

    /* JADX INFO: renamed from: a */
    public void m2991a() {
        this.f12947d = true;
        mf4 mf4Var = this.f12946c;
        if (mf4Var != null) {
            mf4Var.dispose();
        }
    }

    public boolean blockingAwait(long j, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                t71.verifyNonBlocking();
                if (!await(j, timeUnit)) {
                    m2991a();
                    return false;
                }
            } catch (InterruptedException e) {
                m2991a();
                throw j75.wrapOrThrow(e);
            }
        }
        Throwable th = this.f12945b;
        if (th == null) {
            return true;
        }
        throw j75.wrapOrThrow(th);
    }

    public T blockingGet() {
        if (getCount() != 0) {
            try {
                t71.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                m2991a();
                throw j75.wrapOrThrow(e);
            }
        }
        Throwable th = this.f12945b;
        if (th == null) {
            return this.f12944a;
        }
        throw j75.wrapOrThrow(th);
    }

    public Throwable blockingGetError() {
        if (getCount() != 0) {
            try {
                t71.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                m2991a();
                return e;
            }
        }
        return this.f12945b;
    }

    @Override // p000.dh2
    public void onComplete() {
        countDown();
    }

    @Override // p000.inf
    public void onError(Throwable th) {
        this.f12945b = th;
        countDown();
    }

    @Override // p000.inf
    public void onSubscribe(mf4 mf4Var) {
        this.f12946c = mf4Var;
        if (this.f12947d) {
            mf4Var.dispose();
        }
    }

    @Override // p000.inf
    public void onSuccess(T t) {
        this.f12944a = t;
        countDown();
    }

    public Throwable blockingGetError(long j, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                t71.verifyNonBlocking();
                if (!await(j, timeUnit)) {
                    m2991a();
                    throw j75.wrapOrThrow(new TimeoutException(j75.timeoutMessage(j, timeUnit)));
                }
            } catch (InterruptedException e) {
                m2991a();
                throw j75.wrapOrThrow(e);
            }
        }
        return this.f12945b;
    }

    public T blockingGet(T t) {
        if (getCount() != 0) {
            try {
                t71.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                m2991a();
                throw j75.wrapOrThrow(e);
            }
        }
        Throwable th = this.f12945b;
        if (th == null) {
            T t2 = this.f12944a;
            return t2 != null ? t2 : t;
        }
        throw j75.wrapOrThrow(th);
    }
}
