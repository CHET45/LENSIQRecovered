package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
@kyg
public abstract class or9 extends bu1 {
    public abstract boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException;

    @lg5("https://github.com/grpc/grpc-java/issues/4056")
    public void enterIdle() {
    }

    @lg5("https://github.com/grpc/grpc-java/issues/4359")
    public ws2 getState(boolean z) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public abstract boolean isShutdown();

    public abstract boolean isTerminated();

    @lg5("https://github.com/grpc/grpc-java/issues/4359")
    public void notifyWhenStateChanged(ws2 ws2Var, Runnable runnable) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @lg5("https://github.com/grpc/grpc-java/issues/4056")
    public void resetConnectBackoff() {
    }

    public abstract or9 shutdown();

    public abstract or9 shutdownNow();
}
