package p000;

import androidx.compose.foundation.lazy.layout.C0662d;

/* JADX INFO: loaded from: classes.dex */
public final class l09 {

    /* JADX INFO: renamed from: l09$a */
    public static final class C8568a implements j09 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ m19 f55852a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f55853b;

        public C8568a(m19 m19Var, boolean z) {
            this.f55852a = m19Var;
            this.f55853b = z;
        }

        @Override // p000.j09
        @yfb
        public w72 collectionInfo() {
            return this.f55853b ? new w72(-1, 1) : new w72(1, -1);
        }

        @Override // p000.j09
        public int getContentPadding() {
            return this.f55852a.getLayoutInfo().getBeforeContentPadding() + this.f55852a.getLayoutInfo().getAfterContentPadding();
        }

        @Override // p000.j09
        public float getMaxScrollOffset() {
            return C0662d.estimatedLazyMaxScrollOffset(this.f55852a.getFirstVisibleItemIndex(), this.f55852a.getFirstVisibleItemScrollOffset(), this.f55852a.getCanScrollForward());
        }

        @Override // p000.j09
        public float getScrollOffset() {
            return C0662d.estimatedLazyScrollOffset(this.f55852a.getFirstVisibleItemIndex(), this.f55852a.getFirstVisibleItemScrollOffset());
        }

        @Override // p000.j09
        public int getViewport() {
            return this.f55852a.getLayoutInfo().getOrientation() == t7c.Vertical ? r78.m32086getHeightimpl(this.f55852a.getLayoutInfo().mo27179getViewportSizeYbymL2g()) : r78.m32087getWidthimpl(this.f55852a.getLayoutInfo().mo27179getViewportSizeYbymL2g());
        }

        @Override // p000.j09
        @gib
        public Object scrollToItem(int i, @yfb zy2<? super bth> zy2Var) {
            Object objScrollToItem$default = m19.scrollToItem$default(this.f55852a, i, 0, zy2Var, 2, null);
            return objScrollToItem$default == pd8.getCOROUTINE_SUSPENDED() ? objScrollToItem$default : bth.f14751a;
        }
    }

    @yfb
    public static final j09 LazyLayoutSemanticState(@yfb m19 m19Var, boolean z) {
        return new C8568a(m19Var, z);
    }
}
