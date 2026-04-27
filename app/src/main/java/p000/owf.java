package p000;

import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import p000.xl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSpacer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spacer.kt\nandroidx/compose/foundation/layout/SpacerKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,56:1\n124#2,6:57\n131#2,5:72\n136#2:83\n138#2:86\n289#3,9:63\n298#3,2:84\n4032#4,6:77\n*S KotlinDebug\n*F\n+ 1 Spacer.kt\nandroidx/compose/foundation/layout/SpacerKt\n*L\n40#1:57,6\n40#1:72,5\n40#1:83\n40#1:86\n40#1:63,9\n40#1:84,2\n40#1:77,6\n*E\n"})
public final class owf {
    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    public static final void Spacer(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-72882467, i, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        pwf pwfVar = pwf.f72385a;
        int currentCompositeKeyHash = dl2.getCurrentCompositeKeyHash(zl2Var, 0);
        InterfaceC0701e interfaceC0701eMaterializeModifier = C0696c.materializeModifier(zl2Var, interfaceC0701e);
        qn2 currentCompositionLocalMap = zl2Var.getCurrentCompositionLocalMap();
        xl2.C15179a c15179a = xl2.f98343p;
        ny6<xl2> constructor = c15179a.getConstructor();
        if (zl2Var.getApplier() == null) {
            dl2.invalidApplier();
        }
        zl2Var.startReusableNode();
        if (zl2Var.getInserting()) {
            zl2Var.createNode(constructor);
        } else {
            zl2Var.useNode();
        }
        zl2 zl2VarM32449constructorimpl = twh.m32449constructorimpl(zl2Var);
        twh.m32456setimpl(zl2VarM32449constructorimpl, pwfVar, c15179a.getSetMeasurePolicy());
        twh.m32456setimpl(zl2VarM32449constructorimpl, currentCompositionLocalMap, c15179a.getSetResolvedCompositionLocals());
        twh.m32456setimpl(zl2VarM32449constructorimpl, interfaceC0701eMaterializeModifier, c15179a.getSetModifier());
        gz6<xl2, Integer, bth> setCompositeKeyHash = c15179a.getSetCompositeKeyHash();
        if (zl2VarM32449constructorimpl.getInserting() || !md8.areEqual(zl2VarM32449constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            zl2VarM32449constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            zl2VarM32449constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        zl2Var.endNode();
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
    }
}
