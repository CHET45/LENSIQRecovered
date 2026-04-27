package p000;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class g69 implements LineHeightSpan {

    /* JADX INFO: renamed from: b */
    public static final int f38890b = 0;

    /* JADX INFO: renamed from: a */
    public final float f38891a;

    public g69(float f) {
        this.f38891a = f;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@yfb CharSequence charSequence, int i, int i2, int i3, int i4, @yfb Paint.FontMetricsInt fontMetricsInt) {
        int iLineHeight = j69.lineHeight(fontMetricsInt);
        if (iLineHeight <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f38891a);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / iLineHeight)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }

    public final float getLineHeight() {
        return this.f38891a;
    }
}
