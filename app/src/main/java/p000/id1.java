package p000;

import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageBrightnessFilter;

/* JADX INFO: loaded from: classes7.dex */
public class id1 extends f27 {

    /* JADX INFO: renamed from: h */
    public static final int f46526h = 1;

    /* JADX INFO: renamed from: i */
    public static final String f46527i = "jp.wasabeef.glide.transformations.gpu.BrightnessFilterTransformation.1";

    /* JADX INFO: renamed from: g */
    public final float f46528g;

    public id1() {
        this(0.0f);
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public boolean equals(Object o) {
        return (o instanceof id1) && ((id1) o).f46528g == this.f46528g;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public int hashCode() {
        return (-1311211954) + ((int) ((this.f46528g + 1.0f) * 10.0f));
    }

    @Override // p000.f27
    public String toString() {
        return "BrightnessFilterTransformation(brightness=" + this.f46528g + c0b.f15434d;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f46527i + this.f46528g).getBytes(eq8.f33838b));
    }

    public id1(float brightness) {
        super(new GPUImageBrightnessFilter());
        this.f46528g = brightness;
        ((GPUImageBrightnessFilter) getFilter()).setBrightness(brightness);
    }
}
