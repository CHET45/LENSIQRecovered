package p000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class jo6 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b */
    public static final int f51336b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f51337a;

    public jo6(@yfb String str) {
        this.f51337a = str;
    }

    @yfb
    public final String getFontFeatureSettings() {
        return this.f51337a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@yfb TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f51337a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@yfb TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f51337a);
    }
}
