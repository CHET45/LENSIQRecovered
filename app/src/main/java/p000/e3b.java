package p000;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public class e3b extends Reader {

    /* JADX INFO: renamed from: a */
    public final Iterator<? extends hw1> f31667a;

    /* JADX INFO: renamed from: b */
    @wx1
    public Reader f31668b;

    public e3b(Iterator<? extends hw1> readers) throws IOException {
        this.f31667a = readers;
        advance();
    }

    private void advance() throws IOException {
        close();
        if (this.f31667a.hasNext()) {
            this.f31668b = this.f31667a.next().openStream();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.f31668b;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f31668b = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(char[] cbuf, int off, int len) throws IOException {
        v7d.checkNotNull(cbuf);
        Reader reader = this.f31668b;
        if (reader == null) {
            return -1;
        }
        int i = reader.read(cbuf, off, len);
        if (i != -1) {
            return i;
        }
        advance();
        return read(cbuf, off, len);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.f31668b;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public long skip(long n) throws IOException {
        v7d.checkArgument(n >= 0, "n is negative");
        if (n > 0) {
            while (true) {
                Reader reader = this.f31668b;
                if (reader == null) {
                    break;
                }
                long jSkip = reader.skip(n);
                if (jSkip > 0) {
                    return jSkip;
                }
                advance();
            }
        }
        return 0L;
    }
}
