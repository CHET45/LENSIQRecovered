package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class sp6<T> extends AtomicReference<fdg> implements kj6<T>, lf4 {
    private static final long serialVersionUID = -4403180040475402120L;

    /* JADX INFO: renamed from: a */
    public final n8d<? super T> f82513a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super Throwable> f82514b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7776j8 f82515c;

    /* JADX INFO: renamed from: d */
    public boolean f82516d;

    public sp6(n8d<? super T> onNext, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete) {
        this.f82513a = onNext;
        this.f82514b = onError;
        this.f82515c = onComplete;
    }

    @Override // p000.lf4
    public void dispose() {
        ldg.cancel(this);
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return get() == ldg.CANCELLED;
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f82516d) {
            return;
        }
        this.f82516d = true;
        try {
            this.f82515c.run();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        if (this.f82516d) {
            ofe.onError(t);
            return;
        }
        this.f82516d = true;
        try {
            this.f82514b.accept(t);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(new qm2(t, th));
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (this.f82516d) {
            return;
        }
        try {
            if (this.f82513a.test(t)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            dispose();
            onError(th);
        }
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(fdg s) {
        ldg.setOnce(this, s, Long.MAX_VALUE);
    }
}
