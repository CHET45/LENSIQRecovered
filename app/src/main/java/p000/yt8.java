package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class yt8<T> extends AtomicReference<fdg> implements kj6<T>, fdg, lf4, ut8 {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a */
    public final uu2<? super T> f102946a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super Throwable> f102947b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7776j8 f102948c;

    /* JADX INFO: renamed from: d */
    public final uu2<? super fdg> f102949d;

    public yt8(uu2<? super T> onNext, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete, uu2<? super fdg> onSubscribe) {
        this.f102946a = onNext;
        this.f102947b = onError;
        this.f102948c = onComplete;
        this.f102949d = onSubscribe;
    }

    @Override // p000.fdg
    public void cancel() {
        ldg.cancel(this);
    }

    @Override // p000.lf4
    public void dispose() {
        cancel();
    }

    @Override // p000.ut8
    public boolean hasCustomOnError() {
        return this.f102947b != r07.f76642f;
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return get() == ldg.CANCELLED;
    }

    @Override // p000.ycg
    public void onComplete() {
        fdg fdgVar = get();
        ldg ldgVar = ldg.CANCELLED;
        if (fdgVar != ldgVar) {
            lazySet(ldgVar);
            try {
                this.f102948c.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
        }
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        fdg fdgVar = get();
        ldg ldgVar = ldg.CANCELLED;
        if (fdgVar == ldgVar) {
            ofe.onError(t);
            return;
        }
        lazySet(ldgVar);
        try {
            this.f102947b.accept(t);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(new qm2(t, th));
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f102946a.accept(t);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(fdg s) {
        if (ldg.setOnce(this, s)) {
            try {
                this.f102949d.accept(this);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                s.cancel();
                onError(th);
            }
        }
    }

    @Override // p000.fdg
    public void request(long n) {
        get().request(n);
    }
}
