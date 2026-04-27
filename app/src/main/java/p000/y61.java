package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public abstract class y61<T> extends CountDownLatch implements pxb<T>, lf4 {

    /* JADX INFO: renamed from: a */
    public T f100455a;

    /* JADX INFO: renamed from: b */
    public Throwable f100456b;

    /* JADX INFO: renamed from: c */
    public lf4 f100457c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f100458d;

    public y61() {
        super(1);
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                s71.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                dispose();
                throw k75.wrapOrThrow(e);
            }
        }
        Throwable th = this.f100456b;
        if (th == null) {
            return this.f100455a;
        }
        throw k75.wrapOrThrow(th);
    }

    @Override // p000.lf4
    public final void dispose() {
        this.f100458d = true;
        lf4 lf4Var = this.f100457c;
        if (lf4Var != null) {
            lf4Var.dispose();
        }
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return this.f100458d;
    }

    @Override // p000.pxb
    public final void onComplete() {
        countDown();
    }

    @Override // p000.pxb
    public final void onSubscribe(lf4 d) {
        this.f100457c = d;
        if (this.f100458d) {
            d.dispose();
        }
    }
}
