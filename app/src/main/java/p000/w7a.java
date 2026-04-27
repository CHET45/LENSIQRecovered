package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class w7a<T> extends r4a<T> implements nfg<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7776j8 f93503a;

    public w7a(InterfaceC7776j8 action) {
        this.f93503a = action;
    }

    @Override // p000.nfg
    public T get() throws Throwable {
        this.f93503a.run();
        return null;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        lf4 lf4VarEmpty = lf4.empty();
        observer.onSubscribe(lf4VarEmpty);
        if (lf4VarEmpty.isDisposed()) {
            return;
        }
        try {
            this.f93503a.run();
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
