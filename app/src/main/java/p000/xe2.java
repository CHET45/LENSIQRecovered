package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCompletableDeferred.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletableDeferred.kt\nkotlinx/coroutines/CompletableDeferredKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
public final class xe2 {
    @yfb
    public static final <T> ve2<T> CompletableDeferred(@gib jj8 jj8Var) {
        return new we2(jj8Var);
    }

    public static /* synthetic */ ve2 CompletableDeferred$default(jj8 jj8Var, int i, Object obj) {
        if ((i & 1) != 0) {
            jj8Var = null;
        }
        return CompletableDeferred(jj8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean completeWith(@yfb ve2<T> ve2Var, @yfb Object obj) {
        Throwable thM32726exceptionOrNullimpl = v7e.m32726exceptionOrNullimpl(obj);
        return thM32726exceptionOrNullimpl == null ? ve2Var.complete(obj) : ve2Var.completeExceptionally(thM32726exceptionOrNullimpl);
    }

    @yfb
    public static final <T> ve2<T> CompletableDeferred(T t) {
        we2 we2Var = new we2(null);
        we2Var.complete(t);
        return we2Var;
    }
}
