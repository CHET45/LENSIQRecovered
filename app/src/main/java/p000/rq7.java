package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
@igg({"ClassVerificationFailure"})
public final class rq7 {
    @c5e(26)
    @yfb
    public static final Icon toAdaptiveIcon(@yfb Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    @c5e(26)
    @yfb
    public static final Icon toIcon(@yfb Bitmap bitmap) {
        return Icon.createWithBitmap(bitmap);
    }

    @c5e(26)
    @yfb
    public static final Icon toIcon(@yfb Uri uri) {
        return Icon.createWithContentUri(uri);
    }

    @c5e(26)
    @yfb
    public static final Icon toIcon(@yfb byte[] bArr) {
        return Icon.createWithData(bArr, 0, bArr.length);
    }
}
