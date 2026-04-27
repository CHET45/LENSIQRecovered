package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class z78 extends vu0 {
    public z78 __assign(int i, ByteBuffer byteBuffer) {
        m24200b(i, 4, byteBuffer);
        return this;
    }

    public int get(int i) {
        return this.f92266d.getInt(m24199a(i));
    }

    public long getAsUnsigned(int i) {
        return ((long) get(i)) & 4294967295L;
    }
}
