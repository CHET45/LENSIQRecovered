package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCancellableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,423:1\n1#2:424\n*E\n"})
public final class hq1 {
    @la8
    public static final void disposeOnCancellation(@yfb dq1<?> dq1Var, @yfb yf4 yf4Var) {
        invokeOnCancellation(dq1Var, new rg4(yf4Var));
    }

    @yfb
    public static final <T> fq1<T> getOrCreateCancellableContinuation(@yfb zy2<? super T> zy2Var) {
        if (!(zy2Var instanceof ve4)) {
            return new fq1<>(zy2Var, 1);
        }
        fq1<T> fq1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core = ((ve4) zy2Var).claimReusableCancellableContinuation$kotlinx_coroutines_core();
        if (fq1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
            if (!fq1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core.resetStateReusable()) {
                fq1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core = null;
            }
            if (fq1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
                return fq1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core;
            }
        }
        return new fq1<>(zy2Var, 2);
    }

    public static final <T> void invokeOnCancellation(@yfb dq1<? super T> dq1Var, @yfb tp1 tp1Var) {
        if (!(dq1Var instanceof fq1)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((fq1) dq1Var).invokeOnCancellationInternal$kotlinx_coroutines_core(tp1Var);
    }

    @gib
    public static final <T> Object suspendCancellableCoroutine(@yfb qy6<? super dq1<? super T>, bth> qy6Var, @yfb zy2<? super T> zy2Var) {
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        qy6Var.invoke(fq1Var);
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    private static final <T> Object suspendCancellableCoroutine$$forInline(qy6<? super dq1<? super T>, bth> qy6Var, zy2<? super T> zy2Var) {
        o28.mark(0);
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        qy6Var.invoke(fq1Var);
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        o28.mark(1);
        return result;
    }

    @gib
    public static final <T> Object suspendCancellableCoroutineReusable(@yfb qy6<? super fq1<? super T>, bth> qy6Var, @yfb zy2<? super T> zy2Var) {
        fq1 orCreateCancellableContinuation = getOrCreateCancellableContinuation(od8.intercepted(zy2Var));
        try {
            qy6Var.invoke(orCreateCancellableContinuation);
            Object result = orCreateCancellableContinuation.getResult();
            if (result == pd8.getCOROUTINE_SUSPENDED()) {
                jk3.probeCoroutineSuspended(zy2Var);
            }
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    private static final <T> Object suspendCancellableCoroutineReusable$$forInline(qy6<? super fq1<? super T>, bth> qy6Var, zy2<? super T> zy2Var) {
        o28.mark(0);
        fq1 orCreateCancellableContinuation = getOrCreateCancellableContinuation(od8.intercepted(zy2Var));
        try {
            qy6Var.invoke(orCreateCancellableContinuation);
            Object result = orCreateCancellableContinuation.getResult();
            if (result == pd8.getCOROUTINE_SUSPENDED()) {
                jk3.probeCoroutineSuspended(zy2Var);
            }
            o28.mark(1);
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }
}
