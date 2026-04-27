package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class xaf extends uu0 {
    public xaf __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 2, byteBuffer);
        return this;
    }

    public short get(int i) {
        return this.f89147bb.getShort(__element(i));
    }

    public int getAsUnsigned(int i) {
        return get(i) & iqh.f48007d;
    }
}
