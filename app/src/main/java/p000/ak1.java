package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class ak1 extends uu0 {
    public ak1 __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 1, byteBuffer);
        return this;
    }

    public byte get(int i) {
        return this.f89147bb.get(__element(i));
    }

    public int getAsUnsigned(int i) {
        return get(i) & 255;
    }
}
