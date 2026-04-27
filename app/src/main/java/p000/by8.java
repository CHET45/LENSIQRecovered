package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@f0g
@ry8
public interface by8 {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ InterfaceC0701e animateItem$default(by8 by8Var, InterfaceC0701e interfaceC0701e, fw5 fw5Var, fw5 fw5Var2, fw5 fw5Var3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItem");
        }
        if ((i & 1) != 0) {
            fw5Var = C11760qy.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            fw5Var2 = C11760qy.spring$default(0.0f, 400.0f, a78.m27192boximpl(edi.getVisibilityThreshold(a78.f545b)), 1, null);
        }
        if ((i & 4) != 0) {
            fw5Var3 = C11760qy.spring$default(0.0f, 400.0f, null, 5, null);
        }
        return by8Var.animateItem(interfaceC0701e, fw5Var, fw5Var2, fw5Var3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ InterfaceC0701e animateItemPlacement$default(by8 by8Var, InterfaceC0701e interfaceC0701e, fw5 fw5Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if ((i & 1) != 0) {
            fw5Var = C11760qy.spring$default(0.0f, 400.0f, a78.m27192boximpl(edi.getVisibilityThreshold(a78.f545b)), 1, null);
        }
        return by8Var.animateItemPlacement(interfaceC0701e, fw5Var);
    }

    @yfb
    InterfaceC0701e animateItem(@yfb InterfaceC0701e interfaceC0701e, @gib fw5<Float> fw5Var, @gib fw5<a78> fw5Var2, @gib fw5<Float> fw5Var3);

    @ah5
    @yfb
    @q64(message = "Use Modifier.animateItem() instead", replaceWith = @i2e(expression = "Modifier.animateItem(fadeInSpec = null, fadeOutSpec = null, placementSpec = animationSpec)", imports = {}))
    default InterfaceC0701e animateItemPlacement(@yfb InterfaceC0701e interfaceC0701e, @yfb fw5<a78> fw5Var) {
        return animateItem(interfaceC0701e, null, fw5Var, null);
    }
}
