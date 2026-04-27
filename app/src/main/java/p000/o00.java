package p000;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
@c5e(26)
public final class o00 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final o00 f66130a = new o00();

    private o00() {
    }

    public final void setPipParamsSourceRectHint(@yfb Activity activity, @yfb Rect rect) {
        activity.setPictureInPictureParams(new PictureInPictureParams.Builder().setSourceRectHint(rect).build());
    }
}
