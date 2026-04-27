package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class yaf extends vu0 {
    public yaf __assign(int i, ByteBuffer byteBuffer) {
        m24200b(i, 2, byteBuffer);
        return this;
    }

    public short get(int i) {
        return this.f92266d.getShort(m24199a(i));
    }

    public int getAsUnsigned(int i) {
        return get(i) & iqh.f48007d;
    }
}
