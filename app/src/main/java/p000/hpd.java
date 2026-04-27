package p000;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class hpd {

    /* JADX INFO: renamed from: a */
    public final long f44441a;

    /* JADX INFO: renamed from: b */
    public final long f44442b;

    /* JADX INFO: renamed from: c */
    public final String f44443c;

    /* JADX INFO: renamed from: d */
    public int f44444d;

    public hpd(@hib String str, long j, long j2) {
        this.f44443c = str == null ? "" : str;
        this.f44441a = j;
        this.f44442b = j2;
    }

    @hib
    public hpd attemptMerge(@hib hpd hpdVar, String str) {
        String strResolveUriString = resolveUriString(str);
        if (hpdVar != null && strResolveUriString.equals(hpdVar.resolveUriString(str))) {
            long j = this.f44442b;
            if (j != -1) {
                long j2 = this.f44441a;
                if (j2 + j == hpdVar.f44441a) {
                    long j3 = hpdVar.f44442b;
                    return new hpd(strResolveUriString, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = hpdVar.f44442b;
            if (j4 != -1) {
                long j5 = hpdVar.f44441a;
                if (j5 + j4 == this.f44441a) {
                    return new hpd(strResolveUriString, j5, j != -1 ? j4 + j : -1L);
                }
            }
        }
        return null;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hpd.class != obj.getClass()) {
            return false;
        }
        hpd hpdVar = (hpd) obj;
        return this.f44441a == hpdVar.f44441a && this.f44442b == hpdVar.f44442b && this.f44443c.equals(hpdVar.f44443c);
    }

    public int hashCode() {
        if (this.f44444d == 0) {
            this.f44444d = ((((527 + ((int) this.f44441a)) * 31) + ((int) this.f44442b)) * 31) + this.f44443c.hashCode();
        }
        return this.f44444d;
    }

    public Uri resolveUri(String str) {
        return byh.resolveToUri(str, this.f44443c);
    }

    public String resolveUriString(String str) {
        return byh.resolve(str, this.f44443c);
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f44443c + ", start=" + this.f44441a + ", length=" + this.f44442b + c0b.f15434d;
    }
}
