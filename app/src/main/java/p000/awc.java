package p000;

/* JADX INFO: loaded from: classes.dex */
public final class awc {

    /* JADX INFO: renamed from: a */
    @yfb
    public final int[] f12033a;

    /* JADX INFO: renamed from: b */
    public final int f12034b;

    /* JADX INFO: renamed from: c */
    public final int f12035c;

    /* JADX INFO: renamed from: d */
    public final int f12036d;

    /* JADX INFO: renamed from: e */
    public final int f12037e;

    public awc(@yfb int[] iArr, int i, int i2, int i3, int i4) {
        this.f12033a = iArr;
        this.f12034b = i;
        this.f12035c = i2;
        this.f12036d = i3;
        this.f12037e = i4;
    }

    /* JADX INFO: renamed from: get-WaAFU9c, reason: not valid java name */
    public final long m27902getWaAFU9c(@h78(from = 0) int i, @h78(from = 0) int i2) {
        return j92.Color(this.f12033a[this.f12036d + (i2 * this.f12037e) + i]);
    }

    @yfb
    public final int[] getBuffer() {
        return this.f12033a;
    }

    public final int getBufferOffset() {
        return this.f12036d;
    }

    public final int getHeight() {
        return this.f12035c;
    }

    public final int getStride() {
        return this.f12037e;
    }

    public final int getWidth() {
        return this.f12034b;
    }
}
