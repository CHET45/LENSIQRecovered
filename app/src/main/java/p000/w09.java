package p000;

import androidx.compose.foundation.lazy.C0650a;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyListItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,106:1\n1223#2,6:107\n*S KotlinDebug\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n*L\n46#1:107,6\n*E\n"})
public final class w09 {

    /* JADX INFO: renamed from: w09$b */
    public static final class C14339b extends tt8 implements ny6<s09> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i2g<qy6<h19, bth>> f93043a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14339b(i2g<? extends qy6<? super h19, bth>> i2gVar) {
            super(0);
            this.f93043a = i2gVar;
        }

        @Override // p000.ny6
        @yfb
        public final s09 invoke() {
            return new s09(this.f93043a.getValue());
        }
    }

    /* JADX INFO: renamed from: w09$c */
    public static final class C14340c extends tt8 implements ny6<v09> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i2g<s09> f93044a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ m19 f93045b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0650a f93046c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14340c(i2g<s09> i2gVar, m19 m19Var, C0650a c0650a) {
            super(0);
            this.f93044a = i2gVar;
            this.f93045b = m19Var;
            this.f93046c = c0650a;
        }

        @Override // p000.ny6
        @yfb
        public final v09 invoke() {
            s09 value = this.f93044a.getValue();
            return new v09(this.f93045b, value, this.f93046c, new aab(this.f93045b.getNearestRange$foundation_release(), value));
        }
    }

    @yfb
    @hk2
    public static final ny6<u09> rememberLazyListItemProviderLambda(@yfb m19 m19Var, @yfb qy6<? super h19, bth> qy6Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-343736148, i, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)");
        }
        i2g i2gVarRememberUpdatedState = stf.rememberUpdatedState(qy6Var, zl2Var, (i >> 3) & 14);
        boolean z = (((i & 14) ^ 6) > 4 && zl2Var.changed(m19Var)) || (i & 6) == 4;
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new mgd(stf.derivedStateOf(stf.referentialEqualityPolicy(), new C14340c(stf.derivedStateOf(stf.referentialEqualityPolicy(), new C14339b(i2gVarRememberUpdatedState)), m19Var, new C0650a()))) { // from class: w09.a
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
