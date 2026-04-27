package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class jgi {

    /* JADX INFO: renamed from: a */
    public final byte[] f50503a;

    /* JADX INFO: renamed from: b */
    public final int f50504b;

    /* JADX INFO: renamed from: c */
    public int f50505c;

    /* JADX INFO: renamed from: d */
    public int f50506d;

    public jgi(byte[] bArr) {
        this.f50503a = bArr;
        this.f50504b = bArr.length;
    }

    private void assertValidOffset() {
        int i;
        int i2 = this.f50505c;
        v80.checkState(i2 >= 0 && (i2 < (i = this.f50504b) || (i2 == i && this.f50506d == 0)));
    }

    public int bitsLeft() {
        return ((this.f50504b - this.f50505c) * 8) - this.f50506d;
    }

    public int getPosition() {
        return (this.f50505c * 8) + this.f50506d;
    }

    public boolean readBit() {
        boolean z = (((this.f50503a[this.f50505c] & 255) >> this.f50506d) & 1) == 1;
        skipBits(1);
        return z;
    }

    public int readBits(int i) {
        int i2 = this.f50505c;
        int iMin = Math.min(i, 8 - this.f50506d);
        int i3 = i2 + 1;
        int i4 = ((this.f50503a[i2] & 255) >> this.f50506d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (this.f50503a[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        skipBits(i);
        return i5;
    }

    public void reset() {
        this.f50505c = 0;
        this.f50506d = 0;
    }

    public void setPosition(int i) {
        int i2 = i / 8;
        this.f50505c = i2;
        this.f50506d = i - (i2 * 8);
        assertValidOffset();
    }

    public void skipBits(int i) {
        int i2 = i / 8;
        int i3 = this.f50505c + i2;
        this.f50505c = i3;
        int i4 = this.f50506d + (i - (i2 * 8));
        this.f50506d = i4;
        if (i4 > 7) {
            this.f50505c = i3 + 1;
            this.f50506d = i4 - 8;
        }
        assertValidOffset();
    }
}
