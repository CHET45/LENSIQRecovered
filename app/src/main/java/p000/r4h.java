package p000;

import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageToonFilter;

/* JADX INFO: loaded from: classes7.dex */
public class r4h extends f27 {

    /* JADX INFO: renamed from: i */
    public static final int f77033i = 1;

    /* JADX INFO: renamed from: j */
    public static final String f77034j = "jp.wasabeef.glide.transformations.gpu.ToonFilterTransformation.1";

    /* JADX INFO: renamed from: g */
    public final float f77035g;

    /* JADX INFO: renamed from: h */
    public final float f77036h;

    public r4h() {
        this(0.2f, 10.0f);
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public boolean equals(Object o) {
        if (o instanceof r4h) {
            r4h r4hVar = (r4h) o;
            if (r4hVar.f77035g == this.f77035g && r4hVar.f77036h == this.f77036h) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public int hashCode() {
        return 1209810327 + ((int) (this.f77035g * 1000.0f)) + ((int) (this.f77036h * 10.0f));
    }

    @Override // p000.f27
    public String toString() {
        return "ToonFilterTransformation(threshold=" + this.f77035g + ",quantizationLevels=" + this.f77036h + c0b.f15434d;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f77034j + this.f77035g + this.f77036h).getBytes(eq8.f33838b));
    }

    public r4h(float threshold, float quantizationLevels) {
        super(new GPUImageToonFilter());
        this.f77035g = threshold;
        this.f77036h = quantizationLevels;
        GPUImageToonFilter gPUImageToonFilter = (GPUImageToonFilter) getFilter();
        gPUImageToonFilter.setThreshold(threshold);
        gPUImageToonFilter.setQuantizationLevels(quantizationLevels);
    }
}
