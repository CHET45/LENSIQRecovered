package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class edg<T> extends AtomicReference<mf4> implements lj6<T>, mf4, fdg {
    private static final long serialVersionUID = -8612022020200669122L;

    /* JADX INFO: renamed from: a */
    public final ycg<? super T> f32714a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<fdg> f32715b = new AtomicReference<>();

    public edg(ycg<? super T> ycgVar) {
        this.f32714a = ycgVar;
    }

    @Override // p000.fdg
    public void cancel() {
        dispose();
    }

    @Override // p000.mf4
    public void dispose() {
        mdg.cancel(this.f32715b);
        ag4.dispose(this);
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return this.f32715b.get() == mdg.CANCELLED;
    }

    @Override // p000.ycg
    public void onComplete() {
        ag4.dispose(this);
        this.f32714a.onComplete();
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        ag4.dispose(this);
        this.f32714a.onError(th);
    }

    @Override // p000.ycg
    public void onNext(T t) {
        this.f32714a.onNext(t);
    }

    @Override // p000.lj6, p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (mdg.setOnce(this.f32715b, fdgVar)) {
            this.f32714a.onSubscribe(this);
        }
    }

    @Override // p000.fdg
    public void request(long j) {
        if (mdg.validate(j)) {
            this.f32715b.get().request(j);
        }
    }

    public void setResource(mf4 mf4Var) {
        ag4.set(this, mf4Var);
    }
}
