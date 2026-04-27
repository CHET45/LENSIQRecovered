package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class w22<ReqT, RespT> {

    /* JADX INFO: renamed from: w22$a */
    public static abstract class AbstractC14364a<T> {
        public void onClose(n4g n4gVar, fta ftaVar) {
        }

        public void onHeaders(fta ftaVar) {
        }

        public void onMessage(T t) {
        }

        public void onReady() {
        }
    }

    public abstract void cancel(@eib String str, @eib Throwable th);

    @lg5("https://github.com/grpc/grpc-java/issues/2607")
    public sc0 getAttributes() {
        return sc0.f81180c;
    }

    public abstract void halfClose();

    public boolean isReady() {
        return true;
    }

    public abstract void request(int i);

    public abstract void sendMessage(ReqT reqt);

    public void setMessageCompression(boolean z) {
    }

    public abstract void start(AbstractC14364a<RespT> abstractC14364a, fta ftaVar);
}
