package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ag2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final Runnable f1383a;

    public ag2(Runnable runnable) {
        this.f1383a = runnable;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        mf4 mf4VarEmpty = pg4.empty();
        dh2Var.onSubscribe(mf4VarEmpty);
        try {
            this.f1383a.run();
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
