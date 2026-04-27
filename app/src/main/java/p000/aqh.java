package p000;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "UNumbersKt")
public final class aqh {
    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: countLeadingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m27847countLeadingZeroBits7apg3OU(byte b) {
        return Integer.numberOfLeadingZeros(b & 255) - 24;
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: countLeadingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m27848countLeadingZeroBitsVKZWuLQ(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: countLeadingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m27849countLeadingZeroBitsWZ4Q5Ns(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: countLeadingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m27850countLeadingZeroBitsxj2QHRw(short s) {
        return Integer.numberOfLeadingZeros(s & iqh.f48007d) - 16;
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: countOneBits-7apg3OU, reason: not valid java name */
    private static final int m27851countOneBits7apg3OU(byte b) {
        return Integer.bitCount(woh.m33004constructorimpl(b & 255));
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: countOneBits-VKZWuLQ, reason: not valid java name */
    private static final int m27852countOneBitsVKZWuLQ(long j) {
        return Long.bitCount(j);
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: countOneBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m27853countOneBitsWZ4Q5Ns(int i) {
        return Integer.bitCount(i);
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: countOneBits-xj2QHRw, reason: not valid java name */
    private static final int m27854countOneBitsxj2QHRw(short s) {
        return Integer.bitCount(woh.m33004constructorimpl(s & iqh.f48007d));
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: countTrailingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m27855countTrailingZeroBits7apg3OU(byte b) {
        return Integer.numberOfTrailingZeros(b | 256);
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: countTrailingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m27856countTrailingZeroBitsVKZWuLQ(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: countTrailingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m27857countTrailingZeroBitsWZ4Q5Ns(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: countTrailingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m27858countTrailingZeroBitsxj2QHRw(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    @ihi(markerClass = {rh5.class, yh5.class})
    @jjf(version = "1.6")
    @t28
    /* JADX INFO: renamed from: rotateLeft-JSWoG40, reason: not valid java name */
    private static final long m27859rotateLeftJSWoG40(long j, int i) {
        return oph.m31533constructorimpl(Long.rotateLeft(j, i));
    }

    @ihi(markerClass = {rh5.class, yh5.class})
    @jjf(version = "1.6")
    @t28
    /* JADX INFO: renamed from: rotateLeft-LxnNnR4, reason: not valid java name */
    private static final byte m27860rotateLeftLxnNnR4(byte b, int i) {
        return goh.m29786constructorimpl(ijb.rotateLeft(b, i));
    }

    @ihi(markerClass = {rh5.class, yh5.class})
    @jjf(version = "1.6")
    @t28
    /* JADX INFO: renamed from: rotateLeft-V7xB4Y4, reason: not valid java name */
    private static final int m27861rotateLeftV7xB4Y4(int i, int i2) {
        return woh.m33004constructorimpl(Integer.rotateLeft(i, i2));
    }

    @ihi(markerClass = {rh5.class, yh5.class})
    @jjf(version = "1.6")
    @t28
    /* JADX INFO: renamed from: rotateLeft-olVBNx4, reason: not valid java name */
    private static final short m27862rotateLeftolVBNx4(short s, int i) {
        return iqh.m30324constructorimpl(ijb.rotateLeft(s, i));
    }

    @ihi(markerClass = {rh5.class, yh5.class})
    @jjf(version = "1.6")
    @t28
    /* JADX INFO: renamed from: rotateRight-JSWoG40, reason: not valid java name */
    private static final long m27863rotateRightJSWoG40(long j, int i) {
        return oph.m31533constructorimpl(Long.rotateRight(j, i));
    }

    @ihi(markerClass = {rh5.class, yh5.class})
    @jjf(version = "1.6")
    @t28
    /* JADX INFO: renamed from: rotateRight-LxnNnR4, reason: not valid java name */
    private static final byte m27864rotateRightLxnNnR4(byte b, int i) {
        return goh.m29786constructorimpl(ijb.rotateRight(b, i));
    }

    @ihi(markerClass = {rh5.class, yh5.class})
    @jjf(version = "1.6")
    @t28
    /* JADX INFO: renamed from: rotateRight-V7xB4Y4, reason: not valid java name */
    private static final int m27865rotateRightV7xB4Y4(int i, int i2) {
        return woh.m33004constructorimpl(Integer.rotateRight(i, i2));
    }

    @ihi(markerClass = {rh5.class, yh5.class})
    @jjf(version = "1.6")
    @t28
    /* JADX INFO: renamed from: rotateRight-olVBNx4, reason: not valid java name */
    private static final short m27866rotateRightolVBNx4(short s, int i) {
        return iqh.m30324constructorimpl(ijb.rotateRight(s, i));
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: takeHighestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m27867takeHighestOneBit7apg3OU(byte b) {
        return goh.m29786constructorimpl((byte) Integer.highestOneBit(b & 255));
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: takeHighestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m27868takeHighestOneBitVKZWuLQ(long j) {
        return oph.m31533constructorimpl(Long.highestOneBit(j));
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: takeHighestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m27869takeHighestOneBitWZ4Q5Ns(int i) {
        return woh.m33004constructorimpl(Integer.highestOneBit(i));
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: takeHighestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m27870takeHighestOneBitxj2QHRw(short s) {
        return iqh.m30324constructorimpl((short) Integer.highestOneBit(s & iqh.f48007d));
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: takeLowestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m27871takeLowestOneBit7apg3OU(byte b) {
        return goh.m29786constructorimpl((byte) Integer.lowestOneBit(b & 255));
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: takeLowestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m27872takeLowestOneBitVKZWuLQ(long j) {
        return oph.m31533constructorimpl(Long.lowestOneBit(j));
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: takeLowestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m27873takeLowestOneBitWZ4Q5Ns(int i) {
        return woh.m33004constructorimpl(Integer.lowestOneBit(i));
    }

    @ihi(markerClass = {yh5.class, rh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: takeLowestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m27874takeLowestOneBitxj2QHRw(short s) {
        return iqh.m30324constructorimpl((short) Integer.lowestOneBit(s & iqh.f48007d));
    }
}
