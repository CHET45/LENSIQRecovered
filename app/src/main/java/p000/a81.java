package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class a81<T> extends CountDownLatch implements hnf<T>, ch2, k9a<T> {

    /* JADX INFO: renamed from: a */
    public T f602a;

    /* JADX INFO: renamed from: b */
    public Throwable f603b;

    /* JADX INFO: renamed from: c */
    public lf4 f604c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f605d;

    public a81() {
        super(1);
    }

    /* JADX INFO: renamed from: a */
    public void m179a() {
        this.f605d = true;
        lf4 lf4Var = this.f604c;
        if (lf4Var != null) {
            lf4Var.dispose();
        }
    }

    public boolean blockingAwait(long timeout, TimeUnit unit) {
        if (getCount() != 0) {
            try {
                s71.verifyNonBlocking();
                if (!await(timeout, unit)) {
                    m179a();
                    return false;
                }
            } catch (InterruptedException e) {
                m179a();
                throw k75.wrapOrThrow(e);
            }
        }
        Throwable th = this.f603b;
        if (th == null) {
            return true;
        }
        throw k75.wrapOrThrow(th);
    }

    public void blockingConsume(uu2<? super T> uu2Var, uu2<? super Throwable> uu2Var2, InterfaceC7776j8 interfaceC7776j8) {
        try {
            if (getCount() != 0) {
                try {
                    s71.verifyNonBlocking();
                    await();
                } catch (InterruptedException e) {
                    m179a();
                    uu2Var2.accept(e);
                    return;
                }
            }
            Throwable th = this.f603b;
            if (th != null) {
                uu2Var2.accept(th);
                return;
            }
            T t = this.f602a;
            if (t != null) {
                uu2Var.accept(t);
            } else {
                interfaceC7776j8.run();
            }
        } catch (Throwable th2) {
            o75.throwIfFatal(th2);
            ofe.onError(th2);
        }
    }

    public T blockingGet() {
        if (getCount() != 0) {
            try {
                s71.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                m179a();
                throw k75.wrapOrThrow(e);
            }
        }
        Throwable th = this.f603b;
        if (th == null) {
            return this.f602a;
        }
        throw k75.wrapOrThrow(th);
    }

    @Override // p000.ch2, p000.k9a
    public void onComplete() {
        countDown();
    }

    @Override // p000.hnf
    public void onError(Throwable e) {
        this.f603b = e;
        countDown();
    }

    @Override // p000.hnf
    public void onSubscribe(lf4 d) {
        this.f604c = d;
        if (this.f605d) {
            d.dispose();
        }
    }

    @Override // p000.hnf
    public void onSuccess(T value) {
        this.f602a = value;
        countDown();
    }

    public T blockingGet(T defaultValue) {
        if (getCount() != 0) {
            try {
                s71.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                m179a();
                throw k75.wrapOrThrow(e);
            }
        }
        Throwable th = this.f603b;
        if (th == null) {
            T t = this.f602a;
            return t != null ? t : defaultValue;
        }
        throw k75.wrapOrThrow(th);
    }
}
