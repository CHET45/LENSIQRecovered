package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n1#2:136\n*E\n"})
public final class c69 {
    public static final void checkParallelism(int i) {
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
    }

    @yfb
    public static final m13 namedOrThis(@yfb m13 m13Var, @gib String str) {
        return str != null ? new y8b(m13Var, str) : m13Var;
    }
}
