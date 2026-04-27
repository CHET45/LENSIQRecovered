package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.material.C3146R;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;
import org.opencv.videoio.Videoio;
import p000.InterfaceC14278vw;

/* JADX INFO: loaded from: classes5.dex */
public final class s69 extends rz7<ObjectAnimator> {

    /* JADX INFO: renamed from: l */
    public static final int f80775l = 1800;

    /* JADX INFO: renamed from: m */
    public static final int[] f80776m = {Videoio.CAP_PROP_XI_SENSOR_CLOCK_FREQ_INDEX, 567, 850, 750};

    /* JADX INFO: renamed from: n */
    public static final int[] f80777n = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: o */
    public static final Property<s69, Float> f80778o = new C12463c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f80779d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f80780e;

    /* JADX INFO: renamed from: f */
    public final Interpolator[] f80781f;

    /* JADX INFO: renamed from: g */
    public final kt0 f80782g;

    /* JADX INFO: renamed from: h */
    public int f80783h;

    /* JADX INFO: renamed from: i */
    public boolean f80784i;

    /* JADX INFO: renamed from: j */
    public float f80785j;

    /* JADX INFO: renamed from: k */
    public InterfaceC14278vw.a f80786k;

    /* JADX INFO: renamed from: s69$a */
    public class C12461a extends AnimatorListenerAdapter {
        public C12461a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            s69 s69Var = s69.this;
            s69Var.f80783h = (s69Var.f80783h + 1) % s69.this.f80782g.f55272c.length;
            s69.this.f80784i = true;
        }
    }

    /* JADX INFO: renamed from: s69$b */
    public class C12462b extends AnimatorListenerAdapter {
        public C12462b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            s69.this.cancelAnimatorImmediately();
            s69 s69Var = s69.this;
            InterfaceC14278vw.a aVar = s69Var.f80786k;
            if (aVar != null) {
                aVar.onAnimationEnd(s69Var.f80181a);
            }
        }
    }

    /* JADX INFO: renamed from: s69$c */
    public class C12463c extends Property<s69, Float> {
        public C12463c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(s69 s69Var) {
            return Float.valueOf(s69Var.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(s69 s69Var, Float f) {
            s69Var.m21757i(f.floatValue());
        }
    }

    public s69(@efb Context context, @efb LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f80783h = 0;
        this.f80786k = null;
        this.f80782g = linearProgressIndicatorSpec;
        this.f80781f = new Interpolator[]{C13789uy.loadInterpolator(context, C3146R.anim.linear_indeterminate_line1_head_interpolator), C13789uy.loadInterpolator(context, C3146R.anim.linear_indeterminate_line1_tail_interpolator), C13789uy.loadInterpolator(context, C3146R.anim.linear_indeterminate_line2_head_interpolator), C13789uy.loadInterpolator(context, C3146R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAnimationFraction() {
        return this.f80785j;
    }

    private void maybeInitializeAnimators() {
        if (this.f80779d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f80778o, 0.0f, 1.0f);
            this.f80779d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f80779d.setInterpolator(null);
            this.f80779d.setRepeatCount(-1);
            this.f80779d.addListener(new C12461a());
        }
        if (this.f80780e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f80778o, 1.0f);
            this.f80780e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f80780e.setInterpolator(null);
            this.f80780e.addListener(new C12462b());
        }
    }

    private void maybeUpdateSegmentColors() {
        if (this.f80784i) {
            Arrays.fill(this.f80183c, ow9.compositeARGBWithAlpha(this.f80782g.f55272c[this.f80783h], this.f80181a.getAlpha()));
            this.f80784i = false;
        }
    }

    private void updateSegmentPositions(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f80182b[i2] = Math.max(0.0f, Math.min(1.0f, this.f80781f[i2].getInterpolation(m21614a(i, f80777n[i2], f80776m[i2]))));
        }
    }

    @Override // p000.rz7
    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.f80779d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @fdi
    /* JADX INFO: renamed from: h */
    public void m21756h() {
        this.f80783h = 0;
        int iCompositeARGBWithAlpha = ow9.compositeARGBWithAlpha(this.f80782g.f55272c[0], this.f80181a.getAlpha());
        int[] iArr = this.f80183c;
        iArr[0] = iCompositeARGBWithAlpha;
        iArr[1] = iCompositeARGBWithAlpha;
    }

    @fdi
    /* JADX INFO: renamed from: i */
    public void m21757i(float f) {
        this.f80785j = f;
        updateSegmentPositions((int) (f * 1800.0f));
        maybeUpdateSegmentColors();
        this.f80181a.invalidateSelf();
    }

    @Override // p000.rz7
    public void invalidateSpecValues() {
        m21756h();
    }

    @Override // p000.rz7
    public void registerAnimatorsCompleteCallback(@efb InterfaceC14278vw.a aVar) {
        this.f80786k = aVar;
    }

    @Override // p000.rz7
    public void requestCancelAnimatorAfterCurrentCycle() {
        ObjectAnimator objectAnimator = this.f80780e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        cancelAnimatorImmediately();
        if (this.f80181a.isVisible()) {
            this.f80780e.setFloatValues(this.f80785j, 1.0f);
            this.f80780e.setDuration((long) ((1.0f - this.f80785j) * 1800.0f));
            this.f80780e.start();
        }
    }

    @Override // p000.rz7
    public void startAnimator() {
        maybeInitializeAnimators();
        m21756h();
        this.f80779d.start();
    }

    @Override // p000.rz7
    public void unregisterAnimatorsCompleteCallback() {
        this.f80786k = null;
    }
}
