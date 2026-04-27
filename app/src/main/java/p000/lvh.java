package p000;

import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@ox4
public final class lvh extends Number implements Comparable<lvh>, Serializable {

    /* JADX INFO: renamed from: b */
    public static final long f58928b = Long.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    public static final lvh f58929c = new lvh(0);

    /* JADX INFO: renamed from: d */
    public static final lvh f58930d = new lvh(1);

    /* JADX INFO: renamed from: e */
    public static final lvh f58931e = new lvh(-1);

    /* JADX INFO: renamed from: a */
    public final long f58932a;

    private lvh(long value) {
        this.f58932a = value;
    }

    public static lvh fromLongBits(long bits) {
        return new lvh(bits);
    }

    @op1
    public static lvh valueOf(long value) {
        v7d.checkArgument(value >= 0, "value (%s) is outside the range for an unsigned long value", value);
        return fromLongBits(value);
    }

    public BigInteger bigIntegerValue() {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(this.f58932a & Long.MAX_VALUE);
        return this.f58932a < 0 ? bigIntegerValueOf.setBit(63) : bigIntegerValueOf;
    }

    public lvh dividedBy(lvh val) {
        return fromLongBits(mvh.divide(this.f58932a, ((lvh) v7d.checkNotNull(val)).f58932a));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j = this.f58932a;
        if (j >= 0) {
            return j;
        }
        return ((j & 1) | (j >>> 1)) * 2.0d;
    }

    public boolean equals(@wx1 Object obj) {
        return (obj instanceof lvh) && this.f58932a == ((lvh) obj).f58932a;
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j = this.f58932a;
        if (j >= 0) {
            return j;
        }
        return ((j & 1) | (j >>> 1)) * 2.0f;
    }

    public int hashCode() {
        return im9.hashCode(this.f58932a);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f58932a;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f58932a;
    }

    public lvh minus(lvh val) {
        return fromLongBits(this.f58932a - ((lvh) v7d.checkNotNull(val)).f58932a);
    }

    public lvh mod(lvh val) {
        return fromLongBits(mvh.remainder(this.f58932a, ((lvh) v7d.checkNotNull(val)).f58932a));
    }

    public lvh plus(lvh val) {
        return fromLongBits(this.f58932a + ((lvh) v7d.checkNotNull(val)).f58932a);
    }

    public lvh times(lvh val) {
        return fromLongBits(this.f58932a * ((lvh) v7d.checkNotNull(val)).f58932a);
    }

    public String toString() {
        return mvh.toString(this.f58932a);
    }

    @Override // java.lang.Comparable
    public int compareTo(lvh o) {
        v7d.checkNotNull(o);
        return mvh.compare(this.f58932a, o.f58932a);
    }

    public String toString(int radix) {
        return mvh.toString(this.f58932a, radix);
    }

    @op1
    public static lvh valueOf(BigInteger value) {
        v7d.checkNotNull(value);
        v7d.checkArgument(value.signum() >= 0 && value.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", value);
        return fromLongBits(value.longValue());
    }

    @op1
    public static lvh valueOf(String string) {
        return valueOf(string, 10);
    }

    @op1
    public static lvh valueOf(String string, int radix) {
        return fromLongBits(mvh.parseUnsignedLong(string, radix));
    }
}
