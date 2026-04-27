package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class yjf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends pof<? extends T>> f101807a;

    public yjf(Callable<? extends pof<? extends T>> callable) {
        this.f101807a = callable;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        try {
            ((pof) xjb.requireNonNull(this.f101807a.call(), "The singleSupplier returned a null SingleSource")).subscribe(infVar);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, infVar);
        }
    }
}
