package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class lpb<T> extends vkb<T> implements nfg<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends T> f58409a;

    public lpb(Callable<? extends T> callable) {
        this.f58409a = callable;
    }

    @Override // p000.nfg
    public T get() throws Throwable {
        return (T) k75.nullCheck(this.f58409a.call(), "The Callable returned a null value.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        d34 d34Var = new d34(observer);
        observer.onSubscribe(d34Var);
        if (d34Var.isDisposed()) {
            return;
        }
        try {
            d34Var.complete(k75.nullCheck(this.f58409a.call(), "Callable returned a null value."));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (d34Var.isDisposed()) {
                ofe.onError(th);
            } else {
                observer.onError(th);
            }
        }
    }
}
