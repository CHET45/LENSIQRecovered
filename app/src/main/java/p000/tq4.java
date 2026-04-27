package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public abstract class tq4 {
    private tq4() {
    }

    public static void intrinsicBounds(@efb Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }
}
