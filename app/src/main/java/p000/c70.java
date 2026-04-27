package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class c70 implements drd {

    /* JADX INFO: renamed from: a */
    public byte[] f15888a;

    /* JADX INFO: renamed from: b */
    public int f15889b;

    public c70() {
        this(10);
    }

    @Override // p000.rqd
    public byte[] data() {
        return this.f15888a;
    }

    @Override // p000.rqd
    public byte get(int i) {
        return this.f15888a[i];
    }

    @Override // p000.rqd
    public boolean getBoolean(int i) {
        return this.f15888a[i] != 0;
    }

    @Override // p000.rqd
    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    @Override // p000.rqd
    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    @Override // p000.rqd
    public int getInt(int i) {
        byte[] bArr = this.f15888a;
        return (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    @Override // p000.rqd
    public long getLong(int i) {
        byte[] bArr = this.f15888a;
        int i2 = i + 6;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i2]) & 255) << 48) | (((long) bArr[i + 7]) << 56);
    }

    @Override // p000.rqd
    public short getShort(int i) {
        byte[] bArr = this.f15888a;
        return (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
    }

    @Override // p000.rqd
    public String getString(int i, int i2) {
        return uzh.decodeUtf8Array(this.f15888a, i, i2);
    }

    @Override // p000.drd, p000.rqd
    public int limit() {
        return this.f15889b;
    }

    @Override // p000.drd
    public void put(byte[] bArr, int i, int i2) {
        set(this.f15889b, bArr, i, i2);
        this.f15889b += i2;
    }

    @Override // p000.drd
    public void putBoolean(boolean z) {
        setBoolean(this.f15889b, z);
        this.f15889b++;
    }

    @Override // p000.drd
    public void putDouble(double d) {
        setDouble(this.f15889b, d);
        this.f15889b += 8;
    }

    @Override // p000.drd
    public void putFloat(float f) {
        setFloat(this.f15889b, f);
        this.f15889b += 4;
    }

    @Override // p000.drd
    public void putInt(int i) {
        setInt(this.f15889b, i);
        this.f15889b += 4;
    }

    @Override // p000.drd
    public void putLong(long j) {
        setLong(this.f15889b, j);
        this.f15889b += 8;
    }

    @Override // p000.drd
    public void putShort(short s) {
        setShort(this.f15889b, s);
        this.f15889b += 2;
    }

    @Override // p000.drd
    public boolean requestCapacity(int i) {
        byte[] bArr = this.f15888a;
        if (bArr.length > i) {
            return true;
        }
        int length = bArr.length;
        this.f15888a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // p000.drd
    public void set(int i, byte b) {
        requestCapacity(i + 1);
        this.f15888a[i] = b;
    }

    @Override // p000.drd
    public void setBoolean(int i, boolean z) {
        set(i, z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.drd
    public void setDouble(int i, double d) {
        requestCapacity(i + 8);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i2 = (int) jDoubleToRawLongBits;
        byte[] bArr = this.f15888a;
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

    @Override // p000.drd
    public void setFloat(int i, float f) {
        requestCapacity(i + 4);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        byte[] bArr = this.f15888a;
        bArr[i] = (byte) (iFloatToRawIntBits & 255);
        bArr[i + 1] = (byte) ((iFloatToRawIntBits >> 8) & 255);
        bArr[i + 2] = (byte) ((iFloatToRawIntBits >> 16) & 255);
        bArr[i + 3] = (byte) ((iFloatToRawIntBits >> 24) & 255);
    }

    @Override // p000.drd
    public void setInt(int i, int i2) {
        requestCapacity(i + 4);
        byte[] bArr = this.f15888a;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    @Override // p000.drd
    public void setLong(int i, long j) {
        requestCapacity(i + 8);
        int i2 = (int) j;
        byte[] bArr = this.f15888a;
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

    @Override // p000.drd
    public void setShort(int i, short s) {
        requestCapacity(i + 2);
        byte[] bArr = this.f15888a;
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    @Override // p000.drd
    public int writePosition() {
        return this.f15889b;
    }

    public c70(int i) {
        this(new byte[i]);
    }

    public c70(byte[] bArr) {
        this.f15888a = bArr;
        this.f15889b = 0;
    }

    @Override // p000.drd
    public void put(byte b) {
        set(this.f15889b, b);
        this.f15889b++;
    }

    @Override // p000.drd
    public void set(int i, byte[] bArr, int i2, int i3) {
        requestCapacity((i3 - i2) + i);
        System.arraycopy(bArr, i2, this.f15888a, i, i3);
    }

    public c70(byte[] bArr, int i) {
        this.f15888a = bArr;
        this.f15889b = i;
    }
}
