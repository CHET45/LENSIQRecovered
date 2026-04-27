package p000;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.ByteString;
import p000.k0c;

/* JADX INFO: loaded from: classes7.dex */
public final class i75 implements kv6 {

    /* JADX INFO: renamed from: d */
    public static final Logger f45896d = Logger.getLogger(j0c.class.getName());

    /* JADX INFO: renamed from: a */
    public final InterfaceC7171a f45897a;

    /* JADX INFO: renamed from: b */
    public final kv6 f45898b;

    /* JADX INFO: renamed from: c */
    public final k0c f45899c = new k0c(Level.FINE, (Class<?>) j0c.class);

    /* JADX INFO: renamed from: i75$a */
    public interface InterfaceC7171a {
        void onException(Throwable th);
    }

    public i75(InterfaceC7171a interfaceC7171a, kv6 kv6Var) {
        this.f45897a = (InterfaceC7171a) v7d.checkNotNull(interfaceC7171a, "transportExceptionHandler");
        this.f45898b = (kv6) v7d.checkNotNull(kv6Var, "frameWriter");
    }

    @gdi
    /* JADX INFO: renamed from: a */
    public static Level m12847a(Throwable th) {
        return th.getClass().equals(IOException.class) ? Level.FINE : Level.INFO;
    }

    @Override // p000.kv6
    public void ackSettings(b7f b7fVar) {
        this.f45899c.m14435i(k0c.EnumC8155a.OUTBOUND);
        try {
            this.f45898b.ackSettings(b7fVar);
        } catch (IOException e) {
            this.f45897a.onException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f45898b.close();
        } catch (IOException e) {
            f45896d.log(m12847a(e), "Failed closing connection", (Throwable) e);
        }
    }

    @Override // p000.kv6
    public void connectionPreface() {
        try {
            this.f45898b.connectionPreface();
        } catch (IOException e) {
            this.f45897a.onException(e);
        }
    }

    @Override // p000.kv6
    public void data(boolean z, int i, Buffer buffer, int i2) {
        this.f45899c.m14427a(k0c.EnumC8155a.OUTBOUND, i, buffer.buffer(), i2, z);
        try {
            this.f45898b.data(z, i, buffer, i2);
        } catch (IOException e) {
            this.f45897a.onException(e);
        }
    }

    @Override // p000.kv6
    public void flush() {
        try {
            this.f45898b.flush();
        } catch (IOException e) {
            this.f45897a.onException(e);
        }
    }

    @Override // p000.kv6
    public void goAway(int i, w45 w45Var, byte[] bArr) {
        this.f45899c.m14428b(k0c.EnumC8155a.OUTBOUND, i, w45Var, ByteString.m18742of(bArr));
        try {
            this.f45898b.goAway(i, w45Var, bArr);
            this.f45898b.flush();
        } catch (IOException e) {
            this.f45897a.onException(e);
        }
    }

    @Override // p000.kv6
    public void headers(int i, List<ei7> list) {
        this.f45899c.m14429c(k0c.EnumC8155a.OUTBOUND, i, list, false);
        try {
            this.f45898b.headers(i, list);
        } catch (IOException e) {
            this.f45897a.onException(e);
        }
    }

    @Override // p000.kv6
    public int maxDataLength() {
        return this.f45898b.maxDataLength();
    }

    @Override // p000.kv6
    public void ping(boolean z, int i, int i2) {
        if (z) {
            this.f45899c.m14431e(k0c.EnumC8155a.OUTBOUND, (4294967295L & ((long) i2)) | (((long) i) << 32));
        } else {
            this.f45899c.m14430d(k0c.EnumC8155a.OUTBOUND, (4294967295L & ((long) i2)) | (((long) i) << 32));
        }
        try {
            this.f45898b.ping(z, i, i2);
        } catch (IOException e) {
            this.f45897a.onException(e);
        }
    }

    @Override // p000.kv6
    public void pushPromise(int i, int i2, List<ei7> list) {
        this.f45899c.m14432f(k0c.EnumC8155a.OUTBOUND, i, i2, list);
        try {
            this.f45898b.pushPromise(i, i2, list);
        } catch (IOException e) {
            this.f45897a.onException(e);
        }
    }

    @Override // p000.kv6
    public void rstStream(int i, w45 w45Var) {
        this.f45899c.m14433g(k0c.EnumC8155a.OUTBOUND, i, w45Var);
        try {
            this.f45898b.rstStream(i, w45Var);
        } catch (IOException e) {
            this.f45897a.onException(e);
        }
    }

    @Override // p000.kv6
    public void settings(b7f b7fVar) {
        this.f45899c.m14434h(k0c.EnumC8155a.OUTBOUND, b7fVar);
        try {
            this.f45898b.settings(b7fVar);
        } catch (IOException e) {
            this.f45897a.onException(e);
        }
    }

    @Override // p000.kv6
    public void synReply(boolean z, int i, List<ei7> list) {
        try {
            this.f45898b.synReply(z, i, list);
        } catch (IOException e) {
            this.f45897a.onException(e);
        }
    }

    @Override // p000.kv6
    public void synStream(boolean z, boolean z2, int i, int i2, List<ei7> list) {
        try {
            this.f45898b.synStream(z, z2, i, i2, list);
        } catch (IOException e) {
            this.f45897a.onException(e);
        }
    }

    @Override // p000.kv6
    public void windowUpdate(int i, long j) {
        this.f45899c.m14436j(k0c.EnumC8155a.OUTBOUND, i, j);
        try {
            this.f45898b.windowUpdate(i, j);
        } catch (IOException e) {
            this.f45897a.onException(e);
        }
    }
}
