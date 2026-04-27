package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public abstract class pn1 {

    /* JADX INFO: renamed from: pn1$a */
    public static abstract class AbstractC11034a {
        public abstract void apply(fta ftaVar);

        public abstract void fail(n4g n4gVar);
    }

    /* JADX INFO: renamed from: pn1$b */
    public static abstract class AbstractC11035b {
        public abstract String getAuthority();

        public rn1 getCallOptions() {
            throw new UnsupportedOperationException("Not implemented");
        }

        public abstract rua<?, ?> getMethodDescriptor();

        public abstract eue getSecurityLevel();

        public abstract sc0 getTransportAttrs();
    }

    public abstract void applyRequestMetadata(AbstractC11035b abstractC11035b, Executor executor, AbstractC11034a abstractC11034a);

    @lg5("https://github.com/grpc/grpc-java/issues/1914")
    @Deprecated
    public void thisUsesUnstableApi() {
    }
}
