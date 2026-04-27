package p000;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
@zx1
@ovh
public final class hhc {

    /* JADX INFO: renamed from: a */
    public byte[] f43646a;

    /* JADX INFO: renamed from: b */
    public int f43647b;

    /* JADX INFO: renamed from: c */
    public int f43648c;

    /* JADX INFO: renamed from: d */
    public int f43649d;

    public hhc() {
        this.f43646a = t0i.f83321f;
    }

    private void assertValidOffset() {
        int i;
        int i2 = this.f43647b;
        v80.checkState(i2 >= 0 && (i2 < (i = this.f43649d) || (i2 == i && this.f43648c == 0)));
    }

    public int bitsLeft() {
        return ((this.f43649d - this.f43647b) * 8) - this.f43648c;
    }

    public void byteAlign() {
        if (this.f43648c == 0) {
            return;
        }
        this.f43648c = 0;
        this.f43647b++;
        assertValidOffset();
    }

    public int getBytePosition() {
        v80.checkState(this.f43648c == 0);
        return this.f43647b;
    }

    public int getPosition() {
        return (this.f43647b * 8) + this.f43648c;
    }

    public void putInt(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int iMin = Math.min(8 - this.f43648c, i2);
        int i3 = this.f43648c;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.f43646a;
        int i5 = this.f43647b;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = i2 - iMin;
        bArr[i5] = (byte) (b | ((i >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f43646a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f43646a;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | b2);
        skipBits(i2);
        assertValidOffset();
    }

    public boolean readBit() {
        boolean z = (this.f43646a[this.f43647b] & (128 >> this.f43648c)) != 0;
        skipBit();
        return z;
    }

    public int readBits(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f43648c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f43648c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f43648c = i4;
            byte[] bArr = this.f43646a;
            int i5 = this.f43647b;
            this.f43647b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f43646a;
        int i6 = this.f43647b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f43648c = 0;
            this.f43647b = i6 + 1;
        }
        assertValidOffset();
        return i7;
    }

    public long readBitsToLong(int i) {
        return i <= 32 ? t0i.toUnsignedLong(readBits(i)) : t0i.toLong(readBits(i - 32), readBits(32));
    }

    public void readBytes(byte[] bArr, int i, int i2) {
        v80.checkState(this.f43648c == 0);
        System.arraycopy(this.f43646a, this.f43647b, bArr, i, i2);
        this.f43647b += i2;
        assertValidOffset();
    }

    public String readBytesAsString(int i) {
        return readBytesAsString(i, StandardCharsets.UTF_8);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void setPosition(int i) {
        int i2 = i / 8;
        this.f43647b = i2;
        this.f43648c = i - (i2 * 8);
        assertValidOffset();
    }

    public void skipBit() {
        int i = this.f43648c + 1;
        this.f43648c = i;
        if (i == 8) {
            this.f43648c = 0;
            this.f43647b++;
        }
        assertValidOffset();
    }

    public void skipBits(int i) {
        int i2 = i / 8;
        int i3 = this.f43647b + i2;
        this.f43647b = i3;
        int i4 = this.f43648c + (i - (i2 * 8));
        this.f43648c = i4;
        if (i4 > 7) {
            this.f43647b = i3 + 1;
            this.f43648c = i4 - 8;
        }
        assertValidOffset();
    }

    public void skipBytes(int i) {
        v80.checkState(this.f43648c == 0);
        this.f43647b += i;
        assertValidOffset();
    }

    public String readBytesAsString(int i, Charset charset) {
        byte[] bArr = new byte[i];
        readBytes(bArr, 0, i);
        return new String(bArr, charset);
    }

    public void reset(jhc jhcVar) {
        reset(jhcVar.getData(), jhcVar.limit());
        setPosition(jhcVar.getPosition() * 8);
    }

    public hhc(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public hhc(byte[] bArr, int i) {
        this.f43646a = bArr;
        this.f43649d = i;
    }

    public void reset(byte[] bArr, int i) {
        this.f43646a = bArr;
        this.f43647b = 0;
        this.f43648c = 0;
        this.f43649d = i;
    }

    public void readBits(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f43646a;
            int i4 = this.f43647b;
            int i5 = i4 + 1;
            this.f43647b = i5;
            byte b = bArr2[i4];
            int i6 = this.f43648c;
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
        int i8 = this.f43648c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f43646a;
            int i9 = this.f43647b;
            this.f43647b = i9 + 1;
            bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f43648c = i8 - 8;
        }
        int i10 = this.f43648c + i7;
        this.f43648c = i10;
        byte[] bArr4 = this.f43646a;
        int i11 = this.f43647b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
        if (i10 == 8) {
            this.f43648c = 0;
            this.f43647b = i11 + 1;
        }
        assertValidOffset();
    }
}
