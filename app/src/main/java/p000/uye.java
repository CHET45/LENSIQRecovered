package p000;

import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageSepiaToneFilter;

/* JADX INFO: loaded from: classes7.dex */
public class uye extends f27 {

    /* JADX INFO: renamed from: h */
    public static final int f89505h = 1;

    /* JADX INFO: renamed from: i */
    public static final String f89506i = "jp.wasabeef.glide.transformations.gpu.SepiaFilterTransformation.1";

    /* JADX INFO: renamed from: g */
    public final float f89507g;

    public uye() {
        this(1.0f);
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public boolean equals(Object o) {
        return o instanceof uye;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public int hashCode() {
        return 895516065 + ((int) (this.f89507g * 10.0f));
    }

    @Override // p000.f27
    public String toString() {
        return "SepiaFilterTransformation(intensity=" + this.f89507g + c0b.f15434d;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f89506i + this.f89507g).getBytes(eq8.f33838b));
    }

    public uye(float intensity) {
        super(new GPUImageSepiaToneFilter());
        this.f89507g = intensity;
        ((GPUImageSepiaToneFilter) getFilter()).setIntensity(intensity);
    }
}
