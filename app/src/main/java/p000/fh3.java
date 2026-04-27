package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface fh3 {

    /* JADX INFO: renamed from: fh3$a */
    public interface InterfaceC5803a {
        fh3 createDataSink();
    }

    void close() throws IOException;

    void open(yh3 yh3Var) throws IOException;

    void write(byte[] bArr, int i, int i2) throws IOException;
}
