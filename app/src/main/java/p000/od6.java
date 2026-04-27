package p000;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class od6<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final Future<? extends T> f67294b;

    /* JADX INFO: renamed from: c */
    public final long f67295c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f67296d;

    public od6(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f67294b = future;
        this.f67295c = j;
        this.f67296d = timeUnit;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        k34 k34Var = new k34(ycgVar);
        ycgVar.onSubscribe(k34Var);
        try {
            TimeUnit timeUnit = this.f67296d;
            T t = timeUnit != null ? this.f67294b.get(this.f67295c, timeUnit) : this.f67294b.get();
            if (t == null) {
                ycgVar.onError(new NullPointerException("The future returned null"));
            } else {
                k34Var.complete(t);
            }
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            if (k34Var.isCancelled()) {
                return;
            }
            ycgVar.onError(th);
        }
    }
}
