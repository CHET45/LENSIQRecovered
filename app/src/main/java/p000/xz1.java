package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class xz1 extends l41 {

    /* JADX INFO: renamed from: c */
    public static final int f99769c = 1;

    /* JADX INFO: renamed from: d */
    public static final String f99770d = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";

    /* JADX INFO: renamed from: e */
    public static final byte[] f99771e = f99770d.getBytes(eq8.f33838b);

    @Override // p000.eq8
    public boolean equals(Object obj) {
        return obj instanceof xz1;
    }

    @Override // p000.eq8
    public int hashCode() {
        return 1101716364;
    }

    @Override // p000.l41
    public Bitmap transform(@efb e41 e41Var, @efb Bitmap bitmap, int i, int i2) {
        return eeh.circleCrop(e41Var, bitmap, i, i2);
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(f99771e);
    }
}
