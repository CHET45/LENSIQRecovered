package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nUndispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n+ 2 ProbesSupport.kt\nkotlinx/coroutines/internal/ProbesSupportKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,91:1\n61#1,4:99\n78#1,6:103\n84#1,5:111\n61#1,4:116\n78#1,6:120\n84#1,5:128\n8#2:92\n11#2,2:96\n91#3,3:93\n95#3:98\n57#4,2:109\n57#4,2:126\n57#4,2:133\n57#4,2:135\n*S KotlinDebug\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n*L\n41#1:99,4\n41#1:103,6\n41#1:111,5\n52#1:116,4\n52#1:120,6\n52#1:128,5\n14#1:92\n19#1:96,2\n18#1:93,3\n18#1:98\n41#1:109,2\n52#1:126,2\n83#1:133,2\n84#1:135,2\n*E\n"})
public final class fsh {
    public static final <R, T> void startCoroutineUndispatched(@yfb gz6<? super R, ? super zy2<? super T>, ? extends Object> gz6Var, R r, @yfb zy2<? super T> zy2Var) {
        zy2 zy2VarProbeCoroutineCreated = jk3.probeCoroutineCreated(zy2Var);
        try {
            e13 context = zy2VarProbeCoroutineCreated.getContext();
            Object objUpdateThreadContext = sxg.updateThreadContext(context, null);
            try {
                jk3.probeCoroutineResumed(zy2VarProbeCoroutineCreated);
                Object objWrapWithContinuationImpl = !(gz6Var instanceof tq0) ? od8.wrapWithContinuationImpl(gz6Var, r, zy2VarProbeCoroutineCreated) : ((gz6) qlh.beforeCheckcastToFunctionOfArity(gz6Var, 2)).invoke(r, zy2VarProbeCoroutineCreated);
                sxg.restoreThreadContext(context, objUpdateThreadContext);
                if (objWrapWithContinuationImpl != pd8.getCOROUTINE_SUSPENDED()) {
                    v7e.C13927a c13927a = v7e.f90266b;
                    zy2VarProbeCoroutineCreated.resumeWith(v7e.m32723constructorimpl(objWrapWithContinuationImpl));
                }
            } catch (Throwable th) {
                sxg.restoreThreadContext(context, objUpdateThreadContext);
                throw th;
            }
        } catch (Throwable th2) {
            v7e.C13927a c13927a2 = v7e.f90266b;
            zy2VarProbeCoroutineCreated.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(th2)));
        }
    }

    @gib
    public static final <T, R> Object startUndispatchedOrReturn(@yfb uqe<? super T> uqeVar, R r, @yfb gz6<? super R, ? super zy2<? super T>, ? extends Object> gz6Var) {
        Object ni2Var;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        try {
            ni2Var = !(gz6Var instanceof tq0) ? od8.wrapWithContinuationImpl(gz6Var, r, uqeVar) : ((gz6) qlh.beforeCheckcastToFunctionOfArity(gz6Var, 2)).invoke(r, uqeVar);
        } catch (Throwable th) {
            ni2Var = new ni2(th, false, 2, null);
        }
        if (ni2Var != pd8.getCOROUTINE_SUSPENDED() && (objMakeCompletingOnce$kotlinx_coroutines_core = uqeVar.makeCompletingOnce$kotlinx_coroutines_core(ni2Var)) != tj8.f85050b) {
            if (objMakeCompletingOnce$kotlinx_coroutines_core instanceof ni2) {
                throw ((ni2) objMakeCompletingOnce$kotlinx_coroutines_core).f64635a;
            }
            return tj8.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
        }
        return pd8.getCOROUTINE_SUSPENDED();
    }

    @gib
    public static final <T, R> Object startUndispatchedOrReturnIgnoreTimeout(@yfb uqe<? super T> uqeVar, R r, @yfb gz6<? super R, ? super zy2<? super T>, ? extends Object> gz6Var) throws Throwable {
        Object ni2Var;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        try {
            ni2Var = !(gz6Var instanceof tq0) ? od8.wrapWithContinuationImpl(gz6Var, r, uqeVar) : ((gz6) qlh.beforeCheckcastToFunctionOfArity(gz6Var, 2)).invoke(r, uqeVar);
        } catch (Throwable th) {
            ni2Var = new ni2(th, false, 2, null);
        }
        if (ni2Var != pd8.getCOROUTINE_SUSPENDED() && (objMakeCompletingOnce$kotlinx_coroutines_core = uqeVar.makeCompletingOnce$kotlinx_coroutines_core(ni2Var)) != tj8.f85050b) {
            if (objMakeCompletingOnce$kotlinx_coroutines_core instanceof ni2) {
                Throwable th2 = ((ni2) objMakeCompletingOnce$kotlinx_coroutines_core).f64635a;
                if (!(th2 instanceof x1h) || ((x1h) th2).f96041a != uqeVar) {
                    throw th2;
                }
                if (ni2Var instanceof ni2) {
                    throw ((ni2) ni2Var).f64635a;
                }
            } else {
                ni2Var = tj8.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
            }
            return ni2Var;
        }
        return pd8.getCOROUTINE_SUSPENDED();
    }

    private static final <T> Object undispatchedResult(uqe<? super T> uqeVar, qy6<? super Throwable, Boolean> qy6Var, ny6<? extends Object> ny6Var) throws Throwable {
        Object ni2Var;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        try {
            ni2Var = ny6Var.invoke();
        } catch (Throwable th) {
            ni2Var = new ni2(th, false, 2, null);
        }
        if (ni2Var != pd8.getCOROUTINE_SUSPENDED() && (objMakeCompletingOnce$kotlinx_coroutines_core = uqeVar.makeCompletingOnce$kotlinx_coroutines_core(ni2Var)) != tj8.f85050b) {
            if (!(objMakeCompletingOnce$kotlinx_coroutines_core instanceof ni2)) {
                return tj8.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
            }
            ni2 ni2Var2 = (ni2) objMakeCompletingOnce$kotlinx_coroutines_core;
            if (qy6Var.invoke(ni2Var2.f64635a).booleanValue()) {
                throw ni2Var2.f64635a;
            }
            if (ni2Var instanceof ni2) {
                throw ((ni2) ni2Var).f64635a;
            }
            return ni2Var;
        }
        return pd8.getCOROUTINE_SUSPENDED();
    }
}
