package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: in */
/* JADX INFO: loaded from: classes4.dex */
public final class C7513in implements hq0 {

    /* JADX INFO: renamed from: b */
    public static final float f47550b = 0.0f;

    /* JADX INFO: renamed from: c */
    public static final a f47551c = new a(null);

    /* JADX INFO: renamed from: a */
    public final float f47552a;

    /* JADX INFO: renamed from: in$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(jt3 jt3Var) {
            this();
        }
    }

    @yn8
    public C7513in() {
        this(0.0f, 1, null);
    }

    @Override // p000.hq0
    @yfb
    public Animator[] animators(@yfb View view) {
        md8.checkParameterIsNotNull(view, "view");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", this.f47552a, 1.0f);
        md8.checkExpressionValueIsNotNull(objectAnimatorOfFloat, "animator");
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        return new Animator[]{objectAnimatorOfFloat};
    }

    @yn8
    public C7513in(float f) {
        this.f47552a = f;
    }

    public /* synthetic */ C7513in(float f, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? 0.0f : f);
    }
}
