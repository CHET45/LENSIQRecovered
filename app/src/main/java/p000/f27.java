package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.GPUImage;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageFilter;

/* JADX INFO: loaded from: classes7.dex */
public class f27 extends k41 {

    /* JADX INFO: renamed from: d */
    public static final int f34875d = 1;

    /* JADX INFO: renamed from: e */
    public static final String f34876e = "jp.wasabeef.glide.transformations.gpu.GPUFilterTransformation.1";

    /* JADX INFO: renamed from: f */
    public static final byte[] f34877f = f34876e.getBytes(eq8.f33838b);

    /* JADX INFO: renamed from: c */
    public final GPUImageFilter f34878c;

    public f27(GPUImageFilter filter) {
        this.f34878c = filter;
    }

    @Override // p000.k41
    /* JADX INFO: renamed from: b */
    public Bitmap mo255b(@efb Context context, @efb e41 pool, @efb Bitmap toTransform, int outWidth, int outHeight) {
        GPUImage gPUImage = new GPUImage(context);
        gPUImage.setImage(toTransform);
        gPUImage.setFilter(this.f34878c);
        return gPUImage.getBitmapWithFilterApplied();
    }

    @Override // p000.k41, p000.eq8
    public boolean equals(Object o) {
        return o instanceof f27;
    }

    public <T> T getFilter() {
        return (T) this.f34878c;
    }

    @Override // p000.k41, p000.eq8
    public int hashCode() {
        return 1751294359;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    @Override // p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(f34877f);
    }
}
