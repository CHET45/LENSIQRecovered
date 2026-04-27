package p000;

import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageSketchFilter;

/* JADX INFO: loaded from: classes7.dex */
public class lqf extends f27 {

    /* JADX INFO: renamed from: g */
    public static final int f58477g = 1;

    /* JADX INFO: renamed from: h */
    public static final String f58478h = "jp.wasabeef.glide.transformations.gpu.SketchFilterTransformation.1";

    public lqf() {
        super(new GPUImageSketchFilter());
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public boolean equals(Object o) {
        return o instanceof lqf;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public int hashCode() {
        return -1790215191;
    }

    @Override // p000.f27
    public String toString() {
        return "SketchFilterTransformation()";
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(f58478h.getBytes(eq8.f33838b));
    }
}
