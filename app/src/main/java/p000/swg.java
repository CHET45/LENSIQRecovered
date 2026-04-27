package p000;

import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class swg {

    /* JADX INFO: renamed from: a */
    public final WeakReference<TextView> f83186a;

    public swg(@efb TextView textView) {
        this.f83186a = new WeakReference<>(textView);
    }

    public static void applyTo(@efb Spannable spannable, @efb TextView textView) {
        swg[] swgVarArr = (swg[]) spannable.getSpans(0, spannable.length(), swg.class);
        if (swgVarArr != null) {
            for (swg swgVar : swgVarArr) {
                spannable.removeSpan(swgVar);
            }
        }
        spannable.setSpan(new swg(textView), 0, spannable.length(), 18);
    }

    @hib
    public static TextView textViewOf(@efb CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return textViewOf((Spanned) charSequence);
        }
        return null;
    }

    @hib
    public TextView textView() {
        return this.f83186a.get();
    }

    @hib
    public static TextView textViewOf(@efb Spanned spanned) {
        swg[] swgVarArr = (swg[]) spanned.getSpans(0, spanned.length(), swg.class);
        if (swgVarArr == null || swgVarArr.length <= 0) {
            return null;
        }
        return swgVarArr[0].textView();
    }
}
