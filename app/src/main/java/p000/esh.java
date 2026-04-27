package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,310:1\n1#2:311\n103#3,13:312\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n265#1:312,13\n*E\n"})
public final class esh<T> extends uqe<T> {

    /* JADX INFO: renamed from: e */
    @yfb
    public final ThreadLocal<scc<e13, Object>> f33990e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public esh(@yfb e13 e13Var, @yfb zy2<? super T> zy2Var) {
        gsh gshVar = gsh.f40953a;
        super(e13Var.get(gshVar) == null ? e13Var.plus(gshVar) : e13Var, zy2Var);
        this.f33990e = new ThreadLocal<>();
        if (zy2Var.getContext().get(dz2.f31343s) instanceof m13) {
            return;
        }
        Object objUpdateThreadContext = sxg.updateThreadContext(e13Var, null);
        sxg.restoreThreadContext(e13Var, objUpdateThreadContext);
        saveThreadContext(e13Var, objUpdateThreadContext);
    }

    public final boolean clearThreadContext() {
        boolean z = this.threadLocalIsSet && this.f33990e.get() == null;
        this.f33990e.remove();
        return !z;
    }

    @Override // p000.uqe, p000.AbstractC12833t0
    /* JADX INFO: renamed from: o */
    public void mo10224o(@gib Object obj) {
        if (this.threadLocalIsSet) {
            scc<e13, Object> sccVar = this.f33990e.get();
            if (sccVar != null) {
                sxg.restoreThreadContext(sccVar.component1(), sccVar.component2());
            }
            this.f33990e.remove();
        }
        Object objRecoverResult = ri2.recoverResult(obj, this.f88815d);
        zy2<T> zy2Var = this.f88815d;
        e13 context = zy2Var.getContext();
        Object objUpdateThreadContext = sxg.updateThreadContext(context, null);
        esh<?> eshVarUpdateUndispatchedCompletion = objUpdateThreadContext != sxg.f83208a ? j13.updateUndispatchedCompletion(zy2Var, context, objUpdateThreadContext) : null;
        try {
            this.f88815d.resumeWith(objRecoverResult);
            bth bthVar = bth.f14751a;
        } finally {
            if (eshVarUpdateUndispatchedCompletion == null || eshVarUpdateUndispatchedCompletion.clearThreadContext()) {
                sxg.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    public final void saveThreadContext(@yfb e13 e13Var, @gib Object obj) {
        this.threadLocalIsSet = true;
        this.f33990e.set(vkh.m24050to(e13Var, obj));
    }
}
