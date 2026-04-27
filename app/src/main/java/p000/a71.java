package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a71<T> extends CountDownLatch implements kj6<T> {

    /* JADX INFO: renamed from: a */
    public T f521a;

    /* JADX INFO: renamed from: b */
    public Throwable f522b;

    /* JADX INFO: renamed from: c */
    public fdg f523c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f524d;

    public a71() {
        super(1);
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                s71.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                fdg fdgVar = this.f523c;
                this.f523c = ldg.CANCELLED;
                if (fdgVar != null) {
                    fdgVar.cancel();
                }
                throw k75.wrapOrThrow(e);
            }
        }
        Throwable th = this.f522b;
        if (th == null) {
            return this.f521a;
        }
        throw k75.wrapOrThrow(th);
    }

    @Override // p000.ycg
    public final void onComplete() {
        countDown();
    }

    @Override // p000.kj6, p000.ycg
    public final void onSubscribe(fdg s) {
        if (ldg.validate(this.f523c, s)) {
            this.f523c = s;
            if (this.f524d) {
                return;
            }
            s.request(Long.MAX_VALUE);
            if (this.f524d) {
                this.f523c = ldg.CANCELLED;
                s.cancel();
            }
        }
    }
}
