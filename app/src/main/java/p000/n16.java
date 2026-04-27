package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class n16 extends l41 {

    /* JADX INFO: renamed from: c */
    public static final String f62946c = "com.bumptech.glide.load.resource.bitmap.FitCenter";

    /* JADX INFO: renamed from: d */
    public static final byte[] f62947d = f62946c.getBytes(eq8.f33838b);

    @Override // p000.eq8
    public boolean equals(Object obj) {
        return obj instanceof n16;
    }

    @Override // p000.eq8
    public int hashCode() {
        return 1572326941;
    }

    @Override // p000.l41
    public Bitmap transform(@efb e41 e41Var, @efb Bitmap bitmap, int i, int i2) {
        return eeh.fitCenter(e41Var, bitmap, i, i2);
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(f62947d);
    }
}
