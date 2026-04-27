package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class b70 implements crd {

    /* JADX INFO: renamed from: a */
    public byte[] f12826a;

    /* JADX INFO: renamed from: b */
    public int f12827b;

    public b70() {
        this(10);
    }

    @Override // p000.qqd
    public byte[] data() {
        return this.f12826a;
    }

    @Override // p000.qqd
    public byte get(int i) {
        return this.f12826a[i];
    }

    @Override // p000.qqd
    public boolean getBoolean(int i) {
        return this.f12826a[i] != 0;
    }

    @Override // p000.qqd
    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    @Override // p000.qqd
    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    @Override // p000.qqd
    public int getInt(int i) {
        byte[] bArr = this.f12826a;
        return (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    @Override // p000.qqd
    public long getLong(int i) {
        byte[] bArr = this.f12826a;
        int i2 = i + 6;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i2]) & 255) << 48) | (((long) bArr[i + 7]) << 56);
    }

    @Override // p000.qqd
    public short getShort(int i) {
        byte[] bArr = this.f12826a;
        return (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
    }

    @Override // p000.qqd
    public String getString(int i, int i2) {
        return vzh.decodeUtf8Array(this.f12826a, i, i2);
    }

    @Override // p000.crd, p000.qqd
    public int limit() {
        return this.f12827b;
    }

    @Override // p000.crd
    public void put(byte[] bArr, int i, int i2) {
        set(this.f12827b, bArr, i, i2);
        this.f12827b += i2;
    }

    @Override // p000.crd
    public void putBoolean(boolean z) {
        setBoolean(this.f12827b, z);
        this.f12827b++;
    }

    @Override // p000.crd
    public void putDouble(double d) {
        setDouble(this.f12827b, d);
        this.f12827b += 8;
    }

    @Override // p000.crd
    public void putFloat(float f) {
        setFloat(this.f12827b, f);
        this.f12827b += 4;
    }

    @Override // p000.crd
    public void putInt(int i) {
        setInt(this.f12827b, i);
        this.f12827b += 4;
    }

    @Override // p000.crd
    public void putLong(long j) {
        setLong(this.f12827b, j);
        this.f12827b += 8;
    }

    @Override // p000.crd
    public void putShort(short s) {
        setShort(this.f12827b, s);
        this.f12827b += 2;
    }

    @Override // p000.crd
    public boolean requestCapacity(int i) {
        byte[] bArr = this.f12826a;
        if (bArr.length > i) {
            return true;
        }
        int length = bArr.length;
        this.f12826a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // p000.crd
    public void set(int i, byte b) {
        requestCapacity(i + 1);
        this.f12826a[i] = b;
    }

    @Override // p000.crd
    public void setBoolean(int i, boolean z) {
        set(i, z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.crd
    public void setDouble(int i, double d) {
        requestCapacity(i + 8);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i2 = (int) jDoubleToRawLongBits;
        byte[] bArr = this.f12826a;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
        int i3 = (int) (jDoubleToRawLongBits >> 32);
        bArr[i + 4] = (byte) (i3 & 255);
        bArr[i + 5] = (byte) ((i3 >> 8) & 255);
        bArr[i + 6] = (byte) ((i3 >> 16) & 255);
        bArr[i + 7] = (byte) ((i3 >> 24) & 255);
    }

    @Override // p000.crd
    public void setFloat(int i, float f) {
        requestCapacity(i + 4);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        byte[] bArr = this.f12826a;
        bArr[i] = (byte) (iFloatToRawIntBits & 255);
        bArr[i + 1] = (byte) ((iFloatToRawIntBits >> 8) & 255);
        bArr[i + 2] = (byte) ((iFloatToRawIntBits >> 16) & 255);
        bArr[i + 3] = (byte) ((iFloatToRawIntBits >> 24) & 255);
    }

    @Override // p000.crd
    public void setInt(int i, int i2) {
        requestCapacity(i + 4);
        byte[] bArr = this.f12826a;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    @Override // p000.crd
    public void setLong(int i, long j) {
        requestCapacity(i + 8);
        int i2 = (int) j;
        byte[] bArr = this.f12826a;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
        int i3 = (int) (j >> 32);
        bArr[i + 4] = (byte) (i3 & 255);
        bArr[i + 5] = (byte) ((i3 >> 8) & 255);
        bArr[i + 6] = (byte) ((i3 >> 16) & 255);
        bArr[i + 7] = (byte) ((i3 >> 24) & 255);
    }

    @Override // p000.crd
    public void setShort(int i, short s) {
        requestCapacity(i + 2);
        byte[] bArr = this.f12826a;
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    @Override // p000.crd
    public int writePosition() {
        return this.f12827b;
    }

    public b70(int i) {
        this(new byte[i]);
    }

    public b70(byte[] bArr) {
        this.f12826a = bArr;
        this.f12827b = 0;
    }

    @Override // p000.crd
    public void put(byte b) {
        set(this.f12827b, b);
        this.f12827b++;
    }

    @Override // p000.crd
    public void set(int i, byte[] bArr, int i2, int i3) {
        requestCapacity((i3 - i2) + i);
        System.arraycopy(bArr, i2, this.f12826a, i, i3);
    }

    public b70(byte[] bArr, int i) {
        this.f12826a = bArr;
        this.f12827b = i;
    }
}
