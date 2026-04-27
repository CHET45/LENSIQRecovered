package p000;

import androidx.compose.animation.AbstractC0574g;
import androidx.compose.animation.AbstractC0575h;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: renamed from: rx */
/* JADX INFO: loaded from: classes.dex */
public final class C12357rx implements InterfaceC11754qx, InterfaceC14819wx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC14819wx f80049a;

    public C12357rx(@yfb InterfaceC14819wx interfaceC14819wx) {
        this.f80049a = interfaceC14819wx;
    }

    @Override // p000.InterfaceC14819wx
    @yfb
    public InterfaceC0701e animateEnterExit(@yfb InterfaceC0701e interfaceC0701e, @yfb AbstractC0574g abstractC0574g, @yfb AbstractC0575h abstractC0575h, @yfb String str) {
        return this.f80049a.animateEnterExit(interfaceC0701e, abstractC0574g, abstractC0575h, str);
    }

    @Override // p000.InterfaceC14819wx
    @yfb
    public yeh<d35> getTransition() {
        return this.f80049a.getTransition();
    }
}
