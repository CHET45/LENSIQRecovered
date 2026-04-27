package p000;

import com.squareup.okhttp.ConnectionSpec;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1785")
public final class d0g {

    /* JADX INFO: renamed from: d0g$a */
    public static final class C4577a extends e3f {

        /* JADX INFO: renamed from: a */
        public final SSLSocketFactory f28201a;

        /* JADX INFO: renamed from: b */
        public final ls2 f28202b;

        public C4577a(SSLSocketFactory sSLSocketFactory) {
            this(sSLSocketFactory, g0c.f38136t);
        }

        public ls2 getConnectionSpec() {
            return this.f28202b;
        }

        public SSLSocketFactory getFactory() {
            return this.f28201a;
        }

        public C4577a(SSLSocketFactory sSLSocketFactory, ls2 ls2Var) {
            this.f28201a = (SSLSocketFactory) v7d.checkNotNull(sSLSocketFactory, "factory");
            this.f28202b = (ls2) v7d.checkNotNull(ls2Var, "connectionSpec");
        }
    }

    private d0g() {
    }

    public static e3f create(SSLSocketFactory sSLSocketFactory) {
        return new C4577a(sSLSocketFactory);
    }

    public static e3f create(SSLSocketFactory sSLSocketFactory, ConnectionSpec connectionSpec) {
        return new C4577a(sSLSocketFactory, h1i.m12080a(connectionSpec));
    }
}
