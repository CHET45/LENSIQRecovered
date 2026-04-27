package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p000.AbstractC15982z4;
import p000.rn1;

/* JADX INFO: renamed from: z4 */
/* JADX INFO: loaded from: classes7.dex */
@dy1
@kyg
public abstract class AbstractC15982z4<S extends AbstractC15982z4<S>> {

    /* JADX INFO: renamed from: a */
    public final bu1 f104033a;

    /* JADX INFO: renamed from: b */
    public final rn1 f104034b;

    /* JADX INFO: renamed from: z4$a */
    public interface a<T extends AbstractC15982z4<T>> {
        T newStub(bu1 bu1Var, rn1 rn1Var);
    }

    public AbstractC15982z4(bu1 bu1Var) {
        this(bu1Var, rn1.f78745k);
    }

    public static <T extends AbstractC15982z4<T>> T newStub(a<T> aVar, bu1 bu1Var) {
        return (T) newStub(aVar, bu1Var, rn1.f78745k);
    }

    /* JADX INFO: renamed from: a */
    public abstract S mo24886a(bu1 bu1Var, rn1 rn1Var);

    public final rn1 getCallOptions() {
        return this.f104034b;
    }

    public final bu1 getChannel() {
        return this.f104033a;
    }

    public final S withCallCredentials(pn1 pn1Var) {
        return (S) mo24886a(this.f104033a, this.f104034b.withCallCredentials(pn1Var));
    }

    @Deprecated
    public final S withChannel(bu1 bu1Var) {
        return (S) mo24886a(bu1Var, this.f104034b);
    }

    public final S withCompression(String str) {
        return (S) mo24886a(this.f104033a, this.f104034b.withCompression(str));
    }

    public final S withDeadline(@eib sj3 sj3Var) {
        return (S) mo24886a(this.f104033a, this.f104034b.withDeadline(sj3Var));
    }

    public final S withDeadlineAfter(long j, TimeUnit timeUnit) {
        return (S) mo24886a(this.f104033a, this.f104034b.withDeadlineAfter(j, timeUnit));
    }

    public final S withExecutor(Executor executor) {
        return (S) mo24886a(this.f104033a, this.f104034b.withExecutor(executor));
    }

    public final S withInterceptors(d42... d42VarArr) {
        return (S) mo24886a(e42.intercept(this.f104033a, d42VarArr), this.f104034b);
    }

    @lg5("https://github.com/grpc/grpc-java/issues/2563")
    public final S withMaxInboundMessageSize(int i) {
        return (S) mo24886a(this.f104033a, this.f104034b.withMaxInboundMessageSize(i));
    }

    @lg5("https://github.com/grpc/grpc-java/issues/2563")
    public final S withMaxOutboundMessageSize(int i) {
        return (S) mo24886a(this.f104033a, this.f104034b.withMaxOutboundMessageSize(i));
    }

    @lg5("https://github.com/grpc/grpc-java/issues/1869")
    public final <T> S withOption(rn1.C12165c<T> c12165c, T t) {
        return (S) mo24886a(this.f104033a, this.f104034b.withOption(c12165c, t));
    }

    public final S withWaitForReady() {
        return (S) mo24886a(this.f104033a, this.f104034b.withWaitForReady());
    }

    public AbstractC15982z4(bu1 bu1Var, rn1 rn1Var) {
        this.f104033a = (bu1) v7d.checkNotNull(bu1Var, "channel");
        this.f104034b = (rn1) v7d.checkNotNull(rn1Var, "callOptions");
    }

    public static <T extends AbstractC15982z4<T>> T newStub(a<T> aVar, bu1 bu1Var, rn1 rn1Var) {
        return (T) aVar.newStub(bu1Var, rn1Var);
    }
}
