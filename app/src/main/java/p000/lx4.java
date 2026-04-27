package p000;

/* JADX INFO: loaded from: classes7.dex */
@i03
public final class lx4 {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C9027a f59134e = new C9027a(null);

    /* JADX INFO: renamed from: f */
    @yfb
    public static final long[] f59135f = new long[0];

    /* JADX INFO: renamed from: a */
    @yfb
    public final f0f f59136a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final gz6<f0f, Integer, Boolean> f59137b;

    /* JADX INFO: renamed from: c */
    public long f59138c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final long[] f59139d;

    /* JADX INFO: renamed from: lx4$a */
    public static final class C9027a {
        public /* synthetic */ C9027a(jt3 jt3Var) {
            this();
        }

        private C9027a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lx4(@yfb f0f f0fVar, @yfb gz6<? super f0f, ? super Integer, Boolean> gz6Var) {
        md8.checkNotNullParameter(f0fVar, "descriptor");
        md8.checkNotNullParameter(gz6Var, "readIfAbsent");
        this.f59136a = f0fVar;
        this.f59137b = gz6Var;
        int elementsCount = f0fVar.getElementsCount();
        if (elementsCount <= 64) {
            this.f59138c = elementsCount != 64 ? (-1) << elementsCount : 0L;
            this.f59139d = f59135f;
        } else {
            this.f59138c = 0L;
            this.f59139d = prepareHighMarksArray(elementsCount);
        }
    }

    private final void markHigh(int i) {
        int i2 = (i >>> 6) - 1;
        long[] jArr = this.f59139d;
        jArr[i2] = jArr[i2] | (1 << (i & 63));
    }

    private final int nextUnmarkedHighIndex() {
        int length = this.f59139d.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = i2 * 64;
            long j = this.f59139d[i];
            while (j != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                j |= 1 << iNumberOfTrailingZeros;
                int i4 = iNumberOfTrailingZeros + i3;
                if (this.f59137b.invoke(this.f59136a, Integer.valueOf(i4)).booleanValue()) {
                    this.f59139d[i] = j;
                    return i4;
                }
            }
            this.f59139d[i] = j;
            i = i2;
        }
        return -1;
    }

    private final long[] prepareHighMarksArray(int i) {
        long[] jArr = new long[(i - 1) >>> 6];
        if ((i & 63) != 0) {
            jArr[e80.getLastIndex(jArr)] = (-1) << i;
        }
        return jArr;
    }

    public final void mark(int i) {
        if (i < 64) {
            this.f59138c |= 1 << i;
        } else {
            markHigh(i);
        }
    }

    public final int nextUnmarkedIndex() {
        int iNumberOfTrailingZeros;
        int elementsCount = this.f59136a.getElementsCount();
        do {
            long j = this.f59138c;
            if (j == -1) {
                if (elementsCount > 64) {
                    return nextUnmarkedHighIndex();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.f59138c |= 1 << iNumberOfTrailingZeros;
        } while (!this.f59137b.invoke(this.f59136a, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
