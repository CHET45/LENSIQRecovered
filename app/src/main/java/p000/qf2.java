package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class qf2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7776j8 f74272a;

    public qf2(InterfaceC7776j8 run) {
        this.f74272a = run;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        lf4 lf4VarEmpty = lf4.empty();
        observer.onSubscribe(lf4VarEmpty);
        if (lf4VarEmpty.isDisposed()) {
            return;
        }
        try {
            this.f74272a.run();
            if (lf4VarEmpty.isDisposed()) {
                return;
            }
            observer.onComplete();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (lf4VarEmpty.isDisposed()) {
                ofe.onError(th);
            } else {
                observer.onError(th);
            }
        }
    }
}
