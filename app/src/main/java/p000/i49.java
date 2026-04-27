package p000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class i49 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b */
    public static final int f45717b = 0;

    /* JADX INFO: renamed from: a */
    public final float f45718a;

    public i49(float f) {
        this.f45718a = f;
    }

    public final float getLetterSpacing() {
        return this.f45718a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@yfb TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f45718a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@yfb TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f45718a);
    }
}
