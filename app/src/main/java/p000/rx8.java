package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,114:1\n116#2,2:115\n33#2,6:117\n118#2:123\n*S KotlinDebug\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n*L\n47#1:115,2\n47#1:117,6\n47#1:123\n*E\n"})
@e0g(parameters = 1)
public final class rx8 implements jz8 {

    /* JADX INFO: renamed from: b */
    public static final int f80067b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final az8 f80068a;

    /* JADX INFO: renamed from: rx8$a */
    public static final class C12363a extends tt8 implements qy6<Integer, Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f80069a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<xx8> f80070b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12363a(boolean z, List<? extends xx8> list) {
            super(1);
            this.f80069a = z;
            this.f80070b = list;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }

        @yfb
        public final Integer invoke(int i) {
            return Integer.valueOf(this.f80069a ? this.f80070b.get(i).getRow() : this.f80070b.get(i).getColumn());
        }
    }

    public rx8(@yfb az8 az8Var) {
        this.f80068a = az8Var;
    }

    private final int calculateLineAverageMainAxisSize(fy8 fy8Var) {
        boolean z = fy8Var.getOrientation() == t7c.Vertical;
        List<xx8> visibleItemsInfo = fy8Var.getVisibleItemsInfo();
        C12363a c12363a = new C12363a(z, visibleItemsInfo);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < visibleItemsInfo.size()) {
            int iIntValue = c12363a.invoke(Integer.valueOf(i)).intValue();
            if (iIntValue == -1) {
                i++;
            } else {
                int iMax = 0;
                while (i < visibleItemsInfo.size() && c12363a.invoke(Integer.valueOf(i)).intValue() == iIntValue) {
                    iMax = Math.max(iMax, z ? r78.m32086getHeightimpl(visibleItemsInfo.get(i).mo30417getSizeYbymL2g()) : r78.m32087getWidthimpl(visibleItemsInfo.get(i).mo30417getSizeYbymL2g()));
                    i++;
                }
                i2 += iMax;
                i3++;
            }
        }
        return (i2 / i3) + fy8Var.getMainAxisItemSpacing();
    }

    @Override // p000.jz8
    public float calculateDistanceTo(int i) {
        xx8 xx8Var;
        fy8 layoutInfo = this.f80068a.getLayoutInfo();
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return 0.0f;
        }
        List<xx8> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                xx8Var = null;
                break;
            }
            xx8Var = visibleItemsInfo.get(i2);
            if (xx8Var.getIndex() == i) {
                break;
            }
            i2++;
        }
        if (xx8Var != null) {
            return layoutInfo.getOrientation() == t7c.Vertical ? a78.m27202getYimpl(r5.mo30416getOffsetnOccac()) : a78.m27201getXimpl(r5.mo30416getOffsetnOccac());
        }
        int slotsPerLine$foundation_release = this.f80068a.getSlotsPerLine$foundation_release();
        return (calculateLineAverageMainAxisSize(layoutInfo) * (((i - getFirstVisibleItemIndex()) + ((slotsPerLine$foundation_release - 1) * (i < getFirstVisibleItemIndex() ? -1 : 1))) / slotsPerLine$foundation_release)) - getFirstVisibleItemScrollOffset();
    }

    @Override // p000.jz8
    public int getFirstVisibleItemIndex() {
        return this.f80068a.getFirstVisibleItemIndex();
    }

    @Override // p000.jz8
    public int getFirstVisibleItemScrollOffset() {
        return this.f80068a.getFirstVisibleItemScrollOffset();
    }

    @Override // p000.jz8
    public int getItemCount() {
        return this.f80068a.getLayoutInfo().getTotalItemsCount();
    }

    @Override // p000.jz8
    public int getLastVisibleItemIndex() {
        xx8 xx8Var = (xx8) v82.lastOrNull((List) this.f80068a.getLayoutInfo().getVisibleItemsInfo());
        if (xx8Var != null) {
            return xx8Var.getIndex();
        }
        return 0;
    }

    @Override // p000.jz8
    @gib
    public Object scroll(@yfb gz6<? super vre, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objScroll$default = ase.scroll$default(this.f80068a, null, gz6Var, zy2Var, 1, null);
        return objScroll$default == pd8.getCOROUTINE_SUSPENDED() ? objScroll$default : bth.f14751a;
    }

    @Override // p000.jz8
    public void snapToItem(@yfb vre vreVar, int i, int i2) {
        this.f80068a.snapToItemIndexInternal$foundation_release(i, i2, true);
    }
}
