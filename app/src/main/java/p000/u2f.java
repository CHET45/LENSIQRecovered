package p000;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.fx2;

/* JADX INFO: loaded from: classes7.dex */
@kyg
public abstract class u2f {

    /* JADX INFO: renamed from: a */
    public static final fx2.C6022k<u2f> f86682a = fx2.key("io.grpc.Server");

    public abstract void awaitTermination() throws InterruptedException;

    public abstract boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException;

    @lg5("https://github.com/grpc/grpc-java/issues/2222")
    public List<p3f> getImmutableServices() {
        return Collections.emptyList();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/5332")
    public List<? extends SocketAddress> getListenSockets() {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/2222")
    public List<p3f> getMutableServices() {
        return Collections.emptyList();
    }

    public int getPort() {
        return -1;
    }

    @lg5("https://github.com/grpc/grpc-java/issues/2222")
    public List<p3f> getServices() {
        return Collections.emptyList();
    }

    public abstract boolean isShutdown();

    public abstract boolean isTerminated();

    public abstract u2f shutdown();

    public abstract u2f shutdownNow();

    public abstract u2f start() throws IOException;
}
