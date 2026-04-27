package p000;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ub1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final ub1 f87364a = new ub1();

    private ub1() {
    }

    @do8
    @yfb
    @ih4
    public static final BoringLayout create(@yfb CharSequence charSequence, @yfb TextPaint textPaint, int i, @yfb Layout.Alignment alignment, float f, float f2, @yfb BoringLayout.Metrics metrics, boolean z, @gib TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, f, f2, metrics, z, truncateAt, i2);
    }

    @do8
    @gib
    @ih4
    public static final BoringLayout.Metrics isBoring(@yfb CharSequence charSequence, @yfb TextPaint textPaint, @yfb TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
