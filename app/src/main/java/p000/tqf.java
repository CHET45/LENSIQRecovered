package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class tqf implements hq0 {
    @Override // p000.hq0
    @yfb
    public Animator[] animators(@yfb View view) {
        md8.checkParameterIsNotNull(view, "view");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", view.getMeasuredHeight(), 0.0f);
        md8.checkExpressionValueIsNotNull(objectAnimatorOfFloat, "animator");
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.3f));
        return new Animator[]{objectAnimatorOfFloat};
    }
}
