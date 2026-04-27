package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class khc {

    /* JADX INFO: renamed from: a */
    public byte[] f54146a;

    /* JADX INFO: renamed from: b */
    public int f54147b;

    /* JADX INFO: renamed from: c */
    public int f54148c;

    /* JADX INFO: renamed from: d */
    public int f54149d;

    public khc(byte[] bArr, int i, int i2) {
        reset(bArr, i, i2);
    }

    private void assertValidOffset() {
        int i;
        int i2 = this.f54148c;
        u80.checkState(i2 >= 0 && (i2 < (i = this.f54147b) || (i2 == i && this.f54149d == 0)));
    }

    private int readExpGolombCodeNum() {
        int i = 0;
        while (!readBit()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? readBits(i) : 0);
    }

    private boolean shouldSkipByte(int i) {
        if (2 <= i && i < this.f54147b) {
            byte[] bArr = this.f54146a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean canReadBits(int i) {
        int i2 = this.f54148c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f54149d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f54147b) {
                break;
            }
            if (shouldSkipByte(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f54147b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public boolean canReadExpGolombCodedNum() {
        int i = this.f54148c;
        int i2 = this.f54149d;
        int i3 = 0;
        while (this.f54148c < this.f54147b && !readBit()) {
            i3++;
        }
        boolean z = this.f54148c == this.f54147b;
        this.f54148c = i;
        this.f54149d = i2;
        return !z && canReadBits((i3 * 2) + 1);
    }

    public boolean readBit() {
        boolean z = (this.f54146a[this.f54148c] & (128 >> this.f54149d)) != 0;
        skipBit();
        return z;
    }

    public int readBits(int i) {
        int i2;
        this.f54149d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f54149d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f54149d = i4;
            byte[] bArr = this.f54146a;
            int i5 = this.f54148c;
            i3 |= (bArr[i5] & 255) << i4;
            if (!shouldSkipByte(i5 + 1)) {
                i = 1;
            }
            this.f54148c = i5 + i;
        }
        byte[] bArr2 = this.f54146a;
        int i6 = this.f54148c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f54149d = 0;
            this.f54148c = i6 + (shouldSkipByte(i6 + 1) ? 2 : 1);
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
        this.f54146a = bArr;
        this.f54148c = i;
        this.f54147b = i2;
        this.f54149d = 0;
        assertValidOffset();
    }

    public void skipBit() {
        int i = this.f54149d + 1;
        this.f54149d = i;
        if (i == 8) {
            this.f54149d = 0;
            int i2 = this.f54148c;
            this.f54148c = i2 + (shouldSkipByte(i2 + 1) ? 2 : 1);
        }
        assertValidOffset();
    }

    public void skipBits(int i) {
        int i2 = this.f54148c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f54148c = i4;
        int i5 = this.f54149d + (i - (i3 * 8));
        this.f54149d = i5;
        if (i5 > 7) {
            this.f54148c = i4 + 1;
            this.f54149d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f54148c) {
                assertValidOffset();
                return;
            } else if (shouldSkipByte(i2)) {
                this.f54148c++;
                i2 += 2;
            }
        }
    }
}
