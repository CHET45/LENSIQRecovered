package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class g8e<T> implements inf<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<mf4> f39001a;

    /* JADX INFO: renamed from: b */
    public final inf<? super T> f39002b;

    public g8e(AtomicReference<mf4> atomicReference, inf<? super T> infVar) {
        this.f39001a = atomicReference;
        this.f39002b = infVar;
    }

    @Override // p000.inf
    public void onError(Throwable th) {
        this.f39002b.onError(th);
    }

    @Override // p000.inf
    public void onSubscribe(mf4 mf4Var) {
        ag4.replace(this.f39001a, mf4Var);
    }

    @Override // p000.inf
    public void onSuccess(T t) {
        this.f39002b.onSuccess(t);
    }
}
