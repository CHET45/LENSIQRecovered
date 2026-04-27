package p000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public class mqf extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b */
    public static final int f61772b = 0;

    /* JADX INFO: renamed from: a */
    public final float f61773a;

    public mqf(float f) {
        this.f61773a = f;
    }

    public final float getSkewX() {
        return this.f61773a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@yfb TextPaint textPaint) {
        textPaint.setTextSkewX(this.f61773a + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@yfb TextPaint textPaint) {
        textPaint.setTextSkewX(this.f61773a + textPaint.getTextSkewX());
    }
}
