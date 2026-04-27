package p000;

import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageContrastFilter;

/* JADX INFO: loaded from: classes7.dex */
public class nz2 extends f27 {

    /* JADX INFO: renamed from: h */
    public static final int f66108h = 1;

    /* JADX INFO: renamed from: i */
    public static final String f66109i = "jp.wasabeef.glide.transformations.gpu.ContrastFilterTransformation.1";

    /* JADX INFO: renamed from: g */
    public final float f66110g;

    public nz2() {
        this(1.0f);
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public boolean equals(Object o) {
        return o instanceof nz2;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public int hashCode() {
        return (-306633601) + ((int) (this.f66110g * 10.0f));
    }

    @Override // p000.f27
    public String toString() {
        return "ContrastFilterTransformation(contrast=" + this.f66110g + c0b.f15434d;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f66109i + this.f66110g).getBytes(eq8.f33838b));
    }

    public nz2(float contrast) {
        super(new GPUImageContrastFilter());
        this.f66110g = contrast;
        ((GPUImageContrastFilter) getFilter()).setContrast(contrast);
    }
}
