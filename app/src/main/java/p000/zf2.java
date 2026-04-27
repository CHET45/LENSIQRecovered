package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class zf2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final Runnable f104993a;

    public zf2(Runnable runnable) {
        this.f104993a = runnable;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        lf4 lf4VarEmpty = lf4.empty();
        observer.onSubscribe(lf4VarEmpty);
        if (lf4VarEmpty.isDisposed()) {
            return;
        }
        try {
            this.f104993a.run();
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
