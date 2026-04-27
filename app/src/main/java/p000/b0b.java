package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes5.dex */
public class b0b {

    /* JADX INFO: renamed from: a */
    public long f12326a;

    /* JADX INFO: renamed from: b */
    public long f12327b;

    /* JADX INFO: renamed from: c */
    @hib
    public TimeInterpolator f12328c;

    /* JADX INFO: renamed from: d */
    public int f12329d;

    /* JADX INFO: renamed from: e */
    public int f12330e;

    public b0b(long j, long j2) {
        this.f12328c = null;
        this.f12329d = 0;
        this.f12330e = 1;
        this.f12326a = j;
        this.f12327b = j2;
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static b0b m2784a(@efb ValueAnimator valueAnimator) {
        b0b b0bVar = new b0b(valueAnimator.getStartDelay(), valueAnimator.getDuration(), getInterpolatorCompat(valueAnimator));
        b0bVar.f12329d = valueAnimator.getRepeatCount();
        b0bVar.f12330e = valueAnimator.getRepeatMode();
        return b0bVar;
    }

    private static TimeInterpolator getInterpolatorCompat(@efb ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C13280ty.f86290b : interpolator instanceof AccelerateInterpolator ? C13280ty.f86291c : interpolator instanceof DecelerateInterpolator ? C13280ty.f86292d : interpolator;
    }

    public void apply(@efb Animator animator) {
        animator.setStartDelay(getDelay());
        animator.setDuration(getDuration());
        animator.setInterpolator(getInterpolator());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(getRepeatCount());
            valueAnimator.setRepeatMode(getRepeatMode());
        }
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0b)) {
            return false;
        }
        b0b b0bVar = (b0b) obj;
        if (getDelay() == b0bVar.getDelay() && getDuration() == b0bVar.getDuration() && getRepeatCount() == b0bVar.getRepeatCount() && getRepeatMode() == b0bVar.getRepeatMode()) {
            return getInterpolator().getClass().equals(b0bVar.getInterpolator().getClass());
        }
        return false;
    }

    public long getDelay() {
        return this.f12326a;
    }

    public long getDuration() {
        return this.f12327b;
    }

    @hib
    public TimeInterpolator getInterpolator() {
        TimeInterpolator timeInterpolator = this.f12328c;
        return timeInterpolator != null ? timeInterpolator : C13280ty.f86290b;
    }

    public int getRepeatCount() {
        return this.f12329d;
    }

    public int getRepeatMode() {
        return this.f12330e;
    }

    public int hashCode() {
        return (((((((((int) (getDelay() ^ (getDelay() >>> 32))) * 31) + ((int) (getDuration() ^ (getDuration() >>> 32)))) * 31) + getInterpolator().getClass().hashCode()) * 31) + getRepeatCount()) * 31) + getRepeatMode();
    }

    @efb
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + getDelay() + " duration: " + getDuration() + " interpolator: " + getInterpolator().getClass() + " repeatCount: " + getRepeatCount() + " repeatMode: " + getRepeatMode() + "}\n";
    }

    public b0b(long j, long j2, @efb TimeInterpolator timeInterpolator) {
        this.f12329d = 0;
        this.f12330e = 1;
        this.f12326a = j;
        this.f12327b = j2;
        this.f12328c = timeInterpolator;
    }
}
