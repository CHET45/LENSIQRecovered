package p000;

import android.content.res.TypedArray;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
@c5e(26)
public final class tmh {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final tmh f85337a = new tmh();

    private tmh() {
    }

    @do8
    @yfb
    @ih4
    public static final Typeface getFont(@yfb TypedArray typedArray, @ebg int i) {
        Typeface font = typedArray.getFont(i);
        md8.checkNotNull(font);
        return font;
    }
}
