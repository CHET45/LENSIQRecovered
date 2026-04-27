package p000;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
@jb8
public final class t3g {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final t3g f83665a = new t3g();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final v3g f83666b = new i3g();

    /* JADX INFO: renamed from: c */
    public static final int f83667c = 8;

    private t3g() {
    }

    @yfb
    public final StaticLayout create(@yfb CharSequence charSequence, @yfb TextPaint textPaint, int i, int i2, int i3, @yfb TextDirectionHeuristic textDirectionHeuristic, @yfb Layout.Alignment alignment, @h78(from = 0) int i4, @gib TextUtils.TruncateAt truncateAt, @h78(from = 0) int i5, @y46(from = 0.0d) float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, @gib int[] iArr, @gib int[] iArr2) {
        return f83666b.create(new x3g(charSequence, i2, i3, textPaint, i, textDirectionHeuristic, alignment, i4, truncateAt, i5, f, f2, i6, z, z2, i7, i8, i9, i10, iArr, iArr2));
    }

    public final boolean isFallbackLineSpacingEnabled(@yfb StaticLayout staticLayout, boolean z) {
        return f83666b.isFallbackLineSpacingEnabled(staticLayout, z);
    }
}
