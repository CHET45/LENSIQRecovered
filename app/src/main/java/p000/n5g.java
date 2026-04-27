package p000;

import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public interface n5g {
    void flush();

    boolean isReady();

    void optimizeForDirectExecutor();

    void request(int i);

    void setCompressor(go2 go2Var);

    void setMessageCompression(boolean z);

    void writeMessage(InputStream inputStream);
}
