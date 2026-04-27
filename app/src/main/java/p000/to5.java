package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public final class to5 implements cdi {

    /* JADX INFO: renamed from: a */
    public float f85444a = 1.0f;

    /* JADX INFO: renamed from: to5$a */
    public class C13123a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f85445a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f85446b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f85447c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f85448d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f85449e;

        public C13123a(View view, float f, float f2, float f3, float f4) {
            this.f85445a = view;
            this.f85446b = f;
            this.f85447c = f2;
            this.f85448d = f3;
            this.f85449e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f85445a.setAlpha(rfh.m21275l(this.f85446b, this.f85447c, this.f85448d, this.f85449e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: renamed from: to5$b */
    public class C13124b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f85450a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f85451b;

        public C13124b(View view, float f) {
            this.f85450a = view;
            this.f85451b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f85450a.setAlpha(this.f85451b);
        }
    }

    private static Animator createFadeAnimator(View view, float f, float f2, @y46(from = 0.0d, m25645to = 1.0d) float f3, @y46(from = 0.0d, m25645to = 1.0d) float f4, float f5) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C13123a(view, f, f2, f3, f4));
        valueAnimatorOfFloat.addListener(new C13124b(view, f5));
        return valueAnimatorOfFloat;
    }

    @Override // p000.cdi
    @hib
    public Animator createAppear(@efb ViewGroup viewGroup, @efb View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeAnimator(view, 0.0f, alpha, 0.0f, this.f85444a, alpha);
    }

    @Override // p000.cdi
    @hib
    public Animator createDisappear(@efb ViewGroup viewGroup, @efb View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeAnimator(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    public float getIncomingEndThreshold() {
        return this.f85444a;
    }

    public void setIncomingEndThreshold(float f) {
        this.f85444a = f;
    }
}
