package p000;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class cy8 implements by8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final cy8 f28053a = new cy8();

    /* JADX INFO: renamed from: b */
    public static final int f28054b = 0;

    private cy8() {
    }

    @Override // p000.by8
    @yfb
    public InterfaceC0701e animateItem(@yfb InterfaceC0701e interfaceC0701e, @gib fw5<Float> fw5Var, @gib fw5<a78> fw5Var2, @gib fw5<Float> fw5Var3) {
        return (fw5Var == null && fw5Var2 == null && fw5Var3 == null) ? interfaceC0701e : interfaceC0701e.then(new LazyLayoutAnimateItemElement(fw5Var, fw5Var2, fw5Var3));
    }
}
