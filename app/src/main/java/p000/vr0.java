package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vr0 extends ValueAnimator {

    /* JADX INFO: renamed from: a */
    public final Set<ValueAnimator.AnimatorUpdateListener> f92041a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public final Set<Animator.AnimatorListener> f92042b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a */
    public void mo2520a() {
        Iterator<Animator.AnimatorListener> it = this.f92042b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f92042b.add(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f92041a.add(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: b */
    public void m24134b(boolean z) {
        Iterator<Animator.AnimatorListener> it = this.f92042b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m24135c() {
        Iterator<Animator.AnimatorListener> it = this.f92042b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m24136d(boolean z) {
        Iterator<Animator.AnimatorListener> it = this.f92042b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m24137e() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f92041a.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f92042b.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f92041a.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f92042b.remove(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f92041a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
