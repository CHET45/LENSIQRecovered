package p000;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes7.dex */
public class iu8 implements LineHeightSpan {

    /* JADX INFO: renamed from: a */
    public final int f48502a;

    public iu8(@fkd int i) {
        this.f48502a = i;
    }

    @efb
    public static iu8 create(@fkd int i) {
        return new iu8(i);
    }

    private static boolean selfEnd(int i, CharSequence charSequence, Object obj) {
        int spanEnd = ((Spanned) charSequence).getSpanEnd(obj);
        return spanEnd == i || spanEnd == i - 1;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (selfEnd(i2, charSequence, this)) {
            int i5 = fontMetricsInt.descent;
            int i6 = this.f48502a;
            fontMetricsInt.descent = i5 + i6;
            fontMetricsInt.bottom += i6;
        }
    }
}
