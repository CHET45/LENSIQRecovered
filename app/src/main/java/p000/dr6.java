package p000;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p000.pr9;
import p000.q8b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class dr6<T extends pr9<T>> extends pr9<T> {
    @hh4("Unsupported")
    public static pr9<?> forAddress(String str, int i) {
        throw new UnsupportedOperationException("Subclass failed to hide static factory");
    }

    @hh4("Unsupported")
    public static pr9<?> forTarget(String str) {
        throw new UnsupportedOperationException("Subclass failed to hide static factory");
    }

    private T thisT() {
        return this;
    }

    /* JADX INFO: renamed from: a */
    public abstract pr9<?> mo9331a();

    @Override // p000.pr9
    public T addTransportFilter(t42 t42Var) {
        mo9331a().addTransportFilter(t42Var);
        return (T) thisT();
    }

    @Override // p000.pr9
    public or9 build() {
        return mo9331a().build();
    }

    @Override // p000.pr9
    public T compressorRegistry(ho2 ho2Var) {
        mo9331a().compressorRegistry(ho2Var);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T decompressorRegistry(bm3 bm3Var) {
        mo9331a().decompressorRegistry(bm3Var);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T defaultLoadBalancingPolicy(String str) {
        mo9331a().defaultLoadBalancingPolicy(str);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T defaultServiceConfig(@eib Map<String, ?> map) {
        mo9331a().defaultServiceConfig(map);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T directExecutor() {
        mo9331a().directExecutor();
        return (T) thisT();
    }

    @Override // p000.pr9
    public T disableRetry() {
        mo9331a().disableRetry();
        return (T) thisT();
    }

    @Override // p000.pr9
    public T disableServiceConfigLookUp() {
        mo9331a().disableServiceConfigLookUp();
        return (T) thisT();
    }

    @Override // p000.pr9
    public T enableRetry() {
        mo9331a().enableRetry();
        return (T) thisT();
    }

    @Override // p000.pr9
    public T executor(Executor executor) {
        mo9331a().executor(executor);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T idleTimeout(long j, TimeUnit timeUnit) {
        mo9331a().idleTimeout(j, timeUnit);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T intercept(List<d42> list) {
        mo9331a().intercept(list);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T keepAliveTime(long j, TimeUnit timeUnit) {
        mo9331a().keepAliveTime(j, timeUnit);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T keepAliveTimeout(long j, TimeUnit timeUnit) {
        mo9331a().keepAliveTimeout(j, timeUnit);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T keepAliveWithoutCalls(boolean z) {
        mo9331a().keepAliveWithoutCalls(z);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T maxHedgedAttempts(int i) {
        mo9331a().maxHedgedAttempts(i);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T maxInboundMessageSize(int i) {
        mo9331a().maxInboundMessageSize(i);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T maxInboundMetadataSize(int i) {
        mo9331a().maxInboundMetadataSize(i);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T maxRetryAttempts(int i) {
        mo9331a().maxRetryAttempts(i);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T maxTraceEvents(int i) {
        mo9331a().maxTraceEvents(i);
        return (T) thisT();
    }

    @Override // p000.pr9
    @Deprecated
    public T nameResolverFactory(q8b.AbstractC11374d abstractC11374d) {
        mo9331a().nameResolverFactory(abstractC11374d);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T offloadExecutor(Executor executor) {
        mo9331a().offloadExecutor(executor);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T overrideAuthority(String str) {
        mo9331a().overrideAuthority(str);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T perRpcBufferLimit(long j) {
        mo9331a().perRpcBufferLimit(j);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T proxyDetector(rid ridVar) {
        mo9331a().proxyDetector(ridVar);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T retryBufferSize(long j) {
        mo9331a().retryBufferSize(j);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T setBinaryLog(d21 d21Var) {
        mo9331a().setBinaryLog(d21Var);
        return (T) thisT();
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", mo9331a()).toString();
    }

    @Override // p000.pr9
    public T usePlaintext() {
        mo9331a().usePlaintext();
        return (T) thisT();
    }

    @Override // p000.pr9
    public T useTransportSecurity() {
        mo9331a().useTransportSecurity();
        return (T) thisT();
    }

    @Override // p000.pr9
    public T userAgent(String str) {
        mo9331a().userAgent(str);
        return (T) thisT();
    }

    @Override // p000.pr9
    public T intercept(d42... d42VarArr) {
        mo9331a().intercept(d42VarArr);
        return (T) thisT();
    }
}
