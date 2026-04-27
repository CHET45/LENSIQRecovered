package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pwf implements uba {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final pwf f72385a = new pwf();

    /* JADX INFO: renamed from: pwf$a */
    public static final class C11160a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public static final C11160a f72386a = new C11160a();

        public C11160a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
        }
    }

    private pwf() {
    }

    @Override // p000.uba
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
        return InterfaceC0761n.layout$default(interfaceC0761n, ku2.m30761getHasFixedWidthimpl(j) ? ku2.m30763getMaxWidthimpl(j) : 0, ku2.m30760getHasFixedHeightimpl(j) ? ku2.m30762getMaxHeightimpl(j) : 0, null, C11160a.f72386a, 4, null);
    }
}
