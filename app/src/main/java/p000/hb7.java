package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface hb7 {

    /* JADX INFO: renamed from: hb7$a */
    @dwf({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,569:1\n148#2:570\n1#3:571\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n*L\n304#1:570\n*E\n"})
    @e0g(parameters = 1)
    public static final class C6786a implements hb7 {

        /* JADX INFO: renamed from: b */
        public static final int f43086b = 0;

        /* JADX INFO: renamed from: a */
        public final float f43087a;

        public /* synthetic */ C6786a(float f, jt3 jt3Var) {
            this(f);
        }

        @Override // p000.hb7
        @yfb
        public List<Integer> calculateCrossAxisCellSizes(@yfb c64 c64Var, int i, int i2) {
            return ux8.calculateCellsCrossAxisSizeImpl(i, Math.max((i + i2) / (c64Var.mo27167roundToPx0680j_4(this.f43087a) + i2), 1), i2);
        }

        public boolean equals(@gib Object obj) {
            return (obj instanceof C6786a) && kn4.m30710equalsimpl0(this.f43087a, ((C6786a) obj).f43087a);
        }

        public int hashCode() {
            return kn4.m30711hashCodeimpl(this.f43087a);
        }

        private C6786a(float f) {
            this.f43087a = f;
            if (kn4.m30704compareTo0680j_4(f, kn4.m30705constructorimpl(0)) > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided min size " + ((Object) kn4.m30716toStringimpl(f)) + " should be larger than zero.").toString());
        }
    }

    /* JADX INFO: renamed from: hb7$b */
    @dwf({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Fixed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,569:1\n1#2:570\n*E\n"})
    @e0g(parameters = 1)
    public static final class C6787b implements hb7 {

        /* JADX INFO: renamed from: b */
        public static final int f43088b = 0;

        /* JADX INFO: renamed from: a */
        public final int f43089a;

        public C6787b(int i) {
            this.f43089a = i;
            if (i > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided count " + i + " should be larger than zero").toString());
        }

        @Override // p000.hb7
        @yfb
        public List<Integer> calculateCrossAxisCellSizes(@yfb c64 c64Var, int i, int i2) {
            return ux8.calculateCellsCrossAxisSizeImpl(i, this.f43089a, i2);
        }

        public boolean equals(@gib Object obj) {
            return (obj instanceof C6787b) && this.f43089a == ((C6787b) obj).f43089a;
        }

        public int hashCode() {
            return -this.f43089a;
        }
    }

    /* JADX INFO: renamed from: hb7$c */
    @dwf({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$FixedSize\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,569:1\n148#2:570\n1#3:571\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$FixedSize\n*L\n337#1:570\n*E\n"})
    @e0g(parameters = 1)
    public static final class C6788c implements hb7 {

        /* JADX INFO: renamed from: b */
        public static final int f43090b = 0;

        /* JADX INFO: renamed from: a */
        public final float f43091a;

        public /* synthetic */ C6788c(float f, jt3 jt3Var) {
            this(f);
        }

        @Override // p000.hb7
        @yfb
        public List<Integer> calculateCrossAxisCellSizes(@yfb c64 c64Var, int i, int i2) {
            int iMo27167roundToPx0680j_4 = c64Var.mo27167roundToPx0680j_4(this.f43091a);
            int i3 = iMo27167roundToPx0680j_4 + i2;
            int i4 = i2 + i;
            if (i3 >= i4) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(i));
                return arrayList;
            }
            int i5 = i4 / i3;
            ArrayList arrayList2 = new ArrayList(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList2.add(Integer.valueOf(iMo27167roundToPx0680j_4));
            }
            return arrayList2;
        }

        public boolean equals(@gib Object obj) {
            return (obj instanceof C6788c) && kn4.m30710equalsimpl0(this.f43091a, ((C6788c) obj).f43091a);
        }

        public int hashCode() {
            return kn4.m30711hashCodeimpl(this.f43091a);
        }

        private C6788c(float f) {
            this.f43091a = f;
            if (kn4.m30704compareTo0680j_4(f, kn4.m30705constructorimpl(0)) > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided size " + ((Object) kn4.m30716toStringimpl(f)) + " should be larger than zero.").toString());
        }
    }

    @yfb
    List<Integer> calculateCrossAxisCellSizes(@yfb c64 c64Var, int i, int i2);
}
