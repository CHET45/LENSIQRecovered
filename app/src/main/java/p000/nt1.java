package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class nt1 extends l41 {

    /* JADX INFO: renamed from: c */
    public static final String f65554c = "com.bumptech.glide.load.resource.bitmap.CenterInside";

    /* JADX INFO: renamed from: d */
    public static final byte[] f65555d = f65554c.getBytes(eq8.f33838b);

    @Override // p000.eq8
    public boolean equals(Object obj) {
        return obj instanceof nt1;
    }

    @Override // p000.eq8
    public int hashCode() {
        return -670243078;
    }

    @Override // p000.l41
    public Bitmap transform(@efb e41 e41Var, @efb Bitmap bitmap, int i, int i2) {
        return eeh.centerInside(e41Var, bitmap, i, i2);
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(f65555d);
    }
}
