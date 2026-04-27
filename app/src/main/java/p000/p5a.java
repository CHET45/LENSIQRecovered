package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class p5a<T> extends s4a<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends aaa<? extends T>> f69732a;

    public p5a(Callable<? extends aaa<? extends T>> callable) {
        this.f69732a = callable;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        try {
            ((aaa) xjb.requireNonNull(this.f69732a.call(), "The maybeSupplier returned a null MaybeSource")).subscribe(l9aVar);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, l9aVar);
        }
    }
}
