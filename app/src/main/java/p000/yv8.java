package p000;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class yv8 {

    /* JADX INFO: renamed from: h */
    public static final int f103135h = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final CharSequence f103136a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final TextPaint f103137b;

    /* JADX INFO: renamed from: c */
    public final int f103138c;

    /* JADX INFO: renamed from: d */
    public float f103139d = Float.NaN;

    /* JADX INFO: renamed from: e */
    public float f103140e = Float.NaN;

    /* JADX INFO: renamed from: f */
    @gib
    public BoringLayout.Metrics f103141f;

    /* JADX INFO: renamed from: g */
    public boolean f103142g;

    public yv8(@yfb CharSequence charSequence, @yfb TextPaint textPaint, int i) {
        this.f103136a = charSequence;
        this.f103137b = textPaint;
        this.f103138c = i;
    }

    @gib
    public final BoringLayout.Metrics getBoringMetrics() {
        if (!this.f103142g) {
            this.f103141f = tb1.f84137a.measure(this.f103136a, this.f103137b, nug.getTextDirectionHeuristic(this.f103138c));
            this.f103142g = true;
        }
        return this.f103141f;
    }

    public final float getMaxIntrinsicWidth() {
        if (!Float.isNaN(this.f103139d)) {
            return this.f103139d;
        }
        BoringLayout.Metrics boringMetrics = getBoringMetrics();
        float fCeil = boringMetrics != null ? boringMetrics.width : -1;
        if (fCeil < 0.0f) {
            CharSequence charSequence = this.f103136a;
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f103137b));
        }
        if (aw8.shouldIncreaseMaxIntrinsic(fCeil, this.f103136a, this.f103137b)) {
            fCeil += 0.5f;
        }
        this.f103139d = fCeil;
        return fCeil;
    }

    public final float getMinIntrinsicWidth() {
        if (!Float.isNaN(this.f103140e)) {
            return this.f103140e;
        }
        float fMinIntrinsicWidth = aw8.minIntrinsicWidth(this.f103136a, this.f103137b);
        this.f103140e = fMinIntrinsicWidth;
        return fMinIntrinsicWidth;
    }
}
