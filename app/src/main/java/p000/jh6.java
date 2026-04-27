package p000;

import java.util.concurrent.Callable;
import p000.gh6;

/* JADX INFO: loaded from: classes7.dex */
public final class jh6<T, R> extends ljf<R> {

    /* JADX INFO: renamed from: a */
    public final zjd<T> f50558a;

    /* JADX INFO: renamed from: b */
    public final Callable<R> f50559b;

    /* JADX INFO: renamed from: c */
    public final j11<R, ? super T, R> f50560c;

    public jh6(zjd<T> zjdVar, Callable<R> callable, j11<R, ? super T, R> j11Var) {
        this.f50558a = zjdVar;
        this.f50559b = callable;
        this.f50560c = j11Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super R> infVar) {
        try {
            this.f50558a.subscribe(new gh6.C6314a(infVar, this.f50560c, xjb.requireNonNull(this.f50559b.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, infVar);
        }
    }
}
