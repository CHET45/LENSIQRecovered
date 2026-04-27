package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k05 implements uba {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final k05 f52319a = new k05();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final qy6<AbstractC0767t.a, bth> f52320b = C8153a.f52321a;

    /* JADX INFO: renamed from: k05$a */
    public static final class C8153a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public static final C8153a f52321a = new C8153a();

        public C8153a() {
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

    private k05() {
    }

    @Override // p000.uba
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
        return InterfaceC0761n.layout$default(interfaceC0761n, ku2.m30763getMaxWidthimpl(j), ku2.m30762getMaxHeightimpl(j), null, f52320b, 4, null);
    }
}
