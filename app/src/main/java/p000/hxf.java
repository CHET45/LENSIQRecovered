package p000;

import android.text.Spanned;
import android.text.SpannedString;

/* JADX INFO: loaded from: classes.dex */
public final class hxf {
    public static final /* synthetic */ <T> T[] getSpans(Spanned spanned, int i, int i2) {
        md8.reifiedOperationMarker(4, "T");
        return (T[]) spanned.getSpans(i, i2, Object.class);
    }

    public static /* synthetic */ Object[] getSpans$default(Spanned spanned, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = spanned.length();
        }
        md8.reifiedOperationMarker(4, "T");
        return spanned.getSpans(i, i2, Object.class);
    }

    @yfb
    public static final Spanned toSpanned(@yfb CharSequence charSequence) {
        return SpannedString.valueOf(charSequence);
    }
}
