package p000;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface pii extends lii {
    void close();

    @Override // p000.lii
    mii createWebSocket(jii jiiVar, List<qn4> list);

    @Override // p000.lii
    mii createWebSocket(jii jiiVar, qn4 qn4Var);

    ByteChannel wrapChannel(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException;
}
