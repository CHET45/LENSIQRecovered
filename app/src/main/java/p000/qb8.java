package p000;

import p000.k3f;

/* JADX INFO: loaded from: classes7.dex */
@x98
public final class qb8 {
    private qb8() {
    }

    public static <ReqT, RespT> y2f<ReqT, RespT> interceptCallHandlerCreate(j3f j3fVar, y2f<ReqT, RespT> y2fVar) {
        return k3f.C8187c.create(j3fVar, y2fVar);
    }

    public static <OrigReqT, OrigRespT, WrapReqT, WrapRespT> m3f<WrapReqT, WrapRespT> wrapMethod(m3f<OrigReqT, OrigRespT> m3fVar, rua<WrapReqT, WrapRespT> ruaVar) {
        return k3f.m14484a(m3fVar, ruaVar);
    }
}
