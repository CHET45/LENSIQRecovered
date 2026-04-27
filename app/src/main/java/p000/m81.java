package p000;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class m81<T> extends AtomicReference<fdg> implements kj6<T>, fdg {

    /* JADX INFO: renamed from: b */
    public static final Object f60177b = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* JADX INFO: renamed from: a */
    public final Queue<Object> f60178a;

    public m81(Queue<Object> queue) {
        this.f60178a = queue;
    }

    @Override // p000.fdg
    public void cancel() {
        if (ldg.cancel(this)) {
            this.f60178a.offer(f60177b);
        }
    }

    public boolean isCancelled() {
        return get() == ldg.CANCELLED;
    }

    @Override // p000.ycg
    public void onComplete() {
        this.f60178a.offer(fhb.complete());
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        this.f60178a.offer(fhb.error(t));
    }

    @Override // p000.ycg
    public void onNext(T t) {
        this.f60178a.offer(fhb.next(t));
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(fdg s) {
        if (ldg.setOnce(this, s)) {
            this.f60178a.offer(fhb.subscription(this));
        }
    }

    @Override // p000.fdg
    public void request(long n) {
        get().request(n);
    }
}
