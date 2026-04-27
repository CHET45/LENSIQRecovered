package p000;

import android.text.Layout;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xw8 {

    /* JADX INFO: renamed from: a */
    public static final float f99561a = 0.0f;

    /* JADX INFO: renamed from: b */
    public static final float f99562b = 1.0f;

    private xw8() {
    }

    public static int getLineBottomWithoutPaddingAndSpacing(@efb Layout layout, int i) {
        int lineBottom = layout.getLineBottom(i);
        boolean z = i == layout.getLineCount() - 1;
        float spacingAdd = layout.getSpacingAdd();
        float spacingMultiplier = layout.getSpacingMultiplier();
        if ((spacingAdd != 0.0f || spacingMultiplier != 1.0f) && !z) {
            if (Float.compare(1.0f, spacingMultiplier) != 0) {
                float lineHeight = getLineHeight(layout, i);
                spacingAdd = lineHeight - ((lineHeight - spacingAdd) / spacingMultiplier);
            }
            lineBottom = (int) ((lineBottom - spacingAdd) + 0.5f);
        }
        return (z && i == layout.getLineCount() - 1) ? lineBottom - layout.getBottomPadding() : lineBottom;
    }

    public static int getLineHeight(@efb Layout layout, int i) {
        return layout.getLineTop(i + 1) - layout.getLineTop(i);
    }

    public static int getLineTopWithoutPadding(@efb Layout layout, int i) {
        int lineTop = layout.getLineTop(i);
        return i == 0 ? lineTop - layout.getTopPadding() : lineTop;
    }
}
