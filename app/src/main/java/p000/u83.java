package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class u83 extends k41 {

    /* JADX INFO: renamed from: c */
    public static final int f87036c = 1;

    /* JADX INFO: renamed from: d */
    public static final String f87037d = "jp.wasabeef.glide.transformations.CropCircleTransformation.1";

    @Override // p000.k41
    /* JADX INFO: renamed from: b */
    public Bitmap mo255b(@efb Context context, @efb e41 pool, @efb Bitmap toTransform, int outWidth, int outHeight) {
        return eeh.circleCrop(pool, toTransform, outWidth, outHeight);
    }

    @Override // p000.k41, p000.eq8
    public boolean equals(Object o) {
        return o instanceof u83;
    }

    @Override // p000.k41, p000.eq8
    public int hashCode() {
        return 1288474723;
    }

    public String toString() {
        return "CropCircleTransformation()";
    }

    @Override // p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(f87037d.getBytes(eq8.f33838b));
    }
}
