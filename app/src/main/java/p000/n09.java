package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyListAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n116#2,2:68\n33#2,6:70\n118#2:76\n132#2,3:77\n33#2,4:80\n135#2,2:84\n38#2:86\n137#2:87\n*S KotlinDebug\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n*L\n47#1:68,2\n47#1:70,6\n47#1:76\n63#1:77,3\n63#1:80,4\n63#1:84,2\n63#1:86\n63#1:87\n*E\n"})
@e0g(parameters = 1)
public final class n09 implements jz8 {

    /* JADX INFO: renamed from: b */
    public static final int f62894b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final m19 f62895a;

    public n09(@yfb m19 m19Var) {
        this.f62895a = m19Var;
    }

    private final int calculateVisibleItemsAverageSize(y09 y09Var) {
        List<t09> visibleItemsInfo = y09Var.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            size2 += visibleItemsInfo.get(i).getSize();
        }
        return (size2 / visibleItemsInfo.size()) + y09Var.getMainAxisItemSpacing();
    }

    @Override // p000.jz8
    public float calculateDistanceTo(int i) {
        t09 t09Var;
        y09 layoutInfo = this.f62895a.getLayoutInfo();
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return 0.0f;
        }
        List<t09> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                t09Var = null;
                break;
            }
            t09Var = visibleItemsInfo.get(i2);
            if (t09Var.getIndex() == i) {
                break;
            }
            i2++;
        }
        return t09Var == null ? (calculateVisibleItemsAverageSize(layoutInfo) * (i - getFirstVisibleItemIndex())) - getFirstVisibleItemScrollOffset() : r4.getOffset();
    }

    @Override // p000.jz8
    public int getFirstVisibleItemIndex() {
        return this.f62895a.getFirstVisibleItemIndex();
    }

    @Override // p000.jz8
    public int getFirstVisibleItemScrollOffset() {
        return this.f62895a.getFirstVisibleItemScrollOffset();
    }

    @Override // p000.jz8
    public int getItemCount() {
        return this.f62895a.getLayoutInfo().getTotalItemsCount();
    }

    @Override // p000.jz8
    public int getLastVisibleItemIndex() {
        t09 t09Var = (t09) v82.lastOrNull((List) this.f62895a.getLayoutInfo().getVisibleItemsInfo());
        if (t09Var != null) {
            return t09Var.getIndex();
        }
        return 0;
    }

    @Override // p000.jz8
    @gib
    public Object scroll(@yfb gz6<? super vre, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
        Object objScroll$default = ase.scroll$default(this.f62895a, null, gz6Var, zy2Var, 1, null);
        return objScroll$default == pd8.getCOROUTINE_SUSPENDED() ? objScroll$default : bth.f14751a;
    }

    @Override // p000.jz8
    public void snapToItem(@yfb vre vreVar, int i, int i2) {
        this.f62895a.snapToItemIndexInternal$foundation_release(i, i2, true);
    }
}
