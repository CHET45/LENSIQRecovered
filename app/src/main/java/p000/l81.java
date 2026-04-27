package p000;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class l81<T> extends AtomicReference<mf4> implements oxb<T>, mf4 {

    /* JADX INFO: renamed from: b */
    public static final Object f56743b = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* JADX INFO: renamed from: a */
    public final Queue<Object> f56744a;

    public l81(Queue<Object> queue) {
        this.f56744a = queue;
    }

    @Override // p000.mf4
    public void dispose() {
        if (ag4.dispose(this)) {
            this.f56744a.offer(f56743b);
        }
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return get() == ag4.DISPOSED;
    }

    @Override // p000.oxb
    public void onComplete() {
        this.f56744a.offer(ehb.complete());
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        this.f56744a.offer(ehb.error(th));
    }

    @Override // p000.oxb
    public void onNext(T t) {
        this.f56744a.offer(ehb.next(t));
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        ag4.setOnce(this, mf4Var);
    }
}
