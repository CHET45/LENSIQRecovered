package p000;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/CoroutineExceptionHandlerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class o13 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final Collection<n13> f66199a = vze.toList(ize.asSequence(ServiceLoader.load(n13.class, n13.class.getClassLoader()).iterator()));

    public static final void ensurePlatformExceptionHandlerLoaded(@yfb n13 n13Var) {
        if (!f66199a.contains(n13Var)) {
            throw new IllegalStateException("Exception handler was not found via a ServiceLoader");
        }
    }

    @yfb
    public static final Collection<n13> getPlatformExceptionHandlers() {
        return f66199a;
    }

    public static final void propagateExceptionFinalResort(@yfb Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
