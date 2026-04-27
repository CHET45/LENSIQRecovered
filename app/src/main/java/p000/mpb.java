package p000;

import io.reactivex.Observable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class mpb<T> extends Observable<T> implements Callable<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends T> f61704a;

    public mpb(Callable<? extends T> callable) {
        this.f61704a = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) xjb.requireNonNull(this.f61704a.call(), "The callable returned a null value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        e34 e34Var = new e34(oxbVar);
        oxbVar.onSubscribe(e34Var);
        if (e34Var.isDisposed()) {
            return;
        }
        try {
            e34Var.complete(xjb.requireNonNull(this.f61704a.call(), "Callable returned null"));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            if (e34Var.isDisposed()) {
                pfe.onError(th);
            } else {
                oxbVar.onError(th);
            }
        }
    }
}
