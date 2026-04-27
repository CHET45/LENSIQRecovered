package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import com.blankj.utilcode.util.C2481n;

/* JADX INFO: loaded from: classes3.dex */
public class k8f {

    /* JADX INFO: renamed from: a */
    public static final int f52778a = -16;

    /* JADX INFO: renamed from: k8f$a */
    public static class C8233a {

        /* JADX INFO: renamed from: i */
        public static final int f52779i = 1140850688;

        /* JADX INFO: renamed from: j */
        public static final int f52780j = C2481n.m4331v(8.0f);

        /* JADX INFO: renamed from: a */
        public float f52781a = -1.0f;

        /* JADX INFO: renamed from: b */
        public float f52782b = -1.0f;

        /* JADX INFO: renamed from: c */
        public float f52783c = -1.0f;

        /* JADX INFO: renamed from: d */
        public float f52784d = -1.0f;

        /* JADX INFO: renamed from: e */
        public float f52785e = -1.0f;

        /* JADX INFO: renamed from: f */
        public int f52786f = f52779i;

        /* JADX INFO: renamed from: g */
        public int f52787g = f52779i;

        /* JADX INFO: renamed from: h */
        public boolean f52788h = false;

        private float getShadowMaxSizeNormal() {
            if (this.f52784d == -1.0f) {
                this.f52784d = getShadowSizeNormal();
            }
            return this.f52784d;
        }

        private float getShadowMaxSizePressed() {
            if (this.f52785e == -1.0f) {
                this.f52785e = getShadowSizePressed();
            }
            return this.f52785e;
        }

        private float getShadowRadius() {
            if (this.f52781a < 0.0f) {
                this.f52781a = 0.0f;
            }
            return this.f52781a;
        }

        private float getShadowSizeNormal() {
            if (this.f52782b == -1.0f) {
                this.f52782b = f52780j;
            }
            return this.f52782b;
        }

        private float getShadowSizePressed() {
            if (this.f52783c == -1.0f) {
                this.f52783c = getShadowSizeNormal();
            }
            return this.f52783c;
        }

        /* JADX INFO: renamed from: a */
        public Drawable m14572a(Drawable drawable) {
            if (drawable == null) {
                drawable = new ColorDrawable(0);
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = drawable;
            stateListDrawable.addState(new int[]{16842919}, new C8235c(drawable2, getShadowRadius(), getShadowSizeNormal(), getShadowMaxSizeNormal(), this.f52787g, this.f52788h));
            stateListDrawable.addState(StateSet.WILD_CARD, new C8235c(drawable2, getShadowRadius(), getShadowSizePressed(), getShadowMaxSizePressed(), this.f52786f, this.f52788h));
            return stateListDrawable;
        }

        public C8233a setCircle() {
            this.f52788h = true;
            if (this.f52781a == -1.0f) {
                return this;
            }
            throw new IllegalArgumentException("Set circle needn't set radius.");
        }

        public C8233a setShadowColor(int i) {
            return setShadowColor(i, i);
        }

        public C8233a setShadowMaxSize(int i) {
            return setShadowMaxSize(i, i);
        }

        public C8233a setShadowRadius(float f) {
            this.f52781a = f;
            if (this.f52788h) {
                throw new IllegalArgumentException("Set circle needn't set radius.");
            }
            return this;
        }

        public C8233a setShadowSize(int i) {
            return setShadowSize(i, i);
        }

        public C8233a setShadowColor(int i, int i2) {
            this.f52786f = i;
            this.f52787g = i2;
            return this;
        }

        public C8233a setShadowMaxSize(int i, int i2) {
            this.f52784d = i;
            this.f52785e = i2;
            return this;
        }

        public C8233a setShadowSize(int i, int i2) {
            this.f52782b = i;
            this.f52783c = i2;
            return this;
        }
    }

    /* JADX INFO: renamed from: k8f$b */
    public static class C8234b extends Drawable implements Drawable.Callback {

        /* JADX INFO: renamed from: a */
        public Drawable f52789a;

