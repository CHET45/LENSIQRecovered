package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public class spa implements eq8 {

    /* JADX INFO: renamed from: c */
    @efb
    public final String f82523c;

    /* JADX INFO: renamed from: d */
    public final long f82524d;

    /* JADX INFO: renamed from: e */
    public final int f82525e;

    public spa(@hib String str, long j, int i) {
        this.f82523c = str == null ? "" : str;
        this.f82524d = j;
        this.f82525e = i;
    }

    @Override // p000.eq8
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        spa spaVar = (spa) obj;
        return this.f82524d == spaVar.f82524d && this.f82525e == spaVar.f82525e && this.f82523c.equals(spaVar.f82523c);
    }

    @Override // p000.eq8
    public int hashCode() {
        int iHashCode = this.f82523c.hashCode() * 31;
        long j = this.f82524d;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f82525e;
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f82524d).putInt(this.f82525e).array());
        messageDigest.update(this.f82523c.getBytes(eq8.f33838b));
    }
}
