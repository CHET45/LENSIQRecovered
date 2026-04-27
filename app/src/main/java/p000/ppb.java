package p000;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class ppb<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final Future<? extends T> f71609a;

    /* JADX INFO: renamed from: b */
    public final long f71610b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f71611c;

    public ppb(Future<? extends T> future, long timeout, TimeUnit unit) {
        this.f71609a = future;
        this.f71610b = timeout;
        this.f71611c = unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        d34 d34Var = new d34(observer);
        observer.onSubscribe(d34Var);
        if (d34Var.isDisposed()) {
            return;
        }
        try {
            TimeUnit timeUnit = this.f71611c;
            d34Var.complete(k75.nullCheck(timeUnit != null ? this.f71609a.get(this.f71610b, timeUnit) : this.f71609a.get(), "Future returned a null value."));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (d34Var.isDisposed()) {
                return;
            }
            observer.onError(th);
        }
    }
}
