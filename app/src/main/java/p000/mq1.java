package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCancellable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n1#1,64:1\n45#1,6:65\n45#1,6:71\n45#1,6:77\n*S KotlinDebug\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n15#1:65,6\n25#1:71,6\n34#1:77,6\n*E\n"})
public final class mq1 {
    private static final void dispatcherFailure(zy2<?> zy2Var, Throwable th) throws Throwable {
        v7e.C13927a c13927a = v7e.f90266b;
        zy2Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(th)));
        throw th;
    }

    private static final void runSafely(zy2<?> zy2Var, ny6<bth> ny6Var) throws Throwable {
        try {
            ny6Var.invoke();
        } catch (Throwable th) {
            dispatcherFailure(zy2Var, th);
        }
    }

    @la8
    public static final <T> void startCoroutineCancellable(@yfb qy6<? super zy2<? super T>, ? extends Object> qy6Var, @yfb zy2<? super T> zy2Var) throws Throwable {
        try {
            zy2 zy2VarIntercepted = od8.intercepted(od8.createCoroutineUnintercepted(qy6Var, zy2Var));
            v7e.C13927a c13927a = v7e.f90266b;
            we4.resumeCancellableWith(zy2VarIntercepted, v7e.m32723constructorimpl(bth.f14751a));
        } catch (Throwable th) {
            dispatcherFailure(zy2Var, th);
        }
    }

    public static final <R, T> void startCoroutineCancellable(@yfb gz6<? super R, ? super zy2<? super T>, ? extends Object> gz6Var, R r, @yfb zy2<? super T> zy2Var) {
        try {
            zy2 zy2VarIntercepted = od8.intercepted(od8.createCoroutineUnintercepted(gz6Var, r, zy2Var));
            v7e.C13927a c13927a = v7e.f90266b;
            we4.resumeCancellableWith(zy2VarIntercepted, v7e.m32723constructorimpl(bth.f14751a));
        } catch (Throwable th) {
            dispatcherFailure(zy2Var, th);
        }
    }

    public static final void startCoroutineCancellable(@yfb zy2<? super bth> zy2Var, @yfb zy2<?> zy2Var2) throws Throwable {
        try {
            zy2 zy2VarIntercepted = od8.intercepted(zy2Var);
            v7e.C13927a c13927a = v7e.f90266b;
            we4.resumeCancellableWith(zy2VarIntercepted, v7e.m32723constructorimpl(bth.f14751a));
        } catch (Throwable th) {
            dispatcherFailure(zy2Var2, th);
        }
    }
}
