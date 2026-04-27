package p000;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBoringLayoutFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoringLayoutFactory.android.kt\nandroidx/compose/ui/text/android/BoringLayoutFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
@e0g(parameters = 1)
public final class tb1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final tb1 f84137a = new tb1();

    /* JADX INFO: renamed from: b */
    public static final int f84138b = 0;

    private tb1() {
    }

    @yfb
    public final BoringLayout create(@yfb CharSequence charSequence, @yfb TextPaint textPaint, int i, @yfb BoringLayout.Metrics metrics, @yfb Layout.Alignment alignment, boolean z, boolean z2, @gib TextUtils.TruncateAt truncateAt, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("negative width");
        }
        if (i2 >= 0) {
            return Build.VERSION.SDK_INT >= 33 ? sb1.create(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, z2, truncateAt, i2) : ub1.create(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
        }
        throw new IllegalArgumentException("negative ellipsized width");
    }

    public final boolean isFallbackLineSpacingEnabled(@yfb BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return sb1.isFallbackLineSpacingEnabled(boringLayout);
        }
        return false;
    }

    @gib
    public final BoringLayout.Metrics measure(@yfb CharSequence charSequence, @yfb TextPaint textPaint, @yfb TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? sb1.isBoring(charSequence, textPaint, textDirectionHeuristic) : ub1.isBoring(charSequence, textPaint, textDirectionHeuristic);
    }
}
