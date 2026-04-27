package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class dri extends Drawable implements Drawable.Callback, cri, p2h {

    /* JADX INFO: renamed from: m */
    public static final PorterDuff.Mode f30515m = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f30516a;

    /* JADX INFO: renamed from: b */
    public PorterDuff.Mode f30517b;

    /* JADX INFO: renamed from: c */
    public boolean f30518c;

    /* JADX INFO: renamed from: d */
    public fri f30519d;

    /* JADX INFO: renamed from: e */
    public boolean f30520e;

    /* JADX INFO: renamed from: f */
    public Drawable f30521f;

    public dri(@efb fri friVar, @hib Resources resources) {
        this.f30519d = friVar;
        updateLocalState(resources);
    }

    @efb
    private fri mutateConstantState() {
        return new fri(this.f30519d);
    }

    private void updateLocalState(@hib Resources resources) {
        Drawable.ConstantState constantState;
        fri friVar = this.f30519d;
        if (friVar == null || (constantState = friVar.f37586b) == null) {
            return;
        }
        setWrappedDrawable(constantState.newDrawable(resources));
    }

    private boolean updateTint(int[] iArr) {
        if (!mo9338a()) {
            return false;
        }
        fri friVar = this.f30519d;
        ColorStateList colorStateList = friVar.f37587c;
        PorterDuff.Mode mode = friVar.f37588d;
        if (colorStateList == null || mode == null) {
            this.f30518c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f30518c || colorForState != this.f30516a || mode != this.f30517b) {
                setColorFilter(colorForState, mode);
                this.f30516a = colorForState;
                this.f30517b = mode;
                this.f30518c = true;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo9338a() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        this.f30521f.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        fri friVar = this.f30519d;
        return changingConfigurations | (friVar != null ? friVar.getChangingConfigurations() : 0) | this.f30521f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @hib
    public Drawable.ConstantState getConstantState() {
        fri friVar = this.f30519d;
        if (friVar == null || !friVar.m11113a()) {
            return null;
        }
        this.f30519d.f37585a = getChangingConfigurations();
        return this.f30519d;
    }

    @Override // android.graphics.drawable.Drawable
    @efb
    public Drawable getCurrent() {
        return this.f30521f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f30521f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f30521f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @c5e(23)
    public int getLayoutDirection() {
        return yp4.getLayoutDirection(this.f30521f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f30521f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f30521f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f30521f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@efb Rect rect) {
        return this.f30521f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @efb
    public int[] getState() {
        return this.f30521f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f30521f.getTransparentRegion();
    }

    @Override // p000.cri
    public final Drawable getWrappedDrawable() {
        return this.f30521f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@efb Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return yp4.isAutoMirrored(this.f30521f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        fri friVar;
        ColorStateList colorStateList = (!mo9338a() || (friVar = this.f30519d) == null) ? null : friVar.f37587c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f30521f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f30521f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @efb
    public Drawable mutate() {
        if (!this.f30520e && super.mutate() == this) {
            this.f30519d = mutateConstantState();
            Drawable drawable = this.f30521f;
            if (drawable != null) {
                drawable.mutate();
            }
            fri friVar = this.f30519d;
            if (friVar != null) {
                Drawable drawable2 = this.f30521f;
                friVar.f37586b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f30520e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f30521f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @c5e(23)
    public boolean onLayoutDirectionChanged(int i) {
        return yp4.setLayoutDirection(this.f30521f, i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.f30521f.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@efb Drawable drawable, @efb Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f30521f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        yp4.setAutoMirrored(this.f30521f, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f30521f.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f30521f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f30521f.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f30521f.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@efb int[] iArr) {
        return updateTint(iArr) || this.f30521f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTintList(ColorStateList colorStateList) {
        this.f30519d.f37587c = colorStateList;
        updateTint(getState());
    }

    @Override // android.graphics.drawable.Drawable, p000.p2h
    public void setTintMode(@efb PorterDuff.Mode mode) {
        this.f30519d.f37588d = mode;
        updateTint(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f30521f.setVisible(z, z2);
    }

    @Override // p000.cri
    public final void setWrappedDrawable(Drawable drawable) {
        Drawable drawable2 = this.f30521f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f30521f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            fri friVar = this.f30519d;
            if (friVar != null) {
                friVar.f37586b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@efb Drawable drawable, @efb Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public dri(@hib Drawable drawable) {
        this.f30519d = mutateConstantState();
        setWrappedDrawable(drawable);
    }
}
