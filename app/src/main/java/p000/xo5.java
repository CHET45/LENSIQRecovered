package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public final class xo5 implements cdi {

    /* JADX INFO: renamed from: b */
    public static final float f98780b = 0.35f;

    /* JADX INFO: renamed from: a */
    public float f98781a = 0.35f;

    /* JADX INFO: renamed from: xo5$a */
    public class C15225a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f98782a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f98783b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f98784c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f98785d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f98786e;

        public C15225a(View view, float f, float f2, float f3, float f4) {
            this.f98782a = view;
            this.f98783b = f;
            this.f98784c = f2;
            this.f98785d = f3;
            this.f98786e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f98782a.setAlpha(rfh.m21275l(this.f98783b, this.f98784c, this.f98785d, this.f98786e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: renamed from: xo5$b */
    public class C15226b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f98787a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f98788b;

        public C15226b(View view, float f) {
            this.f98787a = view;
            this.f98788b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f98787a.setAlpha(this.f98788b);
        }
    }

    private static Animator createFadeThroughAnimator(View view, float f, float f2, @y46(from = 0.0d, m25645to = 1.0d) float f3, @y46(from = 0.0d, m25645to = 1.0d) float f4, float f5) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C15225a(view, f, f2, f3, f4));
        valueAnimatorOfFloat.addListener(new C15226b(view, f5));
        return valueAnimatorOfFloat;
    }

    @Override // p000.cdi
    @hib
    public Animator createAppear(@efb ViewGroup viewGroup, @efb View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeThroughAnimator(view, 0.0f, alpha, this.f98781a, 1.0f, alpha);
    }

    @Override // p000.cdi
    @hib
    public Animator createDisappear(@efb ViewGroup viewGroup, @efb View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeThroughAnimator(view, alpha, 0.0f, 0.0f, this.f98781a, alpha);
    }

    public float getProgressThreshold() {
        return this.f98781a;
    }

    public void setProgressThreshold(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        this.f98781a = f;
    }
}
