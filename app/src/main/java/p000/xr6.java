package p000;

import java.io.IOException;
import java.util.List;
import okio.Buffer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xr6 implements kv6 {

    /* JADX INFO: renamed from: a */
    public final kv6 f99028a;

    public xr6(kv6 kv6Var) {
        this.f99028a = (kv6) v7d.checkNotNull(kv6Var, "delegate");
    }

    @Override // p000.kv6
    public void ackSettings(b7f b7fVar) throws IOException {
        this.f99028a.ackSettings(b7fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f99028a.close();
    }

    @Override // p000.kv6
    public void connectionPreface() throws IOException {
        this.f99028a.connectionPreface();
    }

    @Override // p000.kv6
    public void data(boolean z, int i, Buffer buffer, int i2) throws IOException {
        this.f99028a.data(z, i, buffer, i2);
    }

    @Override // p000.kv6
    public void flush() throws IOException {
        this.f99028a.flush();
    }

    @Override // p000.kv6
    public void goAway(int i, w45 w45Var, byte[] bArr) throws IOException {
        this.f99028a.goAway(i, w45Var, bArr);
    }

    @Override // p000.kv6
    public void headers(int i, List<ei7> list) throws IOException {
        this.f99028a.headers(i, list);
    }

    @Override // p000.kv6
    public int maxDataLength() {
        return this.f99028a.maxDataLength();
    }

    @Override // p000.kv6
    public void ping(boolean z, int i, int i2) throws IOException {
        this.f99028a.ping(z, i, i2);
    }

    @Override // p000.kv6
    public void pushPromise(int i, int i2, List<ei7> list) throws IOException {
        this.f99028a.pushPromise(i, i2, list);
    }

    @Override // p000.kv6
    public void rstStream(int i, w45 w45Var) throws IOException {
        this.f99028a.rstStream(i, w45Var);
    }

    @Override // p000.kv6
    public void settings(b7f b7fVar) throws IOException {
        this.f99028a.settings(b7fVar);
    }

    @Override // p000.kv6
    public void synReply(boolean z, int i, List<ei7> list) throws IOException {
        this.f99028a.synReply(z, i, list);
    }

    @Override // p000.kv6
    public void synStream(boolean z, boolean z2, int i, int i2, List<ei7> list) throws IOException {
        this.f99028a.synStream(z, z2, i, i2, list);
    }

    @Override // p000.kv6
    public void windowUpdate(int i, long j) throws IOException {
        this.f99028a.windowUpdate(i, j);
    }
}
