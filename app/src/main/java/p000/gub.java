package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class gub<T> extends AbstractC10162o3<T, T> {
    public gub(Observable<T> observable) {
        super(observable);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new n1f(oxbVar));
    }
}
