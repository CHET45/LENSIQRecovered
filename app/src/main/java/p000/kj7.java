package p000;

import androidx.compose.foundation.layout.C0626c0;
import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import p000.do6;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,135:1\n135#2:136\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n53#1:136\n*E\n"})
public final class kj7 {

    /* JADX INFO: renamed from: a */
    public static final int f54258a = 1;

    /* JADX INFO: renamed from: kj7$a */
    @dwf({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n1#1,178:1\n54#2,5:179\n*E\n"})
    public static final class C8394a extends tt8 implements qy6<f58, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f54259a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f54260b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ yvg f54261c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8394a(int i, int i2, yvg yvgVar) {
            super(1);
            this.f54259a = i;
            this.f54260b = i2;
            this.f54261c = yvgVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(f58 f58Var) {
            invoke2(f58Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb f58 f58Var) {
            f58Var.setName("heightInLines");
            f58Var.getProperties().set("minLines", Integer.valueOf(this.f54259a));
            f58Var.getProperties().set("maxLines", Integer.valueOf(this.f54260b));
            f58Var.getProperties().set("textStyle", this.f54261c);
        }
    }

    /* JADX INFO: renamed from: kj7$b */
    @dwf({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,135:1\n77#2:136\n77#2:137\n77#2:138\n1223#3,6:139\n1223#3,6:145\n1223#3,6:151\n1223#3,6:157\n81#4:163\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n*L\n63#1:136\n64#1:137\n65#1:138\n69#1:139,6\n72#1:145,6\n81#1:151,6\n97#1:157,6\n72#1:163\n*E\n"})
    public static final class C8395b extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f54262a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f54263b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ yvg f54264c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8395b(int i, int i2, yvg yvgVar) {
            super(3);
            this.f54262a = i;
            this.f54263b = i2;
            this.f54264c = yvgVar;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(408240218);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(408240218, i, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
            }
            kj7.validateMinMaxLines(this.f54262a, this.f54263b);
            if (this.f54262a == 1 && this.f54263b == Integer.MAX_VALUE) {
                InterfaceC0701e.a aVar = InterfaceC0701e.f5158d1;
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventEnd();
                }
                zl2Var.endReplaceGroup();
                return aVar;
            }
            c64 c64Var = (c64) zl2Var.consume(sn2.getLocalDensity());
            do6.InterfaceC4891b interfaceC4891b = (do6.InterfaceC4891b) zl2Var.consume(sn2.getLocalFontFamilyResolver());
            ov8 ov8Var = (ov8) zl2Var.consume(sn2.getLocalLayoutDirection());
            boolean zChanged = zl2Var.changed(this.f54264c) | zl2Var.changed(ov8Var);
            yvg yvgVar = this.f54264c;
            Object objRememberedValue = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = zvg.resolveDefaults(yvgVar, ov8Var);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            yvg yvgVar2 = (yvg) objRememberedValue;
            boolean zChanged2 = zl2Var.changed(interfaceC4891b) | zl2Var.changed(yvgVar2);
            Object objRememberedValue2 = zl2Var.rememberedValue();
            if (zChanged2 || objRememberedValue2 == zl2.f105372a.getEmpty()) {
                do6 fontFamily = yvgVar2.getFontFamily();
                jp6 fontWeight = yvgVar2.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = jp6.f51403b.getNormal();
                }
                fp6 fp6VarM33439getFontStyle4Lr2A7w = yvgVar2.m33439getFontStyle4Lr2A7w();
                int iM29578unboximpl = fp6VarM33439getFontStyle4Lr2A7w != null ? fp6VarM33439getFontStyle4Lr2A7w.m29578unboximpl() : fp6.f37355b.m29582getNormal_LCdwA();
                gp6 gp6VarM33440getFontSynthesisZQGJjVo = yvgVar2.m33440getFontSynthesisZQGJjVo();
                objRememberedValue2 = interfaceC4891b.mo28659resolveDPcqOEQ(fontFamily, fontWeight, iM29578unboximpl, gp6VarM33440getFontSynthesisZQGJjVo != null ? gp6VarM33440getFontSynthesisZQGJjVo.m29848unboximpl() : gp6.f40694b.m29849getAllGVVA2EU());
                zl2Var.updateRememberedValue(objRememberedValue2);
            }
            i2g i2gVar = (i2g) objRememberedValue2;
            boolean zChanged3 = zl2Var.changed(i2gVar.getValue()) | zl2Var.changed(c64Var) | zl2Var.changed(interfaceC4891b) | zl2Var.changed(this.f54264c) | zl2Var.changed(ov8Var);
            Object objRememberedValue3 = zl2Var.rememberedValue();
            if (zChanged3 || objRememberedValue3 == zl2.f105372a.getEmpty()) {
                objRememberedValue3 = Integer.valueOf(r78.m32086getHeightimpl(srg.computeSizeForDefaultText(yvgVar2, c64Var, interfaceC4891b, srg.getEmptyTextReplacement(), 1)));
                zl2Var.updateRememberedValue(objRememberedValue3);
            }
            int iIntValue = ((Number) objRememberedValue3).intValue();
            boolean zChanged4 = zl2Var.changed(ov8Var) | zl2Var.changed(c64Var) | zl2Var.changed(interfaceC4891b) | zl2Var.changed(this.f54264c) | zl2Var.changed(i2gVar.getValue());
            Object objRememberedValue4 = zl2Var.rememberedValue();
            if (zChanged4 || objRememberedValue4 == zl2.f105372a.getEmpty()) {
                objRememberedValue4 = Integer.valueOf(r78.m32086getHeightimpl(srg.computeSizeForDefaultText(yvgVar2, c64Var, interfaceC4891b, srg.getEmptyTextReplacement() + '\n' + srg.getEmptyTextReplacement(), 2)));
                zl2Var.updateRememberedValue(objRememberedValue4);
            }
            int iIntValue2 = ((Number) objRememberedValue4).intValue() - iIntValue;
            int i2 = this.f54262a;
            Integer numValueOf = i2 == 1 ? null : Integer.valueOf(((i2 - 1) * iIntValue2) + iIntValue);
            int i3 = this.f54263b;
            Integer numValueOf2 = i3 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i3 - 1))) : null;
            InterfaceC0701e interfaceC0701eM27409heightInVpY3zN4 = C0626c0.m27409heightInVpY3zN4(InterfaceC0701e.f5158d1, numValueOf != null ? c64Var.mo27170toDpu2uoSUM(numValueOf.intValue()) : kn4.f54774b.m30725getUnspecifiedD9Ej5fM(), numValueOf2 != null ? c64Var.mo27170toDpu2uoSUM(numValueOf2.intValue()) : kn4.f54774b.m30725getUnspecifiedD9Ej5fM());
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return interfaceC0701eM27409heightInVpY3zN4;
        }
    }

    @yfb
    public static final InterfaceC0701e heightInLines(@yfb InterfaceC0701e interfaceC0701e, @yfb yvg yvgVar, int i, int i2) {
        return C0696c.composed(interfaceC0701e, c58.isDebugInspectorInfoEnabled() ? new C8394a(i, i2, yvgVar) : c58.getNoInspectorInfo(), new C8395b(i, i2, yvgVar));
    }

    public static /* synthetic */ InterfaceC0701e heightInLines$default(InterfaceC0701e interfaceC0701e, yvg yvgVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return heightInLines(interfaceC0701e, yvgVar, i, i2);
    }

    public static final void validateMinMaxLines(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException(("both minLines " + i + " and maxLines " + i2 + " must be greater than zero").toString());
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException(("minLines " + i + " must be less than or equal to maxLines " + i2).toString());
    }
}
