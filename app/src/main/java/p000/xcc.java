package p000;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@ay4
public final class xcc implements Serializable {

    /* JADX INFO: renamed from: d */
    public static final int f97523d = 88;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final g4g f97524a;

    /* JADX INFO: renamed from: b */
    public final g4g f97525b;

    /* JADX INFO: renamed from: c */
    public final double f97526c;

    public xcc(g4g xStats, g4g yStats, double sumOfProductsOfDeltas) {
        this.f97524a = xStats;
        this.f97525b = yStats;
        this.f97526c = sumOfProductsOfDeltas;
    }

    private static double ensureInUnitRange(double value) {
        if (value >= 1.0d) {
            return 1.0d;
        }
        if (value <= -1.0d) {
            return -1.0d;
        }
        return value;
    }

    private static double ensurePositive(double value) {
        if (value > 0.0d) {
            return value;
        }
        return Double.MIN_VALUE;
    }

    public static xcc fromByteArray(byte[] byteArray) {
        v7d.checkNotNull(byteArray);
        v7d.checkArgument(byteArray.length == 88, "Expected PairedStats.BYTES = %s, got %s", 88, byteArray.length);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN);
        return new xcc(g4g.m11384a(byteBufferOrder), g4g.m11384a(byteBufferOrder), byteBufferOrder.getDouble());
    }

    /* JADX INFO: renamed from: a */
    public double m25096a() {
        return this.f97526c;
    }

    public long count() {
        return this.f97524a.count();
    }

    public boolean equals(@wx1 Object obj) {
        if (obj == null || xcc.class != obj.getClass()) {
            return false;
        }
        xcc xccVar = (xcc) obj;
        return this.f97524a.equals(xccVar.f97524a) && this.f97525b.equals(xccVar.f97525b) && Double.doubleToLongBits(this.f97526c) == Double.doubleToLongBits(xccVar.f97526c);
    }

    public int hashCode() {
        return okb.hashCode(this.f97524a, this.f97525b, Double.valueOf(this.f97526c));
    }

    public w69 leastSquaresFit() {
        v7d.checkState(count() > 1);
        if (Double.isNaN(this.f97526c)) {
            return w69.forNaN();
        }
        double dM11390b = this.f97524a.m11390b();
        if (dM11390b > 0.0d) {
            return this.f97525b.m11390b() > 0.0d ? w69.mapping(this.f97524a.mean(), this.f97525b.mean()).withSlope(this.f97526c / dM11390b) : w69.horizontal(this.f97525b.mean());
        }
        v7d.checkState(this.f97525b.m11390b() > 0.0d);
        return w69.vertical(this.f97524a.mean());
    }

    public double pearsonsCorrelationCoefficient() {
        v7d.checkState(count() > 1);
        if (Double.isNaN(this.f97526c)) {
            return Double.NaN;
        }
        double dM11390b = xStats().m11390b();
        double dM11390b2 = yStats().m11390b();
        v7d.checkState(dM11390b > 0.0d);
        v7d.checkState(dM11390b2 > 0.0d);
        return ensureInUnitRange(this.f97526c / Math.sqrt(ensurePositive(dM11390b * dM11390b2)));
    }

    public double populationCovariance() {
        v7d.checkState(count() != 0);
        return this.f97526c / count();
    }

    public double sampleCovariance() {
        v7d.checkState(count() > 1);
        return this.f97526c / (count() - 1);
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.f97524a.m11391c(byteBufferOrder);
        this.f97525b.m11391c(byteBufferOrder);
        byteBufferOrder.putDouble(this.f97526c);
        return byteBufferOrder.array();
    }

    public String toString() {
        return count() > 0 ? yya.toStringHelper(this).add("xStats", this.f97524a).add("yStats", this.f97525b).add("populationCovariance", populationCovariance()).toString() : yya.toStringHelper(this).add("xStats", this.f97524a).add("yStats", this.f97525b).toString();
    }

    public g4g xStats() {
        return this.f97524a;
    }

    public g4g yStats() {
        return this.f97525b;
    }
}
