package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class hmf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends T> f44146a;

    public hmf(Callable<? extends T> callable) {
        this.f44146a = callable;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        mf4 mf4VarEmpty = pg4.empty();
        infVar.onSubscribe(mf4VarEmpty);
        if (mf4VarEmpty.isDisposed()) {
            return;
        }
        try {
            InterfaceC0000a interfaceC0000a = (Object) xjb.requireNonNull(this.f44146a.call(), "The callable returned a null value");
            if (mf4VarEmpty.isDisposed()) {
                return;
            }
            infVar.onSuccess(interfaceC0000a);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            if (mf4VarEmpty.isDisposed()) {
                pfe.onError(th);
            } else {
                infVar.onError(th);
            }
        }
    }
}
