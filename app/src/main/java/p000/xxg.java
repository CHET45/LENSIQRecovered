package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
public final class xxg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final xxg f99642a = new xxg();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final ThreadLocal<e65> f99643b = zxg.commonThreadLocal(new qhg("ThreadLocalEventLoop"));

    private xxg() {
    }

    @gib
    public final e65 currentOrNull$kotlinx_coroutines_core() {
        return f99643b.get();
    }

    @yfb
    public final e65 getEventLoop$kotlinx_coroutines_core() {
        ThreadLocal<e65> threadLocal = f99643b;
        e65 e65Var = threadLocal.get();
        if (e65Var != null) {
            return e65Var;
        }
        e65 e65VarCreateEventLoop = h65.createEventLoop();
        threadLocal.set(e65VarCreateEventLoop);
        return e65VarCreateEventLoop;
    }

    public final void resetEventLoop$kotlinx_coroutines_core() {
        f99643b.set(null);
    }

    public final void setEventLoop$kotlinx_coroutines_core(@yfb e65 e65Var) {
        f99643b.set(e65Var);
    }
}
