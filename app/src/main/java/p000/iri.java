package p000;

import android.view.ViewParent;
import androidx.compose.p002ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
@c5e(26)
@e0g(parameters = 1)
public final class iri {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final iri f48111a = new iri();

    /* JADX INFO: renamed from: b */
    public static final int f48112b = 0;

    private iri() {
    }

    @ih4
    public final void onDescendantInvalidated(@yfb AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