        public C8234b(Drawable drawable) {
            setWrappedDrawable(drawable);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            this.f52789a.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getChangingConfigurations() {
            return this.f52789a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable
        public Drawable getCurrent() {
            return this.f52789a.getCurrent();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f52789a.getIntrinsicHeight();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f52789a.getIntrinsicWidth();
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return this.f52789a.getMinimumHeight();
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return this.f52789a.getMinimumWidth();
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return this.f52789a.getOpacity();
        }

        @Override // android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return this.f52789a.getPadding(rect);
        }

        @Override // android.graphics.drawable.Drawable
        public int[] getState() {
            return this.f52789a.getState();
        }

        @Override // android.graphics.drawable.Drawable
        public Region getTransparentRegion() {
            return this.f52789a.getTransparentRegion();
        }

        public Drawable getWrappedDrawable() {
            return this.f52789a;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public boolean isAutoMirrored() {
            return yp4.isAutoMirrored(this.f52789a);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean isStateful() {
            return this.f52789a.isStateful();
        }

        @Override // android.graphics.drawable.Drawable
        public void jumpToCurrentState() {
            yp4.jumpToCurrentState(this.f52789a);
        }

        @Override // android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            this.f52789a.setBounds(rect);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean onLevelChange(int i) {
            return this.f52789a.setLevel(i);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.f52789a.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAutoMirrored(boolean z) {
            yp4.setAutoMirrored(this.f52789a, z);
        }

        @Override // android.graphics.drawable.Drawable
        public void setChangingConfigurations(int i) {
            this.f52789a.setChangingConfigurations(i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.f52789a.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.Drawable
        public void setDither(boolean z) {
            this.f52789a.setDither(z);
        }

        @Override // android.graphics.drawable.Drawable
        public void setFilterBitmap(boolean z) {
            this.f52789a.setFilterBitmap(z);
        }

        @Override // android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            yp4.setHotspot(this.f52789a, f, f2);
        }

        @Override // android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            yp4.setHotspotBounds(this.f52789a, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            return this.f52789a.setState(iArr);
        }

        @Override // android.graphics.drawable.Drawable
        public void setTint(int i) {
            yp4.setTint(this.f52789a, i);
        }

        @Override // android.graphics.drawable.Drawable
        public void setTintList(ColorStateList colorStateList) {
            yp4.setTintList(this.f52789a, colorStateList);
        }

        @Override // android.graphics.drawable.Drawable
        public void setTintMode(PorterDuff.Mode mode) {
            yp4.setTintMode(this.f52789a, mode);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            return super.setVisible(z, z2) || this.f52789a.setVisible(z, z2);
        }

        public void setWrappedDrawable(Drawable drawable) {
            Drawable drawable2 = this.f52789a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f52789a = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: k8f$c */
    public static class C8235c extends C8234b {

        /* JADX INFO: renamed from: a2 */
        public static final double f52790a2 = Math.cos(Math.toRadians(45.0d));

        /* JADX INFO: renamed from: C */
        public RectF f52791C;

        /* JADX INFO: renamed from: F */
        public float f52792F;

        /* JADX INFO: renamed from: H */
        public Path f52793H;

        /* JADX INFO: renamed from: L */
        public float f52794L;

        /* JADX INFO: renamed from: M */
        public float f52795M;

        /* JADX INFO: renamed from: M1 */
        public boolean f52796M1;

        /* JADX INFO: renamed from: N */
        public float f52797N;

        /* JADX INFO: renamed from: Q */
        public float f52798Q;

        /* JADX INFO: renamed from: V1 */
        public float f52799V1;

        /* JADX INFO: renamed from: X */
        public boolean f52800X;

        /* JADX INFO: renamed from: Y */
        public final int f52801Y;

        /* JADX INFO: renamed from: Z */
        public final int f52802Z;

        /* JADX INFO: renamed from: Z1 */
        public boolean f52803Z1;

        /* JADX INFO: renamed from: b */
        public float f52804b;

        /* JADX INFO: renamed from: c */
        public float f52805c;

        /* JADX INFO: renamed from: d */
        public float f52806d;

        /* JADX INFO: renamed from: e */
        public float f52807e;

        /* JADX INFO: renamed from: f */
        public Paint f52808f;

        /* JADX INFO: renamed from: m */
        public Paint f52809m;

        public C8235c(Drawable drawable, float f, float f2, float f3, int i, boolean z) {
            super(drawable);
            this.f52804b = 1.0f;
            this.f52805c = 1.0f;
            this.f52806d = 1.0f;
            this.f52807e = 1.0f;
            this.f52800X = true;
            this.f52796M1 = false;
            this.f52801Y = i;
            this.f52802Z = i & 16777215;
            this.f52803Z1 = z;
            if (z) {
                this.f52804b = 1.0f;
                this.f52805c = 1.0f;
                this.f52806d = 1.0f;
                this.f52807e = 1.0f;
            }
            Paint paint = new Paint(5);
            this.f52808f = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f52792F = Math.round(f);
            this.f52791C = new RectF();
            Paint paint2 = new Paint(this.f52808f);
            this.f52809m = paint2;
            paint2.setAntiAlias(false);
            m14574b(f2, f3);
        }

        private void buildComponents(Rect rect) {
            if (this.f52803Z1) {
                this.f52792F = rect.width() / 2;
            }
            float f = this.f52795M;
            float f2 = this.f52804b * f;
            this.f52791C.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
            Drawable wrappedDrawable = getWrappedDrawable();
            RectF rectF = this.f52791C;
            wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            buildShadowCorners();
        }

        private void buildShadowCorners() {
            if (!this.f52803Z1) {
                float f = this.f52792F;
                RectF rectF = new RectF(-f, -f, f, f);
                RectF rectF2 = new RectF(rectF);
                float f2 = this.f52797N;
                rectF2.inset(-f2, -f2);
                Path path = this.f52793H;
                if (path == null) {
                    this.f52793H = new Path();
                } else {
                    path.reset();
                }
                this.f52793H.setFillType(Path.FillType.EVEN_ODD);
                this.f52793H.moveTo(-this.f52792F, 0.0f);
                this.f52793H.rLineTo(-this.f52797N, 0.0f);
                this.f52793H.arcTo(rectF2, 180.0f, 90.0f, false);
                this.f52793H.arcTo(rectF, 270.0f, -90.0f, false);
                this.f52793H.close();
                float f3 = -rectF2.top;
                if (f3 > 0.0f) {
                    this.f52808f.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.f52801Y, this.f52802Z}, new float[]{0.0f, this.f52792F / f3, 1.0f}, Shader.TileMode.CLAMP));
                }
                this.f52809m.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, this.f52801Y, this.f52802Z, Shader.TileMode.CLAMP));
                this.f52809m.setAntiAlias(false);
                return;
            }
            float fWidth = (this.f52791C.width() / 2.0f) - 1.0f;
            float f4 = -fWidth;
            RectF rectF3 = new RectF(f4, f4, fWidth, fWidth);
            RectF rectF4 = new RectF(rectF3);
            float f5 = this.f52797N;
            rectF4.inset(-f5, -f5);
            Path path2 = this.f52793H;
            if (path2 == null) {
                this.f52793H = new Path();
            } else {
                path2.reset();
            }
            this.f52793H.setFillType(Path.FillType.EVEN_ODD);
            this.f52793H.moveTo(f4, 0.0f);
            this.f52793H.rLineTo(-this.f52797N, 0.0f);
            this.f52793H.arcTo(rectF4, 180.0f, 180.0f, false);
            this.f52793H.arcTo(rectF4, 0.0f, 180.0f, false);
            this.f52793H.arcTo(rectF3, 180.0f, 180.0f, false);
            this.f52793H.arcTo(rectF3, 0.0f, 180.0f, false);
            this.f52793H.close();
            float f6 = -rectF4.top;
            if (f6 > 0.0f) {
                this.f52808f.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{0, this.f52801Y, this.f52802Z}, new float[]{0.0f, fWidth / f6, 1.0f}, Shader.TileMode.CLAMP));
            }
        }

