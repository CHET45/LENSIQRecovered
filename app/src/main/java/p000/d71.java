package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public final class d71<T> extends CountDownLatch implements k9a<T>, hnf<T>, ch2, lf4 {

    /* JADX INFO: renamed from: a */
    public T f28598a;

    /* JADX INFO: renamed from: b */
    public Throwable f28599b;

    /* JADX INFO: renamed from: c */
    public final a0f f28600c;

    public d71() {
        super(1);
        this.f28600c = new a0f();
    }

    public void blockingConsume(ch2 observer) {
        if (getCount() != 0) {
            try {
                s71.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                dispose();
                observer.onError(e);
                return;
            }
        }
        if (isDisposed()) {
            return;
        }
        Throwable th = this.f28599b;
        if (th != null) {
            observer.onError(th);
        } else {
            observer.onComplete();
        }
    }

    @Override // p000.lf4
    public void dispose() {
        this.f28600c.dispose();
        countDown();
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this.f28600c.isDisposed();
    }

    @Override // p000.k9a
    public void onComplete() {
        this.f28600c.lazySet(lf4.disposed());
        countDown();
    }

    @Override // p000.k9a
    public void onError(@cfb Throwable e) {
        this.f28599b = e;
        this.f28600c.lazySet(lf4.disposed());
        countDown();
    }

    @Override // p000.k9a
    public void onSubscribe(@cfb lf4 d) {
        zf4.setOnce(this.f28600c, d);
    }

    @Override // p000.k9a
    public void onSuccess(@cfb T t) {
        this.f28598a = t;
        this.f28600c.lazySet(lf4.disposed());
        countDown();
    }

    public void blockingConsume(hnf<? super T> hnfVar) {
        if (getCount() != 0) {
            try {
                s71.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                dispose();
                hnfVar.onError(e);
                return;
            }
        }
        if (isDisposed()) {
            return;
        }
        Throwable th = this.f28599b;
        if (th != null) {
            hnfVar.onError(th);
        } else {
            hnfVar.onSuccess(this.f28598a);
        }
    }

    public void blockingConsume(k9a<? super T> k9aVar) {
        if (getCount() != 0) {
            try {
                s71.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                dispose();
                k9aVar.onError(e);
                return;
            }
        }
        if (isDisposed()) {
            return;
        }
        Throwable th = this.f28599b;
        if (th != null) {
            k9aVar.onError(th);
            return;
        }
        T t = this.f28598a;
        if (t == null) {
            k9aVar.onComplete();
        } else {
            k9aVar.onSuccess(t);
        }
    }
}
