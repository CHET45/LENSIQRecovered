package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class m3f<ReqT, RespT> {

    /* JADX INFO: renamed from: a */
    public final rua<ReqT, RespT> f59837a;

    /* JADX INFO: renamed from: b */
    public final y2f<ReqT, RespT> f59838b;

    private m3f(rua<ReqT, RespT> ruaVar, y2f<ReqT, RespT> y2fVar) {
        this.f59837a = ruaVar;
        this.f59838b = y2fVar;
    }

    public static <ReqT, RespT> m3f<ReqT, RespT> create(rua<ReqT, RespT> ruaVar, y2f<ReqT, RespT> y2fVar) {
        return new m3f<>(ruaVar, y2fVar);
    }

    public rua<ReqT, RespT> getMethodDescriptor() {
        return this.f59837a;
    }

    public y2f<ReqT, RespT> getServerCallHandler() {
        return this.f59838b;
    }

    public m3f<ReqT, RespT> withServerCallHandler(y2f<ReqT, RespT> y2fVar) {
        return new m3f<>(this.f59837a, y2fVar);
    }
}
