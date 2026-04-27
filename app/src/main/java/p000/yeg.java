package p000;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import p000.o93;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class yeg {
    private yeg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$removeAllEmbeddedStyling$0(Object obj) {
        return !(obj instanceof du8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$removeEmbeddedFontSizes$1(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void removeAllEmbeddedStyling(o93.C10261c c10261c) {
        c10261c.clearWindowColor();
        if (c10261c.getText() instanceof Spanned) {
            if (!(c10261c.getText() instanceof Spannable)) {
                c10261c.setText(SpannableString.valueOf(c10261c.getText()));
            }
            removeSpansIf((Spannable) u80.checkNotNull(c10261c.getText()), new l8d() { // from class: ueg
                @Override // p000.l8d
                public final boolean apply(Object obj) {
                    return yeg.lambda$removeAllEmbeddedStyling$0(obj);
                }
            });
        }
        removeEmbeddedFontSizes(c10261c);
    }

    public static void removeEmbeddedFontSizes(o93.C10261c c10261c) {
        c10261c.setTextSize(-3.4028235E38f, Integer.MIN_VALUE);
        if (c10261c.getText() instanceof Spanned) {
            if (!(c10261c.getText() instanceof Spannable)) {
                c10261c.setText(SpannableString.valueOf(c10261c.getText()));
            }
            removeSpansIf((Spannable) u80.checkNotNull(c10261c.getText()), new l8d() { // from class: weg
                @Override // p000.l8d
                public final boolean apply(Object obj) {
                    return yeg.lambda$removeEmbeddedFontSizes$1(obj);
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
