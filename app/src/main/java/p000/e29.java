package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyStaggeredGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,100:1\n1223#2,6:101\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n*L\n43#1:101,6\n*E\n"})
public final class e29 {

    /* JADX INFO: renamed from: e29$b */
    public static final class C5060b extends tt8 implements ny6<a29> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i2g<qy6<r29, bth>> f31598a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5060b(i2g<? extends qy6<? super r29, bth>> i2gVar) {
            super(0);
            this.f31598a = i2gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final a29 invoke() {
            return new a29(this.f31598a.getValue());
        }
    }

    /* JADX INFO: renamed from: e29$c */
    public static final class C5061c extends tt8 implements ny6<d29> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i2g<a29> f31599a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z29 f31600b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5061c(i2g<a29> i2gVar, z29 z29Var) {
            super(0);
            this.f31599a = i2gVar;
            this.f31600b = z29Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final d29 invoke() {
            a29 value = this.f31599a.getValue();
            return new d29(this.f31600b, value, new aab(this.f31600b.getNearestRange$foundation_release(), value));
        }
    }

    @yfb
    @hk2
    public static final ny6<c29> rememberStaggeredGridItemProviderLambda(@yfb z29 z29Var, @yfb qy6<? super r29, bth> qy6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(690901732, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProviderLambda (LazyStaggeredGridItemProvider.kt:40)");
        }
        i2g i2gVarRememberUpdatedState = stf.rememberUpdatedState(qy6Var, zl2Var, (i >> 3) & 14);
        boolean zChanged = zl2Var.changed(z29Var);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new mgd(stf.derivedStateOf(stf.referentialEqualityPolicy(), new C5061c(stf.derivedStateOf(stf.referentialEqualityPolicy(), new C5060b(i2gVarRememberUpdatedState)), z29Var))) { // from class: e29.a
                @Override // p000.mgd, p000.ip8
                @gib
                public Object get() {
                    return ((i2g) this.receiver).getValue();
                }
            };
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        ip8 ip8Var = (ip8) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return ip8Var;
    }
}
