package p000;

import okio.Buffer;

/* JADX INFO: loaded from: classes7.dex */
public class h1c implements tri {

    /* JADX INFO: renamed from: a */
    public final Buffer f41998a;

    /* JADX INFO: renamed from: b */
    public int f41999b;

    /* JADX INFO: renamed from: c */
    public int f42000c;

    public h1c(Buffer buffer, int i) {
        this.f41998a = buffer;
        this.f41999b = i;
    }

    /* JADX INFO: renamed from: a */
    public Buffer m12075a() {
        return this.f41998a;
    }

    @Override // p000.tri
    public int readableBytes() {
        return this.f42000c;
    }

    @Override // p000.tri
    public void release() {
    }

    @Override // p000.tri
    public int writableBytes() {
        return this.f41999b;
    }

    @Override // p000.tri
    public void write(byte[] bArr, int i, int i2) {
        this.f41998a.write(bArr, i, i2);
        this.f41999b -= i2;
        this.f42000c += i2;
    }

    @Override // p000.tri
    public void write(byte b) {
        this.f41998a.writeByte((int) b);
        this.f41999b--;
        this.f42000c++;
    }
}
