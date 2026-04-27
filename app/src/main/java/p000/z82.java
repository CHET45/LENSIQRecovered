package p000;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class z82 {
    @yfb
    public static final ColorDrawable toDrawable(@g92 int i) {
        return new ColorDrawable(i);
    }

    @c5e(26)
    @yfb
    @igg({"ClassVerificationFailure"})
    public static final ColorDrawable toDrawable(@yfb Color color) {
        return new ColorDrawable(color.toArgb());
    }
}
