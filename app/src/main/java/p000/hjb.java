package p000;

/* JADX INFO: loaded from: classes7.dex */
public class hjb extends gjb {
    @jjf(version = "1.4")
    @t28
    private static final int countLeadingZeroBits(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @jjf(version = "1.4")
    @t28
    private static final int countOneBits(int i) {
        return Integer.bitCount(i);
    }

    @jjf(version = "1.4")
    @t28
    private static final int countTrailingZeroBits(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @jjf(version = "1.2")
    @t28
    private static final double fromBits(ak4 ak4Var, long j) {
        md8.checkNotNullParameter(ak4Var, "<this>");
        return Double.longBitsToDouble(j);
    }

    @t28
    private static final boolean isFinite(double d) {
        return (Double.isInfinite(d) || Double.isNaN(d)) ? false : true;
    }

    @t28
    private static final boolean isInfinite(double d) {
        return Double.isInfinite(d);
    }

    @t28
    private static final boolean isNaN(double d) {
        return Double.isNaN(d);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    @t28
    private static final int rotateLeft(int i, int i2) {
        return Integer.rotateLeft(i, i2);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    @t28
    private static final int rotateRight(int i, int i2) {
        return Integer.rotateRight(i, i2);
    }

    @jjf(version = "1.4")
    @t28
    private static final int takeHighestOneBit(int i) {
        return Integer.highestOneBit(i);
    }

    @jjf(version = "1.4")
    @t28
    private static final int takeLowestOneBit(int i) {
        return Integer.lowestOneBit(i);
    }

    @jjf(version = "1.2")
    @t28
    private static final long toBits(double d) {
        return Double.doubleToLongBits(d);
    }

    @jjf(version = "1.2")
    @t28
    private static final long toRawBits(double d) {
        return Double.doubleToRawLongBits(d);
    }

    @jjf(version = "1.4")
    @t28
    private static final int countLeadingZeroBits(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @jjf(version = "1.4")
    @t28
    private static final int countOneBits(long j) {
        return Long.bitCount(j);
    }

    @jjf(version = "1.4")
    @t28
    private static final int countTrailingZeroBits(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @jjf(version = "1.2")
    @t28
    private static final float fromBits(d46 d46Var, int i) {
        md8.checkNotNullParameter(d46Var, "<this>");
        return Float.intBitsToFloat(i);
    }

    @t28
    private static final boolean isFinite(float f) {
        return (Float.isInfinite(f) || Float.isNaN(f)) ? false : true;
    }

    @t28
    private static final boolean isInfinite(float f) {
        return Float.isInfinite(f);
    }

    @t28
    private static final boolean isNaN(float f) {
        return Float.isNaN(f);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    @t28
    private static final long rotateLeft(long j, int i) {
        return Long.rotateLeft(j, i);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    @t28
    private static final long rotateRight(long j, int i) {
        return Long.rotateRight(j, i);
    }

    @jjf(version = "1.4")
    @t28
    private static final long takeHighestOneBit(long j) {
        return Long.highestOneBit(j);
    }

    @jjf(version = "1.4")
    @t28
    private static final long takeLowestOneBit(long j) {
        return Long.lowestOneBit(j);
    }

    @jjf(version = "1.2")
    @t28
    private static final int toBits(float f) {
        return Float.floatToIntBits(f);
    }

    @jjf(version = "1.2")
    @t28
    private static final int toRawBits(float f) {
        return Float.floatToRawIntBits(f);
    }
}
