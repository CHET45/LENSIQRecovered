package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.graphics.InterfaceC0736c;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/BlockGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,672:1\n76#2:673\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/BlockGraphicsLayerModifier\n*L\n568#1:673\n*E\n"})
@e0g(parameters = 0)
public final class f61 extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: Y */
    public static final int f35393Y = 8;

    /* JADX INFO: renamed from: X */
    @yfb
    public qy6<? super InterfaceC0736c, bth> f35394X;

    /* JADX INFO: renamed from: f61$a */
    public static final class C5604a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f35395a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ f61 f35396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5604a(AbstractC0767t abstractC0767t, f61 f61Var) {
            super(1);
            this.f35395a = abstractC0767t;
            this.f35396b = f61Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.placeWithLayer$default(aVar, this.f35395a, 0, 0, 0.0f, this.f35396b.getLayerBlock(), 4, (Object) null);
        }
    }

    public f61(@yfb qy6<? super InterfaceC0736c, bth> qy6Var) {
        this.f35394X = qy6Var;
    }

    @yfb
    public final qy6<InterfaceC0736c, bth> getLayerBlock() {
        return this.f35394X;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void invalidateLayerBlock() {
        heb wrapped$ui_release = w34.m32852requireCoordinator64DMado(this, keb.m30687constructorimpl(2)).getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            wrapped$ui_release.updateLayerBlock(this.f35394X, true);
        }
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(j);
        return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C5604a(abstractC0767tMo27949measureBRTryo0, this), 4, null);
    }

    public final void setLayerBlock(@yfb qy6<? super InterfaceC0736c, bth> qy6Var) {
        this.f35394X = qy6Var;
    }

    @yfb
    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f35394X + ')';
    }
}
