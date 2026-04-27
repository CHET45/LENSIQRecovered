package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n148#2:485\n148#2:486\n148#2:487\n148#2:488\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n*L\n460#1:485\n461#1:486\n462#1:487\n463#1:488\n*E\n"})
public final class zac extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: X */
    @yfb
    public vac f104637X;

    /* JADX INFO: renamed from: zac$a */
    public static final class C16060a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f104638a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0761n f104639b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zac f104640c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16060a(AbstractC0767t abstractC0767t, InterfaceC0761n interfaceC0761n, zac zacVar) {
            super(1);
            this.f104638a = abstractC0767t;
            this.f104639b = interfaceC0761n;
            this.f104640c = zacVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.place$default(aVar, this.f104638a, this.f104639b.mo27167roundToPx0680j_4(this.f104640c.getPaddingValues().mo32750calculateLeftPaddingu2uoSUM(this.f104639b.getLayoutDirection())), this.f104639b.mo27167roundToPx0680j_4(this.f104640c.getPaddingValues().mo32752calculateTopPaddingD9Ej5fM()), 0.0f, 4, null);
        }
    }

    public zac(@yfb vac vacVar) {
        this.f104637X = vacVar;
    }

    @yfb
    public final vac getPaddingValues() {
        return this.f104637X;
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        float f = 0;
        if (kn4.m30704compareTo0680j_4(this.f104637X.mo32750calculateLeftPaddingu2uoSUM(interfaceC0761n.getLayoutDirection()), kn4.m30705constructorimpl(f)) < 0 || kn4.m30704compareTo0680j_4(this.f104637X.mo32752calculateTopPaddingD9Ej5fM(), kn4.m30705constructorimpl(f)) < 0 || kn4.m30704compareTo0680j_4(this.f104637X.mo32751calculateRightPaddingu2uoSUM(interfaceC0761n.getLayoutDirection()), kn4.m30705constructorimpl(f)) < 0 || kn4.m30704compareTo0680j_4(this.f104637X.mo32749calculateBottomPaddingD9Ej5fM(), kn4.m30705constructorimpl(f)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int iMo27167roundToPx0680j_4 = interfaceC0761n.mo27167roundToPx0680j_4(this.f104637X.mo32750calculateLeftPaddingu2uoSUM(interfaceC0761n.getLayoutDirection())) + interfaceC0761n.mo27167roundToPx0680j_4(this.f104637X.mo32751calculateRightPaddingu2uoSUM(interfaceC0761n.getLayoutDirection()));
        int iMo27167roundToPx0680j_42 = interfaceC0761n.mo27167roundToPx0680j_4(this.f104637X.mo32752calculateTopPaddingD9Ej5fM()) + interfaceC0761n.mo27167roundToPx0680j_4(this.f104637X.mo32749calculateBottomPaddingD9Ej5fM());
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(nu2.m31229offsetNN6EwU(j, -iMo27167roundToPx0680j_4, -iMo27167roundToPx0680j_42));
        return InterfaceC0761n.layout$default(interfaceC0761n, nu2.m31227constrainWidthK40F9xA(j, abstractC0767tMo27949measureBRTryo0.getWidth() + iMo27167roundToPx0680j_4), nu2.m31226constrainHeightK40F9xA(j, abstractC0767tMo27949measureBRTryo0.getHeight() + iMo27167roundToPx0680j_42), null, new C16060a(abstractC0767tMo27949measureBRTryo0, interfaceC0761n, this), 4, null);
    }

    public final void setPaddingValues(@yfb vac vacVar) {
        this.f104637X = vacVar;
    }
}
