package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class di1 implements fh3 {

    /* JADX INFO: renamed from: a */
    public ByteArrayOutputStream f29687a;

    @Override // p000.fh3
    public void close() throws IOException {
        ((ByteArrayOutputStream) x0i.castNonNull(this.f29687a)).close();
    }

    @hib
    public byte[] getData() {
        ByteArrayOutputStream byteArrayOutputStream = this.f29687a;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // p000.fh3
    public void open(yh3 yh3Var) {
        long j = yh3Var.f101492h;
        if (j == -1) {
            this.f29687a = new ByteArrayOutputStream();
        } else {
            u80.checkArgument(j <= 2147483647L);
            this.f29687a = new ByteArrayOutputStream((int) yh3Var.f101492h);
        }
    }

    @Override // p000.fh3
    public void write(byte[] bArr, int i, int i2) {
        ((ByteArrayOutputStream) x0i.castNonNull(this.f29687a)).write(bArr, i, i2);
    }
}
