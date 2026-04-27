package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
@dwf({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
public abstract class tod {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C13130a f85517a = new C13130a(null);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final tod f85518b = dxc.f31254a.defaultPlatformRandom();

    /* JADX INFO: renamed from: tod$a */
    public static final class C13130a extends tod implements Serializable {

        /* JADX INFO: renamed from: tod$a$a */
        public static final class a implements Serializable {

            /* JADX INFO: renamed from: a */
            @yfb
            public static final a f85519a = new a();
            private static final long serialVersionUID = 0;

            private a() {
            }

            private final Object readResolve() {
                return tod.f85517a;
            }
        }

        public /* synthetic */ C13130a(jt3 jt3Var) {
            this();
        }

        private final Object writeReplace() {
            return a.f85519a;
        }

        @Override // p000.tod
        public int nextBits(int i) {
            return tod.f85518b.nextBits(i);
        }

        @Override // p000.tod
        public boolean nextBoolean() {
            return tod.f85518b.nextBoolean();
        }

        @Override // p000.tod
        @yfb
        public byte[] nextBytes(@yfb byte[] bArr) {
            md8.checkNotNullParameter(bArr, "array");
            return tod.f85518b.nextBytes(bArr);
        }

        @Override // p000.tod
        public double nextDouble() {
            return tod.f85518b.nextDouble();
        }

        @Override // p000.tod
        public float nextFloat() {
            return tod.f85518b.nextFloat();
        }

        @Override // p000.tod
        public int nextInt() {
            return tod.f85518b.nextInt();
        }

        @Override // p000.tod
        public long nextLong() {
            return tod.f85518b.nextLong();
        }

        private C13130a() {
        }

        @Override // p000.tod
        @yfb
        public byte[] nextBytes(int i) {
            return tod.f85518b.nextBytes(i);
        }

        @Override // p000.tod
        public double nextDouble(double d) {
            return tod.f85518b.nextDouble(d);
        }

        @Override // p000.tod
        public int nextInt(int i) {
            return tod.f85518b.nextInt(i);
        }

        @Override // p000.tod
        public long nextLong(long j) {
            return tod.f85518b.nextLong(j);
        }

        @Override // p000.tod
        @yfb
        public byte[] nextBytes(@yfb byte[] bArr, int i, int i2) {
            md8.checkNotNullParameter(bArr, "array");
            return tod.f85518b.nextBytes(bArr, i, i2);
        }

        @Override // p000.tod
        public double nextDouble(double d, double d2) {
            return tod.f85518b.nextDouble(d, d2);
        }

        @Override // p000.tod
        public int nextInt(int i, int i2) {
            return tod.f85518b.nextInt(i, i2);
        }

        @Override // p000.tod
        public long nextLong(long j, long j2) {
            return tod.f85518b.nextLong(j, j2);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(tod todVar, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return todVar.nextBytes(bArr, i, i2);
    }

    public abstract int nextBits(int i);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    @yfb
    public byte[] nextBytes(@yfb byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "array");
        if (i < 0 || i > bArr.length || i2 < 0 || i2 > bArr.length) {
            throw new IllegalArgumentException(("fromIndex (" + i + ") or toIndex (" + i2 + ") are out of range: 0.." + bArr.length + a18.f100c).toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(("fromIndex (" + i + ") must be not greater than toIndex (" + i2 + ").").toString());
        }
        int i3 = (i2 - i) / 4;
        for (int i4 = 0; i4 < i3; i4++) {
            int iNextInt = nextInt();
            bArr[i] = (byte) iNextInt;
            bArr[i + 1] = (byte) (iNextInt >>> 8);
            bArr[i + 2] = (byte) (iNextInt >>> 16);
            bArr[i + 3] = (byte) (iNextInt >>> 24);
            i += 4;
        }
        int i5 = i2 - i;
        int iNextBits = nextBits(i5 * 8);
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i + i6] = (byte) (iNextBits >>> (i6 * 8));
        }
        return bArr;
    }

    public double nextDouble() {
        return oxc.doubleFromParts(nextBits(26), nextBits(27));
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public double nextDouble(double d) {
        return nextDouble(0.0d, d);
    }

    public int nextInt(int i) {
        return nextInt(0, i);
    }

    public long nextLong(long j) {
        return nextLong(0L, j);
    }

    public double nextDouble(double d, double d2) {
        double dNextDouble;
        vod.checkRangeBounds(d, d2);
        double d3 = d2 - d;
        if (Double.isInfinite(d3) && !Double.isInfinite(d) && !Double.isNaN(d) && !Double.isInfinite(d2) && !Double.isNaN(d2)) {
            double d4 = 2;
            double dNextDouble2 = nextDouble() * ((d2 / d4) - (d / d4));
            dNextDouble = d + dNextDouble2 + dNextDouble2;
        } else {
            dNextDouble = d + (nextDouble() * d3);
        }
        return dNextDouble >= d2 ? Math.nextAfter(d2, Double.NEGATIVE_INFINITY) : dNextDouble;
    }

    public int nextInt(int i, int i2) {
        int iNextInt;
        int i3;
        int iNextBits;
        vod.checkRangeBounds(i, i2);
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iNextBits = nextBits(vod.fastLog2(i4));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i3 = iNextInt % i4;
                } while ((iNextInt - i3) + (i4 - 1) < 0);
                iNextBits = i3;
            }
            return i + iNextBits;
        }
        while (true) {
            int iNextInt2 = nextInt();
            if (i <= iNextInt2 && iNextInt2 < i2) {
                return iNextInt2;
            }
        }
    }

    public long nextLong(long j, long j2) {
        long jNextLong;
        long j3;
        long jNextBits;
        int iNextInt;
        vod.checkRangeBounds(j, j2);
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iNextInt = nextBits(vod.fastLog2(i));
                } else if (i2 == 1) {
                    iNextInt = nextInt();
                } else {
                    jNextBits = (((long) nextBits(vod.fastLog2(i2))) << 32) + (((long) nextInt()) & 4294967295L);
                }
                jNextBits = ((long) iNextInt) & 4294967295L;
            } else {
                do {
                    jNextLong = nextLong() >>> 1;
                    j3 = jNextLong % j4;
                } while ((jNextLong - j3) + (j4 - 1) < 0);
                jNextBits = j3;
            }
            return j + jNextBits;
        }
        while (true) {
            long jNextLong2 = nextLong();
            if (j <= jNextLong2 && jNextLong2 < j2) {
                return jNextLong2;
            }
        }
    }

    @yfb
    public byte[] nextBytes(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "array");
        return nextBytes(bArr, 0, bArr.length);
    }

    @yfb
    public byte[] nextBytes(int i) {
        return nextBytes(new byte[i]);
    }
}
