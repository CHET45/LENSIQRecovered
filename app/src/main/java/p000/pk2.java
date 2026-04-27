package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaN_jvmKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1223#2,6:194\n1#3:200\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaN_jvmKt\n*L\n177#1:194,6\n*E\n"})
public final class pk2 {
    @fl2
    @yfb
    public static final nk2 composableLambdaN(@yfb zl2 zl2Var, int i, boolean z, int i2, @yfb Object obj) {
        ok2 ok2Var;
        zl2Var.startReplaceableGroup(i);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (objRememberedValue == zl2.f105372a.getEmpty()) {
            ok2Var = new ok2(i, z, i2);
            zl2Var.updateRememberedValue(ok2Var);
        } else {
            md8.checkNotNull(objRememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl");
            ok2Var = (ok2) objRememberedValue;
        }
        ok2Var.update(obj);
        zl2Var.endReplaceableGroup();
        return ok2Var;
    }

    @fl2
    @yfb
    public static final nk2 composableLambdaNInstance(int i, boolean z, int i2, @yfb Object obj) {
        ok2 ok2Var = new ok2(i, z, i2);
        ok2Var.update(obj);
        return ok2Var;
    }

    @fl2
    @yfb
    @hk2
    public static final nk2 rememberComposableLambdaN(int i, boolean z, int i2, @yfb Object obj, @gib zl2 zl2Var, int i3) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-293456346, i3, -1, "androidx.compose.runtime.internal.rememberComposableLambdaN (ComposableLambdaN.jvm.kt:176)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        if (objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new ok2(i, z, i2);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        ok2 ok2Var = (ok2) objRememberedValue;
        ok2Var.update(obj);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return ok2Var;
    }
}
