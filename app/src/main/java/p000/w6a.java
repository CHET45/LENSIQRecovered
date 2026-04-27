package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class w6a<T> extends s4a<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends Throwable> f93419a;

    public w6a(Callable<? extends Throwable> callable) {
        this.f93419a = callable;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        l9aVar.onSubscribe(pg4.disposed());
        try {
            th = (Throwable) xjb.requireNonNull(this.f93419a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            n75.throwIfFatal(th);
        }
        l9aVar.onError(th);
    }
}
