package p000;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class k81<T> extends AtomicReference<lf4> implements pxb<T>, lf4 {

    /* JADX INFO: renamed from: b */
    public static final Object f52753b = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* JADX INFO: renamed from: a */
    public final Queue<Object> f52754a;

    public k81(Queue<Object> queue) {
        this.f52754a = queue;
    }

    @Override // p000.lf4
    public void dispose() {
        if (zf4.dispose(this)) {
            this.f52754a.offer(f52753b);
        }
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return get() == zf4.DISPOSED;
    }

    @Override // p000.pxb
    public void onComplete() {
        this.f52754a.offer(fhb.complete());
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        this.f52754a.offer(fhb.error(t));
    }

    @Override // p000.pxb
    public void onNext(T t) {
        this.f52754a.offer(fhb.next(t));
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        zf4.setOnce(this, d);
    }
}
