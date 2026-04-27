package p000;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@ay4
public final class g4g implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final int f38768f = 40;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final long f38769a;

    /* JADX INFO: renamed from: b */
    public final double f38770b;

    /* JADX INFO: renamed from: c */
    public final double f38771c;

    /* JADX INFO: renamed from: d */
    public final double f38772d;

    /* JADX INFO: renamed from: e */
    public final double f38773e;

    public g4g(long count, double mean, double sumOfSquaresOfDeltas, double min, double max) {
        this.f38769a = count;
        this.f38770b = mean;
        this.f38771c = sumOfSquaresOfDeltas;
        this.f38772d = min;
        this.f38773e = max;
    }

    /* JADX INFO: renamed from: a */
    public static g4g m11384a(ByteBuffer buffer) {
        v7d.checkNotNull(buffer);
        v7d.checkArgument(buffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, buffer.remaining());
        return new g4g(buffer.getLong(), buffer.getDouble(), buffer.getDouble(), buffer.getDouble(), buffer.getDouble());
    }

    public static g4g fromByteArray(byte[] byteArray) {
        v7d.checkNotNull(byteArray);
        v7d.checkArgument(byteArray.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, byteArray.length);
        return m11384a(ByteBuffer.wrap(byteArray).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double meanOf(Iterable<? extends Number> values) {
        return meanOf(values.iterator());
    }

    /* JADX INFO: renamed from: of */
    public static g4g m11385of(Iterable<? extends Number> values) {
        h4g h4gVar = new h4g();
        h4gVar.addAll(values);
        return h4gVar.snapshot();
    }

    /* JADX INFO: renamed from: b */
    public double m11390b() {
        return this.f38771c;
    }

    /* JADX INFO: renamed from: c */
    public void m11391c(ByteBuffer buffer) {
        v7d.checkNotNull(buffer);
        v7d.checkArgument(buffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, buffer.remaining());
        buffer.putLong(this.f38769a).putDouble(this.f38770b).putDouble(this.f38771c).putDouble(this.f38772d).putDouble(this.f38773e);
    }

    public long count() {
        return this.f38769a;
    }

    public boolean equals(@wx1 Object obj) {
        if (obj == null || g4g.class != obj.getClass()) {
            return false;
        }
        g4g g4gVar = (g4g) obj;
        return this.f38769a == g4gVar.f38769a && Double.doubleToLongBits(this.f38770b) == Double.doubleToLongBits(g4gVar.f38770b) && Double.doubleToLongBits(this.f38771c) == Double.doubleToLongBits(g4gVar.f38771c) && Double.doubleToLongBits(this.f38772d) == Double.doubleToLongBits(g4gVar.f38772d) && Double.doubleToLongBits(this.f38773e) == Double.doubleToLongBits(g4gVar.f38773e);
    }

    public int hashCode() {
        return okb.hashCode(Long.valueOf(this.f38769a), Double.valueOf(this.f38770b), Double.valueOf(this.f38771c), Double.valueOf(this.f38772d), Double.valueOf(this.f38773e));
    }

    public double max() {
        v7d.checkState(this.f38769a != 0);
        return this.f38773e;
    }

    public double mean() {
        v7d.checkState(this.f38769a != 0);
        return this.f38770b;
    }

    public double min() {
        v7d.checkState(this.f38769a != 0);
        return this.f38772d;
    }

    public double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public double populationVariance() {
        v7d.checkState(this.f38769a > 0);
        if (Double.isNaN(this.f38771c)) {
            return Double.NaN;
        }
        if (this.f38769a == 1) {
            return 0.0d;
        }
        return ik4.m13150b(this.f38771c) / count();
    }

    public double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public double sampleVariance() {
        v7d.checkState(this.f38769a > 1);
        if (Double.isNaN(this.f38771c)) {
            return Double.NaN;
        }
        return ik4.m13150b(this.f38771c) / (this.f38769a - 1);
    }

    public double sum() {
        return this.f38770b * this.f38769a;
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        m11391c(byteBufferOrder);
        return byteBufferOrder.array();
    }

    public String toString() {
        return count() > 0 ? yya.toStringHelper(this).add("count", this.f38769a).add("mean", this.f38770b).add("populationStandardDeviation", populationStandardDeviation()).add("min", this.f38772d).add("max", this.f38773e).toString() : yya.toStringHelper(this).add("count", this.f38769a).toString();
    }

    public static double meanOf(Iterator<? extends Number> values) {
        v7d.checkArgument(values.hasNext());
        double dDoubleValue = values.next().doubleValue();
        long j = 1;
        while (values.hasNext()) {
            double dDoubleValue2 = values.next().doubleValue();
            j++;
            dDoubleValue = (qk4.isFinite(dDoubleValue2) && qk4.isFinite(dDoubleValue)) ? dDoubleValue + ((dDoubleValue2 - dDoubleValue) / j) : h4g.m12161a(dDoubleValue, dDoubleValue2);
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: of */
    public static g4g m11386of(Iterator<? extends Number> values) {
        h4g h4gVar = new h4g();
        h4gVar.addAll(values);
        return h4gVar.snapshot();
    }

    /* JADX INFO: renamed from: of */
    public static g4g m11387of(double... values) {
        h4g h4gVar = new h4g();
        h4gVar.addAll(values);
        return h4gVar.snapshot();
    }

    public static double meanOf(double... values) {
        v7d.checkArgument(values.length > 0);
        double dM12161a = values[0];
        for (int i = 1; i < values.length; i++) {
            double d = values[i];
            dM12161a = (qk4.isFinite(d) && qk4.isFinite(dM12161a)) ? dM12161a + ((d - dM12161a) / ((double) (i + 1))) : h4g.m12161a(dM12161a, d);
        }
        return dM12161a;
    }

    /* JADX INFO: renamed from: of */
    public static g4g m11388of(int... values) {
        h4g h4gVar = new h4g();
        h4gVar.addAll(values);
        return h4gVar.snapshot();
    }

    /* JADX INFO: renamed from: of */
    public static g4g m11389of(long... values) {
        h4g h4gVar = new h4g();
        h4gVar.addAll(values);
        return h4gVar.snapshot();
    }

    public static double meanOf(int... values) {
        v7d.checkArgument(values.length > 0);
        double dM12161a = values[0];
        for (int i = 1; i < values.length; i++) {
            double d = values[i];
            dM12161a = (qk4.isFinite(d) && qk4.isFinite(dM12161a)) ? dM12161a + ((d - dM12161a) / ((double) (i + 1))) : h4g.m12161a(dM12161a, d);
        }
        return dM12161a;
    }

    public static double meanOf(long... values) {
        v7d.checkArgument(values.length > 0);
        double dM12161a = values[0];
        for (int i = 1; i < values.length; i++) {
            double d = values[i];
            dM12161a = (qk4.isFinite(d) && qk4.isFinite(dM12161a)) ? dM12161a + ((d - dM12161a) / ((double) (i + 1))) : h4g.m12161a(dM12161a, d);
        }
        return dM12161a;
    }
}
