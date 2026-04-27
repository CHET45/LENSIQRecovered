package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class th3 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final ih3 f84672a;

    /* JADX INFO: renamed from: b */
    public final yh3 f84673b;

    /* JADX INFO: renamed from: f */
    public long f84677f;

    /* JADX INFO: renamed from: d */
    public boolean f84675d = false;

    /* JADX INFO: renamed from: e */
    public boolean f84676e = false;

    /* JADX INFO: renamed from: c */
    public final byte[] f84674c = new byte[1];

    public th3(ih3 ih3Var, yh3 yh3Var) {
        this.f84672a = ih3Var;
        this.f84673b = yh3Var;
    }

    private void checkOpened() throws IOException {
        if (this.f84675d) {
            return;
        }
        this.f84672a.open(this.f84673b);
        this.f84675d = true;
    }

    public long bytesRead() {
        return this.f84677f;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f84676e) {
            return;
        }
        this.f84672a.close();
        this.f84676e = true;
    }

    public void open() throws IOException {
        checkOpened();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f84674c) == -1) {
            return -1;
        }
        return this.f84674c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        u80.checkState(!this.f84676e);
        checkOpened();
        int i3 = this.f84672a.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f84677f += (long) i3;
        return i3;
    }
}
