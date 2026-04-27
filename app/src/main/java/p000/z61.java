package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public abstract class z61<T> extends CountDownLatch implements oxb<T>, mf4 {

    /* JADX INFO: renamed from: a */
    public T f104276a;

    /* JADX INFO: renamed from: b */
    public Throwable f104277b;

    /* JADX INFO: renamed from: c */
    public mf4 f104278c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f104279d;

    public z61() {
        super(1);
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                t71.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                dispose();
                throw j75.wrapOrThrow(e);
            }
        }
        Throwable th = this.f104277b;
        if (th == null) {
            return this.f104276a;
        }
        throw j75.wrapOrThrow(th);
    }

    @Override // p000.mf4
    public final void dispose() {
        this.f104279d = true;
        mf4 mf4Var = this.f104278c;
        if (mf4Var != null) {
            mf4Var.dispose();
        }
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return this.f104279d;
    }

    @Override // p000.oxb
    public final void onComplete() {
        countDown();
    }

    @Override // p000.oxb
    public final void onSubscribe(mf4 mf4Var) {
        this.f104278c = mf4Var;
        if (this.f104279d) {
            mf4Var.dispose();
        }
    }
}
