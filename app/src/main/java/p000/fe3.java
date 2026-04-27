package p000;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes7.dex */
public class fe3 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a */
    public final Typeface f36268a;

    /* JADX INFO: renamed from: b */
    public final boolean f36269b;

    @Deprecated
    public fe3(@efb Typeface typeface) {
        this(typeface, false);
    }

    @efb
    public static fe3 create(@efb Typeface typeface) {
        return create(typeface, false);
    }

    private void updatePaint(@efb TextPaint textPaint) {
        Typeface typeface = textPaint.getTypeface();
        if (!this.f36269b || typeface == null || typeface.getStyle() == 0) {
            textPaint.setTypeface(this.f36268a);
        } else {
            textPaint.setTypeface(Typeface.create(this.f36268a, typeface.getStyle() | this.f36268a.getStyle()));
        }
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@efb TextPaint textPaint) {
        updatePaint(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@efb TextPaint textPaint) {
        updatePaint(textPaint);
    }

    public fe3(@efb Typeface typeface, boolean z) {
        this.f36268a = typeface;
        this.f36269b = z;
    }

    @efb
    public static fe3 create(@efb Typeface typeface, boolean z) {
        return new fe3(typeface, z);
    }
}
