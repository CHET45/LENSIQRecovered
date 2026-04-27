package p000;

import com.blankj.utilcode.util.C2473f;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import javax.net.ssl.SSLSession;
import p000.sc0;

/* JADX INFO: loaded from: classes7.dex */
public final class cc7 {

    /* JADX INFO: renamed from: a */
    @lg5("https://github.com/grpc/grpc-java/issues/1710")
    public static final sc0.C12516c<SocketAddress> f16232a = sc0.C12516c.create("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");

    /* JADX INFO: renamed from: b */
    @lg5("https://github.com/grpc/grpc-java/issues/1710")
    public static final sc0.C12516c<SocketAddress> f16233b = sc0.C12516c.create("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");

    /* JADX INFO: renamed from: c */
    @lg5("https://github.com/grpc/grpc-java/issues/1710")
    public static final sc0.C12516c<SSLSession> f16234c = sc0.C12516c.create("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");

    /* JADX INFO: renamed from: cc7$a */
    @lg5("https://github.com/grpc/grpc-java/issues/4972")
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC2265a {
    }

    private cc7() {
    }

    private static String authorityFromHostAndPort(String str, int i) {
        try {
            return new URI(null, null, str, i, null, null, null).getAuthority();
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid host or port: " + str + C2473f.f17566z + i, e);
        }
    }

    public static pr9<?> newChannelBuilder(String str, eu1 eu1Var) {
        return ur9.getDefaultRegistry().m23538c(str, eu1Var);
    }

    public static pr9<?> newChannelBuilderForAddress(String str, int i, eu1 eu1Var) {
        return newChannelBuilder(authorityFromHostAndPort(str, i), eu1Var);
    }

    public static v2f<?> newServerBuilderForPort(int i, e3f e3fVar) {
        return o3f.getDefaultRegistry().m18336b(i, e3fVar);
    }
}
