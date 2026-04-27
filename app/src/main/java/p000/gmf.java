package p000;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class gmf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends T> f40300a;

    public gmf(Callable<? extends T> callable) {
        this.f40300a = callable;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> hnfVar) {
        lf4 lf4VarEmpty = lf4.empty();
        hnfVar.onSubscribe(lf4VarEmpty);
        if (lf4VarEmpty.isDisposed()) {
            return;
        }
        try {
            T tCall = this.f40300a.call();
            Objects.requireNonNull(tCall, "The callable returned a null value");
            if (lf4VarEmpty.isDisposed()) {
                return;
            }
            hnfVar.onSuccess(tCall);
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
