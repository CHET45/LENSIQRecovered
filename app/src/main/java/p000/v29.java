package p000;

import androidx.compose.foundation.lazy.layout.C0662d;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyStaggeredGridSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,65:1\n1223#2,6:66\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt\n*L\n34#1:66,6\n*E\n"})
public final class v29 {

    /* JADX INFO: renamed from: v29$a */
    public static final class C13832a implements j09 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z29 f89782a;

        public C13832a(z29 z29Var) {
            this.f89782a = z29Var;
        }

        @Override // p000.j09
        @yfb
        public w72 collectionInfo() {
            return new w72(-1, -1);
        }

        @Override // p000.j09
        public int getContentPadding() {
            return this.f89782a.getLayoutInfo().getBeforeContentPadding() + this.f89782a.getLayoutInfo().getAfterContentPadding();
        }

        @Override // p000.j09
        public float getMaxScrollOffset() {
            return C0662d.estimatedLazyMaxScrollOffset(this.f89782a.getFirstVisibleItemIndex(), this.f89782a.getFirstVisibleItemScrollOffset(), this.f89782a.getCanScrollForward());
        }

        @Override // p000.j09
        public float getScrollOffset() {
            return C0662d.estimatedLazyScrollOffset(this.f89782a.getFirstVisibleItemIndex(), this.f89782a.getFirstVisibleItemScrollOffset());
        }

        @Override // p000.j09
        public int getViewport() {
            return this.f89782a.getLayoutInfo().getOrientation() == t7c.Vertical ? r78.m32086getHeightimpl(this.f89782a.getLayoutInfo().mo30447getViewportSizeYbymL2g()) : r78.m32087getWidthimpl(this.f89782a.getLayoutInfo().mo30447getViewportSizeYbymL2g());
        }

        @Override // p000.j09
        @gib
        public Object scrollToItem(int i, @yfb zy2<? super bth> zy2Var) {
            Object objScrollToItem$default = z29.scrollToItem$default(this.f89782a, i, 0, zy2Var, 2, null);
            return objScrollToItem$default == pd8.getCOROUTINE_SUSPENDED() ? objScrollToItem$default : bth.f14751a;
        }
    }

    @yfb
    @hk2
    public static final j09 rememberLazyStaggeredGridSemanticState(@yfb z29 z29Var, boolean z, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1629354903, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:33)");
        }
        boolean zChanged = ((((i & 112) ^ 48) > 32 && zl2Var.changed(z)) || (i & 48) == 32) | zl2Var.changed(z29Var);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new C13832a(z29Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        C13832a c13832a = (C13832a) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return c13832a;
    }
}
