package p000;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.input.nestedscroll.C0745a;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,725:1\n135#2:726\n77#3:727\n77#3:728\n77#3:729\n1223#4,6:730\n1223#4,6:736\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n77#1:726\n113#1:727\n115#1:728\n116#1:729\n117#1:730,6\n120#1:736,6\n*E\n"})
public final class wni {

    /* JADX INFO: renamed from: a */
    public static final float f94881a = 0.35f;

    /* JADX INFO: renamed from: b */
    public static final float f94882b = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: c */
    public static final float f94883c = 9.80665f;

    /* JADX INFO: renamed from: d */
    public static final float f94884d = 39.37f;

    /* JADX INFO: renamed from: e */
    public static final double f94885e;

    /* JADX INFO: renamed from: f */
    public static final double f94886f;

    /* JADX INFO: renamed from: g */
    public static final float f94887g = 0.5f;

    /* JADX INFO: renamed from: h */
    public static final float f94888h = 1.0f;

    /* JADX INFO: renamed from: i */
    public static final float f94889i = 0.175f;

    /* JADX INFO: renamed from: j */
    public static final float f94890j = 0.35000002f;

    /* JADX INFO: renamed from: wni$a */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt\n*L\n1#1,178:1\n78#2,2:179\n*E\n"})
    public static final class C14713a extends tt8 implements qy6<f58, bth> {
        public C14713a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("imeNestedScroll");
        }
    }

    /* JADX INFO: renamed from: wni$b */
    public static final class C14714b extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public static final C14714b f94891a = new C14714b();

        public C14714b() {
            super(3);
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(-369978792);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-369978792, i, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:80)");
            }
            InterfaceC0701e interfaceC0701eNestedScroll$default = C0745a.nestedScroll$default(interfaceC0701e, wni.m32996rememberWindowInsetsConnectionVRgvIgI(foi.f37296x.current(zl2Var, 6).getIme(), uoi.f88691b.m32630getBottomJoeWqyM(), zl2Var, 48), null, 2, null);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return interfaceC0701eNestedScroll$default;
        }
    }

    /* JADX INFO: renamed from: wni$c */
    @dwf({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,725:1\n64#2,5:726\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1\n*L\n121#1:726,5\n*E\n"})
    public static final class C14715c extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ roi f94892a;

        /* JADX INFO: renamed from: wni$c$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1\n*L\n1#1,497:1\n122#2,2:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ roi f94893a;

            public a(roi roiVar) {
                this.f94893a = roiVar;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f94893a.dispose();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14715c(roi roiVar) {
            super(1);
            this.f94892a = roiVar;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            return new a(this.f94892a);
        }
    }

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f94885e = dLog;
        f94886f = dLog - 1.0d;
    }

    @hh5
    @yfb
    public static final InterfaceC0701e imeNestedScroll(@yfb InterfaceC0701e interfaceC0701e) {
        if (Build.VERSION.SDK_INT < 30) {
            return interfaceC0701e;
        }
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C14713a() : c58.getNoInspectorInfo(), C14714b.f94891a);
    }

    @hh5
    @yfb
    @hk2
    /* JADX INFO: renamed from: rememberWindowInsetsConnection-VRgvIgI, reason: not valid java name */
    public static final hab m32996rememberWindowInsetsConnectionVRgvIgI(@yfb C10671ow c10671ow, int i, @gib zl2 zl2Var, int i2) {
        zl2Var.startReplaceGroup(-1011341039);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1011341039, i2, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:108)");
        }
        if (Build.VERSION.SDK_INT < 30) {
            lh4 lh4Var = lh4.f57572a;
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return lh4Var;
        }
        ubf ubfVarM32595chooseCalculatorni1skBw = ubf.f87449a.m32595chooseCalculatorni1skBw(i, (ov8) zl2Var.consume(sn2.getLocalLayoutDirection()));
        View view = (View) zl2Var.consume(AndroidCompositionLocals_androidKt.getLocalView());
        c64 c64Var = (c64) zl2Var.consume(sn2.getLocalDensity());
        boolean zChanged = ((((i2 & 14) ^ 6) > 4 && zl2Var.changed(c10671ow)) || (i2 & 6) == 4) | zl2Var.changed(view) | zl2Var.changed(ubfVarM32595chooseCalculatorni1skBw) | zl2Var.changed(c64Var);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new roi(c10671ow, view, ubfVarM32595chooseCalculatorni1skBw, c64Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        roi roiVar = (roi) objRememberedValue;
        boolean zChangedInstance = zl2Var.changedInstance(roiVar);
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == zl2.f105372a.getEmpty()) {
            objRememberedValue2 = new C14715c(roiVar);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        jx4.DisposableEffect(roiVar, (qy6<? super wf4, ? extends vf4>) objRememberedValue2, zl2Var, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        zl2Var.endReplaceGroup();
        return roiVar;
    }
}
