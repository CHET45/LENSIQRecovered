package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l8b {

    /* JADX INFO: renamed from: a */
    public final int f56775a;

    /* JADX INFO: renamed from: b */
    public boolean f56776b;

    /* JADX INFO: renamed from: c */
    public boolean f56777c;

    /* JADX INFO: renamed from: d */
    public byte[] f56778d;

    /* JADX INFO: renamed from: e */
    public int f56779e;

    public l8b(int i, int i2) {
        this.f56775a = i;
        byte[] bArr = new byte[i2 + 3];
        this.f56778d = bArr;
        bArr[2] = 1;
    }

    public void appendToNalUnit(byte[] bArr, int i, int i2) {
        if (this.f56776b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f56778d;
            int length = bArr2.length;
            int i4 = this.f56779e;
            if (length < i4 + i3) {
                this.f56778d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f56778d, this.f56779e, i3);
            this.f56779e += i3;
        }
    }

    public boolean endNalUnit(int i) {
        if (!this.f56776b) {
            return false;
        }
        this.f56779e -= i;
        this.f56776b = false;
        this.f56777c = true;
        return true;
    }

    public boolean isCompleted() {
        return this.f56777c;
    }

    public void reset() {
        this.f56776b = false;
        this.f56777c = false;
    }

    public void startNalUnit(int i) {
        u80.checkState(!this.f56776b);
        boolean z = i == this.f56775a;
        this.f56776b = z;
        if (z) {
            this.f56779e = 3;
            this.f56777c = false;
        }
    }
}
