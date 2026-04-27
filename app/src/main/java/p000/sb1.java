package p000;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
@c5e(33)
public final class sb1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final sb1 f81107a = new sb1();

    private sb1() {
    }

    @do8
    @yfb
    @ih4
    public static final BoringLayout create(@yfb CharSequence charSequence, @yfb TextPaint textPaint, int i, @yfb Layout.Alignment alignment, float f, float f2, @yfb BoringLayout.Metrics metrics, boolean z, boolean z2, @gib TextUtils.TruncateAt truncateAt, int i2) {
        return rb1.m21107a(charSequence, textPaint, i, alignment, f, f2, metrics, z, truncateAt, i2, z2);
    }

    @do8
    @gib
    @ih4
    public static final BoringLayout.Metrics isBoring(@yfb CharSequence charSequence, @yfb TextPaint textPaint, @yfb TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    @do8
    @ih4
    public static final boolean isFallbackLineSpacingEnabled(@yfb BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
