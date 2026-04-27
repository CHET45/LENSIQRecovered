package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/8274")
public interface x2f {
    @eib
    <ReqT, RespT> Executor getExecutor(w2f<ReqT, RespT> w2fVar, fta ftaVar);
}
