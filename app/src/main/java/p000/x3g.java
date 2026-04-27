package p000;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nStaticLayoutFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticLayoutFactory.android.kt\nandroidx/compose/ui/text/android/StaticLayoutParams\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
public final class x3g {

    /* JADX INFO: renamed from: a */
    @yfb
    public final CharSequence f96170a;

    /* JADX INFO: renamed from: b */
    public final int f96171b;

    /* JADX INFO: renamed from: c */
    public final int f96172c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final TextPaint f96173d;

    /* JADX INFO: renamed from: e */
    public final int f96174e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final TextDirectionHeuristic f96175f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final Layout.Alignment f96176g;

    /* JADX INFO: renamed from: h */
    public final int f96177h;

    /* JADX INFO: renamed from: i */
    @gib
    public final TextUtils.TruncateAt f96178i;

    /* JADX INFO: renamed from: j */
    public final int f96179j;

    /* JADX INFO: renamed from: k */
    public final float f96180k;

    /* JADX INFO: renamed from: l */
    public final float f96181l;

    /* JADX INFO: renamed from: m */
    public final int f96182m;

    /* JADX INFO: renamed from: n */
    public final boolean f96183n;

    /* JADX INFO: renamed from: o */
    public final boolean f96184o;

    /* JADX INFO: renamed from: p */
    public final int f96185p;

    /* JADX INFO: renamed from: q */
    public final int f96186q;

    /* JADX INFO: renamed from: r */
    public final int f96187r;

    /* JADX INFO: renamed from: s */
    public final int f96188s;

    /* JADX INFO: renamed from: t */
    @gib
    public final int[] f96189t;

    /* JADX INFO: renamed from: u */
    @gib
    public final int[] f96190u;

    public x3g(@yfb CharSequence charSequence, int i, int i2, @yfb TextPaint textPaint, int i3, @yfb TextDirectionHeuristic textDirectionHeuristic, @yfb Layout.Alignment alignment, int i4, @gib TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, @gib int[] iArr, @gib int[] iArr2) {
        this.f96170a = charSequence;
        this.f96171b = i;
        this.f96172c = i2;
        this.f96173d = textPaint;
        this.f96174e = i3;
        this.f96175f = textDirectionHeuristic;
        this.f96176g = alignment;
        this.f96177h = i4;
        this.f96178i = truncateAt;
        this.f96179j = i5;
        this.f96180k = f;
        this.f96181l = f2;
        this.f96182m = i6;
        this.f96183n = z;
        this.f96184o = z2;
        this.f96185p = i7;
        this.f96186q = i8;
        this.f96187r = i9;
        this.f96188s = i10;
        this.f96189t = iArr;
        this.f96190u = iArr2;
        if (i < 0 || i > i2) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            throw new IllegalArgumentException("invalid end value");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("invalid width value");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
        if (f < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value");
        }
    }

    @yfb
    public final Layout.Alignment getAlignment() {
        return this.f96176g;
    }

    public final int getBreakStrategy() {
        return this.f96185p;
    }

    @gib
    public final TextUtils.TruncateAt getEllipsize() {
        return this.f96178i;
    }

    public final int getEllipsizedWidth() {
        return this.f96179j;
    }

    public final int getEnd() {
        return this.f96172c;
    }

    public final int getHyphenationFrequency() {
        return this.f96188s;
    }

    public final boolean getIncludePadding() {
        return this.f96183n;
    }

    public final int getJustificationMode() {
        return this.f96182m;
    }

    @gib
    public final int[] getLeftIndents() {
        return this.f96189t;
    }

    public final int getLineBreakStyle() {
        return this.f96186q;
    }

    public final int getLineBreakWordStyle() {
        return this.f96187r;
    }

    public final float getLineSpacingExtra() {
        return this.f96181l;
    }

    public final float getLineSpacingMultiplier() {
        return this.f96180k;
    }

    public final int getMaxLines() {
        return this.f96177h;
    }

    @yfb
    public final TextPaint getPaint() {
        return this.f96173d;
    }

    @gib
    public final int[] getRightIndents() {
        return this.f96190u;
    }

    public final int getStart() {
        return this.f96171b;
    }

    @yfb
    public final CharSequence getText() {
        return this.f96170a;
    }

    @yfb
    public final TextDirectionHeuristic getTextDir() {
        return this.f96175f;
    }

    public final boolean getUseFallbackLineSpacing() {
        return this.f96184o;
    }

    public final int getWidth() {
        return this.f96174e;
    }

    public /* synthetic */ x3g(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2, int i11, jt3 jt3Var) {
        this(charSequence, (i11 & 2) != 0 ? 0 : i, i2, textPaint, i3, textDirectionHeuristic, alignment, i4, truncateAt, i5, f, f2, i6, z, z2, i7, i8, i9, i10, iArr, iArr2);
    }
}
