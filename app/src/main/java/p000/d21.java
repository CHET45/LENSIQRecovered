package p000;

import java.io.Closeable;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/4017")
public abstract class d21 implements Closeable {
    public abstract bu1 wrapChannel(bu1 bu1Var);

    public abstract <ReqT, RespT> m3f<?, ?> wrapMethodDefinition(m3f<ReqT, RespT> m3fVar);
}
