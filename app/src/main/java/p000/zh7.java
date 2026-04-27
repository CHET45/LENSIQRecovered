package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@w01
public final class zh7 extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final wh7 f105086a;

    public zh7(lh7 hashFunction, InputStream in) {
        super((InputStream) v7d.checkNotNull(in));
        this.f105086a = (wh7) v7d.checkNotNull(hashFunction.newHasher());
    }

    public jh7 hash() {
        return this.f105086a.hash();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int readlimit) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @op1
    public int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f105086a.putByte((byte) i);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @op1
    public int read(byte[] bytes, int off, int len) throws IOException {
        int i = ((FilterInputStream) this).in.read(bytes, off, len);
        if (i != -1) {
            this.f105086a.putBytes(bytes, off, i);
        }
        return i;
    }
}
