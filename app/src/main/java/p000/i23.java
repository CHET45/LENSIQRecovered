package p000;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class i23 extends FilterOutputStream {

    /* JADX INFO: renamed from: a */
    public long f45507a;

    public i23(OutputStream out) {
        super((OutputStream) v7d.checkNotNull(out));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    public long getCount() {
        return this.f45507a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] b, int off, int len) throws IOException {
        ((FilterOutputStream) this).out.write(b, off, len);
        this.f45507a += (long) len;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int b) throws IOException {
        ((FilterOutputStream) this).out.write(b);
        this.f45507a++;
    }
}
