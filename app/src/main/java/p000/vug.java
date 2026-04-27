package p000;

import p000.do6;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextMeasurerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,55:1\n77#2:56\n77#2:57\n77#2:58\n1223#3,6:59\n*S KotlinDebug\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n*L\n47#1:56\n48#1:57\n49#1:58\n51#1:59,6\n*E\n"})
public final class vug {

    /* JADX INFO: renamed from: a */
    public static final int f92292a = 8;

    @yfb
    @hk2
    public static final uug rememberTextMeasurer(int i, @gib zl2 zl2Var, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = f92292a;
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1538166871, i2, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:45)");
        }
        do6.InterfaceC4891b interfaceC4891b = (do6.InterfaceC4891b) zl2Var.consume(sn2.getLocalFontFamilyResolver());
        c64 c64Var = (c64) zl2Var.consume(sn2.getLocalDensity());
        ov8 ov8Var = (ov8) zl2Var.consume(sn2.getLocalLayoutDirection());
        boolean zChanged = zl2Var.changed(interfaceC4891b) | zl2Var.changed(c64Var) | zl2Var.changed(ov8Var);
        if ((((i2 & 14) ^ 6) <= 4 || !zl2Var.changed(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean z2 = zChanged | z;
        Object objRememberedValue = zl2Var.rememberedValue();
        if (z2 || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new uug(interfaceC4891b, c64Var, ov8Var, i);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        uug uugVar = (uug) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return uugVar;
    }
}
