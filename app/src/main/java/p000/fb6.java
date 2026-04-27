package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class fb6<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final Callable<? extends zjd<? extends T>> f36007b;

    public fb6(Callable<? extends zjd<? extends T>> callable) {
        this.f36007b = callable;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        try {
            ((zjd) xjb.requireNonNull(this.f36007b.call(), "The publisher supplied is null")).subscribe(ycgVar);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            x05.error(th, ycgVar);
        }
    }
}
