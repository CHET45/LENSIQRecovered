package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public class j41 extends mzg<Bitmap> {
    public j41(ImageView imageView) {
        super(imageView);
    }

    @Override // p000.mzg
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Drawable mo13264d(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.f84184a).getResources(), bitmap);
    }

    @Deprecated
    public j41(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
