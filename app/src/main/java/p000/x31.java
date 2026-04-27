package p000;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public class x31 extends iw7<Bitmap> {
    public x31(ImageView imageView) {
        super(imageView);
    }

    @Override // p000.iw7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo10187c(Bitmap bitmap) {
        ((ImageView) this.f84184a).setImageBitmap(bitmap);
    }

    @Deprecated
    public x31(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
