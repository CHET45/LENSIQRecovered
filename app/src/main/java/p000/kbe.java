package p000;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public class kbe {

    /* JADX INFO: renamed from: a */
    public ImageView f53554a;

    /* JADX INFO: renamed from: b */
    public ValueAnimator f53555b;

    /* JADX INFO: renamed from: c */
    public float f53556c;

    /* JADX INFO: renamed from: d */
    public long f53557d;

    public kbe(ImageView imageView) {
        this.f53556c = 0.0f;
        this.f53557d = 2000L;
        this.f53554a = imageView;
        initAnimator();
    }

    private void initAnimator() {
        float f = this.f53556c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 360.0f + f);
        this.f53555b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f53557d);
        this.f53555b.setInterpolator(new LinearInterpolator());
        this.f53555b.setRepeatCount(-1);
        this.f53555b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jbe
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f50260a.lambda$initAnimator$0(valueAnimator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initAnimator$0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f53556c = fFloatValue;
        this.f53554a.setRotation(fFloatValue);
    }

    public void pause() {
        ValueAnimator valueAnimator = this.f53555b;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f53555b.pause();
    }

    public void release() {
        ValueAnimator valueAnimator = this.f53555b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f53555b = null;
        }
        this.f53554a = null;
    }

    public void reset() {
        ValueAnimator valueAnimator = this.f53555b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f53556c = 0.0f;
            this.f53554a.setRotation(0.0f);
            initAnimator();
        }
    }

    public void resume() {
        ValueAnimator valueAnimator = this.f53555b;
        if (valueAnimator == null || !valueAnimator.isPaused()) {
            return;
        }
        this.f53555b.resume();
    }

    public void start() {
        ValueAnimator valueAnimator = this.f53555b;
        if (valueAnimator != null && valueAnimator.isPaused()) {
            this.f53555b.resume();
            return;
        }
        ValueAnimator valueAnimator2 = this.f53555b;
        if (valueAnimator2 == null || valueAnimator2.isRunning()) {
            return;
        }
        this.f53555b.start();
    }

    public kbe(ImageView imageView, long duration) {
        this.f53556c = 0.0f;
        this.f53554a = imageView;
        this.f53557d = duration;
        initAnimator();
    }
}
