package p000;

import java.util.concurrent.Callable;
import p000.vsb;

/* JADX INFO: loaded from: classes7.dex */
public final class ysb<T, R> extends ljf<R> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f102904a;

    /* JADX INFO: renamed from: b */
    public final Callable<R> f102905b;

    /* JADX INFO: renamed from: c */
    public final j11<R, ? super T, R> f102906c;

    public ysb(xub<T> xubVar, Callable<R> callable, j11<R, ? super T, R> j11Var) {
        this.f102904a = xubVar;
        this.f102905b = callable;
        this.f102906c = j11Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super R> infVar) {
        try {
            this.f102904a.subscribe(new vsb.C14249a(infVar, this.f102906c, xjb.requireNonNull(this.f102905b.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, infVar);
        }
    }
}
