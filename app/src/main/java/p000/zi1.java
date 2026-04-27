package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class zi1 extends InputStream {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f105120a;

    public zi1(ByteBuffer byteBuffer) {
        this.f105120a = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f105120a.remaining();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f105120a.hasRemaining()) {
            return this.f105120a.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(@efb byte[] bArr, int i, int i2) throws IOException {
        if (!this.f105120a.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, this.f105120a.remaining());
        this.f105120a.get(bArr, i, iMin);
        return iMin;
    }
}
