package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class xd6<T> extends l86<T> implements nfg<T> {

    /* JADX INFO: renamed from: b */
    public final nfg<? extends T> f97554b;

    public xd6(nfg<? extends T> supplier) {
        this.f97554b = supplier;
    }

    @Override // p000.nfg
    public T get() throws Throwable {
        T t = this.f97554b.get();
        Objects.requireNonNull(t, "The supplier returned a null value");
        return t;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        j34 j34Var = new j34(s);
        s.onSubscribe(j34Var);
        try {
            T t = this.f97554b.get();
            Objects.requireNonNull(t, "The supplier returned a null value");
            j34Var.complete(t);
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
