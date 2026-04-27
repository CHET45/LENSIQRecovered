package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 4 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,208:1\n186#1,17:226\n1#2:209\n236#3:210\n237#3,2:221\n239#3:225\n103#4,10:211\n114#4,2:223\n57#5,2:243\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n*L\n176#1:226,17\n164#1:210\n164#1:221,2\n164#1:225\n164#1:211,10\n164#1:223,2\n206#1:243,2\n*E\n"})
public final class ze4 {

    /* JADX INFO: renamed from: a */
    public static final int f104893a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f104894b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f104895c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f104896d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f104897e = -1;

    public static final <T> void dispatch(@yfb ye4<? super T> ye4Var, int i) {
        zy2<? super T> delegate$kotlinx_coroutines_core = ye4Var.getDelegate$kotlinx_coroutines_core();
        boolean z = i == 4;
        if (z || !(delegate$kotlinx_coroutines_core instanceof ve4) || isCancellableMode(i) != isCancellableMode(ye4Var.f101289c)) {
            resume(ye4Var, delegate$kotlinx_coroutines_core, z);
            return;
        }
        ve4 ve4Var = (ve4) delegate$kotlinx_coroutines_core;
        m13 m13Var = ve4Var.f90781d;
        e13 context = ve4Var.getContext();
        if (m13Var.isDispatchNeeded(context)) {
            m13Var.mo29873dispatch(context, ye4Var);
        } else {
            resumeUnconfined(ye4Var);
        }
    }

    @yjd
    public static /* synthetic */ void getMODE_CANCELLABLE$annotations() {
    }

    public static final boolean isCancellableMode(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean isReusableMode(int i) {
        return i == 2;
    }

    public static final <T> void resume(@yfb ye4<? super T> ye4Var, @yfb zy2<? super T> zy2Var, boolean z) {
        Object successfulResult$kotlinx_coroutines_core;
        Object objTakeState$kotlinx_coroutines_core = ye4Var.takeState$kotlinx_coroutines_core();
        Throwable exceptionalResult$kotlinx_coroutines_core = ye4Var.getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            v7e.C13927a c13927a = v7e.f90266b;
            successfulResult$kotlinx_coroutines_core = y7e.createFailure(exceptionalResult$kotlinx_coroutines_core);
        } else {
            v7e.C13927a c13927a2 = v7e.f90266b;
            successfulResult$kotlinx_coroutines_core = ye4Var.getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        }
        Object objM32723constructorimpl = v7e.m32723constructorimpl(successfulResult$kotlinx_coroutines_core);
        if (!z) {
            zy2Var.resumeWith(objM32723constructorimpl);
            return;
        }
        md8.checkNotNull(zy2Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        ve4 ve4Var = (ve4) zy2Var;
        zy2<T> zy2Var2 = ve4Var.f90782e;
        Object obj = ve4Var.f90784m;
        e13 context = zy2Var2.getContext();
        Object objUpdateThreadContext = sxg.updateThreadContext(context, obj);
        esh<?> eshVarUpdateUndispatchedCompletion = objUpdateThreadContext != sxg.f83208a ? j13.updateUndispatchedCompletion(zy2Var2, context, objUpdateThreadContext) : null;
        try {
            ve4Var.f90782e.resumeWith(objM32723constructorimpl);
            bth bthVar = bth.f14751a;
        } finally {
            if (eshVarUpdateUndispatchedCompletion == null || eshVarUpdateUndispatchedCompletion.clearThreadContext()) {
                sxg.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    private static final void resumeUnconfined(ye4<?> ye4Var) {
        e65 eventLoop$kotlinx_coroutines_core = xxg.f99642a.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(ye4Var);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            resume(ye4Var, ye4Var.getDelegate$kotlinx_coroutines_core(), true);
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void resumeWithStackTrace(@yfb zy2<?> zy2Var, @yfb Throwable th) {
        v7e.C13927a c13927a = v7e.f90266b;
        zy2Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(th)));
    }

    public static final void runUnconfinedEventLoop(@yfb ye4<?> ye4Var, @yfb e65 e65Var, @yfb ny6<bth> ny6Var) {
        e65Var.incrementUseCount(true);
        try {
            ny6Var.invoke();
            do {
            } while (e65Var.processUnconfinedEvent());
            o28.finallyStart(1);
        } catch (Throwable th) {
            try {
                ye4Var.handleFatalException$kotlinx_coroutines_core(th);
                o28.finallyStart(1);
            } catch (Throwable th2) {
                o28.finallyStart(1);
                e65Var.decrementUseCount(true);
                o28.finallyEnd(1);
                throw th2;
            }
        }
        e65Var.decrementUseCount(true);
        o28.finallyEnd(1);
    }
}
