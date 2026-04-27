package p000;

import io.reactivex.Observable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class knb<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends xub<? extends T>> f54787a;

    public knb(Callable<? extends xub<? extends T>> callable) {
        this.f54787a = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        try {
            ((xub) xjb.requireNonNull(this.f54787a.call(), "null ObservableSource supplied")).subscribe(oxbVar);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, oxbVar);
        }
    }
}
