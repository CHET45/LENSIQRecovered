package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import p000.InterfaceC14278vw;

/* JADX INFO: loaded from: classes5.dex */
public final class j02 extends rz7<ObjectAnimator> {

    /* JADX INFO: renamed from: l */
    public static final int f49206l = 4;

    /* JADX INFO: renamed from: m */
    public static final int f49207m = 5400;

    /* JADX INFO: renamed from: n */
    public static final int f49208n = 667;

    /* JADX INFO: renamed from: o */
    public static final int f49209o = 667;

    /* JADX INFO: renamed from: p */
    public static final int f49210p = 333;

    /* JADX INFO: renamed from: q */
    public static final int f49211q = 333;

    /* JADX INFO: renamed from: u */
    public static final int f49215u = -20;

    /* JADX INFO: renamed from: v */
    public static final int f49216v = 250;

    /* JADX INFO: renamed from: w */
    public static final int f49217w = 1520;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f49220d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f49221e;

    /* JADX INFO: renamed from: f */
    public final np5 f49222f;

    /* JADX INFO: renamed from: g */
    public final kt0 f49223g;

    /* JADX INFO: renamed from: h */
    public int f49224h;

    /* JADX INFO: renamed from: i */
    public float f49225i;

    /* JADX INFO: renamed from: j */
    public float f49226j;

    /* JADX INFO: renamed from: k */
    public InterfaceC14278vw.a f49227k;

    /* JADX INFO: renamed from: r */
    public static final int[] f49212r = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: s */
    public static final int[] f49213s = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: t */
    public static final int[] f49214t = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: x */
    public static final Property<j02, Float> f49218x = new C7703c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: y */
    public static final Property<j02, Float> f49219y = new C7704d(Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: j02$a */
    public class C7701a extends AnimatorListenerAdapter {
        public C7701a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            j02 j02Var = j02.this;
            j02Var.f49224h = (j02Var.f49224h + 4) % j02.this.f49223g.f55272c.length;
        }
    }

    /* JADX INFO: renamed from: j02$b */
    public class C7702b extends AnimatorListenerAdapter {
        public C7702b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            j02.this.cancelAnimatorImmediately();
            j02 j02Var = j02.this;
            InterfaceC14278vw.a aVar = j02Var.f49227k;
            if (aVar != null) {
                aVar.onAnimationEnd(j02Var.f80181a);
            }
        }
    }

    /* JADX INFO: renamed from: j02$c */
    public class C7703c extends Property<j02, Float> {
        public C7703c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(j02 j02Var) {
            return Float.valueOf(j02Var.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(j02 j02Var, Float f) {
            j02Var.m13617j(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: j02$d */
    public class C7704d extends Property<j02, Float> {
        public C7704d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(j02 j02Var) {
            return Float.valueOf(j02Var.getCompleteEndFraction());
        }

        @Override // android.util.Property
        public void set(j02 j02Var, Float f) {
            j02Var.setCompleteEndFraction(f.floatValue());
        }
    }

    public j02(@efb CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f49224h = 0;
        this.f49227k = null;
        this.f49223g = circularProgressIndicatorSpec;
        this.f49222f = new np5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAnimationFraction() {
        return this.f49225i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCompleteEndFraction() {
        return this.f49226j;
    }

    private void maybeInitializeAnimators() {
        if (this.f49220d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f49218x, 0.0f, 1.0f);
            this.f49220d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f49220d.setInterpolator(null);
            this.f49220d.setRepeatCount(-1);
            this.f49220d.addListener(new C7701a());
        }
        if (this.f49221e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f49219y, 0.0f, 1.0f);
            this.f49221e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f49221e.setInterpolator(this.f49222f);
            this.f49221e.addListener(new C7702b());
        }
    }

    private void maybeUpdateSegmentColors(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            float fM21614a = m21614a(i, f49214t[i2], 333);
            if (fM21614a >= 0.0f && fM21614a <= 1.0f) {
                int i3 = i2 + this.f49224h;
                int[] iArr = this.f49223g.f55272c;
                int length = i3 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                this.f80183c[0] = j50.getInstance().evaluate(this.f49222f.getInterpolation(fM21614a), Integer.valueOf(ow9.compositeARGBWithAlpha(iArr[length], this.f80181a.getAlpha())), Integer.valueOf(ow9.compositeARGBWithAlpha(this.f49223g.f55272c[length2], this.f80181a.getAlpha()))).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompleteEndFraction(float f) {
        this.f49226j = f;
    }

    private void updateSegmentPositions(int i) {
        float[] fArr = this.f80182b;
        float f = this.f49225i;
        fArr[0] = (f * 1520.0f) - 20.0f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float fM21614a = m21614a(i, f49212r[i2], 667);
            float[] fArr2 = this.f80182b;
            fArr2[1] = fArr2[1] + (this.f49222f.getInterpolation(fM21614a) * 250.0f);
            float fM21614a2 = m21614a(i, f49213s[i2], 667);
            float[] fArr3 = this.f80182b;
            fArr3[0] = fArr3[0] + (this.f49222f.getInterpolation(fM21614a2) * 250.0f);
        }
        float[] fArr4 = this.f80182b;
        float f2 = fArr4[0];
        float f3 = fArr4[1];
        float f4 = f2 + ((f3 - f2) * this.f49226j);
        fArr4[0] = f4;
        fArr4[0] = f4 / 360.0f;
        fArr4[1] = f3 / 360.0f;
    }

    @Override // p000.rz7
    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.f49220d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @fdi
    /* JADX INFO: renamed from: i */
    public void m13616i() {
        this.f49224h = 0;
        this.f80183c[0] = ow9.compositeARGBWithAlpha(this.f49223g.f55272c[0], this.f80181a.getAlpha());
        this.f49226j = 0.0f;
    }

    @Override // p000.rz7
    public void invalidateSpecValues() {
        m13616i();
    }

    @fdi
    /* JADX INFO: renamed from: j */
    public void m13617j(float f) {
        this.f49225i = f;
        int i = (int) (f * 5400.0f);
        updateSegmentPositions(i);
        maybeUpdateSegmentColors(i);
        this.f80181a.invalidateSelf();
    }

    @Override // p000.rz7
    public void registerAnimatorsCompleteCallback(@efb InterfaceC14278vw.a aVar) {
        this.f49227k = aVar;
    }

    @Override // p000.rz7
    public void requestCancelAnimatorAfterCurrentCycle() {
        ObjectAnimator objectAnimator = this.f49221e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f80181a.isVisible()) {
            this.f49221e.start();
        } else {
            cancelAnimatorImmediately();
        }
    }

    @Override // p000.rz7
    public void startAnimator() {
        maybeInitializeAnimators();
        m13616i();
        this.f49220d.start();
    }

    @Override // p000.rz7
    public void unregisterAnimatorsCompleteCallback() {
        this.f49227k = null;
    }
}