        private static float calculateHorizontalPadding(float f, float f2, boolean z) {
            return z ? (float) (((double) f) + ((1.0d - f52790a2) * ((double) f2))) : f;
        }

        private float calculateVerticalPadding(float f, float f2, boolean z) {
            return z ? (float) (((double) (f * this.f52804b)) + ((1.0d - f52790a2) * ((double) f2))) : f * this.f52804b;
        }

        private void drawShadow(Canvas canvas) {
            int i;
            float f;
            int i2;
            float f2;
            float f3;
            float f4;
            if (this.f52803Z1) {
                int iSave = canvas.save();
                canvas.translate(this.f52791C.centerX(), this.f52791C.centerY());
                canvas.drawPath(this.f52793H, this.f52808f);
                canvas.restoreToCount(iSave);
                return;
            }
            int iSave2 = canvas.save();
            canvas.rotate(this.f52799V1, this.f52791C.centerX(), this.f52791C.centerY());
            float f5 = this.f52792F;
            float f6 = (-f5) - this.f52797N;
            float f7 = f5 * 2.0f;
            boolean z = this.f52791C.width() - f7 > 0.0f;
            boolean z2 = this.f52791C.height() - f7 > 0.0f;
            float f8 = this.f52798Q;
            float f9 = f8 - (this.f52805c * f8);
            float f10 = f8 - (this.f52806d * f8);
            float f11 = f8 - (this.f52807e * f8);
            float f12 = f5 == 0.0f ? 1.0f : f5 / (f10 + f5);
            float f13 = f5 == 0.0f ? 1.0f : f5 / (f9 + f5);
            float f14 = f5 == 0.0f ? 1.0f : f5 / (f11 + f5);
            int iSave3 = canvas.save();
            RectF rectF = this.f52791C;
            canvas.translate(rectF.left + f5, rectF.top + f5);
            canvas.scale(f12, f13);
            canvas.drawPath(this.f52793H, this.f52808f);
            if (z) {
                canvas.scale(1.0f / f12, 1.0f);
                i = iSave3;
                f = f14;
                i2 = iSave2;
                f2 = f13;
                canvas.drawRect(0.0f, f6, this.f52791C.width() - f7, -this.f52792F, this.f52809m);
            } else {
                i = iSave3;
                f = f14;
                i2 = iSave2;
                f2 = f13;
            }
            canvas.restoreToCount(i);
            int iSave4 = canvas.save();
            RectF rectF2 = this.f52791C;
            canvas.translate(rectF2.right - f5, rectF2.bottom - f5);
            float f15 = f;
            canvas.scale(f12, f15);
            canvas.rotate(180.0f);
            canvas.drawPath(this.f52793H, this.f52808f);
            if (z) {
                canvas.scale(1.0f / f12, 1.0f);
                f3 = f2;
                f4 = f15;
                canvas.drawRect(0.0f, f6, this.f52791C.width() - f7, -this.f52792F, this.f52809m);
            } else {
                f3 = f2;
                f4 = f15;
            }
            canvas.restoreToCount(iSave4);
            int iSave5 = canvas.save();
            RectF rectF3 = this.f52791C;
            canvas.translate(rectF3.left + f5, rectF3.bottom - f5);
            canvas.scale(f12, f4);
            canvas.rotate(270.0f);
            canvas.drawPath(this.f52793H, this.f52808f);
            if (z2) {
                canvas.scale(1.0f / f4, 1.0f);
                canvas.drawRect(0.0f, f6, this.f52791C.height() - f7, -this.f52792F, this.f52809m);
            }
            canvas.restoreToCount(iSave5);
            int iSave6 = canvas.save();
            RectF rectF4 = this.f52791C;
            canvas.translate(rectF4.right - f5, rectF4.top + f5);
            float f16 = f3;
            canvas.scale(f12, f16);
            canvas.rotate(90.0f);
            canvas.drawPath(this.f52793H, this.f52808f);
            if (z2) {
                canvas.scale(1.0f / f16, 1.0f);
                canvas.drawRect(0.0f, f6, this.f52791C.height() - f7, -this.f52792F, this.f52809m);
            }
            canvas.restoreToCount(iSave6);
            canvas.restoreToCount(i2);
        }

