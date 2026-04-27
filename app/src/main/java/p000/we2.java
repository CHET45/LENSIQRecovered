package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class we2<T> extends sj8 implements ve2<T> {
    public we2(@gib jj8 jj8Var) {
        super(true);
        m22033i(jj8Var);
    }

    @Override // p000.a34
    @gib
    public Object await(@yfb zy2<? super T> zy2Var) throws Throwable {
        Object objM22027b = m22027b(zy2Var);
        pd8.getCOROUTINE_SUSPENDED();
        return objM22027b;
    }

    @Override // p000.ve2
    public boolean complete(T t) {
        return makeCompleting$kotlinx_coroutines_core(t);
    }

    @Override // p000.ve2
    public boolean completeExceptionally(@yfb Throwable th) {
        return makeCompleting$kotlinx_coroutines_core(new ni2(th, false, 2, null));
    }

    @Override // p000.a34
    public T getCompleted() {
        return (T) getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // p000.a34
    @yfb
    public jve<T> getOnAwait() {
        jve<T> jveVar = (jve<T>) m22031f();
        md8.checkNotNull(jveVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return jveVar;
    }

    @Override // p000.sj8
    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }
}
