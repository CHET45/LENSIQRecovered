package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class y78 extends uu0 {
    public y78 __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 4, byteBuffer);
        return this;
    }

    public int get(int i) {
        return this.f89147bb.getInt(__element(i));
    }

    public long getAsUnsigned(int i) {
        return ((long) get(i)) & 4294967295L;
    }
}
