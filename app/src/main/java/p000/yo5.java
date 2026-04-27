package p000;

import android.animation.ValueAnimator;
import android.view.View;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class yo5 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    @hib
    public final View f102389a;

    /* JADX INFO: renamed from: b */
    @hib
    public final View f102390b;

    /* JADX INFO: renamed from: c */
    public final float[] f102391c = new float[2];

    public yo5(@hib View view, @hib View view2) {
        this.f102389a = view;
        this.f102390b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@efb ValueAnimator valueAnimator) {
        zo5.m26915a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f102391c);
        View view = this.f102389a;
        if (view != null) {
            view.setAlpha(this.f102391c[0]);
        }
        View view2 = this.f102390b;
        if (view2 != null) {
            view2.setAlpha(this.f102391c[1]);
        }
    }
}
