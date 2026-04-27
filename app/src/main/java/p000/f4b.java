package p000;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@tw7
public final class f4b extends AbstractC11839r1 implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final lh7 f35317b = new f4b(0);

    /* JADX INFO: renamed from: c */
    public static final lh7 f35318c = new f4b(xh7.f97830a);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final int f35319a;

    /* JADX INFO: renamed from: f4b$a */
    public static final class C5593a extends AbstractC15483y4 {

        /* JADX INFO: renamed from: g */
        public static final int f35320g = 16;

        /* JADX INFO: renamed from: h */
        public static final long f35321h = -8663945395140668459L;

        /* JADX INFO: renamed from: i */
        public static final long f35322i = 5545529020109919103L;

        /* JADX INFO: renamed from: d */
        public long f35323d;

        /* JADX INFO: renamed from: e */
        public long f35324e;

        /* JADX INFO: renamed from: f */
        public int f35325f;

        public C5593a(int seed) {
            super(16);
            long j = seed;
            this.f35323d = j;
            this.f35324e = j;
            this.f35325f = 0;
        }

        private void bmix64(long k1, long k2) {
            long jMixK1 = mixK1(k1) ^ this.f35323d;
            this.f35323d = jMixK1;
            long jRotateLeft = Long.rotateLeft(jMixK1, 27);
            long j = this.f35324e;
            this.f35323d = ((jRotateLeft + j) * 5) + 1390208809;
            long jMixK2 = mixK2(k2) ^ j;
            this.f35324e = jMixK2;
            this.f35324e = ((Long.rotateLeft(jMixK2, 31) + this.f35323d) * 5) + 944331445;
        }

        private static long fmix64(long k) {
            long j = (k ^ (k >>> 33)) * (-49064778989728563L);
            long j2 = (j ^ (j >>> 33)) * (-4265267296055464877L);
            return j2 ^ (j2 >>> 33);
        }

        private static long mixK1(long k1) {
            return Long.rotateLeft(k1 * f35321h, 31) * f35322i;
        }

        private static long mixK2(long k2) {
            return Long.rotateLeft(k2 * f35322i, 33) * f35321h;
        }

        @Override // p000.AbstractC15483y4
        /* JADX INFO: renamed from: a */
        public jh7 mo10527a() {
            long j = this.f35323d;
            int i = this.f35325f;
            long j2 = j ^ ((long) i);
            long j3 = this.f35324e ^ ((long) i);
            long j4 = j2 + j3;
            this.f35323d = j4;
            this.f35324e = j3 + j4;
            this.f35323d = fmix64(j4);
            long jFmix64 = fmix64(this.f35324e);
            long j5 = this.f35323d + jFmix64;
            this.f35323d = j5;
            this.f35324e = jFmix64 + j5;
            return jh7.m14081b(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f35323d).putLong(this.f35324e).array());
        }

        @Override // p000.AbstractC15483y4
        /* JADX INFO: renamed from: b */
        public void mo10528b(ByteBuffer bb) {
            bmix64(bb.getLong(), bb.getLong());
            this.f35325f += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // p000.AbstractC15483y4
        /* JADX INFO: renamed from: c */
        public void mo10529c(ByteBuffer bb) {
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            this.f35325f += bb.remaining();
            long j8 = 0;
            switch (bb.remaining()) {
                case 1:
                    j = 0;
                    j7 = j ^ ((long) hvh.toInt(bb.get(0)));
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                case 2:
                    j2 = 0;
                    j = j2 ^ (((long) hvh.toInt(bb.get(1))) << 8);
                    j7 = j ^ ((long) hvh.toInt(bb.get(0)));
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                case 3:
                    j3 = 0;
                    j2 = (((long) hvh.toInt(bb.get(2))) << 16) ^ j3;
                    j = j2 ^ (((long) hvh.toInt(bb.get(1))) << 8);
                    j7 = j ^ ((long) hvh.toInt(bb.get(0)));
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                case 4:
                    j4 = 0;
                    j3 = j4 ^ (((long) hvh.toInt(bb.get(3))) << 24);
                    j2 = (((long) hvh.toInt(bb.get(2))) << 16) ^ j3;
                    j = j2 ^ (((long) hvh.toInt(bb.get(1))) << 8);
                    j7 = j ^ ((long) hvh.toInt(bb.get(0)));
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                case 5:
                    j5 = 0;
                    j4 = j5 ^ (((long) hvh.toInt(bb.get(4))) << 32);
                    j3 = j4 ^ (((long) hvh.toInt(bb.get(3))) << 24);
                    j2 = (((long) hvh.toInt(bb.get(2))) << 16) ^ j3;
                    j = j2 ^ (((long) hvh.toInt(bb.get(1))) << 8);
                    j7 = j ^ ((long) hvh.toInt(bb.get(0)));
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                case 6:
                    j6 = 0;
                    j5 = (((long) hvh.toInt(bb.get(5))) << 40) ^ j6;
                    j4 = j5 ^ (((long) hvh.toInt(bb.get(4))) << 32);
                    j3 = j4 ^ (((long) hvh.toInt(bb.get(3))) << 24);
                    j2 = (((long) hvh.toInt(bb.get(2))) << 16) ^ j3;
                    j = j2 ^ (((long) hvh.toInt(bb.get(1))) << 8);
                    j7 = j ^ ((long) hvh.toInt(bb.get(0)));
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                case 7:
                    j6 = ((long) hvh.toInt(bb.get(6))) << 48;
                    j5 = (((long) hvh.toInt(bb.get(5))) << 40) ^ j6;
                    j4 = j5 ^ (((long) hvh.toInt(bb.get(4))) << 32);
                    j3 = j4 ^ (((long) hvh.toInt(bb.get(3))) << 24);
                    j2 = (((long) hvh.toInt(bb.get(2))) << 16) ^ j3;
                    j = j2 ^ (((long) hvh.toInt(bb.get(1))) << 8);
                    j7 = j ^ ((long) hvh.toInt(bb.get(0)));
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                case 8:
                    j7 = bb.getLong();
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                case 9:
                    j8 ^= (long) hvh.toInt(bb.get(8));
                    j7 = bb.getLong();
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                case 10:
                    j8 ^= ((long) hvh.toInt(bb.get(9))) << 8;
                    j8 ^= (long) hvh.toInt(bb.get(8));
                    j7 = bb.getLong();
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                case 11:
                    j8 ^= ((long) hvh.toInt(bb.get(10))) << 16;
                    j8 ^= ((long) hvh.toInt(bb.get(9))) << 8;
                    j8 ^= (long) hvh.toInt(bb.get(8));
                    j7 = bb.getLong();
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                case 12:
                    j8 ^= ((long) hvh.toInt(bb.get(11))) << 24;
                    j8 ^= ((long) hvh.toInt(bb.get(10))) << 16;
                    j8 ^= ((long) hvh.toInt(bb.get(9))) << 8;
                    j8 ^= (long) hvh.toInt(bb.get(8));
                    j7 = bb.getLong();
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                case 13:
                    j8 ^= ((long) hvh.toInt(bb.get(12))) << 32;
                    j8 ^= ((long) hvh.toInt(bb.get(11))) << 24;
                    j8 ^= ((long) hvh.toInt(bb.get(10))) << 16;
                    j8 ^= ((long) hvh.toInt(bb.get(9))) << 8;
                    j8 ^= (long) hvh.toInt(bb.get(8));
                    j7 = bb.getLong();
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                case 14:
                    j8 ^= ((long) hvh.toInt(bb.get(13))) << 40;
                    j8 ^= ((long) hvh.toInt(bb.get(12))) << 32;
                    j8 ^= ((long) hvh.toInt(bb.get(11))) << 24;
                    j8 ^= ((long) hvh.toInt(bb.get(10))) << 16;
                    j8 ^= ((long) hvh.toInt(bb.get(9))) << 8;
                    j8 ^= (long) hvh.toInt(bb.get(8));
                    j7 = bb.getLong();
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                case 15:
                    j8 = ((long) hvh.toInt(bb.get(14))) << 48;
                    j8 ^= ((long) hvh.toInt(bb.get(13))) << 40;
                    j8 ^= ((long) hvh.toInt(bb.get(12))) << 32;
                    j8 ^= ((long) hvh.toInt(bb.get(11))) << 24;
                    j8 ^= ((long) hvh.toInt(bb.get(10))) << 16;
                    j8 ^= ((long) hvh.toInt(bb.get(9))) << 8;
                    j8 ^= (long) hvh.toInt(bb.get(8));
                    j7 = bb.getLong();
                    this.f35323d = mixK1(j7) ^ this.f35323d;
                    this.f35324e ^= mixK2(j8);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    public f4b(int seed) {
        this.f35319a = seed;
    }

    @Override // p000.lh7
    public int bits() {
        return 128;
    }

    public boolean equals(@wx1 Object object) {
        return (object instanceof f4b) && this.f35319a == ((f4b) object).f35319a;
    }

    public int hashCode() {
        return f4b.class.hashCode() ^ this.f35319a;
    }

    @Override // p000.lh7
    public wh7 newHasher() {
        return new C5593a(this.f35319a);
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.f35319a + c0b.f15434d;
    }
}
