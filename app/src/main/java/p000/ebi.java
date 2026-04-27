package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ebi {

    /* JADX INFO: renamed from: a */
    public final WeakReference<View> f32560a;

    /* JADX INFO: renamed from: ebi$a */
    public class C5248a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gbi f32561a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f32562b;

        public C5248a(gbi gbiVar, View view) {
            this.f32561a = gbiVar;
            this.f32562b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f32561a.onAnimationCancel(this.f32562b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32561a.onAnimationEnd(this.f32562b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f32561a.onAnimationStart(this.f32562b);
        }
    }

    /* JADX INFO: renamed from: ebi$b */
    @c5e(21)
    public static class C5249b {
        private C5249b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static ViewPropertyAnimator m9877a(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZ(f);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static ViewPropertyAnimator m9878b(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZBy(f);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static ViewPropertyAnimator m9879c(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.z(f);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static ViewPropertyAnimator m9880d(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.zBy(f);
        }
    }

    public ebi(View view) {
        this.f32560a = new WeakReference<>(view);
    }

    private void setListenerInternal(View view, gbi gbiVar) {
        if (gbiVar != null) {
            view.animate().setListener(new C5248a(gbiVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @efb
    public ebi alpha(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    @efb
    public ebi alphaBy(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    public void cancel() {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long getDuration() {
        View view = this.f32560a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @hib
    public Interpolator getInterpolator() {
        View view = this.f32560a.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long getStartDelay() {
        View view = this.f32560a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @efb
    public ebi rotation(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    @efb
    public ebi rotationBy(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    @efb
    public ebi rotationX(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    @efb
    public ebi rotationXBy(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    @efb
    public ebi rotationY(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    @efb
    public ebi rotationYBy(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    @efb
    public ebi scaleX(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    @efb
    public ebi scaleXBy(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    @efb
    public ebi scaleY(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    @efb
    public ebi scaleYBy(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    @efb
    public ebi setDuration(long j) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    @efb
    public ebi setInterpolator(@hib Interpolator interpolator) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @efb
    public ebi setListener(@hib gbi gbiVar) {
        View view = this.f32560a.get();
        if (view != null) {
            setListenerInternal(view, gbiVar);
        }
        return this;
    }

    @efb
    public ebi setStartDelay(long j) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    @efb
    public ebi setUpdateListener(@hib final ibi ibiVar) {
        final View view = this.f32560a.get();
        if (view != null) {
            view.animate().setUpdateListener(ibiVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: dbi
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ibiVar.onAnimationUpdate(view);
                }
            } : null);
        }
        return this;
    }

    public void start() {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @efb
    public ebi translationX(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    @efb
    public ebi translationXBy(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    @efb
    public ebi translationY(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    @efb
    public ebi translationYBy(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    @efb
    public ebi translationZ(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            C5249b.m9877a(view.animate(), f);
        }
        return this;
    }

    @efb
    public ebi translationZBy(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            C5249b.m9878b(view.animate(), f);
        }
        return this;
    }

    @efb
    public ebi withEndAction(@efb Runnable runnable) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    @efb
    @igg({"WrongConstant"})
    public ebi withLayer() {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    @efb
    public ebi withStartAction(@efb Runnable runnable) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    @efb
    /* JADX INFO: renamed from: x */
    public ebi m9874x(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    @efb
    public ebi xBy(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    @efb
    /* JADX INFO: renamed from: y */
    public ebi m9875y(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    @efb
    public ebi yBy(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    @efb
    /* JADX INFO: renamed from: z */
    public ebi m9876z(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            C5249b.m9879c(view.animate(), f);
        }
        return this;
    }

    @efb
    public ebi zBy(float f) {
        View view = this.f32560a.get();
        if (view != null) {
            C5249b.m9880d(view.animate(), f);
        }
        return this;
    }
}
