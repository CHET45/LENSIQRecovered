package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSynchronized.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 2 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,29:1\n16#2:30\n*S KotlinDebug\n*F\n+ 1 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n*L\n27#1:30\n*E\n"})
public final class hig {
    @la8
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <T> T m30052synchronized(@yfb Object obj, @yfb ny6<? extends T> ny6Var) {
        T tInvoke;
        synchronized (obj) {
            try {
                tInvoke = ny6Var.invoke();
                o28.finallyStart(1);
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
        o28.finallyEnd(1);
        return tInvoke;
    }
}
