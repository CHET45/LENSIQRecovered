package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import p000.ip6;

/* JADX INFO: loaded from: classes.dex */
public final class gyc {
    @yfb
    public static final cyc PlatformTypefaces() {
        return Build.VERSION.SDK_INT >= 28 ? new eyc() : new fyc();
    }

    @yfb
    @fdi
    public static final String getWeightSuffixForFallbackFamilyName(@yfb String str, @yfb jp6 jp6Var) {
        int weight = jp6Var.getWeight() / 100;
        if (weight >= 0 && weight < 2) {
            return str + "-thin";
        }
        if (2 <= weight && weight < 4) {
            return str + "-light";
        }
        if (weight == 4) {
            return str;
        }
        if (weight == 5) {
            return str + "-medium";
        }
        if ((6 <= weight && weight < 8) || 8 > weight || weight >= 11) {
            return str;
        }
        return str + "-black";
    }

    @gib
    @th5
    public static final Typeface setFontVariationSettings(@gib Typeface typeface, @yfb ip6.C7556e c7556e, @yfb Context context) {
        return enh.f33627a.setFontVariationSettings(typeface, c7556e, context);
    }
}
