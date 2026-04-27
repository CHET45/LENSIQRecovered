package p000;

import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.filter.GPUImagePixelationFilter;

/* JADX INFO: loaded from: classes7.dex */
public class bwc extends f27 {

    /* JADX INFO: renamed from: h */
    public static final int f15113h = 1;

    /* JADX INFO: renamed from: i */
    public static final String f15114i = "jp.wasabeef.glide.transformations.gpu.PixelationFilterTransformation.1";

    /* JADX INFO: renamed from: g */
    public final float f15115g;

    public bwc() {
        this(10.0f);
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public boolean equals(Object o) {
        return o instanceof bwc;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public int hashCode() {
        return 1525023660 + ((int) (this.f15115g * 10.0f));
    }

    @Override // p000.f27
    public String toString() {
        return "PixelationFilterTransformation(pixel=" + this.f15115g + c0b.f15434d;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f15114i + this.f15115g).getBytes(eq8.f33838b));
    }

    public bwc(float pixel) {
        super(new GPUImagePixelationFilter());
        this.f15115g = pixel;
        ((GPUImagePixelationFilter) getFilter()).setPixel(pixel);
    }
}
