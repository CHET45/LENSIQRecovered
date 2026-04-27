package p000;

import p000.o34;

/* JADX INFO: loaded from: classes7.dex */
@la8
public interface q34 extends o34 {

    /* JADX INFO: renamed from: q34$a */
    public static final class C11283a {
        @gib
        @q64(level = u64.f86866b, message = "Deprecated without replacement as an internal method never intended for public use")
        public static Object delay(@yfb q34 q34Var, long j, @yfb zy2<? super bth> zy2Var) {
            Object objDelay = o34.C10164a.delay(q34Var, j, zy2Var);
            return objDelay == pd8.getCOROUTINE_SUSPENDED() ? objDelay : bth.f14751a;
        }

        @yfb
        public static yf4 invokeOnTimeout(@yfb q34 q34Var, long j, @yfb Runnable runnable, @yfb e13 e13Var) {
            return o34.C10164a.invokeOnTimeout(q34Var, j, runnable, e13Var);
        }
    }

    @yfb
    /* JADX INFO: renamed from: timeoutMessage-LRDsOJo, reason: not valid java name */
    String m31893timeoutMessageLRDsOJo(long j);
}
