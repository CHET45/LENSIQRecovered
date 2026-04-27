package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class vqf implements hq0 {
    @Override // p000.hq0
    @yfb
    public Animator[] animators(@yfb View view) {
        md8.checkParameterIsNotNull(view, "view");
        md8.checkExpressionValueIsNotNull(view.getRootView(), "view.rootView");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", r0.getWidth(), 0.0f);
        md8.checkExpressionValueIsNotNull(objectAnimatorOfFloat, "animator");
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.8f));
        return new Animator[]{objectAnimatorOfFloat};
    }
}
