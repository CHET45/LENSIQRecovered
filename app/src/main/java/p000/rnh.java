package p000;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class rnh extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b */
    public static final int f78832b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Typeface f78833a;

    public rnh(@yfb Typeface typeface) {
        this.f78833a = typeface;
    }

    private final void updateTypeface(Paint paint) {
        paint.setTypeface(this.f78833a);
    }

    @yfb
    public final Typeface getTypeface() {
        return this.f78833a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@yfb TextPaint textPaint) {
        updateTypeface(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@yfb TextPaint textPaint) {
        updateTypeface(textPaint);
    }
}
