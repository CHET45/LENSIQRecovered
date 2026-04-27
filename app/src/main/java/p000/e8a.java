package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class e8a<T> extends s4a<T> {

    /* JADX INFO: renamed from: a */
    public final Future<? extends T> f32114a;

    /* JADX INFO: renamed from: b */
    public final long f32115b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f32116c;

    public e8a(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f32114a = future;
        this.f32115b = j;
        this.f32116c = timeUnit;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        mf4 mf4VarEmpty = pg4.empty();
        l9aVar.onSubscribe(mf4VarEmpty);
        if (mf4VarEmpty.isDisposed()) {
            return;
        }
        try {
            long j = this.f32115b;
            T t = j <= 0 ? this.f32114a.get() : this.f32114a.get(j, this.f32116c);
            if (mf4VarEmpty.isDisposed()) {
                return;
            }
            if (t == null) {
                l9aVar.onComplete();
            } else {
                l9aVar.onSuccess(t);
            }
        } catch (Throwable th) {
            th = th;
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            n75.throwIfFatal(th);
            if (mf4VarEmpty.isDisposed()) {
                return;
            }
            l9aVar.onError(th);
        }
    }
}
