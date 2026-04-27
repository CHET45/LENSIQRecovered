package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class v8a<T> extends s4a<T> implements ime<T> {

    /* JADX INFO: renamed from: a */
    public final T f90343a;

    public v8a(T t) {
        this.f90343a = t;
    }

    @Override // p000.ime, java.util.concurrent.Callable
    public T call() {
        return this.f90343a;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        l9aVar.onSubscribe(pg4.disposed());
        l9aVar.onSuccess(this.f90343a);
    }
}
