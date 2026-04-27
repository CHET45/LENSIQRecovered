package p000;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class i69 implements LineHeightSpan {

    /* JADX INFO: renamed from: N */
    public static final int f45834N = 8;

    /* JADX INFO: renamed from: L */
    public int f45838L;

    /* JADX INFO: renamed from: M */
    public int f45839M;

    /* JADX INFO: renamed from: a */
    public final float f45840a;

    /* JADX INFO: renamed from: b */
    public final int f45841b;

    /* JADX INFO: renamed from: c */
    public final int f45842c;

    /* JADX INFO: renamed from: d */
    public final boolean f45843d;

    /* JADX INFO: renamed from: e */
    public final boolean f45844e;

    /* JADX INFO: renamed from: f */
    public final float f45845f;

    /* JADX INFO: renamed from: m */
    public int f45846m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: C */
    public int f45835C = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: F */
    public int f45836F = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: H */
    public int f45837H = Integer.MIN_VALUE;

    public i69(float f, int i, int i2, boolean z, boolean z2, @y46(from = -1.0d, m25645to = 1.0d) float f2) {
        this.f45840a = f;
        this.f45841b = i;
        this.f45842c = i2;
        this.f45843d = z;
        this.f45844e = z2;
        this.f45845f = f2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        int iCeil = (int) Math.ceil(this.f45840a);
        int iLineHeight = iCeil - j69.lineHeight(fontMetricsInt);
        float fAbs = this.f45845f;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / j69.lineHeight(fontMetricsInt);
        }
        int iCeil2 = (int) (iLineHeight <= 0 ? Math.ceil(iLineHeight * fAbs) : Math.ceil(iLineHeight * (1.0f - fAbs)));
        int i = fontMetricsInt.descent;
        int i2 = iCeil2 + i;
        this.f45836F = i2;
        int i3 = i2 - iCeil;
        this.f45835C = i3;
        if (this.f45843d) {
            i3 = fontMetricsInt.ascent;
        }
        this.f45846m = i3;
        if (this.f45844e) {
            i2 = i;
        }
        this.f45837H = i2;
        this.f45838L = fontMetricsInt.ascent - i3;
        this.f45839M = i2 - i;
    }

    public static /* synthetic */ i69 copy$ui_text_release$default(i69 i69Var, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = i69Var.f45843d;
        }
        return i69Var.copy$ui_text_release(i, i2, z);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@yfb CharSequence charSequence, int i, int i2, int i3, int i4, @yfb Paint.FontMetricsInt fontMetricsInt) {
        if (j69.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z = i == this.f45841b;
        boolean z2 = i2 == this.f45842c;
        if (z && z2 && this.f45843d && this.f45844e) {
            return;
        }
        if (this.f45846m == Integer.MIN_VALUE) {
            calculateTargetMetrics(fontMetricsInt);
        }
        fontMetricsInt.ascent = z ? this.f45846m : this.f45835C;
        fontMetricsInt.descent = z2 ? this.f45837H : this.f45836F;
    }

    @yfb
    public final i69 copy$ui_text_release(int i, int i2, boolean z) {
        return new i69(this.f45840a, i, i2, z, this.f45844e, this.f45845f);
    }

    public final int getFirstAscentDiff() {
        return this.f45838L;
    }

    public final int getLastDescentDiff() {
        return this.f45839M;
    }

    public final float getLineHeight() {
        return this.f45840a;
    }

    public final boolean getTrimLastLineBottom() {
        return this.f45844e;
    }
}
