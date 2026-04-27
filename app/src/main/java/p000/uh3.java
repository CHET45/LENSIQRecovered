package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class uh3 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final gh3 f87998a;

    /* JADX INFO: renamed from: b */
    public final xh3 f87999b;

    /* JADX INFO: renamed from: f */
    public long f88003f;

    /* JADX INFO: renamed from: d */
    public boolean f88001d = false;

    /* JADX INFO: renamed from: e */
    public boolean f88002e = false;

    /* JADX INFO: renamed from: c */
    public final byte[] f88000c = new byte[1];

    public uh3(gh3 gh3Var, xh3 xh3Var) {
        this.f87998a = gh3Var;
        this.f87999b = xh3Var;
    }

    private void checkOpened() throws IOException {
        if (this.f88001d) {
            return;
        }
        this.f87998a.open(this.f87999b);
        this.f88001d = true;
    }

    public long bytesRead() {
        return this.f88003f;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f88002e) {
            return;
        }
        this.f87998a.close();
        this.f88002e = true;
    }

    public void open() throws IOException {
        checkOpened();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f88000c) == -1) {
            return -1;
        }
        return this.f88000c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        v80.checkState(!this.f88002e);
        checkOpened();
        int i3 = this.f87998a.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f88003f += (long) i3;
        return i3;
    }
}
