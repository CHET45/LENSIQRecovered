package p000;

import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,490:1\n135#2:491\n135#2:492\n135#2:493\n135#2:494\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n57#1:491\n77#1:492\n101#1:493\n121#1:494\n*E\n"})
public final class soi {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final aid<vli> f82471a = jxa.modifierLocalOf(C12722a.f82472a);

    /* JADX INFO: renamed from: soi$a */
    public static final class C12722a extends tt8 implements ny6<vli> {

        /* JADX INFO: renamed from: a */
        public static final C12722a f82472a = new C12722a();

        public C12722a() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final vli invoke() {
            return goi.WindowInsets(0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: soi$b */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,178:1\n78#2,3:179\n*E\n"})
    public static final class C12723b extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vli f82473a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12723b(vli vliVar) {
            super(1);
            this.f82473a = vliVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("consumeWindowInsets");
            f58Var.getProperties().set("insets", this.f82473a);
        }
    }

    /* JADX INFO: renamed from: soi$c */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,178:1\n102#2,3:179\n*E\n"})
    public static final class C12724c extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vac f82474a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12724c(vac vacVar) {
            super(1);
            this.f82474a = vacVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("consumeWindowInsets");
            f58Var.getProperties().set("paddingValues", this.f82474a);
        }
    }

    /* JADX INFO: renamed from: soi$d */
    @dwf({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$consumeWindowInsets$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,490:1\n1223#2,6:491\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$consumeWindowInsets$2\n*L\n82#1:491,6\n*E\n"})
    public static final class C12725d extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vli f82475a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12725d(vli vliVar) {
            super(3);
            this.f82475a = vliVar;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(788931215);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(788931215, i, -1, "androidx.compose.foundation.layout.consumeWindowInsets.<anonymous> (WindowInsetsPadding.kt:81)");
            }
            boolean zChanged = zl2Var.changed(this.f82475a);
            vli vliVar = this.f82475a;
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new xsh(vliVar);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            xsh xshVar = (xsh) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return xshVar;
        }
    }

    /* JADX INFO: renamed from: soi$e */
    @dwf({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$consumeWindowInsets$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,490:1\n1223#2,6:491\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$consumeWindowInsets$4\n*L\n106#1:491,6\n*E\n"})
    public static final class C12726e extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vac f82476a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12726e(vac vacVar) {
            super(3);
            this.f82476a = vacVar;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(114694318);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(114694318, i, -1, "androidx.compose.foundation.layout.consumeWindowInsets.<anonymous> (WindowInsetsPadding.kt:105)");
            }
            boolean zChanged = zl2Var.changed(this.f82476a);
            vac vacVar = this.f82476a;
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new wac(vacVar);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            wac wacVar = (wac) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return wacVar;
        }
    }

    /* JADX INFO: renamed from: soi$f */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,178:1\n122#2,3:179\n*E\n"})
    public static final class C12727f extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6 f82477a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12727f(qy6 qy6Var) {
            super(1);
            this.f82477a = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("onConsumedWindowInsetsChanged");
            f58Var.getProperties().set("block", this.f82477a);
        }
    }

    /* JADX INFO: renamed from: soi$g */
    @dwf({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,490:1\n1223#2,6:491\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2\n*L\n126#1:491,6\n*E\n"})
    public static final class C12728g extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<vli, bth> f82478a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12728g(qy6<? super vli, bth> qy6Var) {
            super(3);
            this.f82478a = qy6Var;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(-1608161351);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1608161351, i, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:125)");
            }
            boolean zChanged = zl2Var.changed(this.f82478a);
            qy6<vli, bth> qy6Var = this.f82478a;
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new pu2(qy6Var);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            pu2 pu2Var = (pu2) objRememberedValue;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return pu2Var;
        }
    }

    /* JADX INFO: renamed from: soi$h */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,178:1\n58#2,3:179\n*E\n"})
    public static final class C12729h extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vli f82479a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12729h(vli vliVar) {
            super(1);
            this.f82479a = vliVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("windowInsetsPadding");
            f58Var.getProperties().set("insets", this.f82479a);
        }
    }

    /* JADX INFO: renamed from: soi$i */
    @dwf({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$windowInsetsPadding$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,490:1\n1223#2,6:491\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$windowInsetsPadding$2\n*L\n62#1:491,6\n*E\n"})
    public static final class C12730i extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vli f82480a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12730i(vli vliVar) {
            super(3);
            this.f82480a = vliVar;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(-1415685722);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1415685722, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:61)");
            }
            boolean zChanged = zl2Var.changed(this.f82480a);
            vli vliVar = this.f82480a;
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new v48(vliVar);
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

    @f0g
    @yfb
    public static final InterfaceC0701e consumeWindowInsets(@yfb InterfaceC0701e interfaceC0701e, @yfb vli vliVar) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C12723b(vliVar) : c58.getNoInspectorInfo(), new C12725d(vliVar));
    }

    @yfb
    public static final aid<vli> getModifierLocalConsumedWindowInsets() {
        return f82471a;
    }

    @f0g
    @yfb
    public static final InterfaceC0701e onConsumedWindowInsetsChanged(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super vli, bth> qy6Var) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C12727f(qy6Var) : c58.getNoInspectorInfo(), new C12728g(qy6Var));
    }

    @f0g
    @yfb
    public static final InterfaceC0701e windowInsetsPadding(@yfb InterfaceC0701e interfaceC0701e, @yfb vli vliVar) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C12729h(vliVar) : c58.getNoInspectorInfo(), new C12730i(vliVar));
    }

    @f0g
    @yfb
    public static final InterfaceC0701e consumeWindowInsets(@yfb InterfaceC0701e interfaceC0701e, @yfb vac vacVar) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C12724c(vacVar) : c58.getNoInspectorInfo(), new C12726e(vacVar));
    }
}
