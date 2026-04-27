package p000;

import androidx.compose.foundation.layout.C0640p;
import androidx.compose.p002ui.InterfaceC0701e;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@hh5
@e0g(parameters = 1)
public final class ny2 implements u66, my2 {

    /* JADX INFO: renamed from: c */
    public static final int f65998c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C0640p f65999a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v66 f66000b;

    public ny2(@yfb C0640p c0640p) {
        this.f65999a = c0640p;
        this.f66000b = new v66(c0640p);
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e align(@yfb InterfaceC0701e interfaceC0701e, @yfb InterfaceC9407mm.b bVar) {
        return this.f66000b.align(interfaceC0701e, bVar);
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super aca, Integer> qy6Var) {
        return this.f66000b.alignBy(interfaceC0701e, qy6Var);
    }

    @Override // p000.w66
    @hh5
    @yfb
    public InterfaceC0701e fillMaxColumnWidth(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        return this.f66000b.fillMaxColumnWidth(interfaceC0701e, f);
    }

    @Override // p000.u66
    public int getShownItemCount() {
        return this.f66000b.getShownItemCount();
    }

    @Override // p000.u66
    public int getTotalItemCount() {
        return this.f66000b.getTotalItemCount();
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e weight(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, fromInclusive = false) float f, boolean z) {
        return this.f66000b.weight(interfaceC0701e, f, z);
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb f5i f5iVar) {
        return this.f66000b.alignBy(interfaceC0701e, f5iVar);
    }
}
