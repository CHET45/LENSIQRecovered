package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class ep0 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C5421a f33760a = new C5421a();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final qy6<dp0, bth> f33761b = C5422b.f33763a;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final qy6<dp0, bth> f33762c = C5423c.f33764a;

    /* JADX INFO: renamed from: ep0$a */
    public static final class C5421a implements qxa {
        @Override // p000.qxa
        public <T> T getCurrent(@yfb fxa<T> fxaVar) {
            return fxaVar.getDefaultFactory$ui_release().invoke();
        }
    }

    /* JADX INFO: renamed from: ep0$b */
    public static final class C5422b extends tt8 implements qy6<dp0, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5422b f33763a = new C5422b();

        public C5422b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(dp0 dp0Var) {
            invoke2(dp0Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb dp0 dp0Var) {
            dp0Var.onDrawCacheReadsChanged$ui_release();
        }
    }

    /* JADX INFO: renamed from: ep0$c */
    public static final class C5423c extends tt8 implements qy6<dp0, bth> {

        /* JADX INFO: renamed from: a */
        public static final C5423c f33764a = new C5423c();

        public C5423c() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(dp0 dp0Var) {
            invoke2(dp0Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb dp0 dp0Var) {
            dp0Var.updateModifierLocalConsumer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isChainUpdate(dp0 dp0Var) {
        InterfaceC0701e.d tail$ui_release = w34.requireLayoutNode(dp0Var).getNodes$ui_release().getTail$ui_release();
        md8.checkNotNull(tail$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((ylg) tail$ui_release).getAttachHasBeenRun();
    }
}
