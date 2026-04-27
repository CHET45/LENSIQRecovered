package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import p000.aq4;

/* JADX INFO: loaded from: classes3.dex */
public final class n41 extends kfh<n41, Bitmap> {
    @efb
    public static n41 with(@efb efh<Bitmap> efhVar) {
        return new n41().transition(efhVar);
    }

    @efb
    public static n41 withCrossFade() {
        return new n41().crossFade();
    }

    @efb
    public static n41 withWrapped(@efb efh<Drawable> efhVar) {
        return new n41().transitionUsing(efhVar);
    }

    @efb
    public n41 crossFade() {
        return crossFade(new aq4.C1557a());
    }

    @efb
    public n41 transitionUsing(@efb efh<Drawable> efhVar) {
        return transition(new m41(efhVar));
    }

    @efb
    public static n41 withCrossFade(int i) {
        return new n41().crossFade(i);
    }

    @efb
    public n41 crossFade(int i) {
        return crossFade(new aq4.C1557a(i));
    }

    @efb
    public static n41 withCrossFade(@efb aq4 aq4Var) {
        return new n41().crossFade(aq4Var);
    }

    @efb
    public n41 crossFade(@efb aq4 aq4Var) {
        return transitionUsing(aq4Var);
    }

    @efb
    public static n41 withCrossFade(@efb aq4.C1557a c1557a) {
        return new n41().crossFade(c1557a);
    }

    @efb
    public n41 crossFade(@efb aq4.C1557a c1557a) {
        return transitionUsing(c1557a.build());
    }
}
