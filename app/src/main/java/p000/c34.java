package p000;

/* JADX INFO: loaded from: classes7.dex */
public class c34<T> extends AbstractC12833t0<T> implements a34<T> {
    public c34(@yfb e13 e13Var, boolean z) {
        super(e13Var, true, z);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ <T> Object m3738q(c34<T> c34Var, zy2<? super T> zy2Var) throws Throwable {
        Object objM22027b = c34Var.m22027b(zy2Var);
        pd8.getCOROUTINE_SUSPENDED();
        return objM22027b;
    }

    @Override // p000.a34
    @gib
    public Object await(@yfb zy2<? super T> zy2Var) {
        return m3738q(this, zy2Var);
    }

    @Override // p000.a34
    public T getCompleted() {
        return (T) getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // p000.a34
    @yfb
    public jve<T> getOnAwait() {
        jve<T> jveVar = (jve<T>) m22031f();
        md8.checkNotNull(jveVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return jveVar;
    }
}
