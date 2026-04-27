package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class p5c implements r5c<Double> {

    /* JADX INFO: renamed from: a */
    public final double f69733a;

    /* JADX INFO: renamed from: b */
    public final double f69734b;

    public p5c(double d, double d2) {
        this.f69733a = d;
        this.f69734b = d2;
    }

    private final boolean lessThanOrEquals(double d, double d2) {
        return d <= d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.r5c
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof p5c) {
            if (!isEmpty() || !((p5c) obj).isEmpty()) {
                p5c p5cVar = (p5c) obj;
                if (this.f69733a != p5cVar.f69733a || this.f69734b != p5cVar.f69734b) {
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
        return (Double.hashCode(this.f69733a) * 31) + Double.hashCode(this.f69734b);
    }

    @Override // p000.r5c
    public boolean isEmpty() {
        return this.f69733a >= this.f69734b;
    }

    @yfb
    public String toString() {
        return this.f69733a + "..<" + this.f69734b;
    }

    public boolean contains(double d) {
        return d >= this.f69733a && d < this.f69734b;
    }

    @Override // p000.r5c
    @yfb
    public Double getEndExclusive() {
        return Double.valueOf(this.f69734b);
    }

    @Override // p000.r5c
    @yfb
    public Double getStart() {
        return Double.valueOf(this.f69733a);
    }
}
