package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposableLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n+ 2 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,632:1\n26#2:633\n1223#3,6:634\n*S KotlinDebug\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n*L\n596#1:633\n629#1:634,6\n*E\n"})
public final class mk2 {

    /* JADX INFO: renamed from: a */
    public static final int f61235a = 10;

    /* JADX INFO: renamed from: b */
    public static final int f61236b = 3;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final Object f61237c = new Object();

    public static final int bitsForSlot(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    @fl2
    @yfb
    public static final kk2 composableLambda(@yfb zl2 zl2Var, int i, boolean z, @yfb Object obj) {
        lk2 lk2Var;
        zl2Var.startMovableGroup(Integer.rotateLeft(i, 1), f61237c);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (objRememberedValue == zl2.f105372a.getEmpty()) {
            lk2Var = new lk2(i, z, obj);
            zl2Var.updateRememberedValue(lk2Var);
        } else {
            md8.checkNotNull(objRememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            lk2Var = (lk2) objRememberedValue;
            lk2Var.update(obj);
        }
        zl2Var.endMovableGroup();
        return lk2Var;
    }

    @fl2
    @yfb
    public static final kk2 composableLambdaInstance(int i, boolean z, @yfb Object obj) {
        return new lk2(i, z, obj);
    }

    public static final int differentBits(int i) {
        return bitsForSlot(2, i);
    }

    @fl2
    @yfb
    @hk2
    public static final kk2 rememberComposableLambda(int i, boolean z, @yfb Object obj, @gib zl2 zl2Var, int i2) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1573003438, i2, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:628)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        if (objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new lk2(i, z, obj);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        lk2 lk2Var = (lk2) objRememberedValue;
        lk2Var.update(obj);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return lk2Var;
    }

    public static final boolean replacableWith(@gib rsd rsdVar, @yfb rsd rsdVar2) {
        if (rsdVar != null) {
            if ((rsdVar instanceof ssd) && (rsdVar2 instanceof ssd)) {
                ssd ssdVar = (ssd) rsdVar;
                if (!ssdVar.getValid() || md8.areEqual(rsdVar, rsdVar2) || md8.areEqual(ssdVar.getAnchor(), ((ssd) rsdVar2).getAnchor())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int sameBits(int i) {
        return bitsForSlot(1, i);
    }
}
