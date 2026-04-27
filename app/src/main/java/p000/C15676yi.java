package p000;

import java.io.IOException;

/* JADX INFO: renamed from: yi */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C15676yi implements eh3 {

    /* JADX INFO: renamed from: a */
    public final eh3 f101672a;

    /* JADX INFO: renamed from: b */
    public final byte[] f101673b;

    /* JADX INFO: renamed from: c */
    @hib
    public final byte[] f101674c;

    /* JADX INFO: renamed from: d */
    @hib
    public C2326cj f101675d;

    public C15676yi(byte[] bArr, eh3 eh3Var) {
        this(bArr, eh3Var, null);
    }

    @Override // p000.eh3
    public void close() throws IOException {
        this.f101675d = null;
        this.f101672a.close();
    }

    @Override // p000.eh3
    public void open(xh3 xh3Var) throws IOException {
        this.f101672a.open(xh3Var);
        this.f101675d = new C2326cj(1, this.f101673b, xh3Var.f97808i, xh3Var.f97806g + xh3Var.f97801b);
    }

    @Override // p000.eh3
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f101674c == null) {
            ((C2326cj) t0i.castNonNull(this.f101675d)).updateInPlace(bArr, i, i2);
            this.f101672a.write(bArr, i, i2);
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            int iMin = Math.min(i2 - i3, this.f101674c.length);
            ((C2326cj) t0i.castNonNull(this.f101675d)).update(bArr, i + i3, iMin, this.f101674c, 0);
            this.f101672a.write(this.f101674c, 0, iMin);
            i3 += iMin;
        }
    }

    public C15676yi(byte[] bArr, eh3 eh3Var, @hib byte[] bArr2) {
        this.f101672a = eh3Var;
        this.f101673b = bArr;
        this.f101674c = bArr2;
    }
}
