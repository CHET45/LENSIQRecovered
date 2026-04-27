package p000;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@ox4
public final class ivh extends Number implements Comparable<ivh> {

    /* JADX INFO: renamed from: b */
    public static final ivh f48634b = fromIntBits(0);

    /* JADX INFO: renamed from: c */
    public static final ivh f48635c = fromIntBits(1);

    /* JADX INFO: renamed from: d */
    public static final ivh f48636d = fromIntBits(-1);

    /* JADX INFO: renamed from: a */
    public final int f48637a;

    private ivh(int value) {
        this.f48637a = value;
    }

    public static ivh fromIntBits(int bits) {
        return new ivh(bits);
    }

    public static ivh valueOf(long value) {
        v7d.checkArgument((4294967295L & value) == value, "value (%s) is outside the range for an unsigned integer value", value);
        return fromIntBits((int) value);
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(longValue());
    }

    public ivh dividedBy(ivh val) {
        return fromIntBits(jvh.divide(this.f48637a, ((ivh) v7d.checkNotNull(val)).f48637a));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return longValue();
    }

    public boolean equals(@wx1 Object obj) {
        return (obj instanceof ivh) && this.f48637a == ((ivh) obj).f48637a;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return longValue();
    }

    public int hashCode() {
        return this.f48637a;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f48637a;
    }

    @Override // java.lang.Number
    public long longValue() {
        return jvh.toLong(this.f48637a);
    }

    public ivh minus(ivh val) {
        return fromIntBits(this.f48637a - ((ivh) v7d.checkNotNull(val)).f48637a);
    }

    public ivh mod(ivh val) {
        return fromIntBits(jvh.remainder(this.f48637a, ((ivh) v7d.checkNotNull(val)).f48637a));
    }

    public ivh plus(ivh val) {
        return fromIntBits(this.f48637a + ((ivh) v7d.checkNotNull(val)).f48637a);
    }

    @jd7
    @yg8
    public ivh times(ivh val) {
        return fromIntBits(this.f48637a * ((ivh) v7d.checkNotNull(val)).f48637a);
    }

    public String toString() {
        return toString(10);
    }

    @Override // java.lang.Comparable
    public int compareTo(ivh other) {
        v7d.checkNotNull(other);
        return jvh.compare(this.f48637a, other.f48637a);
    }

    public String toString(int radix) {
        return jvh.toString(this.f48637a, radix);
    }

    public static ivh valueOf(BigInteger value) {
        v7d.checkNotNull(value);
        v7d.checkArgument(value.signum() >= 0 && value.bitLength() <= 32, "value (%s) is outside the range for an unsigned integer value", value);
        return fromIntBits(value.intValue());
    }

    public static ivh valueOf(String string) {
        return valueOf(string, 10);
    }

    public static ivh valueOf(String string, int radix) {
        return fromIntBits(jvh.parseUnsignedInt(string, radix));
    }
}
