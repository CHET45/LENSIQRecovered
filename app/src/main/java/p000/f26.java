package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f26 {

    /* JADX INFO: renamed from: a */
    public static final int f34868a = 8192;

    /* JADX INFO: renamed from: f26$b */
    public static final class C5560b {

        /* JADX INFO: renamed from: a */
        public final long[] f34869a;

        /* JADX INFO: renamed from: b */
        public final int[] f34870b;

        /* JADX INFO: renamed from: c */
        public final int f34871c;

        /* JADX INFO: renamed from: d */
        public final long[] f34872d;

        /* JADX INFO: renamed from: e */
        public final int[] f34873e;

        /* JADX INFO: renamed from: f */
        public final long f34874f;

        private C5560b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f34869a = jArr;
            this.f34870b = iArr;
            this.f34871c = i;
            this.f34872d = jArr2;
            this.f34873e = iArr2;
            this.f34874f = j;
        }
    }

    private f26() {
    }

    public static C5560b rechunk(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int iCeilDivide = 0;
        for (int i3 : iArr) {
            iCeilDivide += x0i.ceilDivide(i3, i2);
        }
        long[] jArr2 = new long[iCeilDivide];
        int[] iArr2 = new int[iCeilDivide];
        long[] jArr3 = new long[iCeilDivide];
        int[] iArr3 = new int[iCeilDivide];
        int i4 = 0;
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            long j2 = jArr[i6];
            while (i7 > 0) {
                int iMin = Math.min(i2, i7);
                jArr2[i5] = j2;
                int i8 = i * iMin;
                iArr2[i5] = i8;
                iMax = Math.max(iMax, i8);
                jArr3[i5] = ((long) i4) * j;
                iArr3[i5] = 1;
                j2 += (long) iArr2[i5];
                i4 += iMin;
                i7 -= iMin;
                i5++;
            }
        }
        return new C5560b(jArr2, iArr2, iMax, jArr3, iArr3, j * ((long) i4));
    }
}
