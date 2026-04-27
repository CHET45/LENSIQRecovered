package p000;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@ay4
public final class ycc {

    /* JADX INFO: renamed from: a */
    public final h4g f101119a = new h4g();

    /* JADX INFO: renamed from: b */
    public final h4g f101120b = new h4g();

    /* JADX INFO: renamed from: c */
    public double f101121c = 0.0d;

    private static double ensureInUnitRange(double value) {
        return qk4.constrainToRange(value, -1.0d, 1.0d);
    }

    private double ensurePositive(double value) {
        if (value > 0.0d) {
            return value;
        }
        return Double.MIN_VALUE;
    }

    public void add(double x, double y) {
        this.f101119a.add(x);
        if (!qk4.isFinite(x) || !qk4.isFinite(y)) {
            this.f101121c = Double.NaN;
        } else if (this.f101119a.count() > 1) {
            this.f101121c += (x - this.f101119a.mean()) * (y - this.f101120b.mean());
        }
        this.f101120b.add(y);
    }

    public void addAll(xcc values) {
        if (values.count() == 0) {
            return;
        }
        this.f101119a.addAll(values.xStats());
        if (this.f101120b.count() == 0) {
            this.f101121c = values.m25096a();
        } else {
            this.f101121c += values.m25096a() + ((values.xStats().mean() - this.f101119a.mean()) * (values.yStats().mean() - this.f101120b.mean()) * values.count());
        }
        this.f101120b.addAll(values.yStats());
    }

    public long count() {
        return this.f101119a.count();
    }

    public final w69 leastSquaresFit() {
        v7d.checkState(count() > 1);
        if (Double.isNaN(this.f101121c)) {
            return w69.forNaN();
        }
        double dM12162b = this.f101119a.m12162b();
        if (dM12162b > 0.0d) {
            return this.f101120b.m12162b() > 0.0d ? w69.mapping(this.f101119a.mean(), this.f101120b.mean()).withSlope(this.f101121c / dM12162b) : w69.horizontal(this.f101120b.mean());
        }
        v7d.checkState(this.f101120b.m12162b() > 0.0d);
        return w69.vertical(this.f101119a.mean());
    }

    public final double pearsonsCorrelationCoefficient() {
        v7d.checkState(count() > 1);
        if (Double.isNaN(this.f101121c)) {
            return Double.NaN;
        }
        double dM12162b = this.f101119a.m12162b();
        double dM12162b2 = this.f101120b.m12162b();
        v7d.checkState(dM12162b > 0.0d);
        v7d.checkState(dM12162b2 > 0.0d);
        return ensureInUnitRange(this.f101121c / Math.sqrt(ensurePositive(dM12162b * dM12162b2)));
    }

    public double populationCovariance() {
        v7d.checkState(count() != 0);
        return this.f101121c / count();
    }

    public final double sampleCovariance() {
        v7d.checkState(count() > 1);
        return this.f101121c / (count() - 1);
    }

    public xcc snapshot() {
        return new xcc(this.f101119a.snapshot(), this.f101120b.snapshot(), this.f101121c);
    }

    public g4g xStats() {
        return this.f101119a.snapshot();
    }

    public g4g yStats() {
        return this.f101120b.snapshot();
    }
}
