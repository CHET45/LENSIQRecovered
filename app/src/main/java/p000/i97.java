package p000;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class i97 extends l41 {

    /* JADX INFO: renamed from: g */
    public static final String f46133g = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";

    /* JADX INFO: renamed from: h */
    public static final byte[] f46134h = f46133g.getBytes(eq8.f33838b);

    /* JADX INFO: renamed from: c */
    public final float f46135c;

    /* JADX INFO: renamed from: d */
    public final float f46136d;

    /* JADX INFO: renamed from: e */
    public final float f46137e;

    /* JADX INFO: renamed from: f */
    public final float f46138f;

    public i97(float f, float f2, float f3, float f4) {
        this.f46135c = f;
        this.f46136d = f2;
        this.f46137e = f3;
        this.f46138f = f4;
    }

    @Override // p000.eq8
    public boolean equals(Object obj) {
        if (!(obj instanceof i97)) {
            return false;
        }
        i97 i97Var = (i97) obj;
        return this.f46135c == i97Var.f46135c && this.f46136d == i97Var.f46136d && this.f46137e == i97Var.f46137e && this.f46138f == i97Var.f46138f;
    }

    @Override // p000.eq8
    public int hashCode() {
        return v0i.hashCode(this.f46138f, v0i.hashCode(this.f46137e, v0i.hashCode(this.f46136d, v0i.hashCode(-2013597734, v0i.hashCode(this.f46135c)))));
    }

    @Override // p000.l41
    public Bitmap transform(@efb e41 e41Var, @efb Bitmap bitmap, int i, int i2) {
        return eeh.roundedCorners(e41Var, bitmap, this.f46135c, this.f46136d, this.f46137e, this.f46138f);
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(f46134h);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f46135c).putFloat(this.f46136d).putFloat(this.f46137e).putFloat(this.f46138f).array());
    }
}
