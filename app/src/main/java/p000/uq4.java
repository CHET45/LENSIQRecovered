package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.InterfaceC14278vw;

/* JADX INFO: loaded from: classes5.dex */
public abstract class uq4 extends Drawable implements InterfaceC14278vw {

    /* JADX INFO: renamed from: X */
    public static final boolean f88742X = false;

    /* JADX INFO: renamed from: Y */
    public static final int f88743Y = 500;

    /* JADX INFO: renamed from: Z */
    public static final Property<uq4, Float> f88744Z = new C13648c(Float.class, "growFraction");

    /* JADX INFO: renamed from: C */
    public float f88745C;

    /* JADX INFO: renamed from: F */
    public List<InterfaceC14278vw.a> f88746F;

    /* JADX INFO: renamed from: H */
    public InterfaceC14278vw.a f88747H;

    /* JADX INFO: renamed from: L */
    public boolean f88748L;

    /* JADX INFO: renamed from: M */
    public float f88749M;

    /* JADX INFO: renamed from: Q */
    public int f88751Q;

    /* JADX INFO: renamed from: a */
    public final Context f88752a;

    /* JADX INFO: renamed from: b */
    public final kt0 f88753b;

    /* JADX INFO: renamed from: d */
    public ValueAnimator f88755d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f88756e;

    /* JADX INFO: renamed from: f */
    public boolean f88757f;

    /* JADX INFO: renamed from: m */
    public boolean f88758m;

    /* JADX INFO: renamed from: N */
    public final Paint f88750N = new Paint();

    /* JADX INFO: renamed from: c */
    public C4567cz f88754c = new C4567cz();

