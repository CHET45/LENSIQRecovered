package p000;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p000.pr9;
import p000.q8b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class pr9<T extends pr9<T>> {
    public static pr9<?> forAddress(String str, int i) {
        return tr9.provider().builderForAddress(str, i);
    }

    public static pr9<?> forTarget(String str) {
        return tr9.provider().builderForTarget(str);
    }

    private T thisT() {
        return this;
    }

    @lg5("https://github.com/grpc/grpc-java/issues/10652")
    public T addTransportFilter(t42 t42Var) {
        throw new UnsupportedOperationException();
    }

    public abstract or9 build();

    @lg5("https://github.com/grpc/grpc-java/issues/1704")
    public abstract T compressorRegistry(ho2 ho2Var);

    @lg5("https://github.com/grpc/grpc-java/issues/1704")
    public abstract T decompressorRegistry(bm3 bm3Var);

    @lg5("https://github.com/grpc/grpc-java/issues/1771")
    public T defaultLoadBalancingPolicy(String str) {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/5189")
    public T defaultServiceConfig(@eib Map<String, ?> map) {
        throw new UnsupportedOperationException();
    }

    public abstract T directExecutor();

    public T disableRetry() {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/5189")
    public T disableServiceConfigLookUp() {
        throw new UnsupportedOperationException();
    }

    public T enableRetry() {
        throw new UnsupportedOperationException();
    }

    public abstract T executor(Executor executor);

    @lg5("https://github.com/grpc/grpc-java/issues/2022")
    public abstract T idleTimeout(long j, TimeUnit timeUnit);

    public abstract T intercept(List<d42> list);

    public abstract T intercept(d42... d42VarArr);

    public T keepAliveTime(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public T keepAliveTimeout(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public T keepAliveWithoutCalls(boolean z) {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/3982")
    public T maxHedgedAttempts(int i) {
        throw new UnsupportedOperationException();
    }

    public T maxInboundMessageSize(int i) {
        v7d.checkArgument(i >= 0, "bytes must be >= 0");
        return (T) thisT();
    }

    public T maxInboundMetadataSize(int i) {
        v7d.checkArgument(i > 0, "maxInboundMetadataSize must be > 0");
        return (T) thisT();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/3982")
    public T maxRetryAttempts(int i) {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/4471")
    public T maxTraceEvents(int i) {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/1770")
    @Deprecated
    public abstract T nameResolverFactory(q8b.AbstractC11374d abstractC11374d);

    public T offloadExecutor(Executor executor) {
        throw new UnsupportedOperationException();
    }

    public abstract T overrideAuthority(String str);

    @lg5("https://github.com/grpc/grpc-java/issues/3982")
    public T perRpcBufferLimit(long j) {
        throw new UnsupportedOperationException();
    }

    public T proxyDetector(rid ridVar) {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/3982")
    public T retryBufferSize(long j) {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/4017")
    public T setBinaryLog(d21 d21Var) {
        throw new UnsupportedOperationException();
    }

    public T usePlaintext() {
        throw new UnsupportedOperationException();
    }

    public T useTransportSecurity() {
        throw new UnsupportedOperationException();
    }

    public abstract T userAgent(String str);
}
