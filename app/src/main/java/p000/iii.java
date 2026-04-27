package p000;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.Collection;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes8.dex */
public interface iii {
    void close();

    void close(int i);

    void close(int i, String str);

    void closeConnection(int i, String str);

    <T> T getAttachment();

    qn4 getDraft();

    InetSocketAddress getLocalSocketAddress();

    rrd getReadyState();

    InetSocketAddress getRemoteSocketAddress();

    String getResourceDescriptor();

    SSLSession getSSLSession() throws IllegalArgumentException;

    boolean hasBufferedData();

    boolean hasSSLSupport();

    boolean isClosed();

    boolean isClosing();

    boolean isFlushAndClose();

    boolean isOpen();

    void send(String str);

    void send(ByteBuffer byteBuffer);

    void send(byte[] bArr);

    void sendFragmentedFrame(o5c o5cVar, ByteBuffer byteBuffer, boolean z);

    void sendFrame(Collection<nv6> collection);

    void sendFrame(nv6 nv6Var);

    void sendPing();

    <T> void setAttachment(T t);
}
