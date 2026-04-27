package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ddg<T> extends AtomicReference<lf4> implements kj6<T>, lf4, fdg {
    private static final long serialVersionUID = -8612022020200669122L;

    /* JADX INFO: renamed from: a */
    public final ycg<? super T> f29449a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<fdg> f29450b = new AtomicReference<>();

    public ddg(ycg<? super T> downstream) {
        this.f29449a = downstream;
    }

    @Override // p000.fdg
    public void cancel() {
        dispose();
    }

    @Override // p000.lf4
    public void dispose() {
        ldg.cancel(this.f29450b);
        zf4.dispose(this);
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this.f29450b.get() == ldg.CANCELLED;
    }

    @Override // p000.ycg
    public void onComplete() {
        zf4.dispose(this);
        this.f29449a.onComplete();
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        zf4.dispose(this);
        this.f29449a.onError(t);
    }

    @Override // p000.ycg
    public void onNext(T t) {
        this.f29449a.onNext(t);
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(fdg s) {
        if (ldg.setOnce(this.f29450b, s)) {
            this.f29449a.onSubscribe(this);
        }
    }

    @Override // p000.fdg
    public void request(long n) {
        if (ldg.validate(n)) {
            this.f29450b.get().request(n);
        }
    }

    public void setResource(lf4 resource) {
        zf4.set(this, resource);
    }
}
