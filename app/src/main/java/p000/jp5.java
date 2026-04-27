package p000;

/* JADX INFO: loaded from: classes5.dex */
@xx4
public final class jp5 extends AbstractC9116m3 {

    /* JADX INFO: renamed from: a */
    public static final lh7 f51385a = new jp5();

    /* JADX INFO: renamed from: b */
    public static final long f51386b = -4348849565147123417L;

    /* JADX INFO: renamed from: c */
    public static final long f51387c = -5435081209227447693L;

    /* JADX INFO: renamed from: d */
    public static final long f51388d = -7286425919675154353L;

    @gdi
    /* JADX INFO: renamed from: a */
    public static long m14228a(byte[] bytes, int offset, int length) {
        return length <= 32 ? length <= 16 ? hashLength0to16(bytes, offset, length) : hashLength17to32(bytes, offset, length) : length <= 64 ? hashLength33To64(bytes, offset, length) : hashLength65Plus(bytes, offset, length);
    }

    private static long hashLength0to16(byte[] bytes, int offset, int length) {
        if (length >= 8) {
            long j = (((long) length) * 2) + f51388d;
            long jM11487b = gb9.m11487b(bytes, offset) + f51388d;
            long jM11487b2 = gb9.m11487b(bytes, (offset + length) - 8);
            return hashLength16((Long.rotateRight(jM11487b2, 37) * j) + jM11487b, (Long.rotateRight(jM11487b, 25) + jM11487b2) * j, j);
        }
        if (length >= 4) {
            return hashLength16(((long) length) + ((((long) gb9.m11486a(bytes, offset)) & 4294967295L) << 3), ((long) gb9.m11486a(bytes, (offset + length) - 4)) & 4294967295L, ((long) (length * 2)) + f51388d);
        }
        if (length <= 0) {
            return f51388d;
        }
        return shiftMix((((long) ((bytes[offset] & 255) + ((bytes[(length >> 1) + offset] & 255) << 8))) * f51388d) ^ (((long) (length + ((bytes[offset + (length - 1)] & 255) << 2))) * f51386b)) * f51388d;
    }

    private static long hashLength16(long u, long v, long mul) {
        long j = (u ^ v) * mul;
        long j2 = ((j ^ (j >>> 47)) ^ v) * mul;
        return (j2 ^ (j2 >>> 47)) * mul;
    }

    private static long hashLength17to32(byte[] bytes, int offset, int length) {
        long j = (((long) length) * 2) + f51388d;
        long jM11487b = gb9.m11487b(bytes, offset) * f51387c;
        long jM11487b2 = gb9.m11487b(bytes, offset + 8);
        int i = offset + length;
        long jM11487b3 = gb9.m11487b(bytes, i - 8) * j;
        return hashLength16((gb9.m11487b(bytes, i - 16) * f51388d) + Long.rotateRight(jM11487b + jM11487b2, 43) + Long.rotateRight(jM11487b3, 30), jM11487b3 + jM11487b + Long.rotateRight(jM11487b2 + f51388d, 18), j);
    }

    private static long hashLength33To64(byte[] bytes, int offset, int length) {
        long j = (((long) length) * 2) + f51388d;
        long jM11487b = gb9.m11487b(bytes, offset) * f51388d;
        long jM11487b2 = gb9.m11487b(bytes, offset + 8);
        int i = offset + length;
        long jM11487b3 = gb9.m11487b(bytes, i - 8) * j;
        long jRotateRight = Long.rotateRight(jM11487b + jM11487b2, 43) + Long.rotateRight(jM11487b3, 30) + (gb9.m11487b(bytes, i - 16) * f51388d);
        long jHashLength16 = hashLength16(jRotateRight, jM11487b3 + Long.rotateRight(jM11487b2 + f51388d, 18) + jM11487b, j);
        long jM11487b4 = gb9.m11487b(bytes, offset + 16) * j;
        long jM11487b5 = gb9.m11487b(bytes, offset + 24);
        long jM11487b6 = (jRotateRight + gb9.m11487b(bytes, i - 32)) * j;
        return hashLength16(((jHashLength16 + gb9.m11487b(bytes, i - 24)) * j) + Long.rotateRight(jM11487b4 + jM11487b5, 43) + Long.rotateRight(jM11487b6, 30), jM11487b4 + Long.rotateRight(jM11487b5 + jM11487b, 18) + jM11487b6, j);
    }

    private static long hashLength65Plus(byte[] bytes, int offset, int length) {
        long j = 81;
        long j2 = (j * f51387c) + 113;
        long jShiftMix = shiftMix((j2 * f51388d) + 113) * f51388d;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jM11487b = (j * f51388d) + gb9.m11487b(bytes, offset);
        int i = length - 1;
        int i2 = offset + ((i / 64) * 64);
        int i3 = i & 63;
        int i4 = i2 + i3;
        int i5 = i4 - 63;
        int i6 = offset;
        while (true) {
            long jRotateRight = Long.rotateRight(jM11487b + j2 + jArr[0] + gb9.m11487b(bytes, i6 + 8), 37) * f51387c;
            long jRotateRight2 = Long.rotateRight(j2 + jArr[1] + gb9.m11487b(bytes, i6 + 48), 42) * f51387c;
            long j3 = jRotateRight ^ jArr2[1];
            long jM11487b2 = jRotateRight2 + jArr[0] + gb9.m11487b(bytes, i6 + 40);
            long jRotateRight3 = Long.rotateRight(jShiftMix + jArr2[0], 33) * f51387c;
            weakHashLength32WithSeeds(bytes, i6, jArr[1] * f51387c, j3 + jArr2[0], jArr);
            weakHashLength32WithSeeds(bytes, i6 + 32, jRotateRight3 + jArr2[1], jM11487b2 + gb9.m11487b(bytes, i6 + 16), jArr2);
            int i7 = i6 + 64;
            if (i7 == i2) {
                long j4 = f51387c + ((j3 & 255) << 1);
                long j5 = jArr2[0] + ((long) i3);
                jArr2[0] = j5;
                long j6 = jArr[0] + j5;
                jArr[0] = j6;
                jArr2[0] = jArr2[0] + j6;
                long jRotateRight4 = Long.rotateRight(jRotateRight3 + jM11487b2 + jArr[0] + gb9.m11487b(bytes, i4 - 55), 37) * j4;
                long jRotateRight5 = Long.rotateRight(jM11487b2 + jArr[1] + gb9.m11487b(bytes, i4 - 15), 42) * j4;
                long j7 = jRotateRight4 ^ (jArr2[1] * 9);
                long jM11487b3 = jRotateRight5 + (jArr[0] * 9) + gb9.m11487b(bytes, i4 - 23);
                long jRotateRight6 = Long.rotateRight(j3 + jArr2[0], 33) * j4;
                weakHashLength32WithSeeds(bytes, i5, jArr[1] * j4, j7 + jArr2[0], jArr);
                weakHashLength32WithSeeds(bytes, i4 - 31, jRotateRight6 + jArr2[1], jM11487b3 + gb9.m11487b(bytes, i4 - 47), jArr2);
                return hashLength16(hashLength16(jArr[0], jArr2[0], j4) + (shiftMix(jM11487b3) * f51386b) + j7, hashLength16(jArr[1], jArr2[1], j4) + jRotateRight6, j4);
            }
            i6 = i7;
            jShiftMix = j3;
            j2 = jM11487b2;
            jM11487b = jRotateRight3;
        }
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
        long jRotateRight = Long.rotateRight(seedB + j + jM11487b4, 21) + Long.rotateRight(j2, 44);
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
        return jh7.fromLong(m14228a(input, off, len));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
