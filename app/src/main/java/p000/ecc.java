package p000;

import androidx.mediarouter.media.C1340j;
import java.util.Map;
import p000.jvd;
import p000.msf;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,961:1\n868#1,4:968\n1223#2,6:962\n148#3:972\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n895#1:968,4\n88#1:962,6\n828#1:972\n*E\n"})
public final class ecc {

    /* JADX INFO: renamed from: b */
    public static final int f32629b = 3;

    /* JADX INFO: renamed from: c */
    public static final int f32630c = 1;

    /* JADX INFO: renamed from: a */
    public static final float f32628a = kn4.m30705constructorimpl(56);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final tbc f32631d = new tbc(l82.emptyList(), 0, 0, 0, t7c.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, msf.C9501c.f61960a, new C5256a(), false, null, null, y13.CoroutineScope(a05.f2a), 393216, null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C5257b f32632e = new C5257b();

    /* JADX INFO: renamed from: ecc$a */
    public static final class C5256a implements vba {

        /* JADX INFO: renamed from: a */
        public final int f32633a;

        /* JADX INFO: renamed from: b */
        public final int f32634b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final Map<AbstractC9938nm, Integer> f32635c = xt9.emptyMap();

        public static /* synthetic */ void getAlignmentLines$annotations() {
        }

        @Override // p000.vba
        @yfb
        public Map<AbstractC9938nm, Integer> getAlignmentLines() {
            return this.f32635c;
        }

        @Override // p000.vba
        public int getHeight() {
            return this.f32634b;
        }

        @Override // p000.vba
        public int getWidth() {
            return this.f32633a;
        }

        @Override // p000.vba
        public void placeChildren() {
        }
    }

    /* JADX INFO: renamed from: ecc$b */
    public static final class C5257b implements c64 {

        /* JADX INFO: renamed from: a */
        public final float f32636a = 1.0f;

        /* JADX INFO: renamed from: b */
        public final float f32637b = 1.0f;

        @Override // p000.c64
        public float getDensity() {
            return this.f32636a;
        }

        @Override // p000.dp6
        public float getFontScale() {
            return this.f32637b;
        }
    }

    /* JADX INFO: renamed from: ecc$c */
    @ck3(m4009c = "androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2", m4010f = "PagerState.kt", m4011i = {}, m4012l = {953}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt$animateScrollToPage$2\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,961:1\n868#2,4:962\n868#2,4:966\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt$animateScrollToPage$2\n*L\n938#1:962,4\n951#1:966,4\n*E\n"})
    public static final class C5258c extends ugg implements gz6<vre, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f32638a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f32639b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<vre, Integer, bth> f32640c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f32641d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ jz8 f32642e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f32643f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ InterfaceC11178py<Float> f32644m;

        /* JADX INFO: renamed from: ecc$c$a */
        @dwf({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt$animateScrollToPage$2$3\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,961:1\n868#2,4:962\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt$animateScrollToPage$2$3\n*L\n956#1:962,4\n*E\n"})
        public static final class a extends tt8 implements gz6<Float, Float, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8118e f32645a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ vre f32646b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jvd.C8118e c8118e, vre vreVar) {
                super(2);
                this.f32645a = c8118e;
                this.f32646b = vreVar;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ bth invoke(Float f, Float f2) {
                invoke(f.floatValue(), f2.floatValue());
                return bth.f14751a;
            }

            public final void invoke(float f, float f2) {
                this.f32645a.f52107a += this.f32646b.scrollBy(f - this.f32645a.f52107a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5258c(gz6<? super vre, ? super Integer, bth> gz6Var, int i, jz8 jz8Var, float f, InterfaceC11178py<Float> interfaceC11178py, zy2<? super C5258c> zy2Var) {
            super(2, zy2Var);
            this.f32640c = gz6Var;
            this.f32641d = i;
            this.f32642e = jz8Var;
            this.f32643f = f;
            this.f32644m = interfaceC11178py;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C5258c c5258c = new C5258c(this.f32640c, this.f32641d, this.f32642e, this.f32643f, this.f32644m, zy2Var);
            c5258c.f32639b = obj;
            return c5258c;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb vre vreVar, @gib zy2<? super bth> zy2Var) {
            return ((C5258c) create(vreVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f32638a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                vre vreVar = (vre) this.f32639b;
                this.f32640c.invoke(vreVar, wc1.boxInt(this.f32641d));
                boolean z = this.f32641d > this.f32642e.getFirstVisibleItemIndex();
                int lastVisibleItemIndex = (this.f32642e.getLastVisibleItemIndex() - this.f32642e.getFirstVisibleItemIndex()) + 1;
                if (((z && this.f32641d > this.f32642e.getLastVisibleItemIndex()) || (!z && this.f32641d < this.f32642e.getFirstVisibleItemIndex())) && Math.abs(this.f32641d - this.f32642e.getFirstVisibleItemIndex()) >= 3) {
                    this.f32642e.snapToItem(vreVar, z ? kpd.coerceAtLeast(this.f32641d - lastVisibleItemIndex, this.f32642e.getFirstVisibleItemIndex()) : kpd.coerceAtMost(this.f32641d + lastVisibleItemIndex, this.f32642e.getFirstVisibleItemIndex()), 0);
                }
                float fCalculateDistanceTo = this.f32642e.calculateDistanceTo(this.f32641d) + this.f32643f;
                jvd.C8118e c8118e = new jvd.C8118e();
                InterfaceC11178py<Float> interfaceC11178py = this.f32644m;
                a aVar = new a(c8118e, vreVar);
                this.f32638a = 1;
                if (rgg.animate$default(0.0f, fCalculateDistanceTo, 0.0f, interfaceC11178py, aVar, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: ecc$d */
    public static final class C5259d extends tt8 implements ny6<wx3> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f32647a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f32648b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ny6<Integer> f32649c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5259d(int i, float f, ny6<Integer> ny6Var) {
            super(0);
            this.f32647a = i;
            this.f32648b = f;
            this.f32649c = ny6Var;
        }

        @Override // p000.ny6
        @yfb
        public final wx3 invoke() {
            return new wx3(this.f32647a, this.f32648b, this.f32649c);
        }
    }

    @yfb
    public static final dcc PagerState(int i, @y46(from = -0.5d, m25645to = 0.5d) float f, @yfb ny6<Integer> ny6Var) {
        return new wx3(i, f, ny6Var);
    }

    public static /* synthetic */ dcc PagerState$default(int i, float f, ny6 ny6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return PagerState(i, f, ny6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateScrollToPage(jz8 jz8Var, int i, float f, InterfaceC11178py<Float> interfaceC11178py, gz6<? super vre, ? super Integer, bth> gz6Var, zy2<? super bth> zy2Var) {
        Object objScroll = jz8Var.scroll(new C5258c(gz6Var, i, jz8Var, f, interfaceC11178py, null), zy2Var);
        return objScroll == pd8.getCOROUTINE_SUSPENDED() ? objScroll : bth.f14751a;
    }

    @gib
    public static final Object animateToNextPage(@yfb dcc dccVar, @yfb zy2<? super bth> zy2Var) {
        Object objAnimateScrollToPage$default;
        return (dccVar.getCurrentPage() + 1 >= dccVar.getPageCount() || (objAnimateScrollToPage$default = dcc.animateScrollToPage$default(dccVar, dccVar.getCurrentPage() + 1, 0.0f, null, zy2Var, 6, null)) != pd8.getCOROUTINE_SUSPENDED()) ? bth.f14751a : objAnimateScrollToPage$default;
    }

    @gib
    public static final Object animateToPreviousPage(@yfb dcc dccVar, @yfb zy2<? super bth> zy2Var) {
        Object objAnimateScrollToPage$default;
        return (dccVar.getCurrentPage() + (-1) < 0 || (objAnimateScrollToPage$default = dcc.animateScrollToPage$default(dccVar, dccVar.getCurrentPage() + (-1), 0.0f, null, zy2Var, 6, null)) != pd8.getCOROUTINE_SUSPENDED()) ? bth.f14751a : objAnimateScrollToPage$default;
    }

    public static final long calculateNewMaxScrollOffset(@yfb mbc mbcVar, int i) {
        long pageSpacing = (((long) i) * ((long) (mbcVar.getPageSpacing() + mbcVar.getPageSize()))) + ((long) mbcVar.getBeforeContentPadding()) + ((long) mbcVar.getAfterContentPadding());
        int iM32087getWidthimpl = mbcVar.getOrientation() == t7c.Horizontal ? r78.m32087getWidthimpl(mbcVar.mo30983getViewportSizeYbymL2g()) : r78.m32086getHeightimpl(mbcVar.mo30983getViewportSizeYbymL2g());
        return kpd.coerceAtLeast(pageSpacing - ((long) (iM32087getWidthimpl - kpd.coerceIn(mbcVar.getSnapPosition().position(iM32087getWidthimpl, mbcVar.getPageSize(), mbcVar.getBeforeContentPadding(), mbcVar.getAfterContentPadding(), i - 1, i), 0, iM32087getWidthimpl))), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long calculateNewMinScrollOffset(tbc tbcVar, int i) {
        int iM32087getWidthimpl = tbcVar.getOrientation() == t7c.Horizontal ? r78.m32087getWidthimpl(tbcVar.mo30983getViewportSizeYbymL2g()) : r78.m32086getHeightimpl(tbcVar.mo30983getViewportSizeYbymL2g());
        return kpd.coerceIn(tbcVar.getSnapPosition().position(iM32087getWidthimpl, tbcVar.getPageSize(), tbcVar.getBeforeContentPadding(), tbcVar.getAfterContentPadding(), 0, i), 0, iM32087getWidthimpl);
    }

    private static final void debugLog(ny6<String> ny6Var) {
    }

    public static final float getDefaultPositionThreshold() {
        return f32628a;
    }

    @yfb
    public static final tbc getEmptyLayoutInfo() {
        return f32631d;
    }

    @yfb
    @hk2
    public static final dcc rememberPagerState(int i, @y46(from = -0.5d, m25645to = 0.5d) float f, @yfb ny6<Integer> ny6Var, @gib zl2 zl2Var, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            f = 0.0f;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1210768637, i2, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:86)");
        }
        Object[] objArr = new Object[0];
        dme<wx3, ?> saver = wx3.f95661M.getSaver();
        boolean z = ((((i2 & 14) ^ 6) > 4 && zl2Var.changed(i)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && zl2Var.changed(f)) || (i2 & 48) == 32) | ((((i2 & C1340j.f10444b) ^ 384) > 256 && zl2Var.changed(ny6Var)) || (i2 & 384) == 256);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new C5259d(i, f, ny6Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        wx3 wx3Var = (wx3) gyd.rememberSaveable(objArr, (dme) saver, (String) null, (ny6) objRememberedValue, zl2Var, 0, 4);
        wx3Var.getPageCountState().setValue(ny6Var);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return wx3Var;
    }
}
