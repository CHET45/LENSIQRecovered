package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class y7a<T> extends r4a<T> implements nfg<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends T> f100694a;

    public y7a(Callable<? extends T> callable) {
        this.f100694a = callable;
    }

    @Override // p000.nfg
    public T get() throws Exception {
        return this.f100694a.call();
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> k9aVar) {
        lf4 lf4VarEmpty = lf4.empty();
        k9aVar.onSubscribe(lf4VarEmpty);
        if (lf4VarEmpty.isDisposed()) {
            return;
        }
        try {
            T tCall = this.f100694a.call();
            if (lf4VarEmpty.isDisposed()) {
                return;
            }
            if (tCall == null) {
                k9aVar.onComplete();
            } else {
                k9aVar.onSuccess(tCall);
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (lf4VarEmpty.isDisposed()) {
                ofe.onError(th);
            } else {
                k9aVar.onError(th);
            }
        }
    }
}
