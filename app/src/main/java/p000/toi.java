package p000;

import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,256:1\n249#1,7:258\n249#1,7:266\n249#1,7:274\n249#1,7:282\n249#1,7:290\n249#1,7:298\n249#1,7:306\n249#1,7:314\n249#1,7:322\n249#1,7:330\n249#1,7:338\n249#1,7:346\n135#2:257\n135#2:265\n135#2:273\n135#2:281\n135#2:289\n135#2:297\n135#2:305\n135#2:313\n135#2:321\n135#2:329\n135#2:337\n135#2:345\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n41#1:258,7\n59#1:266,7\n77#1:274,7\n95#1:282,7\n113#1:290,7\n131#1:298,7\n149#1:306,7\n167#1:314,7\n185#1:322,7\n203#1:330,7\n221#1:338,7\n240#1:346,7\n41#1:257\n59#1:265\n77#1:273\n95#1:281\n113#1:289\n131#1:297\n149#1:305\n167#1:313\n185#1:321\n203#1:329\n221#1:337\n240#1:345\n*E\n"})
public final class toi {

    /* JADX INFO: renamed from: toi$a */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n185#2:179\n*E\n"})
    public static final class C13132a extends tt8 implements qy6<f58, bth> {
        public C13132a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("captionBarPadding");
        }
    }

    /* JADX INFO: renamed from: toi$b */
    @dwf({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,256:1\n1223#2,3:257\n1226#2,3:261\n185#3:260\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:257,3\n251#1:261,3\n*E\n"})
    public static final class C13133b extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {
        public C13133b() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(359872873);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            foi foiVarCurrent = foi.f37296x.current(zl2Var, 6);
            boolean zChanged = zl2Var.changed(foiVarCurrent);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new v48(foiVarCurrent.getCaptionBar());
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            v48 v48Var = (v48) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return v48Var;
        }
    }

    /* JADX INFO: renamed from: toi$c */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n113#2:179\n*E\n"})
    public static final class C13134c extends tt8 implements qy6<f58, bth> {
        public C13134c() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("displayCutoutPadding");
        }
    }

    /* JADX INFO: renamed from: toi$d */
    @dwf({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,256:1\n1223#2,3:257\n1226#2,3:261\n113#3:260\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:257,3\n251#1:261,3\n*E\n"})
    public static final class C13135d extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {
        public C13135d() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(359872873);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            foi foiVarCurrent = foi.f37296x.current(zl2Var, 6);
            boolean zChanged = zl2Var.changed(foiVarCurrent);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new v48(foiVarCurrent.getDisplayCutout());
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            v48 v48Var = (v48) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return v48Var;
        }
    }

    /* JADX INFO: renamed from: toi$e */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n149#2:179\n*E\n"})
    public static final class C13136e extends tt8 implements qy6<f58, bth> {
        public C13136e() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("imePadding");
        }
    }

    /* JADX INFO: renamed from: toi$f */
    @dwf({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,256:1\n1223#2,3:257\n1226#2,3:261\n149#3:260\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:257,3\n251#1:261,3\n*E\n"})
    public static final class C13137f extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {
        public C13137f() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(359872873);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            foi foiVarCurrent = foi.f37296x.current(zl2Var, 6);
            boolean zChanged = zl2Var.changed(foiVarCurrent);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new v48(foiVarCurrent.getIme());
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            v48 v48Var = (v48) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return v48Var;
        }
    }

    /* JADX INFO: renamed from: toi$g */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n240#2:179\n*E\n"})
    public static final class C13138g extends tt8 implements qy6<f58, bth> {
        public C13138g() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("mandatorySystemGesturesPadding");
        }
    }

    /* JADX INFO: renamed from: toi$h */
    @dwf({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,256:1\n1223#2,3:257\n1226#2,3:261\n241#3:260\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:257,3\n251#1:261,3\n*E\n"})
    public static final class C13139h extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {
        public C13139h() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(359872873);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            foi foiVarCurrent = foi.f37296x.current(zl2Var, 6);
            boolean zChanged = zl2Var.changed(foiVarCurrent);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new v48(foiVarCurrent.getMandatorySystemGestures());
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            v48 v48Var = (v48) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return v48Var;
        }
    }

    /* JADX INFO: renamed from: toi$i */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n167#2:179\n*E\n"})
    public static final class C13140i extends tt8 implements qy6<f58, bth> {
        public C13140i() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("navigationBarsPadding");
        }
    }

    /* JADX INFO: renamed from: toi$j */
    @dwf({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,256:1\n1223#2,3:257\n1226#2,3:261\n167#3:260\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:257,3\n251#1:261,3\n*E\n"})
    public static final class C13141j extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {
        public C13141j() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(359872873);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            foi foiVarCurrent = foi.f37296x.current(zl2Var, 6);
            boolean zChanged = zl2Var.changed(foiVarCurrent);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new v48(foiVarCurrent.getNavigationBars());
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            v48 v48Var = (v48) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return v48Var;
        }
    }

    /* JADX INFO: renamed from: toi$k */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n77#2:179\n*E\n"})
    public static final class C13142k extends tt8 implements qy6<f58, bth> {
        public C13142k() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("safeContentPadding");
        }
    }

    /* JADX INFO: renamed from: toi$l */
    @dwf({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,256:1\n1223#2,3:257\n1226#2,3:261\n77#3:260\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:257,3\n251#1:261,3\n*E\n"})
    public static final class C13143l extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {
        public C13143l() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(359872873);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            foi foiVarCurrent = foi.f37296x.current(zl2Var, 6);
            boolean zChanged = zl2Var.changed(foiVarCurrent);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new v48(foiVarCurrent.getSafeContent());
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            v48 v48Var = (v48) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return v48Var;
        }
    }

    /* JADX INFO: renamed from: toi$m */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n41#2:179\n*E\n"})
    public static final class C13144m extends tt8 implements qy6<f58, bth> {
        public C13144m() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("safeDrawingPadding");
        }
    }

    /* JADX INFO: renamed from: toi$n */
    @dwf({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,256:1\n1223#2,3:257\n1226#2,3:261\n41#3:260\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:257,3\n251#1:261,3\n*E\n"})
    public static final class C13145n extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {
        public C13145n() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(359872873);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            foi foiVarCurrent = foi.f37296x.current(zl2Var, 6);
            boolean zChanged = zl2Var.changed(foiVarCurrent);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new v48(foiVarCurrent.getSafeDrawing());
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            v48 v48Var = (v48) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return v48Var;
        }
    }

    /* JADX INFO: renamed from: toi$o */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n59#2:179\n*E\n"})
    public static final class C13146o extends tt8 implements qy6<f58, bth> {
        public C13146o() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("safeGesturesPadding");
        }
    }

    /* JADX INFO: renamed from: toi$p */
    @dwf({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,256:1\n1223#2,3:257\n1226#2,3:261\n59#3:260\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:257,3\n251#1:261,3\n*E\n"})
    public static final class C13147p extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {
        public C13147p() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(359872873);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            foi foiVarCurrent = foi.f37296x.current(zl2Var, 6);
            boolean zChanged = zl2Var.changed(foiVarCurrent);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new v48(foiVarCurrent.getSafeGestures());
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            v48 v48Var = (v48) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return v48Var;
        }
    }

    /* JADX INFO: renamed from: toi$q */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n131#2:179\n*E\n"})
    public static final class C13148q extends tt8 implements qy6<f58, bth> {
        public C13148q() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("statusBarsPadding");
        }
    }

    /* JADX INFO: renamed from: toi$r */
    @dwf({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,256:1\n1223#2,3:257\n1226#2,3:261\n131#3:260\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:257,3\n251#1:261,3\n*E\n"})
    public static final class C13149r extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {
        public C13149r() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(359872873);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            foi foiVarCurrent = foi.f37296x.current(zl2Var, 6);
            boolean zChanged = zl2Var.changed(foiVarCurrent);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new v48(foiVarCurrent.getStatusBars());
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            v48 v48Var = (v48) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return v48Var;
        }
    }

    /* JADX INFO: renamed from: toi$s */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n95#2:179\n*E\n"})
    public static final class C13150s extends tt8 implements qy6<f58, bth> {
        public C13150s() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("systemBarsPadding");
        }
    }

    /* JADX INFO: renamed from: toi$t */
    @dwf({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,256:1\n1223#2,3:257\n1226#2,3:261\n95#3:260\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:257,3\n251#1:261,3\n*E\n"})
    public static final class C13151t extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {
        public C13151t() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(359872873);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            foi foiVarCurrent = foi.f37296x.current(zl2Var, 6);
            boolean zChanged = zl2Var.changed(foiVarCurrent);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new v48(foiVarCurrent.getSystemBars());
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            v48 v48Var = (v48) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return v48Var;
        }
    }

    /* JADX INFO: renamed from: toi$u */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n221#2:179\n*E\n"})
    public static final class C13152u extends tt8 implements qy6<f58, bth> {
        public C13152u() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("systemGesturesPadding");
        }
    }

    /* JADX INFO: renamed from: toi$v */
    @dwf({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,256:1\n1223#2,3:257\n1226#2,3:261\n221#3:260\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:257,3\n251#1:261,3\n*E\n"})
    public static final class C13153v extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {
        public C13153v() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(359872873);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            foi foiVarCurrent = foi.f37296x.current(zl2Var, 6);
            boolean zChanged = zl2Var.changed(foiVarCurrent);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new v48(foiVarCurrent.getSystemGestures());
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            v48 v48Var = (v48) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return v48Var;
        }
    }

    /* JADX INFO: renamed from: toi$w */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,178:1\n203#2:179\n*E\n"})
    public static final class C13154w extends tt8 implements qy6<f58, bth> {
        public C13154w() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("waterfallPadding");
        }
    }

    /* JADX INFO: renamed from: toi$x */
    @dwf({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n1#1,256:1\n1223#2,3:257\n1226#2,3:261\n203#3:260\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:257,3\n251#1:261,3\n*E\n"})
    public static final class C13155x extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {
        public C13155x() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(359872873);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            foi foiVarCurrent = foi.f37296x.current(zl2Var, 6);
            boolean zChanged = zl2Var.changed(foiVarCurrent);
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new v48(foiVarCurrent.getWaterfall());
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            v48 v48Var = (v48) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return v48Var;
        }
    }

    /* JADX INFO: renamed from: toi$y */
    @dwf({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,256:1\n1223#2,6:257\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:257,6\n*E\n"})
    public static final class C13156y extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<foi, vli> f85525a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13156y(qy6<? super foi, ? extends vli> qy6Var) {
            super(3);
            this.f85525a = qy6Var;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(359872873);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            foi foiVarCurrent = foi.f37296x.current(zl2Var, 6);
            boolean zChanged = zl2Var.changed(foiVarCurrent);
            qy6<foi, vli> qy6Var = this.f85525a;
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new v48(qy6Var.invoke(foiVarCurrent));
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            v48 v48Var = (v48) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return v48Var;
        }
    }

    @yfb
    public static final InterfaceC0701e captionBarPadding(@yfb InterfaceC0701e interfaceC0701e) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C13132a() : c58.getNoInspectorInfo(), new C13133b());
    }

    @yfb
    public static final InterfaceC0701e displayCutoutPadding(@yfb InterfaceC0701e interfaceC0701e) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C13134c() : c58.getNoInspectorInfo(), new C13135d());
    }

    @yfb
    public static final InterfaceC0701e imePadding(@yfb InterfaceC0701e interfaceC0701e) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C13136e() : c58.getNoInspectorInfo(), new C13137f());
    }

    @yfb
    public static final InterfaceC0701e mandatorySystemGesturesPadding(@yfb InterfaceC0701e interfaceC0701e) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C13138g() : c58.getNoInspectorInfo(), new C13139h());
    }

    @yfb
    public static final InterfaceC0701e navigationBarsPadding(@yfb InterfaceC0701e interfaceC0701e) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C13140i() : c58.getNoInspectorInfo(), new C13141j());
    }

    @yfb
    public static final InterfaceC0701e safeContentPadding(@yfb InterfaceC0701e interfaceC0701e) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C13142k() : c58.getNoInspectorInfo(), new C13143l());
    }

    @yfb
    public static final InterfaceC0701e safeDrawingPadding(@yfb InterfaceC0701e interfaceC0701e) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C13144m() : c58.getNoInspectorInfo(), new C13145n());
    }

    @yfb
    public static final InterfaceC0701e safeGesturesPadding(@yfb InterfaceC0701e interfaceC0701e) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C13146o() : c58.getNoInspectorInfo(), new C13147p());
    }

    @yfb
    public static final InterfaceC0701e statusBarsPadding(@yfb InterfaceC0701e interfaceC0701e) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C13148q() : c58.getNoInspectorInfo(), new C13149r());
    }

    @yfb
    public static final InterfaceC0701e systemBarsPadding(@yfb InterfaceC0701e interfaceC0701e) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C13150s() : c58.getNoInspectorInfo(), new C13151t());
    }

    @yfb
    public static final InterfaceC0701e systemGesturesPadding(@yfb InterfaceC0701e interfaceC0701e) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C13152u() : c58.getNoInspectorInfo(), new C13153v());
    }

    @yfb
    public static final InterfaceC0701e waterfallPadding(@yfb InterfaceC0701e interfaceC0701e) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C13154w() : c58.getNoInspectorInfo(), new C13155x());
    }

    @f0g
    private static final InterfaceC0701e windowInsetsPadding(InterfaceC0701e interfaceC0701e, qy6<? super f58, bth> qy6Var, qy6<? super foi, ? extends vli> qy6Var2) {
        return C0696c.composed(interfaceC0701e, qy6Var, new C13156y(qy6Var2));
    }
}
