package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ipb<T> extends vkb<T> implements nfg<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7776j8 f47846a;

    public ipb(InterfaceC7776j8 action) {
        this.f47846a = action;
    }

    @Override // p000.nfg
    public T get() throws Throwable {
        this.f47846a.run();
        return null;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        nq1 nq1Var = new nq1();
        observer.onSubscribe(nq1Var);
        if (nq1Var.isDisposed()) {
            return;
        }
        try {
            this.f47846a.run();
            if (nq1Var.isDisposed()) {
                return;
            }
            observer.onComplete();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (nq1Var.isDisposed()) {
                ofe.onError(th);
            } else {
                observer.onError(th);
            }
        }
    }
}
