package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ht6<ReqT, RespT> extends gic<ReqT, RespT> {

    /* JADX INFO: renamed from: ht6$a */
    public static abstract class AbstractC7011a<ReqT, RespT> extends ht6<ReqT, RespT> {

        /* JADX INFO: renamed from: a */
        public final w2f<ReqT, RespT> f44818a;

        public AbstractC7011a(w2f<ReqT, RespT> w2fVar) {
            this.f44818a = w2fVar;
        }

        @Override // p000.ht6, p000.gic
        /* JADX INFO: renamed from: a */
        public w2f<ReqT, RespT> mo11691a() {
            return this.f44818a;
        }

        @Override // p000.ht6, p000.gic, p000.w2f
        public /* bridge */ /* synthetic */ void close(n4g n4gVar, fta ftaVar) {
            super.close(n4gVar, ftaVar);
        }

        @Override // p000.ht6, p000.gic, p000.w2f
        @lg5("https://github.com/grpc/grpc-java/issues/1779")
        public /* bridge */ /* synthetic */ sc0 getAttributes() {
            return super.getAttributes();
        }

        @Override // p000.ht6, p000.gic, p000.w2f
        public /* bridge */ /* synthetic */ String getAuthority() {
            return super.getAuthority();
        }

        @Override // p000.ht6, p000.gic, p000.w2f
        @lg5("https://github.com/grpc/grpc-java/issues/4692")
        public /* bridge */ /* synthetic */ eue getSecurityLevel() {
            return super.getSecurityLevel();
        }

        @Override // p000.ht6, p000.gic, p000.w2f
        public /* bridge */ /* synthetic */ boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // p000.ht6, p000.gic, p000.w2f
        public /* bridge */ /* synthetic */ boolean isReady() {
            return super.isReady();
        }

        @Override // p000.ht6, p000.gic, p000.w2f
        public /* bridge */ /* synthetic */ void request(int i) {
            super.request(i);
        }

        @Override // p000.ht6, p000.gic, p000.w2f
        public /* bridge */ /* synthetic */ void sendHeaders(fta ftaVar) {
            super.sendHeaders(ftaVar);
        }

        @Override // p000.ht6, p000.gic, p000.w2f
        @lg5("https://github.com/grpc/grpc-java/issues/1704")
        public /* bridge */ /* synthetic */ void setCompression(String str) {
            super.setCompression(str);
        }

        @Override // p000.ht6, p000.gic, p000.w2f
        public /* bridge */ /* synthetic */ void setMessageCompression(boolean z) {
            super.setMessageCompression(z);
        }

        @Override // p000.ht6, p000.gic
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // p000.gic
    /* JADX INFO: renamed from: a */
    public abstract w2f<ReqT, RespT> mo11691a();

    @Override // p000.gic, p000.w2f
    public /* bridge */ /* synthetic */ void close(n4g n4gVar, fta ftaVar) {
        super.close(n4gVar, ftaVar);
    }

    @Override // p000.gic, p000.w2f
    @lg5("https://github.com/grpc/grpc-java/issues/1779")
    public /* bridge */ /* synthetic */ sc0 getAttributes() {
        return super.getAttributes();
    }

    @Override // p000.gic, p000.w2f
    public /* bridge */ /* synthetic */ String getAuthority() {
        return super.getAuthority();
    }

    @Override // p000.w2f
    public rua<ReqT, RespT> getMethodDescriptor() {
        return mo11691a().getMethodDescriptor();
    }

    @Override // p000.gic, p000.w2f
    @lg5("https://github.com/grpc/grpc-java/issues/4692")
    public /* bridge */ /* synthetic */ eue getSecurityLevel() {
        return super.getSecurityLevel();
    }

    @Override // p000.gic, p000.w2f
    public /* bridge */ /* synthetic */ boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // p000.gic, p000.w2f
    public /* bridge */ /* synthetic */ boolean isReady() {
        return super.isReady();
    }

    @Override // p000.gic, p000.w2f
    public /* bridge */ /* synthetic */ void request(int i) {
        super.request(i);
    }

    @Override // p000.gic, p000.w2f
    public /* bridge */ /* synthetic */ void sendHeaders(fta ftaVar) {
        super.sendHeaders(ftaVar);
    }

    @Override // p000.w2f
    public void sendMessage(RespT respt) {
        mo11691a().sendMessage(respt);
    }

    @Override // p000.gic, p000.w2f
    @lg5("https://github.com/grpc/grpc-java/issues/1704")
    public /* bridge */ /* synthetic */ void setCompression(String str) {
        super.setCompression(str);
    }

    @Override // p000.gic, p000.w2f
    public /* bridge */ /* synthetic */ void setMessageCompression(boolean z) {
        super.setMessageCompression(z);
    }

    @Override // p000.gic
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
