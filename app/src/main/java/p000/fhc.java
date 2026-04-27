package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyItemScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/ParentSizeNode\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,163:1\n26#2:164\n26#2:165\n*S KotlinDebug\n*F\n+ 1 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/ParentSizeNode\n*L\n138#1:164\n146#1:165\n*E\n"})
public final class fhc extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: X */
    public float f36598X;

    /* JADX INFO: renamed from: Y */
    @gib
    public i2g<Integer> f36599Y;

    /* JADX INFO: renamed from: Z */
    @gib
    public i2g<Integer> f36600Z;

    /* JADX INFO: renamed from: fhc$a */
    public static final class C5808a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f36601a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5808a(AbstractC0767t abstractC0767t) {
            super(1);
            this.f36601a = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.place$default(aVar, this.f36601a, 0, 0, 0.0f, 4, null);
        }
    }

    public /* synthetic */ fhc(float f, i2g i2gVar, i2g i2gVar2, int i, jt3 jt3Var) {
        this(f, (i & 2) != 0 ? null : i2gVar, (i & 4) != 0 ? null : i2gVar2);
    }

    public final float getFraction() {
        return this.f36598X;
    }

    @gib
    public final i2g<Integer> getHeightState() {
        return this.f36600Z;
    }

    @gib
    public final i2g<Integer> getWidthState() {
        return this.f36599Y;
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        i2g<Integer> i2gVar = this.f36599Y;
        int iRound = (i2gVar == null || i2gVar.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(i2gVar.getValue().floatValue() * this.f36598X);
        i2g<Integer> i2gVar2 = this.f36600Z;
        int iRound2 = (i2gVar2 == null || i2gVar2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(i2gVar2.getValue().floatValue() * this.f36598X);
        int iM30765getMinWidthimpl = iRound != Integer.MAX_VALUE ? iRound : ku2.m30765getMinWidthimpl(j);
        int iM30764getMinHeightimpl = iRound2 != Integer.MAX_VALUE ? iRound2 : ku2.m30764getMinHeightimpl(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = ku2.m30763getMaxWidthimpl(j);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = ku2.m30762getMaxHeightimpl(j);
        }
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(nu2.Constraints(iM30765getMinWidthimpl, iRound, iM30764getMinHeightimpl, iRound2));
        return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C5808a(abstractC0767tMo27949measureBRTryo0), 4, null);
    }

    public final void setFraction(float f) {
        this.f36598X = f;
    }

    public final void setHeightState(@gib i2g<Integer> i2gVar) {
        this.f36600Z = i2gVar;
    }

    public final void setWidthState(@gib i2g<Integer> i2gVar) {
        this.f36599Y = i2gVar;
    }

    public fhc(float f, @gib i2g<Integer> i2gVar, @gib i2g<Integer> i2gVar2) {
        this.f36598X = f;
        this.f36599Y = i2gVar;
        this.f36600Z = i2gVar2;
    }
}
