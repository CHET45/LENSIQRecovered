package p000;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public final class pg4 {
    private pg4() {
        throw new IllegalStateException("No instances!");
    }

    @bfb
    public static mf4 disposed() {
        return c05.INSTANCE;
    }

    @bfb
    public static mf4 empty() {
        return fromRunnable(q07.f72640b);
    }

    @bfb
    public static mf4 fromAction(@bfb InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "run is null");
        return new C12944t8(interfaceC7178i8);
    }

    @bfb
    public static mf4 fromFuture(@bfb Future<?> future) {
        xjb.requireNonNull(future, "future is null");
        return fromFuture(future, true);
    }

    @bfb
    public static mf4 fromRunnable(@bfb Runnable runnable) {
        xjb.requireNonNull(runnable, "run is null");
        return new mde(runnable);
    }

    @bfb
    public static mf4 fromSubscription(@bfb fdg fdgVar) {
        xjb.requireNonNull(fdgVar, "subscription is null");
        return new kdg(fdgVar);
    }

    @bfb
    public static mf4 fromFuture(@bfb Future<?> future, boolean z) {
        xjb.requireNonNull(future, "future is null");
        return new e17(future, z);
    }
}
