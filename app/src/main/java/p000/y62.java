package p000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes7.dex */
public class y62 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final xu9 f100459a;

    public y62(@efb xu9 xu9Var) {
        this.f100459a = xu9Var;
    }

    private void apply(TextPaint textPaint) {
        this.f100459a.applyCodeTextStyle(textPaint);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        apply(textPaint);
        textPaint.bgColor = this.f100459a.getCodeBackgroundColor(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        apply(textPaint);
    }
}
