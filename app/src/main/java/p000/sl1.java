package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawModifierNodeImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,425:1\n88#2:426\n66#3,9:427\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawModifierNodeImpl\n*L\n245#1:426\n290#1:427,9\n*E\n"})
public final class sl1 extends InterfaceC0701e.d implements rl1, sxb, of1 {

    /* JADX INFO: renamed from: M1 */
    @yfb
    public qy6<? super tl1, hp4> f82148M1;

    /* JADX INFO: renamed from: X */
    @yfb
    public final tl1 f82149X;

    /* JADX INFO: renamed from: Y */
    public boolean f82150Y;

    /* JADX INFO: renamed from: Z */
    @gib
    public bre f82151Z;

    /* JADX INFO: renamed from: sl1$a */
    public static final class C12643a extends tt8 implements ny6<s97> {
        public C12643a() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final s97 invoke() {
            return sl1.this.getGraphicsContext();
        }
    }

    /* JADX INFO: renamed from: sl1$b */
    public static final class C12644b extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ tl1 f82154b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12644b(tl1 tl1Var) {
            super(0);
            this.f82154b = tl1Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            sl1.this.getBlock().invoke(this.f82154b);
        }
    }

    public sl1(@yfb tl1 tl1Var, @yfb qy6<? super tl1, hp4> qy6Var) {
        this.f82149X = tl1Var;
        this.f82148M1 = qy6Var;
        tl1Var.setCacheParams$ui_release(this);
        tl1Var.setGraphicsContextProvider$ui_release(new C12643a());
    }

    private final hp4 getOrBuildCachedDrawBlock(ov2 ov2Var) {
        if (!this.f82150Y) {
            tl1 tl1Var = this.f82149X;
            tl1Var.setDrawResult$ui_release(null);
            tl1Var.setContentDrawScope$ui_release(ov2Var);
            txb.observeReads(this, new C12644b(tl1Var));
            if (tl1Var.getDrawResult$ui_release() == null) {
                g28.throwIllegalStateExceptionForNullCheck("DrawResult not defined, did you forget to call onDraw?");
                throw new us8();
            }
            this.f82150Y = true;
        }
        hp4 drawResult$ui_release = this.f82149X.getDrawResult$ui_release();
        md8.checkNotNull(drawResult$ui_release);
        return drawResult$ui_release;
    }

    @Override // p000.fp4
    public void draw(@yfb ov2 ov2Var) {
        getOrBuildCachedDrawBlock(ov2Var).getBlock$ui_release().invoke(ov2Var);
    }

    @yfb
    public final qy6<tl1, hp4> getBlock() {
        return this.f82148M1;
    }

    @Override // p000.of1
    @yfb
    public c64 getDensity() {
        return w34.requireDensity(this);
    }

    @yfb
    public final s97 getGraphicsContext() {
        bre breVar = this.f82151Z;
        if (breVar == null) {
            breVar = new bre();
            this.f82151Z = breVar;
        }
        if (breVar.getGraphicsContext() == null) {
            breVar.setGraphicsContext(w34.requireGraphicsContext(this));
        }
        return breVar;
    }

    @Override // p000.of1
    @yfb
    public ov8 getLayoutDirection() {
        return w34.requireLayoutDirection(this);
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: getSize-NH-jbRc */
    public long mo28660getSizeNHjbRc() {
        return s78.m32288toSizeozmzZPI(w34.m32852requireCoordinator64DMado(this, keb.m30687constructorimpl(128)).mo30031getSizeYbymL2g());
    }

    @Override // p000.rl1
    public void invalidateDrawCache() {
        bre breVar = this.f82151Z;
        if (breVar != null) {
            breVar.releaseGraphicsLayers();
        }
        this.f82150Y = false;
        this.f82149X.setDrawResult$ui_release(null);
        gp4.invalidateDraw(this);
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        super.onDetach();
        bre breVar = this.f82151Z;
        if (breVar != null) {
            breVar.releaseGraphicsLayers();
        }
    }

    @Override // p000.fp4
    public void onMeasureResultChanged() {
        invalidateDrawCache();
    }

    @Override // p000.sxb
    public void onObservedReadsChanged() {
        invalidateDrawCache();
    }

    public final void setBlock(@yfb qy6<? super tl1, hp4> qy6Var) {
        this.f82148M1 = qy6Var;
        invalidateDrawCache();
    }
}
