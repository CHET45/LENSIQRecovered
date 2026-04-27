package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class x52 implements z52<Double> {

    /* JADX INFO: renamed from: a */
    public final double f96731a;

    /* JADX INFO: renamed from: b */
    public final double f96732b;

    public x52(double d, double d2) {
        this.f96731a = d;
        this.f96732b = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.z52, p000.a62, p000.r5c
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof x52) {
            if (!isEmpty() || !((x52) obj).isEmpty()) {
                x52 x52Var = (x52) obj;
                if (this.f96731a != x52Var.f96731a || this.f96732b != x52Var.f96732b) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f96731a) * 31) + Double.hashCode(this.f96732b);
    }

    @Override // p000.z52, p000.a62, p000.r5c
    public boolean isEmpty() {
        return this.f96731a > this.f96732b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.z52
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    @yfb
    public String toString() {
        return this.f96731a + ".." + this.f96732b;
    }

    public boolean contains(double d) {
        return d >= this.f96731a && d <= this.f96732b;
    }

    @Override // p000.a62
    @yfb
    public Double getEndInclusive() {
        return Double.valueOf(this.f96732b);
    }

    @Override // p000.a62, p000.r5c
    @yfb
    public Double getStart() {
        return Double.valueOf(this.f96731a);
    }

    public boolean lessThanOrEquals(double d, double d2) {
        return d <= d2;
    }
}
