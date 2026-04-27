package p000;

import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageKuwaharaFilter;

/* JADX INFO: loaded from: classes7.dex */
public class at8 extends f27 {

    /* JADX INFO: renamed from: h */
    public static final int f11836h = 1;

    /* JADX INFO: renamed from: i */
    public static final String f11837i = "jp.wasabeef.glide.transformations.gpu.KuwaharaFilterTransformation.1";

    /* JADX INFO: renamed from: g */
    public final int f11838g;

    public at8() {
        this(25);
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public boolean equals(Object o) {
        return o instanceof at8;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public int hashCode() {
        return (-1859800423) + (this.f11838g * 10);
    }

    @Override // p000.f27
    public String toString() {
        return "KuwaharaFilterTransformation(radius=" + this.f11838g + c0b.f15434d;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f11837i + this.f11838g).getBytes(eq8.f33838b));
    }

    public at8(int radius) {
        super(new GPUImageKuwaharaFilter());
        this.f11838g = radius;
        ((GPUImageKuwaharaFilter) getFilter()).setRadius(radius);
    }
}
