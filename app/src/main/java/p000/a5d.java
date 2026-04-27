package p000;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: loaded from: classes.dex */
public final class a5d {
    @yfb
    public static final PorterDuffColorFilter toColorFilter(@yfb PorterDuff.Mode mode, int i) {
        return new PorterDuffColorFilter(i, mode);
    }

    @yfb
    public static final PorterDuffXfermode toXfermode(@yfb PorterDuff.Mode mode) {
        return new PorterDuffXfermode(mode);
    }
}
