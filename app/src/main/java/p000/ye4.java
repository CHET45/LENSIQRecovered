package p000;

import java.util.concurrent.CancellationException;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,208:1\n1#2:209\n103#3,10:210\n114#3,2:224\n206#4:220\n207#4:223\n57#5,2:221\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n83#1:210,10\n83#1:224,2\n96#1:220\n96#1:223\n96#1:221,2\n*E\n"})
public abstract class ye4<T> extends mng {

    /* JADX INFO: renamed from: c */
    @un8
    public int f101289c;

    public ye4(int i) {
        this.f101289c = i;
    }

    public void cancelCompletedResult$kotlinx_coroutines_core(@gib Object obj, @yfb Throwable th) {
    }

    @yfb
    public abstract zy2<T> getDelegate$kotlinx_coroutines_core();

    @gib
    public Throwable getExceptionalResult$kotlinx_coroutines_core(@gib Object obj) {
        ni2 ni2Var = obj instanceof ni2 ? (ni2) obj : null;
        if (ni2Var != null) {
            return ni2Var.f64635a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(@gib Object obj) {
        return obj;
    }

    public final void handleFatalException$kotlinx_coroutines_core(@yfb Throwable th) {
        q13.handleCoroutineException(getDelegate$kotlinx_coroutines_core().getContext(), new c23("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zy2<T> delegate$kotlinx_coroutines_core = getDelegate$kotlinx_coroutines_core();
            md8.checkNotNull(delegate$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            ve4 ve4Var = (ve4) delegate$kotlinx_coroutines_core;
            zy2<T> zy2Var = ve4Var.f90782e;
            Object obj = ve4Var.f90784m;
            e13 context = zy2Var.getContext();
            Object objUpdateThreadContext = sxg.updateThreadContext(context, obj);
            jj8 jj8Var = null;
            esh<?> eshVarUpdateUndispatchedCompletion = objUpdateThreadContext != sxg.f83208a ? j13.updateUndispatchedCompletion(zy2Var, context, objUpdateThreadContext) : null;
            try {
                e13 context2 = zy2Var.getContext();
                Object objTakeState$kotlinx_coroutines_core = takeState$kotlinx_coroutines_core();
                Throwable exceptionalResult$kotlinx_coroutines_core = getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
                if (exceptionalResult$kotlinx_coroutines_core == null && ze4.isCancellableMode(this.f101289c)) {
                    jj8Var = (jj8) context2.get(jj8.f50715A);
                }
                if (jj8Var != null && !jj8Var.isActive()) {
                    CancellationException cancellationException = jj8Var.getCancellationException();
                    cancelCompletedResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core, cancellationException);
                    v7e.C13927a c13927a = v7e.f90266b;
                    zy2Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(cancellationException)));
                } else if (exceptionalResult$kotlinx_coroutines_core != null) {
                    v7e.C13927a c13927a2 = v7e.f90266b;
                    zy2Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(exceptionalResult$kotlinx_coroutines_core)));
                } else {
                    v7e.C13927a c13927a3 = v7e.f90266b;
                    zy2Var.resumeWith(v7e.m32723constructorimpl(getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core)));
                }
                bth bthVar = bth.f14751a;
                if (eshVarUpdateUndispatchedCompletion == null || eshVarUpdateUndispatchedCompletion.clearThreadContext()) {
                    sxg.restoreThreadContext(context, objUpdateThreadContext);
                }
            } catch (Throwable th) {
                if (eshVarUpdateUndispatchedCompletion == null || eshVarUpdateUndispatchedCompletion.clearThreadContext()) {
                    sxg.restoreThreadContext(context, objUpdateThreadContext);
                }
                throw th;
            }
        } catch (Throwable th2) {
            handleFatalException$kotlinx_coroutines_core(th2);
        }
    }

    @gib
    public abstract Object takeState$kotlinx_coroutines_core();
}
