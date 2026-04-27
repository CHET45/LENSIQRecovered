package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: loaded from: classes3.dex */
@c5e(18)
public class vai implements xai {

    /* JADX INFO: renamed from: a */
    public final ViewOverlay f90528a;

    public vai(@efb View view) {
        this.f90528a = view.getOverlay();
    }

    @Override // p000.xai
    public void add(@efb Drawable drawable) {
        this.f90528a.add(drawable);
    }

    @Override // p000.xai
    public void remove(@efb Drawable drawable) {
        this.f90528a.remove(drawable);
    }
}
