package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pbc {

    /* JADX INFO: renamed from: pbc$a */
    @dwf({"SMAP\nPagerLazyAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerLazyAnimateScrollScope.kt\nandroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,68:1\n116#2,2:69\n33#2,6:71\n118#2:77\n*S KotlinDebug\n*F\n+ 1 PagerLazyAnimateScrollScope.kt\nandroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1\n*L\n51#1:69,2\n51#1:71,6\n51#1:77\n*E\n"})
    public static final class C10880a implements jz8 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dcc f70247a;

        public C10880a(dcc dccVar) {
            this.f70247a = dccVar;
        }

        private final int getVisibleItemsAverageSize() {
            return this.f70247a.getPageSize$foundation_release() + this.f70247a.getPageSpacing$foundation_release();
        }

        @Override // p000.jz8
        public float calculateDistanceTo(int i) {
            bbc bbcVar;
            List<bbc> visiblePagesInfo = this.f70247a.getLayoutInfo().getVisiblePagesInfo();
            int size = visiblePagesInfo.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    bbcVar = null;
                    break;
                }
                bbcVar = visiblePagesInfo.get(i2);
                if (bbcVar.getIndex() == i) {
                    break;
                }
                i2++;
            }
            return bbcVar == null ? ((i - this.f70247a.getCurrentPage()) * getVisibleItemsAverageSize()) - (this.f70247a.getCurrentPageOffsetFraction() * this.f70247a.getPageSizeWithSpacing$foundation_release()) : r3.getOffset();
        }

        @Override // p000.jz8
        public int getFirstVisibleItemIndex() {
            return this.f70247a.getFirstVisiblePage$foundation_release();
        }

        @Override // p000.jz8
        public int getFirstVisibleItemScrollOffset() {
            return this.f70247a.getFirstVisiblePageOffset$foundation_release();
        }

        @Override // p000.jz8
        public int getItemCount() {
            return this.f70247a.getPageCount();
        }

        @Override // p000.jz8
        public int getLastVisibleItemIndex() {
            return ((bbc) v82.last((List) this.f70247a.getLayoutInfo().getVisiblePagesInfo())).getIndex();
        }

        @Override // p000.jz8
        @gib
        public Object scroll(@yfb gz6<? super vre, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var) {
            Object objScroll$default = ase.scroll$default(this.f70247a, null, gz6Var, zy2Var, 1, null);
            return objScroll$default == pd8.getCOROUTINE_SUSPENDED() ? objScroll$default : bth.f14751a;
        }

        @Override // p000.jz8
        public void snapToItem(@yfb vre vreVar, int i, int i2) {
            this.f70247a.snapToItem$foundation_release(i, i2 / this.f70247a.getPageSizeWithSpacing$foundation_release(), true);
        }
    }

    @ah5
    @yfb
    public static final jz8 PagerLazyAnimateScrollScope(@yfb dcc dccVar) {
        return new C10880a(dccVar);
    }
}
