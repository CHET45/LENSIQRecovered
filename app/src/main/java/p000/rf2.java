package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class rf2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7178i8 f78147a;

    public rf2(InterfaceC7178i8 interfaceC7178i8) {
        this.f78147a = interfaceC7178i8;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        mf4 mf4VarEmpty = pg4.empty();
        dh2Var.onSubscribe(mf4VarEmpty);
        try {
            this.f78147a.run();
            if (mf4VarEmpty.isDisposed()) {
                return;
            }
            dh2Var.onComplete();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            if (mf4VarEmpty.isDisposed()) {
                pfe.onError(th);
            } else {
                dh2Var.onError(th);
            }
        }
    }
}
