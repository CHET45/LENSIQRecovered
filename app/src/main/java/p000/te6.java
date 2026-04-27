package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class te6<T> extends m86<T> implements ime<T> {

    /* JADX INFO: renamed from: b */
    public final T f84381b;

    public te6(T t) {
        this.f84381b = t;
    }

    @Override // p000.ime, java.util.concurrent.Callable
    public T call() {
        return this.f84381b;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        ycgVar.onSubscribe(new kme(ycgVar, this.f84381b));
    }
}
