package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyStaggeredGridLaneInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n1#1,208:1\n1#2:209\n388#3,7:210\n388#3,7:217\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n167#1:210,7\n187#1:217,7\n*E\n"})
@e0g(parameters = 0)
public final class i29 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C7118a f45541d = new C7118a(null);

    /* JADX INFO: renamed from: e */
    public static final int f45542e = 8;

    /* JADX INFO: renamed from: f */
    public static final int f45543f = 131072;

    /* JADX INFO: renamed from: g */
    public static final int f45544g = -1;

    /* JADX INFO: renamed from: h */
    public static final int f45545h = -2;

    /* JADX INFO: renamed from: a */
    public int f45546a;

    /* JADX INFO: renamed from: b */
    @yfb
    public int[] f45547b = new int[16];

    /* JADX INFO: renamed from: c */
    @yfb
    public final e60<C7119b> f45548c = new e60<>();

    /* JADX INFO: renamed from: i29$a */
    public static final class C7118a {
        public /* synthetic */ C7118a(jt3 jt3Var) {
            this();
        }

        private C7118a() {
        }
    }

    /* JADX INFO: renamed from: i29$b */
    public static final class C7119b {

        /* JADX INFO: renamed from: a */
        public final int f45549a;

        /* JADX INFO: renamed from: b */
        @yfb
        public int[] f45550b;

        public C7119b(int i, @yfb int[] iArr) {
            this.f45549a = i;
            this.f45550b = iArr;
        }

        @yfb
        public final int[] getGaps() {
            return this.f45550b;
        }

        public final int getIndex() {
            return this.f45549a;
        }

        public final void setGaps(@yfb int[] iArr) {
            this.f45550b = iArr;
        }
    }

    /* JADX INFO: renamed from: i29$c */
    @dwf({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n+ 2 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n1#1,471:1\n187#2:472\n*E\n"})
    public static final class C7120c extends tt8 implements qy6<C7119b, Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Comparable f45551a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7120c(Comparable comparable) {
            super(1);
            this.f45551a = comparable;
        }

        @Override // p000.qy6
        @yfb
        public final Integer invoke(C7119b c7119b) {
            return Integer.valueOf(md2.compareValues(Integer.valueOf(c7119b.getIndex()), this.f45551a));
        }
    }

    /* JADX INFO: renamed from: i29$d */
    @dwf({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n+ 2 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n1#1,471:1\n167#2:472\n*E\n"})
    public static final class C7121d extends tt8 implements qy6<C7119b, Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Comparable f45552a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7121d(Comparable comparable) {
            super(1);
            this.f45552a = comparable;
        }

        @Override // p000.qy6
        @yfb
        public final Integer invoke(C7119b c7119b) {
            return Integer.valueOf(md2.compareValues(Integer.valueOf(c7119b.getIndex()), this.f45552a));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12748a(i29 i29Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        i29Var.ensureCapacity(i, i2);
    }

    private final void ensureCapacity(int i, int i2) {
        if (i > 131072) {
            throw new IllegalArgumentException(("Requested item capacity " + i + " is larger than max supported: 131072!").toString());
        }
        int[] iArr = this.f45547b;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            this.f45547b = u70.copyInto$default(this.f45547b, new int[length], i2, 0, 0, 12, (Object) null);
        }
    }

    public final boolean assignedToLane(int i, int i2) {
        int lane = getLane(i);
        return lane == i2 || lane == -1 || lane == -2;
    }

    public final void ensureValidIndex(int i) {
        int i2 = this.f45546a;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            int iMax = Math.max(i - (this.f45547b.length / 2), 0);
            this.f45546a = iMax;
            int i4 = iMax - i2;
            if (i4 >= 0) {
                int[] iArr = this.f45547b;
                if (i4 < iArr.length) {
                    u70.copyInto(iArr, iArr, 0, i4, iArr.length);
                }
                int[] iArr2 = this.f45547b;
                u70.fill(iArr2, 0, Math.max(0, iArr2.length - i4), this.f45547b.length);
            } else {
                int i5 = -i4;
                int[] iArr3 = this.f45547b;
                if (iArr3.length + i5 < 131072) {
                    ensureCapacity(iArr3.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr3.length) {
                        u70.copyInto(iArr3, iArr3, i5, 0, iArr3.length - i5);
                    }
                    int[] iArr4 = this.f45547b;
                    u70.fill(iArr4, 0, 0, Math.min(iArr4.length, i5));
                }
            }
        } else {
            m12748a(this, i3 + 1, 0, 2, null);
        }
        while (!this.f45548c.isEmpty() && this.f45548c.first().getIndex() < lowerBound()) {
            this.f45548c.removeFirst();
        }
        while (!this.f45548c.isEmpty() && this.f45548c.last().getIndex() > upperBound()) {
            this.f45548c.removeLast();
        }
    }

    public final int findNextItemIndex(int i, int i2) {
        int iUpperBound = upperBound();
        for (int i3 = i + 1; i3 < iUpperBound; i3++) {
            if (assignedToLane(i3, i2)) {
                return i3;
            }
        }
        return upperBound();
    }

    public final int findPreviousItemIndex(int i, int i2) {
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!assignedToLane(i, i2));
        return i;
    }

    @gib
    public final int[] getGaps(int i) {
        e60<C7119b> e60Var = this.f45548c;
        C7119b c7119b = (C7119b) v82.getOrNull(this.f45548c, l82.binarySearch(e60Var, 0, e60Var.size(), new C7120c(Integer.valueOf(i))));
        if (c7119b != null) {
            return c7119b.getGaps();
        }
        return null;
    }

    public final int getLane(int i) {
        if (i < lowerBound() || i >= upperBound()) {
            return -1;
        }
        return this.f45547b[i - this.f45546a] - 1;
    }

    public final int lowerBound() {
        return this.f45546a;
    }

    public final void reset() {
        u70.fill$default(this.f45547b, 0, 0, 0, 6, (Object) null);
        this.f45548c.clear();
    }

    public final void setGaps(int i, @gib int[] iArr) {
        e60<C7119b> e60Var = this.f45548c;
        int iBinarySearch = l82.binarySearch(e60Var, 0, e60Var.size(), new C7121d(Integer.valueOf(i)));
        if (iBinarySearch < 0) {
            if (iArr == null) {
                return;
            }
            this.f45548c.add(-(iBinarySearch + 1), new C7119b(i, iArr));
            return;
        }
        if (iArr == null) {
            this.f45548c.remove(iBinarySearch);
        } else {
            this.f45548c.get(iBinarySearch).setGaps(iArr);
        }
    }

    public final void setLane(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative lanes are not supported");
        }
        ensureValidIndex(i);
        this.f45547b[i - this.f45546a] = i2 + 1;
    }

    public final int upperBound() {
        return this.f45546a + this.f45547b.length;
    }
}
