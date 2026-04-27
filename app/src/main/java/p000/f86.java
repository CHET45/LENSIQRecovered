package p000;

import androidx.compose.foundation.layout.C0640p;
import androidx.compose.p002ui.InterfaceC0701e;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class f86 implements g86, e86 {

    /* JADX INFO: renamed from: c */
    public static final int f35675c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C0640p f35676a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h86 f35677b = h86.f42900b;

    public f86(@yfb C0640p c0640p) {
        this.f35676a = c0640p;
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e align(@yfb InterfaceC0701e interfaceC0701e, @yfb InterfaceC9407mm.c cVar) {
        return this.f35677b.align(interfaceC0701e, cVar);
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super aca, Integer> qy6Var) {
        return this.f35677b.alignBy(interfaceC0701e, qy6Var);
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e alignByBaseline(@yfb InterfaceC0701e interfaceC0701e) {
        return this.f35677b.alignByBaseline(interfaceC0701e);
    }

    @Override // p000.g86
    @hh5
    @yfb
    public InterfaceC0701e fillMaxRowHeight(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        return this.f35677b.fillMaxRowHeight(interfaceC0701e, f);
    }

    @Override // p000.e86
    public int getShownItemCount() {
        return this.f35676a.getNoOfItemsShown$foundation_layout_release();
    }

    @Override // p000.e86
    public int getTotalItemCount() {
        return this.f35676a.getItemCount$foundation_layout_release();
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e weight(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, fromInclusive = false) float f, boolean z) {
        return this.f35677b.weight(interfaceC0701e, f, z);
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb kl7 kl7Var) {
        return this.f35677b.alignBy(interfaceC0701e, kl7Var);
    }
}
