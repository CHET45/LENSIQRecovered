package p000;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p000.d0g;
import p000.da8;
import p000.we7;

/* JADX INFO: loaded from: classes7.dex */
public final class c3h implements we7 {

    /* JADX INFO: renamed from: a */
    public final pwc f15721a = new pwc();

    /* JADX INFO: renamed from: b */
    public final SSLSocketFactory f15722b;

    /* JADX INFO: renamed from: c */
    public final ls2 f15723c;

    public c3h(d0g.C4577a c4577a) {
        this.f15722b = c4577a.getFactory();
        this.f15723c = c4577a.getConnectionSpec();
    }

    @Override // p000.we7
    public we7.C14565a handshake(Socket socket, sc0 sc0Var) throws IOException {
        we7.C14565a c14565aHandshake = this.f15721a.handshake(socket, sc0Var);
        Socket socketCreateSocket = this.f15722b.createSocket(c14565aHandshake.f94030a, (String) null, -1, true);
        if (!(socketCreateSocket instanceof SSLSocket)) {
            throw new IOException("SocketFactory " + this.f15722b + " did not produce an SSLSocket: " + socketCreateSocket.getClass());
        }
        SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
        sSLSocket.setUseClientMode(false);
        this.f15723c.apply(sSLSocket, false);
        uhd uhdVar = uhd.HTTP_2;
        String strNegotiate = l0c.get().negotiate(sSLSocket, null, this.f15723c.supportsTlsExtensions() ? Arrays.asList(uhdVar) : null);
        if (uhdVar.toString().equals(strNegotiate)) {
            return new we7.C14565a(socketCreateSocket, c14565aHandshake.f94031b.toBuilder().set(dc7.f29283a, eue.PRIVACY_AND_INTEGRITY).set(cc7.f16234c, sSLSocket.getSession()).build(), new da8.C4689f(new da8.C4697n(sSLSocket.getSession())));
        }
        throw new IOException("Expected NPN/ALPN " + uhdVar + ": " + strNegotiate);
    }
}
