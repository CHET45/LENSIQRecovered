package p000;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class vu0 {

    /* JADX INFO: renamed from: a */
    public int f92263a;

    /* JADX INFO: renamed from: b */
    public int f92264b;

    /* JADX INFO: renamed from: c */
    public int f92265c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f92266d;

    /* JADX INFO: renamed from: a */
    public int m24199a(int i) {
        return this.f92263a + (i * this.f92265c);
    }

    /* JADX INFO: renamed from: b */
    public void m24200b(int i, int i2, ByteBuffer byteBuffer) {
        this.f92266d = byteBuffer;
        if (byteBuffer != null) {
            this.f92263a = i;
            this.f92264b = byteBuffer.getInt(i - 4);
            this.f92265c = i2;
        } else {
            this.f92263a = 0;
            this.f92264b = 0;
            this.f92265c = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m24201c() {
        return this.f92263a;
    }

    public int length() {
        return this.f92264b;
    }

    public void reset() {
        m24200b(0, 0, null);
    }
}
