package p000;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class sq4 {
    private sq4() {
    }

    public static void applyIntrinsicBounds(@efb Drawable drawable) {
        drawable.setBounds(intrinsicBounds(drawable));
    }

    public static void applyIntrinsicBoundsIfEmpty(@efb Drawable drawable) {
        if (drawable.getBounds().isEmpty()) {
            drawable.setBounds(intrinsicBounds(drawable));
        }
    }

    @efb
    @yx1
    public static Rect intrinsicBounds(@efb Drawable drawable) {
        return new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }
}
