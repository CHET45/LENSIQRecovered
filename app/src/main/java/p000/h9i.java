package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: loaded from: classes3.dex */
@c5e(18)
public class h9i implements j9i {

    /* JADX INFO: renamed from: a */
    public final ViewGroupOverlay f42963a;

    public h9i(@efb ViewGroup viewGroup) {
        this.f42963a = viewGroup.getOverlay();
    }

    @Override // p000.xai
    public void add(@efb Drawable drawable) {
        this.f42963a.add(drawable);
    }

    @Override // p000.xai
    public void remove(@efb Drawable drawable) {
        this.f42963a.remove(drawable);
    }

    @Override // p000.j9i
    public void add(@efb View view) {
        this.f42963a.add(view);
    }

    @Override // p000.j9i
    public void remove(@efb View view) {
        this.f42963a.remove(view);
    }
}
