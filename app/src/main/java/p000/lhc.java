package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class lhc {

    /* JADX INFO: renamed from: a */
    public byte[] f57628a;

    /* JADX INFO: renamed from: b */
    public int f57629b;

    /* JADX INFO: renamed from: c */
    public int f57630c;

    /* JADX INFO: renamed from: d */
    public int f57631d;

    public lhc(byte[] bArr, int i, int i2) {
        reset(bArr, i, i2);
    }

    private void assertValidOffset() {
        int i;
        int i2 = this.f57630c;
        v80.checkState(i2 >= 0 && (i2 < (i = this.f57629b) || (i2 == i && this.f57631d == 0)));
    }

    private int readExpGolombCodeNum() {
        int i = 0;
        while (!readBit()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? readBits(i) : 0);
    }

    private boolean shouldSkipByte(int i) {
        if (2 <= i && i < this.f57629b) {
            byte[] bArr = this.f57628a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void byteAlign() {
        int i = this.f57631d;
        if (i > 0) {
            skipBits(8 - i);
        }
    }

    public boolean canReadBits(int i) {
        int i2 = this.f57630c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f57631d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f57629b) {
                break;
            }
            if (shouldSkipByte(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f57629b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public boolean canReadExpGolombCodedNum() {
        int i = this.f57630c;
        int i2 = this.f57631d;
        int i3 = 0;
        while (this.f57630c < this.f57629b && !readBit()) {
            i3++;
        }
        boolean z = this.f57630c == this.f57629b;
        this.f57630c = i;
        this.f57631d = i2;
        return !z && canReadBits((i3 * 2) + 1);
    }

    public boolean readBit() {
        boolean z = (this.f57628a[this.f57630c] & (128 >> this.f57631d)) != 0;
        skipBit();
        return z;
    }

    public int readBits(int i) {
        int i2;
        this.f57631d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f57631d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f57631d = i4;
            byte[] bArr = this.f57628a;
            int i5 = this.f57630c;
            i3 |= (bArr[i5] & 255) << i4;
            if (!shouldSkipByte(i5 + 1)) {
                i = 1;
            }
            this.f57630c = i5 + i;
        }
        byte[] bArr2 = this.f57628a;
        int i6 = this.f57630c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f57631d = 0;
            this.f57630c = i6 + (shouldSkipByte(i6 + 1) ? 2 : 1);
        }
        assertValidOffset();
        return i7;
    }

    public int readSignedExpGolombCodedInt() {
        int expGolombCodeNum = readExpGolombCodeNum();
        return (expGolombCodeNum % 2 == 0 ? -1 : 1) * ((expGolombCodeNum + 1) / 2);
    }

    public int readUnsignedExpGolombCodedInt() {
        return readExpGolombCodeNum();
    }

    public void reset(byte[] bArr, int i, int i2) {
        this.f57628a = bArr;
        this.f57630c = i;
        this.f57629b = i2;
        this.f57631d = 0;
        assertValidOffset();
    }

    public void skipBit() {
        int i = this.f57631d + 1;
        this.f57631d = i;
        if (i == 8) {
            this.f57631d = 0;
            int i2 = this.f57630c;
            this.f57630c = i2 + (shouldSkipByte(i2 + 1) ? 2 : 1);
        }
        assertValidOffset();
    }

    public void skipBits(int i) {
        int i2 = this.f57630c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f57630c = i4;
        int i5 = this.f57631d + (i - (i3 * 8));
        this.f57631d = i5;
        if (i5 > 7) {
            this.f57630c = i4 + 1;
            this.f57631d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f57630c) {
                assertValidOffset();
                return;
            } else if (shouldSkipByte(i2)) {
                this.f57630c++;
                i2 += 2;
            }
        }
    }
}
