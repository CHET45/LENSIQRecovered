package p000;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class ew1 extends Reader {

    /* JADX INFO: renamed from: a */
    @wx1
    public CharSequence f34283a;

    /* JADX INFO: renamed from: b */
    public int f34284b;

    /* JADX INFO: renamed from: c */
    public int f34285c;

    public ew1(CharSequence seq) {
        this.f34283a = (CharSequence) v7d.checkNotNull(seq);
    }

    private void checkOpen() throws IOException {
        if (this.f34283a == null) {
            throw new IOException("reader closed");
        }
    }

    private boolean hasRemaining() {
        return remaining() > 0;
    }

    private int remaining() {
        Objects.requireNonNull(this.f34283a);
        return this.f34283a.length() - this.f34284b;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f34283a = null;
    }

    @Override // java.io.Reader
    public synchronized void mark(int readAheadLimit) throws IOException {
        v7d.checkArgument(readAheadLimit >= 0, "readAheadLimit (%s) may not be negative", readAheadLimit);
        checkOpen();
        this.f34285c = this.f34284b;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer target) throws IOException {
        v7d.checkNotNull(target);
        checkOpen();
        Objects.requireNonNull(this.f34283a);
        if (!hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(target.remaining(), remaining());
        for (int i = 0; i < iMin; i++) {
            CharSequence charSequence = this.f34283a;
            int i2 = this.f34284b;
            this.f34284b = i2 + 1;
            target.put(charSequence.charAt(i2));
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        checkOpen();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        checkOpen();
        this.f34284b = this.f34285c;
    }

    @Override // java.io.Reader
    public synchronized long skip(long n) throws IOException {
        int iMin;
        v7d.checkArgument(n >= 0, "n (%s) may not be negative", n);
        checkOpen();
        iMin = (int) Math.min(remaining(), n);
        this.f34284b += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        int iCharAt;
        checkOpen();
        Objects.requireNonNull(this.f34283a);
        if (hasRemaining()) {
            CharSequence charSequence = this.f34283a;
            int i = this.f34284b;
            this.f34284b = i + 1;
            iCharAt = charSequence.charAt(i);
        } else {
            iCharAt = -1;
        }
        return iCharAt;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cbuf, int off, int len) throws IOException {
        v7d.checkPositionIndexes(off, off + len, cbuf.length);
        checkOpen();
        Objects.requireNonNull(this.f34283a);
        if (!hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(len, remaining());
        for (int i = 0; i < iMin; i++) {
            CharSequence charSequence = this.f34283a;
            int i2 = this.f34284b;
            this.f34284b = i2 + 1;
            cbuf[off + i] = charSequence.charAt(i2);
        }
        return iMin;
    }
}
