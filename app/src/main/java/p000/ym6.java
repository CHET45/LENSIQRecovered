package p000;

import androidx.compose.p002ui.focus.InterfaceC0720i;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class ym6 implements dn6 {

    /* JADX INFO: renamed from: b */
    public static final int f102060b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<vm6, bth> f102061a;

    /* JADX WARN: Multi-variable type inference failed */
    public ym6(@yfb qy6<? super vm6, bth> qy6Var) {
        this.f102061a = qy6Var;
    }

    @Override // p000.dn6
    public void apply(@yfb InterfaceC0720i interfaceC0720i) {
        this.f102061a.invoke(new vm6(interfaceC0720i));
    }

    @yfb
    public final qy6<vm6, bth> getFocusOrderReceiver() {
        return this.f102061a;
    }
}
