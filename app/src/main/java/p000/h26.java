package p000;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public class h26 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Matrix f42093a;

    /* JADX INFO: renamed from: b */
    public final RectF f42094b;

    /* JADX INFO: renamed from: c */
    public final RectF f42095c;

    /* JADX INFO: renamed from: d */
    public Drawable f42096d;

    /* JADX INFO: renamed from: e */
    public C6685a f42097e;

    /* JADX INFO: renamed from: f */
    public boolean f42098f;

    /* JADX INFO: renamed from: h26$a */
    public static final class C6685a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f42099a;

        /* JADX INFO: renamed from: b */
        public final int f42100b;

        /* JADX INFO: renamed from: c */
        public final int f42101c;

        public C6685a(C6685a c6685a) {
            this(c6685a.f42099a, c6685a.f42100b, c6685a.f42101c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @efb
        public Drawable newDrawable() {
            return new h26(this, this.f42099a.newDrawable());
        }

        public C6685a(Drawable.ConstantState constantState, int i, int i2) {
            this.f42099a = constantState;
            this.f42100b = i;
            this.f42101c = i2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @efb
        public Drawable newDrawable(Resources resources) {
            return new h26(this, this.f42099a.newDrawable(resources));
        }
    }

    public h26(Drawable drawable, int i, int i2) {
        this(new C6685a(drawable.getConstantState(), i, i2), drawable);
    }

    private void updateMatrix() {
        this.f42093a.setRectToRect(this.f42094b, this.f42095c, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f42096d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        canvas.save();
        canvas.concat(this.f42093a);
        this.f42096d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @c5e(19)
    public int getAlpha() {
        return this.f42096d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.f42096d.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f42096d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f42097e;
    }

    @Override // android.graphics.drawable.Drawable
    @efb
    public Drawable getCurrent() {
        return this.f42096d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f42097e.f42101c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f42097e.f42100b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f42096d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f42096d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f42096d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@efb Rect rect) {
        return this.f42096d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f42096d.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @efb
    public Drawable mutate() {
        if (!this.f42098f && super.mutate() == this) {
            this.f42096d = this.f42096d.mutate();
            this.f42097e = new C6685a(this.f42097e);
            this.f42098f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@efb Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.f42096d.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f42096d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f42095c.set(i, i2, i3, i4);
        updateMatrix();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f42096d.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, @efb PorterDuff.Mode mode) {
        this.f42096d.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z) {
        this.f42096d.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f42096d.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return this.f42096d.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@efb Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f42096d.unscheduleSelf(runnable);
    }

    public h26(C6685a c6685a, Drawable drawable) {
        this.f42097e = (C6685a) t7d.checkNotNull(c6685a);
        this.f42096d = (Drawable) t7d.checkNotNull(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f42093a = new Matrix();
        this.f42094b = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f42095c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f42096d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@efb Rect rect) {
        super.setBounds(rect);
        this.f42095c.set(rect);
        updateMatrix();
    }
}
