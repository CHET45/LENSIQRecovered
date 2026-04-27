package p000;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes3.dex */
public class ap9 extends vr0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: H */
    @hib
    public bn9 f11531H;

    /* JADX INFO: renamed from: c */
    public float f11533c = 1.0f;

    /* JADX INFO: renamed from: d */
    public boolean f11534d = false;

    /* JADX INFO: renamed from: e */
    public long f11535e = 0;

    /* JADX INFO: renamed from: f */
    public float f11536f = 0.0f;

    /* JADX INFO: renamed from: m */
    public int f11537m = 0;

    /* JADX INFO: renamed from: C */
    public float f11529C = -2.1474836E9f;

    /* JADX INFO: renamed from: F */
    public float f11530F = 2.1474836E9f;

    /* JADX INFO: renamed from: L */
    @fdi
    public boolean f11532L = false;

    private float getFrameDurationNs() {
        bn9 bn9Var = this.f11531H;
        if (bn9Var == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / bn9Var.getFrameRate()) / Math.abs(this.f11533c);
    }

    private boolean isReversed() {
        return getSpeed() < 0.0f;
    }

    private void verifyFrame() {
        if (this.f11531H == null) {
            return;
        }
        float f = this.f11536f;
        if (f < this.f11529C || f > this.f11530F) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f11529C), Float.valueOf(this.f11530F), Float.valueOf(this.f11536f)));
        }
    }

    @Override // p000.vr0
    /* JADX INFO: renamed from: a */
    public void mo2520a() {
        super.mo2520a();
        m24134b(isReversed());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @ir9
    public void cancel() {
        mo2520a();
        m2522g();
    }

    public void clearComposition() {
        this.f11531H = null;
        this.f11529C = -2.1474836E9f;
        this.f11530F = 2.1474836E9f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        m2521f();
        if (this.f11531H == null || !isRunning()) {
            return;
        }
        bt8.beginSection("LottieValueAnimator#doFrame");
        float frameDurationNs = (this.f11535e != 0 ? j - r1 : 0L) / getFrameDurationNs();
        float f = this.f11536f;
        if (isReversed()) {
            frameDurationNs = -frameDurationNs;
        }
        float f2 = f + frameDurationNs;
        this.f11536f = f2;
        boolean zContains = awa.contains(f2, getMinFrame(), getMaxFrame());
        this.f11536f = awa.clamp(this.f11536f, getMinFrame(), getMaxFrame());
        this.f11535e = j;
        m24137e();
        if (!zContains) {
            if (getRepeatCount() == -1 || this.f11537m < getRepeatCount()) {
                m24135c();
                this.f11537m++;
                if (getRepeatMode() == 2) {
                    this.f11534d = !this.f11534d;
                    reverseAnimationSpeed();
                } else {
                    this.f11536f = isReversed() ? getMaxFrame() : getMinFrame();
                }
                this.f11535e = j;
            } else {
                this.f11536f = this.f11533c < 0.0f ? getMinFrame() : getMaxFrame();
                m2522g();
                m24134b(isReversed());
            }
        }
        verifyFrame();
        bt8.endSection("LottieValueAnimator#doFrame");
    }

    @ir9
    public void endAnimation() {
        m2522g();
        m24134b(isReversed());
    }

    /* JADX INFO: renamed from: f */
    public void m2521f() {
        if (isRunning()) {
            m2523h(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @ir9
    /* JADX INFO: renamed from: g */
    public void m2522g() {
        m2523h(true);
    }

    @Override // android.animation.ValueAnimator
    @y46(from = 0.0d, m25645to = 1.0d)
    public float getAnimatedFraction() {
        float minFrame;
        float maxFrame;
        float minFrame2;
        if (this.f11531H == null) {
            return 0.0f;
        }
        if (isReversed()) {
            minFrame = getMaxFrame() - this.f11536f;
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        } else {
            minFrame = this.f11536f - getMinFrame();
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        }
        return minFrame / (maxFrame - minFrame2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(getAnimatedValueAbsolute());
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public float getAnimatedValueAbsolute() {
        bn9 bn9Var = this.f11531H;
        if (bn9Var == null) {
            return 0.0f;
        }
        return (this.f11536f - bn9Var.getStartFrame()) / (this.f11531H.getEndFrame() - this.f11531H.getStartFrame());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        bn9 bn9Var = this.f11531H;
        if (bn9Var == null) {
            return 0L;
        }
        return (long) bn9Var.getDuration();
    }

    public float getFrame() {
        return this.f11536f;
    }

    public float getMaxFrame() {
        bn9 bn9Var = this.f11531H;
        if (bn9Var == null) {
            return 0.0f;
        }
        float f = this.f11530F;
        return f == 2.1474836E9f ? bn9Var.getEndFrame() : f;
    }

    public float getMinFrame() {
        bn9 bn9Var = this.f11531H;
        if (bn9Var == null) {
            return 0.0f;
        }
        float f = this.f11529C;
        return f == -2.1474836E9f ? bn9Var.getStartFrame() : f;
    }

    public float getSpeed() {
        return this.f11533c;
    }

    @ir9
    /* JADX INFO: renamed from: h */
    public void m2523h(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f11532L = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f11532L;
    }

    @ir9
    public void pauseAnimation() {
        m2522g();
    }

    @ir9
    public void playAnimation() {
        this.f11532L = true;
        m24136d(isReversed());
        setFrame((int) (isReversed() ? getMaxFrame() : getMinFrame()));
        this.f11535e = 0L;
        this.f11537m = 0;
        m2521f();
    }

    @ir9
    public void resumeAnimation() {
        this.f11532L = true;
        m2521f();
        this.f11535e = 0L;
        if (isReversed() && getFrame() == getMinFrame()) {
            this.f11536f = getMaxFrame();
        } else {
            if (isReversed() || getFrame() != getMaxFrame()) {
                return;
            }
            this.f11536f = getMinFrame();
        }
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setComposition(bn9 bn9Var) {
        boolean z = this.f11531H == null;
        this.f11531H = bn9Var;
        if (z) {
            setMinAndMaxFrames(Math.max(this.f11529C, bn9Var.getStartFrame()), Math.min(this.f11530F, bn9Var.getEndFrame()));
        } else {
            setMinAndMaxFrames((int) bn9Var.getStartFrame(), (int) bn9Var.getEndFrame());
        }
        float f = this.f11536f;
        this.f11536f = 0.0f;
        setFrame((int) f);
        m24137e();
    }

    public void setFrame(float f) {
        if (this.f11536f == f) {
            return;
        }
        this.f11536f = awa.clamp(f, getMinFrame(), getMaxFrame());
        this.f11535e = 0L;
        m24137e();
    }

    public void setMaxFrame(float f) {
        setMinAndMaxFrames(this.f11529C, f);
    }

    public void setMinAndMaxFrames(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        bn9 bn9Var = this.f11531H;
        float startFrame = bn9Var == null ? -3.4028235E38f : bn9Var.getStartFrame();
        bn9 bn9Var2 = this.f11531H;
        float endFrame = bn9Var2 == null ? Float.MAX_VALUE : bn9Var2.getEndFrame();
        float fClamp = awa.clamp(f, startFrame, endFrame);
        float fClamp2 = awa.clamp(f2, startFrame, endFrame);
        if (fClamp == this.f11529C && fClamp2 == this.f11530F) {
            return;
        }
        this.f11529C = fClamp;
        this.f11530F = fClamp2;
        setFrame((int) awa.clamp(this.f11536f, fClamp, fClamp2));
    }

    public void setMinFrame(int i) {
        setMinAndMaxFrames(i, (int) this.f11530F);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f11534d) {
            return;
        }
        this.f11534d = false;
        reverseAnimationSpeed();
    }

    public void setSpeed(float f) {
        this.f11533c = f;
    }
}
