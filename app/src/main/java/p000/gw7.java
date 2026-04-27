package p000;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@x21({@w21(attribute = "android:tint", method = "setImageTintList", type = ImageView.class), @w21(attribute = "android:tintMode", method = "setImageTintMode", type = ImageView.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class gw7 {
    @q21({"android:src"})
    public static void setImageDrawable(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
    }

    @q21({"android:src"})
    public static void setImageUri(ImageView imageView, String str) {
        if (str == null) {
            imageView.setImageURI(null);
        } else {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    @q21({"android:src"})
    public static void setImageUri(ImageView imageView, Uri uri) {
        imageView.setImageURI(uri);
    }
}
