package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.do6;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextFieldTextLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,174:1\n148#2:175\n26#3:176\n26#3:177\n*S KotlinDebug\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode\n*L\n156#1:175\n161#1:176\n162#1:177\n*E\n"})
@e0g(parameters = 0)
public final class ysg extends InterfaceC0701e.d implements ew8, o77, mn2 {

    /* JADX INFO: renamed from: M1 */
    public static final int f102914M1 = 8;

    /* JADX INFO: renamed from: X */
    @yfb
    public lug f102915X;

    /* JADX INFO: renamed from: Y */
    public boolean f102916Y;

    /* JADX INFO: renamed from: Z */
    @gib
    public Map<AbstractC9938nm, Integer> f102917Z;

    /* JADX INFO: renamed from: ysg$a */
    public static final class C15800a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f102918a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15800a(AbstractC0767t abstractC0767t) {
            super(1);
            this.f102918a = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.place$default(aVar, this.f102918a, 0, 0, 0.0f, 4, null);
        }
    }

    public ysg(@yfb lug lugVar, @yfb jeh jehVar, @yfb yvg yvgVar, boolean z, @gib gz6<? super c64, ? super ny6<hug>, bth> gz6Var) {
        this.f102915X = lugVar;
        this.f102916Y = z;
        lugVar.setOnTextLayout(gz6Var);
        lug lugVar2 = this.f102915X;
        boolean z2 = this.f102916Y;
        lugVar2.updateNonMeasureInputs(jehVar, yvgVar, z2, !z2);
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        hug hugVarM30898layoutWithNewMeasureInputshBUhpc = this.f102915X.m30898layoutWithNewMeasureInputshBUhpc(interfaceC0761n, interfaceC0761n.getLayoutDirection(), (do6.InterfaceC4891b) nn2.currentValueOf(this, sn2.getLocalFontFamilyResolver()), j);
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(ku2.f55323b.m30772fitPrioritizingWidthZbe2FdA(r78.m32087getWidthimpl(hugVarM30898layoutWithNewMeasureInputshBUhpc.m30130getSizeYbymL2g()), r78.m32087getWidthimpl(hugVarM30898layoutWithNewMeasureInputshBUhpc.m30130getSizeYbymL2g()), r78.m32086getHeightimpl(hugVarM30898layoutWithNewMeasureInputshBUhpc.m30130getSizeYbymL2g()), r78.m32086getHeightimpl(hugVarM30898layoutWithNewMeasureInputshBUhpc.m30130getSizeYbymL2g())));
        this.f102915X.m30899setMinHeightForSingleLineField0680j_4(this.f102916Y ? interfaceC0761n.mo27170toDpu2uoSUM(uqg.ceilToIntPx(hugVarM30898layoutWithNewMeasureInputshBUhpc.getLineBottom(0))) : kn4.m30705constructorimpl(0));
        Map<AbstractC9938nm, Integer> linkedHashMap = this.f102917Z;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>(2);
        }
        linkedHashMap.put(C10463om.getFirstBaseline(), Integer.valueOf(Math.round(hugVarM30898layoutWithNewMeasureInputshBUhpc.getFirstBaseline())));
        linkedHashMap.put(C10463om.getLastBaseline(), Integer.valueOf(Math.round(hugVarM30898layoutWithNewMeasureInputshBUhpc.getLastBaseline())));
        this.f102917Z = linkedHashMap;
        int iM32087getWidthimpl = r78.m32087getWidthimpl(hugVarM30898layoutWithNewMeasureInputshBUhpc.m30130getSizeYbymL2g());
        int iM32086getHeightimpl = r78.m32086getHeightimpl(hugVarM30898layoutWithNewMeasureInputshBUhpc.m30130getSizeYbymL2g());
        Map<AbstractC9938nm, Integer> map = this.f102917Z;
        md8.checkNotNull(map);
        return interfaceC0761n.layout(iM32087getWidthimpl, iM32086getHeightimpl, map, new C15800a(abstractC0767tMo27949measureBRTryo0));
    }

    @Override // p000.o77
    public void onGloballyPositioned(@yfb mv8 mv8Var) {
        this.f102915X.setTextLayoutNodeCoordinates(mv8Var);
    }

    public final void updateNode(@yfb lug lugVar, @yfb jeh jehVar, @yfb yvg yvgVar, boolean z, @gib gz6<? super c64, ? super ny6<hug>, bth> gz6Var) {
        this.f102915X = lugVar;
        lugVar.setOnTextLayout(gz6Var);
        this.f102916Y = z;
        this.f102915X.updateNonMeasureInputs(jehVar, yvgVar, z, !z);
    }
}
