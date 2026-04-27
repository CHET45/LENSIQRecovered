package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class nag {

    /* JADX INFO: renamed from: a */
    public int f63817a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f63818b;

    public void __reset() {
        m17833a(0, null);
    }

    /* JADX INFO: renamed from: a */
    public void m17833a(int i, ByteBuffer byteBuffer) {
        this.f63818b = byteBuffer;
        if (byteBuffer != null) {
            this.f63817a = i;
        } else {
            this.f63817a = 0;
        }
    }
}
