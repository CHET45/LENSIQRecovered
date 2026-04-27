package p000;

import android.text.Spanned;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i39 {
    private i39() {
    }

    public static boolean selfEnd(int i, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(obj) == i;
    }

    public static boolean selfStart(int i, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(obj) == i;
    }
}
