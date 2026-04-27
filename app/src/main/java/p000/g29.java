package p000;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class g29 implements f29 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final g29 f38296a = new g29();

    /* JADX INFO: renamed from: b */
    public static final int f38297b = 0;

    private g29() {
    }

    @Override // p000.f29
    @yfb
    public InterfaceC0701e animateItem(@yfb InterfaceC0701e interfaceC0701e, @gib fw5<Float> fw5Var, @gib fw5<a78> fw5Var2, @gib fw5<Float> fw5Var3) {
        return (fw5Var == null && fw5Var2 == null && fw5Var3 == null) ? interfaceC0701e : interfaceC0701e.then(new LazyLayoutAnimateItemElement(fw5Var, fw5Var2, fw5Var3));
    }
}
