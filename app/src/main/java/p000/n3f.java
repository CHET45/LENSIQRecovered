package p000;

import p000.tr9;

/* JADX INFO: loaded from: classes7.dex */
@x98
public abstract class n3f {

    /* JADX INFO: renamed from: n3f$a */
    public static final class C9682a {

        /* JADX INFO: renamed from: a */
        public final v2f<?> f63208a;

        /* JADX INFO: renamed from: b */
        public final String f63209b;

        private C9682a(v2f<?> v2fVar, String str) {
            this.f63208a = v2fVar;
            this.f63209b = str;
        }

        public static C9682a error(String str) {
            return new C9682a(null, (String) v7d.checkNotNull(str));
        }

        public static C9682a serverBuilder(v2f<?> v2fVar) {
            return new C9682a((v2f) v7d.checkNotNull(v2fVar), null);
        }

        public String getError() {
            return this.f63209b;
        }

        public v2f<?> getServerBuilder() {
            return this.f63208a;
        }
    }

    public static n3f provider() {
        n3f n3fVarM18337c = o3f.getDefaultRegistry().m18337c();
        if (n3fVarM18337c != null) {
            return n3fVarM18337c;
        }
        throw new tr9.C13177b("No functional server found. Try adding a dependency on the grpc-netty or grpc-netty-shaded artifact");
    }

    /* JADX INFO: renamed from: a */
    public abstract v2f<?> mo17764a(int i);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo17765b();

    /* JADX INFO: renamed from: c */
    public C9682a mo17766c(int i, e3f e3fVar) {
        return C9682a.error("ServerCredentials are unsupported");
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo17767d();
}
