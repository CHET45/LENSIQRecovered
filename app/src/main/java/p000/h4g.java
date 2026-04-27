package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@ay4
public final class h4g {

    /* JADX INFO: renamed from: a */
    public long f42367a = 0;

    /* JADX INFO: renamed from: b */
    public double f42368b = 0.0d;

    /* JADX INFO: renamed from: c */
    public double f42369c = 0.0d;

    /* JADX INFO: renamed from: d */
    public double f42370d = Double.NaN;

    /* JADX INFO: renamed from: e */
    public double f42371e = Double.NaN;

    /* JADX INFO: renamed from: a */
    public static double m12161a(double previousMean, double value) {
        if (qk4.isFinite(previousMean)) {
            return value;
        }
        if (qk4.isFinite(value) || previousMean == value) {
            return previousMean;
        }
        return Double.NaN;
    }

    private void merge(long otherCount, double otherMean, double otherSumOfSquaresOfDeltas, double otherMin, double otherMax) {
        long j = this.f42367a;
        if (j == 0) {
            this.f42367a = otherCount;
            this.f42368b = otherMean;
            this.f42369c = otherSumOfSquaresOfDeltas;
            this.f42370d = otherMin;
            this.f42371e = otherMax;
            return;
        }
        this.f42367a = j + otherCount;
        if (qk4.isFinite(this.f42368b) && qk4.isFinite(otherMean)) {
            double d = this.f42368b;
            double d2 = otherMean - d;
            double d3 = otherCount;
            double d4 = d + ((d2 * d3) / this.f42367a);
            this.f42368b = d4;
            this.f42369c += otherSumOfSquaresOfDeltas + (d2 * (otherMean - d4) * d3);
        } else {
            this.f42368b = m12161a(this.f42368b, otherMean);
            this.f42369c = Double.NaN;
        }
        this.f42370d = Math.min(this.f42370d, otherMin);
        this.f42371e = Math.max(this.f42371e, otherMax);
    }

    public void add(double value) {
        long j = this.f42367a;
        if (j == 0) {
            this.f42367a = 1L;
            this.f42368b = value;
            this.f42370d = value;
            this.f42371e = value;
            if (qk4.isFinite(value)) {
                return;
            }
            this.f42369c = Double.NaN;
            return;
        }
        this.f42367a = j + 1;
        if (qk4.isFinite(value) && qk4.isFinite(this.f42368b)) {
            double d = this.f42368b;
            double d2 = value - d;
            double d3 = d + (d2 / this.f42367a);
            this.f42368b = d3;
            this.f42369c += d2 * (value - d3);
        } else {
            this.f42368b = m12161a(this.f42368b, value);
            this.f42369c = Double.NaN;
        }
        this.f42370d = Math.min(this.f42370d, value);
        this.f42371e = Math.max(this.f42371e, value);
    }

    public void addAll(Iterable<? extends Number> values) {
        Iterator<? extends Number> it = values.iterator();
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    /* JADX INFO: renamed from: b */
    public double m12162b() {
        return this.f42369c;
    }

    public long count() {
        return this.f42367a;
    }

    public double max() {
        v7d.checkState(this.f42367a != 0);
        return this.f42371e;
    }

    public double mean() {
        v7d.checkState(this.f42367a != 0);
        return this.f42368b;
    }

    public double min() {
        v7d.checkState(this.f42367a != 0);
        return this.f42370d;
    }

    public final double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public final double populationVariance() {
        v7d.checkState(this.f42367a != 0);
        if (Double.isNaN(this.f42369c)) {
            return Double.NaN;
        }
        if (this.f42367a == 1) {
            return 0.0d;
        }
        return ik4.m13150b(this.f42369c) / this.f42367a;
    }

    public final double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public final double sampleVariance() {
        v7d.checkState(this.f42367a > 1);
        if (Double.isNaN(this.f42369c)) {
            return Double.NaN;
        }
        return ik4.m13150b(this.f42369c) / (this.f42367a - 1);
    }

    public g4g snapshot() {
        return new g4g(this.f42367a, this.f42368b, this.f42369c, this.f42370d, this.f42371e);
    }

    public final double sum() {
        return this.f42368b * this.f42367a;
    }

    public void addAll(Iterator<? extends Number> values) {
        while (values.hasNext()) {
            add(values.next().doubleValue());
        }
    }

    public void addAll(double... values) {
        for (double d : values) {
            add(d);
        }
    }

    public void addAll(int... values) {
        for (int i : values) {
            add(i);
        }
    }

    public void addAll(long... values) {
        for (long j : values) {
            add(j);
        }
    }

    public void addAll(g4g values) {
        if (values.count() == 0) {
            return;
        }
        merge(values.count(), values.mean(), values.m11390b(), values.min(), values.max());
    }

    public void addAll(h4g values) {
        if (values.count() == 0) {
            return;
        }
        merge(values.count(), values.mean(), values.m12162b(), values.min(), values.max());
    }
}
