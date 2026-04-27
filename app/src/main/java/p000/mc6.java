package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class mc6<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final Callable<? extends Throwable> f60547b;

    public mc6(Callable<? extends Throwable> callable) {
        this.f60547b = callable;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        try {
            th = (Throwable) xjb.requireNonNull(this.f60547b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            n75.throwIfFatal(th);
        }
        x05.error(th, ycgVar);
    }
}
