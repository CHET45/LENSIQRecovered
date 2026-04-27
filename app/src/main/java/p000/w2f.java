package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class w2f<ReqT, RespT> {

    /* JADX INFO: renamed from: w2f$a */
    public static abstract class AbstractC14368a<ReqT> {
        public void onCancel() {
        }

        public void onComplete() {
        }

        public void onHalfClose() {
        }

        public void onMessage(ReqT reqt) {
        }

        public void onReady() {
        }
    }

    public abstract void close(n4g n4gVar, fta ftaVar);

    @lg5("https://github.com/grpc/grpc-java/issues/1779")
    public sc0 getAttributes() {
        return sc0.f81180c;
    }

    @eib
    public String getAuthority() {
        return null;
    }

    public abstract rua<ReqT, RespT> getMethodDescriptor();

    @lg5("https://github.com/grpc/grpc-java/issues/4692")
    public eue getSecurityLevel() {
        return eue.NONE;
    }

    public abstract boolean isCancelled();

    public boolean isReady() {
        return true;
    }

    public abstract void request(int i);

    public abstract void sendHeaders(fta ftaVar);

    public abstract void sendMessage(RespT respt);

    public void setCompression(String str) {
    }

    public void setMessageCompression(boolean z) {
    }
}
