package p000;

/* JADX INFO: loaded from: classes5.dex */
public class d37 implements Comparable<d37> {

    /* JADX INFO: renamed from: a */
    public final double f28325a;

    /* JADX INFO: renamed from: b */
    public final double f28326b;

    public d37(double d, double d2) {
        if (Double.isNaN(d) || d < -90.0d || d > 90.0d) {
            throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
        }
        if (Double.isNaN(d2) || d2 < -180.0d || d2 > 180.0d) {
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        this.f28325a = d;
        this.f28326b = d2;
    }

    public boolean equals(@hib Object obj) {
        if (!(obj instanceof d37)) {
            return false;
        }
        d37 d37Var = (d37) obj;
        return this.f28325a == d37Var.f28325a && this.f28326b == d37Var.f28326b;
    }

    public double getLatitude() {
        return this.f28325a;
    }

    public double getLongitude() {
        return this.f28326b;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f28325a);
        int i = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f28326b);
        return (i * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    @efb
    public String toString() {
        return "GeoPoint { latitude=" + this.f28325a + ", longitude=" + this.f28326b + " }";
    }

    @Override // java.lang.Comparable
    public int compareTo(@efb d37 d37Var) {
        int iCompareDoubles = r0i.compareDoubles(this.f28325a, d37Var.f28325a);
        return iCompareDoubles == 0 ? r0i.compareDoubles(this.f28326b, d37Var.f28326b) : iCompareDoubles;
    }
}
