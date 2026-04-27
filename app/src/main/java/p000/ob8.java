package p000;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.List;
import p000.da8;

/* JADX INFO: loaded from: classes7.dex */
@kyg
public interface ob8 {
    SocketAddress getListenSocketAddress();

    List<? extends SocketAddress> getListenSocketAddresses();

    @eib
    xa8<da8.C4695l> getListenSocketStats();

    @eib
    List<xa8<da8.C4695l>> getListenSocketStatsList();

    void shutdown();

    void start(l3f l3fVar) throws IOException;
}
