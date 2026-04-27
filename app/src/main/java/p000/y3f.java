package p000;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/2861")
@kyg
public abstract class y3f extends g6g {

    /* JADX INFO: renamed from: y3f$a */
    public static abstract class AbstractC15412a {
        public abstract y3f newServerStreamTracer(String str, fta ftaVar);
    }

    /* JADX INFO: renamed from: y3f$b */
    @Deprecated
    public static final class C15413b<ReqT, RespT> extends ht6<ReqT, RespT> {

        /* JADX INFO: renamed from: a */
        public final AbstractC15414c<ReqT, RespT> f100230a;

        private C15413b(AbstractC15414c<ReqT, RespT> abstractC15414c) {
            this.f100230a = abstractC15414c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <ReqT, RespT> C15413b<ReqT, RespT> create(AbstractC15414c<ReqT, RespT> abstractC15414c) {
            return new C15413b<>(abstractC15414c);
        }

        @Override // p000.ht6, p000.gic
        /* JADX INFO: renamed from: a */
        public w2f<ReqT, RespT> mo11691a() {
            throw new UnsupportedOperationException();
        }

        @Override // p000.ht6, p000.gic, p000.w2f
        public sc0 getAttributes() {
            return this.f100230a.getAttributes();
        }

        @Override // p000.ht6, p000.gic, p000.w2f
        public String getAuthority() {
            return this.f100230a.getAuthority();
        }

        @Override // p000.ht6, p000.w2f
        public rua<ReqT, RespT> getMethodDescriptor() {
            return this.f100230a.getMethodDescriptor();
        }

        @Override // p000.ht6, p000.gic, p000.w2f
        public boolean isCancelled() {
            return false;
        }

        @Override // p000.ht6, p000.gic, p000.w2f
        public boolean isReady() {
            return false;
        }
    }

    /* JADX INFO: renamed from: y3f$c */
    public static abstract class AbstractC15414c<ReqT, RespT> {
        public abstract sc0 getAttributes();

        @eib
        public abstract String getAuthority();

        public abstract rua<ReqT, RespT> getMethodDescriptor();
    }

    public fx2 filterContext(fx2 fx2Var) {
        return fx2Var;
    }

    public void serverCallStarted(AbstractC15414c<?, ?> abstractC15414c) {
        serverCallStarted(C15413b.create(abstractC15414c));
    }

    @Deprecated
    public void serverCallStarted(w2f<?, ?> w2fVar) {
    }
}
