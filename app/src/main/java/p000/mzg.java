package p000;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mzg<T> extends iw7<T> {
    public mzg(ImageView imageView) {
        super(imageView);
    }

    @Override // p000.iw7
    /* JADX INFO: renamed from: c */
    public void mo10187c(@hib T t) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.f84184a).getLayoutParams();
        Drawable drawableMo13264d = mo13264d(t);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            drawableMo13264d = new h26(drawableMo13264d, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.f84184a).setImageDrawable(drawableMo13264d);
    }

    /* JADX INFO: renamed from: d */
    public abstract Drawable mo13264d(T t);

    @Deprecated
    public mzg(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
