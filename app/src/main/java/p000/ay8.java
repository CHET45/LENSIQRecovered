package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,101:1\n1223#2,6:102\n*S KotlinDebug\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n*L\n43#1:102,6\n*E\n"})
public final class ay8 {

    /* JADX INFO: renamed from: ay8$b */
    public static final class C1664b extends tt8 implements ny6<wx8> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i2g<qy6<qy8, bth>> f12205a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1664b(i2g<? extends qy6<? super qy8, bth>> i2gVar) {
            super(0);
            this.f12205a = i2gVar;
        }

        @Override // p000.ny6
        @yfb
        public final wx8 invoke() {
            return new wx8(this.f12205a.getValue());
        }
    }

    /* JADX INFO: renamed from: ay8$c */
    public static final class C1665c extends tt8 implements ny6<zx8> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i2g<wx8> f12206a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ az8 f12207b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1665c(i2g<wx8> i2gVar, az8 az8Var) {
            super(0);
            this.f12206a = i2gVar;
            this.f12207b = az8Var;
        }

        @Override // p000.ny6
        @yfb
        public final zx8 invoke() {
            wx8 value = this.f12206a.getValue();
            return new zx8(this.f12207b, value, new aab(this.f12207b.getNearestRange$foundation_release(), value));
        }
    }

    @ah5
    @yfb
    @hk2
    public static final ny6<yx8> rememberLazyGridItemProviderLambda(@yfb az8 az8Var, @yfb qy6<? super qy8, bth> qy6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1898306282, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        i2g i2gVarRememberUpdatedState = stf.rememberUpdatedState(qy6Var, zl2Var, (i >> 3) & 14);
        boolean z = (((i & 14) ^ 6) > 4 && zl2Var.changed(az8Var)) || (i & 6) == 4;
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new mgd(stf.derivedStateOf(stf.referentialEqualityPolicy(), new C1665c(stf.derivedStateOf(stf.referentialEqualityPolicy(), new C1664b(i2gVarRememberUpdatedState)), az8Var))) { // from class: ay8.a
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
