package p000;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p000.v2f;
import p000.y3f;

/* JADX INFO: loaded from: classes7.dex */
public abstract class gt6<T extends v2f<T>> extends v2f<T> {
    @hh4("Unsupported")
    public static v2f<?> forPort(int i) {
        throw new UnsupportedOperationException("Subclass failed to hide static factory");
    }

    private T thisT() {
        return this;
    }

    /* JADX INFO: renamed from: a */
    public abstract v2f<?> mo11860a();

    @Override // p000.v2f
    public T addService(p3f p3fVar) {
        mo11860a().addService(p3fVar);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T addStreamTracerFactory(y3f.AbstractC15412a abstractC15412a) {
        mo11860a().addStreamTracerFactory(abstractC15412a);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T addTransportFilter(d4f d4fVar) {
        mo11860a().addTransportFilter(d4fVar);
        return (T) thisT();
    }

    @Override // p000.v2f
    public u2f build() {
        return mo11860a().build();
    }

    @Override // p000.v2f
    public T callExecutor(x2f x2fVar) {
        mo11860a().callExecutor(x2fVar);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T compressorRegistry(@eib ho2 ho2Var) {
        mo11860a().compressorRegistry(ho2Var);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T decompressorRegistry(@eib bm3 bm3Var) {
        mo11860a().decompressorRegistry(bm3Var);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T directExecutor() {
        mo11860a().directExecutor();
        return (T) thisT();
    }

    @Override // p000.v2f
    public T executor(@eib Executor executor) {
        mo11860a().executor(executor);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T fallbackHandlerRegistry(@eib le7 le7Var) {
        mo11860a().fallbackHandlerRegistry(le7Var);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T handshakeTimeout(long j, TimeUnit timeUnit) {
        mo11860a().handshakeTimeout(j, timeUnit);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T intercept(j3f j3fVar) {
        mo11860a().intercept(j3fVar);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T keepAliveTime(long j, TimeUnit timeUnit) {
        mo11860a().keepAliveTime(j, timeUnit);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T keepAliveTimeout(long j, TimeUnit timeUnit) {
        mo11860a().keepAliveTimeout(j, timeUnit);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T maxConnectionAge(long j, TimeUnit timeUnit) {
        mo11860a().maxConnectionAge(j, timeUnit);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T maxConnectionAgeGrace(long j, TimeUnit timeUnit) {
        mo11860a().maxConnectionAgeGrace(j, timeUnit);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T maxConnectionIdle(long j, TimeUnit timeUnit) {
        mo11860a().maxConnectionIdle(j, timeUnit);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T maxInboundMessageSize(int i) {
        mo11860a().maxInboundMessageSize(i);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T maxInboundMetadataSize(int i) {
        mo11860a().maxInboundMetadataSize(i);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T permitKeepAliveTime(long j, TimeUnit timeUnit) {
        mo11860a().permitKeepAliveTime(j, timeUnit);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T permitKeepAliveWithoutCalls(boolean z) {
        mo11860a().permitKeepAliveWithoutCalls(z);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T setBinaryLog(d21 d21Var) {
        mo11860a().setBinaryLog(d21Var);
        return (T) thisT();
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", mo11860a()).toString();
    }

    @Override // p000.v2f
    public T useTransportSecurity(File file, File file2) {
        mo11860a().useTransportSecurity(file, file2);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T addService(o21 o21Var) {
        mo11860a().addService(o21Var);
        return (T) thisT();
    }

    @Override // p000.v2f
    public T useTransportSecurity(InputStream inputStream, InputStream inputStream2) {
        mo11860a().useTransportSecurity(inputStream, inputStream2);
        return (T) thisT();
    }
}
