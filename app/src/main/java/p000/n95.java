package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes3.dex */
public final class n95 extends FilterInputStream {

    /* JADX INFO: renamed from: c */
    public static final int f63739c = 2;

    /* JADX INFO: renamed from: d */
    public static final byte[] f63740d;

    /* JADX INFO: renamed from: e */
    public static final int f63741e;

    /* JADX INFO: renamed from: f */
    public static final int f63742f;

    /* JADX INFO: renamed from: a */
    public final byte f63743a;

    /* JADX INFO: renamed from: b */
    public int f63744b;

    static {
        byte[] bArr = {-1, k95.f52888C7, 0, 28, BuiltinOptions.BidirectionalSequenceLSTMOptions, 120, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CumsumOptions, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f63740d = bArr;
        int length = bArr.length;
        f63741e = length;
        f63742f = length + 2;
    }

    public n95(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.f63743a = (byte) i;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        int i2 = this.f63744b;
        int i3 = (i2 < 2 || i2 > (i = f63742f)) ? super.read() : i2 == i ? this.f63743a : f63740d[i2 - 2] & 255;
        if (i3 != -1) {
            this.f63744b++;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f63744b = (int) (((long) this.f63744b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@efb byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f63744b;
        int i5 = f63742f;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f63743a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f63740d, this.f63744b - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f63744b += i3;
        }
        return i3;
    }
}
