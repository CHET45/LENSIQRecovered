package p000;

import androidx.compose.foundation.layout.C0640p;
import androidx.compose.p002ui.InterfaceC0701e;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class v66 implements w66, u66 {

    /* JADX INFO: renamed from: c */
    public static final int f90059c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C0640p f90060a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x66 f90061b = x66.f96862b;

    public v66(@yfb C0640p c0640p) {
        this.f90060a = c0640p;
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e align(@yfb InterfaceC0701e interfaceC0701e, @yfb InterfaceC9407mm.b bVar) {
        return this.f90061b.align(interfaceC0701e, bVar);
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super aca, Integer> qy6Var) {
        return this.f90061b.alignBy(interfaceC0701e, qy6Var);
    }

    @Override // p000.w66
    @hh5
    @yfb
    public InterfaceC0701e fillMaxColumnWidth(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        return this.f90061b.fillMaxColumnWidth(interfaceC0701e, f);
    }

    @Override // p000.u66
    public int getShownItemCount() {
        return this.f90060a.getNoOfItemsShown$foundation_layout_release();
    }

    @Override // p000.u66
    public int getTotalItemCount() {
        return this.f90060a.getItemCount$foundation_layout_release();
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e weight(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, fromInclusive = false) float f, boolean z) {
        return this.f90061b.weight(interfaceC0701e, f, z);
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb f5i f5iVar) {
        return this.f90061b.alignBy(interfaceC0701e, f5iVar);
    }
}
