package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public class jw7 {
    @efb
    public <Z> tbi<ImageView, Z> buildTarget(@efb ImageView imageView, @efb Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new x31(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new eq4(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
