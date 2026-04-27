package p000;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import p000.afh;

/* JADX INFO: loaded from: classes4.dex */
public class bq4 implements afh<Drawable> {

    /* JADX INFO: renamed from: a */
    public final int f14476a;

    /* JADX INFO: renamed from: b */
    public final boolean f14477b;

    public bq4(int i, boolean z) {
        this.f14476a = i;
        this.f14477b = z;
    }

    @Override // p000.afh
    public boolean transition(Drawable drawable, afh.InterfaceC0213a interfaceC0213a) {
        Drawable currentDrawable = interfaceC0213a.getCurrentDrawable();
        if (currentDrawable == null) {
            currentDrawable = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{currentDrawable, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f14477b);
        transitionDrawable.startTransition(this.f14476a);
        interfaceC0213a.setDrawable(transitionDrawable);
        return true;
    }
}