        private static int toEven(float f) {
            int iRound = Math.round(f);
            return iRound % 2 == 1 ? iRound - 1 : iRound;
        }

        /* JADX INFO: renamed from: a */
        public final void m14573a(float f) {
            if (this.f52799V1 != f) {
                this.f52799V1 = f;
                invalidateSelf();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m14574b(float f, float f2) {
            if (f < 0.0f || f2 < 0.0f) {
                throw new IllegalArgumentException("invalid shadow size");
            }
            float even = toEven(f);
            float even2 = toEven(f2);
            if (even > even2) {
                even = even2;
            }
            if (this.f52798Q == even && this.f52795M == even2) {
                return;
            }
            this.f52798Q = even;
            this.f52795M = even2;
            this.f52797N = Math.round(even * this.f52804b);
            this.f52794L = even2;
            this.f52800X = true;
            invalidateSelf();
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f52800X) {
                buildComponents(getBounds());
                this.f52800X = false;
            }
            drawShadow(canvas);
            super.draw(canvas);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getChangingConfigurations() {
            return super.getChangingConfigurations();
        }

        public float getCornerRadius() {
            return this.f52792F;
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ Drawable getCurrent() {
            return super.getCurrent();
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
            return super.getIntrinsicHeight();
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
            return super.getIntrinsicWidth();
        }

        public float getMaxShadowSize() {
            return this.f52795M;
        }

        public float getMinHeight() {
            float f = this.f52795M;
            return (Math.max(f, this.f52792F + ((this.f52804b * f) / 2.0f)) * 2.0f) + (this.f52795M * this.f52804b * 2.0f);
        }

        public float getMinWidth() {
            float f = this.f52795M;
            return (Math.max(f, this.f52792F + (f / 2.0f)) * 2.0f) + (this.f52795M * 2.0f);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getMinimumHeight() {
            return super.getMinimumHeight();
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getMinimumWidth() {
            return super.getMinimumWidth();
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            int iCeil = (int) Math.ceil(calculateVerticalPadding(this.f52795M, this.f52792F, this.f52796M1));
            int iCeil2 = (int) Math.ceil(calculateHorizontalPadding(this.f52795M, this.f52792F, this.f52796M1));
            rect.set(iCeil2, iCeil, iCeil2, iCeil);
            return true;
        }

        public float getShadowSize() {
            return this.f52798Q;
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int[] getState() {
            return super.getState();
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ Region getTransparentRegion() {
            return super.getTransparentRegion();
        }

        @Override // p000.k8f.C8234b
        public /* bridge */ /* synthetic */ Drawable getWrappedDrawable() {
            return super.getWrappedDrawable();
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
            super.invalidateDrawable(drawable);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
            return super.isAutoMirrored();
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean isStateful() {
            return super.isStateful();
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void jumpToCurrentState() {
            super.jumpToCurrentState();
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            this.f52800X = true;
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            super.scheduleDrawable(drawable, runnable, j);
        }

        public void setAddPaddingForCorners(boolean z) {
            this.f52796M1 = z;
            invalidateSelf();
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            super.setAlpha(i);
            this.f52808f.setAlpha(i);
            this.f52809m.setAlpha(i);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
            super.setAutoMirrored(z);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
            super.setChangingConfigurations(i);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
            super.setColorFilter(colorFilter);
        }

        public void setCornerRadius(float f) {
            float fRound = Math.round(f);
            if (this.f52792F == fRound) {
                return;
            }
            this.f52792F = fRound;
            this.f52800X = true;
            invalidateSelf();
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setDither(boolean z) {
            super.setDither(z);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
            super.setFilterBitmap(z);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
            super.setHotspot(f, f2);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
            super.setHotspotBounds(i, i2, i3, i4);
        }

        public void setMaxShadowSize(float f) {
            m14574b(this.f52798Q, f);
        }

        public void setShadowSize(float f) {
            m14574b(f, this.f52795M);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
            return super.setState(iArr);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTint(int i) {
            super.setTint(i);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
            super.setTintList(colorStateList);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
            super.setTintMode(mode);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
            return super.setVisible(z, z2);
        }

        @Override // p000.k8f.C8234b
        public /* bridge */ /* synthetic */ void setWrappedDrawable(Drawable drawable) {
            super.setWrappedDrawable(drawable);
        }

        @Override // p000.k8f.C8234b, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            super.unscheduleDrawable(drawable, runnable);
        }
    }

    public static void apply(View... viewArr) {
        if (viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            apply(view, new C8233a());
        }
    }

    public static void apply(View view, C8233a c8233a) {
        if (view == null || c8233a == null) {
            return;
        }
        Drawable background = view.getBackground();
        Object tag = view.getTag(-16);
        if (tag instanceof Drawable) {
            o8i.setBackground(view, (Drawable) tag);
            return;
        }
        Drawable drawableM14572a = c8233a.m14572a(background);
        o8i.setBackground(view, drawableM14572a);
        view.setTag(-16, drawableM14572a);
    }
}
