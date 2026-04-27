package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b71<T> extends CountDownLatch implements lj6<T> {

    /* JADX INFO: renamed from: a */
    public T f12828a;

    /* JADX INFO: renamed from: b */
    public Throwable f12829b;

    /* JADX INFO: renamed from: c */
    public fdg f12830c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f12831d;

    public b71() {
        super(1);
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                t71.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                fdg fdgVar = this.f12830c;
                this.f12830c = mdg.CANCELLED;
                if (fdgVar != null) {
                    fdgVar.cancel();
                }
                throw j75.wrapOrThrow(e);
            }
        }
        Throwable th = this.f12829b;
        if (th == null) {
            return this.f12828a;
        }
        throw j75.wrapOrThrow(th);
    }

    @Override // p000.ycg
    public final void onComplete() {
        countDown();
    }

    @Override // p000.lj6, p000.ycg
    public final void onSubscribe(fdg fdgVar) {
        if (mdg.validate(this.f12830c, fdgVar)) {
            this.f12830c = fdgVar;
            if (this.f12831d) {
                return;
            }
            fdgVar.request(Long.MAX_VALUE);
            if (this.f12831d) {
                this.f12830c = mdg.CANCELLED;
                fdgVar.cancel();
            }
        }
    }
}
