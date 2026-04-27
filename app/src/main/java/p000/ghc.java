package p000;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ghc {

    /* JADX INFO: renamed from: a */
    public byte[] f39834a;

    /* JADX INFO: renamed from: b */
    public int f39835b;

    /* JADX INFO: renamed from: c */
    public int f39836c;

    /* JADX INFO: renamed from: d */
    public int f39837d;

    public ghc() {
        this.f39834a = x0i.f95983f;
    }

    private void assertValidOffset() {
        int i;
        int i2 = this.f39835b;
        u80.checkState(i2 >= 0 && (i2 < (i = this.f39837d) || (i2 == i && this.f39836c == 0)));
    }

    public int bitsLeft() {
        return ((this.f39837d - this.f39835b) * 8) - this.f39836c;
    }

    public void byteAlign() {
        if (this.f39836c == 0) {
            return;
        }
        this.f39836c = 0;
        this.f39835b++;
        assertValidOffset();
    }

    public int getBytePosition() {
        u80.checkState(this.f39836c == 0);
        return this.f39835b;
    }

    public int getPosition() {
        return (this.f39835b * 8) + this.f39836c;
    }

    public void putInt(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int iMin = Math.min(8 - this.f39836c, i2);
        int i3 = this.f39836c;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.f39834a;
        int i5 = this.f39835b;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = i2 - iMin;
        bArr[i5] = (byte) (b | ((i >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f39834a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f39834a;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | b2);
        skipBits(i2);
        assertValidOffset();
    }

    public boolean readBit() {
        boolean z = (this.f39834a[this.f39835b] & (128 >> this.f39836c)) != 0;
        skipBit();
        return z;
    }

    public int readBits(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f39836c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f39836c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f39836c = i4;
            byte[] bArr = this.f39834a;
            int i5 = this.f39835b;
            this.f39835b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f39834a;
        int i6 = this.f39835b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f39836c = 0;
            this.f39835b = i6 + 1;
        }
        assertValidOffset();
        return i7;
    }

    public long readBitsToLong(int i) {
        return i <= 32 ? x0i.toUnsignedLong(readBits(i)) : x0i.toLong(readBits(i - 32), readBits(32));
    }

    public void readBytes(byte[] bArr, int i, int i2) {
        u80.checkState(this.f39836c == 0);
        System.arraycopy(this.f39834a, this.f39835b, bArr, i, i2);
        this.f39835b += i2;
        assertValidOffset();
    }

    public String readBytesAsString(int i) {
        return readBytesAsString(i, yw1.f103176c);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void setPosition(int i) {
        int i2 = i / 8;
        this.f39835b = i2;
        this.f39836c = i - (i2 * 8);
        assertValidOffset();
    }

    public void skipBit() {
        int i = this.f39836c + 1;
        this.f39836c = i;
        if (i == 8) {
            this.f39836c = 0;
            this.f39835b++;
        }
        assertValidOffset();
    }

    public void skipBits(int i) {
        int i2 = i / 8;
        int i3 = this.f39835b + i2;
        this.f39835b = i3;
        int i4 = this.f39836c + (i - (i2 * 8));
        this.f39836c = i4;
        if (i4 > 7) {
            this.f39835b = i3 + 1;
            this.f39836c = i4 - 8;
        }
        assertValidOffset();
    }

    public void skipBytes(int i) {
        u80.checkState(this.f39836c == 0);
        this.f39835b += i;
        assertValidOffset();
    }

    public String readBytesAsString(int i, Charset charset) {
        byte[] bArr = new byte[i];
        readBytes(bArr, 0, i);
        return new String(bArr, charset);
    }

    public void reset(ihc ihcVar) {
        reset(ihcVar.getData(), ihcVar.limit());
        setPosition(ihcVar.getPosition() * 8);
    }

    public ghc(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public ghc(byte[] bArr, int i) {
        this.f39834a = bArr;
        this.f39837d = i;
    }

    public void reset(byte[] bArr, int i) {
        this.f39834a = bArr;
        this.f39835b = 0;
        this.f39836c = 0;
        this.f39837d = i;
    }

    public void readBits(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f39834a;
            int i4 = this.f39835b;
            int i5 = i4 + 1;
            this.f39835b = i5;
            byte b = bArr2[i4];
            int i6 = this.f39836c;
            byte b2 = (byte) (b << i6);
            bArr[i] = b2;
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i7));
        bArr[i3] = b3;
        int i8 = this.f39836c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f39834a;
            int i9 = this.f39835b;
            this.f39835b = i9 + 1;
            bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f39836c = i8 - 8;
        }
        int i10 = this.f39836c + i7;
        this.f39836c = i10;
        byte[] bArr4 = this.f39834a;
        int i11 = this.f39835b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
        if (i10 == 8) {
            this.f39836c = 0;
            this.f39835b = i11 + 1;
        }
        assertValidOffset();
    }
}
