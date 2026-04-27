package p000;

import android.net.LocalSocketAddress;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes7.dex */
public class wqh extends SocketFactory {

    /* JADX INFO: renamed from: a */
    public final LocalSocketAddress f95181a;

    public wqh(String str, LocalSocketAddress.Namespace namespace) {
        this.f95181a = new LocalSocketAddress(str, namespace);
    }

    private Socket create() {
        return new vqh(this.f95181a);
    }

    private Socket createAndConnect() throws IOException {
        Socket socketCreate = create();
        socketCreate.connect(new InetSocketAddress(0));
        return socketCreate;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return create();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        return createAndConnect();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return createAndConnect();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return createAndConnect();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return createAndConnect();
    }
}
