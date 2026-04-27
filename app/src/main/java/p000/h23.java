package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class h23 extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public long f42063a;

    /* JADX INFO: renamed from: b */
    public long f42064b;

    public h23(InputStream in) {
        super((InputStream) v7d.checkNotNull(in));
        this.f42064b = -1L;
    }

    public long getCount() {
        return this.f42063a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int readlimit) {
        ((FilterInputStream) this).in.mark(readlimit);
        this.f42064b = this.f42063a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f42063a++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f42064b == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f42063a = this.f42064b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long n) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(n);
        this.f42063a += jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        int i = ((FilterInputStream) this).in.read(b, off, len);
        if (i != -1) {
            this.f42063a += (long) i;
        }
        return i;
    }
}
