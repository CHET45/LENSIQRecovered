package p000;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class n81<T> extends AtomicReference<fdg> implements lj6<T>, fdg {

    /* JADX INFO: renamed from: b */
    public static final Object f63480b = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* JADX INFO: renamed from: a */
    public final Queue<Object> f63481a;

    public n81(Queue<Object> queue) {
        this.f63481a = queue;
    }

    @Override // p000.fdg
    public void cancel() {
        if (mdg.cancel(this)) {
            this.f63481a.offer(f63480b);
        }
    }

    public boolean isCancelled() {
        return get() == mdg.CANCELLED;
    }

    @Override // p000.ycg
    public void onComplete() {
        this.f63481a.offer(ehb.complete());
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        this.f63481a.offer(ehb.error(th));
    }

    @Override // p000.ycg
    public void onNext(T t) {
        this.f63481a.offer(ehb.next(t));
    }

    @Override // p000.lj6, p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (mdg.setOnce(this, fdgVar)) {
            this.f63481a.offer(ehb.subscription(this));
        }
    }

    @Override // p000.fdg
    public void request(long j) {
        get().request(j);
    }
}
