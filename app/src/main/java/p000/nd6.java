package p000;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class nd6<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final Future<? extends T> f64029b;

    /* JADX INFO: renamed from: c */
    public final long f64030c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f64031d;

    public nd6(Future<? extends T> future, long timeout, TimeUnit unit) {
        this.f64029b = future;
        this.f64030c = timeout;
        this.f64031d = unit;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        j34 j34Var = new j34(s);
        s.onSubscribe(j34Var);
        try {
            TimeUnit timeUnit = this.f64031d;
            T t = timeUnit != null ? this.f64029b.get(this.f64030c, timeUnit) : this.f64029b.get();
            if (t == null) {
                s.onError(k75.createNullPointerException("The future returned a null value."));
            } else {
                j34Var.complete(t);
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (j34Var.isCancelled()) {
                return;
            }
            s.onError(th);
        }
    }
}
