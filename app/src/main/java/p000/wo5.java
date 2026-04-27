package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public final class wo5 implements bdi {

    /* JADX INFO: renamed from: b */
    public static final float f94908b = 0.35f;

    /* JADX INFO: renamed from: a */
    public float f94909a = 0.35f;

    /* JADX INFO: renamed from: wo5$a */
    public class C14718a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f94910a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f94911b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f94912c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f94913d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f94914e;

        public C14718a(View view, float f, float f2, float f3, float f4) {
            this.f94910a = view;
            this.f94911b = f;
            this.f94912c = f2;
            this.f94913d = f3;
            this.f94914e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f94910a.setAlpha(qfh.m20341l(this.f94911b, this.f94912c, this.f94913d, this.f94914e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: renamed from: wo5$b */
    public class C14719b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f94915a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f94916b;

        public C14719b(View view, float f) {
            this.f94915a = view;
            this.f94916b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f94915a.setAlpha(this.f94916b);
        }
    }

    private static Animator createFadeThroughAnimator(View view, float f, float f2, @y46(from = 0.0d, m25645to = 1.0d) float f3, @y46(from = 0.0d, m25645to = 1.0d) float f4, float f5) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C14718a(view, f, f2, f3, f4));
        valueAnimatorOfFloat.addListener(new C14719b(view, f5));
        return valueAnimatorOfFloat;
    }

    @Override // p000.bdi
    @hib
    public Animator createAppear(@efb ViewGroup viewGroup, @efb View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeThroughAnimator(view, 0.0f, alpha, this.f94909a, 1.0f, alpha);
    }

    @Override // p000.bdi
    @hib
    public Animator createDisappear(@efb ViewGroup viewGroup, @efb View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeThroughAnimator(view, alpha, 0.0f, 0.0f, this.f94909a, alpha);
    }

    public float getProgressThreshold() {
        return this.f94909a;
    }

    public void setProgressThreshold(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        this.f94909a = f;
    }
}
