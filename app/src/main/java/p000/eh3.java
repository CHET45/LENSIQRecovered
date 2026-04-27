package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface eh3 {

    /* JADX INFO: renamed from: eh3$a */
    public interface InterfaceC5299a {
        eh3 createDataSink();
    }

    void close() throws IOException;

    void open(xh3 xh3Var) throws IOException;

    void write(byte[] bArr, int i, int i2) throws IOException;
}
