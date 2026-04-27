package p000;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import p000.p81;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@xx4
public abstract class u81 implements p81.InterfaceC10832c {

    /* JADX INFO: renamed from: a */
    public static final u81 f87029a = new C13396a("MURMUR128_MITZ_32", 0);

    /* JADX INFO: renamed from: b */
    public static final u81 f87030b = new u81("MURMUR128_MITZ_64", 1) { // from class: u81.b
        {
            C13396a c13396a = null;
        }

        private long lowerEight(byte[] bytes) {
            return im9.fromBytes(bytes[7], bytes[6], bytes[5], bytes[4], bytes[3], bytes[2], bytes[1], bytes[0]);
        }

        private long upperEight(byte[] bytes) {
            return im9.fromBytes(bytes[15], bytes[14], bytes[13], bytes[12], bytes[11], bytes[10], bytes[9], bytes[8]);
        }

        @Override // p000.p81.InterfaceC10832c
        public <T> boolean mightContain(@hgc T object, s07<? super T> funnel, int numHashFunctions, C13398c bits) {
            long jM23128b = bits.m23128b();
            byte[] bArrMo14083c = xh7.murmur3_128().hashObject(object, funnel).mo14083c();
            long jLowerEight = lowerEight(bArrMo14083c);
            long jUpperEight = upperEight(bArrMo14083c);
            for (int i = 0; i < numHashFunctions; i++) {
                if (!bits.m23131e((Long.MAX_VALUE & jLowerEight) % jM23128b)) {
                    return false;
                }
                jLowerEight += jUpperEight;
            }
            return true;
        }

        @Override // p000.p81.InterfaceC10832c
        public <T> boolean put(@hgc T object, s07<? super T> funnel, int numHashFunctions, C13398c bits) {
            long jM23128b = bits.m23128b();
            byte[] bArrMo14083c = xh7.murmur3_128().hashObject(object, funnel).mo14083c();
            long jLowerEight = lowerEight(bArrMo14083c);
            long jUpperEight = upperEight(bArrMo14083c);
            boolean zM23134h = false;
            for (int i = 0; i < numHashFunctions; i++) {
                zM23134h |= bits.m23134h((Long.MAX_VALUE & jLowerEight) % jM23128b);
                jLowerEight += jUpperEight;
            }
            return zM23134h;
        }
    };

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ u81[] f87031c = $values();

    /* JADX INFO: renamed from: u81$a */
    public enum C13396a extends u81 {
        public C13396a(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }

        @Override // p000.p81.InterfaceC10832c
        public <T> boolean mightContain(@hgc T object, s07<? super T> funnel, int numHashFunctions, C13398c bits) {
            long jM23128b = bits.m23128b();
            long jAsLong = xh7.murmur3_128().hashObject(object, funnel).asLong();
            int i = (int) jAsLong;
            int i2 = (int) (jAsLong >>> 32);
            for (int i3 = 1; i3 <= numHashFunctions; i3++) {
                int i4 = (i3 * i2) + i;
                if (i4 < 0) {
                    i4 = ~i4;
                }
                if (!bits.m23131e(((long) i4) % jM23128b)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p000.p81.InterfaceC10832c
        public <T> boolean put(@hgc T object, s07<? super T> funnel, int numHashFunctions, C13398c bits) {
            long jM23128b = bits.m23128b();
            long jAsLong = xh7.murmur3_128().hashObject(object, funnel).asLong();
            int i = (int) jAsLong;
            int i2 = (int) (jAsLong >>> 32);
            boolean zM23134h = false;
            for (int i3 = 1; i3 <= numHashFunctions; i3++) {
                int i4 = (i3 * i2) + i;
                if (i4 < 0) {
                    i4 = ~i4;
                }
                zM23134h |= bits.m23134h(((long) i4) % jM23128b);
            }
            return zM23134h;
        }
    }

    private static /* synthetic */ u81[] $values() {
        return new u81[]{f87029a, f87030b};
    }

    private u81(String $enum$name, int $enum$ordinal) {
    }

    public static u81 valueOf(String name) {
        return (u81) Enum.valueOf(u81.class, name);
    }

    public static u81[] values() {
        return (u81[]) f87031c.clone();
    }

    public /* synthetic */ u81(String str, int i, C13396a c13396a) {
        this(str, i);
    }

    /* JADX INFO: renamed from: u81$c */
    public static final class C13398c {

        /* JADX INFO: renamed from: c */
        public static final int f87032c = 6;

        /* JADX INFO: renamed from: a */
        public final AtomicLongArray f87033a;

        /* JADX INFO: renamed from: b */
        public final ik9 f87034b;

        public C13398c(long bits) {
            v7d.checkArgument(bits > 0, "data length is zero!");
            this.f87033a = new AtomicLongArray(rd8.checkedCast(nl9.divide(bits, 64L, RoundingMode.CEILING)));
            this.f87034b = lk9.create();
        }

        public static long[] toPlainArray(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        /* JADX INFO: renamed from: a */
        public long m23127a() {
            return this.f87034b.sum();
        }

        /* JADX INFO: renamed from: b */
        public long m23128b() {
            return ((long) this.f87033a.length()) * 64;
        }

        /* JADX INFO: renamed from: c */
        public C13398c m23129c() {
            return new C13398c(toPlainArray(this.f87033a));
        }

        /* JADX INFO: renamed from: d */
        public int m23130d() {
            return this.f87033a.length();
        }

        /* JADX INFO: renamed from: e */
        public boolean m23131e(long bitIndex) {
            return ((1 << ((int) bitIndex)) & this.f87033a.get((int) (bitIndex >>> 6))) != 0;
        }

        public boolean equals(@wx1 Object o) {
            if (o instanceof C13398c) {
                return Arrays.equals(toPlainArray(this.f87033a), toPlainArray(((C13398c) o).f87033a));
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public void m23132f(C13398c other) {
            v7d.checkArgument(this.f87033a.length() == other.f87033a.length(), "BitArrays must be of equal length (%s != %s)", this.f87033a.length(), other.f87033a.length());
            for (int i = 0; i < this.f87033a.length(); i++) {
                m23133g(i, other.f87033a.get(i));
            }
        }

        /* JADX INFO: renamed from: g */
        public void m23133g(int i, long longValue) {
            long j;
            long j2;
            do {
                j = this.f87033a.get(i);
                j2 = j | longValue;
                if (j == j2) {
                    return;
                }
            } while (!this.f87033a.compareAndSet(i, j, j2));
            this.f87034b.add(Long.bitCount(j2) - Long.bitCount(j));
        }

        /* JADX INFO: renamed from: h */
        public boolean m23134h(long bitIndex) {
            long j;
            long j2;
            if (m23131e(bitIndex)) {
                return false;
            }
            int i = (int) (bitIndex >>> 6);
            long j3 = 1 << ((int) bitIndex);
            do {
                j = this.f87033a.get(i);
                j2 = j | j3;
                if (j == j2) {
                    return false;
                }
            } while (!this.f87033a.compareAndSet(i, j, j2));
            this.f87034b.increment();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(toPlainArray(this.f87033a));
        }

        public C13398c(long[] data) {
            v7d.checkArgument(data.length > 0, "data length is zero!");
            this.f87033a = new AtomicLongArray(data);
            this.f87034b = lk9.create();
            long jBitCount = 0;
            for (long j : data) {
                jBitCount += (long) Long.bitCount(j);
            }
            this.f87034b.add(jBitCount);
        }
    }
}
