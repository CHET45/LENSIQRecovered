package p000;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public final class bkb implements eq8 {

    /* JADX INFO: renamed from: c */
    public final Object f13953c;

    public bkb(@efb Object obj) {
        this.f13953c = t7d.checkNotNull(obj);
    }

    @Override // p000.eq8
    public boolean equals(Object obj) {
        if (obj instanceof bkb) {
            return this.f13953c.equals(((bkb) obj).f13953c);
        }
        return false;
    }

    @Override // p000.eq8
    public int hashCode() {
        return this.f13953c.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f13953c + '}';
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(this.f13953c.toString().getBytes(eq8.f33838b));
    }
}
