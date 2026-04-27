package p000;

import java.io.IOException;

/* JADX INFO: renamed from: xi */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C15111xi implements fh3 {

    /* JADX INFO: renamed from: a */
    public final fh3 f97905a;

    /* JADX INFO: renamed from: b */
    public final byte[] f97906b;

    /* JADX INFO: renamed from: c */
    @hib
    public final byte[] f97907c;

    /* JADX INFO: renamed from: d */
    @hib
    public C1916bj f97908d;

    public C15111xi(byte[] bArr, fh3 fh3Var) {
        this(bArr, fh3Var, null);
    }

    @Override // p000.fh3
    public void close() throws IOException {
        this.f97908d = null;
        this.f97905a.close();
    }

    @Override // p000.fh3
    public void open(yh3 yh3Var) throws IOException {
        this.f97905a.open(yh3Var);
        this.f97908d = new C1916bj(1, this.f97906b, yh3Var.f101493i, yh3Var.f101491g + yh3Var.f101486b);
    }

    @Override // p000.fh3
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f97907c == null) {
            ((C1916bj) x0i.castNonNull(this.f97908d)).updateInPlace(bArr, i, i2);
            this.f97905a.write(bArr, i, i2);
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            int iMin = Math.min(i2 - i3, this.f97907c.length);
            ((C1916bj) x0i.castNonNull(this.f97908d)).update(bArr, i + i3, iMin, this.f97907c, 0);
            this.f97905a.write(this.f97907c, 0, iMin);
            i3 += iMin;
        }
    }

    public C15111xi(byte[] bArr, fh3 fh3Var, @hib byte[] bArr2) {
        this.f97905a = fh3Var;
        this.f97906b = bArr;
        this.f97907c = bArr2;
    }
}
