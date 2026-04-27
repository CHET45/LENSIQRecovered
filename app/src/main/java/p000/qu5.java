package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/FillNode\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1112:1\n26#2:1113\n26#2:1114\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/FillNode\n*L\n680#1:1113\n691#1:1114\n*E\n"})
public final class qu5 extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: X */
    @yfb
    public qd4 f75770X;

    /* JADX INFO: renamed from: Y */
    public float f75771Y;

    /* JADX INFO: renamed from: qu5$a */
    public static final class C11697a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f75772a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11697a(AbstractC0767t abstractC0767t) {
            super(1);
            this.f75772a = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.placeRelative$default(aVar, this.f75772a, 0, 0, 0.0f, 4, null);
        }
    }

    public qu5(@yfb qd4 qd4Var, float f) {
        this.f75770X = qd4Var;
        this.f75771Y = f;
    }

    @yfb
    public final qd4 getDirection() {
        return this.f75770X;
    }

    public final float getFraction() {
        return this.f75771Y;
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        int iM30765getMinWidthimpl;
        int iM30763getMaxWidthimpl;
        int iM30762getMaxHeightimpl;
        int iCoerceIn;
        if (!ku2.m30759getHasBoundedWidthimpl(j) || this.f75770X == qd4.Vertical) {
            iM30765getMinWidthimpl = ku2.m30765getMinWidthimpl(j);
            iM30763getMaxWidthimpl = ku2.m30763getMaxWidthimpl(j);
        } else {
            iM30765getMinWidthimpl = kpd.coerceIn(Math.round(ku2.m30763getMaxWidthimpl(j) * this.f75771Y), ku2.m30765getMinWidthimpl(j), ku2.m30763getMaxWidthimpl(j));
            iM30763getMaxWidthimpl = iM30765getMinWidthimpl;
        }
        if (!ku2.m30758getHasBoundedHeightimpl(j) || this.f75770X == qd4.Horizontal) {
            int iM30764getMinHeightimpl = ku2.m30764getMinHeightimpl(j);
            iM30762getMaxHeightimpl = ku2.m30762getMaxHeightimpl(j);
            iCoerceIn = iM30764getMinHeightimpl;
        } else {
            iCoerceIn = kpd.coerceIn(Math.round(ku2.m30762getMaxHeightimpl(j) * this.f75771Y), ku2.m30764getMinHeightimpl(j), ku2.m30762getMaxHeightimpl(j));
            iM30762getMaxHeightimpl = iCoerceIn;
        }
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(nu2.Constraints(iM30765getMinWidthimpl, iM30763getMaxWidthimpl, iCoerceIn, iM30762getMaxHeightimpl));
        return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C11697a(abstractC0767tMo27949measureBRTryo0), 4, null);
    }

    public final void setDirection(@yfb qd4 qd4Var) {
        this.f75770X = qd4Var;
    }

    public final void setFraction(float f) {
        this.f75771Y = f;
    }
}
