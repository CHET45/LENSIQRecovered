package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.draw.C0699a;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCanvas.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Canvas.kt\nandroidx/compose/foundation/CanvasKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,65:1\n1223#2,6:66\n*S KotlinDebug\n*F\n+ 1 Canvas.kt\nandroidx/compose/foundation/CanvasKt\n*L\n64#1:66,6\n*E\n"})
public final class qr1 {

    /* JADX INFO: renamed from: qr1$a */
    public static final class C11604a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f75183a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<ip4, bth> f75184b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f75185c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11604a(InterfaceC0701e interfaceC0701e, qy6<? super ip4, bth> qy6Var, int i) {
            super(2);
            this.f75183a = interfaceC0701e;
            this.f75184b = qy6Var;
            this.f75185c = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            qr1.Canvas(this.f75183a, this.f75184b, zl2Var, tsd.updateChangedFlags(this.f75185c | 1));
        }
    }

    /* JADX INFO: renamed from: qr1$b */
    public static final class C11605b extends tt8 implements qy6<eye, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f75186a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11605b(String str) {
            super(1);
            this.f75186a = str;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
            invoke2(eyeVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb eye eyeVar) {
            bye.setContentDescription(eyeVar, this.f75186a);
        }
    }

    /* JADX INFO: renamed from: qr1$c */
    public static final class C11606c extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f75187a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f75188b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qy6<ip4, bth> f75189c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f75190d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11606c(InterfaceC0701e interfaceC0701e, String str, qy6<? super ip4, bth> qy6Var, int i) {
            super(2);
            this.f75187a = interfaceC0701e;
            this.f75188b = str;
            this.f75189c = qy6Var;
            this.f75190d = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            qr1.Canvas(this.f75187a, this.f75188b, this.f75189c, zl2Var, tsd.updateChangedFlags(this.f75190d | 1));
        }
    }

    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    public static final void Canvas(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super ip4, bth> qy6Var, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-932836462);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changed(interfaceC0701e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(qy6Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-932836462, i2, -1, "androidx.compose.foundation.Canvas (Canvas.kt:42)");
            }
            owf.Spacer(C0699a.drawBehind(interfaceC0701e, qy6Var), zl2VarStartRestartGroup, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C11604a(interfaceC0701e, qy6Var, i));
        }
    }

    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    public static final void Canvas(@yfb InterfaceC0701e interfaceC0701e, @yfb String str, @yfb qy6<? super ip4, bth> qy6Var, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-1162737955);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changed(interfaceC0701e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zl2VarStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(qy6Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1162737955, i2, -1, "androidx.compose.foundation.Canvas (Canvas.kt:63)");
            }
            InterfaceC0701e interfaceC0701eDrawBehind = C0699a.drawBehind(interfaceC0701e, qy6Var);
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new C11605b(str);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            owf.Spacer(qxe.semantics$default(interfaceC0701eDrawBehind, false, (qy6) objRememberedValue, 1, null), zl2VarStartRestartGroup, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C11606c(interfaceC0701e, str, qy6Var, i));
        }
    }
}
