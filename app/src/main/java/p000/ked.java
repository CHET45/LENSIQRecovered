package p000;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes4.dex */
public class ked extends kcc implements Animatable, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: e */
    public ValueAnimator f53805e;

    /* JADX INFO: renamed from: b */
    public int f53802b = 0;

    /* JADX INFO: renamed from: c */
    public int f53803c = 0;

    /* JADX INFO: renamed from: d */
    public int f53804d = 0;

    /* JADX INFO: renamed from: f */
    public Path f53806f = new Path();

    public ked() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(30, 3600);
        this.f53805e = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(10000L);
        this.f53805e.setInterpolator(null);
        this.f53805e.setRepeatCount(-1);
        this.f53805e.setRepeatMode(1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        float f = iWidth;
        float fMax = Math.max(1.0f, f / 22.0f);
        if (this.f53802b != iWidth || this.f53803c != iHeight) {
            this.f53806f.reset();
            Path path = this.f53806f;
            float f2 = f - fMax;
            float f3 = iHeight / 2.0f;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f2, f3, fMax, direction);
            float f4 = f - (5.0f * fMax);
            this.f53806f.addRect(f4, f3 - fMax, f2, f3 + fMax, direction);
            this.f53806f.addCircle(f4, f3, fMax, direction);
            this.f53802b = iWidth;
            this.f53803c = iHeight;
        }
        canvas.save();
        float f5 = f / 2.0f;
        float f6 = iHeight / 2.0f;
        canvas.rotate(this.f53804d, f5, f6);
        for (int i = 0; i < 12; i++) {
            this.f53606a.setAlpha((i + 5) * 17);
            canvas.rotate(30.0f, f5, f6);
            canvas.drawPath(this.f53806f, this.f53606a);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f53805e.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator animation) {
        this.f53804d = (((Integer) animation.getAnimatedValue()).intValue() / 30) * 30;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f53805e.isRunning()) {
            return;
        }
        this.f53805e.addUpdateListener(this);
        this.f53805e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f53805e.isRunning()) {
            this.f53805e.removeAllListeners();
            this.f53805e.removeAllUpdateListeners();
            this.f53805e.cancel();
        }
    }
}
