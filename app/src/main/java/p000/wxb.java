package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class wxb<T> extends AtomicReference<mf4> implements oxb<T>, mf4 {
    private static final long serialVersionUID = -8612022020200669122L;

    /* JADX INFO: renamed from: a */
    public final oxb<? super T> f95678a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<mf4> f95679b = new AtomicReference<>();

    public wxb(oxb<? super T> oxbVar) {
        this.f95678a = oxbVar;
    }

    @Override // p000.mf4
    public void dispose() {
        ag4.dispose(this.f95679b);
        ag4.dispose(this);
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return this.f95679b.get() == ag4.DISPOSED;
    }

    @Override // p000.oxb
    public void onComplete() {
        dispose();
        this.f95678a.onComplete();
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        dispose();
        this.f95678a.onError(th);
    }

    @Override // p000.oxb
    public void onNext(T t) {
        this.f95678a.onNext(t);
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        if (ag4.setOnce(this.f95679b, mf4Var)) {
            this.f95678a.onSubscribe(this);
        }
    }

    public void setResource(mf4 mf4Var) {
        ag4.set(this, mf4Var);
    }
}
