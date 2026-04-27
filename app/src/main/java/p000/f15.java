package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
@xg5
public final class f15 extends OutputStream {

    /* JADX INFO: renamed from: a */
    @yfb
    public final OutputStream f34654a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final bq0 f34655b;

    /* JADX INFO: renamed from: c */
    public boolean f34656c;

    /* JADX INFO: renamed from: d */
    public int f34657d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final byte[] f34658e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final byte[] f34659f;

    /* JADX INFO: renamed from: m */
    public int f34660m;

    public f15(@yfb OutputStream outputStream, @yfb bq0 bq0Var) {
        md8.checkNotNullParameter(outputStream, "output");
        md8.checkNotNullParameter(bq0Var, "base64");
        this.f34654a = outputStream;
        this.f34655b = bq0Var;
        this.f34657d = bq0Var.isMimeScheme$kotlin_stdlib() ? 76 : -1;
        this.f34658e = new byte[1024];
        this.f34659f = new byte[3];
    }

    private final void checkOpen() throws IOException {
        if (this.f34656c) {
            throw new IOException("The output stream is closed.");
        }
    }

    private final int copyIntoByteBuffer(byte[] bArr, int i, int i2) {
        int iMin = Math.min(3 - this.f34660m, i2 - i);
        u70.copyInto(bArr, this.f34659f, this.f34660m, i, i + iMin);
        int i3 = this.f34660m + iMin;
        this.f34660m = i3;
        if (i3 == 3) {
            encodeByteBufferIntoOutput();
        }
        return iMin;
    }

    private final void encodeByteBufferIntoOutput() {
        if (encodeIntoOutput(this.f34659f, 0, this.f34660m) != 4) {
            throw new IllegalStateException("Check failed.");
        }
        this.f34660m = 0;
    }

    private final int encodeIntoOutput(byte[] bArr, int i, int i2) throws IOException {
        int iEncodeIntoByteArray = this.f34655b.encodeIntoByteArray(bArr, this.f34658e, 0, i, i2);
        if (this.f34657d == 0) {
            this.f34654a.write(bq0.f14453d.getMimeLineSeparatorSymbols$kotlin_stdlib());
            this.f34657d = 76;
            if (iEncodeIntoByteArray > 76) {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.f34654a.write(this.f34658e, 0, iEncodeIntoByteArray);
        this.f34657d -= iEncodeIntoByteArray;
        return iEncodeIntoByteArray;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f34656c) {
            return;
        }
        this.f34656c = true;
        if (this.f34660m != 0) {
            encodeByteBufferIntoOutput();
        }
        this.f34654a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        checkOpen();
        this.f34654a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        checkOpen();
        byte[] bArr = this.f34659f;
        int i2 = this.f34660m;
        int i3 = i2 + 1;
        this.f34660m = i3;
        bArr[i2] = (byte) i;
        if (i3 == 3) {
            encodeByteBufferIntoOutput();
        }
    }

    @Override // java.io.OutputStream
    public void write(@yfb byte[] bArr, int i, int i2) throws IOException {
        int i3;
        md8.checkNotNullParameter(bArr, "source");
        checkOpen();
        if (i < 0 || i2 < 0 || (i3 = i + i2) > bArr.length) {
            throw new IndexOutOfBoundsException("offset: " + i + ", length: " + i2 + ", source size: " + bArr.length);
        }
        if (i2 == 0) {
            return;
        }
        int i4 = this.f34660m;
        if (i4 < 3) {
            if (i4 != 0) {
                i += copyIntoByteBuffer(bArr, i, i3);
                if (this.f34660m != 0) {
                    return;
                }
            }
            while (i + 3 <= i3) {
                int iMin = Math.min((this.f34655b.isMimeScheme$kotlin_stdlib() ? this.f34657d : this.f34658e.length) / 4, (i3 - i) / 3);
                int i5 = (iMin * 3) + i;
                if (encodeIntoOutput(bArr, i, i5) != iMin * 4) {
                    throw new IllegalStateException("Check failed.");
                }
                i = i5;
            }
            u70.copyInto(bArr, this.f34659f, 0, i, i3);
            this.f34660m = i3 - i;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
