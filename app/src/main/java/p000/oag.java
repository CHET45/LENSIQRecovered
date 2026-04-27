package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class oag {

    /* JADX INFO: renamed from: a */
    public int f67008a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f67009b;

    public void __reset() {
        m18547a(0, null);
    }

    /* JADX INFO: renamed from: a */
    public void m18547a(int i, ByteBuffer byteBuffer) {
        this.f67009b = byteBuffer;
        if (byteBuffer != null) {
            this.f67008a = i;
        } else {
            this.f67008a = 0;
        }
    }
}
