package p000;

import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSpannableString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n31#2,4:67\n13579#3,2:71\n*S KotlinDebug\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n32#1:67,4\n32#1:71,2\n*E\n"})
public final class bxf {
    public static final void clearSpans(@yfb Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(@yfb Spannable spannable, int i, int i2, @yfb Object obj) {
        spannable.setSpan(obj, i, i2, 17);
    }

    @yfb
    public static final Spannable toSpannable(@yfb CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }

    public static final void set(@yfb Spannable spannable, @yfb f78 f78Var, @yfb Object obj) {
        spannable.setSpan(obj, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue(), 17);
    }
}
