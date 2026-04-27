package p000;

import java.net.SocketAddress;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
@x98
public abstract class tr9 {

    /* JADX INFO: renamed from: tr9$a */
    public static final class C13176a {

        /* JADX INFO: renamed from: a */
        public final pr9<?> f85672a;

        /* JADX INFO: renamed from: b */
        public final String f85673b;

        private C13176a(pr9<?> pr9Var, String str) {
            this.f85672a = pr9Var;
            this.f85673b = str;
        }

        public static C13176a channelBuilder(pr9<?> pr9Var) {
            return new C13176a((pr9) v7d.checkNotNull(pr9Var), null);
        }

        public static C13176a error(String str) {
            return new C13176a(null, (String) v7d.checkNotNull(str));
        }

        public pr9<?> getChannelBuilder() {
            return this.f85672a;
        }

        public String getError() {
            return this.f85673b;
        }
    }

    /* JADX INFO: renamed from: tr9$b */
    public static final class C13177b extends RuntimeException {
        private static final long serialVersionUID = 1;

        public C13177b(String str) {
            super(str);
        }
    }

    public static tr9 provider() {
        tr9 tr9VarM23539d = ur9.getDefaultRegistry().m23539d();
        if (tr9VarM23539d != null) {
            return tr9VarM23539d;
        }
        throw new C13177b("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    /* JADX INFO: renamed from: a */
    public abstract Collection<Class<? extends SocketAddress>> mo12062a();

    public abstract pr9<?> builderForAddress(String str, int i);

    public abstract pr9<?> builderForTarget(String str);

    public abstract boolean isAvailable();

    public C13176a newChannelBuilder(String str, eu1 eu1Var) {
        return C13176a.error("ChannelCredentials are unsupported");
    }

    public abstract int priority();
}
