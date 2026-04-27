package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class eo1 extends AtomicReference<lf4> implements ch2, lf4, ut8 {
    private static final long serialVersionUID = -4361286194466301354L;

    /* JADX INFO: renamed from: a */
    public final uu2<? super Throwable> f33706a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7776j8 f33707b;

    public eo1(uu2<? super Throwable> onError, InterfaceC7776j8 onComplete) {
        this.f33706a = onError;
        this.f33707b = onComplete;
    }

    @Override // p000.lf4
    public void dispose() {
        zf4.dispose(this);
    }

    @Override // p000.ut8
    public boolean hasCustomOnError() {
        return this.f33706a != r07.f76642f;
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return get() == zf4.DISPOSED;
    }

    @Override // p000.ch2, p000.k9a
    public void onComplete() {
        try {
            this.f33707b.run();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
        lazySet(zf4.DISPOSED);
    }

    @Override // p000.ch2
    public void onError(Throwable e) {
        try {
            this.f33706a.accept(e);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
        lazySet(zf4.DISPOSED);
    }

    @Override // p000.ch2
    public void onSubscribe(lf4 d) {
        zf4.setOnce(this, d);
    }
}
