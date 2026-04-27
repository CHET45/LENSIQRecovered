package p000;

import io.reactivex.Observable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class qpb<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final Future<? extends T> f75081a;

    /* JADX INFO: renamed from: b */
    public final long f75082b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f75083c;

    public qpb(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f75081a = future;
        this.f75082b = j;
        this.f75083c = timeUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        e34 e34Var = new e34(oxbVar);
        oxbVar.onSubscribe(e34Var);
        if (e34Var.isDisposed()) {
            return;
        }
        try {
            TimeUnit timeUnit = this.f75083c;
            e34Var.complete(xjb.requireNonNull(timeUnit != null ? this.f75081a.get(this.f75082b, timeUnit) : this.f75081a.get(), "Future returned null"));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            if (e34Var.isDisposed()) {
                return;
            }
            oxbVar.onError(th);
        }
    }
}
