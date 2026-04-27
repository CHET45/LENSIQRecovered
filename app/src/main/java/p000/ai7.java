package p000;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@w01
public final class ai7 extends FilterOutputStream {

    /* JADX INFO: renamed from: a */
    public final wh7 f1646a;

    public ai7(lh7 hashFunction, OutputStream out) {
        super((OutputStream) v7d.checkNotNull(out));
        this.f1646a = (wh7) v7d.checkNotNull(hashFunction.newHasher());
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    public jh7 hash() {
        return this.f1646a.hash();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int b) throws IOException {
        this.f1646a.putByte((byte) b);
        ((FilterOutputStream) this).out.write(b);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bytes, int off, int len) throws IOException {
        this.f1646a.putBytes(bytes, off, len);
        ((FilterOutputStream) this).out.write(bytes, off, len);
    }
}
