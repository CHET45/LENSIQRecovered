package p000;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: renamed from: lq */
/* JADX INFO: loaded from: classes.dex */
public final class C8936lq {
    @yfb
    /* JADX INFO: renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final ColorFilter m30884actualColorMatrixColorFilterjHGOpc(@yfb float[] fArr) {
        return new ColorMatrixColorFilter(fArr);
    }

    @yfb
    public static final float[] actualColorMatrixFromFilter(@yfb ColorFilter colorFilter) {
        if ((colorFilter instanceof ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            return n92.f63669a.m31143getColorMatrix8unuwjk((ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    @yfb
    /* JADX INFO: renamed from: actualLightingColorFilter--OWjLjI, reason: not valid java name */
    public static final ColorFilter m30885actualLightingColorFilterOWjLjI(long j, long j2) {
        return new LightingColorFilter(j92.m30490toArgb8_81llA(j), j92.m30490toArgb8_81llA(j2));
    }

    @yfb
    /* JADX INFO: renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final ColorFilter m30886actualTintColorFilterxETnrds(long j, int i) {
        return Build.VERSION.SDK_INT >= 29 ? x51.f96730a.m33215BlendModeColorFilterxETnrds(j, i) : new PorterDuffColorFilter(j92.m30490toArgb8_81llA(j), C1995bq.m28033toPorterDuffModes9anfk8(i));
    }

    @yfb
    public static final ColorFilter asAndroidColorFilter(@yfb b92 b92Var) {
        return b92Var.getNativeColorFilter$ui_graphics_release();
    }

    @yfb
    public static final b92 asComposeColorFilter(@yfb ColorFilter colorFilter) {
        b92 m92Var;
        if (29 <= Build.VERSION.SDK_INT && C8010jq.m14231a(colorFilter)) {
            return x51.f96730a.createBlendModeColorFilter(C8495kq.m14897a(colorFilter));
        }
        if ((colorFilter instanceof LightingColorFilter) && supportsLightingColorFilterQuery()) {
            LightingColorFilter lightingColorFilter = (LightingColorFilter) colorFilter;
            m92Var = new q59(j92.Color(lightingColorFilter.getColorMultiply()), j92.Color(lightingColorFilter.getColorAdd()), colorFilter, null);
        } else {
            m92Var = ((colorFilter instanceof ColorMatrixColorFilter) && supportsColorMatrixQuery()) ? new m92(null, colorFilter, null) : new b92(colorFilter);
        }
        return m92Var;
    }

    public static final boolean supportsColorMatrixQuery() {
        return true;
    }

    public static final boolean supportsLightingColorFilterQuery() {
        return true;
    }
}
