package p000;

import android.graphics.drawable.Drawable;
import p000.aq4;

/* JADX INFO: loaded from: classes3.dex */
public final class lq4 extends kfh<lq4, Drawable> {
    @efb
    public static lq4 with(@efb efh<Drawable> efhVar) {
        return new lq4().transition(efhVar);
    }

    @efb
    public static lq4 withCrossFade() {
        return new lq4().crossFade();
    }

    @efb
    public lq4 crossFade() {
        return crossFade(new aq4.C1557a());
    }

    @efb
    public static lq4 withCrossFade(int i) {
        return new lq4().crossFade(i);
    }

    @efb
    public lq4 crossFade(int i) {
        return crossFade(new aq4.C1557a(i));
    }

    @efb
    public static lq4 withCrossFade(@efb aq4 aq4Var) {
        return new lq4().crossFade(aq4Var);
    }

    @efb
    public lq4 crossFade(@efb aq4 aq4Var) {
        return transition(aq4Var);
    }

    @efb
    public static lq4 withCrossFade(@efb aq4.C1557a c1557a) {
        return new lq4().crossFade(c1557a);
    }

    @efb
    public lq4 crossFade(@efb aq4.C1557a c1557a) {
        return crossFade(c1557a.build());
    }
}
