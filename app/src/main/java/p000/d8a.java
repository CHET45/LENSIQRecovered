package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class d8a<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final Future<? extends T> f28741a;

    /* JADX INFO: renamed from: b */
    public final long f28742b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f28743c;

    public d8a(Future<? extends T> future, long timeout, TimeUnit unit) {
        this.f28741a = future;
        this.f28742b = timeout;
        this.f28743c = unit;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> k9aVar) {
        lf4 lf4VarEmpty = lf4.empty();
        k9aVar.onSubscribe(lf4VarEmpty);
        if (lf4VarEmpty.isDisposed()) {
            return;
        }
        try {
            long j = this.f28742b;
            T t = j <= 0 ? this.f28741a.get() : this.f28741a.get(j, this.f28743c);
            if (lf4VarEmpty.isDisposed()) {
                return;
            }
            if (t == null) {
                k9aVar.onComplete();
            } else {
                k9aVar.onSuccess(t);
            }
        } catch (Throwable th) {
            th = th;
            o75.throwIfFatal(th);
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            o75.throwIfFatal(th);
            if (lf4VarEmpty.isDisposed()) {
                return;
            }
            k9aVar.onError(th);
        }
    }
}
