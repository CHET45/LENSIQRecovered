package p000;

import android.view.View;
import androidx.compose.p002ui.platform.AbstractComposeView;

/* JADX INFO: loaded from: classes.dex */
public interface kbi {

    /* JADX INFO: renamed from: kbi$a */
    public static final class C8281a {
        @gib
        @Deprecated
        public static AbstractComposeView getSubCompositionView(@yfb kbi kbiVar) {
            return kbi.super.getSubCompositionView();
        }

        @gib
        @Deprecated
        public static View getViewRoot(@yfb kbi kbiVar) {
            return kbi.super.getViewRoot();
        }
    }

    @gib
    default AbstractComposeView getSubCompositionView() {
        return null;
    }

    @gib
    default View getViewRoot() {
        return null;
    }
}
