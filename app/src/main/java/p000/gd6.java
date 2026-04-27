package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class gd6<T> extends l86<T> implements nfg<T> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC7776j8 f39386b;

    public gd6(InterfaceC7776j8 action) {
        this.f39386b = action;
    }

    @Override // p000.nfg
    public T get() throws Throwable {
        this.f39386b.run();
        return null;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> subscriber) {
        nq1 nq1Var = new nq1();
        subscriber.onSubscribe(nq1Var);
        if (nq1Var.isDisposed()) {
            return;
        }
        try {
            this.f39386b.run();
            if (nq1Var.isDisposed()) {
                return;
            }
            subscriber.onComplete();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (nq1Var.isDisposed()) {
                ofe.onError(th);
            } else {
                subscriber.onError(th);
            }
        }
    }
}
