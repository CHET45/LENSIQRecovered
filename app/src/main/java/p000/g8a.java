package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class g8a<T> extends s4a<T> implements Callable<T> {

    /* JADX INFO: renamed from: a */
    public final Runnable f38995a;

    public g8a(Runnable runnable) {
        this.f38995a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        this.f38995a.run();
        return null;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        mf4 mf4VarEmpty = pg4.empty();
        l9aVar.onSubscribe(mf4VarEmpty);
        if (mf4VarEmpty.isDisposed()) {
            return;
        }
        try {
            this.f38995a.run();
            if (mf4VarEmpty.isDisposed()) {
                return;
            }
            l9aVar.onComplete();
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
