package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public class cj1 implements drd {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f16682a;

    public cj1(ByteBuffer byteBuffer) {
        this.f16682a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // p000.rqd
    public byte[] data() {
        return this.f16682a.array();
    }

    @Override // p000.rqd
    public byte get(int i) {
        return this.f16682a.get(i);
    }

    @Override // p000.rqd
    public boolean getBoolean(int i) {
        return get(i) != 0;
    }

    @Override // p000.rqd
    public double getDouble(int i) {
        return this.f16682a.getDouble(i);
    }

    @Override // p000.rqd
    public float getFloat(int i) {
        return this.f16682a.getFloat(i);
    }

    @Override // p000.rqd
    public int getInt(int i) {
        return this.f16682a.getInt(i);
    }

    @Override // p000.rqd
    public long getLong(int i) {
        return this.f16682a.getLong(i);
    }

    @Override // p000.rqd
    public short getShort(int i) {
        return this.f16682a.getShort(i);
    }

    @Override // p000.rqd
    public String getString(int i, int i2) {
        return uzh.decodeUtf8Buffer(this.f16682a, i, i2);
    }

    @Override // p000.drd, p000.rqd
    public int limit() {
        return this.f16682a.limit();
    }

    @Override // p000.drd
    public void put(byte[] bArr, int i, int i2) {
        this.f16682a.put(bArr, i, i2);
    }

    @Override // p000.drd
    public void putBoolean(boolean z) {
        this.f16682a.put(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.drd
    public void putDouble(double d) {
        this.f16682a.putDouble(d);
    }

    @Override // p000.drd
    public void putFloat(float f) {
        this.f16682a.putFloat(f);
    }

    @Override // p000.drd
    public void putInt(int i) {
        this.f16682a.putInt(i);
    }

    @Override // p000.drd
    public void putLong(long j) {
        this.f16682a.putLong(j);
    }

    @Override // p000.drd
    public void putShort(short s) {
        this.f16682a.putShort(s);
    }

    @Override // p000.drd
    public boolean requestCapacity(int i) {
        return i <= this.f16682a.limit();
    }

    @Override // p000.drd
    public void set(int i, byte b) {
        requestCapacity(i + 1);
        this.f16682a.put(i, b);
    }

    @Override // p000.drd
    public void setBoolean(int i, boolean z) {
        set(i, z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.drd
    public void setDouble(int i, double d) {
        requestCapacity(i + 8);
        this.f16682a.putDouble(i, d);
    }

    @Override // p000.drd
    public void setFloat(int i, float f) {
        requestCapacity(i + 4);
        this.f16682a.putFloat(i, f);
    }

    @Override // p000.drd
    public void setInt(int i, int i2) {
        requestCapacity(i + 4);
        this.f16682a.putInt(i, i2);
    }

    @Override // p000.drd
    public void setLong(int i, long j) {
        requestCapacity(i + 8);
        this.f16682a.putLong(i, j);
    }

    @Override // p000.drd
    public void setShort(int i, short s) {
        requestCapacity(i + 2);
        this.f16682a.putShort(i, s);
    }

    @Override // p000.drd
    public int writePosition() {
        return this.f16682a.position();
    }

    @Override // p000.drd
    public void put(byte b) {
        this.f16682a.put(b);
    }

    @Override // p000.drd
    public void set(int i, byte[] bArr, int i2, int i3) {
        requestCapacity((i3 - i2) + i);
        int iPosition = this.f16682a.position();
        this.f16682a.position(i);
        this.f16682a.put(bArr, i2, i3);
        this.f16682a.position(iPosition);
    }
}
