package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class of4<T> extends AbstractC0008a1 implements pxb<T> {
    private static final long serialVersionUID = 8924480688481408726L;

    /* JADX INFO: renamed from: d */
    public final uu2<? super T> f67487d;

    public of4(sf4 composite, uu2<? super T> onNext, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete) {
        super(composite, onError, onComplete);
        this.f67487d = onNext;
    }

    @Override // p000.pxb
    public void onNext(T t) {
        if (get() != zf4.DISPOSED) {
            try {
                this.f67487d.accept(t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                get().dispose();
                onError(th);
            }
        }
    }
}
