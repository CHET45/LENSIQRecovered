package p000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class j49 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b */
    public static final int f49510b = 0;

    /* JADX INFO: renamed from: a */
    public final float f49511a;

    public j49(@fkd float f) {
        this.f49511a = f;
    }

    private final void updatePaint(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.f49511a / textSize);
    }

    public final float getLetterSpacing() {
        return this.f49511a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@yfb TextPaint textPaint) {
        updatePaint(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@yfb TextPaint textPaint) {
        updatePaint(textPaint);
    }
}
