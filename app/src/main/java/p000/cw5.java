package p000;

/* JADX INFO: loaded from: classes5.dex */
@xx4
public final class cw5 extends AbstractC9116m3 {

    /* JADX INFO: renamed from: a */
    public static final lh7 f27916a = new cw5();

    /* JADX INFO: renamed from: b */
    public static final long f27917b = -6505348102511208375L;

    /* JADX INFO: renamed from: c */
    public static final long f27918c = -8261664234251669945L;

    /* JADX INFO: renamed from: d */
    public static final long f27919d = -4288712594273399085L;

    /* JADX INFO: renamed from: e */
    public static final long f27920e = -4132994306676758123L;

    @gdi
    /* JADX INFO: renamed from: a */
    public static long m8762a(byte[] bytes, int offset, int length) {
        long jM8764c = length <= 32 ? m8764c(bytes, offset, length, -1397348546323613475L) : length <= 64 ? hashLength33To64(bytes, offset, length) : fullFingerprint(bytes, offset, length);
        long jM11487b = f27917b;
        long jM11487b2 = length >= 8 ? gb9.m11487b(bytes, offset) : -6505348102511208375L;
        if (length >= 9) {
            jM11487b = gb9.m11487b(bytes, (offset + length) - 8);
        }
        long jM8763b = m8763b(jM8764c + jM11487b, jM11487b2);
        return (jM8763b == 0 || jM8763b == 1) ? jM8763b - 2 : jM8763b;
    }

    @gdi
    /* JADX INFO: renamed from: b */
    public static long m8763b(long high, long low) {
        long j = (low ^ high) * f27920e;
        long j2 = (high ^ (j ^ (j >>> 47))) * f27920e;
        return (j2 ^ (j2 >>> 47)) * f27920e;
    }

    @gdi
    /* JADX INFO: renamed from: c */
    public static long m8764c(byte[] bytes, int offset, int length, long seed) {
        int i = length & (-8);
        int i2 = length & 7;
        long jM11488c = seed ^ (((long) length) * f27920e);
        for (int i3 = 0; i3 < i; i3 += 8) {
            jM11488c = (jM11488c ^ (shiftMix(gb9.m11487b(bytes, offset + i3) * f27920e) * f27920e)) * f27920e;
        }
        if (i2 != 0) {
            jM11488c = (gb9.m11488c(bytes, offset + i, i2) ^ jM11488c) * f27920e;
        }
        return shiftMix(shiftMix(jM11488c) * f27920e);
    }

    private static long fullFingerprint(byte[] bytes, int offset, int length) {
        long jM11487b = gb9.m11487b(bytes, offset);
        int i = offset + length;
        long jM11487b2 = gb9.m11487b(bytes, i - 16) ^ f27918c;
        long jM11487b3 = gb9.m11487b(bytes, i - 56) ^ f27917b;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j = length;
        weakHashLength32WithSeeds(bytes, i - 64, j, jM11487b2, jArr);
        weakHashLength32WithSeeds(bytes, i - 32, j * f27918c, f27917b, jArr2);
        long jShiftMix = jM11487b3 + (shiftMix(jArr[1]) * f27918c);
        long jRotateRight = Long.rotateRight(jShiftMix + jM11487b, 39) * f27918c;
        long jRotateRight2 = Long.rotateRight(jM11487b2, 33) * f27918c;
        int i2 = offset;
        int i3 = (length - 1) & (-64);
        while (true) {
            long jRotateRight3 = Long.rotateRight(jRotateRight + jRotateRight2 + jArr[0] + gb9.m11487b(bytes, i2 + 16), 37) * f27918c;
            long jRotateRight4 = Long.rotateRight(jRotateRight2 + jArr[1] + gb9.m11487b(bytes, i2 + 48), 42) * f27918c;
            long j2 = jRotateRight3 ^ jArr2[1];
            long j3 = jRotateRight4 ^ jArr[0];
            long jRotateRight5 = Long.rotateRight(jShiftMix ^ jArr2[0], 33);
            weakHashLength32WithSeeds(bytes, i2, jArr[1] * f27918c, j2 + jArr2[0], jArr);
            weakHashLength32WithSeeds(bytes, i2 + 32, jArr2[1] + jRotateRight5, j3, jArr2);
            i2 += 64;
            i3 -= 64;
            if (i3 == 0) {
                return m8763b(m8763b(jArr[0], jArr2[0]) + (shiftMix(j3) * f27918c) + j2, m8763b(jArr[1], jArr2[1]) + jRotateRight5);
            }
            jRotateRight = jRotateRight5;
            jShiftMix = j2;
            jRotateRight2 = j3;
        }
    }

