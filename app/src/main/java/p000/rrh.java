package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class rrh extends OutputStream {

    /* JADX INFO: renamed from: a */
    @yfb
    public final FileOutputStream f79173a;

    public rrh(@yfb FileOutputStream fileOutputStream) {
        md8.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.f79173a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f79173a.flush();
    }

    @yfb
    public final FileOutputStream getFileOutputStream() {
        return this.f79173a;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f79173a.write(i);
    }

    @Override // java.io.OutputStream
    public void write(@yfb byte[] bArr) throws IOException {
        md8.checkNotNullParameter(bArr, "b");
        this.f79173a.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(@yfb byte[] bArr, int i, int i2) throws IOException {
        md8.checkNotNullParameter(bArr, "bytes");
        this.f79173a.write(bArr, i, i2);
    }
}
