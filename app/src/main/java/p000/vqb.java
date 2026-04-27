package p000;

import io.reactivex.Observable;
import p000.utb;

/* JADX INFO: loaded from: classes7.dex */
public final class vqb<T> extends Observable<T> implements ime<T> {

    /* JADX INFO: renamed from: a */
    public final T f91996a;

    public vqb(T t) {
        this.f91996a = t;
    }

    @Override // p000.ime, java.util.concurrent.Callable
    public T call() {
        return this.f91996a;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        utb.RunnableC13697a runnableC13697a = new utb.RunnableC13697a(oxbVar, this.f91996a);
        oxbVar.onSubscribe(runnableC13697a);
        runnableC13697a.run();
    }
}
