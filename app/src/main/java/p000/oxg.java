package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nThreadContextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n262#1:285\n1#2:286\n*S KotlinDebug\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n*L\n283#1:285\n*E\n"})
public final class oxg {
    @yfb
    public static final <T> nxg<T> asContextElement(@yfb ThreadLocal<T> threadLocal, T t) {
        return new wxg(t, threadLocal);
    }

    public static /* synthetic */ nxg asContextElement$default(ThreadLocal threadLocal, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = threadLocal.get();
        }
        return asContextElement(threadLocal, obj);
    }

    @gib
    public static final Object ensurePresent(@yfb ThreadLocal<?> threadLocal, @yfb zy2<? super bth> zy2Var) {
        if (zy2Var.getContext().get(new yxg(threadLocal)) != null) {
            return bth.f14751a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + zy2Var.getContext()).toString());
    }

    private static final Object ensurePresent$$forInline(ThreadLocal<?> threadLocal, zy2<? super bth> zy2Var) {
        o28.mark(3);
        throw null;
    }

    @gib
    public static final Object isPresent(@yfb ThreadLocal<?> threadLocal, @yfb zy2<? super Boolean> zy2Var) {
        return wc1.boxBoolean(zy2Var.getContext().get(new yxg(threadLocal)) != null);
    }

    private static final Object isPresent$$forInline(ThreadLocal<?> threadLocal, zy2<? super Boolean> zy2Var) {
        o28.mark(3);
        throw null;
    }
}
