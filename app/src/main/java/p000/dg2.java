package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class dg2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final nfg<?> f29579a;

    public dg2(nfg<?> supplier) {
        this.f29579a = supplier;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        lf4 lf4VarEmpty = lf4.empty();
        observer.onSubscribe(lf4VarEmpty);
        try {
            this.f29579a.get();
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
