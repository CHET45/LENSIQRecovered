package p000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public class iv0 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: b */
    public static final int f48537b = 0;

    /* JADX INFO: renamed from: a */
    public final float f48538a;

    public iv0(float f) {
        this.f48538a = f;
    }

    public final float getMultiplier() {
        return this.f48538a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@yfb TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f48538a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@yfb TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f48538a);
    }
}
