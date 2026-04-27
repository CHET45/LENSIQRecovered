package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,241:1\n91#2,5:242\n*S KotlinDebug\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n*L\n222#1:242,5\n*E\n"})
public final class hu1 {
    @yfb
    public static final <T> fu1<T> asChannelFlow(@yfb y56<? extends T> y56Var) {
        fu1<T> fu1Var = y56Var instanceof fu1 ? (fu1) y56Var : null;
        if (fu1Var == null) {
            return new ku1(y56Var, null, 0, null, 14, null);
        }
        return fu1Var;
    }

    @gib
    public static final <T, V> Object withContextUndispatched(@yfb e13 e13Var, V v, @yfb Object obj, @yfb gz6<? super V, ? super zy2<? super T>, ? extends Object> gz6Var, @yfb zy2<? super T> zy2Var) {
        Object objUpdateThreadContext = sxg.updateThreadContext(e13Var, obj);
        try {
            j0g j0gVar = new j0g(zy2Var, e13Var);
            Object objWrapWithContinuationImpl = !(gz6Var instanceof tq0) ? od8.wrapWithContinuationImpl(gz6Var, v, j0gVar) : ((gz6) qlh.beforeCheckcastToFunctionOfArity(gz6Var, 2)).invoke(v, j0gVar);
            sxg.restoreThreadContext(e13Var, objUpdateThreadContext);
            if (objWrapWithContinuationImpl == pd8.getCOROUTINE_SUSPENDED()) {
                jk3.probeCoroutineSuspended(zy2Var);
            }
            return objWrapWithContinuationImpl;
        } catch (Throwable th) {
            sxg.restoreThreadContext(e13Var, objUpdateThreadContext);
            throw th;
        }
    }

    public static /* synthetic */ Object withContextUndispatched$default(e13 e13Var, Object obj, Object obj2, gz6 gz6Var, zy2 zy2Var, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = sxg.threadContextElements(e13Var);
        }
        return withContextUndispatched(e13Var, obj, obj2, gz6Var, zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> t66<T> withUndispatchedContextCollector(t66<? super T> t66Var, e13 e13Var) {
        return ((t66Var instanceof tye) || (t66Var instanceof qfb)) ? t66Var : new dsh(t66Var, e13Var);
    }
}
