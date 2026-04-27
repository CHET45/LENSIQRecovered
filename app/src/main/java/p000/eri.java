package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@c5e(21)
public class eri extends dri {

    /* JADX INFO: renamed from: C */
    public static final String f33921C = "WrappedDrawableApi21";

    /* JADX INFO: renamed from: F */
    public static Method f33922F;

    public eri(Drawable drawable) {
        super(drawable);
        findAndCacheIsProjectedDrawableMethod();
    }

    private void findAndCacheIsProjectedDrawableMethod() {
        if (f33922F == null) {
            try {
                f33922F = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e) {
                Log.w(f33921C, "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // p000.dri
    /* JADX INFO: renamed from: a */
    public boolean mo9338a() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    @efb
    public Rect getDirtyBounds() {
        return this.f30521f.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@efb Outline outline) {
        this.f30521f.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f30521f;
        if (drawable == null || (method = f33922F) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception e) {
            Log.w(f33921C, "Error calling Drawable#isProjected() method", e);
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f30521f.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f30521f.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p000.dri, android.graphics.drawable.Drawable
    public boolean setState(@efb int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // p000.dri, android.graphics.drawable.Drawable, p000.p2h
    public void setTint(int i) {
        if (mo9338a()) {
            super.setTint(i);
        } else {
            this.f30521f.setTint(i);
        }
    }

    @Override // p000.dri, android.graphics.drawable.Drawable, p000.p2h
    public void setTintList(ColorStateList colorStateList) {
        if (mo9338a()) {
            super.setTintList(colorStateList);
        } else {
            this.f30521f.setTintList(colorStateList);
        }
    }

    @Override // p000.dri, android.graphics.drawable.Drawable, p000.p2h
    public void setTintMode(@efb PorterDuff.Mode mode) {
        if (mo9338a()) {
            super.setTintMode(mode);
        } else {
            this.f30521f.setTintMode(mode);
        }
    }

    public eri(fri friVar, Resources resources) {
        super(friVar, resources);
        findAndCacheIsProjectedDrawableMethod();
    }
}
