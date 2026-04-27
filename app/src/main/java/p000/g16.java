package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class g16 extends ys0 {

    /* JADX INFO: renamed from: c */
    public int f38216c;

    /* JADX INFO: renamed from: d */
    public int f38217d;

    public g16() {
    }

    public int getNextUpdateBlockLen() {
        return this.f38217d;
    }

    public int getNextUpdateBlockOffsetAddr() {
        return this.f38216c;
    }

    @Override // p000.ys0, p000.eq7
    public byte[] getParamData() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(pk1.intToBigBytes(this.f38216c));
        byteBufferAllocate.put(pk1.int2byte2(this.f38217d));
        return byteBufferAllocate.array();
    }

    public g16 setNextUpdateBlockLen(int i) {
        this.f38217d = i;
        return this;
    }

    public g16 setNextUpdateBlockOffsetAddr(int i) {
        this.f38216c = i;
        return this;
    }

    @Override // p000.ys0
    public String toString() {
        return "FirmwareUpdateBlockParam{nextUpdateBlockOffsetAddr=" + this.f38216c + ", nextUpdateBlockLen=" + this.f38217d + '}';
    }

    public g16(int i, int i2) {
        setNextUpdateBlockOffsetAddr(i).setNextUpdateBlockLen(i2);
    }
}
