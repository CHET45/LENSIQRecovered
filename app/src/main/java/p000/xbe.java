package p000;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class xbe extends l41 {

    /* JADX INFO: renamed from: d */
    public static final String f97484d = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";

    /* JADX INFO: renamed from: e */
    public static final byte[] f97485e = f97484d.getBytes(eq8.f33838b);

    /* JADX INFO: renamed from: c */
    public final int f97486c;

    public xbe(int i) {
        t7d.checkArgument(i > 0, "roundingRadius must be greater than 0.");
        this.f97486c = i;
    }

    @Override // p000.eq8
    public boolean equals(Object obj) {
        return (obj instanceof xbe) && this.f97486c == ((xbe) obj).f97486c;
    }

    @Override // p000.eq8
    public int hashCode() {
        return v0i.hashCode(-569625254, v0i.hashCode(this.f97486c));
    }

    @Override // p000.l41
    public Bitmap transform(@efb e41 e41Var, @efb Bitmap bitmap, int i, int i2) {
        return eeh.roundedCorners(e41Var, bitmap, this.f97486c);
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(f97485e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f97486c).array());
    }
}
