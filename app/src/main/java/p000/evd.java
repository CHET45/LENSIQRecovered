package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class evd extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public volatile byte[] f34165a;

    /* JADX INFO: renamed from: b */
    public int f34166b;

    /* JADX INFO: renamed from: c */
    public int f34167c;

    /* JADX INFO: renamed from: d */
    public int f34168d;

    /* JADX INFO: renamed from: e */
    public int f34169e;

    /* JADX INFO: renamed from: f */
    public final z60 f34170f;

    /* JADX INFO: renamed from: evd$a */
    public static class C5481a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public C5481a(String str) {
            super(str);
        }
    }

    public evd(@efb InputStream inputStream, @efb z60 z60Var) {
        this(inputStream, z60Var, 65536);
    }

    private int fillbuf(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f34168d;
        if (i != -1) {
            int i2 = this.f34169e - i;
            int i3 = this.f34167c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f34166b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f34170f.get(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f34165a = bArr2;
                    this.f34170f.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f34169e - this.f34168d;
                this.f34169e = i4;
                this.f34168d = 0;
                this.f34166b = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f34169e;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f34166b = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f34168d = -1;
            this.f34169e = 0;
            this.f34166b = i7;
        }
        return i7;
    }

    private static IOException streamClosed() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f34165a == null || inputStream == null) {
            throw streamClosed();
        }
        return (this.f34166b - this.f34169e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f34165a != null) {
            this.f34170f.put(this.f34165a);
            this.f34165a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void fixMarkLimit() {
        this.f34167c = this.f34165a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.f34167c = Math.max(this.f34167c, i);
        this.f34168d = this.f34169e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f34165a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw streamClosed();
        }
        if (this.f34169e >= this.f34166b && fillbuf(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f34165a && (bArr = this.f34165a) == null) {
            throw streamClosed();
        }
        int i = this.f34166b;
        int i2 = this.f34169e;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f34169e = i2 + 1;
        return bArr[i2] & 255;
    }

    public synchronized void release() {
        if (this.f34165a != null) {
            this.f34170f.put(this.f34165a);
            this.f34165a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f34165a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f34168d;
        if (-1 == i) {
            throw new C5481a("Mark has been invalidated, pos: " + this.f34169e + " markLimit: " + this.f34167c);
        }
        this.f34169e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f34165a;
        if (bArr == null) {
            throw streamClosed();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw streamClosed();
        }
        int i = this.f34166b;
        int i2 = this.f34169e;
        if (i - i2 >= j) {
            this.f34169e = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f34169e = i;
        if (this.f34168d == -1 || j > this.f34167c) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f34168d = -1;
            }
            return j2 + jSkip;
        }
        if (fillbuf(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f34166b;
        int i4 = this.f34169e;
        if (i3 - i4 >= j - j2) {
            this.f34169e = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f34169e = i3;
        return j3;
    }

    @fdi
    public evd(@efb InputStream inputStream, @efb z60 z60Var, int i) {
        super(inputStream);
        this.f34168d = -1;
        this.f34170f = z60Var;
        this.f34165a = (byte[]) z60Var.get(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@efb byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.f34165a;
        if (bArr2 == null) {
            throw streamClosed();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f34169e;
            int i6 = this.f34166b;
            if (i5 < i6) {
                int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f34169e += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f34168d == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (fillbuf(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.f34165a && (bArr2 = this.f34165a) == null) {
                        throw streamClosed();
                    }
                    int i8 = this.f34166b;
                    int i9 = this.f34169e;
                    i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f34169e += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            throw streamClosed();
        }
    }
}
