package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,511:1\n77#2:512\n77#2:513\n1223#3,6:514\n1223#3,6:520\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n*L\n307#1:512\n308#1:513\n309#1:514,6\n352#1:520,6\n*E\n"})
@e0g(parameters = 1)
public final class jbc {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final jbc f50245a = new jbc();

    /* JADX INFO: renamed from: b */
    public static final int f50246b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f50247c = 0;

    /* JADX INFO: renamed from: jbc$a */
    public static final class C7843a extends tt8 implements kz6<Float, Float, Float, Float> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dcc f50248a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ov8 f50249b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f50250c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7843a(dcc dccVar, ov8 ov8Var, float f) {
            super(3);
            this.f50248a = dccVar;
            this.f50249b = ov8Var;
            this.f50250c = f;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Float invoke(Float f, Float f2, Float f3) {
            return invoke(f.floatValue(), f2.floatValue(), f3.floatValue());
        }

        @yfb
        public final Float invoke(float f, float f2, float f3) {
            return Float.valueOf(ccc.calculateFinalSnappingBound(this.f50248a, this.f50249b, this.f50250c, f, f2, f3));
        }
    }

    private jbc() {
    }

    @yfb
    @hk2
    public final kng flingBehavior(@yfb dcc dccVar, @gib zbc zbcVar, @gib vk3<Float> vk3Var, @gib InterfaceC11178py<Float> interfaceC11178py, @y46(from = 0.0d, m25645to = 1.0d) float f, @gib zl2 zl2Var, int i, int i2) {
        boolean z = true;
        if ((i2 & 2) != 0) {
            zbcVar = zbc.f104721a.atMost(1);
        }
        if ((i2 & 4) != 0) {
            vk3Var = vyf.rememberSplineBasedDecay(zl2Var, 0);
        }
        if ((i2 & 8) != 0) {
            interfaceC11178py = C11760qy.spring$default(0.0f, 400.0f, Float.valueOf(edi.getVisibilityThreshold(f68.f35480a)), 1, null);
        }
        if ((i2 & 16) != 0) {
            f = 0.5f;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1559769181, i, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:301)");
        }
        if (0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f).toString());
        }
        Object obj = (c64) zl2Var.consume(sn2.getLocalDensity());
        ov8 ov8Var = (ov8) zl2Var.consume(sn2.getLocalLayoutDirection());
        boolean zChanged = ((((i & 14) ^ 6) > 4 && zl2Var.changed(dccVar)) || (i & 6) == 4) | zl2Var.changed(vk3Var) | zl2Var.changed(interfaceC11178py);
        if ((((i & 112) ^ 48) <= 32 || !zl2Var.changed(zbcVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean zChanged2 = zChanged | z | zl2Var.changed(obj) | zl2Var.changed(ov8Var);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged2 || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = ksf.snapFlingBehavior(ccc.SnapLayoutInfoProvider(dccVar, zbcVar, new C7843a(dccVar, ov8Var, f)), vk3Var, interfaceC11178py);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        kng kngVar = (kng) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return kngVar;
    }

    @yfb
    @hk2
    public final hab pageNestedScrollConnection(@yfb dcc dccVar, @yfb t7c t7cVar, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(877583120, i, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:350)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && zl2Var.changed(dccVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && zl2Var.changed(t7cVar)) || (i & 48) == 32);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new vx3(dccVar, t7cVar);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        vx3 vx3Var = (vx3) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return vx3Var;
    }
}
