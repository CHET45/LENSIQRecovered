package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import okio.Buffer;

/* JADX INFO: loaded from: classes7.dex */
public interface kv6 extends Closeable {
    void ackSettings(b7f b7fVar) throws IOException;

    void connectionPreface() throws IOException;

    void data(boolean z, int i, Buffer buffer, int i2) throws IOException;

    void flush() throws IOException;

    void goAway(int i, w45 w45Var, byte[] bArr) throws IOException;

    void headers(int i, List<ei7> list) throws IOException;

    int maxDataLength();

    void ping(boolean z, int i, int i2) throws IOException;

    void pushPromise(int i, int i2, List<ei7> list) throws IOException;

    void rstStream(int i, w45 w45Var) throws IOException;

    void settings(b7f b7fVar) throws IOException;

    void synReply(boolean z, int i, List<ei7> list) throws IOException;

    void synStream(boolean z, boolean z2, int i, int i2, List<ei7> list) throws IOException;

    void windowUpdate(int i, long j) throws IOException;
}
