package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class kd6<T> extends m86<T> implements Callable<T> {

    /* JADX INFO: renamed from: b */
    public final Callable<? extends T> f53638b;

    public kd6(Callable<? extends T> callable) {
        this.f53638b = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) xjb.requireNonNull(this.f53638b.call(), "The callable returned a null value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        k34 k34Var = new k34(ycgVar);
        ycgVar.onSubscribe(k34Var);
        try {
            k34Var.complete(xjb.requireNonNull(this.f53638b.call(), "The callable returned a null value"));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            if (k34Var.isCancelled()) {
                pfe.onError(th);
            } else {
                ycgVar.onError(th);
            }
        }
    }
}
