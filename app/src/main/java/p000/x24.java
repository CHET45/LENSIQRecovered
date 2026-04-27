package p000;

import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class x24 implements pii {
    @Override // p000.pii
    public void close() {
    }

    @Override // p000.lii
    public /* bridge */ /* synthetic */ iii createWebSocket(jii jiiVar, List list) {
        return createWebSocket(jiiVar, (List<qn4>) list);
    }

    @Override // p000.pii
    public SocketChannel wrapChannel(SocketChannel socketChannel, SelectionKey selectionKey) {
        return socketChannel;
    }

    @Override // p000.lii
    public mii createWebSocket(jii jiiVar, qn4 qn4Var) {
        return new mii(jiiVar, qn4Var);
    }

    @Override // p000.pii, p000.lii
    public mii createWebSocket(jii jiiVar, List<qn4> list) {
        return new mii(jiiVar, list);
    }
}
