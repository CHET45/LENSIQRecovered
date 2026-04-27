package p000;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class jd6<T> extends l86<T> implements nfg<T> {

    /* JADX INFO: renamed from: b */
    public final Callable<? extends T> f50351b;

    public jd6(Callable<? extends T> callable) {
        this.f50351b = callable;
    }

    @Override // p000.nfg
    public T get() throws Exception {
        T tCall = this.f50351b.call();
        Objects.requireNonNull(tCall, "The callable returned a null value");
        return tCall;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        j34 j34Var = new j34(s);
        s.onSubscribe(j34Var);
        try {
            T tCall = this.f50351b.call();
            Objects.requireNonNull(tCall, "The callable returned a null value");
            j34Var.complete(tCall);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            if (j34Var.isCancelled()) {
                ofe.onError(th);
            } else {
                s.onError(th);
            }
        }
    }
}
