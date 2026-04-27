package p000;

import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes7.dex */
@lg5("There is no plan to make this API stable, given transport API instability")
public final class c0g {

    /* JADX INFO: renamed from: c0g$b */
    public static final class C2143b extends eu1 {

        /* JADX INFO: renamed from: a */
        public final SSLSocketFactory f15451a;

        public SSLSocketFactory getFactory() {
            return this.f15451a;
        }

        @Override // p000.eu1
        public eu1 withoutBearerTokens() {
            return this;
        }

        private C2143b(SSLSocketFactory sSLSocketFactory) {
            this.f15451a = (SSLSocketFactory) v7d.checkNotNull(sSLSocketFactory, "factory");
        }
    }

    private c0g() {
    }

    public static eu1 create(SSLSocketFactory sSLSocketFactory) {
        return new C2143b(sSLSocketFactory);
    }
}
