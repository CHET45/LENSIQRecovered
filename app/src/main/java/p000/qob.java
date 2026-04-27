package p000;

import io.reactivex.Observable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class qob<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends Throwable> f75041a;

    public qob(Callable<? extends Throwable> callable) {
        this.f75041a = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        try {
            th = (Throwable) xjb.requireNonNull(this.f75041a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            n75.throwIfFatal(th);
        }
        c05.error(th, oxbVar);
    }
}
