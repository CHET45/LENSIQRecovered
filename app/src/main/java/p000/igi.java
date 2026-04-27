package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class igi {

    /* JADX INFO: renamed from: a */
    public final byte[] f46981a;

    /* JADX INFO: renamed from: b */
    public final int f46982b;

    /* JADX INFO: renamed from: c */
    public int f46983c;

    /* JADX INFO: renamed from: d */
    public int f46984d;

    public igi(byte[] bArr) {
        this.f46981a = bArr;
        this.f46982b = bArr.length;
    }

    private void assertValidOffset() {
        int i;
        int i2 = this.f46983c;
        u80.checkState(i2 >= 0 && (i2 < (i = this.f46982b) || (i2 == i && this.f46984d == 0)));
    }

    public int bitsLeft() {
        return ((this.f46982b - this.f46983c) * 8) - this.f46984d;
    }

    public int getPosition() {
        return (this.f46983c * 8) + this.f46984d;
    }

    public boolean readBit() {
        boolean z = (((this.f46981a[this.f46983c] & 255) >> this.f46984d) & 1) == 1;
        skipBits(1);
        return z;
    }

    public int readBits(int i) {
        int i2 = this.f46983c;
        int iMin = Math.min(i, 8 - this.f46984d);
        int i3 = i2 + 1;
        int i4 = ((this.f46981a[i2] & 255) >> this.f46984d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (this.f46981a[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        skipBits(i);
        return i5;
    }

    public void reset() {
        this.f46983c = 0;
        this.f46984d = 0;
    }

    public void setPosition(int i) {
        int i2 = i / 8;
        this.f46983c = i2;
        this.f46984d = i - (i2 * 8);
        assertValidOffset();
    }

    public void skipBits(int i) {
        int i2 = i / 8;
        int i3 = this.f46983c + i2;
        this.f46983c = i3;
        int i4 = this.f46984d + (i - (i2 * 8));
        this.f46984d = i4;
        if (i4 > 7) {
            this.f46983c = i3 + 1;
            this.f46984d = i4 - 8;
        }
        assertValidOffset();
    }
}
