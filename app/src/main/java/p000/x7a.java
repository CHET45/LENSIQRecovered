package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class x7a<T> extends s4a<T> implements Callable<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7178i8 f97081a;

    public x7a(InterfaceC7178i8 interfaceC7178i8) {
        this.f97081a = interfaceC7178i8;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        this.f97081a.run();
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
            this.f97081a.run();
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
