package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCompletionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,51:1\n1#2:52\n57#3,2:53\n57#3,2:55\n*S KotlinDebug\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n*L\n11#1:53,2\n16#1:55,2\n*E\n"})
public final class ri2 {
    @yfb
    public static final <T> Object recoverResult(@gib Object obj, @yfb zy2<? super T> zy2Var) {
        if (obj instanceof ni2) {
            v7e.C13927a c13927a = v7e.f90266b;
            return v7e.m32723constructorimpl(y7e.createFailure(((ni2) obj).f64635a));
        }
        v7e.C13927a c13927a2 = v7e.f90266b;
        return v7e.m32723constructorimpl(obj);
    }

    @gib
    public static final <T> Object toState(@yfb Object obj) {
        Throwable thM32726exceptionOrNullimpl = v7e.m32726exceptionOrNullimpl(obj);
        return thM32726exceptionOrNullimpl == null ? obj : new ni2(thM32726exceptionOrNullimpl, false, 2, null);
    }

    @gib
    public static final <T> Object toState(@yfb Object obj, @yfb dq1<?> dq1Var) {
        Throwable thM32726exceptionOrNullimpl = v7e.m32726exceptionOrNullimpl(obj);
        return thM32726exceptionOrNullimpl == null ? obj : new ni2(thM32726exceptionOrNullimpl, false, 2, null);
    }
}
