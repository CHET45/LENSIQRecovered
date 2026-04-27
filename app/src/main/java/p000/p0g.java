package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface p0g {

    /* JADX INFO: renamed from: p0g$a */
    @dwf({"SMAP\nLazyStaggeredGridCells.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n148#2:159\n1#3:160\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Adaptive\n*L\n87#1:159\n*E\n"})
    @e0g(parameters = 1)
    public static final class C10740a implements p0g {

        /* JADX INFO: renamed from: b */
        public static final int f69343b = 0;

        /* JADX INFO: renamed from: a */
        public final float f69344a;

        public /* synthetic */ C10740a(float f, jt3 jt3Var) {
            this(f);
        }

        @Override // p000.p0g
        @yfb
        public int[] calculateCrossAxisCellSizes(@yfb c64 c64Var, int i, int i2) {
            return x19.calculateCellsCrossAxisSizeImpl(i, Math.max((i + i2) / (c64Var.mo27167roundToPx0680j_4(this.f69344a) + i2), 1), i2);
        }

        public boolean equals(@gib Object obj) {
            return (obj instanceof C10740a) && kn4.m30710equalsimpl0(this.f69344a, ((C10740a) obj).f69344a);
        }

        public int hashCode() {
            return kn4.m30711hashCodeimpl(this.f69344a);
        }

        private C10740a(float f) {
            this.f69344a = f;
            if (kn4.m30704compareTo0680j_4(f, kn4.m30705constructorimpl(0)) <= 0) {
                throw new IllegalArgumentException("invalid minSize");
            }
        }
    }

    /* JADX INFO: renamed from: p0g$b */
    @dwf({"SMAP\nLazyStaggeredGridCells.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridCells.kt\nandroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells$Fixed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
    @e0g(parameters = 1)
    public static final class C10741b implements p0g {

        /* JADX INFO: renamed from: b */
        public static final int f69345b = 0;

        /* JADX INFO: renamed from: a */
        public final int f69346a;

        public C10741b(int i) {
            this.f69346a = i;
            if (i <= 0) {
                throw new IllegalArgumentException("grid with no rows/columns");
            }
        }

        @Override // p000.p0g
        @yfb
        public int[] calculateCrossAxisCellSizes(@yfb c64 c64Var, int i, int i2) {
            return x19.calculateCellsCrossAxisSizeImpl(i, this.f69346a, i2);
        }

        public boolean equals(@gib Object obj) {
            return (obj instanceof C10741b) && this.f69346a == ((C10741b) obj).f69346a;
        }

        public int hashCode() {
            return -this.f69346a;
        }
    }

    /* JADX INFO: renamed from: p0g$c */
    @e0g(parameters = 1)
    public static final class C10742c implements p0g {

        /* JADX INFO: renamed from: b */
        public static final int f69347b = 0;

        /* JADX INFO: renamed from: a */
        public final float f69348a;

        public /* synthetic */ C10742c(float f, jt3 jt3Var) {
            this(f);
        }

        @Override // p000.p0g
        @yfb
        public int[] calculateCrossAxisCellSizes(@yfb c64 c64Var, int i, int i2) {
            int iMo27167roundToPx0680j_4 = c64Var.mo27167roundToPx0680j_4(this.f69348a);
            int i3 = iMo27167roundToPx0680j_4 + i2;
            int i4 = i2 + i;
            if (i3 >= i4) {
                return new int[]{i};
            }
            int i5 = i4 / i3;
            int[] iArr = new int[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                iArr[i6] = iMo27167roundToPx0680j_4;
            }
            return iArr;
        }

        public boolean equals(@gib Object obj) {
            return (obj instanceof C10742c) && kn4.m30710equalsimpl0(this.f69348a, ((C10742c) obj).f69348a);
        }

        public int hashCode() {
            return kn4.m30711hashCodeimpl(this.f69348a);
        }

        private C10742c(float f) {
            this.f69348a = f;
        }
    }

    @yfb
    int[] calculateCrossAxisCellSizes(@yfb c64 c64Var, int i, int i2);
}
