package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class tf2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final Callable<?> f84487a;

    public tf2(Callable<?> callable) {
        this.f84487a = callable;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        mf4 mf4VarEmpty = pg4.empty();
        dh2Var.onSubscribe(mf4VarEmpty);
        try {
            this.f84487a.call();
            if (mf4VarEmpty.isDisposed()) {
                return;
            }
            dh2Var.onComplete();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            if (mf4VarEmpty.isDisposed()) {
                pfe.onError(th);
            } else {
                dh2Var.onError(th);
            }
        }
    }
}
