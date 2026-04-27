package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,595:1\n1223#2,6:596\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridStateKt\n*L\n74#1:596,6\n*E\n"})
public final class a39 {

    /* JADX INFO: renamed from: a39$a */
    public static final class C0039a extends tt8 implements ny6<z29> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f269a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f270b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0039a(int i, int i2) {
            super(0);
            this.f269a = i;
            this.f270b = i2;
        }

        @Override // p000.ny6
        @yfb
        public final z29 invoke() {
            return new z29(this.f269a, this.f270b);
        }
    }

    @yfb
    @hk2
    public static final z29 rememberLazyStaggeredGridState(int i, int i2, @gib zl2 zl2Var, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(161145796, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:73)");
        }
        Object[] objArr = new Object[0];
        dme<z29, Object> saver = z29.f103745w.getSaver();
        boolean z = ((((i3 & 14) ^ 6) > 4 && zl2Var.changed(i)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && zl2Var.changed(i2)) || (i3 & 48) == 32);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new C0039a(i, i2);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        z29 z29Var = (z29) gyd.rememberSaveable(objArr, (dme) saver, (String) null, (ny6) objRememberedValue, zl2Var, 0, 4);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return z29Var;
    }
}
