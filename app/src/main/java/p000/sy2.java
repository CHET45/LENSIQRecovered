package p000;

import androidx.compose.foundation.layout.C0640p;
import androidx.compose.p002ui.InterfaceC0701e;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@hh5
@e0g(parameters = 1)
public final class sy2 implements e86, ry2 {

    /* JADX INFO: renamed from: c */
    public static final int f83212c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C0640p f83213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f86 f83214b;

    public sy2(@yfb C0640p c0640p) {
        this.f83213a = c0640p;
        this.f83214b = new f86(c0640p);
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e align(@yfb InterfaceC0701e interfaceC0701e, @yfb InterfaceC9407mm.c cVar) {
        return this.f83214b.align(interfaceC0701e, cVar);
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super aca, Integer> qy6Var) {
        return this.f83214b.alignBy(interfaceC0701e, qy6Var);
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e alignByBaseline(@yfb InterfaceC0701e interfaceC0701e) {
        return this.f83214b.alignByBaseline(interfaceC0701e);
    }

    @Override // p000.g86
    @hh5
    @yfb
    public InterfaceC0701e fillMaxRowHeight(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        return this.f83214b.fillMaxRowHeight(interfaceC0701e, f);
    }

    @Override // p000.e86
    public int getShownItemCount() {
        return this.f83214b.getShownItemCount();
    }

    @Override // p000.e86
    public int getTotalItemCount() {
        return this.f83214b.getTotalItemCount();
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e weight(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, fromInclusive = false) float f, boolean z) {
        return this.f83214b.weight(interfaceC0701e, f, z);
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb kl7 kl7Var) {
        return this.f83214b.alignBy(interfaceC0701e, kl7Var);
    }
}
