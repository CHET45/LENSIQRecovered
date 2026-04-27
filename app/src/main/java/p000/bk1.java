package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class bk1 extends vu0 {
    public bk1 __assign(int i, ByteBuffer byteBuffer) {
        m24200b(i, 1, byteBuffer);
        return this;
    }

    public byte get(int i) {
        return this.f92266d.get(m24199a(i));
    }

    public int getAsUnsigned(int i) {
        return get(i) & 255;
    }
}
