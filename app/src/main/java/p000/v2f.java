package p000;

import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p000.v2f;
import p000.y3f;

/* JADX INFO: loaded from: classes7.dex */
public abstract class v2f<T extends v2f<T>> {
    public static v2f<?> forPort(int i) {
        return n3f.provider().mo17764a(i);
    }

    private T thisT() {
        return this;
    }

    public abstract T addService(o21 o21Var);

    public abstract T addService(p3f p3fVar);

    @lg5("https://github.com/grpc/grpc-java/issues/7925")
    public final T addServices(List<p3f> list) {
        v7d.checkNotNull(list, "services");
        Iterator<p3f> it = list.iterator();
        while (it.hasNext()) {
            addService(it.next());
        }
        return (T) thisT();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/2861")
    public T addStreamTracerFactory(y3f.AbstractC15412a abstractC15412a) {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/2132")
    public T addTransportFilter(d4f d4fVar) {
        throw new UnsupportedOperationException();
    }

    public abstract u2f build();

    @lg5("https://github.com/grpc/grpc-java/issues/8274")
    public T callExecutor(x2f x2fVar) {
        return (T) thisT();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/1704")
    public abstract T compressorRegistry(@eib ho2 ho2Var);

    @lg5("https://github.com/grpc/grpc-java/issues/1704")
    public abstract T decompressorRegistry(@eib bm3 bm3Var);

    public abstract T directExecutor();

    public abstract T executor(@eib Executor executor);

    public abstract T fallbackHandlerRegistry(@eib le7 le7Var);

    public T handshakeTimeout(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public T intercept(j3f j3fVar) {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/9009")
    public T keepAliveTime(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/9009")
    public T keepAliveTimeout(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/9009")
    public T maxConnectionAge(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/9009")
    public T maxConnectionAgeGrace(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/9009")
    public T maxConnectionIdle(long j, TimeUnit timeUnit) {
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

    @lg5("https://github.com/grpc/grpc-java/issues/9009")
    public T permitKeepAliveTime(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/9009")
    public T permitKeepAliveWithoutCalls(boolean z) {
        throw new UnsupportedOperationException();
    }

    @lg5("https://github.com/grpc/grpc-java/issues/4017")
    public T setBinaryLog(d21 d21Var) {
        throw new UnsupportedOperationException();
    }

    public abstract T useTransportSecurity(File file, File file2);

    public T useTransportSecurity(InputStream inputStream, InputStream inputStream2) {
        throw new UnsupportedOperationException();
    }
}
