package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class y8a<T, R> extends AbstractC15921z2<T, R> {

    /* JADX INFO: renamed from: b */
    public final v9a<? extends R, ? super T> f100757b;

    public y8a(aaa<T> aaaVar, v9a<? extends R, ? super T> v9aVar) {
        super(aaaVar);
        this.f100757b = v9aVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super R> l9aVar) {
        try {
            this.f103681a.subscribe((l9a) xjb.requireNonNull(this.f100757b.apply(l9aVar), "The operator returned a null MaybeObserver"));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, l9aVar);
        }
    }
}
