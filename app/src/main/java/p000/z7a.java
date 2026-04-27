package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class z7a<T> extends s4a<T> implements Callable<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends T> f104332a;

    public z7a(Callable<? extends T> callable) {
        this.f104332a = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return this.f104332a.call();
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        mf4 mf4VarEmpty = pg4.empty();
        l9aVar.onSubscribe(mf4VarEmpty);
        if (mf4VarEmpty.isDisposed()) {
            return;
        }
        try {
            T tCall = this.f104332a.call();
            if (mf4VarEmpty.isDisposed()) {
                return;
            }
            if (tCall == null) {
                l9aVar.onComplete();
            } else {
                l9aVar.onSuccess(tCall);
            }
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            if (mf4VarEmpty.isDisposed()) {
                pfe.onError(th);
            } else {
                l9aVar.onError(th);
            }
        }
    }
}
