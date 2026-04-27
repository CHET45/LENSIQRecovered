package p000;

import androidx.compose.foundation.lazy.layout.C0662d;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazySemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,66:1\n1223#2,6:67\n*S KotlinDebug\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n*L\n34#1:67,6\n*E\n"})
public final class s19 {

    /* JADX INFO: renamed from: s19$a */
    public static final class C12398a implements j09 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ az8 f80383a;

        public C12398a(az8 az8Var) {
            this.f80383a = az8Var;
        }

        @Override // p000.j09
        @yfb
        public w72 collectionInfo() {
            return new w72(-1, -1);
        }

        @Override // p000.j09
        public int getContentPadding() {
            return this.f80383a.getLayoutInfo().getBeforeContentPadding() + this.f80383a.getLayoutInfo().getAfterContentPadding();
        }

        @Override // p000.j09
        public float getMaxScrollOffset() {
            return C0662d.estimatedLazyMaxScrollOffset(this.f80383a.getFirstVisibleItemIndex(), this.f80383a.getFirstVisibleItemScrollOffset(), this.f80383a.getCanScrollForward());
        }

        @Override // p000.j09
        public float getScrollOffset() {
            return C0662d.estimatedLazyScrollOffset(this.f80383a.getFirstVisibleItemIndex(), this.f80383a.getFirstVisibleItemScrollOffset());
        }

        @Override // p000.j09
        public int getViewport() {
            return this.f80383a.getLayoutInfo().getOrientation() == t7c.Vertical ? r78.m32086getHeightimpl(this.f80383a.getLayoutInfo().mo29680getViewportSizeYbymL2g()) : r78.m32087getWidthimpl(this.f80383a.getLayoutInfo().mo29680getViewportSizeYbymL2g());
        }

        @Override // p000.j09
        @gib
        public Object scrollToItem(int i, @yfb zy2<? super bth> zy2Var) {
            Object objScrollToItem$default = az8.scrollToItem$default(this.f80383a, i, 0, zy2Var, 2, null);
            return objScrollToItem$default == pd8.getCOROUTINE_SUSPENDED() ? objScrollToItem$default : bth.f14751a;
        }
    }

    @yfb
    @hk2
    public static final j09 rememberLazyGridSemanticState(@yfb az8 az8Var, boolean z, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1247008005, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:33)");
        }
        boolean z2 = ((((i & 14) ^ 6) > 4 && zl2Var.changed(az8Var)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && zl2Var.changed(z)) || (i & 48) == 32);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z2 || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new C12398a(az8Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        C12398a c12398a = (C12398a) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return c12398a;
    }
}
