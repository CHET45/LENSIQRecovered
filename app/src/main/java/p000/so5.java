package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public final class so5 implements bdi {

    /* JADX INFO: renamed from: a */
    public float f82438a = 1.0f;

    /* JADX INFO: renamed from: so5$a */
    public class C12712a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f82439a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f82440b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f82441c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f82442d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f82443e;

        public C12712a(View view, float f, float f2, float f3, float f4) {
            this.f82439a = view;
            this.f82440b = f;
            this.f82441c = f2;
            this.f82442d = f3;
            this.f82443e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f82439a.setAlpha(qfh.m20341l(this.f82440b, this.f82441c, this.f82442d, this.f82443e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* JADX INFO: renamed from: so5$b */
    public class C12713b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f82444a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f82445b;

        public C12713b(View view, float f) {
            this.f82444a = view;
            this.f82445b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f82444a.setAlpha(this.f82445b);
        }
    }

    private static Animator createFadeAnimator(View view, float f, float f2, @y46(from = 0.0d, m25645to = 1.0d) float f3, @y46(from = 0.0d, m25645to = 1.0d) float f4, float f5) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C12712a(view, f, f2, f3, f4));
        valueAnimatorOfFloat.addListener(new C12713b(view, f5));
        return valueAnimatorOfFloat;
    }

    @Override // p000.bdi
    @hib
    public Animator createAppear(@efb ViewGroup viewGroup, @efb View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeAnimator(view, 0.0f, alpha, 0.0f, this.f82438a, alpha);
    }

    @Override // p000.bdi
    @hib
    public Animator createDisappear(@efb ViewGroup viewGroup, @efb View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return createFadeAnimator(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    public float getIncomingEndThreshold() {
        return this.f82438a;
    }

    public void setIncomingEndThreshold(float f) {
        this.f82438a = f;
    }
}
