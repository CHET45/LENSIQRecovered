package p000;

/* JADX INFO: loaded from: classes7.dex */
@la8
public interface o34 {

    /* JADX INFO: renamed from: o34$a */
    @dwf({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,159:1\n351#2,11:160\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/Delay$DefaultImpls\n*L\n27#1:160,11\n*E\n"})
    public static final class C10164a {
        @gib
        @q64(level = u64.f86866b, message = "Deprecated without replacement as an internal method never intended for public use")
        public static Object delay(@yfb o34 o34Var, long j, @yfb zy2<? super bth> zy2Var) {
            if (j <= 0) {
                return bth.f14751a;
            }
            fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
            fq1Var.initCancellability();
            o34Var.mo29874scheduleResumeAfterDelay(j, fq1Var);
            Object result = fq1Var.getResult();
            if (result == pd8.getCOROUTINE_SUSPENDED()) {
                jk3.probeCoroutineSuspended(zy2Var);
            }
            return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
        }

        @yfb
        public static yf4 invokeOnTimeout(@yfb o34 o34Var, long j, @yfb Runnable runnable, @yfb e13 e13Var) {
            return uu3.getDefaultDelay().invokeOnTimeout(j, runnable, e13Var);
        }
    }

    @gib
    @q64(level = u64.f86866b, message = "Deprecated without replacement as an internal method never intended for public use")
    Object delay(long j, @yfb zy2<? super bth> zy2Var);

    @yfb
    yf4 invokeOnTimeout(long j, @yfb Runnable runnable, @yfb e13 e13Var);

    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    void mo29874scheduleResumeAfterDelay(long j, @yfb dq1<? super bth> dq1Var);
}
