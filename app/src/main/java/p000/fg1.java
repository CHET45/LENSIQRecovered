package p000;

import p000.dz2;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nBuilders.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,267:1\n91#2,5:268\n*S KotlinDebug\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n*L\n163#1:268,5\n*E\n"})
public final /* synthetic */ class fg1 {

    /* JADX INFO: renamed from: a */
    public static final int f36504a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f36505b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f36506c = 2;

    @yfb
    public static final <T> a34<T> async(@yfb x13 x13Var, @yfb e13 e13Var, @yfb b23 b23Var, @yfb gz6<? super x13, ? super zy2<? super T>, ? extends Object> gz6Var) {
        e13 e13VarNewCoroutineContext = j13.newCoroutineContext(x13Var, e13Var);
        c34 lx8Var = b23Var.isLazy() ? new lx8(e13VarNewCoroutineContext, gz6Var) : new c34(e13VarNewCoroutineContext, true);
        ((AbstractC12833t0) lx8Var).start(b23Var, lx8Var, gz6Var);
        return (a34<T>) lx8Var;
    }

    public static /* synthetic */ a34 async$default(x13 x13Var, e13 e13Var, b23 b23Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = a05.f2a;
        }
        if ((i & 2) != 0) {
            b23Var = b23.f12441a;
        }
        return dg1.async(x13Var, e13Var, b23Var, gz6Var);
    }

    @gib
    public static final <T> Object invoke(@yfb m13 m13Var, @yfb gz6<? super x13, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
        return dg1.withContext(m13Var, gz6Var, zy2Var);
    }

    private static final <T> Object invoke$$forInline(m13 m13Var, gz6<? super x13, ? super zy2<? super T>, ? extends Object> gz6Var, zy2<? super T> zy2Var) {
        o28.mark(0);
        Object objWithContext = dg1.withContext(m13Var, gz6Var, zy2Var);
        o28.mark(1);
        return objWithContext;
    }

    @yfb
    public static final jj8 launch(@yfb x13 x13Var, @yfb e13 e13Var, @yfb b23 b23Var, @yfb gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        e13 e13VarNewCoroutineContext = j13.newCoroutineContext(x13Var, e13Var);
        AbstractC12833t0 b39Var = b23Var.isLazy() ? new b39(e13VarNewCoroutineContext, gz6Var) : new t0g(e13VarNewCoroutineContext, true);
        b39Var.start(b23Var, b39Var, gz6Var);
        return b39Var;
    }

    public static /* synthetic */ jj8 launch$default(x13 x13Var, e13 e13Var, b23 b23Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = a05.f2a;
        }
        if ((i & 2) != 0) {
            b23Var = b23.f12441a;
        }
        return dg1.launch(x13Var, e13Var, b23Var, gz6Var);
    }

    @gib
    public static final <T> Object withContext(@yfb e13 e13Var, @yfb gz6<? super x13, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
        Object result$kotlinx_coroutines_core;
        e13 context = zy2Var.getContext();
        e13 e13VarNewCoroutineContext = j13.newCoroutineContext(context, e13Var);
        oj8.ensureActive(e13VarNewCoroutineContext);
        if (e13VarNewCoroutineContext == context) {
            uqe uqeVar = new uqe(e13VarNewCoroutineContext, zy2Var);
            result$kotlinx_coroutines_core = fsh.startUndispatchedOrReturn(uqeVar, uqeVar, gz6Var);
        } else {
            dz2.C5021b c5021b = dz2.f31343s;
            if (md8.areEqual(e13VarNewCoroutineContext.get(c5021b), context.get(c5021b))) {
                esh eshVar = new esh(e13VarNewCoroutineContext, zy2Var);
                e13 context2 = eshVar.getContext();
                Object objUpdateThreadContext = sxg.updateThreadContext(context2, null);
                try {
                    Object objStartUndispatchedOrReturn = fsh.startUndispatchedOrReturn(eshVar, eshVar, gz6Var);
                    sxg.restoreThreadContext(context2, objUpdateThreadContext);
                    result$kotlinx_coroutines_core = objStartUndispatchedOrReturn;
                } catch (Throwable th) {
                    sxg.restoreThreadContext(context2, objUpdateThreadContext);
                    throw th;
                }
            } else {
                xe4 xe4Var = new xe4(e13VarNewCoroutineContext, zy2Var);
                mq1.startCoroutineCancellable(gz6Var, xe4Var, xe4Var);
                result$kotlinx_coroutines_core = xe4Var.getResult$kotlinx_coroutines_core();
            }
        }
        if (result$kotlinx_coroutines_core == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result$kotlinx_coroutines_core;
    }
}
