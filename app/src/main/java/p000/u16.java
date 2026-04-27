package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class u16 extends l41 {

    /* JADX INFO: renamed from: c */
    public static final String f86544c = "com.watchfun.transphoto.manager.phototrans.FitXYTransformation";

    /* JADX INFO: renamed from: d */
    public static final byte[] f86545d = f86544c.getBytes(eq8.f33838b);

    @Override // p000.eq8
    public boolean equals(Object obj) {
        return obj instanceof u16;
    }

    @Override // p000.eq8
    public int hashCode() {
        return 1389685975;
    }

    @Override // p000.l41
    public Bitmap transform(e41 e41Var, Bitmap bitmap, int i, int i2) {
        return Bitmap.createScaledBitmap(bitmap, i, i2, false);
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f86545d);
    }
}
