package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class l2b extends InputStream {

    /* JADX INFO: renamed from: a */
    public Iterator<? extends rj1> f55999a;

    /* JADX INFO: renamed from: b */
    @wx1
    public InputStream f56000b;

    public l2b(Iterator<? extends rj1> it) throws IOException {
        this.f55999a = (Iterator) v7d.checkNotNull(it);
        advance();
    }

    private void advance() throws IOException {
        close();
        if (this.f55999a.hasNext()) {
            this.f56000b = this.f55999a.next().openStream();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f56000b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f56000b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f56000b = null;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f56000b;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i != -1) {
                return i;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public long skip(long n) throws IOException {
        InputStream inputStream = this.f56000b;
        if (inputStream == null || n <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(n);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f56000b.skip(n - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        v7d.checkNotNull(b);
        while (true) {
            InputStream inputStream = this.f56000b;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read(b, off, len);
            if (i != -1) {
                return i;
            }
            advance();
        }
    }
}
