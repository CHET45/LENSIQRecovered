package p000;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
@c5e(29)
@e0g(parameters = 0)
public final class p97 extends n97 {

    /* JADX INFO: renamed from: f */
    public static final int f70080f = 8;

    /* JADX INFO: renamed from: d */
    @yfb
    public final CharSequence f70081d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final TextPaint f70082e;

    public p97(@yfb CharSequence charSequence, @yfb TextPaint textPaint) {
        this.f70081d = charSequence;
        this.f70082e = textPaint;
    }

    @Override // p000.n97
    public int next(int i) {
        TextPaint textPaint = this.f70082e;
        CharSequence charSequence = this.f70081d;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // p000.n97
    public int previous(int i) {
        TextPaint textPaint = this.f70082e;
        CharSequence charSequence = this.f70081d;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
