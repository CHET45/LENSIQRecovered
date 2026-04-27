package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: i0 */
/* JADX INFO: loaded from: classes5.dex */
@xx4
public abstract class AbstractC7092i0 extends AbstractC12390s1 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f45334a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @op1
    private wh7 update(int bytes) {
        try {
            mo12586d(this.f45334a.array(), 0, bytes);
            return this;
        } finally {
            ji8.m14104a(this.f45334a);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo12584a(byte b);

    /* JADX INFO: renamed from: b */
    public void mo12585b(ByteBuffer b) {
        if (b.hasArray()) {
            mo12586d(b.array(), b.arrayOffset() + b.position(), b.remaining());
            ji8.m14107d(b, b.limit());
        } else {
            for (int iRemaining = b.remaining(); iRemaining > 0; iRemaining--) {
                mo12584a(b.get());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo12679c(byte[] b) {
        mo12586d(b, 0, b.length);
    }

    /* JADX INFO: renamed from: d */
    public void mo12586d(byte[] b, int off, int len) {
        for (int i = off; i < off + len; i++) {
            mo12584a(b[i]);
        }
    }

    @Override // p000.wh7, p000.obd
    @op1
    public wh7 putByte(byte b) {
        mo12584a(b);
        return this;
    }

    @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
    @op1
    public wh7 putChar(char c) {
        this.f45334a.putChar(c);
        return update(2);
    }

    @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
    @op1
    public wh7 putInt(int i) {
        this.f45334a.putInt(i);
        return update(4);
    }

    @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
    @op1
    public wh7 putLong(long l) {
        this.f45334a.putLong(l);
        return update(8);
    }

    @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
    @op1
    public wh7 putShort(short s) {
        this.f45334a.putShort(s);
        return update(2);
    }

    @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
    @op1
    public wh7 putBytes(byte[] bytes) {
        v7d.checkNotNull(bytes);
        mo12679c(bytes);
        return this;
    }

    @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
    @op1
    public wh7 putBytes(byte[] bytes, int off, int len) {
        v7d.checkPositionIndexes(off, off + len, bytes.length);
        mo12586d(bytes, off, len);
        return this;
    }

    @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
    @op1
    public wh7 putBytes(ByteBuffer bytes) {
        mo12585b(bytes);
        return this;
    }
}
