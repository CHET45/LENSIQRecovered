package p000;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes3.dex */
@igg({"PrivateConstructorForUtilityClass"})
public final class ex4 {

    /* JADX INFO: renamed from: a */
    public static final int f34343a = 16777216;

    /* JADX INFO: renamed from: b */
    public static final int f34344b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public static final String[] f34345c = new String[0];

    /* JADX INFO: renamed from: d */
    public static final String f34346d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* JADX INFO: renamed from: e */
    public static final String f34347e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* JADX INFO: renamed from: f */
    public static final String f34348f = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";

    /* JADX INFO: renamed from: g */
    public static final String f34349g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";

    /* JADX INFO: renamed from: h */
    public static final String f34350h = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";

    /* JADX INFO: renamed from: i */
    public static final String f34351i = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED";

    /* JADX INFO: renamed from: j */
    @fdi
    public static final int f34352j = 2048;

    /* JADX INFO: renamed from: k */
    @fdi
    public static final int f34353k = 1024;

    /* JADX INFO: renamed from: ex4$a */
    @c5e(30)
    public static class C5505a {
        private C5505a() {
        }

        /* JADX INFO: renamed from: a */
        public static CharSequence m10334a(@efb EditorInfo editorInfo, int i) {
            return editorInfo.getInitialSelectedText(i);
        }

        /* JADX INFO: renamed from: b */
        public static CharSequence m10335b(@efb EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextAfterCursor(i, i2);
        }

        /* JADX INFO: renamed from: c */
        public static CharSequence m10336c(@efb EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextBeforeCursor(i, i2);
        }

        /* JADX INFO: renamed from: d */
        public static void m10337d(@efb EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    @Deprecated
    public ex4() {
    }

    /* JADX INFO: renamed from: a */
    public static int m10333a(EditorInfo editorInfo) {
        return 1;
    }

    @efb
    public static String[] getContentMimeTypes(@efb EditorInfo editorInfo) {
        String[] strArr = editorInfo.contentMimeTypes;
        return strArr != null ? strArr : f34345c;
    }

    @hib
    public static CharSequence getInitialSelectedText(@efb EditorInfo editorInfo, int i) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C5505a.m10334a(editorInfo, i);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int iMin = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int iMax = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i2 = editorInfo.extras.getInt(f34349g);
        int i3 = editorInfo.extras.getInt(f34350h);
        int i4 = iMax - iMin;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i3 - i2 != i4 || (charSequence = editorInfo.extras.getCharSequence(f34348f)) == null) {
            return null;
        }
        return (i & 1) != 0 ? charSequence.subSequence(i2, i3) : TextUtils.substring(charSequence, i2, i3);
    }

    @hib
    public static CharSequence getInitialTextAfterCursor(@efb EditorInfo editorInfo, int i, int i2) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C5505a.m10335b(editorInfo, i, i2);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f34348f)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(f34350h);
        int iMin = Math.min(i, charSequence.length() - i3);
        return (i2 & 1) != 0 ? charSequence.subSequence(i3, iMin + i3) : TextUtils.substring(charSequence, i3, iMin + i3);
    }

    @hib
    public static CharSequence getInitialTextBeforeCursor(@efb EditorInfo editorInfo, int i, int i2) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C5505a.m10336c(editorInfo, i, i2);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f34348f)) == null) {
            return null;
        }
        int i3 = editorInfo.extras.getInt(f34349g);
        int iMin = Math.min(i, i3);
        return (i2 & 1) != 0 ? charSequence.subSequence(i3 - iMin, i3) : TextUtils.substring(charSequence, i3 - iMin, i3);
    }

    private static boolean isCutOnSurrogate(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    private static boolean isPasswordInputType(int i) {
        int i2 = i & UnixStat.PERM_MASK;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    public static boolean isStylusHandwritingEnabled(@efb EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(f34351i);
    }

    public static void setContentMimeTypes(@efb EditorInfo editorInfo, @hib String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static void setInitialSurroundingSubText(@efb EditorInfo editorInfo, @efb CharSequence charSequence, int i) {
        z7d.checkNotNull(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C5505a.m10337d(editorInfo, charSequence, i);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 - i : i2 - i;
        int i5 = i2 > i3 ? i2 - i : i3 - i;
        int length = charSequence.length();
        if (i < 0 || i4 < 0 || i5 > length) {
            setSurroundingText(editorInfo, null, 0, 0);
            return;
        }
        if (isPasswordInputType(editorInfo.inputType)) {
            setSurroundingText(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            setSurroundingText(editorInfo, charSequence, i4, i5);
        } else {
            trimLongSurroundingText(editorInfo, charSequence, i4, i5);
        }
    }

    public static void setInitialSurroundingText(@efb EditorInfo editorInfo, @efb CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C5505a.m10337d(editorInfo, charSequence, 0);
        } else {
            setInitialSurroundingSubText(editorInfo, charSequence, 0);
        }
    }

    public static void setStylusHandwritingEnabled(@efb EditorInfo editorInfo, boolean z) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean(f34351i, z);
    }

    private static void setSurroundingText(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(f34348f, charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(f34349g, i);
        editorInfo.extras.putInt(f34350h, i2);
    }

    private static void trimLongSurroundingText(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int iMin = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (((double) i5) * 0.8d)));
        int iMin2 = Math.min(i, i5 - iMin);
        int i6 = i - iMin2;
        if (isCutOnSurrogate(charSequence, i6, 0)) {
            i6++;
            iMin2--;
        }
        if (isCutOnSurrogate(charSequence, (i2 + iMin) - 1, 1)) {
            iMin--;
        }
        setSurroundingText(editorInfo, i4 != i3 ? TextUtils.concat(charSequence.subSequence(i6, i6 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i6, iMin2 + i4 + iMin + i6), iMin2, i4 + iMin2);
    }
}
