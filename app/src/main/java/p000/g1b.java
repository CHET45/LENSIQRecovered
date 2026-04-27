package p000;

import p000.eta;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class g1b implements eta.InterfaceC5464a {

    /* JADX INFO: renamed from: a */
    public final float f38250a;

    /* JADX INFO: renamed from: b */
    public final float f38251b;

    public g1b(@y46(from = -90.0d, m25645to = 90.0d) float f, @y46(from = -180.0d, m25645to = 180.0d) float f2) {
        v80.checkArgument(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.f38250a = f;
        this.f38251b = f2;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g1b.class != obj.getClass()) {
            return false;
        }
        g1b g1bVar = (g1b) obj;
        return this.f38250a == g1bVar.f38250a && this.f38251b == g1bVar.f38251b;
    }

    public int hashCode() {
        return ((527 + v56.hashCode(this.f38250a)) * 31) + v56.hashCode(this.f38251b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f38250a + ", longitude=" + this.f38251b;
    }
}
