package p000;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import p000.InterfaceC14278vw;
import p000.kt0;

/* JADX INFO: loaded from: classes5.dex */
public final class sz7<S extends kt0> extends uq4 {

    /* JADX INFO: renamed from: M1 */
    public zq4<S> f83253M1;

    /* JADX INFO: renamed from: V1 */
    public rz7<ObjectAnimator> f83254V1;

    public sz7(@efb Context context, @efb kt0 kt0Var, @efb zq4<S> zq4Var, @efb rz7<ObjectAnimator> rz7Var) {
        super(context, kt0Var);
        m22302n(zq4Var);
        m22301m(rz7Var);
    }

    @efb
    public static sz7<CircularProgressIndicatorSpec> createCircularDrawable(@efb Context context, @efb CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new sz7<>(context, circularProgressIndicatorSpec, new i02(circularProgressIndicatorSpec), new j02(circularProgressIndicatorSpec));
    }

    @efb
    public static sz7<LinearProgressIndicatorSpec> createLinearDrawable(@efb Context context, @efb LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new sz7<>(context, linearProgressIndicatorSpec, new o69(linearProgressIndicatorSpec), linearProgressIndicatorSpec.f22114g == 0 ? new r69(linearProgressIndicatorSpec) : new s69(context, linearProgressIndicatorSpec));
    }

    @Override // p000.uq4, p000.InterfaceC14278vw
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.f83253M1.m26954c(canvas, getBounds(), m23505d());
        this.f83253M1.mo12680a(canvas, this.f88750N);
        int i = 0;
        while (true) {
            rz7<ObjectAnimator> rz7Var = this.f83254V1;
            int[] iArr = rz7Var.f80183c;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            zq4<S> zq4Var = this.f83253M1;
            Paint paint = this.f88750N;
            float[] fArr = rz7Var.f80182b;
            int i2 = i * 2;
            zq4Var.fillIndicator(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
            i++;
        }
    }

    @Override // p000.uq4, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f83253M1.getPreferredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f83253M1.getPreferredWidth();
    }

    @Override // p000.uq4, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p000.uq4
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // p000.uq4
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // p000.uq4, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // p000.uq4
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: j */
    public boolean mo22298j(boolean z, boolean z2, boolean z3) {
        boolean zMo22298j = super.mo22298j(z, z2, z3);
        if (!isRunning()) {
            this.f83254V1.cancelAnimatorImmediately();
        }
        this.f88754c.getSystemAnimatorDurationScale(this.f88752a.getContentResolver());
        if (z && z3) {
            this.f83254V1.startAnimator();
        }
        return zMo22298j;
    }

    @efb
    /* JADX INFO: renamed from: k */
    public rz7<ObjectAnimator> m22299k() {
        return this.f83254V1;
    }

    @efb
    /* JADX INFO: renamed from: l */
    public zq4<S> m22300l() {
        return this.f83253M1;
    }

    /* JADX INFO: renamed from: m */
    public void m22301m(@efb rz7<ObjectAnimator> rz7Var) {
        this.f83254V1 = rz7Var;
        rz7Var.m21615b(this);
    }

    /* JADX INFO: renamed from: n */
    public void m22302n(@efb zq4<S> zq4Var) {
        this.f83253M1 = zq4Var;
        zq4Var.m26953b(this);
    }

    @Override // p000.uq4, p000.InterfaceC14278vw
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@efb InterfaceC14278vw.a aVar) {
        super.registerAnimationCallback(aVar);
    }

    @Override // p000.uq4, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // p000.uq4, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@hib ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p000.uq4, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // p000.uq4, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // p000.uq4, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // p000.uq4, p000.InterfaceC14278vw
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@efb InterfaceC14278vw.a aVar) {
        return super.unregisterAnimationCallback(aVar);
    }

    @Override // p000.uq4
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }
}
