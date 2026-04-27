package p000;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class mf3 implements eq8 {

    /* JADX INFO: renamed from: c */
    public final eq8 f60877c;

    /* JADX INFO: renamed from: d */
    public final eq8 f60878d;

    public mf3(eq8 eq8Var, eq8 eq8Var2) {
        this.f60877c = eq8Var;
        this.f60878d = eq8Var2;
    }

    /* JADX INFO: renamed from: a */
    public eq8 m17285a() {
        return this.f60877c;
    }

    @Override // p000.eq8
    public boolean equals(Object obj) {
        if (!(obj instanceof mf3)) {
            return false;
        }
        mf3 mf3Var = (mf3) obj;
        return this.f60877c.equals(mf3Var.f60877c) && this.f60878d.equals(mf3Var.f60878d);
    }

    @Override // p000.eq8
    public int hashCode() {
        return (this.f60877c.hashCode() * 31) + this.f60878d.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f60877c + ", signature=" + this.f60878d + '}';
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        this.f60877c.updateDiskCacheKey(messageDigest);
        this.f60878d.updateDiskCacheKey(messageDigest);
    }
}
