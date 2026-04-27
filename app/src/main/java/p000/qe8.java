package p000;

import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageColorInvertFilter;

/* JADX INFO: loaded from: classes7.dex */
public class qe8 extends f27 {

    /* JADX INFO: renamed from: g */
    public static final int f74226g = 1;

    /* JADX INFO: renamed from: h */
    public static final String f74227h = "jp.wasabeef.glide.transformations.gpu.InvertFilterTransformation.1";

    public qe8() {
        super(new GPUImageColorInvertFilter());
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public boolean equals(Object o) {
        return o instanceof qe8;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public int hashCode() {
        return 2014901395;
    }

    @Override // p000.f27
    public String toString() {
        return "InvertFilterTransformation()";
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(f74227h.getBytes(eq8.f33838b));
    }
}
