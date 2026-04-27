package p000;

import java.io.IOException;
import java.net.Socket;
import p000.da8;

/* JADX INFO: loaded from: classes7.dex */
public interface we7 {

    /* JADX INFO: renamed from: we7$a */
    public static final class C14565a {

        /* JADX INFO: renamed from: a */
        public final Socket f94030a;

        /* JADX INFO: renamed from: b */
        public final sc0 f94031b;

        /* JADX INFO: renamed from: c */
        public final da8.C4689f f94032c;

        public C14565a(Socket socket, sc0 sc0Var, da8.C4689f c4689f) {
            this.f94030a = (Socket) v7d.checkNotNull(socket, "socket");
            this.f94031b = (sc0) v7d.checkNotNull(sc0Var, "attributes");
            this.f94032c = c4689f;
        }
    }

    C14565a handshake(Socket socket, sc0 sc0Var) throws IOException;
}
