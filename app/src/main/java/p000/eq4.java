package p000;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public class eq4 extends iw7<Drawable> {
    public eq4(ImageView imageView) {
        super(imageView);
    }

    @Override // p000.iw7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo10187c(@hib Drawable drawable) {
        ((ImageView) this.f84184a).setImageDrawable(drawable);
    }

    @Deprecated
    public eq4(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
