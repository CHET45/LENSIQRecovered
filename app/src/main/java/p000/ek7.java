package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public final class ek7 extends Visibility {
    @Override // android.transition.Visibility
    @efb
    public Animator onAppear(@efb ViewGroup viewGroup, @efb View view, @hib TransitionValues transitionValues, @hib TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // android.transition.Visibility
    @efb
    public Animator onDisappear(@efb ViewGroup viewGroup, @efb View view, @hib TransitionValues transitionValues, @hib TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
