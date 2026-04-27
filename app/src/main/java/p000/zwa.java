package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public interface zwa<T> {
    @efb
    @yx1
    T load(@hib Bitmap bitmap);

    @efb
    @yx1
    T load(@hib Drawable drawable);

    @efb
    @yx1
    T load(@hib Uri uri);

    @efb
    @yx1
    T load(@hib File file);

    @efb
    @yx1
    T load(@hib @gq4 @wpd Integer num);

    @efb
    @yx1
    T load(@hib Object obj);

    @efb
    @yx1
    T load(@hib String str);

    @yx1
    @Deprecated
    T load(@hib URL url);

    @efb
    @yx1
    T load(@hib byte[] bArr);
}
