package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class nlf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends Throwable> f64914a;

    public nlf(Callable<? extends Throwable> callable) {
        this.f64914a = callable;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        try {
            th = (Throwable) xjb.requireNonNull(this.f64914a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            n75.throwIfFatal(th);
        }
        c05.error(th, infVar);
    }
}
