package p000;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public interface nii {
    InetSocketAddress getLocalSocketAddress(iii iiiVar);

    InetSocketAddress getRemoteSocketAddress(iii iiiVar);

    uvc onPreparePing(iii iiiVar);

    void onWebsocketClose(iii iiiVar, int i, String str, boolean z);

    void onWebsocketCloseInitiated(iii iiiVar, int i, String str);

    void onWebsocketClosing(iii iiiVar, int i, String str, boolean z);

    void onWebsocketError(iii iiiVar, Exception exc);

    void onWebsocketHandshakeReceivedAsClient(iii iiiVar, z32 z32Var, f3f f3fVar) throws ud8;

    g3f onWebsocketHandshakeReceivedAsServer(iii iiiVar, qn4 qn4Var, z32 z32Var) throws ud8;

    void onWebsocketHandshakeSentAsClient(iii iiiVar, z32 z32Var) throws ud8;

    void onWebsocketMessage(iii iiiVar, String str);

    void onWebsocketMessage(iii iiiVar, ByteBuffer byteBuffer);

    void onWebsocketOpen(iii iiiVar, ue7 ue7Var);

    void onWebsocketPing(iii iiiVar, nv6 nv6Var);

    void onWebsocketPong(iii iiiVar, nv6 nv6Var);

    void onWriteDemand(iii iiiVar);
}
