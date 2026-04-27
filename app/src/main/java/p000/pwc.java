package p000;

import java.io.IOException;
import java.net.Socket;
import p000.we7;

/* JADX INFO: loaded from: classes7.dex */
public final class pwc implements we7 {
    @Override // p000.we7
    public we7.C14565a handshake(Socket socket, sc0 sc0Var) throws IOException {
        return new we7.C14565a(socket, sc0Var.toBuilder().set(cc7.f16233b, socket.getLocalSocketAddress()).set(cc7.f16232a, socket.getRemoteSocketAddress()).set(dc7.f29283a, eue.NONE).build(), null);
    }
}
