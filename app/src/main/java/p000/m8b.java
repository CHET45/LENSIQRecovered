package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class m8b {

    /* JADX INFO: renamed from: a */
    public final int f60189a;

    /* JADX INFO: renamed from: b */
    public boolean f60190b;

    /* JADX INFO: renamed from: c */
    public boolean f60191c;

    /* JADX INFO: renamed from: d */
    public byte[] f60192d;

    /* JADX INFO: renamed from: e */
    public int f60193e;

    public m8b(int i, int i2) {
        this.f60189a = i;
        byte[] bArr = new byte[i2 + 3];
        this.f60192d = bArr;
        bArr[2] = 1;
    }

    public void appendToNalUnit(byte[] bArr, int i, int i2) {
        if (this.f60190b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f60192d;
            int length = bArr2.length;
            int i4 = this.f60193e;
            if (length < i4 + i3) {
                this.f60192d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f60192d, this.f60193e, i3);
            this.f60193e += i3;
        }
    }

    public boolean endNalUnit(int i) {
        if (!this.f60190b) {
            return false;
        }
        this.f60193e -= i;
        this.f60190b = false;
        this.f60191c = true;
        return true;
    }

    public boolean isCompleted() {
        return this.f60191c;
    }

    public void reset() {
        this.f60190b = false;
        this.f60191c = false;
    }

    public void startNalUnit(int i) {
        v80.checkState(!this.f60190b);
        boolean z = i == this.f60189a;
        this.f60190b = z;
        if (z) {
            this.f60193e = 3;
            this.f60191c = false;
        }
    }
}
