package p000;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes7.dex */
public final class f1c {

    /* JADX INFO: renamed from: a */
    @gdi
    public static final List<uhd> f34709a = Collections.unmodifiableList(Arrays.asList(uhd.HTTP_2));

    @gdi
    /* JADX INFO: renamed from: a */
    public static String m10410a(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    public static SSLSocket upgrade(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i, ls2 ls2Var) throws IOException {
        v7d.checkNotNull(sSLSocketFactory, "sslSocketFactory");
        v7d.checkNotNull(socket, "socket");
        v7d.checkNotNull(ls2Var, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        ls2Var.apply(sSLSocket, false);
        String strNegotiate = l0c.get().negotiate(sSLSocket, str, ls2Var.supportsTlsExtensions() ? f34709a : null);
        List<uhd> list = f34709a;
        v7d.checkState(list.contains(uhd.get(strNegotiate)), "Only " + list + " are supported, but negotiated protocol is %s", strNegotiate);
        if (hostnameVerifier == null) {
            hostnameVerifier = f0c.f34647a;
        }
        if (hostnameVerifier.verify(m10410a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
