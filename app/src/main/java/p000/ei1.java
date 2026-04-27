package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ei1 implements eh3 {

    /* JADX INFO: renamed from: a */
    public ByteArrayOutputStream f33062a;

    @Override // p000.eh3
    public void close() throws IOException {
        ((ByteArrayOutputStream) t0i.castNonNull(this.f33062a)).close();
    }

    @hib
    public byte[] getData() {
        ByteArrayOutputStream byteArrayOutputStream = this.f33062a;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // p000.eh3
    public void open(xh3 xh3Var) {
        long j = xh3Var.f97807h;
        if (j == -1) {
            this.f33062a = new ByteArrayOutputStream();
        } else {
            v80.checkArgument(j <= 2147483647L);
            this.f33062a = new ByteArrayOutputStream((int) xh3Var.f97807h);
        }
    }

    @Override // p000.eh3
    public void write(byte[] bArr, int i, int i2) {
        ((ByteArrayOutputStream) t0i.castNonNull(this.f33062a)).write(bArr, i, i2);
    }
}
