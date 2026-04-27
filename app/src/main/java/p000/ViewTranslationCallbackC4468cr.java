package p000;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.p002ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: cr */
/* JADX INFO: loaded from: classes.dex */
@c5e(31)
public final class ViewTranslationCallbackC4468cr implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final ViewTranslationCallbackC4468cr f27117a = new ViewTranslationCallbackC4468cr();

    private ViewTranslationCallbackC4468cr() {
    }

    public boolean onClearTranslation(@yfb View view) {
        md8.checkNotNull(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().onClearTranslation$ui_release();
        return true;
    }

    public boolean onHideTranslation(@yfb View view) {
        md8.checkNotNull(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().onHideTranslation$ui_release();
        return true;
    }

    public boolean onShowTranslation(@yfb View view) {
        md8.checkNotNull(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().onShowTranslation$ui_release();
        return true;
    }
}
