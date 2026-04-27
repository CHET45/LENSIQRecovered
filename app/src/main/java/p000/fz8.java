package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@f0g
@r19
public interface fz8 {

    /* JADX INFO: renamed from: fz8$a */
    public static final class C6038a {
        @yfb
        @Deprecated
        public static InterfaceC0701e animateItem(@yfb fz8 fz8Var, @yfb InterfaceC0701e interfaceC0701e, @gib fw5<Float> fw5Var, @gib fw5<a78> fw5Var2, @gib fw5<Float> fw5Var3) {
            return fz8.super.animateItem(interfaceC0701e, fw5Var, fw5Var2, fw5Var3);
        }

        @Deprecated
        @q64(message = "Use Modifier.animateItem() instead", replaceWith = @i2e(expression = "Modifier.animateItem(fadeInSpec = null, fadeOutSpec = null, placementSpec = animationSpec)", imports = {}))
        @ah5
        @yfb
        public static InterfaceC0701e animateItemPlacement(@yfb fz8 fz8Var, @yfb InterfaceC0701e interfaceC0701e, @yfb fw5<a78> fw5Var) {
            return fz8.super.animateItemPlacement(interfaceC0701e, fw5Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ InterfaceC0701e animateItem$default(fz8 fz8Var, InterfaceC0701e interfaceC0701e, fw5 fw5Var, fw5 fw5Var2, fw5 fw5Var3, int i, Object obj) {
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
        return fz8Var.animateItem(interfaceC0701e, fw5Var, fw5Var2, fw5Var3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ InterfaceC0701e animateItemPlacement$default(fz8 fz8Var, InterfaceC0701e interfaceC0701e, fw5 fw5Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if ((i & 1) != 0) {
            fw5Var = C11760qy.spring$default(0.0f, 400.0f, a78.m27192boximpl(edi.getVisibilityThreshold(a78.f545b)), 1, null);
        }
        return fz8Var.animateItemPlacement(interfaceC0701e, fw5Var);
    }

    static /* synthetic */ InterfaceC0701e fillParentMaxHeight$default(fz8 fz8Var, InterfaceC0701e interfaceC0701e, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fz8Var.fillParentMaxHeight(interfaceC0701e, f);
    }

    static /* synthetic */ InterfaceC0701e fillParentMaxSize$default(fz8 fz8Var, InterfaceC0701e interfaceC0701e, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fz8Var.fillParentMaxSize(interfaceC0701e, f);
    }

    static /* synthetic */ InterfaceC0701e fillParentMaxWidth$default(fz8 fz8Var, InterfaceC0701e interfaceC0701e, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fz8Var.fillParentMaxWidth(interfaceC0701e, f);
    }

    @yfb
    default InterfaceC0701e animateItem(@yfb InterfaceC0701e interfaceC0701e, @gib fw5<Float> fw5Var, @gib fw5<a78> fw5Var2, @gib fw5<Float> fw5Var3) {
        return interfaceC0701e;
    }

    @ah5
    @yfb
    @q64(message = "Use Modifier.animateItem() instead", replaceWith = @i2e(expression = "Modifier.animateItem(fadeInSpec = null, fadeOutSpec = null, placementSpec = animationSpec)", imports = {}))
    default InterfaceC0701e animateItemPlacement(@yfb InterfaceC0701e interfaceC0701e, @yfb fw5<a78> fw5Var) {
        return animateItem(interfaceC0701e, null, fw5Var, null);
    }

    @yfb
    InterfaceC0701e fillParentMaxHeight(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, m25645to = 1.0d) float f);

    @yfb
    InterfaceC0701e fillParentMaxSize(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, m25645to = 1.0d) float f);

    @yfb
    InterfaceC0701e fillParentMaxWidth(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, m25645to = 1.0d) float f);
}