    private static long hashLength33To64(byte[] bytes, int offset, int length) {
        long jM11487b = gb9.m11487b(bytes, offset + 24);
        int i = offset + length;
        int i2 = i - 16;
        long jM11487b2 = gb9.m11487b(bytes, offset) + ((((long) length) + gb9.m11487b(bytes, i2)) * f27917b);
        long jRotateRight = Long.rotateRight(jM11487b2 + jM11487b, 52);
        long jRotateRight2 = Long.rotateRight(jM11487b2, 37);
        long jM11487b3 = jM11487b2 + gb9.m11487b(bytes, offset + 8);
        long jRotateRight3 = jRotateRight2 + Long.rotateRight(jM11487b3, 7);
        int i3 = offset + 16;
        long jM11487b4 = jM11487b3 + gb9.m11487b(bytes, i3);
        long j = jM11487b + jM11487b4;
        long jRotateRight4 = jRotateRight + Long.rotateRight(jM11487b4, 31) + jRotateRight3;
        long jM11487b5 = gb9.m11487b(bytes, i3) + gb9.m11487b(bytes, i - 32);
        long jM11487b6 = gb9.m11487b(bytes, i - 8);
        long jRotateRight5 = Long.rotateRight(jM11487b5 + jM11487b6, 52);
        long jRotateRight6 = Long.rotateRight(jM11487b5, 37);
        long jM11487b7 = jM11487b5 + gb9.m11487b(bytes, i - 24);
        long jRotateRight7 = jRotateRight6 + Long.rotateRight(jM11487b7, 7);
        long jM11487b8 = jM11487b7 + gb9.m11487b(bytes, i2);
        return shiftMix((shiftMix(((j + jRotateRight5 + Long.rotateRight(jM11487b8, 31) + jRotateRight7) * f27919d) + ((jM11487b6 + jM11487b8 + jRotateRight4) * f27917b)) * f27917b) + jRotateRight4) * f27919d;
    }

    private static long shiftMix(long val) {
        return val ^ (val >>> 47);
    }

    private static void weakHashLength32WithSeeds(byte[] bytes, int offset, long seedA, long seedB, long[] output) {
        long jM11487b = gb9.m11487b(bytes, offset);
        long jM11487b2 = gb9.m11487b(bytes, offset + 8);
        long jM11487b3 = gb9.m11487b(bytes, offset + 16);
        long jM11487b4 = gb9.m11487b(bytes, offset + 24);
        long j = seedA + jM11487b;
        long j2 = jM11487b2 + j + jM11487b3;
        long jRotateRight = Long.rotateRight(seedB + j + jM11487b4, 51) + Long.rotateRight(j2, 23);
        output[0] = j2 + jM11487b4;
        output[1] = jRotateRight + j;
    }

    @Override // p000.lh7
    public int bits() {
        return 64;
    }

    @Override // p000.AbstractC9116m3, p000.AbstractC11839r1, p000.lh7
    public jh7 hashBytes(byte[] input, int off, int len) {
        v7d.checkPositionIndexes(off, off + len, input.length);
        return jh7.fromLong(m8762a(input, off, len));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}
