package p000;

import android.os.Build;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class zue {
    @yfb
    public static final yue createGraphemeClusterSegmentFinder(@yfb CharSequence charSequence, @yfb TextPaint textPaint) {
        return Build.VERSION.SDK_INT >= 29 ? new p97(charSequence, textPaint) : new q97(charSequence);
    }
}
