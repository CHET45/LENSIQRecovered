package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: loaded from: classes5.dex */
@c5e(18)
public class g9i implements i9i {

    /* JADX INFO: renamed from: a */
    public final ViewGroupOverlay f39072a;

    public g9i(@efb ViewGroup viewGroup) {
        this.f39072a = viewGroup.getOverlay();
    }

    @Override // p000.wai
    public void add(@efb Drawable drawable) {
        this.f39072a.add(drawable);
    }

    @Override // p000.wai
    public void remove(@efb Drawable drawable) {
        this.f39072a.remove(drawable);
    }

    @Override // p000.i9i
    public void add(@efb View view) {
        this.f39072a.add(view);
    }

    @Override // p000.i9i
    public void remove(@efb View view) {
        this.f39072a.remove(view);
    }
}