    /* JADX INFO: renamed from: uq4$a */
    public class C13646a extends AnimatorListenerAdapter {
        public C13646a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            uq4.this.dispatchAnimationStart();
        }
    }

    /* JADX INFO: renamed from: uq4$b */
    public class C13647b extends AnimatorListenerAdapter {
        public C13647b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            uq4.super.setVisible(false, false);
            uq4.this.dispatchAnimationEnd();
        }
    }

    /* JADX INFO: renamed from: uq4$c */
    public class C13648c extends Property<uq4, Float> {
        public C13648c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(uq4 uq4Var) {
            return Float.valueOf(uq4Var.m23505d());
        }

        @Override // android.util.Property
        public void set(uq4 uq4Var, Float f) {
            uq4Var.m23507f(f.floatValue());
        }
    }

    public uq4(@efb Context context, @efb kt0 kt0Var) {
        this.f88752a = context;
        this.f88753b = kt0Var;
        setAlpha(255);
    }

    private void cancelAnimatorsWithoutCallbacks(@efb ValueAnimator... valueAnimatorArr) {
        boolean z = this.f88748L;
        this.f88748L = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f88748L = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationEnd() {
        InterfaceC14278vw.a aVar = this.f88747H;
        if (aVar != null) {
            aVar.onAnimationEnd(this);
        }
        List<InterfaceC14278vw.a> list = this.f88746F;
        if (list == null || this.f88748L) {
            return;
        }
        Iterator<InterfaceC14278vw.a> it = list.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationStart() {
        InterfaceC14278vw.a aVar = this.f88747H;
        if (aVar != null) {
            aVar.onAnimationStart(this);
        }
        List<InterfaceC14278vw.a> list = this.f88746F;
        if (list == null || this.f88748L) {
            return;
        }
        Iterator<InterfaceC14278vw.a> it = list.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this);
        }
    }

    private void endAnimatorsWithoutCallbacks(@efb ValueAnimator... valueAnimatorArr) {
        boolean z = this.f88748L;
        this.f88748L = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f88748L = z;
    }

    private void maybeInitializeAnimators() {
        if (this.f88755d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f88744Z, 0.0f, 1.0f);
            this.f88755d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f88755d.setInterpolator(C13280ty.f86290b);
            setShowAnimator(this.f88755d);
        }
        if (this.f88756e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f88744Z, 1.0f, 0.0f);
            this.f88756e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f88756e.setInterpolator(C13280ty.f86290b);
            setHideAnimator(this.f88756e);
        }
    }

    private void setHideAnimator(@efb ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f88756e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f88756e = valueAnimator;
        valueAnimator.addListener(new C13647b());
    }

    private void setShowAnimator(@efb ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f88755d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f88755d = valueAnimator;
        valueAnimator.addListener(new C13646a());
    }

    public void clearAnimationCallbacks() {
        this.f88746F.clear();
        this.f88746F = null;
    }

    /* JADX INFO: renamed from: d */
    public float m23505d() {
        if (this.f88753b.isShowAnimationEnabled() || this.f88753b.isHideAnimationEnabled()) {
            return (this.f88758m || this.f88757f) ? this.f88745C : this.f88749M;
        }
        return 1.0f;
    }

    @efb
    /* JADX INFO: renamed from: e */
    public ValueAnimator m23506e() {
        return this.f88756e;
    }

    /* JADX INFO: renamed from: f */
    public void m23507f(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        if (this.f88749M != f) {
            this.f88749M = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m23508g(@efb InterfaceC14278vw.a aVar) {
        this.f88747H = aVar;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f88751Q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @fdi
    /* JADX INFO: renamed from: h */
    public void m23509h(boolean z, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        this.f88758m = z;
        this.f88745C = f;
    }

    public boolean hideNow() {
        return setVisible(false, false, false);
    }

    @fdi
    /* JADX INFO: renamed from: i */
    public void m23510i(boolean z, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        this.f88757f = z;
        this.f88745C = f;
    }

    public boolean isHiding() {
        ValueAnimator valueAnimator = this.f88756e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f88758m;
    }

    public boolean isRunning() {
        return isShowing() || isHiding();
    }

    public boolean isShowing() {
        ValueAnimator valueAnimator = this.f88755d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f88757f;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo22298j(boolean z, boolean z2, boolean z3) {
        maybeInitializeAnimators();
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator = z ? this.f88755d : this.f88756e;
        ValueAnimator valueAnimator2 = z ? this.f88756e : this.f88755d;
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                cancelAnimatorsWithoutCallbacks(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                endAnimatorsWithoutCallbacks(valueAnimator);
            }
            return super.setVisible(z, false);
        }
        if (z3 && valueAnimator.isRunning()) {
            return false;
        }
        boolean z4 = !z || super.setVisible(z, false);
        if (!(z ? this.f88753b.isShowAnimationEnabled() : this.f88753b.isHideAnimationEnabled())) {
            endAnimatorsWithoutCallbacks(valueAnimator);
            return z4;
        }
        if (z2 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z4;
    }

    public void registerAnimationCallback(@efb InterfaceC14278vw.a aVar) {
        if (this.f88746F == null) {
            this.f88746F = new ArrayList();
        }
        if (this.f88746F.contains(aVar)) {
            return;
        }
        this.f88746F.add(aVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f88751Q = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@hib ColorFilter colorFilter) {
        this.f88750N.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return setVisible(z, z2, true);
    }

    public void start() {
        mo22298j(true, true, false);
    }

    public void stop() {
        mo22298j(false, true, false);
    }

    public boolean unregisterAnimationCallback(@efb InterfaceC14278vw.a aVar) {
        List<InterfaceC14278vw.a> list = this.f88746F;
        if (list == null || !list.contains(aVar)) {
            return false;
        }
        this.f88746F.remove(aVar);
        if (!this.f88746F.isEmpty()) {
            return true;
        }
        this.f88746F = null;
        return true;
    }

    public boolean setVisible(boolean z, boolean z2, boolean z3) {
        return mo22298j(z, z2, z3 && this.f88754c.getSystemAnimatorDurationScale(this.f88752a.getContentResolver()) > 0.0f);
    }
}
