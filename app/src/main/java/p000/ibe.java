package p000;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class ibe extends l41 {

    /* JADX INFO: renamed from: d */
    public static final String f46468d = "com.bumptech.glide.load.resource.bitmap.Rotate";

    /* JADX INFO: renamed from: e */
    public static final byte[] f46469e = f46468d.getBytes(eq8.f33838b);

    /* JADX INFO: renamed from: c */
    public final int f46470c;

    public ibe(int i) {
        this.f46470c = i;
    }

    @Override // p000.eq8
    public boolean equals(Object obj) {
        return (obj instanceof ibe) && this.f46470c == ((ibe) obj).f46470c;
    }

    @Override // p000.eq8
    public int hashCode() {
        return v0i.hashCode(-950519196, v0i.hashCode(this.f46470c));
    }

    @Override // p000.l41
    public Bitmap transform(@efb e41 e41Var, @efb Bitmap bitmap, int i, int i2) {
        return eeh.rotateImage(bitmap, this.f46470c);
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(f46469e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f46470c).array());
    }
}
