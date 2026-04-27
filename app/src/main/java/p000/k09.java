package p000;

/* JADX INFO: loaded from: classes.dex */
public final class k09 {

    /* JADX INFO: renamed from: k09$a */
    public static final class C8154a implements j09 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dcc f52328a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f52329b;

        public C8154a(dcc dccVar, boolean z) {
            this.f52328a = dccVar;
            this.f52329b = z;
        }

        @Override // p000.j09
        @yfb
        public w72 collectionInfo() {
            return this.f52329b ? new w72(this.f52328a.getPageCount(), 1) : new w72(1, this.f52328a.getPageCount());
        }

        @Override // p000.j09
        public int getContentPadding() {
            return this.f52328a.getLayoutInfo().getBeforeContentPadding() + this.f52328a.getLayoutInfo().getAfterContentPadding();
        }

        @Override // p000.j09
        public float getMaxScrollOffset() {
            return ecc.calculateNewMaxScrollOffset(this.f52328a.getLayoutInfo(), this.f52328a.getPageCount());
        }

        @Override // p000.j09
        public float getScrollOffset() {
            return xbc.currentAbsoluteScrollOffset(this.f52328a);
        }

        @Override // p000.j09
        public int getViewport() {
            return this.f52328a.getLayoutInfo().getOrientation() == t7c.Vertical ? r78.m32086getHeightimpl(this.f52328a.getLayoutInfo().mo30983getViewportSizeYbymL2g()) : r78.m32087getWidthimpl(this.f52328a.getLayoutInfo().mo30983getViewportSizeYbymL2g());
        }

        @Override // p000.j09
        @gib
        public Object scrollToItem(int i, @yfb zy2<? super bth> zy2Var) {
            Object objScrollToPage$default = dcc.scrollToPage$default(this.f52328a, i, 0.0f, zy2Var, 2, null);
            return objScrollToPage$default == pd8.getCOROUTINE_SUSPENDED() ? objScrollToPage$default : bth.f14751a;
        }
    }

    @yfb
    public static final j09 LazyLayoutSemanticState(@yfb dcc dccVar, boolean z) {
        return new C8154a(dccVar, z);
    }
}
