package p000;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class kug {

    /* JADX INFO: renamed from: a */
    public final WeakReference<Layout> f55390a;

    public kug(@efb Layout layout) {
        this.f55390a = new WeakReference<>(layout);
    }

    public static void applyTo(@efb Spannable spannable, @efb Layout layout) {
        kug[] kugVarArr = (kug[]) spannable.getSpans(0, spannable.length(), kug.class);
        if (kugVarArr != null) {
            for (kug kugVar : kugVarArr) {
                spannable.removeSpan(kugVar);
            }
        }
        spannable.setSpan(new kug(layout), 0, spannable.length(), 18);
    }

    @hib
    public static Layout layoutOf(@efb CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return layoutOf((Spanned) charSequence);
        }
        return null;
    }

    @hib
    public Layout layout() {
        return this.f55390a.get();
    }

    @hib
    public static Layout layoutOf(@efb Spanned spanned) {
        kug[] kugVarArr = (kug[]) spanned.getSpans(0, spanned.length(), kug.class);
        if (kugVarArr == null || kugVarArr.length <= 0) {
            return null;
        }
        return kugVarArr[0].layout();
    }
}
