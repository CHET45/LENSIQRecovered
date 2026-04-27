package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nScrollableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,224:1\n1223#2,6:225\n*S KotlinDebug\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n*L\n164#1:225,6\n*E\n"})
public final class bse {

    /* JADX INFO: renamed from: bse$a */
    public static final class C2038a extends tt8 implements qy6<Float, Float> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i2g<qy6<Float, Float>> f14687a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2038a(i2g<? extends qy6<? super Float, Float>> i2gVar) {
            super(1);
            this.f14687a = i2gVar;
        }

        @yfb
        public final Float invoke(float f) {
            return this.f14687a.getValue().invoke(Float.valueOf(f));
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }

    @yfb
    public static final ase ScrollableState(@yfb qy6<? super Float, Float> qy6Var) {
        return new jz3(qy6Var);
    }

    @yfb
    @hk2
    public static final ase rememberScrollableState(@yfb qy6<? super Float, Float> qy6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-180460798, i, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:161)");
        }
        i2g i2gVarRememberUpdatedState = stf.rememberUpdatedState(qy6Var, zl2Var, i & 14);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = ScrollableState(new C2038a(i2gVarRememberUpdatedState));
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        ase aseVar = (ase) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return aseVar;
    }
}
