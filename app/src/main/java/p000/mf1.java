package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class mf1 extends OutputStream {

    /* JADX INFO: renamed from: a */
    @efb
    public final OutputStream f60872a;

    /* JADX INFO: renamed from: b */
    public byte[] f60873b;

    /* JADX INFO: renamed from: c */
    public z60 f60874c;

    /* JADX INFO: renamed from: d */
    public int f60875d;

    public mf1(@efb OutputStream outputStream, @efb z60 z60Var) {
        this(outputStream, z60Var, 65536);
    }

    private void flushBuffer() throws IOException {
        int i = this.f60875d;
        if (i > 0) {
            this.f60872a.write(this.f60873b, 0, i);
            this.f60875d = 0;
        }
    }

    private void maybeFlushBuffer() throws IOException {
        if (this.f60875d == this.f60873b.length) {
            flushBuffer();
        }
    }

    private void release() {
        byte[] bArr = this.f60873b;
        if (bArr != null) {
            this.f60874c.put(bArr);
            this.f60873b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f60872a.close();
            release();
        } catch (Throwable th) {
            this.f60872a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        flushBuffer();
        this.f60872a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f60873b;
        int i2 = this.f60875d;
        this.f60875d = i2 + 1;
        bArr[i2] = (byte) i;
        maybeFlushBuffer();
    }

    @fdi
    public mf1(@efb OutputStream outputStream, z60 z60Var, int i) {
        this.f60872a = outputStream;
        this.f60874c = z60Var;
        this.f60873b = (byte[]) z60Var.get(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@efb byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@efb byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f60875d;
            if (i6 == 0 && i4 >= this.f60873b.length) {
                this.f60872a.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f60873b.length - i6);
            System.arraycopy(bArr, i5, this.f60873b, this.f60875d, iMin);
            this.f60875d += iMin;
            i3 += iMin;
            maybeFlushBuffer();
        } while (i3 < i2);
    }
}
