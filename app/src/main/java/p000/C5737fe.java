package p000;

/* JADX INFO: renamed from: fe */
/* JADX INFO: loaded from: classes.dex */
public final class C5737fe {
    public static /* synthetic */ void AtomicReference$annotations() {
    }

    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }

    @yfb
    public static final String currentThreadName() {
        return Thread.currentThread().getName();
    }

    public static final void ensureMutable(@yfb Object obj) {
    }

    public static final int identityHashCode(@gib Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void invokeComposable(@yfb zl2 zl2Var, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var) {
        md8.checkNotNull(gz6Var, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((gz6) qlh.beforeCheckcastToFunctionOfArity(gz6Var, 2)).invoke(zl2Var, 1);
    }

    public static final <T> T invokeComposableForResult(@yfb zl2 zl2Var, @yfb gz6<? super zl2, ? super Integer, ? extends T> gz6Var) {
        md8.checkNotNull(gz6Var, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, T of androidx.compose.runtime.ActualJvm_jvmKt.invokeComposableForResult>");
        return (T) ((gz6) qlh.beforeCheckcastToFunctionOfArity(gz6Var, 2)).invoke(zl2Var, 1);
    }

    @yjd
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m28908synchronized(@yfb Object obj, @yfb ny6<? extends R> ny6Var) {
        R rInvoke;
        synchronized (obj) {
            try {
                rInvoke = ny6Var.invoke();
                o28.finallyStart(1);
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
        o28.finallyEnd(1);
        return rInvoke;
    }
}
