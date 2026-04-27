package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class sf2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final Callable<?> f81644a;

    public sf2(Callable<?> callable) {
        this.f81644a = callable;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        lf4 lf4VarEmpty = lf4.empty();
        observer.onSubscribe(lf4VarEmpty);
        try {
            this.f81644a.call();
            if (lf4VarEmpty.isDisposed()) {
                return;
            }
            observer.onComplete();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (lf4VarEmpty.isDisposed()) {
                ofe.onError(th);
            } else {
                observer.onError(th);
            }
        }
    }
}
