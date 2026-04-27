package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class mt1 extends l41 {

    /* JADX INFO: renamed from: c */
    public static final String f62063c = "com.bumptech.glide.load.resource.bitmap.CenterCrop";

    /* JADX INFO: renamed from: d */
    public static final byte[] f62064d = f62063c.getBytes(eq8.f33838b);

    @Override // p000.eq8
    public boolean equals(Object obj) {
        return obj instanceof mt1;
    }

    @Override // p000.eq8
    public int hashCode() {
        return -599754482;
    }

    @Override // p000.l41
    public Bitmap transform(@efb e41 e41Var, @efb Bitmap bitmap, int i, int i2) {
        return eeh.centerCrop(e41Var, bitmap, i, i2);
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(f62064d);
    }
}
