package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;
import p000.InterfaceC14278vw;

/* JADX INFO: loaded from: classes5.dex */
public final class r69 extends rz7<ObjectAnimator> {

    /* JADX INFO: renamed from: j */
    public static final int f77118j = 667;

    /* JADX INFO: renamed from: k */
    public static final int f77119k = 333;

    /* JADX INFO: renamed from: l */
    public static final Property<r69, Float> f77120l = new C11903b(Float.class, "animationFraction");

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f77121d;

    /* JADX INFO: renamed from: e */
    public np5 f77122e;

    /* JADX INFO: renamed from: f */
    public final kt0 f77123f;

    /* JADX INFO: renamed from: g */
    public int f77124g;

    /* JADX INFO: renamed from: h */
    public boolean f77125h;

    /* JADX INFO: renamed from: i */
    public float f77126i;

    /* JADX INFO: renamed from: r69$a */
    public class C11902a extends AnimatorListenerAdapter {
        public C11902a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            r69 r69Var = r69.this;
            r69Var.f77124g = (r69Var.f77124g + 1) % r69.this.f77123f.f55272c.length;
            r69.this.f77125h = true;
        }
    }

    /* JADX INFO: renamed from: r69$b */
    public class C11903b extends Property<r69, Float> {
        public C11903b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(r69 r69Var) {
            return Float.valueOf(r69Var.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(r69 r69Var, Float f) {
            r69Var.m21070i(f.floatValue());
        }
    }

    public r69(@efb LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f77124g = 1;
        this.f77123f = linearProgressIndicatorSpec;
        this.f77122e = new np5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAnimationFraction() {
        return this.f77126i;
    }

    private void maybeInitializeAnimators() {
        if (this.f77121d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f77120l, 0.0f, 1.0f);
            this.f77121d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f77121d.setInterpolator(null);
            this.f77121d.setRepeatCount(-1);
            this.f77121d.addListener(new C11902a());
        }
    }

    private void maybeUpdateSegmentColors() {
        if (!this.f77125h || this.f80182b[3] >= 1.0f) {
            return;
        }
        int[] iArr = this.f80183c;
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        iArr[0] = ow9.compositeARGBWithAlpha(this.f77123f.f55272c[this.f77124g], this.f80181a.getAlpha());
        this.f77125h = false;
    }

    private void updateSegmentPositions(int i) {
        this.f80182b[0] = 0.0f;
        float fM21614a = m21614a(i, 0, 667);
        float[] fArr = this.f80182b;
        float interpolation = this.f77122e.getInterpolation(fM21614a);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f80182b;
        float interpolation2 = this.f77122e.getInterpolation(fM21614a + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f80182b[5] = 1.0f;
    }

    @Override // p000.rz7
    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.f77121d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @fdi
    /* JADX INFO: renamed from: h */
    public void m21069h() {
        this.f77125h = true;
        this.f77124g = 1;
        Arrays.fill(this.f80183c, ow9.compositeARGBWithAlpha(this.f77123f.f55272c[0], this.f80181a.getAlpha()));
    }

    @fdi
    /* JADX INFO: renamed from: i */
    public void m21070i(float f) {
        this.f77126i = f;
        updateSegmentPositions((int) (f * 333.0f));
        maybeUpdateSegmentColors();
        this.f80181a.invalidateSelf();
    }

    @Override // p000.rz7
    public void invalidateSpecValues() {
        m21069h();
    }

    @Override // p000.rz7
    public void registerAnimatorsCompleteCallback(@hib InterfaceC14278vw.a aVar) {
    }

    @Override // p000.rz7
    public void requestCancelAnimatorAfterCurrentCycle() {
    }

    @Override // p000.rz7
    public void startAnimator() {
        maybeInitializeAnimators();
        m21069h();
        this.f77121d.start();
    }

    @Override // p000.rz7
    public void unregisterAnimatorsCompleteCallback() {
    }
}
