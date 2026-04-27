package p000;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: renamed from: wu */
/* JADX INFO: loaded from: classes4.dex */
public final class C14797wu implements eq8 {

    /* JADX INFO: renamed from: c */
    public final int f95509c;

    /* JADX INFO: renamed from: d */
    public final eq8 f95510d;

    private C14797wu(int i, eq8 eq8Var) {
        this.f95509c = i;
        this.f95510d = eq8Var;
    }

    @efb
    public static eq8 obtain(@efb Context context) {
        return new C14797wu(context.getResources().getConfiguration().uiMode & 48, o40.obtain(context));
    }

    @Override // p000.eq8
    public boolean equals(Object obj) {
        if (!(obj instanceof C14797wu)) {
            return false;
        }
        C14797wu c14797wu = (C14797wu) obj;
        return this.f95509c == c14797wu.f95509c && this.f95510d.equals(c14797wu.f95510d);
    }

    @Override // p000.eq8
    public int hashCode() {
        return v0i.hashCode(this.f95510d, this.f95509c);
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        this.f95510d.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f95509c).array());
    }
}
