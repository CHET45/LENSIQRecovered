package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class sme implements hq0 {

    /* JADX INFO: renamed from: b */
    public static final float f82249b = 0.5f;

    /* JADX INFO: renamed from: c */
    public static final C12662a f82250c = new C12662a(null);

    /* JADX INFO: renamed from: a */
    public final float f82251a;

    /* JADX INFO: renamed from: sme$a */
    public static final class C12662a {
        private C12662a() {
        }

        public /* synthetic */ C12662a(jt3 jt3Var) {
            this();
        }
    }

    @yn8
    public sme() {
        this(0.0f, 1, null);
    }

    @Override // p000.hq0
    @yfb
    public Animator[] animators(@yfb View view) {
        md8.checkParameterIsNotNull(view, "view");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", this.f82251a, 1.0f);
        md8.checkExpressionValueIsNotNull(objectAnimatorOfFloat, "scaleX");
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", this.f82251a, 1.0f);
        md8.checkExpressionValueIsNotNull(objectAnimatorOfFloat2, "scaleY");
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        return new Animator[]{objectAnimatorOfFloat, objectAnimatorOfFloat2};
    }

    @yn8
    public sme(float f) {
        this.f82251a = f;
    }

    public /* synthetic */ sme(float f, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? 0.5f : f);
    }
}
