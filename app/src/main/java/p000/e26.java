package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class e26 {

    /* JADX INFO: renamed from: a */
    public static final int f31582a = 8192;

    /* JADX INFO: renamed from: e26$b */
    public static final class C5054b {

        /* JADX INFO: renamed from: a */
        public final long[] f31583a;

        /* JADX INFO: renamed from: b */
        public final int[] f31584b;

        /* JADX INFO: renamed from: c */
        public final int f31585c;

        /* JADX INFO: renamed from: d */
        public final long[] f31586d;

        /* JADX INFO: renamed from: e */
        public final int[] f31587e;

        /* JADX INFO: renamed from: f */
        public final long f31588f;

        /* JADX INFO: renamed from: g */
        public final long f31589g;

        private C5054b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j, long j2) {
            this.f31583a = jArr;
            this.f31584b = iArr;
            this.f31585c = i;
            this.f31586d = jArr2;
            this.f31587e = iArr2;
            this.f31588f = j;
            this.f31589g = j2;
        }
    }

    private e26() {
    }

    public static C5054b rechunk(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        int iCeilDivide = 0;
        for (int i4 : iArr2) {
            iCeilDivide += t0i.ceilDivide(i4, i2);
        }
        long[] jArr2 = new long[iCeilDivide];
        int[] iArr3 = new int[iCeilDivide];
        long[] jArr3 = new long[iCeilDivide];
        int[] iArr4 = new int[iCeilDivide];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int iMax = 0;
        while (i3 < iArr2.length) {
            int i8 = iArr2[i3];
            long j2 = jArr[i3];
            while (i8 > 0) {
                int iMin = Math.min(i2, i8);
                jArr2[i7] = j2;
                int i9 = i * iMin;
                iArr3[i7] = i9;
                i6 += i9;
                iMax = Math.max(iMax, i9);
                jArr3[i7] = ((long) i5) * j;
                iArr4[i7] = 1;
                j2 += (long) iArr3[i7];
                i5 += iMin;
                i8 -= iMin;
                i7++;
                i2 = i2;
            }
            i3++;
            iArr2 = iArr;
        }
        return new C5054b(jArr2, iArr3, iMax, jArr3, iArr4, j * ((long) i5), i6);
    }
}
