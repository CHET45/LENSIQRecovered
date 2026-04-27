package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class bj1 implements crd {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f13853a;

    public bj1(ByteBuffer byteBuffer) {
        this.f13853a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // p000.qqd
    public byte[] data() {
        return this.f13853a.array();
    }

    @Override // p000.qqd
    public byte get(int i) {
        return this.f13853a.get(i);
    }

    @Override // p000.qqd
    public boolean getBoolean(int i) {
        return get(i) != 0;
    }

    @Override // p000.qqd
    public double getDouble(int i) {
        return this.f13853a.getDouble(i);
    }

    @Override // p000.qqd
    public float getFloat(int i) {
        return this.f13853a.getFloat(i);
    }

    @Override // p000.qqd
    public int getInt(int i) {
        return this.f13853a.getInt(i);
    }

    @Override // p000.qqd
    public long getLong(int i) {
        return this.f13853a.getLong(i);
    }

    @Override // p000.qqd
    public short getShort(int i) {
        return this.f13853a.getShort(i);
    }

    @Override // p000.qqd
    public String getString(int i, int i2) {
        return vzh.decodeUtf8Buffer(this.f13853a, i, i2);
    }

    @Override // p000.crd, p000.qqd
    public int limit() {
        return this.f13853a.limit();
    }

    @Override // p000.crd
    public void put(byte[] bArr, int i, int i2) {
        this.f13853a.put(bArr, i, i2);
    }

    @Override // p000.crd
    public void putBoolean(boolean z) {
        this.f13853a.put(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.crd
    public void putDouble(double d) {
        this.f13853a.putDouble(d);
    }

    @Override // p000.crd
    public void putFloat(float f) {
        this.f13853a.putFloat(f);
    }

    @Override // p000.crd
    public void putInt(int i) {
        this.f13853a.putInt(i);
    }

    @Override // p000.crd
    public void putLong(long j) {
        this.f13853a.putLong(j);
    }

    @Override // p000.crd
    public void putShort(short s) {
        this.f13853a.putShort(s);
    }

    @Override // p000.crd
    public boolean requestCapacity(int i) {
        return i <= this.f13853a.limit();
    }

    @Override // p000.crd
    public void set(int i, byte b) {
        requestCapacity(i + 1);
        this.f13853a.put(i, b);
    }

    @Override // p000.crd
    public void setBoolean(int i, boolean z) {
        set(i, z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.crd
    public void setDouble(int i, double d) {
        requestCapacity(i + 8);
        this.f13853a.putDouble(i, d);
    }

    @Override // p000.crd
    public void setFloat(int i, float f) {
        requestCapacity(i + 4);
        this.f13853a.putFloat(i, f);
    }

    @Override // p000.crd
    public void setInt(int i, int i2) {
        requestCapacity(i + 4);
        this.f13853a.putInt(i, i2);
    }

    @Override // p000.crd
    public void setLong(int i, long j) {
        requestCapacity(i + 8);
        this.f13853a.putLong(i, j);
    }

    @Override // p000.crd
    public void setShort(int i, short s) {
        requestCapacity(i + 2);
        this.f13853a.putShort(i, s);
    }

    @Override // p000.crd
    public int writePosition() {
        return this.f13853a.position();
    }

    @Override // p000.crd
    public void put(byte b) {
        this.f13853a.put(b);
    }

    @Override // p000.crd
    public void set(int i, byte[] bArr, int i2, int i3) {
        requestCapacity((i3 - i2) + i);
        int iPosition = this.f13853a.position();
        this.f13853a.position(i);
        this.f13853a.put(bArr, i2, i3);
        this.f13853a.position(iPosition);
    }
}
