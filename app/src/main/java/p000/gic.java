package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class gic<ReqT, RespT> extends w2f<ReqT, RespT> {
    /* JADX INFO: renamed from: a */
    public abstract w2f<?, ?> mo11691a();

    @Override // p000.w2f
    public void close(n4g n4gVar, fta ftaVar) {
        mo11691a().close(n4gVar, ftaVar);
    }

    @Override // p000.w2f
    @lg5("https://github.com/grpc/grpc-java/issues/1779")
    public sc0 getAttributes() {
        return mo11691a().getAttributes();
    }

    @Override // p000.w2f
    public String getAuthority() {
        return mo11691a().getAuthority();
    }

    @Override // p000.w2f
    @lg5("https://github.com/grpc/grpc-java/issues/4692")
    public eue getSecurityLevel() {
        return mo11691a().getSecurityLevel();
    }

    @Override // p000.w2f
    public boolean isCancelled() {
        return mo11691a().isCancelled();
    }

    @Override // p000.w2f
    public boolean isReady() {
        return mo11691a().isReady();
    }

    @Override // p000.w2f
    public void request(int i) {
        mo11691a().request(i);
    }

    @Override // p000.w2f
    public void sendHeaders(fta ftaVar) {
        mo11691a().sendHeaders(ftaVar);
    }

    @Override // p000.w2f
    @lg5("https://github.com/grpc/grpc-java/issues/1704")
    public void setCompression(String str) {
        mo11691a().setCompression(str);
    }

    @Override // p000.w2f
    public void setMessageCompression(boolean z) {
        mo11691a().setMessageCompression(z);
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", mo11691a()).toString();
    }
}
