package p000;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
public class fy4 {

    /* JADX INFO: renamed from: f */
    public static final float f38021f = 4.5f;

    /* JADX INFO: renamed from: g */
    public static final float f38022g = 2.0f;

    /* JADX INFO: renamed from: h */
    public static final int f38023h = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    public final boolean f38024a;

    /* JADX INFO: renamed from: b */
    public final int f38025b;

    /* JADX INFO: renamed from: c */
    public final int f38026c;

    /* JADX INFO: renamed from: d */
    public final int f38027d;

    /* JADX INFO: renamed from: e */
    public final float f38028e;

    public fy4(@efb Context context) {
        this(hw9.resolveBoolean(context, C3146R.attr.elevationOverlayEnabled, false), ow9.getColor(context, C3146R.attr.elevationOverlayColor, 0), ow9.getColor(context, C3146R.attr.elevationOverlayAccentColor, 0), ow9.getColor(context, C3146R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean isThemeSurfaceColor(@g92 int i) {
        return ua2.setAlphaComponent(i, 255) == this.f38027d;
    }

    public int calculateOverlayAlpha(float f) {
        return Math.round(calculateOverlayAlphaFraction(f) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f) {
        if (this.f38028e <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    @g92
    public int compositeOverlay(@g92 int i, float f, @efb View view) {
        return compositeOverlay(i, f + getParentAbsoluteElevation(view));
    }

    @g92
    public int compositeOverlayIfNeeded(@g92 int i, float f, @efb View view) {
        return compositeOverlayIfNeeded(i, f + getParentAbsoluteElevation(view));
    }

    @g92
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f, @efb View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f + getParentAbsoluteElevation(view));
    }

    public float getParentAbsoluteElevation(@efb View view) {
        return cci.getParentAbsoluteElevation(view);
    }

    @g92
    public int getThemeElevationOverlayColor() {
        return this.f38025b;
    }

    @g92
    public int getThemeSurfaceColor() {
        return this.f38027d;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.f38024a;
    }

    @g92
    public int compositeOverlay(@g92 int i, float f) {
        int i2;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f);
        int iAlpha = Color.alpha(i);
        int iLayer = ow9.layer(ua2.setAlphaComponent(i, 255), this.f38025b, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > 0.0f && (i2 = this.f38026c) != 0) {
            iLayer = ow9.layer(iLayer, ua2.setAlphaComponent(i2, f38023h));
        }
        return ua2.setAlphaComponent(iLayer, iAlpha);
    }

    @g92
    public int compositeOverlayIfNeeded(@g92 int i, float f) {
        return (this.f38024a && isThemeSurfaceColor(i)) ? compositeOverlay(i, f) : i;
    }

    @g92
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f) {
        return compositeOverlayIfNeeded(this.f38027d, f);
    }

    public fy4(boolean z, @g92 int i, @g92 int i2, @g92 int i3, float f) {
        this.f38024a = z;
        this.f38025b = i;
        this.f38026c = i2;
        this.f38027d = i3;
        this.f38028e = f;
    }
}
