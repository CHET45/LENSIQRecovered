package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: ct */
/* JADX INFO: loaded from: classes.dex */
public final class C4488ct {
    @yfb
    public static final s97 GraphicsContext(@yfb ViewGroup viewGroup) {
        return new C1600at(viewGroup);
    }

    public static final boolean isLayerManagerInitialized(@yfb s97 s97Var) {
        md8.checkNotNull(s97Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidGraphicsContext");
        return ((C1600at) s97Var).isLayerManagerInitialized();
    }

    public static final boolean isLayerPersistenceEnabled() {
        return false;
    }
}
