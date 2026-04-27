package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: loaded from: classes5.dex */
@c5e(18)
public class uai implements wai {

    /* JADX INFO: renamed from: a */
    public final ViewOverlay f87338a;

    public uai(@efb View view) {
        this.f87338a = view.getOverlay();
    }

    @Override // p000.wai
    public void add(@efb Drawable drawable) {
        this.f87338a.add(drawable);
    }

    @Override // p000.wai
    public void remove(@efb Drawable drawable) {
        this.f87338a.remove(drawable);
    }
}
