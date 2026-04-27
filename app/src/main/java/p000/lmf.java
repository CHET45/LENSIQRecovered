package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class lmf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final nfg<? extends T> f58269a;

    public lmf(nfg<? extends T> supplier) {
        this.f58269a = supplier;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> hnfVar) {
        lf4 lf4VarEmpty = lf4.empty();
        hnfVar.onSubscribe(lf4VarEmpty);
        if (lf4VarEmpty.isDisposed()) {
            return;
        }
        try {
            T t = this.f58269a.get();
            Objects.requireNonNull(t, "The supplier returned a null value");
            if (lf4VarEmpty.isDisposed()) {
                return;
            }
            hnfVar.onSuccess(t);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (lf4VarEmpty.isDisposed()) {
                ofe.onError(th);
            } else {
                hnfVar.onError(th);
            }
        }
    }
}
