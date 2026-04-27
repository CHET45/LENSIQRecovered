package p000;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class d49 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public long f28394a = 0;

    /* JADX INFO: renamed from: a */
    public long m8879a() {
        return this.f28394a;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f28394a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f28394a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@efb byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.f28394a += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
