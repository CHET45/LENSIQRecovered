package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class w83 extends k41 {

    /* JADX INFO: renamed from: d */
    public static final int f93571d = 1;

    /* JADX INFO: renamed from: e */
    public static final String f93572e = "jp.wasabeef.glide.transformations.CropSquareTransformation.1";

    /* JADX INFO: renamed from: c */
    public int f93573c;

    @Override // p000.k41
    /* JADX INFO: renamed from: b */
    public Bitmap mo255b(@efb Context context, @efb e41 pool, @efb Bitmap toTransform, int outWidth, int outHeight) {
        int iMax = Math.max(outWidth, outHeight);
        this.f93573c = iMax;
        return eeh.centerCrop(pool, toTransform, iMax, iMax);
    }

    @Override // p000.k41, p000.eq8
    public boolean equals(Object o) {
        return (o instanceof w83) && ((w83) o).f93573c == this.f93573c;
    }

    @Override // p000.k41, p000.eq8
    public int hashCode() {
        return (-789843280) + (this.f93573c * 10);
    }

    public String toString() {
        return "CropSquareTransformation(size=" + this.f93573c + c0b.f15434d;
    }

    @Override // p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f93572e + this.f93573c).getBytes(eq8.f33838b));
    }
}
