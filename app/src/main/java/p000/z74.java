package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import p000.InterfaceC14278vw;
import p000.kt0;
import p000.xt4;

/* JADX INFO: loaded from: classes5.dex */
public final class z74<S extends kt0> extends uq4 {

    /* JADX INFO: renamed from: c2 */
    public static final int f104315c2 = 10000;

    /* JADX INFO: renamed from: d2 */
    public static final float f104316d2 = 50.0f;

    /* JADX INFO: renamed from: e2 */
    public static final x46<z74> f104317e2 = new C16023a("indicatorLevel");

    /* JADX INFO: renamed from: M1 */
    public zq4<S> f104318M1;

    /* JADX INFO: renamed from: V1 */
    public final jzf f104319V1;

    /* JADX INFO: renamed from: Z1 */
    public final hzf f104320Z1;

    /* JADX INFO: renamed from: a2 */
    public float f104321a2;

    /* JADX INFO: renamed from: b2 */
    public boolean f104322b2;

    /* JADX INFO: renamed from: z74$a */
    public class C16023a extends x46<z74> {
        public C16023a(String str) {
            super(str);
        }

        @Override // p000.x46
        public float getValue(z74 z74Var) {
            return z74Var.getIndicatorFraction() * 10000.0f;
        }

        @Override // p000.x46
        public void setValue(z74 z74Var, float f) {
            z74Var.setIndicatorFraction(f / 10000.0f);
        }
    }

    public z74(@efb Context context, @efb kt0 kt0Var, @efb zq4<S> zq4Var) {
        super(context, kt0Var);
        this.f104322b2 = false;
        m26601n(zq4Var);
        jzf jzfVar = new jzf();
        this.f104319V1 = jzfVar;
        jzfVar.setDampingRatio(1.0f);
        jzfVar.setStiffness(50.0f);
        hzf hzfVar = new hzf(this, f104317e2);
        this.f104320Z1 = hzfVar;
        hzfVar.setSpring(jzfVar);
        m23507f(1.0f);
    }

    @efb
    public static z74<CircularProgressIndicatorSpec> createCircularDrawable(@efb Context context, @efb CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new z74<>(context, circularProgressIndicatorSpec, new i02(circularProgressIndicatorSpec));
    }

    @efb
    public static z74<LinearProgressIndicatorSpec> createLinearDrawable(@efb Context context, @efb LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new z74<>(context, linearProgressIndicatorSpec, new o69(linearProgressIndicatorSpec));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getIndicatorFraction() {
        return this.f104321a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndicatorFraction(float f) {
        this.f104321a2 = f;
        invalidateSelf();
    }

    public void addSpringAnimationEndListener(@efb xt4.InterfaceC15290q interfaceC15290q) {
        this.f104320Z1.addEndListener(interfaceC15290q);
    }

    @Override // p000.uq4, p000.InterfaceC14278vw
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f104318M1.m26954c(canvas, getBounds(), m23505d());
            this.f104318M1.mo12680a(canvas, this.f88750N);
            this.f104318M1.fillIndicator(canvas, this.f88750N, 0.0f, getIndicatorFraction(), ow9.compositeARGBWithAlpha(this.f88753b.f55272c[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // p000.uq4, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f104318M1.getPreferredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f104318M1.getPreferredWidth();
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
        float systemAnimatorDurationScale = this.f88754c.getSystemAnimatorDurationScale(this.f88752a.getContentResolver());
        if (systemAnimatorDurationScale == 0.0f) {
            this.f104322b2 = true;
        } else {
            this.f104322b2 = false;
            this.f104319V1.setStiffness(50.0f / systemAnimatorDurationScale);
        }
        return zMo22298j;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f104320Z1.skipToEnd();
        setIndicatorFraction(getLevel() / 10000.0f);
    }

    @efb
    /* JADX INFO: renamed from: m */
    public zq4<S> m26600m() {
        return this.f104318M1;
    }

    /* JADX INFO: renamed from: n */
    public void m26601n(@efb zq4<S> zq4Var) {
        this.f104318M1 = zq4Var;
        zq4Var.m26953b(this);
    }

    /* JADX INFO: renamed from: o */
    public void m26602o(float f) {
        setLevel((int) (f * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        if (this.f104322b2) {
            this.f104320Z1.skipToEnd();
            setIndicatorFraction(i / 10000.0f);
            return true;
        }
        this.f104320Z1.setStartValue(getIndicatorFraction() * 10000.0f);
        this.f104320Z1.animateToFinalPosition(i);
        return true;
    }

    @Override // p000.uq4, p000.InterfaceC14278vw
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@efb InterfaceC14278vw.a aVar) {
        super.registerAnimationCallback(aVar);
    }

    public void removeSpringAnimationEndListener(@efb xt4.InterfaceC15290q interfaceC15290q) {
        this.f104320Z1.removeEndListener(interfaceC15290q);
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
