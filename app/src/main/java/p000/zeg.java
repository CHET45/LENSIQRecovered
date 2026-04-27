package p000;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import p000.n93;

/* JADX INFO: loaded from: classes3.dex */
public final class zeg {
    private zeg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$removeAllEmbeddedStyling$0(Object obj) {
        return !(obj instanceof eu8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$removeEmbeddedFontSizes$1(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void removeAllEmbeddedStyling(n93.C9750c c9750c) {
        c9750c.clearWindowColor();
        if (c9750c.getText() instanceof Spanned) {
            if (!(c9750c.getText() instanceof Spannable)) {
                c9750c.setText(SpannableString.valueOf(c9750c.getText()));
            }
            removeSpansIf((Spannable) v80.checkNotNull(c9750c.getText()), new l8d() { // from class: veg
                @Override // p000.l8d
                public final boolean apply(Object obj) {
                    return zeg.lambda$removeAllEmbeddedStyling$0(obj);
                }
            });
        }
        removeEmbeddedFontSizes(c9750c);
    }

    public static void removeEmbeddedFontSizes(n93.C9750c c9750c) {
        c9750c.setTextSize(-3.4028235E38f, Integer.MIN_VALUE);
        if (c9750c.getText() instanceof Spanned) {
            if (!(c9750c.getText() instanceof Spannable)) {
                c9750c.setText(SpannableString.valueOf(c9750c.getText()));
            }
            removeSpansIf((Spannable) v80.checkNotNull(c9750c.getText()), new l8d() { // from class: xeg
                @Override // p000.l8d
                public final boolean apply(Object obj) {
                    return zeg.lambda$removeEmbeddedFontSizes$1(obj);
                }
            });
        }
    }

    private static void removeSpansIf(Spannable spannable, l8d<Object> l8dVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (l8dVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float resolveTextSize(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }
}
