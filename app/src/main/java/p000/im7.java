package p000;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
public final class im7 {
    @yfb
    public static final Spanned parseAsHtml(@yfb String str, int i, @gib Html.ImageGetter imageGetter, @gib Html.TagHandler tagHandler) {
        return em7.fromHtml(str, i, imageGetter, tagHandler);
    }

    public static /* synthetic */ Spanned parseAsHtml$default(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            imageGetter = null;
        }
        if ((i2 & 4) != 0) {
            tagHandler = null;
        }
        return em7.fromHtml(str, i, imageGetter, tagHandler);
    }

    @yfb
    public static final String toHtml(@yfb Spanned spanned, int i) {
        return em7.toHtml(spanned, i);
    }

    public static /* synthetic */ String toHtml$default(Spanned spanned, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return em7.toHtml(spanned, i);
    }
}
