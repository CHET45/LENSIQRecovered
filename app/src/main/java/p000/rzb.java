package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
public final class rzb extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: X */
    @yfb
    public qy6<? super c64, a78> f80204X;

    /* JADX INFO: renamed from: Y */
    public boolean f80205Y;

    /* JADX INFO: renamed from: rzb$a */
    public static final class C12376a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0761n f80207b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC0767t f80208c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12376a(InterfaceC0761n interfaceC0761n, AbstractC0767t abstractC0767t) {
            super(1);
            this.f80207b = interfaceC0761n;
            this.f80208c = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            long jM27210unboximpl = rzb.this.getOffset().invoke(this.f80207b).m27210unboximpl();
            if (rzb.this.getRtlAware()) {
                AbstractC0767t.a.placeRelativeWithLayer$default(aVar, this.f80208c, a78.m27201getXimpl(jM27210unboximpl), a78.m27202getYimpl(jM27210unboximpl), 0.0f, (qy6) null, 12, (Object) null);
            } else {
                AbstractC0767t.a.placeWithLayer$default(aVar, this.f80208c, a78.m27201getXimpl(jM27210unboximpl), a78.m27202getYimpl(jM27210unboximpl), 0.0f, (qy6) null, 12, (Object) null);
            }
        }
    }

    public rzb(@yfb qy6<? super c64, a78> qy6Var, boolean z) {
        this.f80204X = qy6Var;
        this.f80205Y = z;
    }

    @yfb
    public final qy6<c64, a78> getOffset() {
        return this.f80204X;
    }

    public final boolean getRtlAware() {
        return this.f80205Y;
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(j);
        return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C12376a(interfaceC0761n, abstractC0767tMo27949measureBRTryo0), 4, null);
    }

    public final void setOffset(@yfb qy6<? super c64, a78> qy6Var) {
        this.f80204X = qy6Var;
    }

    public final void setRtlAware(boolean z) {
        this.f80205Y = z;
    }
}
