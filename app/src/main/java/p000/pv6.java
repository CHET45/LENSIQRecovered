package p000;

import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public interface pv6 {
    void close();

    void dispose();

    void flush();

    boolean isClosed();

    pv6 setCompressor(go2 go2Var);

    void setMaxOutboundMessageSize(int i);

    pv6 setMessageCompression(boolean z);

    void writePayload(InputStream inputStream);
}
