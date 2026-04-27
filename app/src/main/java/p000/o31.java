package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class o31 {
    @yfb
    public static final BitmapDrawable toDrawable(@yfb Bitmap bitmap, @yfb Resources resources) {
        return new BitmapDrawable(resources, bitmap);
    }
}
